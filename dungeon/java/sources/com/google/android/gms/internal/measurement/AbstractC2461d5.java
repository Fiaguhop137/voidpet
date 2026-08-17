package com.google.android.gms.internal.measurement;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.d5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2461d5 extends AbstractC2612u4 {
    private static final Map zzd = new ConcurrentHashMap();
    private int zzb = -1;
    protected C2444b6 zzc = C2444b6.a();

    private static final boolean A(AbstractC2461d5 abstractC2461d5, boolean z10) {
        byte bByteValue = ((Byte) abstractC2461d5.B(1, null, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zD = M5.a().b(abstractC2461d5.getClass()).d(abstractC2461d5);
        if (z10) {
            abstractC2461d5.B(2, true != zD ? null : abstractC2461d5, null);
        }
        return zD;
    }

    private final int h(P5 p10) {
        return M5.a().b(getClass()).e(this);
    }

    static AbstractC2461d5 r(Class cls) {
        Map map = zzd;
        AbstractC2461d5 abstractC2461d5 = (AbstractC2461d5) map.get(cls);
        if (abstractC2461d5 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC2461d5 = (AbstractC2461d5) map.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (abstractC2461d5 != null) {
            return abstractC2461d5;
        }
        AbstractC2461d5 abstractC2461d6 = (AbstractC2461d5) ((AbstractC2461d5) AbstractC2498h6.h(cls)).B(6, null, null);
        if (abstractC2461d6 == null) {
            throw new IllegalStateException();
        }
        map.put(cls, abstractC2461d6);
        return abstractC2461d6;
    }

    protected static void s(Class cls, AbstractC2461d5 abstractC2461d5) {
        abstractC2461d5.k();
        zzd.put(cls, abstractC2461d5);
    }

    protected static Object t(E5 e10, String str, Object[] objArr) {
        return new O5(e10, str, objArr);
    }

    static Object u(Method method, Object obj, Object... objArr) {
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

    protected static InterfaceC2497h5 v() {
        return C2470e5.c();
    }

    protected static InterfaceC2506i5 w() {
        return C2595s5.c();
    }

    protected static InterfaceC2506i5 x(InterfaceC2506i5 interfaceC2506i5) {
        int size = interfaceC2506i5.size();
        return interfaceC2506i5.K(size + size);
    }

    protected static InterfaceC2515j5 y() {
        return N5.c();
    }

    protected static InterfaceC2515j5 z(InterfaceC2515j5 interfaceC2515j5) {
        int size = interfaceC2515j5.size();
        return interfaceC2515j5.K(size + size);
    }

    protected abstract Object B(int i10, Object obj, Object obj2);

    @Override // com.google.android.gms.internal.measurement.E5
    public final int b() {
        if (j()) {
            int iH = h(null);
            if (iH >= 0) {
                return iH;
            }
            StringBuilder sb2 = new StringBuilder(String.valueOf(iH).length() + 42);
            sb2.append("serialized size must be non-negative, was ");
            sb2.append(iH);
            throw new IllegalStateException(sb2.toString());
        }
        int i10 = this.zzb & Integer.MAX_VALUE;
        if (i10 != Integer.MAX_VALUE) {
            return i10;
        }
        int iH2 = h(null);
        if (iH2 >= 0) {
            this.zzb = (this.zzb & Integer.MIN_VALUE) | iH2;
            return iH2;
        }
        StringBuilder sb3 = new StringBuilder(String.valueOf(iH2).length() + 42);
        sb3.append("serialized size must be non-negative, was ");
        sb3.append(iH2);
        throw new IllegalStateException(sb3.toString());
    }

    @Override // com.google.android.gms.internal.measurement.E5
    public final void c(N4 n10) {
        M5.a().b(getClass()).j(this, O4.d(n10));
    }

    @Override // com.google.android.gms.internal.measurement.E5
    public final /* synthetic */ D5 d() {
        return (AbstractC2443b5) B(5, null, null);
    }

    @Override // com.google.android.gms.internal.measurement.F5
    public final /* synthetic */ E5 e() {
        return (AbstractC2461d5) B(6, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return M5.a().b(getClass()).k(this, (AbstractC2461d5) obj);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2612u4
    final int f(P5 p10) {
        if (j()) {
            int iE = p10.e(this);
            if (iE >= 0) {
                return iE;
            }
            StringBuilder sb2 = new StringBuilder(String.valueOf(iE).length() + 42);
            sb2.append("serialized size must be non-negative, was ");
            sb2.append(iE);
            throw new IllegalStateException(sb2.toString());
        }
        int i10 = this.zzb & Integer.MAX_VALUE;
        if (i10 != Integer.MAX_VALUE) {
            return i10;
        }
        int iE2 = p10.e(this);
        if (iE2 >= 0) {
            this.zzb = (this.zzb & Integer.MIN_VALUE) | iE2;
            return iE2;
        }
        StringBuilder sb3 = new StringBuilder(String.valueOf(iE2).length() + 42);
        sb3.append("serialized size must be non-negative, was ");
        sb3.append(iE2);
        throw new IllegalStateException(sb3.toString());
    }

    public final int hashCode() {
        if (j()) {
            return m();
        }
        int i10 = this.zza;
        if (i10 != 0) {
            return i10;
        }
        int iM = m();
        this.zza = iM;
        return iM;
    }

    public final boolean i() {
        return A(this, true);
    }

    final boolean j() {
        return (this.zzb & Integer.MIN_VALUE) != 0;
    }

    final void k() {
        this.zzb &= Integer.MAX_VALUE;
    }

    final AbstractC2461d5 l() {
        return (AbstractC2461d5) B(4, null, null);
    }

    final int m() {
        return M5.a().b(getClass()).f(this);
    }

    protected final void n() {
        M5.a().b(getClass()).h(this);
        k();
    }

    protected final AbstractC2443b5 o() {
        return (AbstractC2443b5) B(5, null, null);
    }

    public final AbstractC2443b5 p() {
        AbstractC2443b5 abstractC2443b5 = (AbstractC2443b5) B(5, null, null);
        abstractC2443b5.r(this);
        return abstractC2443b5;
    }

    final void q(int i10) {
        this.zzb = (this.zzb & Integer.MIN_VALUE) | Integer.MAX_VALUE;
    }

    public final String toString() {
        return G5.a(this, super.toString());
    }
}
