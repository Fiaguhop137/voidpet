package p025b6;

import N5.c;
import V4.n;
import V5.b;
import Y4.h;
import Y4.j;
import Z4.a;
import android.graphics.ColorSpace;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import kotlin.Pair;
import p222m6.d;
import p222m6.e;
import p222m6.f;
import p222m6.i;

/* JADX INFO: loaded from: classes2.dex */
public class k implements Closeable {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static boolean f26296n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f26297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final n f26298b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private c f26299c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f26300d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f26301e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f26302f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f26303g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f26304h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f26305i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private b f26306j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private ColorSpace f26307k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f26308l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f26309m;

    public k(n nVar) {
        this.f26299c = c.f7888d;
        this.f26300d = -1;
        this.f26301e = 0;
        this.f26302f = -1;
        this.f26303g = -1;
        this.f26304h = 1;
        this.f26305i = -1;
        V4.k.g(nVar);
        this.f26297a = null;
        this.f26298b = nVar;
    }

    public k(n nVar, int i10) {
        this(nVar);
        this.f26305i = i10;
    }

    public k(a aVar) {
        this.f26299c = c.f7888d;
        this.f26300d = -1;
        this.f26301e = 0;
        this.f26302f = -1;
        this.f26303g = -1;
        this.f26304h = 1;
        this.f26305i = -1;
        V4.k.b(Boolean.valueOf(a.r(aVar)));
        this.f26297a = aVar.clone();
        this.f26298b = null;
    }

    public static boolean F(k kVar) {
        return kVar != null && kVar.z();
    }

    private void K() {
        if (this.f26302f < 0 || this.f26303g < 0) {
            G();
        }
    }

    private e L() throws Throwable {
        InputStream inputStreamK;
        try {
            inputStreamK = k();
            try {
                e eVarE = p222m6.c.e(inputStreamK);
                this.f26307k = eVarE.a();
                Pair pairB = eVarE.b();
                if (pairB != null) {
                    this.f26302f = ((Integer) pairB.getFirst()).intValue();
                    this.f26303g = ((Integer) pairB.getSecond()).intValue();
                }
                if (inputStreamK != null) {
                    try {
                        inputStreamK.close();
                    } catch (IOException unused) {
                    }
                }
                return eVarE;
            } catch (Throwable th) {
                th = th;
                if (inputStreamK != null) {
                    try {
                        inputStreamK.close();
                    } catch (IOException unused2) {
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStreamK = null;
        }
    }

    private Pair O() {
        InputStream inputStreamK = k();
        if (inputStreamK == null) {
            return null;
        }
        Pair pairF = i.f(inputStreamK);
        if (pairF != null) {
            this.f26302f = ((Integer) pairF.getFirst()).intValue();
            this.f26303g = ((Integer) pairF.getSecond()).intValue();
        }
        return pairF;
    }

    public static k b(k kVar) {
        if (kVar != null) {
            return kVar.a();
        }
        return null;
    }

    public static void c(k kVar) {
        if (kVar != null) {
            kVar.close();
        }
    }

    private void t() {
        c cVarD = N5.e.d(k());
        this.f26299c = cVarD;
        Pair pairO = N5.b.b(cVarD) ? O() : L().b();
        if (cVarD == N5.b.f7872b && this.f26300d == -1) {
            if (pairO != null) {
                int iB = f.b(k());
                this.f26301e = iB;
                this.f26300d = f.a(iB);
                return;
            }
            return;
        }
        if (cVarD == N5.b.f7882l && this.f26300d == -1) {
            int iA = d.a(k());
            this.f26301e = iA;
            this.f26300d = f.a(iA);
        } else if (this.f26300d == -1) {
            this.f26300d = 0;
        }
    }

    public static boolean x(k kVar) {
        return kVar.f26300d >= 0 && kVar.f26302f >= 0 && kVar.f26303g >= 0;
    }

    public int A2() {
        K();
        return this.f26300d;
    }

    public void G() {
        if (!f26296n) {
            t();
        } else {
            if (this.f26309m) {
                return;
            }
            t();
            this.f26309m = true;
        }
    }

    public void P(b bVar) {
        this.f26306j = bVar;
    }

    public void S(int i10) {
        this.f26301e = i10;
    }

    public void U(int i10) {
        this.f26303g = i10;
    }

    public void V(c cVar) {
        this.f26299c = cVar;
    }

    public void Z(int i10) {
        this.f26300d = i10;
    }

    public k a() {
        k kVar;
        n nVar = this.f26298b;
        if (nVar != null) {
            kVar = new k(nVar, this.f26305i);
        } else {
            a aVarE = a.e(this.f26297a);
            if (aVarE == null) {
                kVar = null;
            } else {
                try {
                    kVar = new k(aVarE);
                } catch (Throwable th) {
                    a.g(aVarE);
                    throw th;
                }
            }
            a.g(aVarE);
        }
        if (kVar != null) {
            kVar.d(this);
        }
        return kVar;
    }

    public void b0(int i10) {
        this.f26304h = i10;
    }

    public void c0(String str) {
        this.f26308l = str;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        a.g(this.f26297a);
    }

    public void d(k kVar) {
        this.f26299c = kVar.i();
        this.f26302f = kVar.getWidth();
        this.f26303g = kVar.getHeight();
        this.f26300d = kVar.A2();
        this.f26301e = kVar.f2();
        this.f26304h = kVar.o();
        this.f26305i = kVar.p();
        this.f26306j = kVar.f();
        this.f26307k = kVar.g();
        this.f26309m = kVar.s();
    }

    public a e() {
        return a.e(this.f26297a);
    }

    public void e0(int i10) {
        this.f26302f = i10;
    }

    public b f() {
        return this.f26306j;
    }

    public int f2() {
        K();
        return this.f26301e;
    }

    public ColorSpace g() {
        K();
        return this.f26307k;
    }

    public int getHeight() {
        K();
        return this.f26303g;
    }

    public int getWidth() {
        K();
        return this.f26302f;
    }

    public String h(int i10) {
        a aVarE = e();
        if (aVarE == null) {
            return "";
        }
        int iMin = Math.min(p(), i10);
        byte[] bArr = new byte[iMin];
        try {
            h hVar = (h) aVarE.m();
            if (hVar == null) {
                aVarE.close();
                return "";
            }
            hVar.D(0, bArr, 0, iMin);
            aVarE.close();
            StringBuilder sb2 = new StringBuilder(iMin * 2);
            for (int i11 = 0; i11 < iMin; i11++) {
                sb2.append(String.format("%02X", Byte.valueOf(bArr[i11])));
            }
            return sb2.toString();
        } catch (Throwable th) {
            aVarE.close();
            throw th;
        }
    }

    public c i() {
        K();
        return this.f26299c;
    }

    public InputStream k() {
        n nVar = this.f26298b;
        if (nVar != null) {
            return (InputStream) nVar.get();
        }
        a aVarE = a.e(this.f26297a);
        if (aVarE == null) {
            return null;
        }
        try {
            return new j((h) aVarE.m());
        } finally {
            a.g(aVarE);
        }
    }

    public InputStream m() {
        return (InputStream) V4.k.g(k());
    }

    public int o() {
        return this.f26304h;
    }

    public int p() {
        a aVar = this.f26297a;
        return (aVar == null || aVar.m() == null) ? this.f26305i : ((h) this.f26297a.m()).size();
    }

    public String r() {
        return this.f26308l;
    }

    protected boolean s() {
        return this.f26309m;
    }

    public boolean u(int i10) {
        c cVar = this.f26299c;
        if ((cVar != N5.b.f7872b && cVar != N5.b.f7883m) || this.f26298b != null) {
            return true;
        }
        V4.k.g(this.f26297a);
        h hVar = (h) this.f26297a.m();
        return i10 >= 2 && hVar.R(i10 + (-2)) == -1 && hVar.R(i10 - 1) == -39;
    }

    public synchronized boolean z() {
        return a.r(this.f26297a) || this.f26298b != null;
    }
}
