package io.sentry;

import java.util.Date;

/* JADX INFO: renamed from: io.sentry.r3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3776r3 extends AbstractC3750o2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Date f46347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f46348b;

    public C3776r3() {
        this(AbstractC3732l.d(), System.nanoTime());
    }

    public C3776r3(Date date, long j10) {
        this.f46347a = date;
        this.f46348b = j10;
    }

    private long r(C3776r3 c3776r3, C3776r3 c3776r4) {
        return c3776r3.p() + (c3776r4.f46348b - c3776r3.f46348b);
    }

    @Override // io.sentry.AbstractC3750o2, java.lang.Comparable
    /* JADX INFO: renamed from: e */
    public int compareTo(AbstractC3750o2 abstractC3750o2) {
        if (!(abstractC3750o2 instanceof C3776r3)) {
            return super.compareTo(abstractC3750o2);
        }
        C3776r3 c3776r3 = (C3776r3) abstractC3750o2;
        long time = this.f46347a.getTime();
        long time2 = c3776r3.f46347a.getTime();
        return time == time2 ? Long.valueOf(this.f46348b).compareTo(Long.valueOf(c3776r3.f46348b)) : Long.valueOf(time).compareTo(Long.valueOf(time2));
    }

    @Override // io.sentry.AbstractC3750o2
    public long g(AbstractC3750o2 abstractC3750o2) {
        return abstractC3750o2 instanceof C3776r3 ? this.f46348b - ((C3776r3) abstractC3750o2).f46348b : super.g(abstractC3750o2);
    }

    @Override // io.sentry.AbstractC3750o2
    public long o(AbstractC3750o2 abstractC3750o2) {
        if (abstractC3750o2 == null || !(abstractC3750o2 instanceof C3776r3)) {
            return super.o(abstractC3750o2);
        }
        C3776r3 c3776r3 = (C3776r3) abstractC3750o2;
        return compareTo(abstractC3750o2) < 0 ? r(this, c3776r3) : r(c3776r3, this);
    }

    @Override // io.sentry.AbstractC3750o2
    public long p() {
        return AbstractC3732l.a(this.f46347a);
    }
}
