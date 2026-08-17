package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class B2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f34875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f34876b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f34877c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f34878d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ E2 f34879e;

    public B2(E2 e10, String str, long j10) {
        Objects.requireNonNull(e10);
        this.f34879e = e10;
        p170j8.r.f(str);
        this.f34875a = str;
        this.f34876b = j10;
    }

    public final long a() {
        if (!this.f34877c) {
            this.f34877c = true;
            E2 e10 = this.f34879e;
            this.f34878d = e10.p().getLong(this.f34875a, this.f34876b);
        }
        return this.f34878d;
    }

    public final void b(long j10) {
        SharedPreferences.Editor editorEdit = this.f34879e.p().edit();
        editorEdit.putLong(this.f34875a, j10);
        editorEdit.apply();
        this.f34878d = j10;
    }
}
