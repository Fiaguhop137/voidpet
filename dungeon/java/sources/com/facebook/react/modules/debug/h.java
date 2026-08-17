package com.facebook.react.modules.debug;

import android.view.Choreographer;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.uimanager.UIManagerModule;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class h implements Choreographer.FrameCallback {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final a f29911l = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ReactContext f29912a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Choreographer f29913b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d f29914c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f29915d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f29916e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f29917f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f29918g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f29919h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f29920i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private double f29921j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f29922k;

    private static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public h(ReactContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.f29912a = reactContext;
        this.f29914c = new d();
        this.f29915d = -1L;
        this.f29916e = -1L;
        this.f29921j = 60.0d;
        this.f29922k = true;
    }

    private final int h() {
        return this.f29920i - 1;
    }

    private final int i() {
        return (int) ((this.f29916e - this.f29915d) / 1000000.0d);
    }

    public static /* synthetic */ void m(h hVar, double d10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            d10 = hVar.f29921j;
        }
        hVar.l(d10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(h hVar) {
        Choreographer choreographer = Choreographer.getInstance();
        hVar.f29913b = choreographer;
        if (choreographer != null) {
            choreographer.postFrameCallback(hVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(h hVar) {
        Choreographer choreographer = Choreographer.getInstance();
        hVar.f29913b = choreographer;
        if (choreographer != null) {
            choreographer.removeFrameCallback(hVar);
        }
    }

    public final int c() {
        return this.f29919h;
    }

    public final int d() {
        return (int) (((this.f29921j * ((double) i())) / ((double) 1000)) + ((double) 1));
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j10) {
        if (this.f29915d == -1) {
            this.f29915d = j10;
        }
        long j11 = this.f29916e;
        this.f29916e = j10;
        if (this.f29914c.d(j11, j10)) {
            this.f29920i++;
        }
        this.f29917f++;
        int iD = d();
        if ((iD - this.f29918g) - 1 >= 4) {
            this.f29919h++;
        }
        this.f29918g = iD;
        Choreographer choreographer = this.f29913b;
        if (choreographer != null) {
            choreographer.postFrameCallback(this);
        }
    }

    public final double e() {
        if (this.f29916e == this.f29915d) {
            return 0.0d;
        }
        return (((double) g()) * 1.0E9d) / (this.f29916e - this.f29915d);
    }

    public final double f() {
        if (this.f29916e == this.f29915d) {
            return 0.0d;
        }
        return (((double) h()) * 1.0E9d) / (this.f29916e - this.f29915d);
    }

    public final int g() {
        return this.f29917f - 1;
    }

    public final boolean j() {
        return this.f29922k;
    }

    public final void k() {
        this.f29915d = -1L;
        this.f29916e = -1L;
        this.f29917f = 0;
        this.f29919h = 0;
        this.f29920i = 0;
    }

    public final void l(double d10) {
        if (!p384v6.a.f56281f) {
            UIManagerModule uIManagerModule = (UIManagerModule) this.f29912a.getNativeModule(UIManagerModule.class);
            if (this.f29912a.isBridgeless()) {
                this.f29922k = true;
            } else {
                this.f29912a.getCatalystInstance().addBridgeIdleDebugListener(this.f29914c);
                this.f29922k = false;
            }
            if (uIManagerModule != null) {
                uIManagerModule.setViewHierarchyUpdateDebugListener(this.f29914c);
            }
        }
        this.f29921j = d10;
        UiThreadUtil.runOnUiThread(new f(this));
    }

    public final void o() {
        if (!p384v6.a.f56281f) {
            UIManagerModule uIManagerModule = (UIManagerModule) this.f29912a.getNativeModule(UIManagerModule.class);
            if (!this.f29912a.isBridgeless()) {
                this.f29912a.getCatalystInstance().removeBridgeIdleDebugListener(this.f29914c);
            }
            if (uIManagerModule != null) {
                uIManagerModule.setViewHierarchyUpdateDebugListener(null);
            }
        }
        UiThreadUtil.runOnUiThread(new g(this));
    }
}
