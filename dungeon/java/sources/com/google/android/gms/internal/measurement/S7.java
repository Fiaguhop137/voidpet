package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final class S7 extends AbstractC2518k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final B3 f32725c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final Map f32726d;

    public S7(B3 b10) {
        super("require");
        this.f32726d = new HashMap();
        this.f32725c = b10;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2518k
    public final InterfaceC2572q d(Y1 y10, List list) {
        InterfaceC2572q interfaceC2572q;
        AbstractC2652z2.a("require", 1, list);
        String strZzc = y10.a((InterfaceC2572q) list.get(0)).zzc();
        Map map = this.f32726d;
        if (map.containsKey(strZzc)) {
            return (InterfaceC2572q) map.get(strZzc);
        }
        Map map2 = this.f32725c.f32482a;
        if (map2.containsKey(strZzc)) {
            try {
                interfaceC2572q = (InterfaceC2572q) ((Callable) map2.get(strZzc)).call();
            } catch (Exception unused) {
                throw new IllegalStateException("Failed to create API implementation: ".concat(String.valueOf(strZzc)));
            }
        } else {
            interfaceC2572q = InterfaceC2572q.f33082p1;
        }
        if (interfaceC2572q instanceof AbstractC2518k) {
            this.f32726d.put(strZzc, (AbstractC2518k) interfaceC2572q);
        }
        return interfaceC2572q;
    }
}
