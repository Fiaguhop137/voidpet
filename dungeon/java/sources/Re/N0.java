package Re;

import kotlin.enums.EnumEntries;

/* JADX INFO: loaded from: classes3.dex */
public enum N0 {
    INVARIANT("", true, true, 0),
    IN_VARIANCE("in", true, false, -1),
    OUT_VARIANCE("out", false, true, 1);


    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f11071i = Gd.a.a(e());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f11072a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f11073b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f11074c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f11075d;

    N0(String str, boolean z10, boolean z11, int i10) {
        this.f11072a = str;
        this.f11073b = z10;
        this.f11074c = z11;
        this.f11075d = i10;
    }

    public final boolean g() {
        return this.f11074c;
    }

    public final String h() {
        return this.f11072a;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f11072a;
    }
}
