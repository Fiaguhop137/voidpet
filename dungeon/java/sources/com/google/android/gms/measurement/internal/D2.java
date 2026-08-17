package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class D2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f34942a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f34943b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f34944c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ E2 f34945d;

    public D2(E2 e10, String str, String str2) {
        Objects.requireNonNull(e10);
        this.f34945d = e10;
        p170j8.r.f(str);
        this.f34942a = str;
    }

    public final String a() {
        if (!this.f34943b) {
            this.f34943b = true;
            E2 e10 = this.f34945d;
            this.f34944c = e10.p().getString(this.f34942a, null);
        }
        return this.f34944c;
    }

    public final void b(String str) {
        SharedPreferences.Editor editorEdit = this.f34945d.p().edit();
        editorEdit.putString(this.f34942a, str);
        editorEdit.apply();
        this.f34944c = str;
    }
}
