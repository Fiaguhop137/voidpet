package p380v2;

import R1.r;
import R1.x;
import U1.E;
import U1.S;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f56150a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f56151b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f56152c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f56153d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f56154e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f56155f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f56156g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f56157h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f56158i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f56159j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final a f56160k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final x f56161l;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long[] f56162a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long[] f56163b;

        public a(long[] jArr, long[] jArr2) {
            this.f56162a = jArr;
            this.f56163b = jArr2;
        }
    }

    private y(int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, a aVar, x xVar) {
        this.f56150a = i10;
        this.f56151b = i11;
        this.f56152c = i12;
        this.f56153d = i13;
        this.f56154e = i14;
        this.f56155f = j(i14);
        this.f56156g = i15;
        this.f56157h = i16;
        this.f56158i = e(i16);
        this.f56159j = j10;
        this.f56160k = aVar;
        this.f56161l = xVar;
    }

    public y(byte[] bArr, int i10) {
        E e10 = new E(bArr);
        e10.p(i10 * 8);
        this.f56150a = e10.h(16);
        this.f56151b = e10.h(16);
        this.f56152c = e10.h(24);
        this.f56153d = e10.h(24);
        int iH = e10.h(20);
        this.f56154e = iH;
        this.f56155f = j(iH);
        this.f56156g = e10.h(3) + 1;
        int iH2 = e10.h(5) + 1;
        this.f56157h = iH2;
        this.f56158i = e(iH2);
        this.f56159j = e10.j(36);
        this.f56160k = null;
        this.f56161l = null;
    }

    private static int e(int i10) {
        if (i10 == 8) {
            return 1;
        }
        if (i10 == 12) {
            return 2;
        }
        if (i10 == 16) {
            return 4;
        }
        if (i10 == 20) {
            return 5;
        }
        if (i10 != 24) {
            return i10 != 32 ? -1 : 7;
        }
        return 6;
    }

    private static int j(int i10) {
        switch (i10) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public y a(List list) {
        return new y(this.f56150a, this.f56151b, this.f56152c, this.f56153d, this.f56154e, this.f56156g, this.f56157h, this.f56159j, this.f56160k, h(new x(list)));
    }

    public y b(a aVar) {
        return new y(this.f56150a, this.f56151b, this.f56152c, this.f56153d, this.f56154e, this.f56156g, this.f56157h, this.f56159j, aVar, this.f56161l);
    }

    public y c(List list) {
        return new y(this.f56150a, this.f56151b, this.f56152c, this.f56153d, this.f56154e, this.f56156g, this.f56157h, this.f56159j, this.f56160k, h(S.d(list)));
    }

    public long d() {
        long j10;
        long j11;
        int i10 = this.f56153d;
        if (i10 > 0) {
            j10 = (((long) i10) + ((long) this.f56152c)) / 2;
            j11 = 1;
        } else {
            int i11 = this.f56150a;
            j10 = ((((i11 != this.f56151b || i11 <= 0) ? 4096L : i11) * ((long) this.f56156g)) * ((long) this.f56157h)) / 8;
            j11 = 64;
        }
        return j10 + j11;
    }

    public long f() {
        long j10 = this.f56159j;
        if (j10 == 0) {
            return -9223372036854775807L;
        }
        return (j10 * 1000000) / ((long) this.f56154e);
    }

    public r g(byte[] bArr, x xVar) {
        bArr[4] = -128;
        int i10 = this.f56153d;
        if (i10 <= 0) {
            i10 = -1;
        }
        return new r.b().y0("audio/flac").o0(i10).T(this.f56156g).z0(this.f56154e).s0(S.i0(this.f56157h)).k0(Collections.singletonList(bArr)).r0(h(xVar)).P();
    }

    public x h(x xVar) {
        x xVar2 = this.f56161l;
        return xVar2 == null ? xVar : xVar2.b(xVar);
    }

    public long i(long j10) {
        return S.p((j10 * ((long) this.f56154e)) / 1000000, 0L, this.f56159j - 1);
    }
}
