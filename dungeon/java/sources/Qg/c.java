package Qg;

/* JADX INFO: loaded from: classes3.dex */
public class c extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f9838c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f9839d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Sg.a f9840e;

    public c(int i10, int i11, Sg.a aVar, String str) {
        super(false, str);
        this.f9838c = i10;
        this.f9839d = i11;
        this.f9840e = new Sg.a(aVar);
    }

    public Sg.a c() {
        return this.f9840e;
    }

    public int d() {
        return this.f9838c;
    }

    public int e() {
        return this.f9839d;
    }
}
