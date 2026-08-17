package K3;

import kotlin.enums.EnumEntries;

/* JADX INFO: loaded from: classes.dex */
public enum c {
    ENABLED(true, true),
    READ_ONLY(true, false),
    WRITE_ONLY(false, true),
    DISABLED(false, false);


    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f5913h = Gd.a.a(e());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f5914a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f5915b;

    c(boolean z10, boolean z11) {
        this.f5914a = z10;
        this.f5915b = z11;
    }

    public final boolean g() {
        return this.f5914a;
    }

    public final boolean h() {
        return this.f5915b;
    }
}
