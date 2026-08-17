package p050cd;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public class f implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f27440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final k f27441b;

    private f(long j10, k kVar) {
        if (j10 < -999999999999999L || j10 > 999999999999999L) {
            throw new IllegalArgumentException("value must be in the range from -999999999999999 to 999999999999999");
        }
        this.f27440a = j10;
        Objects.requireNonNull(kVar, "params must not be null");
        this.f27441b = kVar;
    }

    public static f e(long j10) {
        return new f(j10, k.f27443b);
    }

    @Override // p050cd.l
    public k b() {
        return this.f27441b;
    }

    @Override // p050cd.q
    public StringBuilder c(StringBuilder sb2) {
        sb2.append(Long.toString(this.f27440a));
        this.f27441b.q(sb2);
        return sb2;
    }

    @Override // p199l1.j
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Long get() {
        return Long.valueOf(this.f27440a);
    }

    @Override // p050cd.g
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public f a(k kVar) {
        Objects.requireNonNull(kVar, "params must not be null");
        return kVar.isEmpty() ? this : new f(this.f27440a, kVar);
    }
}
