package Fc;

/* JADX INFO: loaded from: classes2.dex */
public enum d {
    MIN(-2, "min"),
    LOW(-1, "low"),
    DEFAULT(0, "default"),
    HIGH(1, "high"),
    MAX(2, "max");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f3043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f3044b;

    d(int i10, String str) {
        this.f3043a = i10;
        this.f3044b = str;
    }

    public static d g(String str) {
        for (d dVar : values()) {
            if (dVar.i().equalsIgnoreCase(str)) {
                return dVar;
            }
        }
        return null;
    }

    public static d h(int i10) {
        for (d dVar : values()) {
            if (dVar.o() == i10) {
                return dVar;
            }
        }
        return null;
    }

    public String i() {
        return this.f3044b;
    }

    public int o() {
        return this.f3043a;
    }
}
