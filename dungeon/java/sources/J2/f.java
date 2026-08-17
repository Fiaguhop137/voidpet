package J2;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class f extends i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f5705b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f5706c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f5707d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f5708e;

    public f(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.f5705b = str;
        this.f5706c = str2;
        this.f5707d = str3;
        this.f5708e = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            f fVar = (f) obj;
            if (Objects.equals(this.f5705b, fVar.f5705b) && Objects.equals(this.f5706c, fVar.f5706c) && Objects.equals(this.f5707d, fVar.f5707d) && Arrays.equals(this.f5708e, fVar.f5708e)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f5705b;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f5706c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f5707d;
        return ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + Arrays.hashCode(this.f5708e);
    }

    @Override // J2.i
    public String toString() {
        return this.f5714a + ": mimeType=" + this.f5705b + ", filename=" + this.f5706c + ", description=" + this.f5707d;
    }
}
