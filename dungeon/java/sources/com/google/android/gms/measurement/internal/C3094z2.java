package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.z2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3094z2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f36045a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f36046b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f36047c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f36048d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ E2 f36049e;

    public C3094z2(E2 e10, String str, boolean z10) {
        Objects.requireNonNull(e10);
        this.f36049e = e10;
        p170j8.r.f(str);
        this.f36045a = str;
        this.f36046b = z10;
    }

    public final boolean a() {
        if (!this.f36047c) {
            this.f36047c = true;
            E2 e10 = this.f36049e;
            this.f36048d = e10.p().getBoolean(this.f36045a, this.f36046b);
        }
        return this.f36048d;
    }

    public final void b(boolean z10) {
        SharedPreferences.Editor editorEdit = this.f36049e.p().edit();
        editorEdit.putBoolean(this.f36045a, z10);
        editorEdit.apply();
        this.f36048d = z10;
    }
}
