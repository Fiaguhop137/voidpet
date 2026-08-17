package p183k3;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p291q3.g;
import p291q3.h;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final a f47811m = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public h f47812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f47813b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Runnable f47814c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f47815d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f47816e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Executor f47817f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f47818g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f47819h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private g f47820i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f47821j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Runnable f47822k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Runnable f47823l;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public c(long j10, TimeUnit autoCloseTimeUnit, Executor autoCloseExecutor) {
        Intrinsics.checkNotNullParameter(autoCloseTimeUnit, "autoCloseTimeUnit");
        Intrinsics.checkNotNullParameter(autoCloseExecutor, "autoCloseExecutor");
        this.f47813b = new Handler(Looper.getMainLooper());
        this.f47815d = new Object();
        this.f47816e = autoCloseTimeUnit.toMillis(j10);
        this.f47817f = autoCloseExecutor;
        this.f47819h = SystemClock.uptimeMillis();
        this.f47822k = new p183k3.a(this);
        this.f47823l = new b(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(c this$0) {
        Unit unit;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        synchronized (this$0.f47815d) {
            try {
                if (SystemClock.uptimeMillis() - this$0.f47819h < this$0.f47816e) {
                    return;
                }
                if (this$0.f47818g != 0) {
                    return;
                }
                Runnable runnable = this$0.f47814c;
                if (runnable != null) {
                    runnable.run();
                    unit = Unit.f48228a;
                } else {
                    unit = null;
                }
                if (unit == null) {
                    throw new IllegalStateException("onAutoCloseCallback is null but it should have been set before use. Please file a bug against Room at: https://issuetracker.google.com/issues/new?component=413107&template=1096568");
                }
                g gVar = this$0.f47820i;
                if (gVar != null && gVar.isOpen()) {
                    gVar.close();
                }
                this$0.f47820i = null;
                Unit unit2 = Unit.f48228a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(c this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f47817f.execute(this$0.f47823l);
    }

    public final void d() {
        synchronized (this.f47815d) {
            try {
                this.f47821j = true;
                g gVar = this.f47820i;
                if (gVar != null) {
                    gVar.close();
                }
                this.f47820i = null;
                Unit unit = Unit.f48228a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e() {
        synchronized (this.f47815d) {
            try {
                int i10 = this.f47818g;
                if (i10 <= 0) {
                    throw new IllegalStateException("ref count is 0 or lower but we're supposed to decrement");
                }
                int i11 = i10 - 1;
                this.f47818g = i11;
                if (i11 == 0) {
                    if (this.f47820i == null) {
                        return;
                    } else {
                        this.f47813b.postDelayed(this.f47822k, this.f47816e);
                    }
                }
                Unit unit = Unit.f48228a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Object g(Function1 block) {
        Intrinsics.checkNotNullParameter(block, "block");
        try {
            return block.invoke(j());
        } finally {
            e();
        }
    }

    public final g h() {
        return this.f47820i;
    }

    public final h i() {
        h hVar = this.f47812a;
        if (hVar != null) {
            return hVar;
        }
        Intrinsics.r("delegateOpenHelper");
        return null;
    }

    public final g j() {
        synchronized (this.f47815d) {
            this.f47813b.removeCallbacks(this.f47822k);
            this.f47818g++;
            if (this.f47821j) {
                throw new IllegalStateException("Attempting to open already closed database.");
            }
            g gVar = this.f47820i;
            if (gVar != null && gVar.isOpen()) {
                return gVar;
            }
            g gVarX2 = i().X2();
            this.f47820i = gVarX2;
            return gVarX2;
        }
    }

    public final void k(h delegateOpenHelper) {
        Intrinsics.checkNotNullParameter(delegateOpenHelper, "delegateOpenHelper");
        m(delegateOpenHelper);
    }

    public final void l(Runnable onAutoClose) {
        Intrinsics.checkNotNullParameter(onAutoClose, "onAutoClose");
        this.f47814c = onAutoClose;
    }

    public final void m(h hVar) {
        Intrinsics.checkNotNullParameter(hVar, "<set-?>");
        this.f47812a = hVar;
    }
}
