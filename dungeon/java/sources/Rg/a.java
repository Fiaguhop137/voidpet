package Rg;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends p017ag.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f11266b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private byte[] f11267c;

    public a(int i10, byte[] bArr) {
        super(true);
        if (bArr.length != c.a(i10)) {
            throw new IllegalArgumentException("invalid key size for security category");
        }
        this.f11266b = i10;
        this.f11267c = Ug.a.e(bArr);
    }

    public byte[] b() {
        return Ug.a.e(this.f11267c);
    }

    public int c() {
        return this.f11266b;
    }
}
