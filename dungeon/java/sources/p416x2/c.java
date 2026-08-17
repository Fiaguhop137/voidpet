package p416x2;

import U1.F;

/* JADX INFO: loaded from: classes.dex */
final class c implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f57328a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f57329b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f57330c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f57331d;

    private c(int i10, int i11, int i12, int i13) {
        this.f57328a = i10;
        this.f57329b = i11;
        this.f57330c = i12;
        this.f57331d = i13;
    }

    public static c b(F f10) {
        int iY = f10.y();
        f10.b0(8);
        int iY2 = f10.y();
        int iY3 = f10.y();
        f10.b0(4);
        int iY4 = f10.y();
        f10.b0(12);
        return new c(iY, iY2, iY3, iY4);
    }

    public boolean a() {
        return (this.f57329b & 16) == 16;
    }

    @Override // p416x2.a
    public int getType() {
        return 1751742049;
    }
}
