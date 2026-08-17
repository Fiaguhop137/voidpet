package Db;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class t extends AbstractC0939c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final r f2386j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f2387k;

    public t(r target) {
        Intrinsics.checkNotNullParameter(target, "target");
        this.f2386j = target;
    }

    @Override // p436y4.l
    public y4.l.g a(int i10, int i11, int i12, int i13) {
        return y4.l.g.QUALITY;
    }

    @Override // p436y4.l
    public float b(int i10, int i11, int i12, int i13) {
        if (this.f2387k) {
            return 1.0f;
        }
        this.f2386j.z(i10);
        this.f2386j.y(i11);
        this.f2387k = true;
        return 1.0f;
    }
}
