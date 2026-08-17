package Ce;

import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: Ce.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC0905a {
    NO_ARGUMENTS(false, false, 3, null),
    UNLESS_EMPTY(true, false, 2, null),
    ALWAYS_PARENTHESIZED(true, true);


    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f1861g = Gd.a.a(e());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f1862a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f1863b;

    EnumC0905a(boolean z10, boolean z11) {
        this.f1862a = z10;
        this.f1863b = z11;
    }

    /* synthetic */ EnumC0905a(boolean z10, boolean z11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? false : z11);
    }

    public final boolean g() {
        return this.f1862a;
    }

    public final boolean h() {
        return this.f1863b;
    }
}
