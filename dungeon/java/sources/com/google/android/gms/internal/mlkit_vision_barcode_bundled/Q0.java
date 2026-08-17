package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Q0 extends AbstractC2782z0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Logger f33364b = Logger.getLogger(Q0.class.getName());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final boolean f33365c = AbstractC2774x2.C();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    R0 f33366a;

    /* synthetic */ Q0(P0 p10) {
    }

    public static int A(L1 l10) {
        int iY = l10.y();
        return a(iY) + iY;
    }

    static int B(L1 l10, InterfaceC2675d2 interfaceC2675d2) {
        int iA = ((AbstractC2757u0) l10).a(interfaceC2675d2);
        return a(iA) + iA;
    }

    public static int C(String str) {
        int length;
        try {
            length = D2.e(str);
        } catch (C2 unused) {
            length = str.getBytes(AbstractC2743r1.f34292a).length;
        }
        return a(length) + length;
    }

    public static int a(int i10) {
        return (352 - (Integer.numberOfLeadingZeros(i10) * 9)) >>> 6;
    }

    public static int b(long j10) {
        return (640 - (Long.numberOfLeadingZeros(j10) * 9)) >>> 6;
    }

    static int z(int i10, L1 l10, InterfaceC2675d2 interfaceC2675d2) {
        int iA = a(i10 << 3);
        return iA + iA + ((AbstractC2757u0) l10).a(interfaceC2675d2);
    }

    public final void c() {
        if (f() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    final void d(String str, C2 c10) throws O0 {
        f33364b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) c10);
        byte[] bytes = str.getBytes(AbstractC2743r1.f34292a);
        try {
            int length = bytes.length;
            w(length);
            p(bytes, 0, length);
        } catch (IndexOutOfBoundsException e10) {
            throw new O0(e10);
        }
    }

    public abstract int f();

    public abstract void g(byte b10);

    public abstract void h(int i10, boolean z10);

    public abstract void i(int i10, I0 i11);

    public abstract void j(int i10, int i11);

    public abstract void k(int i10);

    public abstract void l(int i10, long j10);

    public abstract void m(long j10);

    public abstract void n(int i10, int i11);

    public abstract void o(int i10);

    public abstract void p(byte[] bArr, int i10, int i11);

    abstract void q(int i10, L1 l10, InterfaceC2675d2 interfaceC2675d2);

    public abstract void r(int i10, L1 l10);

    public abstract void s(int i10, I0 i11);

    public abstract void t(int i10, String str);

    public abstract void u(int i10, int i11);

    public abstract void v(int i10, int i11);

    public abstract void w(int i10);

    public abstract void x(int i10, long j10);

    public abstract void y(long j10);
}
