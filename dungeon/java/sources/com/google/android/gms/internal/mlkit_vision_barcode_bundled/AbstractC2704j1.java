package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.j1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2704j1 extends AbstractC2757u0 {
    private static final Map zzb = new ConcurrentHashMap();
    private int zzd = -1;
    protected C2744r2 zzc = C2744r2.c();

    private final int A(InterfaceC2675d2 interfaceC2675d2) {
        return S1.a().b(getClass()).c(this);
    }

    private static AbstractC2704j1 B(AbstractC2704j1 abstractC2704j1, byte[] bArr, int i10, int i11, U0 u10) throws C2753t1 {
        if (i11 == 0) {
            return abstractC2704j1;
        }
        AbstractC2704j1 abstractC2704j1J = abstractC2704j1.j();
        try {
            InterfaceC2675d2 interfaceC2675d2B = S1.a().b(abstractC2704j1J.getClass());
            interfaceC2675d2B.i(abstractC2704j1J, bArr, 0, i11, new C2772x0(u10));
            interfaceC2675d2B.e(abstractC2704j1J);
            return abstractC2704j1J;
        } catch (C2735p2 e10) {
            throw e10.a();
        } catch (C2753t1 e11) {
            throw e11;
        } catch (IOException e12) {
            if (e12.getCause() instanceof C2753t1) {
                throw ((C2753t1) e12.getCause());
            }
            throw new C2753t1(e12);
        } catch (IndexOutOfBoundsException unused) {
            throw new C2753t1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    public static C2699i1 g(L1 l10, Object obj, L1 l11, InterfaceC2719m1 interfaceC2719m1, int i10, E2 e10, Class cls) {
        return new C2699i1(l10, obj, l11, new C2694h1(null, i10, e10, false, false), cls);
    }

    static AbstractC2704j1 h(Class cls) {
        Map map = zzb;
        AbstractC2704j1 abstractC2704j1 = (AbstractC2704j1) map.get(cls);
        if (abstractC2704j1 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC2704j1 = (AbstractC2704j1) map.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (abstractC2704j1 != null) {
            return abstractC2704j1;
        }
        AbstractC2704j1 abstractC2704j2 = (AbstractC2704j1) ((AbstractC2704j1) AbstractC2774x2.j(cls)).C(6, null, null);
        if (abstractC2704j2 == null) {
            throw new IllegalStateException();
        }
        map.put(cls, abstractC2704j2);
        return abstractC2704j2;
    }

    protected static AbstractC2704j1 l(AbstractC2704j1 abstractC2704j1, byte[] bArr, U0 u10) throws C2753t1 {
        AbstractC2704j1 abstractC2704j1B = B(abstractC2704j1, bArr, 0, bArr.length, u10);
        if (abstractC2704j1B == null || x(abstractC2704j1B, true)) {
            return abstractC2704j1B;
        }
        throw new C2735p2(abstractC2704j1B).a();
    }

    protected static InterfaceC2729o1 m() {
        return C2664b1.e();
    }

    protected static InterfaceC2729o1 n(InterfaceC2729o1 interfaceC2729o1) {
        int size = interfaceC2729o1.size();
        return interfaceC2729o1.m(size == 0 ? 10 : size + size);
    }

    protected static InterfaceC2734p1 o() {
        return C2709k1.e();
    }

    protected static InterfaceC2739q1 p() {
        return T1.c();
    }

    protected static InterfaceC2739q1 q(InterfaceC2739q1 interfaceC2739q1) {
        int size = interfaceC2739q1.size();
        return interfaceC2739q1.m(size == 0 ? 10 : size + size);
    }

    static Object r(Method method, Object obj, Object... objArr) {
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

    protected static Object s(L1 l10, String str, Object[] objArr) {
        return new U1(l10, str, objArr);
    }

    protected static void v(Class cls, AbstractC2704j1 abstractC2704j1) {
        abstractC2704j1.u();
        zzb.put(cls, abstractC2704j1);
    }

    protected static final boolean x(AbstractC2704j1 abstractC2704j1, boolean z10) {
        byte bByteValue = ((Byte) abstractC2704j1.C(1, null, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zD = S1.a().b(abstractC2704j1.getClass()).d(abstractC2704j1);
        if (z10) {
            abstractC2704j1.C(2, true != zD ? null : abstractC2704j1, null);
        }
        return zD;
    }

    protected abstract Object C(int i10, Object obj, Object obj2);

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.L1
    public final /* synthetic */ K1 H() {
        return (AbstractC2679e1) C(5, null, null);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.M1
    public final /* synthetic */ L1 M() {
        return (AbstractC2704j1) C(6, null, null);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.M1
    public final boolean N() {
        return x(this, true);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.L1
    public final /* synthetic */ K1 O() {
        AbstractC2679e1 abstractC2679e1 = (AbstractC2679e1) C(5, null, null);
        abstractC2679e1.e(this);
        return abstractC2679e1;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2757u0
    final int a(InterfaceC2675d2 interfaceC2675d2) {
        if (z()) {
            int iC = interfaceC2675d2.c(this);
            if (iC >= 0) {
                return iC;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + iC);
        }
        int i10 = this.zzd & Integer.MAX_VALUE;
        if (i10 != Integer.MAX_VALUE) {
            return i10;
        }
        int iC2 = interfaceC2675d2.c(this);
        if (iC2 >= 0) {
            this.zzd = (this.zzd & Integer.MIN_VALUE) | iC2;
            return iC2;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + iC2);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.L1
    public final void b(Q0 q10) {
        S1.a().b(getClass()).h(this, R0.m(q10));
    }

    final int d() {
        return S1.a().b(getClass()).a(this);
    }

    protected final AbstractC2679e1 e() {
        return (AbstractC2679e1) C(5, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return S1.a().b(getClass()).g(this, (AbstractC2704j1) obj);
    }

    public final AbstractC2679e1 f() {
        AbstractC2679e1 abstractC2679e1 = (AbstractC2679e1) C(5, null, null);
        abstractC2679e1.e(this);
        return abstractC2679e1;
    }

    public final int hashCode() {
        if (z()) {
            return d();
        }
        int i10 = this.zza;
        if (i10 != 0) {
            return i10;
        }
        int iD = d();
        this.zza = iD;
        return iD;
    }

    final AbstractC2704j1 j() {
        return (AbstractC2704j1) C(4, null, null);
    }

    protected final void t() {
        S1.a().b(getClass()).e(this);
        u();
    }

    public final String toString() {
        return N1.a(this, super.toString());
    }

    final void u() {
        this.zzd &= Integer.MAX_VALUE;
    }

    final void w(int i10) {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.L1
    public final int y() {
        if (z()) {
            int iA = A(null);
            if (iA >= 0) {
                return iA;
            }
            throw new IllegalStateException("serialized size must be non-negative, was " + iA);
        }
        int i10 = this.zzd & Integer.MAX_VALUE;
        if (i10 != Integer.MAX_VALUE) {
            return i10;
        }
        int iA2 = A(null);
        if (iA2 >= 0) {
            this.zzd = (this.zzd & Integer.MIN_VALUE) | iA2;
            return iA2;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + iA2);
    }

    final boolean z() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }
}
