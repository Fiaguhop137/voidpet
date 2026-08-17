package p329s5;

import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: s5.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C4164d {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f53315f = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f53317b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ColorFilter f53318c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f53316a = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f53319d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f53320e = -1;

    /* JADX INFO: renamed from: s5.d$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final void a(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        int i10 = this.f53316a;
        if (i10 != -1) {
            drawable.setAlpha(i10);
        }
        if (this.f53317b) {
            drawable.setColorFilter(this.f53318c);
        }
        int i11 = this.f53319d;
        if (i11 != -1) {
            drawable.setDither(i11 != 0);
        }
        int i12 = this.f53320e;
        if (i12 != -1) {
            drawable.setFilterBitmap(i12 != 0);
        }
    }

    public final void b(int i10) {
        this.f53316a = i10;
    }

    public final void c(ColorFilter colorFilter) {
        this.f53318c = colorFilter;
        this.f53317b = colorFilter != null;
    }

    public final void d(boolean z10) {
        this.f53319d = z10 ? 1 : 0;
    }

    public final void e(boolean z10) {
        this.f53320e = z10 ? 1 : 0;
    }
}
