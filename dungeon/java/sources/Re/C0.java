package Re;

/* JADX INFO: loaded from: classes3.dex */
public abstract class C0 implements B0 {
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof B0)) {
            return false;
        }
        B0 b10 = (B0) obj;
        return a() == b10.a() && b() == b10.b() && getType().equals(b10.getType());
    }

    public int hashCode() {
        int iHashCode = b().hashCode();
        if (J0.w(getType())) {
            return (iHashCode * 31) + 19;
        }
        return (iHashCode * 31) + (a() ? 17 : getType().hashCode());
    }

    public String toString() {
        if (a()) {
            return "*";
        }
        if (b() == N0.INVARIANT) {
            return getType().toString();
        }
        return b() + " " + getType();
    }
}
