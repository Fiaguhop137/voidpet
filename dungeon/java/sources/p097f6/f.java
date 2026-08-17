package p097f6;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f41785a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f41786b;

    public f(boolean z10, boolean z11) {
        this.f41785a = z10;
        this.f41786b = z11;
    }

    public /* synthetic */ f(boolean z10, boolean z11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? false : z11);
    }

    public final boolean a() {
        return this.f41785a;
    }

    public final boolean b() {
        return this.f41786b;
    }
}
