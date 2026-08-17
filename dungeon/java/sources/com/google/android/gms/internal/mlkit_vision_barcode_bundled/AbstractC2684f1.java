package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.f1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2684f1 extends AbstractC2679e1 implements M1 {
    protected AbstractC2684f1(AbstractC2689g1 abstractC2689g1) {
        super(abstractC2689g1);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2679e1
    protected final void j() {
        super.j();
        if (((AbstractC2689g1) this.f33478b).zzb != Z0.d()) {
            AbstractC2689g1 abstractC2689g1 = (AbstractC2689g1) this.f33478b;
            abstractC2689g1.zzb = abstractC2689g1.zzb.clone();
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2679e1, com.google.android.gms.internal.mlkit_vision_barcode_bundled.K1
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public final AbstractC2689g1 k() {
        if (!((AbstractC2689g1) this.f33478b).z()) {
            return (AbstractC2689g1) this.f33478b;
        }
        ((AbstractC2689g1) this.f33478b).zzb.g();
        return (AbstractC2689g1) super.k();
    }
}
