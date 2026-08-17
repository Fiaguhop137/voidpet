package p075e2;

import C9.AbstractC0876t;
import C9.AbstractC0878v;
import C9.Q;
import C9.V;
import R1.AbstractC1348h;
import R1.n;
import R1.r;
import R1.y;
import U1.AbstractC1459a;
import U1.AbstractC1477t;
import U1.S;
import android.media.ResourceBusyException;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import p003a2.D1;
import p308r2.j;
import p308r2.k;

/* JADX INFO: renamed from: e2.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C3258h implements u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final UUID f40282b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final A.c f40283c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final M f40284d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final HashMap f40285e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f40286f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int[] f40287g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f40288h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final g f40289i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final k f40290j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final C0448h f40291k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final long f40292l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final List f40293m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Set f40294n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Set f40295o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f40296p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private A f40297q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private C3257g f40298r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private C3257g f40299s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Looper f40300t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private Handler f40301u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f40302v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private byte[] f40303w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private D1 f40304x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    volatile d f40305y;

    /* JADX INFO: renamed from: e2.h$b */
    public static final class b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f40309d;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final HashMap f40306a = new HashMap();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private UUID f40307b = AbstractC1348h.f10159d;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private A.c f40308c = J.f40234d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int[] f40310e = new int[0];

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f40311f = true;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private k f40312g = new j();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private long f40313h = 300000;

        public C3258h a(M m10) {
            return new C3258h(this.f40307b, this.f40308c, m10, this.f40306a, this.f40309d, this.f40310e, this.f40311f, this.f40312g, this.f40313h, null);
        }

        public b b(k kVar) {
            this.f40312g = (k) AbstractC1459a.e(kVar);
            return this;
        }

        public b c(boolean z10) {
            this.f40309d = z10;
            return this;
        }

        public b d(boolean z10) {
            this.f40311f = z10;
            return this;
        }

        public b e(int... iArr) {
            for (int i10 : iArr) {
                boolean z10 = true;
                if (i10 != 2 && i10 != 1) {
                    z10 = false;
                }
                AbstractC1459a.a(z10);
            }
            this.f40310e = (int[]) iArr.clone();
            return this;
        }

        public b f(UUID uuid, A.c cVar) {
            this.f40307b = (UUID) AbstractC1459a.e(uuid);
            this.f40308c = (A.c) AbstractC1459a.e(cVar);
            return this;
        }
    }

    /* JADX INFO: renamed from: e2.h$c */
    private class c implements A.b {
        private c() {
        }

        /* synthetic */ c(C3258h c3258h, a aVar) {
            this();
        }

        @Override // e2.A.b
        public void a(A a10, byte[] bArr, int i10, int i11, byte[] bArr2) {
            ((d) AbstractC1459a.e(C3258h.this.f40305y)).obtainMessage(i10, bArr).sendToTarget();
        }
    }

    /* JADX INFO: renamed from: e2.h$d */
    private class d extends Handler {
        public d(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            byte[] bArr = (byte[]) message.obj;
            if (bArr == null) {
                return;
            }
            for (C3257g c3257g : C3258h.this.f40293m) {
                if (c3257g.u(bArr)) {
                    c3257g.A(message.what);
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: e2.h$e */
    public static final class e extends Exception {
        private e(UUID uuid) {
            super("Media does not support uuid: " + uuid);
        }

        /* synthetic */ e(UUID uuid, a aVar) {
            this(uuid);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e2.h$f */
    class f implements u.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final t.a f40316b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private InterfaceC3263m f40317c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f40318d;

        public f(t.a aVar) {
            this.f40316b = aVar;
        }

        public static /* synthetic */ void b(f fVar, r rVar) {
            if (C3258h.this.f40296p == 0 || fVar.f40318d) {
                return;
            }
            C3258h c3258h = C3258h.this;
            fVar.f40317c = c3258h.t((Looper) AbstractC1459a.e(c3258h.f40300t), fVar.f40316b, rVar, false);
            C3258h.this.f40294n.add(fVar);
        }

        public static /* synthetic */ void c(f fVar) {
            if (fVar.f40318d) {
                return;
            }
            InterfaceC3263m interfaceC3263m = fVar.f40317c;
            if (interfaceC3263m != null) {
                interfaceC3263m.e(fVar.f40316b);
            }
            C3258h.this.f40294n.remove(fVar);
            fVar.f40318d = true;
        }

        public void d(r rVar) {
            ((Handler) AbstractC1459a.e(C3258h.this.f40301u)).post(new RunnableC3259i(this, rVar));
        }

        @Override // e2.u.b
        public void release() {
            S.W0((Handler) AbstractC1459a.e(C3258h.this.f40301u), new RunnableC3260j(this));
        }
    }

    /* JADX INFO: renamed from: e2.h$g */
    private class g implements C3257g.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Set f40320a = new HashSet();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private C3257g f40321b;

        public g() {
        }

        @Override // p075e2.C3257g.a
        public void a(Exception exc, boolean z10) {
            this.f40321b = null;
            AbstractC0876t abstractC0876tP = AbstractC0876t.p(this.f40320a);
            this.f40320a.clear();
            V it = abstractC0876tP.iterator();
            while (it.hasNext()) {
                ((C3257g) it.next()).C(exc, z10);
            }
        }

        @Override // p075e2.C3257g.a
        public void b() {
            this.f40321b = null;
            AbstractC0876t abstractC0876tP = AbstractC0876t.p(this.f40320a);
            this.f40320a.clear();
            V it = abstractC0876tP.iterator();
            while (it.hasNext()) {
                ((C3257g) it.next()).B();
            }
        }

        @Override // p075e2.C3257g.a
        public void c(C3257g c3257g) {
            this.f40320a.add(c3257g);
            if (this.f40321b != null) {
                return;
            }
            this.f40321b = c3257g;
            c3257g.G();
        }

        public void d(C3257g c3257g) {
            this.f40320a.remove(c3257g);
            if (this.f40321b == c3257g) {
                this.f40321b = null;
                if (this.f40320a.isEmpty()) {
                    return;
                }
                C3257g c3257g2 = (C3257g) this.f40320a.iterator().next();
                this.f40321b = c3257g2;
                c3257g2.G();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e2.h$h, reason: collision with other inner class name */
    class C0448h implements C3257g.b {
        private C0448h() {
        }

        /* synthetic */ C0448h(C3258h c3258h, a aVar) {
            this();
        }

        @Override // p075e2.C3257g.b
        public void a(C3257g c3257g, int i10) {
            if (i10 == 1 && C3258h.this.f40296p > 0 && C3258h.this.f40292l != -9223372036854775807L) {
                C3258h.this.f40295o.add(c3257g);
                ((Handler) AbstractC1459a.e(C3258h.this.f40301u)).postAtTime(new RunnableC3261k(c3257g), c3257g, SystemClock.uptimeMillis() + C3258h.this.f40292l);
            } else if (i10 == 0) {
                C3258h.this.f40293m.remove(c3257g);
                if (C3258h.this.f40298r == c3257g) {
                    C3258h.this.f40298r = null;
                }
                if (C3258h.this.f40299s == c3257g) {
                    C3258h.this.f40299s = null;
                }
                C3258h.this.f40289i.d(c3257g);
                if (C3258h.this.f40292l != -9223372036854775807L) {
                    ((Handler) AbstractC1459a.e(C3258h.this.f40301u)).removeCallbacksAndMessages(c3257g);
                    C3258h.this.f40295o.remove(c3257g);
                }
            }
            C3258h.this.C();
        }

        @Override // p075e2.C3257g.b
        public void b(C3257g c3257g, int i10) {
            if (C3258h.this.f40292l != -9223372036854775807L) {
                C3258h.this.f40295o.remove(c3257g);
                ((Handler) AbstractC1459a.e(C3258h.this.f40301u)).removeCallbacksAndMessages(c3257g);
            }
        }
    }

    private C3258h(UUID uuid, A.c cVar, M m10, HashMap map, boolean z10, int[] iArr, boolean z11, k kVar, long j10) {
        AbstractC1459a.e(uuid);
        AbstractC1459a.b(!AbstractC1348h.f10157b.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.f40282b = uuid;
        this.f40283c = cVar;
        this.f40284d = m10;
        this.f40285e = map;
        this.f40286f = z10;
        this.f40287g = iArr;
        this.f40288h = z11;
        this.f40290j = kVar;
        this.f40289i = new g();
        this.f40291k = new C0448h(this, null);
        this.f40302v = 0;
        this.f40293m = new ArrayList();
        this.f40294n = Q.h();
        this.f40295o = Q.h();
        this.f40292l = j10;
    }

    /* synthetic */ C3258h(UUID uuid, A.c cVar, M m10, HashMap map, boolean z10, int[] iArr, boolean z11, k kVar, long j10, a aVar) {
        this(uuid, cVar, m10, map, z10, iArr, z11, kVar, j10);
    }

    private InterfaceC3263m A(int i10, boolean z10) {
        A a10 = (A) AbstractC1459a.e(this.f40297q);
        if ((a10.h() == 2 && B.f40228d) || S.J0(this.f40287g, i10) == -1 || a10.h() == 1) {
            return null;
        }
        C3257g c3257g = this.f40298r;
        if (c3257g == null) {
            C3257g c3257gX = x(AbstractC0876t.w(), true, null, z10);
            this.f40293m.add(c3257gX);
            this.f40298r = c3257gX;
        } else {
            c3257g.c(null);
        }
        return this.f40298r;
    }

    private void B(Looper looper) {
        if (this.f40305y == null) {
            this.f40305y = new d(looper);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C() {
        if (this.f40297q != null && this.f40296p == 0 && this.f40293m.isEmpty() && this.f40294n.isEmpty()) {
            ((A) AbstractC1459a.e(this.f40297q)).release();
            this.f40297q = null;
        }
    }

    private void D() {
        V it = AbstractC0878v.o(this.f40295o).iterator();
        while (it.hasNext()) {
            ((InterfaceC3263m) it.next()).e(null);
        }
    }

    private void E() {
        V it = AbstractC0878v.o(this.f40294n).iterator();
        while (it.hasNext()) {
            ((f) it.next()).release();
        }
    }

    private void G(InterfaceC3263m interfaceC3263m, t.a aVar) {
        interfaceC3263m.e(aVar);
        if (this.f40292l != -9223372036854775807L) {
            interfaceC3263m.e(null);
        }
    }

    private void H(boolean z10) {
        if (z10 && this.f40300t == null) {
            AbstractC1477t.i("DefaultDrmSessionMgr", "DefaultDrmSessionManager accessed before setPlayer(), possibly on the wrong thread.", new IllegalStateException());
            return;
        }
        if (Thread.currentThread() != ((Looper) AbstractC1459a.e(this.f40300t)).getThread()) {
            AbstractC1477t.i("DefaultDrmSessionMgr", "DefaultDrmSessionManager accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + this.f40300t.getThread().getName(), new IllegalStateException());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public InterfaceC3263m t(Looper looper, t.a aVar, r rVar, boolean z10) {
        List listY;
        B(looper);
        n nVar = rVar.f10281s;
        if (nVar == null) {
            return A(y.k(rVar.f10277o), z10);
        }
        C3257g c3257g = null;
        if (this.f40303w == null) {
            listY = y((n) AbstractC1459a.e(nVar), this.f40282b, false);
            if (listY.isEmpty()) {
                e eVar = new e(this.f40282b, null);
                AbstractC1477t.d("DefaultDrmSessionMgr", "DRM error", eVar);
                if (aVar != null) {
                    aVar.l(eVar);
                }
                return new z(new InterfaceC3263m.a(eVar, 6003));
            }
        } else {
            listY = null;
        }
        if (this.f40286f) {
            for (C3257g c3257g2 : this.f40293m) {
                if (Objects.equals(c3257g2.f40249a, listY)) {
                    c3257g = c3257g2;
                    break;
                }
            }
        } else {
            c3257g = this.f40299s;
        }
        if (c3257g != null) {
            c3257g.c(aVar);
            return c3257g;
        }
        C3257g c3257gX = x(listY, false, aVar, z10);
        if (!this.f40286f) {
            this.f40299s = c3257gX;
        }
        this.f40293m.add(c3257gX);
        return c3257gX;
    }

    private static boolean u(InterfaceC3263m interfaceC3263m) {
        if (interfaceC3263m.getState() != 1) {
            return false;
        }
        Throwable cause = ((InterfaceC3263m.a) AbstractC1459a.e(interfaceC3263m.f())).getCause();
        return (cause instanceof ResourceBusyException) || x.e(cause);
    }

    private boolean v(n nVar) {
        if (this.f40303w != null) {
            return true;
        }
        if (y(nVar, this.f40282b, true).isEmpty()) {
            if (nVar.f10199d != 1 || !nVar.m(0).l(AbstractC1348h.f10157b)) {
                return false;
            }
            AbstractC1477t.h("DefaultDrmSessionMgr", "DrmInitData only contains common PSSH SchemeData. Assuming support for: " + this.f40282b);
        }
        String str = nVar.f10198c;
        if (str == null || "cenc".equals(str)) {
            return true;
        }
        if ("cbcs".equals(str)) {
            return Build.VERSION.SDK_INT >= 25;
        }
        return ("cbc1".equals(str) || "cens".equals(str)) ? false : true;
    }

    private C3257g w(List list, boolean z10, t.a aVar) {
        AbstractC1459a.e(this.f40297q);
        C3257g c3257g = new C3257g(this.f40282b, this.f40297q, this.f40289i, this.f40291k, list, this.f40302v, this.f40288h | z10, z10, this.f40303w, this.f40285e, this.f40284d, (Looper) AbstractC1459a.e(this.f40300t), this.f40290j, (D1) AbstractC1459a.e(this.f40304x));
        c3257g.c(aVar);
        if (this.f40292l != -9223372036854775807L) {
            c3257g.c(null);
        }
        return c3257g;
    }

    private C3257g x(List list, boolean z10, t.a aVar, boolean z11) {
        C3257g c3257gW = w(list, z10, aVar);
        if (u(c3257gW) && !this.f40295o.isEmpty()) {
            D();
            G(c3257gW, aVar);
            c3257gW = w(list, z10, aVar);
        }
        if (!u(c3257gW) || !z11 || this.f40294n.isEmpty()) {
            return c3257gW;
        }
        E();
        if (!this.f40295o.isEmpty()) {
            D();
        }
        G(c3257gW, aVar);
        return w(list, z10, aVar);
    }

    private static List y(n nVar, UUID uuid, boolean z10) {
        ArrayList arrayList = new ArrayList(nVar.f10199d);
        for (int i10 = 0; i10 < nVar.f10199d; i10++) {
            n.b bVarM = nVar.m(i10);
            if ((bVarM.l(uuid) || (AbstractC1348h.f10158c.equals(uuid) && bVarM.l(AbstractC1348h.f10157b))) && (bVarM.f10204e != null || z10)) {
                arrayList.add(bVarM);
            }
        }
        return arrayList;
    }

    private synchronized void z(Looper looper) {
        try {
            Looper looper2 = this.f40300t;
            if (looper2 == null) {
                this.f40300t = looper;
                this.f40301u = new Handler(looper);
            } else {
                AbstractC1459a.g(looper2 == looper);
                AbstractC1459a.e(this.f40301u);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public void F(int i10, byte[] bArr) {
        AbstractC1459a.g(this.f40293m.isEmpty());
        if (i10 == 1 || i10 == 3) {
            AbstractC1459a.e(bArr);
        }
        this.f40302v = i10;
        this.f40303w = bArr;
    }

    @Override // p075e2.u
    public InterfaceC3263m a(t.a aVar, r rVar) {
        H(false);
        AbstractC1459a.g(this.f40296p > 0);
        AbstractC1459a.i(this.f40300t);
        return t(this.f40300t, aVar, rVar, true);
    }

    @Override // p075e2.u
    public void b(Looper looper, D1 d10) {
        z(looper);
        this.f40304x = d10;
    }

    @Override // p075e2.u
    public u.b c(t.a aVar, r rVar) {
        AbstractC1459a.g(this.f40296p > 0);
        AbstractC1459a.i(this.f40300t);
        f fVar = new f(aVar);
        fVar.d(rVar);
        return fVar;
    }

    @Override // p075e2.u
    public int d(r rVar) {
        H(false);
        int iH = ((A) AbstractC1459a.e(this.f40297q)).h();
        n nVar = rVar.f10281s;
        if (nVar == null) {
            if (S.J0(this.f40287g, y.k(rVar.f10277o)) == -1) {
                return 0;
            }
        } else if (!v(nVar)) {
            return 1;
        }
        return iH;
    }

    @Override // p075e2.u
    public final void e() {
        H(true);
        int i10 = this.f40296p;
        this.f40296p = i10 + 1;
        if (i10 != 0) {
            return;
        }
        if (this.f40297q == null) {
            A a10 = this.f40283c.a(this.f40282b);
            this.f40297q = a10;
            a10.f(new c(this, null));
        } else if (this.f40292l != -9223372036854775807L) {
            for (int i11 = 0; i11 < this.f40293m.size(); i11++) {
                ((C3257g) this.f40293m.get(i11)).c(null);
            }
        }
    }

    @Override // p075e2.u
    public final void release() {
        H(true);
        int i10 = this.f40296p - 1;
        this.f40296p = i10;
        if (i10 != 0) {
            return;
        }
        if (this.f40292l != -9223372036854775807L) {
            ArrayList arrayList = new ArrayList(this.f40293m);
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                ((C3257g) arrayList.get(i11)).e(null);
            }
        }
        E();
        C();
    }
}
