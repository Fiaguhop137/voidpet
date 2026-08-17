package com.google.android.gms.measurement.internal;

import com.google.android.gms.tasks.OnFailureListener;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.l2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class C2997l2 implements OnFailureListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ C3004m2 f35653a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ long f35654b;

    /* synthetic */ C2997l2(C3004m2 c3004m2, long j10) {
        this.f35653a = c3004m2;
        this.f35654b = j10;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final /* synthetic */ void onFailure(Exception exc) {
        this.f35653a.c(this.f35654b, exc);
    }
}
