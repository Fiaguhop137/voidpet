package p015ae;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f19772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f19773b;

    protected x0(String name, boolean z10) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f19772a = name;
        this.f19773b = z10;
    }

    public Integer a(x0 visibility) {
        Intrinsics.checkNotNullParameter(visibility, "visibility");
        return w0.f19759a.a(this, visibility);
    }

    public String b() {
        return this.f19772a;
    }

    public final boolean c() {
        return this.f19773b;
    }

    public x0 d() {
        return this;
    }

    public final String toString() {
        return b();
    }
}
