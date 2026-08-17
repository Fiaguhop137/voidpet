package p250ng;

/* JADX INFO: loaded from: classes3.dex */
public class b implements Vf.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f50286d = new b("falcon-512", 9, 40);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f50287e = new b("falcon-1024", 10, 40);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f50288a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f50289b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f50290c;

    private b(String str, int i10, int i11) {
        if (i10 < 1 || i10 > 10) {
            throw new IllegalArgumentException("Log N degree should be between 1 and 10");
        }
        this.f50288a = str;
        this.f50289b = i10;
        this.f50290c = i11;
    }

    public int a() {
        return this.f50289b;
    }

    public String b() {
        return this.f50288a;
    }
}
