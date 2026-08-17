package Ca;

import android.app.UiModeManager;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.WindowManager;

/* JADX INFO: loaded from: classes2.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f1647a;

    public b(Context context) {
        this.f1647a = context;
    }

    private com.learnium.RNDeviceInfo.a b() {
        WindowManager windowManager = (WindowManager) this.f1647a.getSystemService("window");
        if (windowManager == null) {
            return com.learnium.RNDeviceInfo.a.UNKNOWN;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getRealMetrics(displayMetrics);
        double dSqrt = Math.sqrt(Math.pow(((double) displayMetrics.widthPixels) / ((double) displayMetrics.xdpi), 2.0d) + Math.pow(((double) displayMetrics.heightPixels) / ((double) displayMetrics.ydpi), 2.0d));
        if (dSqrt < 3.0d || dSqrt > 6.9d) {
            return (dSqrt <= 6.9d || dSqrt > 18.0d) ? com.learnium.RNDeviceInfo.a.UNKNOWN : com.learnium.RNDeviceInfo.a.TABLET;
        }
        return com.learnium.RNDeviceInfo.a.HANDSET;
    }

    private com.learnium.RNDeviceInfo.a c() {
        int i10 = this.f1647a.getResources().getConfiguration().smallestScreenWidthDp;
        if (i10 == 0) {
            return com.learnium.RNDeviceInfo.a.UNKNOWN;
        }
        return i10 >= 600 ? com.learnium.RNDeviceInfo.a.TABLET : com.learnium.RNDeviceInfo.a.HANDSET;
    }

    public com.learnium.RNDeviceInfo.a a() {
        if (this.f1647a.getPackageManager().hasSystemFeature("amazon.hardware.fire_tv")) {
            return com.learnium.RNDeviceInfo.a.TV;
        }
        UiModeManager uiModeManager = (UiModeManager) this.f1647a.getSystemService("uimode");
        if (uiModeManager != null && uiModeManager.getCurrentModeType() == 4) {
            return com.learnium.RNDeviceInfo.a.TV;
        }
        com.learnium.RNDeviceInfo.a aVarC = c();
        return (aVarC == null || aVarC == com.learnium.RNDeviceInfo.a.UNKNOWN) ? b() : aVarC;
    }

    public boolean d() {
        return a() == com.learnium.RNDeviceInfo.a.TABLET;
    }
}
