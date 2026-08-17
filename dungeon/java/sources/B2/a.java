package B2;

import R1.r;
import U1.F;
import java.util.Collections;
import p380v2.AbstractC4238a;
import p380v2.O;

/* JADX INFO: loaded from: classes.dex */
final class a extends e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int[] f528e = {5512, 11025, 22050, 44100};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f529b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f530c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f531d;

    public a(O o10) {
        super(o10);
    }

    @Override // B2.e
    protected boolean b(F f10) throws e.a {
        if (this.f529b) {
            f10.b0(1);
        } else {
            int iL = f10.L();
            int i10 = (iL >> 4) & 15;
            this.f531d = i10;
            if (i10 == 2) {
                this.f552a.b(new r.b().W("video/x-flv").y0("audio/mpeg").T(1).z0(f528e[(iL >> 2) & 3]).P());
                this.f530c = true;
            } else if (i10 == 7 || i10 == 8) {
                this.f552a.b(new r.b().W("video/x-flv").y0(i10 == 7 ? "audio/g711-alaw" : "audio/g711-mlaw").T(1).z0(8000).P());
                this.f530c = true;
            } else if (i10 != 10) {
                throw new e.a("Audio format not supported: " + this.f531d);
            }
            this.f529b = true;
        }
        return true;
    }

    @Override // B2.e
    protected boolean c(F f10, long j10) {
        if (this.f531d == 2) {
            int iA = f10.a();
            this.f552a.f(f10, iA);
            this.f552a.c(j10, 1, iA, 0, null);
            return true;
        }
        int iL = f10.L();
        if (iL != 0 || this.f530c) {
            if (this.f531d == 10 && iL != 1) {
                return false;
            }
            int iA2 = f10.a();
            this.f552a.f(f10, iA2);
            this.f552a.c(j10, 1, iA2, 0, null);
            return true;
        }
        int iA3 = f10.a();
        byte[] bArr = new byte[iA3];
        f10.q(bArr, 0, iA3);
        AbstractC4238a.b bVarF = AbstractC4238a.f(bArr);
        this.f552a.b(new r.b().W("video/x-flv").y0("audio/mp4a-latm").U(bVarF.f56022c).T(bVarF.f56021b).z0(bVarF.f56020a).k0(Collections.singletonList(bArr)).P());
        this.f530c = true;
        return false;
    }
}
