package I2;

import R1.w;
import R1.x;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class c implements x.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f4916a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f4917b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f4918c;

    public c(byte[] bArr, String str, String str2) {
        this.f4916a = bArr;
        this.f4917b = str;
        this.f4918c = str2;
    }

    @Override // R1.x.a
    public void b(w.b bVar) {
        String str = this.f4917b;
        if (str != null) {
            bVar.p0(str);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f4916a, ((c) obj).f4916a);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f4916a);
    }

    public String toString() {
        return String.format("ICY: title=\"%s\", url=\"%s\", rawMetadata.length=\"%s\"", this.f4917b, this.f4918c, Integer.valueOf(this.f4916a.length));
    }
}
