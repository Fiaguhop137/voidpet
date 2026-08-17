package com.google.android.gms.internal.auth;

import android.database.ContentObserver;
import android.os.Handler;

/* JADX INFO: renamed from: com.google.android.gms.internal.auth.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2398p extends ContentObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ C2401q f32433a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C2398p(C2401q c2401q, Handler handler) {
        super(null);
        this.f32433a = c2401q;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z10) {
        this.f32433a.e();
    }
}
