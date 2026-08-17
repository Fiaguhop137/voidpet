package p257o5;

/* JADX INFO: loaded from: classes2.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f50451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f50452b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f50453c;

    public d() {
        a();
    }

    public void a() {
        this.f50451a = false;
        this.f50452b = 4;
        c();
    }

    public void b() {
        this.f50453c++;
    }

    public void c() {
        this.f50453c = 0;
    }

    public void d(boolean z10) {
        this.f50451a = z10;
    }

    public boolean e() {
        return this.f50451a && this.f50453c < this.f50452b;
    }
}
