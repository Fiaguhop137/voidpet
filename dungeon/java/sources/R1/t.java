package R1;

import U1.S;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class t {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f10333c = S.z0(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f10334d = S.z0(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10335a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f10336b;

    public t(String str, String str2) {
        this.f10335a = S.P0(str);
        this.f10336b = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            t tVar = (t) obj;
            if (Objects.equals(this.f10335a, tVar.f10335a) && Objects.equals(this.f10336b, tVar.f10336b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = this.f10336b.hashCode() * 31;
        String str = this.f10335a;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
