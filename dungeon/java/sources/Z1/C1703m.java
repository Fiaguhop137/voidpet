package Z1;

import U1.AbstractC1459a;
import U1.AbstractC1477t;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: Z1.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1703m implements T0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p308r2.g f18352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f18353b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f18354c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f18355d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f18356e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f18357f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f18358g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final long f18359h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f18360i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final HashMap f18361j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f18362k;

    /* JADX INFO: renamed from: Z1.m$b */
    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f18363a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f18364b;

        private b() {
        }

        /* synthetic */ b(a aVar) {
            this();
        }
    }

    public C1703m() {
        this(new p308r2.g(true, 65536), 50000, 50000, 1000, 2000, -1, false, 0, false);
    }

    protected C1703m(p308r2.g gVar, int i10, int i11, int i12, int i13, int i14, boolean z10, int i15, boolean z11) {
        k(i12, 0, "bufferForPlaybackMs", "0");
        k(i13, 0, "bufferForPlaybackAfterRebufferMs", "0");
        k(i10, i12, "minBufferMs", "bufferForPlaybackMs");
        k(i10, i13, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        k(i11, i10, "maxBufferMs", "minBufferMs");
        k(i15, 0, "backBufferDurationMs", "0");
        this.f18352a = gVar;
        this.f18353b = U1.S.M0(i10);
        this.f18354c = U1.S.M0(i11);
        this.f18355d = U1.S.M0(i12);
        this.f18356e = U1.S.M0(i13);
        this.f18357f = i14;
        this.f18358g = z10;
        this.f18359h = U1.S.M0(i15);
        this.f18360i = z11;
        this.f18361j = new HashMap();
        this.f18362k = -1L;
    }

    private static void k(int i10, int i11, String str, String str2) {
        AbstractC1459a.b(i10 >= i11, str + " cannot be less than " + str2);
    }

    private static int n(int i10) {
        switch (i10) {
            case -2:
                return 0;
            case -1:
                return 13107200;
            case 0:
                return 144310272;
            case 1:
                return 13107200;
            case 2:
                return 131072000;
            case 3:
                return 131072;
            case 4:
                return 26214400;
            case 5:
            case 6:
                return 131072;
            default:
                throw new IllegalArgumentException();
        }
    }

    private void o(p003a2.D1 d10) {
        if (this.f18361j.remove(d10) != null) {
            q();
        }
    }

    private void p(p003a2.D1 d10) {
        b bVar = (b) AbstractC1459a.e((b) this.f18361j.get(d10));
        int i10 = this.f18357f;
        if (i10 == -1) {
            i10 = 13107200;
        }
        bVar.f18364b = i10;
        bVar.f18363a = false;
    }

    private void q() {
        if (this.f18361j.isEmpty()) {
            this.f18352a.g();
        } else {
            this.f18352a.h(m());
        }
    }

    @Override // Z1.T0
    public boolean a(R1.F f10, n2.D.b bVar, long j10) {
        Iterator it = this.f18361j.values().iterator();
        while (it.hasNext()) {
            if (((b) it.next()).f18363a) {
                return false;
            }
        }
        return true;
    }

    @Override // Z1.T0
    public boolean b(p003a2.D1 d10) {
        return this.f18360i;
    }

    @Override // Z1.T0
    public long c(p003a2.D1 d10) {
        return this.f18359h;
    }

    @Override // Z1.T0
    public void d(T0.a aVar, p236n2.m0 m0Var, p290q2.y[] yVarArr) {
        b bVar = (b) AbstractC1459a.e((b) this.f18361j.get(aVar.f18155a));
        int iL = this.f18357f;
        if (iL == -1) {
            iL = l(yVarArr);
        }
        bVar.f18364b = iL;
        q();
    }

    @Override // Z1.T0
    public void e(p003a2.D1 d10) {
        o(d10);
    }

    @Override // Z1.T0
    public p308r2.b f() {
        return this.f18352a;
    }

    @Override // Z1.T0
    public boolean g(T0.a aVar) {
        b bVar = (b) AbstractC1459a.e((b) this.f18361j.get(aVar.f18155a));
        boolean z10 = true;
        boolean z11 = this.f18352a.f() >= m();
        long jMin = this.f18353b;
        float f10 = aVar.f18160f;
        if (f10 > 1.0f) {
            jMin = Math.min(U1.S.g0(jMin, f10), this.f18354c);
        }
        long jMax = Math.max(jMin, 500000L);
        long j10 = aVar.f18159e;
        if (j10 < jMax) {
            if (!this.f18358g && z11) {
                z10 = false;
            }
            bVar.f18363a = z10;
            if (!z10 && j10 < 500000) {
                AbstractC1477t.h("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j10 >= this.f18354c || z11) {
            bVar.f18363a = false;
        }
        return bVar.f18363a;
    }

    @Override // Z1.T0
    public void h(p003a2.D1 d10) {
        long id2 = Thread.currentThread().getId();
        long j10 = this.f18362k;
        AbstractC1459a.h(j10 == -1 || j10 == id2, "Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).");
        this.f18362k = id2;
        if (!this.f18361j.containsKey(d10)) {
            this.f18361j.put(d10, new b(null));
        }
        p(d10);
    }

    @Override // Z1.T0
    public boolean i(T0.a aVar) {
        long jM0 = U1.S.m0(aVar.f18159e, aVar.f18160f);
        long jMin = aVar.f18162h ? this.f18356e : this.f18355d;
        long j10 = aVar.f18163i;
        if (j10 != -9223372036854775807L) {
            jMin = Math.min(j10 / 2, jMin);
        }
        if (jMin <= 0 || jM0 >= jMin) {
            return true;
        }
        return !this.f18358g && this.f18352a.f() >= m();
    }

    @Override // Z1.T0
    public void j(p003a2.D1 d10) {
        o(d10);
        if (this.f18361j.isEmpty()) {
            this.f18362k = -1L;
        }
    }

    protected int l(p290q2.y[] yVarArr) {
        int iN = 0;
        for (p290q2.y yVar : yVarArr) {
            if (yVar != null) {
                iN += n(yVar.k().f9965c);
            }
        }
        return Math.max(13107200, iN);
    }

    int m() {
        Iterator it = this.f18361j.values().iterator();
        int i10 = 0;
        while (it.hasNext()) {
            i10 += ((b) it.next()).f18364b;
        }
        return i10;
    }
}
