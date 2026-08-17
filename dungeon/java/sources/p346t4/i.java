package p346t4;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f54454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f54455b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f54456c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f54457d;

    public static final class a {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        static final int f54458i;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Context f54459a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        ActivityManager f54460b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        c f54461c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        float f54463e;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        float f54462d = 2.0f;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        float f54464f = 0.4f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        float f54465g = 0.33f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f54466h = 4194304;

        static {
            f54458i = Build.VERSION.SDK_INT < 26 ? 4 : 1;
        }

        public a(Context context) {
            this.f54463e = f54458i;
            this.f54459a = context;
            this.f54460b = (ActivityManager) context.getSystemService("activity");
            this.f54461c = new b(context.getResources().getDisplayMetrics());
            if (Build.VERSION.SDK_INT < 26 || !i.e(this.f54460b)) {
                return;
            }
            this.f54463e = 0.0f;
        }

        public i a() {
            return new i(this);
        }
    }

    private static final class b implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final DisplayMetrics f54467a;

        b(DisplayMetrics displayMetrics) {
            this.f54467a = displayMetrics;
        }

        @Override // t4.i.c
        public int a() {
            return this.f54467a.heightPixels;
        }

        @Override // t4.i.c
        public int b() {
            return this.f54467a.widthPixels;
        }
    }

    interface c {
        int a();

        int b();
    }

    i(a aVar) {
        this.f54456c = aVar.f54459a;
        int i10 = e(aVar.f54460b) ? aVar.f54466h / 2 : aVar.f54466h;
        this.f54457d = i10;
        int iC = c(aVar.f54460b, aVar.f54464f, aVar.f54465g);
        float fB = aVar.f54461c.b() * aVar.f54461c.a() * 4;
        int iRound = Math.round(aVar.f54463e * fB);
        int iRound2 = Math.round(fB * aVar.f54462d);
        int i11 = iC - i10;
        int i12 = iRound2 + iRound;
        if (i12 <= i11) {
            this.f54455b = iRound2;
            this.f54454a = iRound;
        } else {
            float f10 = i11;
            float f11 = aVar.f54463e;
            float f12 = aVar.f54462d;
            float f13 = f10 / (f11 + f12);
            this.f54455b = Math.round(f12 * f13);
            this.f54454a = Math.round(f13 * aVar.f54463e);
        }
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Calculation complete, Calculated memory cache size: ");
            sb2.append(f(this.f54455b));
            sb2.append(", pool size: ");
            sb2.append(f(this.f54454a));
            sb2.append(", byte array size: ");
            sb2.append(f(i10));
            sb2.append(", memory class limited? ");
            sb2.append(i12 > iC);
            sb2.append(", max size: ");
            sb2.append(f(iC));
            sb2.append(", memoryClass: ");
            sb2.append(aVar.f54460b.getMemoryClass());
            sb2.append(", isLowMemoryDevice: ");
            sb2.append(e(aVar.f54460b));
            Log.d("MemorySizeCalculator", sb2.toString());
        }
    }

    private static int c(ActivityManager activityManager, float f10, float f11) {
        float memoryClass = activityManager.getMemoryClass() * 1048576;
        if (e(activityManager)) {
            f10 = f11;
        }
        return Math.round(memoryClass * f10);
    }

    static boolean e(ActivityManager activityManager) {
        return activityManager.isLowRamDevice();
    }

    private String f(int i10) {
        return Formatter.formatFileSize(this.f54456c, i10);
    }

    public int a() {
        return this.f54457d;
    }

    public int b() {
        return this.f54454a;
    }

    public int d() {
        return this.f54455b;
    }
}
