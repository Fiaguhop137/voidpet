package X3;

import android.graphics.PointF;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final PointF f15252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final PointF f15253b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final PointF f15254c;

    public a() {
        this.f15252a = new PointF();
        this.f15253b = new PointF();
        this.f15254c = new PointF();
    }

    public a(PointF pointF, PointF pointF2, PointF pointF3) {
        this.f15252a = pointF;
        this.f15253b = pointF2;
        this.f15254c = pointF3;
    }

    public PointF a() {
        return this.f15252a;
    }

    public PointF b() {
        return this.f15253b;
    }

    public PointF c() {
        return this.f15254c;
    }

    public void d(float f10, float f11) {
        this.f15252a.set(f10, f11);
    }

    public void e(float f10, float f11) {
        this.f15253b.set(f10, f11);
    }

    public void f(float f10, float f11) {
        this.f15254c.set(f10, f11);
    }

    public String toString() {
        return String.format("v=%.2f,%.2f cp1=%.2f,%.2f cp2=%.2f,%.2f", Float.valueOf(this.f15254c.x), Float.valueOf(this.f15254c.y), Float.valueOf(this.f15252a.x), Float.valueOf(this.f15252a.y), Float.valueOf(this.f15253b.x), Float.valueOf(this.f15253b.y));
    }
}
