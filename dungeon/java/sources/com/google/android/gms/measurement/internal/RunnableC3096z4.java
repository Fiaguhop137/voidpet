package com.google.android.gms.measurement.internal;

import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.z4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class RunnableC3096z4 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ A4 f36053a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f36054b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final /* synthetic */ Exception f36055c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final /* synthetic */ byte[] f36056d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final /* synthetic */ Map f36057e;

    /* synthetic */ RunnableC3096z4(A4 a10, int i10, Exception exc, byte[] bArr, Map map) {
        this.f36053a = a10;
        this.f36054b = i10;
        this.f36055c = exc;
        this.f36056d = bArr;
        this.f36057e = map;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        this.f36053a.a(this.f36054b, this.f36055c, this.f36056d, this.f36057e);
    }
}
