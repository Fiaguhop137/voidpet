package com.google.android.gms.internal.measurement;

import android.net.Uri;
import p323s.C4101a;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.d4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2460d4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final C4101a f32889a = new C4101a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f32890b = 0;

    public static synchronized Uri a(String str) {
        C4101a c4101a = f32889a;
        Uri uri = (Uri) c4101a.get("com.google.android.gms.measurement");
        if (uri != null) {
            return uri;
        }
        Uri uri2 = Uri.parse("content://com.google.android.gms.phenotype/".concat(String.valueOf(Uri.encode("com.google.android.gms.measurement"))));
        c4101a.put("com.google.android.gms.measurement", uri2);
        return uri2;
    }
}
