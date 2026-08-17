package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class Q3 extends ContentObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ T3 f32704a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Q3(T3 t10, Handler handler) {
        super(null);
        Objects.requireNonNull(t10);
        this.f32704a = t10;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z10) {
        this.f32704a.e();
    }
}
