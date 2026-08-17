package com.google.android.gms.internal.measurement;

import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
public abstract class N4 extends AbstractC2654z4 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Logger f32663b = Logger.getLogger(N4.class.getName());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final boolean f32664c = AbstractC2498h6.f();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f32665d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    O4 f32666a;

    /* synthetic */ N4(byte[] bArr) {
    }

    public static int E(int i10) {
        return (352 - (Integer.numberOfLeadingZeros(i10) * 9)) >>> 6;
    }

    public static int a(long j10) {
        return (640 - (Long.numberOfLeadingZeros(j10) * 9)) >>> 6;
    }

    public static int b(String str) {
        int length;
        try {
            length = AbstractC2525k6.b(str);
        } catch (C2516j6 unused) {
            length = str.getBytes(AbstractC2524k5.f32965a).length;
        }
        return E(length) + length;
    }

    public static int c(E5 e10) {
        int iB = e10.b();
        return E(iB) + iB;
    }

    static int d(E5 e10, P5 p10) {
        int iF = ((AbstractC2612u4) e10).f(p10);
        return E(iF) + iF;
    }

    static int g(int i10, E5 e10, P5 p10) {
        int iE = E(i10 << 3);
        return iE + iE + ((AbstractC2612u4) e10).f(p10);
    }

    public abstract void A(long j10);

    public abstract void B(byte[] bArr, int i10, int i11);

    public abstract void C(String str);

    public abstract int D();

    public final void e() {
        if (D() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    final void f(String str, C2516j6 c2516j6) throws M4 {
        f32663b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) c2516j6);
        byte[] bytes = str.getBytes(AbstractC2524k5.f32965a);
        try {
            int length = bytes.length;
            x(length);
            B(bytes, 0, length);
        } catch (IndexOutOfBoundsException e10) {
            throw new M4(e10);
        }
    }

    public abstract void i(int i10, int i11);

    public abstract void j(int i10, int i11);

    public abstract void k(int i10, int i11);

    public abstract void l(int i10, int i11);

    public abstract void m(int i10, long j10);

    public abstract void n(int i10, long j10);

    public abstract void o(int i10, boolean z10);

    public abstract void p(int i10, String str);

    public abstract void q(int i10, I4 i11);

    public abstract void r(I4 i10);

    abstract void s(byte[] bArr, int i10, int i11);

    abstract void t(int i10, E5 e10, P5 p10);

    public abstract void u(E5 e10);

    public abstract void v(byte b10);

    public abstract void w(int i10);

    public abstract void x(int i10);

    public abstract void y(int i10);

    public abstract void z(long j10);
}
