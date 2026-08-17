package T6;

import If.C1109k;
import android.os.Handler;
import android.os.Looper;
import java.nio.channels.ClosedChannelException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p339sf.A;
import p339sf.C;
import p339sf.E;
import p339sf.I;
import p339sf.J;

/* JADX INFO: loaded from: classes2.dex */
public final class g extends J {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final a f12302i = new a(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f12303j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f12304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private c f12305b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f12306c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Handler f12307d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final A f12308e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f12309f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f12310g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private I f12311h;

    private static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public interface b {
        void a();

        void b();
    }

    public interface c {
        void a(C1109k c1109k);

        void onMessage(String str);
    }

    static {
        String simpleName = g.class.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
        f12303j = simpleName;
    }

    public g(String url, c cVar, b bVar) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.f12304a = url;
        this.f12305b = cVar;
        this.f12306c = bVar;
        this.f12307d = new Handler(Looper.getMainLooper());
        A.a aVar = new A.a();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.f12308e = aVar.f(10L, timeUnit).Q(10L, timeUnit).P(0L, TimeUnit.MINUTES).c();
    }

    private final void h(String str, Throwable th) {
        W4.a.n(f12303j, "Error occurred, shutting down websocket connection: " + str, th);
        j();
    }

    private final void j() {
        try {
            I i10 = this.f12311h;
            if (i10 != null) {
                i10.e(1000, "End of session");
            }
        } catch (Exception unused) {
        }
        this.f12311h = null;
    }

    private final synchronized void l() {
        if (!this.f12309f) {
            k();
        }
    }

    private final void m() {
        if (this.f12309f) {
            throw new IllegalStateException("Can't reconnect closed client");
        }
        if (!this.f12310g) {
            W4.a.I(f12303j, "Couldn't connect to \"" + this.f12304a + "\", will silently retry");
            this.f12310g = true;
        }
        this.f12307d.postDelayed(new f(this), 2000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(g gVar) {
        gVar.l();
    }

    @Override // p339sf.J
    public synchronized void a(I webSocket, int i10, String reason) {
        try {
            Intrinsics.checkNotNullParameter(webSocket, "webSocket");
            Intrinsics.checkNotNullParameter(reason, "reason");
            this.f12311h = null;
            if (!this.f12309f) {
                b bVar = this.f12306c;
                if (bVar != null) {
                    bVar.b();
                }
                m();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p339sf.J
    public synchronized void c(I webSocket, Throwable t10, E e10) {
        try {
            Intrinsics.checkNotNullParameter(webSocket, "webSocket");
            Intrinsics.checkNotNullParameter(t10, "t");
            if (this.f12311h != null) {
                h("Websocket exception", t10);
            }
            if (!this.f12309f) {
                b bVar = this.f12306c;
                if (bVar != null) {
                    bVar.b();
                }
                m();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p339sf.J
    public synchronized void d(I webSocket, C1109k bytes) {
        Intrinsics.checkNotNullParameter(webSocket, "webSocket");
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        c cVar = this.f12305b;
        if (cVar != null) {
            cVar.a(bytes);
        }
    }

    @Override // p339sf.J
    public synchronized void e(I webSocket, String text) {
        Intrinsics.checkNotNullParameter(webSocket, "webSocket");
        Intrinsics.checkNotNullParameter(text, "text");
        c cVar = this.f12305b;
        if (cVar != null) {
            cVar.onMessage(text);
        }
    }

    @Override // p339sf.J
    public synchronized void f(I webSocket, E response) {
        Intrinsics.checkNotNullParameter(webSocket, "webSocket");
        Intrinsics.checkNotNullParameter(response, "response");
        this.f12311h = webSocket;
        this.f12310g = false;
        b bVar = this.f12306c;
        if (bVar != null) {
            bVar.a();
        }
    }

    public final void i() {
        this.f12309f = true;
        j();
        this.f12305b = null;
        b bVar = this.f12306c;
        if (bVar != null) {
            bVar.b();
        }
    }

    public final void k() {
        if (this.f12309f) {
            throw new IllegalStateException("Can't connect closed client");
        }
        this.f12308e.F(new C.a().l(this.f12304a).b(), this);
    }

    public final synchronized void o(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        I i10 = this.f12311h;
        if (i10 == null) {
            throw new ClosedChannelException();
        }
        i10.send(message);
    }
}
