package com.applovin.sdk;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public interface AxonEventService {
    void trackEvent(String str);

    void trackEvent(String str, Map<String, Object> map);

    void trackEvent(String str, Map<String, Object> map, Map<String, Object> map2);
}
