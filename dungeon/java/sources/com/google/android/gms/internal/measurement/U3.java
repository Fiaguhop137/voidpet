package com.google.android.gms.internal.measurement;

import android.net.Uri;

/* JADX INFO: loaded from: classes2.dex */
public final class U3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p323s.f0 f32740a;

    U3(p323s.f0 f0Var) {
        this.f32740a = f0Var;
    }

    public final String a(Uri uri, String str, String str2, String str3) {
        p323s.f0 f0Var = uri != null ? (p323s.f0) this.f32740a.get(uri.toString()) : null;
        if (f0Var == null) {
            return null;
        }
        return (String) f0Var.get("".concat(str3));
    }
}
