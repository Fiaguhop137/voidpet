package io.sentry;

/* JADX INFO: loaded from: classes3.dex */
public final class f4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3833z3 f45834a;

    public f4(C3833z3 c3833z3) {
        this.f45834a = (C3833z3) io.sentry.util.w.c(c3833z3, "options are required");
    }

    private boolean b(Double d10, Double d11) {
        return d10.doubleValue() >= d11.doubleValue();
    }

    public g4 a(D1 d10) {
        Double dA = d10.a();
        g4 g4VarL = d10.b().l();
        if (g4VarL != null) {
            return io.sentry.util.A.a(g4VarL);
        }
        this.f45834a.getProfilesSampler();
        Double profilesSampleRate = this.f45834a.getProfilesSampleRate();
        Boolean boolValueOf = Boolean.valueOf(profilesSampleRate != null && b(profilesSampleRate, dA));
        this.f45834a.getTracesSampler();
        g4 g4VarZ = d10.b().z();
        if (g4VarZ != null) {
            return io.sentry.util.A.a(g4VarZ);
        }
        Double tracesSampleRate = this.f45834a.getTracesSampleRate();
        Double dValueOf = tracesSampleRate == null ? null : Double.valueOf(tracesSampleRate.doubleValue() / Math.pow(2.0d, this.f45834a.getBackpressureMonitor().a()));
        if (dValueOf != null) {
            return new g4(Boolean.valueOf(b(dValueOf, dA)), dValueOf, dA, boolValueOf, profilesSampleRate);
        }
        Boolean bool = Boolean.FALSE;
        return new g4(bool, null, dA, bool, null);
    }

    public boolean c(double d10) {
        Double profileSessionSampleRate = this.f45834a.getProfileSessionSampleRate();
        return profileSessionSampleRate != null && b(profileSessionSampleRate, Double.valueOf(d10));
    }
}
