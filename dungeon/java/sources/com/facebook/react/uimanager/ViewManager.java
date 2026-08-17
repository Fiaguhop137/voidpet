package com.facebook.react.uimanager;

import android.content.Context;
import android.view.View;
import androidx.annotation.NonNull;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactNoCrashSoftException;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.V;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Stack;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ViewManager<T extends View, C extends V> extends BaseJavaModule {
    private static final String TAG = "ViewManager";
    private B0 mDelegate;
    private HashMap<Integer, Stack<T>> mRecyclableViews;

    public ViewManager() {
        super(null);
        this.mDelegate = null;
        this.mRecyclableViews = null;
    }

    public ViewManager(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mDelegate = null;
        this.mRecyclableViews = null;
    }

    private B0 getOrCreateViewManagerDelegate() {
        B0 b10 = this.mDelegate;
        if (b10 != null) {
            return b10;
        }
        B0 delegate = getMDelegate();
        this.mDelegate = delegate;
        return delegate;
    }

    private Stack<T> getRecyclableViewStack(int i10, boolean z10) {
        HashMap<Integer, Stack<T>> map = this.mRecyclableViews;
        if (map == null) {
            return null;
        }
        if (z10 && !map.containsKey(Integer.valueOf(i10))) {
            this.mRecyclableViews.put(Integer.valueOf(i10), new Stack<>());
        }
        return this.mRecyclableViews.get(Integer.valueOf(i10));
    }

    protected void addEventEmitters(@NonNull C2262k0 c2262k0, @NonNull T t10) {
    }

    public C createShadowNodeInstance() {
        throw new RuntimeException("ViewManager subclasses must implement createShadowNodeInstance()");
    }

    @NonNull
    public C createShadowNodeInstance(@NonNull ReactApplicationContext reactApplicationContext) {
        return (C) createShadowNodeInstance();
    }

    @NonNull
    public T createView(int i10, @NonNull C2262k0 c2262k0, X x10, InterfaceC2260j0 interfaceC2260j0, X6.a aVar) {
        T t10 = (T) createViewInstance(i10, c2262k0, x10, interfaceC2260j0);
        if (t10 instanceof X6.d) {
            ((X6.d) t10).setOnInterceptTouchEventListener(aVar);
        }
        return t10;
    }

    @NonNull
    protected T createViewInstance(int i10, @NonNull C2262k0 c2262k0, X x10, InterfaceC2260j0 interfaceC2260j0) {
        Object objUpdateState;
        Stack<T> recyclableViewStack = getRecyclableViewStack(c2262k0.c(), true);
        T t10 = (recyclableViewStack == null || recyclableViewStack.empty()) ? (T) createViewInstance(c2262k0) : (T) recycleView(c2262k0, recyclableViewStack.pop());
        t10.setId(i10);
        addEventEmitters(c2262k0, t10);
        if (x10 != null) {
            updateProperties(t10, x10);
        }
        if (interfaceC2260j0 != null && (objUpdateState = updateState(t10, x10, interfaceC2260j0)) != null) {
            updateExtraData(t10, objUpdateState);
        }
        return t10;
    }

    @NonNull
    protected abstract T createViewInstance(@NonNull C2262k0 c2262k0);

    protected boolean experimental_isPrefetchingEnabled() {
        return false;
    }

    public void experimental_prefetchResource(ReactContext reactContext, int i10, int i11, com.facebook.react.common.mapbuffer.a aVar) {
    }

    public Map<String, Integer> getCommandsMap() {
        return null;
    }

    /* JADX INFO: renamed from: getDelegate */
    protected B0 getMDelegate() {
        if (this instanceof L0) {
            ReactSoftExceptionLogger.logSoftException("ViewManager", new ReactNoCrashSoftException("ViewManager using codegen must override getDelegate method (name: " + getName() + ")."));
        }
        return new C0.c(this);
    }

    public Map<String, Object> getExportedCustomBubblingEventTypeConstants() {
        return null;
    }

    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return null;
    }

    public Map<String, Object> getExportedViewConstants() {
        return null;
    }

    @Override // com.facebook.react.bridge.NativeModule
    @NonNull
    public abstract String getName();

    public Map<String, String> getNativeProps() {
        return (p384v6.a.f56281f && D6.e.a()) ? C0.f(getClass(), null) : C0.f(getClass(), getShadowNodeClass());
    }

    public abstract Class<? extends C> getShadowNodeClass();

    public long measure(Context context, ReadableMap readableMap, ReadableMap readableMap2, ReadableMap readableMap3, float f10, com.facebook.yoga.p pVar, float f11, com.facebook.yoga.p pVar2, float[] fArr) {
        return 0L;
    }

    protected void onAfterUpdateTransaction(@NonNull T t10) {
    }

    public void onDropViewInstance(@NonNull T t10) {
        View viewPrepareToRecycleView;
        Context context = t10.getContext();
        if (context == null) {
            W4.a.m("ViewManager", "onDropViewInstance: view [" + t10.getId() + "] has a null context");
            return;
        }
        if (!(context instanceof C2262k0)) {
            W4.a.m("ViewManager", "onDropViewInstance: view [" + t10.getId() + "] has a context that is not a ThemedReactContext: " + context);
            return;
        }
        C2262k0 c2262k0 = (C2262k0) context;
        Stack<T> recyclableViewStack = getRecyclableViewStack(c2262k0.c(), false);
        if (recyclableViewStack == null || (viewPrepareToRecycleView = prepareToRecycleView(c2262k0, t10)) == null) {
            return;
        }
        p240n6.a.b(viewPrepareToRecycleView.getParent() == null, "Recycled view [" + t10.getId() + "] should not be attached to a parent. View: " + t10 + " Parent: " + viewPrepareToRecycleView.getParent() + " ThemedReactContext: " + c2262k0);
        recyclableViewStack.push(viewPrepareToRecycleView);
    }

    public void onSurfaceStopped(int i10) {
        HashMap<Integer, Stack<T>> map = this.mRecyclableViews;
        if (map != null) {
            map.remove(Integer.valueOf(i10));
        }
    }

    protected abstract T prepareToRecycleView(@NonNull C2262k0 c2262k0, @NonNull T t10);

    @Deprecated
    public void receiveCommand(@NonNull T t10, int i10, ReadableArray readableArray) {
    }

    public void receiveCommand(@NonNull T t10, String str, ReadableArray readableArray) {
        getOrCreateViewManagerDelegate().b(t10, str, readableArray);
    }

    protected T recycleView(@NonNull C2262k0 c2262k0, @NonNull T t10) {
        return t10;
    }

    public void setPadding(T t10, int i10, int i11, int i12, int i13) {
    }

    protected void setupViewRecycling() {
        if (D6.b.n()) {
            this.mRecyclableViews = new HashMap<>();
        }
    }

    void trimMemory() {
        if (this.mRecyclableViews != null) {
            this.mRecyclableViews = new HashMap<>();
        }
    }

    public abstract void updateExtraData(@NonNull T t10, Object obj);

    public void updateProperties(@NonNull T t10, X x10) {
        B0 orCreateViewManagerDelegate = getOrCreateViewManagerDelegate();
        Iterator<Map.Entry<String, Object>> entryIterator = x10.d().getEntryIterator();
        while (entryIterator.hasNext()) {
            Map.Entry<String, Object> next = entryIterator.next();
            orCreateViewManagerDelegate.a(t10, next.getKey(), next.getValue());
        }
        onAfterUpdateTransaction(t10);
    }

    public Object updateState(@NonNull T t10, X x10, InterfaceC2260j0 interfaceC2260j0) {
        return null;
    }
}
