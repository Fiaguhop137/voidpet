package Q3;

import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Build;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p435y3.C4352a;

/* JADX INFO: loaded from: classes.dex */
public abstract class F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ColorSpace f9338a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Bitmap.Config[] f9339b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Bitmap.Config f9340c;

    static {
        int i10 = Build.VERSION.SDK_INT;
        f9339b = i10 >= 26 ? new Bitmap.Config[]{Bitmap.Config.ARGB_8888, Bitmap.Config.RGBA_F16} : new Bitmap.Config[]{Bitmap.Config.ARGB_8888};
        f9340c = i10 >= 26 ? Bitmap.Config.HARDWARE : Bitmap.Config.ARGB_8888;
    }

    public static final Bitmap.Config a() {
        return f9340c;
    }

    public static final int b(Drawable drawable) {
        Bitmap bitmap;
        BitmapDrawable bitmapDrawable = drawable instanceof BitmapDrawable ? (BitmapDrawable) drawable : null;
        return (bitmapDrawable == null || (bitmap = bitmapDrawable.getBitmap()) == null) ? drawable.getIntrinsicHeight() : bitmap.getHeight();
    }

    public static final ColorSpace c() {
        return f9338a;
    }

    public static final int d(Configuration configuration) {
        return configuration.uiMode & 48;
    }

    public static final Bitmap.Config[] e() {
        return f9339b;
    }

    public static final int f(Drawable drawable) {
        Bitmap bitmap;
        BitmapDrawable bitmapDrawable = drawable instanceof BitmapDrawable ? (BitmapDrawable) drawable : null;
        return (bitmapDrawable == null || (bitmap = bitmapDrawable.getBitmap()) == null) ? drawable.getIntrinsicWidth() : bitmap.getWidth();
    }

    public static final boolean g(p435y3.C c10) {
        return Intrinsics.b(c10.c(), "file") && Intrinsics.b(CollectionsKt.firstOrNull(p435y3.D.f(c10)), "android_asset");
    }

    public static final boolean h(Drawable drawable) {
        return (drawable instanceof VectorDrawable) || (drawable instanceof androidx.vectordrawable.graphics.drawable.f);
    }

    public static final void i(p435y3.n nVar) {
        if (nVar instanceof C4352a) {
            ((C4352a) nVar).d().prepareToDraw();
        }
    }
}
