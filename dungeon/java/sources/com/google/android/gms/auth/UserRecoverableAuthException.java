package com.google.android.gms.auth;

import android.app.PendingIntent;
import android.content.Intent;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepName;
import p170j8.r;

/* JADX INFO: loaded from: classes2.dex */
@KeepName
public class UserRecoverableAuthException extends p009a8.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Intent f31597a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final PendingIntent f31598b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f31599c;

    public UserRecoverableAuthException(String str, Intent intent) {
        this(str, intent, null, b.LEGACY);
    }

    private UserRecoverableAuthException(String str, Intent intent, PendingIntent pendingIntent, b bVar) {
        super(str);
        this.f31598b = pendingIntent;
        this.f31597a = intent;
        this.f31599c = (b) r.l(bVar);
    }

    public static UserRecoverableAuthException b(String str, Intent intent, PendingIntent pendingIntent) {
        r.l(intent);
        r.l(pendingIntent);
        return new UserRecoverableAuthException(str, intent, pendingIntent, b.AUTH_INSTANTIATION);
    }

    public Intent a() {
        Intent intent = this.f31597a;
        if (intent != null) {
            return new Intent(intent);
        }
        int iOrdinal = this.f31599c.ordinal();
        if (iOrdinal == 0) {
            Log.w("Auth", "Make sure that an intent was provided to class instantiation.");
            return null;
        }
        if (iOrdinal == 1) {
            Log.e("Auth", "This shouldn't happen. Gms API throwing this exception should support the recovery Intent.");
            return null;
        }
        if (iOrdinal != 2) {
            return null;
        }
        Log.e("Auth", "this instantiation of UserRecoverableAuthException doesn't support an Intent.");
        return null;
    }
}
