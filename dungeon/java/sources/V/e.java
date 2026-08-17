package V;

import O0.t;

/* JADX INFO: loaded from: classes.dex */
public final class e implements d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f13727b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f13728c;

    public static final class a implements d.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final float f13729a;

        public a(float f10) {
            this.f13729a = f10;
        }

        @Override // V.d.b
        public int a(int i10, int i11, t tVar) {
            return Math.round(((i11 - i10) / 2.0f) * (1 + (tVar == t.Ltr ? this.f13729a : (-1) * this.f13729a)));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Float.compare(this.f13729a, ((a) obj).f13729a) == 0;
        }

        public int hashCode() {
            return Float.hashCode(this.f13729a);
        }

        public String toString() {
            return "Horizontal(bias=" + this.f13729a + ')';
        }
    }

    public static final class b implements d.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final float f13730a;

        public b(float f10) {
            this.f13730a = f10;
        }

        @Override // V.d.c
        public int a(int i10, int i11) {
            return Math.round(((i11 - i10) / 2.0f) * (1 + this.f13730a));
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Float.compare(this.f13730a, ((b) obj).f13730a) == 0;
        }

        public int hashCode() {
            return Float.hashCode(this.f13730a);
        }

        public String toString() {
            return "Vertical(bias=" + this.f13730a + ')';
        }
    }

    public e(float f10, float f11) {
        this.f13727b = f10;
        this.f13728c = f11;
    }

    @Override // V.d
    public long a(long j10, long j11, t tVar) {
        float f10 = (((int) (j11 >> 32)) - ((int) (j10 >> 32))) / 2.0f;
        float f11 = (((int) (j11 & 4294967295L)) - ((int) (j10 & 4294967295L))) / 2.0f;
        float f12 = 1;
        return O0.n.d((((long) Math.round(f10 * ((tVar == t.Ltr ? this.f13727b : (-1) * this.f13727b) + f12))) << 32) | (((long) Math.round(f11 * (f12 + this.f13728c))) & 4294967295L));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Float.compare(this.f13727b, eVar.f13727b) == 0 && Float.compare(this.f13728c, eVar.f13728c) == 0;
    }

    public int hashCode() {
        return (Float.hashCode(this.f13727b) * 31) + Float.hashCode(this.f13728c);
    }

    public String toString() {
        return "BiasAlignment(horizontalBias=" + this.f13727b + ", verticalBias=" + this.f13728c + ')';
    }
}
