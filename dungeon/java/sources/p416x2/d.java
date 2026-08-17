package p416x2;

import U1.AbstractC1477t;
import U1.F;
import U1.S;

/* JADX INFO: loaded from: classes.dex */
final class d implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f57332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f57333b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f57334c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f57335d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f57336e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f57337f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f57338g;

    private d(int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        this.f57332a = i10;
        this.f57333b = i11;
        this.f57334c = i12;
        this.f57335d = i13;
        this.f57336e = i14;
        this.f57337f = i15;
        this.f57338g = i16;
    }

    public static d c(F f10) {
        int iY = f10.y();
        f10.b0(12);
        int iY2 = f10.y();
        int iY3 = f10.y();
        int iY4 = f10.y();
        f10.b0(4);
        int iY5 = f10.y();
        int iY6 = f10.y();
        f10.b0(4);
        return new d(iY, iY2, iY3, iY4, iY5, iY6, f10.y());
    }

    public long a() {
        return S.a1(this.f57336e, ((long) this.f57334c) * 1000000, this.f57335d);
    }

    public int b() {
        int i10 = this.f57332a;
        if (i10 == 1935960438) {
            return 2;
        }
        if (i10 == 1935963489) {
            return 1;
        }
        if (i10 == 1937012852) {
            return 3;
        }
        AbstractC1477t.h("AviStreamHeaderChunk", "Found unsupported streamType fourCC: " + Integer.toHexString(this.f57332a));
        return -1;
    }

    @Override // p416x2.a
    public int getType() {
        return 1752331379;
    }
}
