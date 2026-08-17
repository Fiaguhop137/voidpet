package com.google.android.gms.common;

import android.os.RemoteException;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import p170j8.A0;
import p170j8.z0;

/* JADX INFO: loaded from: classes2.dex */
abstract class E extends z0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f31660e;

    protected E(byte[] bArr) {
        p170j8.r.a(bArr.length == 25);
        this.f31660e = Arrays.hashCode(bArr);
    }

    protected static byte[] c1(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e10) {
            throw new AssertionError(e10);
        }
    }

    @Override // p170j8.A0
    public final p314r8.a a() {
        return p314r8.b.c1(k());
    }

    @Override // p170j8.A0
    public final int b() {
        return this.f31660e;
    }

    public final boolean equals(Object obj) {
        p314r8.a aVarA;
        if (!(obj instanceof A0)) {
            return false;
        }
        try {
            A0 a10 = (A0) obj;
            if (a10.b() == this.f31660e && (aVarA = a10.a()) != null) {
                return Arrays.equals(k(), (byte[]) p314r8.b.k(aVarA));
            }
            return false;
        } catch (RemoteException e10) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e10);
            return false;
        }
    }

    public final int hashCode() {
        return this.f31660e;
    }

    abstract byte[] k();
}
