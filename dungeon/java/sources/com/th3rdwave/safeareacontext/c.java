package com.th3rdwave.safeareacontext;

/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f39370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f39371b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f39372c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f39373d;

    public c(float f10, float f11, float f12, float f13) {
        this.f39370a = f10;
        this.f39371b = f11;
        this.f39372c = f12;
        this.f39373d = f13;
    }

    public final float a() {
        return this.f39373d;
    }

    public final float b() {
        return this.f39372c;
    }

    public final float c() {
        return this.f39370a;
    }

    public final float d() {
        return this.f39371b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Float.compare(this.f39370a, cVar.f39370a) == 0 && Float.compare(this.f39371b, cVar.f39371b) == 0 && Float.compare(this.f39372c, cVar.f39372c) == 0 && Float.compare(this.f39373d, cVar.f39373d) == 0;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.f39370a) * 31) + Float.hashCode(this.f39371b)) * 31) + Float.hashCode(this.f39372c)) * 31) + Float.hashCode(this.f39373d);
    }

    public String toString() {
        return "Rect(x=" + this.f39370a + ", y=" + this.f39371b + ", width=" + this.f39372c + ", height=" + this.f39373d + ")";
    }
}
