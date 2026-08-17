package Ta;

/* JADX INFO: loaded from: classes2.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f12383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f12384b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f12385c;

    public e(float f10, float f11, float f12) {
        this.f12383a = f10;
        this.f12384b = f11;
        this.f12385c = f12;
    }

    public final float a() {
        return this.f12383a;
    }

    public final float b() {
        return this.f12385c;
    }

    public final float c() {
        return this.f12384b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Float.compare(this.f12383a, eVar.f12383a) == 0 && Float.compare(this.f12384b, eVar.f12384b) == 0 && Float.compare(this.f12385c, eVar.f12385c) == 0;
    }

    public int hashCode() {
        return (((Float.hashCode(this.f12383a) * 31) + Float.hashCode(this.f12384b)) * 31) + Float.hashCode(this.f12385c);
    }

    public String toString() {
        return "PaddingBundle(height=" + this.f12383a + ", paddingStart=" + this.f12384b + ", paddingEnd=" + this.f12385c + ")";
    }
}
