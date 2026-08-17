package com.facebook.react;

import com.facebook.react.bridge.Callback;

/* JADX INFO: renamed from: com.facebook.react.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C2239t implements Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2240u f30132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f30133b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String[] f30134c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int[] f30135d;

    public /* synthetic */ C2239t(C2240u c2240u, int i10, String[] strArr, int[] iArr) {
        this.f30132a = c2240u;
        this.f30133b = i10;
        this.f30134c = strArr;
        this.f30135d = iArr;
    }

    @Override // com.facebook.react.bridge.Callback
    public final void invoke(Object[] objArr) {
        this.f30132a.d(this.f30133b, this.f30134c, this.f30135d, objArr);
    }
}
