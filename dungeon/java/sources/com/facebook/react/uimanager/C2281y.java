package com.facebook.react.uimanager;

import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.facebook.react.uimanager.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2281y {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f30674c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f30675a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final EnumC2282z f30676b;

    /* JADX INFO: renamed from: com.facebook.react.uimanager.y$a */
    public static final class a {

        /* JADX INFO: renamed from: com.facebook.react.uimanager.y$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0387a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f30677a;

            static {
                int[] iArr = new int[ReadableType.values().length];
                try {
                    iArr[ReadableType.Number.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ReadableType.String.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f30677a = iArr;
            }
        }

        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C2281y a(Dynamic dynamic) {
            Intrinsics.checkNotNullParameter(dynamic, "dynamic");
            int i10 = C0387a.f30677a[dynamic.getType().ordinal()];
            if (i10 == 1) {
                double dAsDouble = dynamic.asDouble();
                if (dAsDouble >= 0.0d) {
                    return new C2281y((float) dAsDouble, EnumC2282z.POINT);
                }
                return null;
            }
            if (i10 != 2) {
                W4.a.I("ReactNative", "Unsupported type for radius property: " + dynamic.getType());
                return null;
            }
            String strAsString = dynamic.asString();
            if (strAsString == null || !StringsKt.y(strAsString, "%", false, 2, null)) {
                W4.a.I("ReactNative", "Invalid string value: " + strAsString);
                return null;
            }
            try {
                String strSubstring = strAsString.substring(0, strAsString.length() - 1);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                float f10 = Float.parseFloat(strSubstring);
                if (f10 >= 0.0f) {
                    return new C2281y(f10, EnumC2282z.PERCENT);
                }
                return null;
            } catch (NumberFormatException unused) {
                W4.a.I("ReactNative", "Invalid percentage format: " + strAsString);
                return null;
            }
        }
    }

    public C2281y(float f10, EnumC2282z type) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f30675a = f10;
        this.f30676b = type;
    }

    public final EnumC2282z a() {
        return this.f30676b;
    }

    public final float b(float f10) {
        return this.f30676b == EnumC2282z.PERCENT ? (this.f30675a / 100) * f10 : this.f30675a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2281y)) {
            return false;
        }
        C2281y c2281y = (C2281y) obj;
        return Float.compare(this.f30675a, c2281y.f30675a) == 0 && this.f30676b == c2281y.f30676b;
    }

    public int hashCode() {
        return (Float.hashCode(this.f30675a) * 31) + this.f30676b.hashCode();
    }

    public String toString() {
        return "LengthPercentage(value=" + this.f30675a + ", type=" + this.f30676b + ")";
    }
}
