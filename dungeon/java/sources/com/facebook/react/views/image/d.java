package com.facebook.react.views.image;

import android.graphics.Shader;
import kotlin.jvm.internal.Intrinsics;
import p329s5.q;

/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f30717a = new d();

    private d() {
    }

    public static final Shader.TileMode a() {
        return Shader.TileMode.CLAMP;
    }

    public static final q b() {
        q CENTER_CROP = q.f53434i;
        Intrinsics.checkNotNullExpressionValue(CENTER_CROP, "CENTER_CROP");
        return CENTER_CROP;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final q c(String str) {
        if (str != null) {
            switch (str.hashCode()) {
                case -1881872635:
                    if (str.equals("stretch")) {
                        q FIT_XY = q.f53426a;
                        Intrinsics.checkNotNullExpressionValue(FIT_XY, "FIT_XY");
                        return FIT_XY;
                    }
                    break;
                case -1364013995:
                    if (str.equals("center")) {
                        q CENTER_INSIDE = q.f53433h;
                        Intrinsics.checkNotNullExpressionValue(CENTER_INSIDE, "CENTER_INSIDE");
                        return CENTER_INSIDE;
                    }
                    break;
                case -934531685:
                    if (str.equals("repeat")) {
                        return i.f30748l.a();
                    }
                    break;
                case 3387192:
                    if (str.equals("none")) {
                        return i.f30748l.a();
                    }
                    break;
                case 94852023:
                    if (str.equals("cover")) {
                        q CENTER_CROP = q.f53434i;
                        Intrinsics.checkNotNullExpressionValue(CENTER_CROP, "CENTER_CROP");
                        return CENTER_CROP;
                    }
                    break;
                case 951526612:
                    if (str.equals("contain")) {
                        q FIT_CENTER = q.f53430e;
                        Intrinsics.checkNotNullExpressionValue(FIT_CENTER, "FIT_CENTER");
                        return FIT_CENTER;
                    }
                    break;
            }
        }
        if (str != null) {
            W4.a.I("ReactNative", "Invalid resize mode: '" + str + "'");
        }
        return b();
    }

    public static final Shader.TileMode d(String str) {
        if (Intrinsics.b("contain", str) || Intrinsics.b("cover", str) || Intrinsics.b("stretch", str) || Intrinsics.b("center", str) || Intrinsics.b("none", str)) {
            return Shader.TileMode.CLAMP;
        }
        if (Intrinsics.b("repeat", str)) {
            return Shader.TileMode.REPEAT;
        }
        if (str != null) {
            W4.a.I("ReactNative", "Invalid resize mode: '" + str + "'");
        }
        return a();
    }
}
