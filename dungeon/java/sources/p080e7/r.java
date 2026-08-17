package p080e7;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes2.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Integer f40631a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Float f40632b;

    public r(Integer num, Float f10) {
        this.f40631a = num;
        this.f40632b = f10;
    }

    public /* synthetic */ r(Integer num, Float f10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : num, (i10 & 2) != 0 ? null : f10);
    }

    public final Integer a() {
        return this.f40631a;
    }

    public final Float b() {
        return this.f40632b;
    }

    public final void c(Integer num) {
        this.f40631a = num;
    }
}
