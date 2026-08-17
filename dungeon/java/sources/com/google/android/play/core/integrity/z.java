package com.google.android.play.core.integrity;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
abstract class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static w f37297a;

    static synchronized w a(Context context) {
        try {
            if (f37297a == null) {
                v vVar = new v(null);
                vVar.b(p459z9.h.a(context));
                f37297a = vVar.a();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f37297a;
    }
}
