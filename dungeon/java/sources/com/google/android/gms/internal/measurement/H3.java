package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import android.net.Uri;

/* JADX INFO: loaded from: classes2.dex */
public abstract class H3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final J3 f32514a;

    static {
        Uri uri = I3.f32535a;
        f32514a = K3.b();
    }

    public static String a(ContentResolver contentResolver, String str, String str2) {
        return f32514a.a(contentResolver, str, null);
    }
}
