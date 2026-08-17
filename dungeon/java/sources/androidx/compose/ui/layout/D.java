package androidx.compose.ui.layout;

/* JADX INFO: loaded from: classes.dex */
final class D implements C {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f21565b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final r f21566c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final r f21567d;

    public D(String str) {
        this.f21565b = str;
        this.f21566c = t.a(str);
        this.f21567d = t.a(str + " maximum");
    }

    @Override // androidx.compose.ui.layout.C
    public r a() {
        return this.f21566c;
    }

    @Override // androidx.compose.ui.layout.C
    public r b() {
        return this.f21567d;
    }

    public String toString() {
        return this.f21565b;
    }
}
