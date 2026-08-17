package p020b1;

import android.graphics.BlendMode;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ThreadLocal f25869a = new ThreadLocal();

    static class a {
        static boolean a(Paint paint, String str) {
            return paint.hasGlyph(str);
        }
    }

    static class b {
        static void a(Paint paint, Object obj) {
            paint.setBlendMode((BlendMode) obj);
        }
    }

    public static boolean a(Paint paint, String str) {
        return a.a(paint, str);
    }

    public static boolean b(Paint paint, EnumC2042a enumC2042a) {
        if (Build.VERSION.SDK_INT >= 29) {
            b.a(paint, enumC2042a != null ? AbstractC2043b.C0343b.a(enumC2042a) : null);
            return true;
        }
        if (enumC2042a == null) {
            paint.setXfermode(null);
            return true;
        }
        PorterDuff.Mode modeA = AbstractC2043b.a(enumC2042a);
        paint.setXfermode(modeA != null ? new PorterDuffXfermode(modeA) : null);
        return modeA != null;
    }
}
