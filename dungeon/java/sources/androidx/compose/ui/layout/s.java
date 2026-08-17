package androidx.compose.ui.layout;

/* JADX INFO: loaded from: classes.dex */
final class s implements r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f21675b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private B f21676c = new B();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private C1840c f21677d = new C1840c();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private B f21678e = new B();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private C1840c f21679f = new C1840c();

    public s(String str) {
        this.f21675b = str;
    }

    @Override // androidx.compose.ui.layout.r
    public B a() {
        return this.f21676c;
    }

    @Override // androidx.compose.ui.layout.r
    public B b() {
        return this.f21678e;
    }

    @Override // androidx.compose.ui.layout.r
    public C1840c c() {
        return this.f21677d;
    }

    @Override // androidx.compose.ui.layout.r
    public C1840c d() {
        return this.f21679f;
    }

    public String toString() {
        if (this.f21675b == null) {
            return super.toString();
        }
        return "RectRulers(" + this.f21675b + ')';
    }
}
