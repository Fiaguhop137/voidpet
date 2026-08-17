package p155ia;

import java.math.BigDecimal;

/* JADX INFO: loaded from: classes2.dex */
public final class g extends Number {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f43806a;

    public g(String str) {
        this.f43806a = str;
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return Double.parseDouble(this.f43806a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        String str = this.f43806a;
        String str2 = ((g) obj).f43806a;
        return str == str2 || str.equals(str2);
    }

    @Override // java.lang.Number
    public float floatValue() {
        return Float.parseFloat(this.f43806a);
    }

    public int hashCode() {
        return this.f43806a.hashCode();
    }

    @Override // java.lang.Number
    public int intValue() {
        try {
            try {
                return Integer.parseInt(this.f43806a);
            } catch (NumberFormatException unused) {
                return (int) Long.parseLong(this.f43806a);
            }
        } catch (NumberFormatException unused2) {
            return new BigDecimal(this.f43806a).intValue();
        }
    }

    @Override // java.lang.Number
    public long longValue() {
        try {
            return Long.parseLong(this.f43806a);
        } catch (NumberFormatException unused) {
            return new BigDecimal(this.f43806a).longValue();
        }
    }

    public String toString() {
        return this.f43806a;
    }
}
