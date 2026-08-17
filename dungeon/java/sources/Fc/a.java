package Fc;

/* JADX INFO: loaded from: classes2.dex */
public enum a {
    UNKNOWN(0, 0),
    SPEECH(1, 1),
    MUSIC(2, 2),
    MOVIE(3, 3),
    SONIFICIATION(4, 4);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f3006a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f3007b;

    a(int i10, int i11) {
        this.f3006a = i10;
        this.f3007b = i11;
    }

    public static a g(int i10) {
        for (a aVar : values()) {
            if (aVar.i() == i10) {
                return aVar;
            }
        }
        return UNKNOWN;
    }

    public static a h(int i10) {
        for (a aVar : values()) {
            if (aVar.i() == i10) {
                return aVar;
            }
        }
        return UNKNOWN;
    }

    public int i() {
        return this.f3007b;
    }

    public int o() {
        return this.f3006a;
    }
}
