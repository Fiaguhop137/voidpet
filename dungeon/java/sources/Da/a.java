package Da;

import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f2254a = false;

    public static synchronized void a() {
        if (f2254a) {
            return;
        }
        try {
            Log.i("NitroModules", "Loading NitroModules C++ library...");
            System.loadLibrary("NitroModules");
            Log.i("NitroModules", "Successfully loaded NitroModules C++ library!");
            f2254a = true;
        } catch (Throwable th) {
            Log.e("NitroModules", "Failed to load NitroModules C++ library! Is it properly installed and linked?", th);
            throw th;
        }
    }
}
