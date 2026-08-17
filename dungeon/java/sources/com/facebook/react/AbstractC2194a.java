package com.facebook.react;

import Ad.InterfaceC0791a;
import com.facebook.react.bridge.ModuleHolder;
import com.facebook.react.bridge.ModuleSpec;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.uimanager.ViewManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import javax.inject.Provider;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.facebook.react.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2194a implements P {

    /* JADX INFO: renamed from: com.facebook.react.a$a, reason: collision with other inner class name */
    private final class C0372a implements Provider {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f29404a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ReactApplicationContext f29405b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ AbstractC2194a f29406c;

        public C0372a(AbstractC2194a abstractC2194a, String name, ReactApplicationContext reactContext) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(reactContext, "reactContext");
            this.f29406c = abstractC2194a;
            this.f29404a = name;
            this.f29405b = reactContext;
        }

        @Override // javax.inject.Provider
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public NativeModule get() {
            return this.f29406c.getModule(this.f29404a, this.f29405b);
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.a$b */
    public static final class b implements Iterable, Nd.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Iterator f29407a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ AbstractC2194a f29408b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ReactApplicationContext f29409c;

        public b(Iterator it, AbstractC2194a abstractC2194a, ReactApplicationContext reactApplicationContext) {
            this.f29407a = it;
            this.f29408b = abstractC2194a;
            this.f29409c = reactApplicationContext;
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return new c(this.f29407a, this.f29408b, this.f29409c);
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.a$c */
    public static final class c implements Iterator, Nd.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Map.Entry f29410a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Iterator f29411b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ AbstractC2194a f29412c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ ReactApplicationContext f29413d;

        c(Iterator it, AbstractC2194a abstractC2194a, ReactApplicationContext reactApplicationContext) {
            this.f29411b = it;
            this.f29412c = abstractC2194a;
            this.f29413d = reactApplicationContext;
        }

        private final void a() {
            while (this.f29411b.hasNext()) {
                Map.Entry entry = (Map.Entry) this.f29411b.next();
                ReactModuleInfo reactModuleInfo = (ReactModuleInfo) entry.getValue();
                if (!D6.e.e() || !reactModuleInfo.d()) {
                    this.f29410a = entry;
                    return;
                }
            }
            this.f29410a = null;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public ModuleHolder next() {
            if (this.f29410a == null) {
                a();
            }
            Map.Entry entry = this.f29410a;
            if (entry == null) {
                throw new NoSuchElementException("ModuleHolder not found");
            }
            a();
            return new ModuleHolder((ReactModuleInfo) entry.getValue(), new C0372a(this.f29412c, (String) entry.getKey(), this.f29413d));
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f29410a == null) {
                a();
            }
            return this.f29410a != null;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // com.facebook.react.P
    @InterfaceC0791a
    @NotNull
    public List<NativeModule> createNativeModules(@NotNull ReactApplicationContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        throw new UnsupportedOperationException("createNativeModules method is not supported. Use getModule() method instead.");
    }

    @Override // com.facebook.react.P
    @NotNull
    public List<ViewManager> createViewManagers(@NotNull ReactApplicationContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        List<ModuleSpec> viewManagers = getViewManagers(reactContext);
        if (viewManagers == null || viewManagers.isEmpty()) {
            return CollectionsKt.l();
        }
        ArrayList arrayList = new ArrayList();
        Iterator<ModuleSpec> it = viewManagers.iterator();
        while (it.hasNext()) {
            Object obj = it.next().provider().get();
            Intrinsics.d(obj, "null cannot be cast to non-null type com.facebook.react.uimanager.ViewManager<*, *>");
            arrayList.add((ViewManager) obj);
        }
        return arrayList;
    }

    @Override // com.facebook.react.P
    public abstract NativeModule getModule(String str, ReactApplicationContext reactApplicationContext);

    @NotNull
    public final Iterable<ModuleHolder> getNativeModuleIterator$ReactAndroid_release(@NotNull ReactApplicationContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        return new b(getReactModuleInfoProvider().a().entrySet().iterator(), this, reactContext);
    }

    public abstract H6.a getReactModuleInfoProvider();

    @NotNull
    protected List<ModuleSpec> getViewManagers(@NotNull ReactApplicationContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        return CollectionsKt.l();
    }
}
