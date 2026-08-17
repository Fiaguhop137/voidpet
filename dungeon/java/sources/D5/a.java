package D5;

import kotlin.jvm.internal.Intrinsics;
import p419x5.d;

/* JADX INFO: loaded from: classes2.dex */
public final class a implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final O5.a f2148a;

    public a(O5.a animatedDrawableBackend) {
        Intrinsics.checkNotNullParameter(animatedDrawableBackend, "animatedDrawableBackend");
        this.f2148a = animatedDrawableBackend;
    }

    @Override // p419x5.d
    public int a() {
        return this.f2148a.a();
    }

    @Override // p419x5.d
    public int b() {
        return this.f2148a.b();
    }

    @Override // p419x5.d
    public int g() {
        return this.f2148a.getHeight();
    }

    @Override // p419x5.d
    public int j() {
        return this.f2148a.d();
    }

    @Override // p419x5.d
    public int l(int i10) {
        return this.f2148a.g(i10);
    }

    @Override // p419x5.d
    public int n() {
        return this.f2148a.getWidth();
    }
}
