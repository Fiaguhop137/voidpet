package com.th3rdwave.safeareacontext;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f39363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f39364b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f39365c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f39366d;

    public a(float f10, float f11, float f12, float f13) {
        this.f39363a = f10;
        this.f39364b = f11;
        this.f39365c = f12;
        this.f39366d = f13;
    }

    public final float a() {
        return this.f39365c;
    }

    public final float b() {
        return this.f39366d;
    }

    public final float c() {
        return this.f39364b;
    }

    public final float d() {
        return this.f39363a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Float.compare(this.f39363a, aVar.f39363a) == 0 && Float.compare(this.f39364b, aVar.f39364b) == 0 && Float.compare(this.f39365c, aVar.f39365c) == 0 && Float.compare(this.f39366d, aVar.f39366d) == 0;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.f39363a) * 31) + Float.hashCode(this.f39364b)) * 31) + Float.hashCode(this.f39365c)) * 31) + Float.hashCode(this.f39366d);
    }

    public String toString() {
        return "EdgeInsets(top=" + this.f39363a + ", right=" + this.f39364b + ", bottom=" + this.f39365c + ", left=" + this.f39366d + ")";
    }
}
