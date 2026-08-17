package com.facebook.yoga;

/* JADX INFO: loaded from: classes2.dex */
public class YogaValue {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final YogaValue f31419c = new YogaValue(Float.NaN, w.UNDEFINED);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final YogaValue f31420d = new YogaValue(0.0f, w.POINT);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final YogaValue f31421e = new YogaValue(Float.NaN, w.AUTO);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f31422a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w f31423b;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f31424a;

        static {
            int[] iArr = new int[w.values().length];
            f31424a = iArr;
            try {
                iArr[w.UNDEFINED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f31424a[w.POINT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f31424a[w.PERCENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f31424a[w.AUTO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    YogaValue(float f10, int i10) {
        this(f10, w.g(i10));
    }

    public YogaValue(float f10, w wVar) {
        this.f31422a = f10;
        this.f31423b = wVar;
    }

    public static YogaValue a(String str) {
        if (str == null) {
            return null;
        }
        if ("undefined".equals(str)) {
            return f31419c;
        }
        if ("auto".equals(str)) {
            return f31421e;
        }
        return str.endsWith("%") ? new YogaValue(Float.parseFloat(str.substring(0, str.length() - 1)), w.PERCENT) : new YogaValue(Float.parseFloat(str), w.POINT);
    }

    public boolean equals(Object obj) {
        if (obj instanceof YogaValue) {
            YogaValue yogaValue = (YogaValue) obj;
            w wVar = this.f31423b;
            if (wVar == yogaValue.f31423b) {
                return wVar == w.UNDEFINED || wVar == w.AUTO || Float.compare(this.f31422a, yogaValue.f31422a) == 0;
            }
        }
        return false;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.f31422a) + this.f31423b.h();
    }

    public String toString() {
        int i10 = a.f31424a[this.f31423b.ordinal()];
        if (i10 == 1) {
            return "undefined";
        }
        if (i10 == 2) {
            return Float.toString(this.f31422a);
        }
        if (i10 != 3) {
            if (i10 == 4) {
                return "auto";
            }
            throw new IllegalStateException();
        }
        return this.f31422a + "%";
    }
}
