package p075e2;

import R1.AbstractC1348h;
import U1.AbstractC1459a;
import U1.AbstractC1477t;
import U1.C1471m;
import U1.InterfaceC1470l;
import U1.S;
import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import p003a2.D1;
import p236n2.B;
import p236n2.C4027y;
import p308r2.k;

/* JADX INFO: renamed from: e2.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class C3257g implements InterfaceC3263m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f40249a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final A f40250b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f40251c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final b f40252d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f40253e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f40254f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f40255g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final HashMap f40256h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final C1471m f40257i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final k f40258j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final D1 f40259k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final M f40260l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final UUID f40261m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Looper f40262n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final e f40263o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f40264p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f40265q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private HandlerThread f40266r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private c f40267s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Y1.b f40268t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private InterfaceC3263m.a f40269u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private byte[] f40270v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private byte[] f40271w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private A.a f40272x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private A.d f40273y;

    /* JADX INFO: renamed from: e2.g$a */
    public interface a {
        void a(Exception exc, boolean z10);

        void b();

        void c(C3257g c3257g);
    }

    /* JADX INFO: renamed from: e2.g$b */
    public interface b {
        void a(C3257g c3257g, int i10);

        void b(C3257g c3257g, int i10);
    }

    /* JADX INFO: renamed from: e2.g$c */
    private class c extends Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f40274a;

        public c(Looper looper) {
            super(looper);
        }

        private boolean a(Message message, N n10) {
            d dVar = (d) message.obj;
            if (!dVar.f40277b) {
                return false;
            }
            int i10 = dVar.f40280e + 1;
            dVar.f40280e = i10;
            if (i10 > C3257g.this.f40258j.b(3)) {
                return false;
            }
            long jA = C3257g.this.f40258j.a(new k.c(new C4027y(dVar.f40276a, n10.f40242a, n10.f40243b, n10.f40244c, SystemClock.elapsedRealtime(), SystemClock.elapsedRealtime() - dVar.f40278c, n10.f40245d), new B(3), n10.getCause() instanceof IOException ? (IOException) n10.getCause() : new f(n10.getCause()), dVar.f40280e));
            if (jA == -9223372036854775807L) {
                return false;
            }
            synchronized (this) {
                try {
                    if (this.f40274a) {
                        return false;
                    }
                    sendMessageDelayed(Message.obtain(message), jA);
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        void b(int i10, Object obj, boolean z10) {
            obtainMessage(i10, new d(C4027y.a(), z10, SystemClock.elapsedRealtime(), obj)).sendToTarget();
        }

        public synchronized void c() {
            removeCallbacksAndMessages(null);
            this.f40274a = true;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Object objB;
            d dVar = (d) message.obj;
            try {
                int i10 = message.what;
                if (i10 == 1) {
                    objB = C3257g.this.f40260l.b(C3257g.this.f40261m, (A.d) dVar.f40279d);
                } else {
                    if (i10 != 2) {
                        throw new RuntimeException();
                    }
                    objB = C3257g.this.f40260l.a(C3257g.this.f40261m, (A.a) dVar.f40279d);
                }
            } catch (N e10) {
                boolean zA = a(message, e10);
                objB = e10;
                if (zA) {
                    return;
                }
            } catch (Exception e11) {
                AbstractC1477t.i("DefaultDrmSession", "Key/provisioning request produced an unexpected exception. Not retrying.", e11);
                objB = e11;
            }
            C3257g.this.f40258j.d(dVar.f40276a);
            synchronized (this) {
                try {
                    if (!this.f40274a) {
                        C3257g.this.f40263o.obtainMessage(message.what, Pair.create(dVar.f40279d, objB)).sendToTarget();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: e2.g$d */
    private static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f40276a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f40277b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f40278c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Object f40279d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f40280e;

        public d(long j10, boolean z10, long j11, Object obj) {
            this.f40276a = j10;
            this.f40277b = z10;
            this.f40278c = j11;
            this.f40279d = obj;
        }
    }

    /* JADX INFO: renamed from: e2.g$e */
    private class e extends Handler {
        public e(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Pair pair = (Pair) message.obj;
            Object obj = pair.first;
            Object obj2 = pair.second;
            int i10 = message.what;
            if (i10 == 1) {
                C3257g.this.D(obj, obj2);
            } else {
                if (i10 != 2) {
                    return;
                }
                C3257g.this.x(obj, obj2);
            }
        }
    }

    /* JADX INFO: renamed from: e2.g$f */
    public static final class f extends IOException {
        public f(Throwable th) {
            super(th);
        }
    }

    public C3257g(UUID uuid, A a10, a aVar, b bVar, List list, int i10, boolean z10, boolean z11, byte[] bArr, HashMap map, M m10, Looper looper, k kVar, D1 d10) {
        if (i10 == 1 || i10 == 3) {
            AbstractC1459a.e(bArr);
        }
        this.f40261m = uuid;
        this.f40251c = aVar;
        this.f40252d = bVar;
        this.f40250b = a10;
        this.f40253e = i10;
        this.f40254f = z10;
        this.f40255g = z11;
        if (bArr != null) {
            this.f40271w = bArr;
            this.f40249a = null;
        } else {
            this.f40249a = Collections.unmodifiableList((List) AbstractC1459a.e(list));
        }
        this.f40256h = map;
        this.f40260l = m10;
        this.f40257i = new C1471m();
        this.f40258j = kVar;
        this.f40259k = d10;
        this.f40264p = 2;
        this.f40262n = looper;
        this.f40263o = new e(looper);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D(Object obj, Object obj2) {
        if (obj == this.f40273y) {
            if (this.f40264p == 2 || v()) {
                this.f40273y = null;
                if (obj2 instanceof Exception) {
                    this.f40251c.a((Exception) obj2, false);
                    return;
                }
                try {
                    this.f40250b.g((byte[]) obj2);
                    this.f40251c.b();
                } catch (Exception e10) {
                    this.f40251c.a(e10, true);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003b  */
    /* JADX WARN: Code duplicated, block: B:13:0x0041  */
    private boolean E() {
        if (v()) {
            return true;
        }
        try {
            byte[] bArrD = this.f40250b.d();
            this.f40270v = bArrD;
            this.f40250b.c(bArrD, this.f40259k);
            this.f40268t = this.f40250b.i(this.f40270v);
            this.f40264p = 3;
            r(new C3252b(3));
            AbstractC1459a.e(this.f40270v);
            return true;
        } catch (NotProvisionedException unused) {
            this.f40251c.c(this);
            return false;
        } catch (Exception e10) {
            e = e10;
            if (x.d(e)) {
                this.f40251c.c(this);
                return false;
            }
            w(e, 1);
            return false;
        } catch (NoSuchMethodError e11) {
            e = e11;
            if (x.d(e)) {
                this.f40251c.c(this);
                return false;
            }
            w(e, 1);
            return false;
        }
    }

    private void F(byte[] bArr, int i10, boolean z10) {
        try {
            this.f40272x = this.f40250b.m(bArr, this.f40249a, i10, this.f40256h);
            ((c) S.i(this.f40267s)).b(2, AbstractC1459a.e(this.f40272x), z10);
        } catch (Exception | NoSuchMethodError e10) {
            y(e10, true);
        }
    }

    private boolean H() {
        try {
            this.f40250b.e(this.f40270v, this.f40271w);
            return true;
        } catch (Exception | NoSuchMethodError e10) {
            w(e10, 1);
            return false;
        }
    }

    private void I() {
        if (Thread.currentThread() != this.f40262n.getThread()) {
            AbstractC1477t.i("DefaultDrmSession", "DefaultDrmSession accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + this.f40262n.getThread().getName(), new IllegalStateException());
        }
    }

    private void r(InterfaceC1470l interfaceC1470l) {
        Iterator it = this.f40257i.r2().iterator();
        while (it.hasNext()) {
            interfaceC1470l.accept((t.a) it.next());
        }
    }

    private void s(boolean z10) {
        if (this.f40255g) {
            return;
        }
        byte[] bArr = (byte[]) S.i(this.f40270v);
        int i10 = this.f40253e;
        if (i10 != 0 && i10 != 1) {
            if (i10 == 2) {
                if (this.f40271w == null || H()) {
                    F(bArr, 2, z10);
                    return;
                }
                return;
            }
            if (i10 != 3) {
                return;
            }
            AbstractC1459a.e(this.f40271w);
            AbstractC1459a.e(this.f40270v);
            F(this.f40271w, 3, z10);
            return;
        }
        if (this.f40271w == null) {
            F(bArr, 1, z10);
            return;
        }
        if (this.f40264p == 4 || H()) {
            long jT = t();
            if (this.f40253e != 0 || jT > 60) {
                if (jT <= 0) {
                    w(new L(), 2);
                    return;
                } else {
                    this.f40264p = 4;
                    r(new C3256f());
                    return;
                }
            }
            AbstractC1477t.b("DefaultDrmSession", "Offline license has expired or will expire soon. Remaining seconds: " + jT);
            F(bArr, 2, z10);
        }
    }

    private long t() {
        if (!AbstractC1348h.f10159d.equals(this.f40261m)) {
            return Long.MAX_VALUE;
        }
        Pair pair = (Pair) AbstractC1459a.e(P.b(this));
        return Math.min(((Long) pair.first).longValue(), ((Long) pair.second).longValue());
    }

    private boolean v() {
        int i10 = this.f40264p;
        return i10 == 3 || i10 == 4;
    }

    private void w(Throwable th, int i10) {
        this.f40269u = new InterfaceC3263m.a(th, x.b(th, i10));
        AbstractC1477t.d("DefaultDrmSession", "DRM session error", th);
        if (th instanceof Exception) {
            r(new C3255e(th));
        } else {
            if (!(th instanceof Error)) {
                throw new IllegalStateException("Unexpected Throwable subclass", th);
            }
            if (!x.e(th) && !x.d(th)) {
                throw ((Error) th);
            }
        }
        if (this.f40264p != 4) {
            this.f40264p = 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x(Object obj, Object obj2) {
        if (obj == this.f40272x && v()) {
            this.f40272x = null;
            if ((obj2 instanceof Exception) || (obj2 instanceof NoSuchMethodError)) {
                y((Throwable) obj2, false);
                return;
            }
            try {
                byte[] bArr = (byte[]) obj2;
                if (this.f40253e == 3) {
                    this.f40250b.l((byte[]) S.i(this.f40271w), bArr);
                    r(new C3253c());
                    return;
                }
                byte[] bArrL = this.f40250b.l(this.f40270v, bArr);
                int i10 = this.f40253e;
                if ((i10 == 2 || (i10 == 0 && this.f40271w != null)) && bArrL != null && bArrL.length != 0) {
                    this.f40271w = bArrL;
                }
                this.f40264p = 4;
                r(new C3254d());
            } catch (Exception e10) {
                e = e10;
                y(e, true);
            } catch (NoSuchMethodError e11) {
                e = e11;
                y(e, true);
            }
        }
    }

    private void y(Throwable th, boolean z10) {
        if ((th instanceof NotProvisionedException) || x.d(th)) {
            this.f40251c.c(this);
        } else {
            w(th, z10 ? 1 : 2);
        }
    }

    private void z() {
        if (this.f40253e == 0 && this.f40264p == 4) {
            S.i(this.f40270v);
            s(false);
        }
    }

    void A(int i10) {
        if (i10 != 2) {
            return;
        }
        z();
    }

    void B() {
        if (E()) {
            s(true);
        }
    }

    void C(Exception exc, boolean z10) {
        w(exc, z10 ? 1 : 3);
    }

    void G() {
        this.f40273y = this.f40250b.b();
        ((c) S.i(this.f40267s)).b(1, AbstractC1459a.e(this.f40273y), true);
    }

    @Override // p075e2.InterfaceC3263m
    public final UUID a() {
        I();
        return this.f40261m;
    }

    @Override // p075e2.InterfaceC3263m
    public boolean b() {
        I();
        return this.f40254f;
    }

    @Override // p075e2.InterfaceC3263m
    public void c(t.a aVar) {
        I();
        if (this.f40265q < 0) {
            AbstractC1477t.c("DefaultDrmSession", "Session reference count less than zero: " + this.f40265q);
            this.f40265q = 0;
        }
        if (aVar != null) {
            this.f40257i.a(aVar);
        }
        int i10 = this.f40265q + 1;
        this.f40265q = i10;
        if (i10 == 1) {
            AbstractC1459a.g(this.f40264p == 2);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.f40266r = handlerThread;
            handlerThread.start();
            this.f40267s = new c(this.f40266r.getLooper());
            if (E()) {
                s(true);
            }
        } else if (aVar != null && v() && this.f40257i.c(aVar) == 1) {
            aVar.k(this.f40264p);
        }
        this.f40252d.b(this, this.f40265q);
    }

    @Override // p075e2.InterfaceC3263m
    public void e(t.a aVar) {
        I();
        int i10 = this.f40265q;
        if (i10 <= 0) {
            AbstractC1477t.c("DefaultDrmSession", "release() called on a session that's already fully released.");
            return;
        }
        int i11 = i10 - 1;
        this.f40265q = i11;
        if (i11 == 0) {
            this.f40264p = 0;
            ((e) S.i(this.f40263o)).removeCallbacksAndMessages(null);
            ((c) S.i(this.f40267s)).c();
            this.f40267s = null;
            ((HandlerThread) S.i(this.f40266r)).quit();
            this.f40266r = null;
            this.f40268t = null;
            this.f40269u = null;
            this.f40272x = null;
            this.f40273y = null;
            byte[] bArr = this.f40270v;
            if (bArr != null) {
                this.f40250b.k(bArr);
                this.f40270v = null;
            }
        }
        if (aVar != null) {
            this.f40257i.e(aVar);
            if (this.f40257i.c(aVar) == 0) {
                aVar.m();
            }
        }
        this.f40252d.a(this, this.f40265q);
    }

    @Override // p075e2.InterfaceC3263m
    public final InterfaceC3263m.a f() {
        I();
        if (this.f40264p == 1) {
            return this.f40269u;
        }
        return null;
    }

    @Override // p075e2.InterfaceC3263m
    public final Y1.b g() {
        I();
        return this.f40268t;
    }

    @Override // p075e2.InterfaceC3263m
    public final int getState() {
        I();
        return this.f40264p;
    }

    @Override // p075e2.InterfaceC3263m
    public Map h() {
        I();
        byte[] bArr = this.f40270v;
        if (bArr == null) {
            return null;
        }
        return this.f40250b.a(bArr);
    }

    @Override // p075e2.InterfaceC3263m
    public boolean i(String str) {
        I();
        return this.f40250b.j((byte[]) AbstractC1459a.i(this.f40270v), str);
    }

    public boolean u(byte[] bArr) {
        I();
        return Arrays.equals(this.f40270v, bArr);
    }
}
