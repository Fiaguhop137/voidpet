package p119ga;

import java.math.BigInteger;
import java.util.Objects;
import p155ia.g;

/* JADX INFO: loaded from: classes2.dex */
public final class k extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f42283a;

    public k(Boolean bool) {
        Objects.requireNonNull(bool);
        this.f42283a = bool;
    }

    public k(Number number) {
        Objects.requireNonNull(number);
        this.f42283a = number;
    }

    public k(String str) {
        Objects.requireNonNull(str);
        this.f42283a = str;
    }

    private static boolean p(k kVar) {
        Object obj = kVar.f42283a;
        if (!(obj instanceof Number)) {
            return false;
        }
        Number number = (Number) obj;
        return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k.class != obj.getClass()) {
            return false;
        }
        k kVar = (k) obj;
        if (this.f42283a == null) {
            return kVar.f42283a == null;
        }
        if (p(this) && p(kVar)) {
            return l().longValue() == kVar.l().longValue();
        }
        Object obj2 = this.f42283a;
        if (!(obj2 instanceof Number) || !(kVar.f42283a instanceof Number)) {
            return obj2.equals(kVar.f42283a);
        }
        double dDoubleValue = l().doubleValue();
        double dDoubleValue2 = kVar.l().doubleValue();
        return dDoubleValue == dDoubleValue2 || (Double.isNaN(dDoubleValue) && Double.isNaN(dDoubleValue2));
    }

    public int hashCode() {
        long jDoubleToLongBits;
        if (this.f42283a == null) {
            return 31;
        }
        if (p(this)) {
            jDoubleToLongBits = l().longValue();
        } else {
            Object obj = this.f42283a;
            if (!(obj instanceof Number)) {
                return obj.hashCode();
            }
            jDoubleToLongBits = Double.doubleToLongBits(l().doubleValue());
        }
        return (int) ((jDoubleToLongBits >>> 32) ^ jDoubleToLongBits);
    }

    public boolean k() {
        return o() ? ((Boolean) this.f42283a).booleanValue() : Boolean.parseBoolean(n());
    }

    public Number l() {
        Object obj = this.f42283a;
        if (obj instanceof Number) {
            return (Number) obj;
        }
        if (obj instanceof String) {
            return new g((String) obj);
        }
        throw new UnsupportedOperationException("Primitive is neither a number nor a string");
    }

    public String n() {
        Object obj = this.f42283a;
        if (obj instanceof String) {
            return (String) obj;
        }
        if (q()) {
            return l().toString();
        }
        if (o()) {
            return ((Boolean) this.f42283a).toString();
        }
        throw new AssertionError("Unexpected value type: " + this.f42283a.getClass());
    }

    public boolean o() {
        return this.f42283a instanceof Boolean;
    }

    public boolean q() {
        return this.f42283a instanceof Number;
    }

    public boolean s() {
        return this.f42283a instanceof String;
    }
}
