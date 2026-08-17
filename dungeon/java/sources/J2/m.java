package J2;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class m extends i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f5724b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f5725c;

    public m(String str, byte[] bArr) {
        super("PRIV");
        this.f5724b = str;
        this.f5725c = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m.class == obj.getClass()) {
            m mVar = (m) obj;
            if (Objects.equals(this.f5724b, mVar.f5724b) && Arrays.equals(this.f5725c, mVar.f5725c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f5724b;
        return ((527 + (str != null ? str.hashCode() : 0)) * 31) + Arrays.hashCode(this.f5725c);
    }

    @Override // J2.i
    public String toString() {
        return this.f5714a + ": owner=" + this.f5724b;
    }
}
