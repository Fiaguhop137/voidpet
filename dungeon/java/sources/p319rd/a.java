package p319rd;

import android.graphics.Color;
import expo.modules.updates.reloadscreen.ImageResizeMode;
import expo.modules.updates.reloadscreen.ReloadScreenImageSource;
import expo.modules.updates.reloadscreen.ReloadScreenOptions;
import expo.modules.updates.reloadscreen.SpinnerOptions;
import expo.modules.updates.reloadscreen.SpinnerSize;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C0633a f52437g = new C0633a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f52438a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ReloadScreenImageSource f52439b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ImageResizeMode f52440c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f52441d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f52442e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final f f52443f;

    /* JADX INFO: renamed from: rd.a$a, reason: collision with other inner class name */
    public static final class C0633a {
        private C0633a() {
        }

        public /* synthetic */ C0633a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a a(ReloadScreenOptions reloadScreenOptions) {
            String backgroundColor;
            ImageResizeMode imageResizeMode;
            String color;
            SpinnerSize size;
            SpinnerOptions spinner;
            SpinnerOptions spinner2;
            SpinnerOptions spinner3;
            Boolean enabled;
            Boolean fade;
            Boolean imageFullScreen;
            boolean zBooleanValue = true;
            boolean z10 = (reloadScreenOptions != null ? reloadScreenOptions.getImage() : null) != null;
            if (reloadScreenOptions == null || (backgroundColor = reloadScreenOptions.getBackgroundColor()) == null) {
                backgroundColor = "#ffffff";
            }
            int color2 = Color.parseColor(backgroundColor);
            ReloadScreenImageSource image = reloadScreenOptions != null ? reloadScreenOptions.getImage() : null;
            if (reloadScreenOptions == null || (imageResizeMode = reloadScreenOptions.getImageResizeMode()) == null) {
                imageResizeMode = ImageResizeMode.CONTAIN;
            }
            ImageResizeMode imageResizeMode2 = imageResizeMode;
            boolean zBooleanValue2 = (reloadScreenOptions == null || (imageFullScreen = reloadScreenOptions.getImageFullScreen()) == null) ? false : imageFullScreen.booleanValue();
            boolean zBooleanValue3 = (reloadScreenOptions == null || (fade = reloadScreenOptions.getFade()) == null) ? false : fade.booleanValue();
            if (reloadScreenOptions != null && (spinner3 = reloadScreenOptions.getSpinner()) != null && (enabled = spinner3.getEnabled()) != null) {
                zBooleanValue = enabled.booleanValue();
            } else if (z10) {
                zBooleanValue = false;
            }
            if (reloadScreenOptions == null || (spinner2 = reloadScreenOptions.getSpinner()) == null || (color = spinner2.getColor()) == null) {
                color = "#007aff";
            }
            int color3 = Color.parseColor(color);
            if (reloadScreenOptions == null || (spinner = reloadScreenOptions.getSpinner()) == null || (size = spinner.getSize()) == null) {
                size = SpinnerSize.MEDIUM;
            }
            return new a(color2, image, imageResizeMode2, zBooleanValue2, zBooleanValue3, new f(zBooleanValue, color3, size));
        }
    }

    public a(int i10, ReloadScreenImageSource reloadScreenImageSource, ImageResizeMode imageResizeMode, boolean z10, boolean z11, f spinner) {
        Intrinsics.checkNotNullParameter(imageResizeMode, "imageResizeMode");
        Intrinsics.checkNotNullParameter(spinner, "spinner");
        this.f52438a = i10;
        this.f52439b = reloadScreenImageSource;
        this.f52440c = imageResizeMode;
        this.f52441d = z10;
        this.f52442e = z11;
        this.f52443f = spinner;
    }

    public final int a() {
        return this.f52438a;
    }

    public final boolean b() {
        return this.f52442e;
    }

    public final ReloadScreenImageSource c() {
        return this.f52439b;
    }

    public final boolean d() {
        return this.f52441d;
    }

    public final ImageResizeMode e() {
        return this.f52440c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f52438a == aVar.f52438a && Intrinsics.b(this.f52439b, aVar.f52439b) && this.f52440c == aVar.f52440c && this.f52441d == aVar.f52441d && this.f52442e == aVar.f52442e && Intrinsics.b(this.f52443f, aVar.f52443f);
    }

    public final f f() {
        return this.f52443f;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.f52438a) * 31;
        ReloadScreenImageSource reloadScreenImageSource = this.f52439b;
        return ((((((((iHashCode + (reloadScreenImageSource == null ? 0 : reloadScreenImageSource.hashCode())) * 31) + this.f52440c.hashCode()) * 31) + Boolean.hashCode(this.f52441d)) * 31) + Boolean.hashCode(this.f52442e)) * 31) + this.f52443f.hashCode();
    }

    public String toString() {
        return "ReloadScreenConfiguration(backgroundColor=" + this.f52438a + ", image=" + this.f52439b + ", imageResizeMode=" + this.f52440c + ", imageFullScreen=" + this.f52441d + ", fade=" + this.f52442e + ", spinner=" + this.f52443f + ")";
    }
}
