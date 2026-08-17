package io.sentry.config;

import io.sentry.d4;
import java.util.ArrayList;
import java.util.Properties;

/* JADX INFO: loaded from: classes3.dex */
public abstract class g {
    public static f a() {
        Properties propertiesA;
        Properties propertiesA2;
        d4 d4Var = new d4();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new i());
        arrayList.add(new d());
        String property = System.getProperty("sentry.properties.file");
        if (property != null && (propertiesA2 = new e(property, d4Var).a()) != null) {
            arrayList.add(new h(propertiesA2));
        }
        String str = System.getenv("SENTRY_PROPERTIES_FILE");
        if (str != null && (propertiesA = new e(str, d4Var).a()) != null) {
            arrayList.add(new h(propertiesA));
        }
        Properties propertiesA3 = new b(d4Var).a();
        if (propertiesA3 != null) {
            arrayList.add(new h(propertiesA3));
        }
        Properties propertiesA4 = new e("sentry.properties", d4Var, false).a();
        if (propertiesA4 != null) {
            arrayList.add(new h(propertiesA4));
        }
        return new c(arrayList);
    }
}
