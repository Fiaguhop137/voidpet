package com.facebook.react.views.scroll;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UIManagerListener;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.uimanager.C2270o0;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class c implements UIManagerListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ViewGroup f30801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f30802b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private a f30803c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private WeakReference f30804d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Rect f30805e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f30806f;

    public static final class a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final C0390a f30807c = new C0390a(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f30808a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Integer f30809b;

        /* JADX INFO: renamed from: com.facebook.react.views.scroll.c$a$a, reason: collision with other inner class name */
        public static final class C0390a {
            private C0390a() {
            }

            public /* synthetic */ C0390a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final a a(ReadableMap value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return new a(value.getInt("minIndexForVisible"), value.hasKey("autoscrollToTopThreshold") ? Integer.valueOf(value.getInt("autoscrollToTopThreshold")) : null);
            }
        }

        public a(int i10, Integer num) {
            this.f30808a = i10;
            this.f30809b = num;
        }

        public final Integer a() {
            return this.f30809b;
        }

        public final int b() {
            return this.f30808a;
        }
    }

    public c(ViewGroup viewGroup, boolean z10) {
        this.f30801a = viewGroup;
        this.f30802b = z10;
    }

    private final void b() {
        ViewGroup viewGroup;
        com.facebook.react.views.view.g gVarC;
        float y10;
        int height;
        a aVar = this.f30803c;
        if (aVar == null || (viewGroup = this.f30801a) == null || (gVarC = c()) == null) {
            return;
        }
        int scrollX = this.f30802b ? viewGroup.getScrollX() : viewGroup.getScrollY();
        int childCount = gVarC.getChildCount();
        for (int iB = aVar.b(); iB < childCount; iB++) {
            View childAt = gVarC.getChildAt(iB);
            if (this.f30802b) {
                y10 = childAt.getX();
                height = childAt.getWidth();
            } else {
                y10 = childAt.getY();
                height = childAt.getHeight();
            }
            if (y10 + height > scrollX || iB == gVarC.getChildCount() - 1) {
                this.f30804d = new WeakReference(childAt);
                Rect rect = new Rect();
                childAt.getHitRect(rect);
                this.f30805e = rect;
                return;
            }
        }
    }

    private final com.facebook.react.views.view.g c() {
        ViewGroup viewGroup = this.f30801a;
        return (com.facebook.react.views.view.g) (viewGroup != null ? viewGroup.getChildAt(0) : null);
    }

    private final UIManager d() {
        ViewGroup viewGroup = this.f30801a;
        ReactContext reactContext = (ReactContext) (viewGroup != null ? viewGroup.getContext() : null);
        if (reactContext == null) {
            throw new IllegalStateException("Required value was null.");
        }
        ViewGroup viewGroup2 = this.f30801a;
        UIManager uIManagerG = C2270o0.g(reactContext, Z6.a.a(viewGroup2 != null ? viewGroup2.getId() : 0));
        if (uIManagerG != null) {
            return uIManagerG;
        }
        throw new IllegalStateException("Required value was null.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void i() {
        WeakReference weakReference;
        Rect rect;
        View view;
        ViewGroup viewGroup;
        a aVar = this.f30803c;
        if (aVar == null || (weakReference = this.f30804d) == null || (rect = this.f30805e) == null || (view = (View) weakReference.get()) == null || (viewGroup = this.f30801a) == 0) {
            return;
        }
        Rect rect2 = new Rect();
        view.getHitRect(rect2);
        if (this.f30802b) {
            int i10 = rect2.left - rect.left;
            if (i10 != 0) {
                int scrollX = viewGroup.getScrollX();
                o.d dVar = (o.d) viewGroup;
                dVar.a(i10 + scrollX, viewGroup.getScrollY());
                this.f30805e = rect2;
                if (aVar.a() == null || scrollX > aVar.a().intValue()) {
                    return;
                }
                dVar.b(0, viewGroup.getScrollY());
                return;
            }
            return;
        }
        int i11 = rect2.top - rect.top;
        if (i11 != 0) {
            int scrollY = viewGroup.getScrollY();
            o.d dVar2 = (o.d) viewGroup;
            dVar2.a(viewGroup.getScrollX(), i11 + scrollY);
            this.f30805e = rect2;
            if (aVar.a() == null || scrollY > aVar.a().intValue()) {
                return;
            }
            dVar2.b(viewGroup.getScrollX(), 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(c cVar) {
        cVar.b();
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void didDispatchMountItems(UIManager uiManager) {
        Intrinsics.checkNotNullParameter(uiManager, "uiManager");
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void didMountItems(UIManager uiManager) {
        Intrinsics.checkNotNullParameter(uiManager, "uiManager");
        i();
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void didScheduleMountItems(UIManager uiManager) {
        Intrinsics.checkNotNullParameter(uiManager, "uiManager");
    }

    public final void e(a aVar) {
        this.f30803c = aVar;
    }

    public final void f() {
        if (this.f30806f) {
            return;
        }
        this.f30806f = true;
        d().addUIManagerEventListener(this);
    }

    public final void g() {
        if (this.f30806f) {
            this.f30806f = false;
            d().removeUIManagerEventListener(this);
        }
    }

    public final void h() {
        ViewGroup viewGroup = this.f30801a;
        if (viewGroup == null || Z6.a.a(viewGroup.getId()) == 2) {
            return;
        }
        i();
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void willDispatchViewUpdates(UIManager uiManager) {
        Intrinsics.checkNotNullParameter(uiManager, "uiManager");
        UiThreadUtil.runOnUiThread(new b(this));
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void willMountItems(UIManager uiManager) {
        Intrinsics.checkNotNullParameter(uiManager, "uiManager");
        b();
    }
}
