package p170j8;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import p278p8.d;

/* JADX INFO: loaded from: classes2.dex */
public abstract class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f46935a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f46936b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static String f46937c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f46938d;

    public static int a(Context context) {
        b(context);
        return f46938d;
    }

    private static void b(Context context) {
        synchronized (f46935a) {
            try {
                if (f46936b) {
                    return;
                }
                f46936b = true;
                try {
                    Bundle bundle = d.a(context).c(context.getPackageName(), 128).metaData;
                    if (bundle == null) {
                        return;
                    }
                    f46937c = bundle.getString("com.google.app.id");
                    f46938d = bundle.getInt("com.google.android.gms.version");
                } catch (PackageManager.NameNotFoundException e10) {
                    Log.wtf("MetadataValueReader", "This should never happen.", e10);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
