package Fc;

/* JADX INFO: loaded from: classes2.dex */
public enum c {
    UNSPECIFIED(-1000, 1),
    NONE(0, 2),
    MIN(1, 3),
    LOW(2, 4),
    DEFAULT(3, 5),
    HIGH(4, 6),
    MAX(5, 7),
    UNKNOWN(3, 0);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f3035a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f3036b;

    c(int i10, int i11) {
        this.f3035a = i10;
        this.f3036b = i11;
    }

    public static c g(int i10) {
        for (c cVar : values()) {
            if (cVar.i() == i10) {
                return cVar;
            }
        }
        return UNKNOWN;
    }

    public static c h(int i10) {
        for (c cVar : values()) {
            if (cVar.o() == i10) {
                return cVar;
            }
        }
        return UNKNOWN;
    }

    public int i() {
        return this.f3036b;
    }

    public int o() {
        return this.f3035a;
    }
}
