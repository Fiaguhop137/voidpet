package com.applovin.impl;

import com.applovin.impl.sdk.utils.CollectionUtils;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class u0 extends e1 {
    public u0(p pVar) {
        super(pVar, 1);
    }

    public final void a(String str, String str2, Throwable th) {
        HashMap map = new HashMap();
        String str3 = str + ":" + str2;
        map.put("source", str3);
        map.put("top_main_method", th.toString());
        ArrayList arrayList = new ArrayList();
        arrayList.add(map);
        for (Throwable th2 : th.getSuppressed()) {
            HashMap map2 = new HashMap();
            CollectionUtils.putStringIfValid("source", str3, map2);
            CollectionUtils.putStringIfValid("top_main_method", th.toString(), map2);
            CollectionUtils.putStringIfValid("suppressed_throwable", th2.toString(), map2);
            arrayList.add(map2);
        }
        a(b1.f27953k, arrayList);
    }
}
