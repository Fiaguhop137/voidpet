package H2;

import R1.w;
import R1.x;
import R1.y;
import U1.F;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class a implements x.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4141a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f4142b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f4143c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f4144d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f4145e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f4146f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f4147g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final byte[] f4148h;

    public a(int i10, String str, String str2, int i11, int i12, int i13, int i14, byte[] bArr) {
        this.f4141a = i10;
        this.f4142b = str;
        this.f4143c = str2;
        this.f4144d = i11;
        this.f4145e = i12;
        this.f4146f = i13;
        this.f4147g = i14;
        this.f4148h = bArr;
    }

    public static a d(F f10) {
        int iU = f10.u();
        String strU = y.u(f10.J(f10.u(), StandardCharsets.US_ASCII));
        String strI = f10.I(f10.u());
        int iU2 = f10.u();
        int iU3 = f10.u();
        int iU4 = f10.u();
        int iU5 = f10.u();
        int iU6 = f10.u();
        byte[] bArr = new byte[iU6];
        f10.q(bArr, 0, iU6);
        return new a(iU, strU, strI, iU2, iU3, iU4, iU5, bArr);
    }

    @Override // R1.x.a
    public void b(w.b bVar) {
        bVar.K(this.f4148h, this.f4141a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f4141a == aVar.f4141a && this.f4142b.equals(aVar.f4142b) && this.f4143c.equals(aVar.f4143c) && this.f4144d == aVar.f4144d && this.f4145e == aVar.f4145e && this.f4146f == aVar.f4146f && this.f4147g == aVar.f4147g && Arrays.equals(this.f4148h, aVar.f4148h)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((((((((((527 + this.f4141a) * 31) + this.f4142b.hashCode()) * 31) + this.f4143c.hashCode()) * 31) + this.f4144d) * 31) + this.f4145e) * 31) + this.f4146f) * 31) + this.f4147g) * 31) + Arrays.hashCode(this.f4148h);
    }

    public String toString() {
        return "Picture: mimeType=" + this.f4142b + ", description=" + this.f4143c;
    }
}
