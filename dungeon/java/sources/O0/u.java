package O0;

/* JADX INFO: loaded from: classes.dex */
final class u implements P0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f8296a;

    public u(float f10) {
        this.f8296a = f10;
    }

    @Override // P0.a
    public float a(float f10) {
        return f10 / this.f8296a;
    }

    @Override // P0.a
    public float b(float f10) {
        return f10 * this.f8296a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u) && Float.compare(this.f8296a, ((u) obj).f8296a) == 0;
    }

    public int hashCode() {
        return Float.hashCode(this.f8296a);
    }

    public String toString() {
        return "LinearFontScaleConverter(fontScale=" + this.f8296a + ')';
    }
}
