package J2;

import R1.w;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class a extends i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f5686b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f5687c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f5688d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f5689e;

    public a(String str, String str2, int i10, byte[] bArr) {
        super("APIC");
        this.f5686b = str;
        this.f5687c = str2;
        this.f5688d = i10;
        this.f5689e = bArr;
    }

    @Override // R1.x.a
    public void b(w.b bVar) {
        bVar.K(this.f5689e, this.f5688d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f5688d == aVar.f5688d && Objects.equals(this.f5686b, aVar.f5686b) && Objects.equals(this.f5687c, aVar.f5687c) && Arrays.equals(this.f5689e, aVar.f5689e)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i10 = (527 + this.f5688d) * 31;
        String str = this.f5686b;
        int iHashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f5687c;
        return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + Arrays.hashCode(this.f5689e);
    }

    @Override // J2.i
    public String toString() {
        return this.f5714a + ": mimeType=" + this.f5686b + ", description=" + this.f5687c;
    }
}
