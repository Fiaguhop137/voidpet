package com.google.android.gms.internal.auth;

import android.os.Binder;

/* JADX INFO: renamed from: com.google.android.gms.internal.auth.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC2406s {
    public static Object a(InterfaceC2409t interfaceC2409t) {
        try {
            return interfaceC2409t.zza();
        } catch (SecurityException unused) {
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            try {
                return interfaceC2409t.zza();
            } finally {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
            }
        }
    }
}
