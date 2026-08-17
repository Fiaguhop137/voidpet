package p193kd;

import Ad.n;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.collections.W;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p265od.g;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends Handler {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f48062h = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f48063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g f48064b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ArrayList f48065c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f48066d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f48067e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f48068f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ArrayList f48069g;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private enum b {
        WAIT_FOR_REMOTE_UPDATE,
        LAUNCH_NEW_UPDATE,
        LAUNCH_CACHED_UPDATE,
        CRASH;


        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f48075f = Gd.a.a(e());
    }

    public /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f48076a;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.WAIT_FOR_REMOTE_UPDATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.LAUNCH_NEW_UPDATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b.LAUNCH_CACHED_UPDATE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[b.CRASH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f48076a = iArr;
        }
    }

    public static final class d implements md.b.a {
        d() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(h hVar, Exception exc) {
            hVar.f48069g.add(exc);
            hVar.f48065c.removeAll(W.g(b.LAUNCH_NEW_UPDATE, b.LAUNCH_CACHED_UPDATE));
            hVar.j();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void d(h hVar) {
            hVar.f48066d = false;
        }

        @Override // md.b.a
        public void onFailure(Exception e10) {
            Intrinsics.checkNotNullParameter(e10, "e");
            h hVar = h.this;
            hVar.post(new j(hVar, e10));
        }

        @Override // md.b.a
        public void onSuccess() {
            h hVar = h.this;
            hVar.post(new i(hVar));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Looper looper, f delegate, g logger) {
        super(looper);
        Intrinsics.checkNotNullParameter(looper, "looper");
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.f48063a = delegate;
        this.f48064b = logger;
        this.f48065c = CollectionsKt.g(b.WAIT_FOR_REMOTE_UPDATE, b.LAUNCH_NEW_UPDATE, b.LAUNCH_CACHED_UPDATE, b.CRASH);
        this.f48069g = new ArrayList();
    }

    private final void f() {
        f fVar = this.f48063a;
        Object obj = this.f48069g.get(0);
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        fVar.d((Exception) obj);
    }

    private final void g() {
        this.f48068f = true;
        this.f48065c.retainAll(W.g(b.WAIT_FOR_REMOTE_UPDATE, b.CRASH));
        this.f48063a.b();
    }

    private final void h(f.a aVar) {
        if (this.f48067e) {
            this.f48067e = false;
            if (aVar != f.a.NEW_UPDATE_LOADED) {
                this.f48065c.remove(b.LAUNCH_NEW_UPDATE);
            }
            j();
        }
    }

    private final void i(Exception exc) {
        this.f48069g.add(exc);
        if (this.f48063a.e() > 0) {
            this.f48065c.remove(b.LAUNCH_CACHED_UPDATE);
        } else if (!this.f48068f) {
            this.f48063a.f();
        }
        if (this.f48066d) {
            return;
        }
        this.f48066d = true;
        j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j() {
        int i10 = c.f48076a[((b) this.f48065c.remove(0)).ordinal()];
        if (i10 == 1) {
            g.k(this.f48064b, "UpdatesErrorRecovery: attempting to fetch a new update, waiting", null, 2, null);
            l();
            return;
        }
        if (i10 == 2) {
            g.k(this.f48064b, "UpdatesErrorRecovery: launching new update", null, 2, null);
            k();
            return;
        }
        if (i10 == 3) {
            g.k(this.f48064b, "UpdatesErrorRecovery: falling back to older update", null, 2, null);
            k();
        } else {
            if (i10 != 4) {
                throw new n();
            }
            g gVar = this.f48064b;
            Object obj = this.f48069g.get(0);
            Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
            gVar.f("UpdatesErrorRecovery: could not recover from error, crashing", (Exception) obj, p265od.b.Unknown);
            f();
        }
    }

    private final void k() {
        this.f48063a.c(new d());
    }

    private final void l() {
        f.a aVarG = this.f48063a.g();
        if (aVarG == f.a.NEW_UPDATE_LOADED) {
            j();
            return;
        }
        f.a aVar = f.a.NEW_UPDATE_LOADING;
        if (aVarG != aVar && this.f48063a.h() == expo.modules.updates.d.a.f41459a) {
            this.f48065c.remove(b.LAUNCH_NEW_UPDATE);
            j();
        } else {
            this.f48067e = true;
            if (this.f48063a.g() != aVar) {
                this.f48063a.a();
            }
            postDelayed(new g(this), 5000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(h hVar) {
        hVar.h(f.a.IDLE);
    }

    @Override // android.os.Handler
    public void handleMessage(Message msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        int i10 = msg.what;
        if (i10 == 0) {
            Object obj = msg.obj;
            Intrinsics.d(obj, "null cannot be cast to non-null type java.lang.Exception");
            i((Exception) obj);
        } else {
            if (i10 == 1) {
                g();
                return;
            }
            if (i10 == 2) {
                Object obj2 = msg.obj;
                Intrinsics.d(obj2, "null cannot be cast to non-null type expo.modules.updates.errorrecovery.ErrorRecoveryDelegate.RemoteLoadStatus");
                h((f.a) obj2);
            } else {
                throw new RuntimeException("ErrorRecoveryHandler cannot handle message " + msg.what);
            }
        }
    }
}
