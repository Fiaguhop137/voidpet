package com.google.firebase.messaging;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ExecutionException;
import p117g8.C3431c;

/* JADX INFO: loaded from: classes2.dex */
class E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final H9.e f37457a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final J f37458b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C3431c f37459c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final W9.b f37460d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final W9.b f37461e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final X9.e f37462f;

    E(H9.e eVar, J j10, W9.b bVar, W9.b bVar2, X9.e eVar2) {
        this(eVar, j10, new C3431c(eVar.l()), bVar, bVar2, eVar2);
    }

    E(H9.e eVar, J j10, C3431c c3431c, W9.b bVar, W9.b bVar2, X9.e eVar2) {
        this.f37457a = eVar;
        this.f37458b = j10;
        this.f37459c = c3431c;
        this.f37460d = bVar;
        this.f37461e = bVar2;
        this.f37462f = eVar2;
    }

    public static /* synthetic */ String a(E e10, Task task) {
        e10.getClass();
        return e10.h((Bundle) task.getResult(IOException.class));
    }

    private static String b(byte[] bArr) {
        return Base64.encodeToString(bArr, 11);
    }

    private Task d(Task task) {
        return task.continueWith(new androidx.privacysandbox.ads.adservices.measurement.k(), new D(this));
    }

    private String e() {
        try {
            return b(MessageDigest.getInstance("SHA-1").digest(this.f37457a.p().getBytes()));
        } catch (NoSuchAlgorithmException unused) {
            return "[HASH-ERROR]";
        }
    }

    private String h(Bundle bundle) throws IOException {
        if (bundle == null) {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
        String string = bundle.getString("registration_id");
        if (string != null) {
            return string;
        }
        String string2 = bundle.getString("unregistered");
        if (string2 != null) {
            return string2;
        }
        String string3 = bundle.getString("error");
        if ("RST".equals(string3)) {
            throw new IOException("INSTANCE_ID_RESET");
        }
        if (string3 != null) {
            throw new IOException(string3);
        }
        Log.w("FirebaseMessaging", "Unexpected response: " + bundle, new Throwable());
        throw new IOException("SERVICE_NOT_AVAILABLE");
    }

    static boolean i(String str) {
        return "SERVICE_NOT_AVAILABLE".equals(str) || "INTERNAL_SERVER_ERROR".equals(str) || "InternalServerError".equals(str);
    }

    private void j(String str, String str2, Bundle bundle) {
        U9.j.a aVarB;
        bundle.putString("scope", str2);
        bundle.putString("sender", str);
        bundle.putString("subtype", str);
        bundle.putString("gmp_app_id", this.f37457a.q().c());
        bundle.putString("gmsv", Integer.toString(this.f37458b.d()));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", this.f37458b.a());
        bundle.putString("app_ver_name", this.f37458b.b());
        bundle.putString("firebase-app-name-hash", e());
        try {
            String strB = ((com.google.firebase.installations.g) Tasks.await(this.f37462f.a(false))).b();
            if (TextUtils.isEmpty(strB)) {
                Log.w("FirebaseMessaging", "FIS auth token is empty");
            } else {
                bundle.putString("Goog-Firebase-Installations-Auth", strB);
            }
        } catch (InterruptedException e10) {
            e = e10;
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e);
        } catch (ExecutionException e11) {
            e = e11;
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e);
        }
        bundle.putString("appid", (String) Tasks.await(this.f37462f.getId()));
        bundle.putString("cliv", "fcm-25.0.1");
        U9.j jVar = (U9.j) this.f37461e.get();
        p083ea.i iVar = (p083ea.i) this.f37460d.get();
        if (jVar == null || iVar == null || (aVarB = jVar.b("fire-iid")) == U9.j.a.NONE) {
            return;
        }
        bundle.putString("Firebase-Client-Log-Type", Integer.toString(aVarB.g()));
        bundle.putString("Firebase-Client", iVar.a());
    }

    private Task l(String str, String str2, Bundle bundle) {
        try {
            j(str, str2, bundle);
            return this.f37459c.c(bundle);
        } catch (InterruptedException | ExecutionException e10) {
            return Tasks.forException(e10);
        }
    }

    Task c() {
        Bundle bundle = new Bundle();
        bundle.putString("delete", "1");
        return d(l(J.c(this.f37457a), "*", bundle));
    }

    Task f() {
        return this.f37459c.a();
    }

    Task g() {
        return d(l(J.c(this.f37457a), "*", new Bundle()));
    }

    Task k(boolean z10) {
        return this.f37459c.d(z10);
    }

    Task m(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str2);
        return d(l(str, "/topics/" + str2, bundle));
    }

    Task n(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str2);
        bundle.putString("delete", "1");
        return d(l(str, "/topics/" + str2, bundle));
    }
}
