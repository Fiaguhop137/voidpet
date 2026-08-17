package Ve;

import kotlin.enums.EnumEntries;

/* JADX INFO: loaded from: classes3.dex */
public enum v {
    IN("in"),
    OUT("out"),
    INV("");


    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f14330f = Gd.a.a(e());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f14331a;

    v(String str) {
        this.f14331a = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f14331a;
    }
}
