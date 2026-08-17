package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.e1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2679e1 extends AbstractC2752t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AbstractC2704j1 f33477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected AbstractC2704j1 f33478b;

    protected AbstractC2679e1(AbstractC2704j1 abstractC2704j1) {
        this.f33477a = abstractC2704j1;
        if (abstractC2704j1.z()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f33478b = abstractC2704j1.j();
    }

    private static void c(Object obj, Object obj2) {
        S1.a().b(obj.getClass()).f(obj, obj2);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.M1
    public final boolean N() {
        return AbstractC2704j1.x(this.f33478b, false);
    }

    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final AbstractC2679e1 clone() {
        AbstractC2679e1 abstractC2679e1 = (AbstractC2679e1) this.f33477a.C(5, null, null);
        abstractC2679e1.f33478b = k();
        return abstractC2679e1;
    }

    public final AbstractC2679e1 e(AbstractC2704j1 abstractC2704j1) {
        if (!this.f33477a.equals(abstractC2704j1)) {
            if (!this.f33478b.z()) {
                j();
            }
            c(this.f33478b, abstractC2704j1);
        }
        return this;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.K1
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final AbstractC2704j1 i() {
        AbstractC2704j1 abstractC2704j1K = k();
        if (AbstractC2704j1.x(abstractC2704j1K, true)) {
            return abstractC2704j1K;
        }
        throw new C2735p2(abstractC2704j1K);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.K1
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public AbstractC2704j1 k() {
        if (!this.f33478b.z()) {
            return this.f33478b;
        }
        this.f33478b.t();
        return this.f33478b;
    }

    protected final void h() {
        if (this.f33478b.z()) {
            return;
        }
        j();
    }

    protected void j() {
        AbstractC2704j1 abstractC2704j1J = this.f33477a.j();
        c(abstractC2704j1J, this.f33478b);
        this.f33478b = abstractC2704j1J;
    }
}
