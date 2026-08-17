package U;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f12615a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f12616b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f12617c;

    public s(int i10, String str, String str2) {
        this.f12615a = i10;
        this.f12616b = str;
        this.f12617c = str2;
    }

    public /* synthetic */ s(int i10, String str, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? null : str2);
    }

    public final int a() {
        return this.f12615a;
    }
}
