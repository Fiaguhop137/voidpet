package io.sentry;

/* JADX INFO: renamed from: io.sentry.a3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3622a3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f44553a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f44554b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f44555c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f44556d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f44557e = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f44558f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private CharSequence f44559g = "Report a Bug";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private CharSequence f44560h = "Send Bug Report";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private CharSequence f44561i = "Cancel";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private CharSequence f44562j = "Name";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private CharSequence f44563k = "Your Name";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private CharSequence f44564l = "Email";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private CharSequence f44565m = "your.email@example.org";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private CharSequence f44566n = " (Required)";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private CharSequence f44567o = "Description";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private CharSequence f44568p = "What's the bug? What did you expect?";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private CharSequence f44569q = "Thank you for your report!";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private a f44570r;

    /* JADX INFO: renamed from: io.sentry.a3$a */
    public interface a {
    }

    public C3622a3(a aVar) {
        this.f44570r = aVar;
    }

    public boolean a() {
        return this.f44555c;
    }

    public boolean b() {
        return this.f44553a;
    }

    public boolean c() {
        return this.f44558f;
    }

    public boolean d() {
        return this.f44556d;
    }

    public boolean e() {
        return this.f44554b;
    }

    public boolean f() {
        return this.f44557e;
    }

    public void g(a aVar) {
        this.f44570r = aVar;
    }

    public void h(boolean z10) {
        this.f44555c = z10;
    }

    public void i(boolean z10) {
        this.f44553a = z10;
    }

    public void j(boolean z10) {
        this.f44558f = z10;
    }

    public void k(boolean z10) {
        this.f44556d = z10;
    }

    public void l(boolean z10) {
        this.f44554b = z10;
    }

    public void m(boolean z10) {
        this.f44557e = z10;
    }

    public String toString() {
        return "SentryFeedbackOptions{isNameRequired=" + this.f44553a + ", showName=" + this.f44554b + ", isEmailRequired=" + this.f44555c + ", showEmail=" + this.f44556d + ", useSentryUser=" + this.f44557e + ", showBranding=" + this.f44558f + ", formTitle='" + ((Object) this.f44559g) + "', submitButtonLabel='" + ((Object) this.f44560h) + "', cancelButtonLabel='" + ((Object) this.f44561i) + "', nameLabel='" + ((Object) this.f44562j) + "', namePlaceholder='" + ((Object) this.f44563k) + "', emailLabel='" + ((Object) this.f44564l) + "', emailPlaceholder='" + ((Object) this.f44565m) + "', isRequiredLabel='" + ((Object) this.f44566n) + "', messageLabel='" + ((Object) this.f44567o) + "', messagePlaceholder='" + ((Object) this.f44568p) + "'}";
    }
}
