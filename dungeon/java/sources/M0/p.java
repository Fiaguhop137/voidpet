package M0;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f6755c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final p f6756d = new p(1.0f, 0.0f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f6757a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f6758b;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final p a() {
            return p.f6756d;
        }
    }

    public p(float f10, float f11) {
        this.f6757a = f10;
        this.f6758b = f11;
    }

    public final float b() {
        return this.f6757a;
    }

    public final float c() {
        return this.f6758b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.f6757a == pVar.f6757a && this.f6758b == pVar.f6758b;
    }

    public int hashCode() {
        return (Float.hashCode(this.f6757a) * 31) + Float.hashCode(this.f6758b);
    }

    public String toString() {
        return "TextGeometricTransform(scaleX=" + this.f6757a + ", skewX=" + this.f6758b + ')';
    }
}
