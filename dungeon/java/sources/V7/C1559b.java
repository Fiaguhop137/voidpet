package V7;

/* JADX INFO: renamed from: V7.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C1559b extends AbstractC1568k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f14196a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final N7.o f14197b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final N7.i f14198c;

    C1559b(long j10, N7.o oVar, N7.i iVar) {
        this.f14196a = j10;
        if (oVar == null) {
            throw new NullPointerException("Null transportContext");
        }
        this.f14197b = oVar;
        if (iVar == null) {
            throw new NullPointerException("Null event");
        }
        this.f14198c = iVar;
    }

    @Override // V7.AbstractC1568k
    public N7.i b() {
        return this.f14198c;
    }

    @Override // V7.AbstractC1568k
    public long c() {
        return this.f14196a;
    }

    @Override // V7.AbstractC1568k
    public N7.o d() {
        return this.f14197b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC1568k) {
            AbstractC1568k abstractC1568k = (AbstractC1568k) obj;
            if (this.f14196a == abstractC1568k.c() && this.f14197b.equals(abstractC1568k.d()) && this.f14198c.equals(abstractC1568k.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j10 = this.f14196a;
        return ((((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f14197b.hashCode()) * 1000003) ^ this.f14198c.hashCode();
    }

    public String toString() {
        return "PersistedEvent{id=" + this.f14196a + ", transportContext=" + this.f14197b + ", event=" + this.f14198c + "}";
    }
}
