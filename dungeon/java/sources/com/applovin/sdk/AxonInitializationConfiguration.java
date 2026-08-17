package com.applovin.sdk;

import com.applovin.impl.q;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class AxonInitializationConfiguration {

    public interface Builder {
        AxonInitializationConfiguration build();

        List<String> getTestDeviceAdvertisingIds();

        Builder setTestDeviceAdvertisingIds(List<String> list);
    }

    public static Builder builder(String str) {
        return new q(str);
    }

    public abstract String getKey();

    public abstract List<String> getTestDeviceAdvertisingIds();
}
