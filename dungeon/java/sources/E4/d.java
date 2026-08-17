package E4;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
final class d implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f2642a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final b.a f2643b;

    d(Context context, b.a aVar) {
        this.f2642a = context.getApplicationContext();
        this.f2643b = aVar;
    }

    private void f() {
        r.a(this.f2642a).d(this.f2643b);
    }

    private void h() {
        r.a(this.f2642a).e(this.f2643b);
    }

    @Override // E4.l
    public void a() {
        h();
    }

    @Override // E4.l
    public void c() {
        f();
    }

    @Override // E4.l
    public void d() {
    }
}
