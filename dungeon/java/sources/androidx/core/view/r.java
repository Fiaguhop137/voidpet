package androidx.core.view;

import android.graphics.Insets;
import android.os.Build;
import android.view.DisplayCutout;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final DisplayCutout f23268a;

    static class a {
        static List a(DisplayCutout displayCutout) {
            return displayCutout.getBoundingRects();
        }

        static int b(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetBottom();
        }

        static int c(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetLeft();
        }

        static int d(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetRight();
        }

        static int e(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetTop();
        }
    }

    static class b {
        static Insets a(DisplayCutout displayCutout) {
            return displayCutout.getWaterfallInsets();
        }
    }

    private r(DisplayCutout displayCutout) {
        this.f23268a = displayCutout;
    }

    static r g(DisplayCutout displayCutout) {
        if (displayCutout == null) {
            return null;
        }
        return new r(displayCutout);
    }

    public List a() {
        return Build.VERSION.SDK_INT >= 28 ? a.a(this.f23268a) : Collections.EMPTY_LIST;
    }

    public int b() {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.b(this.f23268a);
        }
        return 0;
    }

    public int c() {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.c(this.f23268a);
        }
        return 0;
    }

    public int d() {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.d(this.f23268a);
        }
        return 0;
    }

    public int e() {
        if (Build.VERSION.SDK_INT >= 28) {
            return a.e(this.f23268a);
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r.class != obj.getClass()) {
            return false;
        }
        return p199l1.c.a(this.f23268a, ((r) obj).f23268a);
    }

    public p020b1.d f() {
        return Build.VERSION.SDK_INT >= 30 ? p020b1.d.e(b.a(this.f23268a)) : p020b1.d.f25864e;
    }

    public int hashCode() {
        DisplayCutout displayCutout = this.f23268a;
        if (displayCutout == null) {
            return 0;
        }
        return displayCutout.hashCode();
    }

    public String toString() {
        return "DisplayCutoutCompat{" + this.f23268a + "}";
    }
}
