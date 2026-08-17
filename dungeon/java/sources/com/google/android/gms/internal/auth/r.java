package com.google.android.gms.internal.auth;

import android.net.Uri;

/* JADX INFO: loaded from: classes2.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p323s.f0 f32447a;

    r(p323s.f0 f0Var) {
        this.f32447a = f0Var;
    }

    public final String a(Uri uri, String str, String str2, String str3) {
        p323s.f0 f0Var;
        if (uri != null) {
            f0Var = (p323s.f0) this.f32447a.get(uri.toString());
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            return null;
        }
        return (String) f0Var.get("".concat(str3));
    }
}
