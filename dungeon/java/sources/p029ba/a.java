package p029ba;

import T9.c;
import Z0.b;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f26449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SharedPreferences f26450b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c f26451c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f26452d;

    public a(Context context, String str, c cVar) {
        Context contextA = a(context);
        this.f26449a = contextA;
        this.f26450b = contextA.getSharedPreferences("com.google.firebase.common.prefs:" + str, 0);
        this.f26451c = cVar;
        this.f26452d = c();
    }

    private static Context a(Context context) {
        return b.b(context);
    }

    private boolean c() {
        return this.f26450b.contains("firebase_data_collection_default_enabled") ? this.f26450b.getBoolean("firebase_data_collection_default_enabled", true) : d();
    }

    private boolean d() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            PackageManager packageManager = this.f26449a.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(this.f26449a.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_data_collection_default_enabled")) {
                return true;
            }
            return applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }

    private synchronized void f(boolean z10) {
        if (this.f26452d != z10) {
            this.f26452d = z10;
            this.f26451c.c(new T9.a(H9.b.class, new H9.b(z10)));
        }
    }

    public synchronized boolean b() {
        return this.f26452d;
    }

    public synchronized void e(Boolean bool) {
        try {
            if (bool == null) {
                this.f26450b.edit().remove("firebase_data_collection_default_enabled").apply();
                f(d());
            } else {
                boolean zEquals = Boolean.TRUE.equals(bool);
                this.f26450b.edit().putBoolean("firebase_data_collection_default_enabled", zEquals).apply();
                f(zEquals);
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
