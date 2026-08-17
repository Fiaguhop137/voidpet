package androidx.compose.ui.platform;

import android.app.Activity;
import android.graphics.Rect;
import android.os.Build;

/* JADX INFO: renamed from: androidx.compose.ui.platform.c0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
interface InterfaceC1848c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f21994a = a.f21995a;

    /* JADX INFO: renamed from: androidx.compose.ui.platform.c0$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f21995a = new a();

        private a() {
        }

        public final InterfaceC1848c0 a() {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 30) {
                return C1856g0.f22031b;
            }
            if (i10 >= 29) {
                return C1854f0.f22023b;
            }
            return i10 >= 28 ? C1852e0.f22019b : C1850d0.f22009b;
        }
    }

    Rect a(Activity activity);
}
