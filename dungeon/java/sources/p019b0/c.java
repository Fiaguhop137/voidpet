package p019b0;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f25801a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f25802b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f25803c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f25804d;

    public c(float f10, float f11, float f12, float f13) {
        this.f25801a = f10;
        this.f25802b = f11;
        this.f25803c = f12;
        this.f25804d = f13;
    }

    public final float a() {
        return this.f25804d;
    }

    public final float b() {
        return this.f25801a;
    }

    public final float c() {
        return this.f25803c;
    }

    public final float d() {
        return this.f25802b;
    }

    public final void e(float f10, float f11, float f12, float f13) {
        this.f25801a = Math.max(f10, this.f25801a);
        this.f25802b = Math.max(f11, this.f25802b);
        this.f25803c = Math.min(f12, this.f25803c);
        this.f25804d = Math.min(f13, this.f25804d);
    }

    public final boolean f() {
        return (this.f25801a >= this.f25803c) | (this.f25802b >= this.f25804d);
    }

    public final void g(float f10, float f11, float f12, float f13) {
        this.f25801a = f10;
        this.f25802b = f11;
        this.f25803c = f12;
        this.f25804d = f13;
    }

    public final void h(float f10) {
        this.f25804d = f10;
    }

    public final void i(float f10) {
        this.f25801a = f10;
    }

    public final void j(float f10) {
        this.f25803c = f10;
    }

    public final void k(float f10) {
        this.f25802b = f10;
    }

    public final void l(float f10, float f11) {
        this.f25801a += f10;
        this.f25802b += f11;
        this.f25803c += f10;
        this.f25804d += f11;
    }

    public final void m(long j10) {
        l(Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j10 & 4294967295L)));
    }

    public String toString() {
        return "MutableRect(" + b.a(this.f25801a, 1) + ", " + b.a(this.f25802b, 1) + ", " + b.a(this.f25803c, 1) + ", " + b.a(this.f25804d, 1) + ')';
    }
}
