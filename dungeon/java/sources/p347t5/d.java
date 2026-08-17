package p347t5;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f54502a = a.BITMAP_ONLY;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f54503b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float[] f54504c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f54505d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f54506e = 0.0f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f54507f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f54508g = 0.0f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f54509h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f54510i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f54511j = false;

    public enum a {
        OVERLAY_COLOR,
        BITMAP_ONLY
    }

    public static d a(float f10) {
        return new d().m(f10);
    }

    private float[] e() {
        if (this.f54504c == null) {
            this.f54504c = new float[8];
        }
        return this.f54504c;
    }

    public int b() {
        return this.f54507f;
    }

    public float c() {
        return this.f54506e;
    }

    public float[] d() {
        return this.f54504c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f54503b == dVar.f54503b && this.f54505d == dVar.f54505d && Float.compare(dVar.f54506e, this.f54506e) == 0 && this.f54507f == dVar.f54507f && Float.compare(dVar.f54508g, this.f54508g) == 0 && this.f54502a == dVar.f54502a && this.f54509h == dVar.f54509h && this.f54510i == dVar.f54510i) {
            return Arrays.equals(this.f54504c, dVar.f54504c);
        }
        return false;
    }

    public int f() {
        return this.f54505d;
    }

    public float g() {
        return this.f54508g;
    }

    public boolean h() {
        return this.f54510i;
    }

    public int hashCode() {
        a aVar = this.f54502a;
        int iHashCode = (((aVar != null ? aVar.hashCode() : 0) * 31) + (this.f54503b ? 1 : 0)) * 31;
        float[] fArr = this.f54504c;
        int iHashCode2 = (((iHashCode + (fArr != null ? Arrays.hashCode(fArr) : 0)) * 31) + this.f54505d) * 31;
        float f10 = this.f54506e;
        int iFloatToIntBits = (((iHashCode2 + (f10 != 0.0f ? Float.floatToIntBits(f10) : 0)) * 31) + this.f54507f) * 31;
        float f11 = this.f54508g;
        return ((((iFloatToIntBits + (f11 != 0.0f ? Float.floatToIntBits(f11) : 0)) * 31) + (this.f54509h ? 1 : 0)) * 31) + (this.f54510i ? 1 : 0);
    }

    public boolean i() {
        return this.f54511j;
    }

    public boolean j() {
        return this.f54503b;
    }

    public a k() {
        return this.f54502a;
    }

    public boolean l() {
        return this.f54509h;
    }

    public d m(float f10) {
        Arrays.fill(e(), f10);
        return this;
    }

    public d n(int i10) {
        this.f54505d = i10;
        this.f54502a = a.OVERLAY_COLOR;
        return this;
    }

    public d o(boolean z10) {
        this.f54510i = z10;
        return this;
    }

    public d p(a aVar) {
        this.f54502a = aVar;
        return this;
    }
}
