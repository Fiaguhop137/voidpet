package V2;

import S2.e;
import S2.s;
import U1.F;
import U1.InterfaceC1470l;
import U1.S;
import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.zip.Inflater;

/* JADX INFO: loaded from: classes.dex */
public final class a implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final F f14037a = new F();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final F f14038b = new F();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C0193a f14039c = new C0193a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Inflater f14040d;

    /* JADX INFO: renamed from: V2.a$a, reason: collision with other inner class name */
    private static final class C0193a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final F f14041a = new F();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int[] f14042b = new int[256];

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f14043c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f14044d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f14045e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f14046f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f14047g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f14048h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f14049i;

        /* JADX INFO: Access modifiers changed from: private */
        public void e(F f10, int i10) {
            int iO;
            if (i10 < 4) {
                return;
            }
            f10.b0(3);
            int i11 = i10 - 4;
            if ((f10.L() & 128) != 0) {
                if (i11 < 7 || (iO = f10.O()) < 4) {
                    return;
                }
                this.f14048h = f10.T();
                this.f14049i = f10.T();
                this.f14041a.W(iO - 4);
                i11 = i10 - 11;
            }
            int iG = this.f14041a.g();
            int iJ = this.f14041a.j();
            if (iG >= iJ || i11 <= 0) {
                return;
            }
            int iMin = Math.min(i11, iJ - iG);
            f10.q(this.f14041a.f(), iG, iMin);
            this.f14041a.a0(iG + iMin);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void f(F f10, int i10) {
            if (i10 < 19) {
                return;
            }
            this.f14044d = f10.T();
            this.f14045e = f10.T();
            f10.b0(11);
            this.f14046f = f10.T();
            this.f14047g = f10.T();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void g(F f10, int i10) {
            if (i10 % 5 != 2) {
                return;
            }
            f10.b0(2);
            Arrays.fill(this.f14042b, 0);
            int i11 = i10 / 5;
            for (int i12 = 0; i12 < i11; i12++) {
                int iL = f10.L();
                int iL2 = f10.L();
                int iL3 = f10.L();
                int iL4 = f10.L();
                double d10 = iL2;
                double d11 = iL3 - 128;
                double d12 = iL4 - 128;
                this.f14042b[iL] = (S.o((int) ((d10 - (0.34414d * d12)) - (d11 * 0.71414d)), 0, 255) << 8) | (f10.L() << 24) | (S.o((int) ((1.402d * d11) + d10), 0, 255) << 16) | S.o((int) (d10 + (d12 * 1.772d)), 0, 255);
            }
            this.f14043c = true;
        }

        public T1.a d() {
            int iL;
            if (this.f14044d == 0 || this.f14045e == 0 || this.f14048h == 0 || this.f14049i == 0 || this.f14041a.j() == 0 || this.f14041a.g() != this.f14041a.j() || !this.f14043c) {
                return null;
            }
            this.f14041a.a0(0);
            int i10 = this.f14048h * this.f14049i;
            int[] iArr = new int[i10];
            int i11 = 0;
            while (i11 < i10) {
                int iL2 = this.f14041a.L();
                if (iL2 != 0) {
                    iL = i11 + 1;
                    iArr[i11] = this.f14042b[iL2];
                } else {
                    int iL3 = this.f14041a.L();
                    if (iL3 != 0) {
                        iL = ((iL3 & 64) == 0 ? iL3 & 63 : ((iL3 & 63) << 8) | this.f14041a.L()) + i11;
                        Arrays.fill(iArr, i11, iL, (iL3 & 128) == 0 ? this.f14042b[0] : this.f14042b[this.f14041a.L()]);
                    }
                }
                i11 = iL;
            }
            return new T1.a.b().f(Bitmap.createBitmap(iArr, this.f14048h, this.f14049i, Bitmap.Config.ARGB_8888)).k(this.f14046f / this.f14044d).l(0).h(this.f14047g / this.f14045e, 0).i(0).n(this.f14048h / this.f14044d).g(this.f14049i / this.f14045e).a();
        }

        public void h() {
            this.f14044d = 0;
            this.f14045e = 0;
            this.f14046f = 0;
            this.f14047g = 0;
            this.f14048h = 0;
            this.f14049i = 0;
            this.f14041a.W(0);
            this.f14043c = false;
        }
    }

    private static T1.a d(F f10, C0193a c0193a) {
        int iJ = f10.j();
        int iL = f10.L();
        int iT = f10.T();
        int iG = f10.g() + iT;
        T1.a aVarD = null;
        if (iG > iJ) {
            f10.a0(iJ);
            return null;
        }
        if (iL != 128) {
            switch (iL) {
                case 20:
                    c0193a.g(f10, iT);
                    break;
                case 21:
                    c0193a.e(f10, iT);
                    break;
                case 22:
                    c0193a.f(f10, iT);
                    break;
            }
        } else {
            aVarD = c0193a.d();
            c0193a.h();
        }
        f10.a0(iG);
        return aVarD;
    }

    @Override // S2.s
    public void b(byte[] bArr, int i10, int i11, s.b bVar, InterfaceC1470l interfaceC1470l) {
        this.f14037a.Y(bArr, i11 + i10);
        this.f14037a.a0(i10);
        if (this.f14040d == null) {
            this.f14040d = new Inflater();
        }
        if (S.K0(this.f14037a, this.f14038b, this.f14040d)) {
            this.f14037a.Y(this.f14038b.f(), this.f14038b.j());
        }
        this.f14039c.h();
        ArrayList arrayList = new ArrayList();
        while (this.f14037a.a() >= 3) {
            T1.a aVarD = d(this.f14037a, this.f14039c);
            if (aVarD != null) {
                arrayList.add(aVarD);
            }
        }
        interfaceC1470l.accept(new e(arrayList, -9223372036854775807L, -9223372036854775807L));
    }

    @Override // S2.s
    public int c() {
        return 2;
    }
}
