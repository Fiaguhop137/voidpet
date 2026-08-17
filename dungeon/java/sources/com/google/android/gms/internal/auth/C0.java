package com.google.android.gms.internal.auth;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public abstract class C0 extends AbstractC2357b0 {
    private static final Map zzb = new ConcurrentHashMap();
    private int zzd = -1;
    protected C2405r1 zzc = C2405r1.a();

    static C0 d(Class cls) {
        Map map = zzb;
        C0 c10 = (C0) map.get(cls);
        if (c10 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                c10 = (C0) map.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (c10 != null) {
            return c10;
        }
        C0 c11 = (C0) ((C0) A1.e(cls)).o(6, null, null);
        if (c11 == null) {
            throw new IllegalStateException();
        }
        map.put(cls, c11);
        return c11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
    
        if (r1 != false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected static com.google.android.gms.internal.auth.C0 f(com.google.android.gms.internal.auth.C0 r3, byte[] r4) throws com.google.android.gms.internal.auth.H0 {
        /*
            int r0 = r4.length
            com.google.android.gms.internal.auth.v0 r1 = com.google.android.gms.internal.auth.C2416v0.f32465b
            r2 = 0
            com.google.android.gms.internal.auth.C0 r3 = p(r3, r4, r2, r0, r1)
            if (r3 == 0) goto L44
            r4 = 1
            r0 = 0
            java.lang.Object r1 = r3.o(r4, r0, r0)
            java.lang.Byte r1 = (java.lang.Byte) r1
            byte r1 = r1.byteValue()
            if (r1 != r4) goto L19
            goto L44
        L19:
            if (r1 == 0) goto L37
            java.lang.Class r1 = r3.getClass()
            com.google.android.gms.internal.auth.h1 r2 = com.google.android.gms.internal.auth.C2376h1.a()
            com.google.android.gms.internal.auth.k1 r1 = r2.b(r1)
            boolean r1 = r1.i(r3)
            if (r4 == r1) goto L2f
            r4 = r0
            goto L30
        L2f:
            r4 = r3
        L30:
            r2 = 2
            r3.o(r2, r4, r0)
            if (r1 == 0) goto L37
            goto L44
        L37:
            com.google.android.gms.internal.auth.o1 r4 = new com.google.android.gms.internal.auth.o1
            r4.<init>(r3)
            com.google.android.gms.internal.auth.H0 r4 = r4.a()
            r4.e(r3)
            throw r4
        L44:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.C0.f(com.google.android.gms.internal.auth.C0, byte[]):com.google.android.gms.internal.auth.C0");
    }

    protected static E0 g() {
        return C2379i1.c();
    }

    static Object h(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e10);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    protected static Object i(Z0 z10, String str, Object[] objArr) {
        return new C2382j1(z10, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", objArr);
    }

    protected static void l(Class cls, C0 c10) {
        c10.k();
        zzb.put(cls, c10);
    }

    private static C0 p(C0 c10, byte[] bArr, int i10, int i11, C2416v0 c2416v0) throws H0 {
        C0 c0E = c10.e();
        try {
            InterfaceC2385k1 interfaceC2385k1B = C2376h1.a().b(c0E.getClass());
            interfaceC2385k1B.g(c0E, bArr, 0, i11, new C2366e0(c2416v0));
            interfaceC2385k1B.e(c0E);
            return c0E;
        } catch (H0 e10) {
            e10.e(c0E);
            throw e10;
        } catch (C2397o1 e11) {
            H0 h0A = e11.a();
            h0A.e(c0E);
            throw h0A;
        } catch (IOException e12) {
            if (e12.getCause() instanceof H0) {
                throw ((H0) e12.getCause());
            }
            H0 h10 = new H0(e12);
            h10.e(c0E);
            throw h10;
        } catch (IndexOutOfBoundsException unused) {
            H0 h0F = H0.f();
            h0F.e(c0E);
            throw h0F;
        }
    }

    @Override // com.google.android.gms.internal.auth.InterfaceC2355a1
    public final /* synthetic */ Z0 b() {
        return (C0) o(6, null, null);
    }

    final int c() {
        return C2376h1.a().b(getClass()).c(this);
    }

    final C0 e() {
        return (C0) o(4, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return C2376h1.a().b(getClass()).f(this, (C0) obj);
    }

    public final int hashCode() {
        if (n()) {
            return c();
        }
        int i10 = this.zza;
        if (i10 != 0) {
            return i10;
        }
        int iC = c();
        this.zza = iC;
        return iC;
    }

    protected final void j() {
        C2376h1.a().b(getClass()).e(this);
        k();
    }

    final void k() {
        this.zzd &= Integer.MAX_VALUE;
    }

    final void m(int i10) {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    final boolean n() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    protected abstract Object o(int i10, Object obj, Object obj2);

    public final String toString() {
        return AbstractC2358b1.a(this, super.toString());
    }
}
