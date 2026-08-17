package com.google.android.gms.internal.auth;

import android.net.Uri;
import p323s.C4101a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final C4101a f32200a = new C4101a();

    public static synchronized Uri a(String str) {
        C4101a c4101a = f32200a;
        Uri uri = (Uri) c4101a.get("com.google.android.gms.auth_account");
        if (uri != null) {
            return uri;
        }
        Uri uri2 = Uri.parse("content://com.google.android.gms.phenotype/".concat(String.valueOf(Uri.encode("com.google.android.gms.auth_account"))));
        c4101a.put("com.google.android.gms.auth_account", uri2);
        return uri2;
    }
}
