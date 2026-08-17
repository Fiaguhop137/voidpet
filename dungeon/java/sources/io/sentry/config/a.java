package io.sentry.config;

import io.sentry.util.D;
import io.sentry.util.w;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/* JADX INFO: loaded from: classes3.dex */
abstract class a implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f45772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Properties f45773b;

    protected a(String str, Properties properties) {
        this.f45772a = (String) w.c(str, "prefix is required");
        this.f45773b = (Properties) w.c(properties, "properties are required");
    }

    protected a(Properties properties) {
        this("", properties);
    }

    @Override // io.sentry.config.f
    public Map getMap(String str) {
        String str2 = this.f45772a + str + ".";
        HashMap map = new HashMap();
        for (Map.Entry entry : this.f45773b.entrySet()) {
            if ((entry.getKey() instanceof String) && (entry.getValue() instanceof String)) {
                String str3 = (String) entry.getKey();
                if (str3.startsWith(str2)) {
                    map.put(str3.substring(str2.length()), D.f((String) entry.getValue(), "\""));
                }
            }
        }
        return map;
    }

    @Override // io.sentry.config.f
    public String getProperty(String str) {
        return D.f(this.f45773b.getProperty(this.f45772a + str), "\"");
    }
}
