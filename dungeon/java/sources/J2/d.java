package J2;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class d extends i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f5697b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f5698c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f5699d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String[] f5700e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final i[] f5701f;

    public d(String str, boolean z10, boolean z11, String[] strArr, i[] iVarArr) {
        super("CTOC");
        this.f5697b = str;
        this.f5698c = z10;
        this.f5699d = z11;
        this.f5700e = strArr;
        this.f5701f = iVarArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (this.f5698c == dVar.f5698c && this.f5699d == dVar.f5699d && Objects.equals(this.f5697b, dVar.f5697b) && Arrays.equals(this.f5700e, dVar.f5700e) && Arrays.equals(this.f5701f, dVar.f5701f)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i10 = (((527 + (this.f5698c ? 1 : 0)) * 31) + (this.f5699d ? 1 : 0)) * 31;
        String str = this.f5697b;
        return i10 + (str != null ? str.hashCode() : 0);
    }
}
