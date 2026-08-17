package p095f4;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f41738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f41739b;

    public d() {
        this(1.0f, 1.0f);
    }

    public d(float f10, float f11) {
        this.f41738a = f10;
        this.f41739b = f11;
    }

    public boolean a(float f10, float f11) {
        return this.f41738a == f10 && this.f41739b == f11;
    }

    public float b() {
        return this.f41738a;
    }

    public float c() {
        return this.f41739b;
    }

    public void d(float f10, float f11) {
        this.f41738a = f10;
        this.f41739b = f11;
    }

    public String toString() {
        return b() + "x" + c();
    }
}
