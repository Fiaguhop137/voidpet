package p040c3;

import U1.F;
import U1.K;
import U1.S;
import p380v2.r;

/* JADX INFO: loaded from: classes.dex */
public final class E implements L {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final D f26793a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final F f26794b = new F(32);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f26795c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f26796d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f26797e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f26798f;

    public E(D d10) {
        this.f26793a = d10;
    }

    @Override // p040c3.L
    public void a() {
        this.f26798f = true;
    }

    @Override // p040c3.L
    public void b(K k10, r rVar, L.d dVar) {
        this.f26793a.b(k10, rVar, dVar);
        this.f26798f = true;
    }

    @Override // p040c3.L
    public void c(F f10, int i10) {
        int iG;
        boolean z10 = (i10 & 1) != 0;
        if (z10) {
            iG = f10.g() + f10.L();
        } else {
            iG = -1;
        }
        if (this.f26798f) {
            if (!z10) {
                return;
            }
            this.f26798f = false;
            f10.a0(iG);
            this.f26796d = 0;
        }
        while (f10.a() > 0) {
            int i11 = this.f26796d;
            if (i11 < 3) {
                if (i11 == 0) {
                    int iL = f10.L();
                    f10.a0(f10.g() - 1);
                    if (iL == 255) {
                        this.f26798f = true;
                        return;
                    }
                }
                int iMin = Math.min(f10.a(), 3 - this.f26796d);
                f10.q(this.f26794b.f(), this.f26796d, iMin);
                int i12 = this.f26796d + iMin;
                this.f26796d = i12;
                if (i12 == 3) {
                    this.f26794b.a0(0);
                    this.f26794b.Z(3);
                    this.f26794b.b0(1);
                    int iL2 = this.f26794b.L();
                    int iL3 = this.f26794b.L();
                    this.f26797e = (iL2 & 128) != 0;
                    this.f26795c = (((iL2 & 15) << 8) | iL3) + 3;
                    int iB = this.f26794b.b();
                    int i13 = this.f26795c;
                    if (iB < i13) {
                        this.f26794b.d(Math.min(4098, Math.max(i13, this.f26794b.b() * 2)));
                    }
                }
            } else {
                int iMin2 = Math.min(f10.a(), this.f26795c - this.f26796d);
                f10.q(this.f26794b.f(), this.f26796d, iMin2);
                int i14 = this.f26796d + iMin2;
                this.f26796d = i14;
                int i15 = this.f26795c;
                if (i14 != i15) {
                    continue;
                } else {
                    if (!this.f26797e) {
                        this.f26794b.Z(i15);
                    } else {
                        if (S.w(this.f26794b.f(), 0, this.f26795c, -1) != 0) {
                            this.f26798f = true;
                            return;
                        }
                        this.f26794b.Z(this.f26795c - 4);
                    }
                    this.f26794b.a0(0);
                    this.f26793a.c(this.f26794b);
                    this.f26796d = 0;
                }
            }
        }
    }
}
