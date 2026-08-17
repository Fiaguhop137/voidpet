package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.b5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2443b5 extends AbstractC2603t4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AbstractC2461d5 f32868a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected AbstractC2461d5 f32869b;

    protected AbstractC2443b5(AbstractC2461d5 abstractC2461d5) {
        this.f32868a = abstractC2461d5;
        if (abstractC2461d5.j()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f32869b = abstractC2461d5.l();
    }

    private static void l(Object obj, Object obj2) {
        M5.a().b(obj.getClass()).g(obj, obj2);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2603t4
    public final /* bridge */ /* synthetic */ AbstractC2603t4 g(byte[] bArr, int i10, int i11) throws C2542m5 {
        R4 r10 = R4.f32714c;
        int i12 = M5.f32575d;
        s(bArr, 0, i11, R4.f32714c);
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2603t4
    public final /* bridge */ /* synthetic */ AbstractC2603t4 h(byte[] bArr, int i10, int i11, R4 r10) throws C2542m5 {
        s(bArr, 0, i11, r10);
        return this;
    }

    protected final void m() {
        if (this.f32869b.j()) {
            return;
        }
        n();
    }

    protected void n() {
        AbstractC2461d5 abstractC2461d5L = this.f32868a.l();
        l(abstractC2461d5L, this.f32869b);
        this.f32869b = abstractC2461d5L;
    }

    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public final AbstractC2443b5 clone() {
        AbstractC2443b5 abstractC2443b5 = (AbstractC2443b5) this.f32868a.B(5, null, null);
        abstractC2443b5.f32869b = V1();
        return abstractC2443b5;
    }

    @Override // com.google.android.gms.internal.measurement.D5
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public AbstractC2461d5 V1() {
        if (!this.f32869b.j()) {
            return this.f32869b;
        }
        this.f32869b.n();
        return this.f32869b;
    }

    public final AbstractC2461d5 q() {
        AbstractC2461d5 abstractC2461d5V1 = V1();
        if (abstractC2461d5V1.i()) {
            return abstractC2461d5V1;
        }
        throw new Z5(abstractC2461d5V1);
    }

    public final AbstractC2443b5 r(AbstractC2461d5 abstractC2461d5) {
        if (!this.f32868a.equals(abstractC2461d5)) {
            if (!this.f32869b.j()) {
                n();
            }
            l(this.f32869b, abstractC2461d5);
        }
        return this;
    }

    public final AbstractC2443b5 s(byte[] bArr, int i10, int i11, R4 r10) throws C2542m5 {
        if (!this.f32869b.j()) {
            n();
        }
        try {
            M5.a().b(this.f32869b.getClass()).i(this.f32869b, bArr, 0, i11, new C2638x4(r10));
            return this;
        } catch (C2542m5 e10) {
            throw e10;
        } catch (IOException e11) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e11);
        } catch (IndexOutOfBoundsException unused) {
            throw new C2542m5("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }
}
