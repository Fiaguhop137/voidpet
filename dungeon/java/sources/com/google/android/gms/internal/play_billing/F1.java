package com.google.android.gms.internal.play_billing;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public abstract class F1 extends Y0 {
    private static final Map zzb = new ConcurrentHashMap();
    private int zzd = -1;
    protected C2882t2 zzc = C2882t2.c();

    protected static Object A(InterfaceC2799c2 interfaceC2799c2, String str, Object[] objArr) {
        return new C2844l2(interfaceC2799c2, str, objArr);
    }

    protected static void f(Class cls, F1 f10) {
        f10.e();
        zzb.put(cls, f10);
    }

    private final int i(InterfaceC2849m2 interfaceC2849m2) {
        return C2834j2.a().b(getClass()).c(this);
    }

    private static F1 j(F1 f10, byte[] bArr, int i10, int i11, C2897x1 c2897x1) throws O1 {
        if (i11 == 0) {
            return f10;
        }
        F1 f1T = f10.t();
        try {
            InterfaceC2849m2 interfaceC2849m2B = C2834j2.a().b(f1T.getClass());
            interfaceC2849m2B.h(f1T, bArr, 0, i11, new C2793b1(c2897x1));
            interfaceC2849m2B.e(f1T);
            return f1T;
        } catch (O1 e10) {
            throw e10;
        } catch (C2873r2 e11) {
            throw e11.a();
        } catch (IOException e12) {
            if (e12.getCause() instanceof O1) {
                throw ((O1) e12.getCause());
            }
            throw new O1(e12);
        } catch (IndexOutOfBoundsException unused) {
            throw new O1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    private static final boolean l(F1 f10, boolean z10) {
        byte bByteValue = ((Byte) f10.m(1, null, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zD = C2834j2.a().b(f10.getClass()).d(f10);
        if (z10) {
            f10.m(2, true != zD ? null : f10, null);
        }
        return zD;
    }

    static F1 s(Class cls) {
        Map map = zzb;
        F1 f10 = (F1) map.get(cls);
        if (f10 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                f10 = (F1) map.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (f10 != null) {
            return f10;
        }
        F1 f11 = (F1) ((F1) AbstractC2906z2.j(cls)).m(6, null, null);
        if (f11 == null) {
            throw new IllegalStateException();
        }
        map.put(cls, f11);
        return f11;
    }

    protected static F1 u(F1 f10, byte[] bArr) throws O1 {
        int length = bArr.length;
        C2897x1 c2897x1 = C2897x1.f34821b;
        int i10 = AbstractC2788a1.f34683a;
        F1 f1J = j(f10, bArr, 0, length, C2897x1.f34821b);
        if (f1J == null || l(f1J, true)) {
            return f1J;
        }
        throw new C2873r2(f1J).a();
    }

    protected static J1 v() {
        return G1.e();
    }

    protected static K1 w() {
        return C2839k2.c();
    }

    static Object y(Method method, Object obj, Object... objArr) {
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

    protected final void B() {
        C2834j2.a().b(getClass()).e(this);
        e();
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC2799c2
    public final void b(AbstractC2881t1 abstractC2881t1) {
        C2834j2.a().b(getClass()).i(this, C2885u1.K(abstractC2881t1));
    }

    @Override // com.google.android.gms.internal.play_billing.Y0
    final int c(InterfaceC2849m2 interfaceC2849m2) {
        if (h()) {
            int iC = interfaceC2849m2.c(this);
            if (iC >= 0) {
                return iC;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + iC);
        }
        int i10 = this.zzd & Integer.MAX_VALUE;
        if (i10 != Integer.MAX_VALUE) {
            return i10;
        }
        int iC2 = interfaceC2849m2.c(this);
        if (iC2 >= 0) {
            this.zzd = (this.zzd & Integer.MIN_VALUE) | iC2;
            return iC2;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + iC2);
    }

    final void e() {
        this.zzd &= Integer.MAX_VALUE;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return C2834j2.a().b(getClass()).g(this, (F1) obj);
    }

    final void g(int i10) {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    final boolean h() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    public final int hashCode() {
        if (h()) {
            return n();
        }
        int i10 = this.zza;
        if (i10 != 0) {
            return i10;
        }
        int iN = n();
        this.zza = iN;
        return iN;
    }

    protected abstract Object m(int i10, Object obj, Object obj2);

    final int n() {
        return C2834j2.a().b(getClass()).a(this);
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC2804d2
    public final /* synthetic */ InterfaceC2799c2 o() {
        return (F1) m(6, null, null);
    }

    public final boolean p() {
        return l(this, true);
    }

    protected final D1 q() {
        return (D1) m(5, null, null);
    }

    public final D1 r() {
        D1 d10 = (D1) m(5, null, null);
        d10.e(this);
        return d10;
    }

    final F1 t() {
        return (F1) m(4, null, null);
    }

    public final String toString() {
        return AbstractC2809e2.a(this, super.toString());
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC2799c2
    public final int x() {
        if (h()) {
            int i10 = i(null);
            if (i10 >= 0) {
                return i10;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + i10);
        }
        int i11 = this.zzd & Integer.MAX_VALUE;
        if (i11 != Integer.MAX_VALUE) {
            return i11;
        }
        int i12 = i(null);
        if (i12 >= 0) {
            this.zzd = (this.zzd & Integer.MIN_VALUE) | i12;
            return i12;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + i12);
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC2799c2
    public final /* synthetic */ InterfaceC2794b2 z() {
        return (D1) m(5, null, null);
    }
}
