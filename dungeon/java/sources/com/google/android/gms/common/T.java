package com.google.android.gms.common;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
final class T extends U {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Callable f31702f;

    /* synthetic */ T(Callable callable, byte[] bArr) {
        super(false, 1, 5, null, null, -1L, null);
        this.f31702f = callable;
    }

    @Override // com.google.android.gms.common.U
    final String a() {
        try {
            return (String) this.f31702f.call();
        } catch (Exception e10) {
            throw new RuntimeException(e10);
        }
    }
}
