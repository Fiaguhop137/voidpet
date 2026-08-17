package X3;

import android.graphics.PointF;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f15255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f15256b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f15257c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a f15258d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f15259e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f15260f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f15261g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f15262h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f15263i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f15264j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f15265k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public PointF f15266l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public PointF f15267m;

    public enum a {
        LEFT_ALIGN,
        RIGHT_ALIGN,
        CENTER
    }

    public b() {
    }

    public b(String str, String str2, float f10, a aVar, int i10, float f11, float f12, int i11, int i12, float f13, boolean z10, PointF pointF, PointF pointF2) {
        a(str, str2, f10, aVar, i10, f11, f12, i11, i12, f13, z10, pointF, pointF2);
    }

    public void a(String str, String str2, float f10, a aVar, int i10, float f11, float f12, int i11, int i12, float f13, boolean z10, PointF pointF, PointF pointF2) {
        this.f15255a = str;
        this.f15256b = str2;
        this.f15257c = f10;
        this.f15258d = aVar;
        this.f15259e = i10;
        this.f15260f = f11;
        this.f15261g = f12;
        this.f15262h = i11;
        this.f15263i = i12;
        this.f15264j = f13;
        this.f15265k = z10;
        this.f15266l = pointF;
        this.f15267m = pointF2;
    }

    public int hashCode() {
        int iHashCode = (((((int) ((((this.f15255a.hashCode() * 31) + this.f15256b.hashCode()) * 31) + this.f15257c)) * 31) + this.f15258d.ordinal()) * 31) + this.f15259e;
        long jFloatToRawIntBits = Float.floatToRawIntBits(this.f15260f);
        return (((iHashCode * 31) + ((int) (jFloatToRawIntBits ^ (jFloatToRawIntBits >>> 32)))) * 31) + this.f15262h;
    }
}
