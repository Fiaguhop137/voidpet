package io.sentry;

/* JADX INFO: loaded from: classes3.dex */
public final class g4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Boolean f45860a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Double f45861b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Double f45862c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Boolean f45863d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Double f45864e;

    public g4(Boolean bool) {
        this(bool, null);
    }

    public g4(Boolean bool, Double d10) {
        this(bool, d10, null, Boolean.FALSE, null);
    }

    public g4(Boolean bool, Double d10, Boolean bool2, Double d11) {
        this(bool, d10, null, bool2, d11);
    }

    public g4(Boolean bool, Double d10, Double d11) {
        this(bool, d10, d11, Boolean.FALSE, null);
    }

    public g4(Boolean bool, Double d10, Double d11, Boolean bool2, Double d12) {
        this.f45860a = bool;
        this.f45861b = d10;
        this.f45862c = d11;
        this.f45863d = Boolean.valueOf(bool.booleanValue() && bool2.booleanValue());
        this.f45864e = d12;
    }

    public Double a() {
        return this.f45864e;
    }

    public Boolean b() {
        return this.f45863d;
    }

    public Double c() {
        return this.f45862c;
    }

    public Double d() {
        return this.f45861b;
    }

    public Boolean e() {
        return this.f45860a;
    }
}
