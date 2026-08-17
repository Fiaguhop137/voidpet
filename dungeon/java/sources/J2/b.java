package J2;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class b extends i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f5690b;

    public b(String str, byte[] bArr) {
        super(str);
        this.f5690b = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f5714a.equals(bVar.f5714a) && Arrays.equals(this.f5690b, bVar.f5690b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((527 + this.f5714a.hashCode()) * 31) + Arrays.hashCode(this.f5690b);
    }
}
