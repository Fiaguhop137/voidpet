package com.google.android.gms.measurement.internal;

import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class K2 implements com.google.android.gms.internal.measurement.S5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f35070a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ P2 f35071b;

    K2(P2 p10, String str) {
        this.f35070a = str;
        Objects.requireNonNull(p10);
        this.f35071b = p10;
    }

    @Override // com.google.android.gms.internal.measurement.S5
    public final String a(String str) {
        Map map = (Map) this.f35071b.p().get(this.f35070a);
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        return (String) map.get(str);
    }
}
