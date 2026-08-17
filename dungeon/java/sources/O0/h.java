package O0;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes.dex */
public final class h implements Comparable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f8267b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float f8268c = o(0.0f);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final float f8269d = o(Float.POSITIVE_INFINITY);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final float f8270e = o(Float.NaN);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f8271a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final float a() {
            return h.f8270e;
        }
    }

    private /* synthetic */ h(float f10) {
        this.f8271a = f10;
    }

    public static final /* synthetic */ h g(float f10) {
        return new h(f10);
    }

    public static int i(float f10, float f11) {
        return Float.compare(f10, f11);
    }

    public static float o(float f10) {
        return f10;
    }

    public static boolean p(float f10, Object obj) {
        return (obj instanceof h) && Float.compare(f10, ((h) obj).u()) == 0;
    }

    public static final boolean r(float f10, float f11) {
        return Float.compare(f10, f11) == 0;
    }

    public static int s(float f10) {
        return Float.hashCode(f10);
    }

    public static String t(float f10) {
        if (Float.isNaN(f10)) {
            return "Dp.Unspecified";
        }
        return f10 + ".dp";
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return h(((h) obj).u());
    }

    public boolean equals(Object obj) {
        return p(this.f8271a, obj);
    }

    public int h(float f10) {
        return i(this.f8271a, f10);
    }

    public int hashCode() {
        return s(this.f8271a);
    }

    public String toString() {
        return t(this.f8271a);
    }

    public final /* synthetic */ float u() {
        return this.f8271a;
    }
}
