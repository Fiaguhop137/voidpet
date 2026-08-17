package com.google.android.gms.common;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.util.Log;
import android.util.TypedValue;
import android.widget.ProgressBar;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.internal.InterfaceC2318k;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;

/* JADX INFO: renamed from: com.google.android.gms.common.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C2341j extends C2342k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f31909c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Object f31907e = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final C2341j f31908f = new C2341j();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f31906d = C2342k.f31910a;

    public static C2341j o() {
        return f31908f;
    }

    @Override // com.google.android.gms.common.C2342k
    public Intent b(Context context, int i10, String str) {
        return super.b(context, i10, str);
    }

    @Override // com.google.android.gms.common.C2342k
    public PendingIntent c(Context context, int i10, int i11) {
        return super.c(context, i10, i11);
    }

    @Override // com.google.android.gms.common.C2342k
    public final String e(int i10) {
        return super.e(i10);
    }

    @Override // com.google.android.gms.common.C2342k
    public int g(Context context) {
        return super.g(context);
    }

    @Override // com.google.android.gms.common.C2342k
    public int h(Context context, int i10) {
        return super.h(context, i10);
    }

    @Override // com.google.android.gms.common.C2342k
    public final boolean j(int i10) {
        return super.j(i10);
    }

    public Dialog l(Activity activity, int i10, int i11) {
        return m(activity, i10, i11, null);
    }

    public Dialog m(Activity activity, int i10, int i11, DialogInterface.OnCancelListener onCancelListener) {
        return s(activity, i10, p170j8.G.b(activity, b(activity, i10, "d"), i11), onCancelListener, null);
    }

    public PendingIntent n(Context context, C2333b c2333b) {
        return c2333b.e4() ? c2333b.d4() : c(context, c2333b.b4(), 0);
    }

    public Task p(Activity activity) {
        int i10 = f31906d;
        p170j8.r.e("makeGooglePlayServicesAvailable must be called from the main thread");
        int iH = h(activity, i10);
        if (iH == 0) {
            return Tasks.forResult(null);
        }
        com.google.android.gms.common.api.internal.P pI = com.google.android.gms.common.api.internal.P.i(activity);
        pI.h(new C2333b(iH, null), 0);
        return pI.j();
    }

    public boolean q(Activity activity, int i10, int i11, DialogInterface.OnCancelListener onCancelListener) {
        Dialog dialogM = m(activity, i10, i11, onCancelListener);
        if (dialogM == null) {
            return false;
        }
        v(activity, dialogM, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    public void r(Context context, int i10) {
        w(context, i10, null, d(context, i10, 0, "n"));
    }

    final Dialog s(Context context, int i10, p170j8.G g10, DialogInterface.OnCancelListener onCancelListener, DialogInterface.OnClickListener onClickListener) {
        AlertDialog.Builder builder;
        AlertDialog.Builder builder2 = null;
        if (i10 == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(16843529, typedValue, true);
        if ("Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId))) {
            builder = new AlertDialog.Builder(context, 5);
        }
        if (builder2 == null) {
            builder2 = builder;
            builder2 = new AlertDialog.Builder(context);
        }
        builder2 = builder;
        builder2.setMessage(p170j8.D.c(context, i10));
        if (onCancelListener != null) {
            builder2.setOnCancelListener(onCancelListener);
        }
        String strB = p170j8.D.b(context, i10);
        DialogInterface.OnClickListener onClickListener2 = g10;
        if (strB != null) {
            if (g10 == null) {
                onClickListener2 = onClickListener;
            }
            builder2.setPositiveButton(strB, onClickListener2);
        }
        String strF = p170j8.D.f(context, i10);
        if (strF != null) {
            builder2.setTitle(strF);
        }
        Log.w("GoogleApiAvailability", String.format("Creating dialog for Google Play services availability issue. ConnectionResult=%s", Integer.valueOf(i10)), new IllegalArgumentException());
        return builder2.create();
    }

    public final Dialog t(Activity activity, DialogInterface.OnCancelListener onCancelListener) {
        ProgressBar progressBar = new ProgressBar(activity, null, 16842874);
        progressBar.setIndeterminate(true);
        progressBar.setVisibility(0);
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setView(progressBar);
        builder.setMessage(p170j8.D.c(activity, 18));
        builder.setPositiveButton("", (DialogInterface.OnClickListener) null);
        AlertDialog alertDialogCreate = builder.create();
        v(activity, alertDialogCreate, "GooglePlayServicesUpdatingDialog", onCancelListener);
        return alertDialogCreate;
    }

    public final com.google.android.gms.common.api.internal.N u(Context context, com.google.android.gms.common.api.internal.M m10) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        com.google.android.gms.common.api.internal.N n10 = new com.google.android.gms.common.api.internal.N(m10);
        I8.f.p(context, n10, intentFilter);
        n10.a(context);
        if (i(context, "com.google.android.gms")) {
            return n10;
        }
        m10.a();
        n10.b();
        return null;
    }

    final void v(Activity activity, Dialog dialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof androidx.fragment.app.j) {
                C2349s.m2(dialog, onCancelListener).l2(((androidx.fragment.app.j) activity).h0(), str);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        DialogFragmentC2334c.a(dialog, onCancelListener).show(activity.getFragmentManager(), str);
    }

    final void w(Context context, int i10, String str, PendingIntent pendingIntent) {
        int i11;
        String str2;
        Log.w("GoogleApiAvailability", String.format("GMS core API Availability. ConnectionResult=%s, tag=%s", Integer.valueOf(i10), null), new IllegalArgumentException());
        if (i10 == 18) {
            x(context);
            return;
        }
        if (pendingIntent == null) {
            if (i10 == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                return;
            }
            return;
        }
        String strE = p170j8.D.e(context, i10);
        String strD = p170j8.D.d(context, i10);
        Resources resources = context.getResources();
        NotificationManager notificationManager = (NotificationManager) p170j8.r.l(context.getSystemService("notification"));
        Y0.l.e eVarA = new Y0.l.e(context).s(true).g(true).l(strE).A(new Y0.l.c().h(strD));
        if (com.google.android.gms.common.util.i.c(context)) {
            p170j8.r.o(com.google.android.gms.common.util.m.d());
            eVarA.y(context.getApplicationInfo().icon).v(2);
            if (com.google.android.gms.common.util.i.d(context)) {
                eVarA.a(p099f8.b.f41793a, resources.getString(p099f8.c.f41812o), pendingIntent);
            } else {
                eVarA.j(pendingIntent);
            }
        } else {
            eVarA.y(17301642).C(resources.getString(p099f8.c.f41805h)).F(System.currentTimeMillis()).j(pendingIntent).k(strD);
        }
        if (com.google.android.gms.common.util.m.g()) {
            p170j8.r.o(com.google.android.gms.common.util.m.g());
            synchronized (f31907e) {
                str2 = this.f31909c;
            }
            if (str2 == null) {
                str2 = "com.google.android.gms.availability";
                NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
                String string = context.getResources().getString(p099f8.c.f41804g);
                if (notificationChannel == null) {
                    notificationManager.createNotificationChannel(AbstractC2340i.a("com.google.android.gms.availability", string, 4));
                } else if (!string.contentEquals(notificationChannel.getName())) {
                    notificationChannel.setName(string);
                    notificationManager.createNotificationChannel(notificationChannel);
                }
            }
            eVarA.h(str2);
        }
        Notification notificationD = eVarA.d();
        if (i10 == 1 || i10 == 2 || i10 == 3) {
            AbstractC2346o.f31916b.set(false);
            i11 = 10436;
        } else {
            i11 = 39789;
        }
        notificationManager.notify(i11, notificationD);
    }

    final void x(Context context) {
        new HandlerC2351u(this, context).sendEmptyMessageDelayed(1, 120000L);
    }

    public final boolean y(Activity activity, InterfaceC2318k interfaceC2318k, int i10, int i11, DialogInterface.OnCancelListener onCancelListener) {
        Dialog dialogS = s(activity, i10, p170j8.G.c(interfaceC2318k, b(activity, i10, "d"), 2), onCancelListener, null);
        if (dialogS == null) {
            return false;
        }
        v(activity, dialogS, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    public final boolean z(Context context, C2333b c2333b, int i10) {
        PendingIntent pendingIntentN;
        if (p278p8.a.a(context) || (pendingIntentN = n(context, c2333b)) == null) {
            return false;
        }
        w(context, c2333b.b4(), null, PendingIntent.getActivity(context, 0, GoogleApiActivity.a(context, pendingIntentN, i10, true), I8.g.f5091a | 134217728));
        return true;
    }
}
