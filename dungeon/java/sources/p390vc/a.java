package p390vc;

import android.app.NotificationManager;
import android.content.Context;
import android.util.Log;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import p285pf.b;
import p285pf.c;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f56339a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f56340b;

    private a() {
    }

    private final void b(int i10) {
        synchronized (this) {
            f56340b = i10;
            Unit unit = Unit.f48228a;
        }
    }

    public final int a() {
        int i10;
        synchronized (this) {
            i10 = f56340b;
        }
        return i10;
    }

    public final boolean c(Context context, int i10) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            if (i10 == 0) {
                Object systemService = context.getSystemService("notification");
                Intrinsics.d(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
                ((NotificationManager) systemService).cancelAll();
            } else {
                c.a(context.getApplicationContext(), i10);
            }
            f56339a.b(i10);
            return true;
        } catch (b e10) {
            Log.d("expo-notifications", "Could not have set badge count: " + e10.getMessage(), e10);
            e10.printStackTrace();
            return false;
        }
    }
}
