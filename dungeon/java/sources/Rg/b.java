package Rg;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends p017ag.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f11268b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private byte[] f11269c;

    public b(int i10, byte[] bArr) {
        super(false);
        if (bArr.length != c.b(i10)) {
            throw new IllegalArgumentException("invalid key size for security category");
        }
        this.f11268b = i10;
        this.f11269c = Ug.a.e(bArr);
    }

    public byte[] b() {
        return Ug.a.e(this.f11269c);
    }

    public int c() {
        return this.f11268b;
    }
}
