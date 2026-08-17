package io.sentry;

/* JADX INFO: renamed from: io.sentry.o2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3750o2 implements Comparable {
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public int compareTo(AbstractC3750o2 abstractC3750o2) {
        return Long.valueOf(p()).compareTo(Long.valueOf(abstractC3750o2.p()));
    }

    public long g(AbstractC3750o2 abstractC3750o2) {
        return p() - abstractC3750o2.p();
    }

    public final boolean h(AbstractC3750o2 abstractC3750o2) {
        return g(abstractC3750o2) > 0;
    }

    public final boolean i(AbstractC3750o2 abstractC3750o2) {
        return g(abstractC3750o2) < 0;
    }

    public long o(AbstractC3750o2 abstractC3750o2) {
        return (abstractC3750o2 == null || compareTo(abstractC3750o2) >= 0) ? p() : abstractC3750o2.p();
    }

    public abstract long p();
}
