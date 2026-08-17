package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.g2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2690g2 extends AbstractC2725n2 {
    C2690g2() {
        super(null);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC2725n2
    public final void a() {
        if (!k()) {
            for (int i10 = 0; i10 < c(); i10++) {
                ((Y0) ((C2695h2) g(i10)).e()).d();
            }
            Iterator it = d().iterator();
            while (it.hasNext()) {
                ((Y0) ((Map.Entry) it.next()).getKey()).d();
            }
        }
        super.a();
    }
}
