package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class L3 extends ContentObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ N3 f32565a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    L3(N3 n10, Handler handler) {
        super(null);
        Objects.requireNonNull(n10);
        this.f32565a = n10;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z10) {
        this.f32565a.b().set(true);
    }
}
