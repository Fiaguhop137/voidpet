package io.sentry;

import java.time.Instant;

/* JADX INFO: renamed from: io.sentry.e3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3701e3 extends AbstractC3750o2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Instant f45807a;

    public C3701e3() {
        this(Instant.now());
    }

    public C3701e3(Instant instant) {
        this.f45807a = instant;
    }

    @Override // io.sentry.AbstractC3750o2
    public long p() {
        return AbstractC3732l.n(this.f45807a.getEpochSecond()) + ((long) this.f45807a.getNano());
    }
}
