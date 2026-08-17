package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class T5 extends X5 {
    T5() {
        super(null);
    }

    @Override // com.google.android.gms.internal.measurement.X5
    public final void a() {
        if (!b()) {
            if (c() > 0) {
                android.support.v4.media.session.b.a(((U5) d(0)).e());
                throw null;
            }
            Iterator it = e().iterator();
            if (it.hasNext()) {
                android.support.v4.media.session.b.a(((Map.Entry) it.next()).getKey());
                throw null;
            }
        }
        super.a();
    }
}
