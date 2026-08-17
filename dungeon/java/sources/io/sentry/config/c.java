package io.sentry.config;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
final class c implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f45777a;

    public c(List list) {
        this.f45777a = list;
    }

    @Override // io.sentry.config.f
    public Map getMap(String str) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        Iterator it = this.f45777a.iterator();
        while (it.hasNext()) {
            concurrentHashMap.putAll(((f) it.next()).getMap(str));
        }
        return concurrentHashMap;
    }

    @Override // io.sentry.config.f
    public String getProperty(String str) {
        Iterator it = this.f45777a.iterator();
        while (it.hasNext()) {
            String property = ((f) it.next()).getProperty(str);
            if (property != null) {
                return property;
            }
        }
        return null;
    }
}
