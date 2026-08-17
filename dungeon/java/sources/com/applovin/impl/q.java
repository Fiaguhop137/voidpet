package com.applovin.impl;

import com.applovin.sdk.AxonInitializationConfiguration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class q implements AxonInitializationConfiguration.Builder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28294a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f28295b = Collections.EMPTY_LIST;

    public q(String str) {
        this.f28294a = str;
    }

    @Override // com.applovin.sdk.AxonInitializationConfiguration.Builder
    public final AxonInitializationConfiguration build() {
        return new r(this);
    }

    @Override // com.applovin.sdk.AxonInitializationConfiguration.Builder
    public final List getTestDeviceAdvertisingIds() {
        return new ArrayList(this.f28295b);
    }

    @Override // com.applovin.sdk.AxonInitializationConfiguration.Builder
    public final AxonInitializationConfiguration.Builder setTestDeviceAdvertisingIds(List list) {
        p1.c("AxonInitializationConfiguration", "setTestDeviceAdvertisingIds(testDeviceAdvertisingIds=" + list + ")");
        if (list == null) {
            return this;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str == null || str.length() != 36) {
                p1.c("AxonInitializationConfiguration", "Unable to set test device advertising id (" + str + ") - please make sure it is in the format of xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx", null);
            } else {
                arrayList.add(str);
            }
        }
        this.f28295b = arrayList;
        return this;
    }

    public final String toString() {
        return "AxonInitializationConfiguration.Builder{ eventKey=" + this.f28294a + "testDeviceAdvertisingIdentifiers=" + this.f28295b + '}';
    }
}
