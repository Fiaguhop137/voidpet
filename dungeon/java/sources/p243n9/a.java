package p243n9;

import android.graphics.Typeface;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Typeface f49917a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC0590a f49918b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f49919c;

    /* JADX INFO: renamed from: n9.a$a, reason: collision with other inner class name */
    public interface InterfaceC0590a {
        void a(Typeface typeface);
    }

    public a(InterfaceC0590a interfaceC0590a, Typeface typeface) {
        this.f49917a = typeface;
        this.f49918b = interfaceC0590a;
    }

    private void d(Typeface typeface) {
        if (this.f49919c) {
            return;
        }
        this.f49918b.a(typeface);
    }

    @Override // p243n9.f
    public void a(int i10) {
        d(this.f49917a);
    }

    @Override // p243n9.f
    public void b(Typeface typeface, boolean z10) {
        d(typeface);
    }

    public void c() {
        this.f49919c = true;
    }
}
