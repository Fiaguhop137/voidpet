package p077e4;

/* JADX INFO: loaded from: classes.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f40388a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f40389b;

    public void a(float f10) {
        float f11 = this.f40388a + f10;
        this.f40388a = f11;
        int i10 = this.f40389b + 1;
        this.f40389b = i10;
        if (i10 == Integer.MAX_VALUE) {
            this.f40388a = f11 / 2.0f;
            this.f40389b = i10 / 2;
        }
    }
}
