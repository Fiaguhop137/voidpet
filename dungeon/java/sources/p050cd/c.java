package p050cd;

import java.math.BigDecimal;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public class c implements i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final BigDecimal f27434c = new BigDecimal(1000);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f27435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final k f27436b;

    private c(long j10, k kVar) {
        if (j10 < -999999999999999L || j10 > 999999999999999L) {
            throw new IllegalArgumentException("value must be in the range from -999999999999999 to 999999999999999");
        }
        this.f27435a = j10;
        Objects.requireNonNull(kVar, "params must not be null");
        this.f27436b = kVar;
    }

    public static c e(long j10) {
        return new c(j10, k.f27443b);
    }

    public static c f(BigDecimal bigDecimal) {
        Objects.requireNonNull(bigDecimal, "value must not be null");
        return e(bigDecimal.multiply(f27434c).longValue());
    }

    @Override // p050cd.l
    public k b() {
        return this.f27436b;
    }

    @Override // p050cd.q
    public StringBuilder c(StringBuilder sb2) {
        long j10 = this.f27435a;
        String str = j10 < 0 ? "-" : "";
        long jAbs = Math.abs(j10);
        long j11 = jAbs / 1000;
        long j12 = jAbs % 1000;
        if (j12 % 10 == 0) {
            j12 /= 10;
        }
        if (j12 % 10 == 0) {
            j12 /= 10;
        }
        sb2.append(str);
        sb2.append(Long.toString(j11));
        sb2.append('.');
        sb2.append(Long.toString(j12));
        this.f27436b.q(sb2);
        return sb2;
    }

    @Override // p199l1.j
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public BigDecimal get() {
        return BigDecimal.valueOf(this.f27435a, 3);
    }

    @Override // p050cd.g
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public c a(k kVar) {
        Objects.requireNonNull(kVar, "params must not be null");
        return kVar.isEmpty() ? this : new c(this.f27435a, kVar);
    }
}
