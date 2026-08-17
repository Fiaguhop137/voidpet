package p278p8;

import android.content.Context;
import com.google.android.gms.common.util.m;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Context f50861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Boolean f50862b;

    public static synchronized boolean a(Context context) {
        Boolean bool;
        Context applicationContext = context.getApplicationContext();
        Context context2 = f50861a;
        if (context2 != null && (bool = f50862b) != null && context2 == applicationContext) {
            return bool.booleanValue();
        }
        f50862b = null;
        if (m.g()) {
            f50862b = Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
        } else {
            try {
                context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                f50862b = Boolean.TRUE;
            } catch (ClassNotFoundException unused) {
                f50862b = Boolean.FALSE;
            }
        }
        f50861a = applicationContext;
        return f50862b.booleanValue();
    }
}
