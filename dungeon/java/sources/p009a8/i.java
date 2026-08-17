package p009a8;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.auth.TokenData;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.android.gms.common.AbstractC2346o;
import com.google.android.gms.common.C2341j;
import com.google.android.gms.common.C2343l;
import com.google.android.gms.common.C2344m;
import com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException;
import com.google.android.gms.common.ServiceConnectionC2307a;
import com.google.android.gms.internal.auth.AbstractBinderC2384k0;
import com.google.android.gms.internal.auth.AbstractC2403q1;
import com.google.android.gms.internal.auth.C2371g;
import com.google.android.gms.internal.auth.EnumC2377i;
import com.google.android.gms.internal.auth.I1;
import com.google.android.gms.internal.auth.InterfaceC2361c1;
import com.google.android.gms.internal.auth.L1;
import com.google.android.gms.internal.auth.M;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeoutException;
import p135h8.b;
import p170j8.AbstractC3844i;
import p170j8.r;
import p224m8.a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f19545a = {"com.google", "com.google.work", "cn.google"};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f19546b = "androidPackageName";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final ComponentName f19547c = new ComponentName("com.google.android.gms", "com.google.android.gms.auth.GetToken");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final a f19548d = d.a("GoogleAuthUtil");

    public static void a(Context context, String str) throws a, IOException {
        g(context, str, 0L);
    }

    public static String b(Context context, Account account, String str) {
        return c(context, account, str, new Bundle());
    }

    public static String c(Context context, Account account, String str, Bundle bundle) {
        p(account);
        return d(context, account, str, bundle, 0L, null).zza();
    }

    public static TokenData d(Context context, Account account, String str, Bundle bundle, long j10, Executor executor) throws a, IOException {
        r.k("Calling this from your main thread can lead to deadlock");
        r.g(str, "Scope cannot be empty or null.");
        p(account);
        l(context, 8400000);
        Bundle bundle2 = bundle == null ? new Bundle() : new Bundle(bundle);
        n(context, bundle2);
        M.d(context);
        if (L1.c() && q(context)) {
            try {
                Bundle bundle3 = (Bundle) j(AbstractC2403q1.a(context).c(account, str, bundle2), "token retrieval");
                k(bundle3);
                return h(context, "getTokenWithDetails", bundle3);
            } catch (b e10) {
                m(e10, "token retrieval");
            }
        }
        return (TokenData) i(context, f19547c, new f(account, str, bundle2, context), 0L, null);
    }

    static /* synthetic */ TokenData e(Account account, String str, Bundle bundle, Context context, IBinder iBinder) throws IOException {
        Bundle bundleM0 = AbstractBinderC2384k0.h(iBinder).m0(account, str, bundle);
        if (bundleM0 != null) {
            return h(context, "getTokenWithDetails", bundleM0);
        }
        throw new IOException("Service call returned null");
    }

    static /* bridge */ /* synthetic */ Object f(Object obj) throws IOException {
        k(obj);
        return obj;
    }

    public static void g(Context context, String str, long j10) throws a, IOException {
        r.k("Calling this from your main thread can lead to deadlock");
        l(context, 8400000);
        Bundle bundle = new Bundle();
        n(context, bundle);
        M.d(context);
        if (L1.c() && q(context)) {
            InterfaceC2361c1 interfaceC2361c1A = AbstractC2403q1.a(context);
            C2371g c2371g = new C2371g();
            c2371g.a4(str);
            try {
                j(interfaceC2361c1A.b(c2371g), "clear token");
                return;
            } catch (b e10) {
                m(e10, "clear token");
            }
        }
        i(context, f19547c, new g(str, bundle), 0L, null);
    }

    private static TokenData h(Context context, String str, Bundle bundle) throws a, IOException {
        TokenData tokenData;
        Parcelable.Creator<TokenData> creator = TokenData.CREATOR;
        ClassLoader classLoader = TokenData.class.getClassLoader();
        if (classLoader != null) {
            bundle.setClassLoader(classLoader);
        }
        Bundle bundle2 = bundle.getBundle("tokenDetails");
        if (bundle2 == null) {
            tokenData = null;
        } else {
            if (classLoader != null) {
                bundle2.setClassLoader(classLoader);
            }
            tokenData = (TokenData) bundle2.getParcelable("TokenData");
        }
        if (tokenData != null) {
            return tokenData;
        }
        o(context, "getTokenWithDetails", bundle.getString("Error"), (Intent) bundle.getParcelable("userRecoveryIntent"), (PendingIntent) bundle.getParcelable("userRecoveryPendingIntent"));
        throw new a("Invalid state. Shouldn't happen");
    }

    private static Object i(Context context, ComponentName componentName, h hVar, long j10, Executor executor) throws IOException {
        ServiceConnectionC2307a serviceConnectionC2307a = new ServiceConnectionC2307a();
        AbstractC3844i abstractC3844iB = AbstractC3844i.b(context);
        try {
            try {
                if (!abstractC3844iB.a(componentName, serviceConnectionC2307a, "GoogleAuthUtil", null)) {
                    throw new IOException("Could not bind to service.");
                }
                try {
                    Object objA = hVar.a(serviceConnectionC2307a.a());
                    abstractC3844iB.d(componentName, serviceConnectionC2307a, "GoogleAuthUtil");
                    return objA;
                } catch (RemoteException | InterruptedException | TimeoutException e10) {
                    Log.i("GoogleAuthUtil", "Error on service connection.", e10);
                    throw new IOException("Error on service connection.", e10);
                }
            } catch (Throwable th) {
                abstractC3844iB.d(componentName, serviceConnectionC2307a, "GoogleAuthUtil");
                throw th;
            }
        } catch (SecurityException e11) {
            Log.w("GoogleAuthUtil", String.format("SecurityException while bind to auth service: %s", e11.getMessage()));
            throw new IOException("SecurityException while binding to Auth service.", e11);
        }
    }

    private static Object j(Task task, String str) throws b, IOException {
        try {
            return Tasks.await(task);
        } catch (InterruptedException e10) {
            String str2 = String.format("Interrupted while waiting for the task of %s to finish.", str);
            f19548d.e(str2, new Object[0]);
            throw new IOException(str2, e10);
        } catch (CancellationException e11) {
            String str3 = String.format("Canceled while waiting for the task of %s to finish.", str);
            f19548d.e(str3, new Object[0]);
            throw new IOException(str3, e11);
        } catch (ExecutionException e12) {
            Throwable cause = e12.getCause();
            if (cause instanceof b) {
                throw ((b) cause);
            }
            String str4 = String.format("Unable to get a result for %s due to ExecutionException.", str);
            f19548d.e(str4, new Object[0]);
            throw new IOException(str4, e12);
        }
    }

    private static Object k(Object obj) throws IOException {
        if (obj != null) {
            return obj;
        }
        f19548d.e("Service call returned null.", new Object[0]);
        throw new IOException("Service unavailable.");
    }

    private static void l(Context context, int i10) throws a {
        try {
            AbstractC2346o.a(context.getApplicationContext(), i10);
        } catch (GooglePlayServicesIncorrectManifestValueException | C2343l e10) {
            throw new a(e10.getMessage(), e10);
        } catch (C2344m e11) {
            throw new c(e11.b(), e11.getMessage(), e11.a());
        }
    }

    private static void m(b bVar, String str) {
        f19548d.e("%s failed via GoogleAuthServiceClient, falling back to previous approach:\n%s", str, Log.getStackTraceString(bVar));
    }

    private static void n(Context context, Bundle bundle) {
        String str = context.getApplicationInfo().packageName;
        bundle.putString("clientPackageName", str);
        String str2 = f19546b;
        if (TextUtils.isEmpty(bundle.getString(str2))) {
            bundle.putString(str2, str);
        }
        bundle.putLong("service_connection_start_time_millis", SystemClock.elapsedRealtime());
    }

    private static void o(Context context, String str, String str2, Intent intent, PendingIntent pendingIntent) throws a, IOException {
        EnumC2377i enumC2377iE = EnumC2377i.e(str2);
        a aVar = f19548d;
        aVar.e(String.format("[GoogleAuthUtil] error status:%s with method:%s", enumC2377iE, str), new Object[0]);
        if (!EnumC2377i.BAD_AUTHENTICATION.equals(enumC2377iE) && !EnumC2377i.CAPTCHA.equals(enumC2377iE) && !EnumC2377i.NEED_PERMISSION.equals(enumC2377iE) && !EnumC2377i.NEED_REMOTE_CONSENT.equals(enumC2377iE) && !EnumC2377i.NEEDS_BROWSER.equals(enumC2377iE) && !EnumC2377i.USER_CANCEL.equals(enumC2377iE) && !EnumC2377i.DEVICE_MANAGEMENT_REQUIRED.equals(enumC2377iE) && !EnumC2377i.DM_INTERNAL_ERROR.equals(enumC2377iE) && !EnumC2377i.DM_SYNC_DISABLED.equals(enumC2377iE) && !EnumC2377i.DM_ADMIN_BLOCKED.equals(enumC2377iE) && !EnumC2377i.DM_ADMIN_PENDING_APPROVAL.equals(enumC2377iE) && !EnumC2377i.DM_STALE_SYNC_REQUIRED.equals(enumC2377iE) && !EnumC2377i.DM_DEACTIVATED.equals(enumC2377iE) && !EnumC2377i.DM_REQUIRED.equals(enumC2377iE) && !EnumC2377i.THIRD_PARTY_DEVICE_MANAGEMENT_REQUIRED.equals(enumC2377iE) && !EnumC2377i.DM_SCREENLOCK_REQUIRED.equals(enumC2377iE)) {
            if (!EnumC2377i.NETWORK_ERROR.equals(enumC2377iE) && !EnumC2377i.SERVICE_UNAVAILABLE.equals(enumC2377iE) && !EnumC2377i.INTNERNAL_ERROR.equals(enumC2377iE) && !EnumC2377i.AUTH_SECURITY_ERROR.equals(enumC2377iE) && !EnumC2377i.ACCOUNT_NOT_PRESENT.equals(enumC2377iE)) {
                throw new a(str2);
            }
            throw new IOException(str2);
        }
        M.d(context);
        if (!I1.b()) {
            throw new UserRecoverableAuthException(str2, intent);
        }
        if (pendingIntent != null && intent != null) {
            throw UserRecoverableAuthException.b(str2, intent, pendingIntent);
        }
        if (C2341j.o().a(context) >= Integer.MAX_VALUE && pendingIntent == null) {
            aVar.b(String.format("Recovery PendingIntent is missing on current Gms version: %s for method: %s. It should always be present on or above Gms version %s. This indicates a bug in Gms implementation.", Integer.MAX_VALUE, str, Integer.MAX_VALUE), new Object[0]);
        }
        if (intent == null) {
            aVar.b(String.format("no recovery Intent found with status=%s for method=%s. This shouldn't happen", str2, str), new Object[0]);
        }
        throw new UserRecoverableAuthException(str2, intent);
    }

    private static void p(Account account) {
        if (account == null) {
            throw new IllegalArgumentException("Account cannot be null");
        }
        if (TextUtils.isEmpty(account.name)) {
            throw new IllegalArgumentException("Account name cannot be empty!");
        }
        String[] strArr = f19545a;
        for (int i10 = 0; i10 < 3; i10++) {
            if (strArr[i10].equals(account.type)) {
                return;
            }
        }
        throw new IllegalArgumentException("Account type not supported");
    }

    private static boolean q(Context context) {
        if (C2341j.o().h(context, 17895000) != 0) {
            return false;
        }
        List listS = L1.a().s();
        String str = context.getApplicationInfo().packageName;
        Iterator it = listS.iterator();
        while (it.hasNext()) {
            if (((String) it.next()).equals(str)) {
                return false;
            }
        }
        return true;
    }
}
