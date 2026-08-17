package Fc;

/* JADX INFO: loaded from: classes2.dex */
public enum e {
    PUBLIC(1, 1),
    PRIVATE(0, 2),
    SECRET(-1, 3),
    UNKNOWN(1, 0);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f3050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f3051b;

    e(int i10, int i11) {
        this.f3050a = i10;
        this.f3051b = i11;
    }

    public static e g(int i10) {
        for (e eVar : values()) {
            if (eVar.i() == i10) {
                return eVar;
            }
        }
        return UNKNOWN;
    }

    public static e h(int i10) {
        for (e eVar : values()) {
            if (eVar.o() == i10) {
                return eVar;
            }
        }
        return UNKNOWN;
    }

    public int i() {
        return this.f3051b;
    }

    public int o() {
        return this.f3050a;
    }
}
