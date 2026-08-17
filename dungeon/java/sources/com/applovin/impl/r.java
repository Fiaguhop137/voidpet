package com.applovin.impl;

import com.applovin.sdk.AxonInitializationConfiguration;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class r extends AxonInitializationConfiguration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f28305b;

    public r(q qVar) {
        this.f28304a = qVar.f28294a;
        this.f28305b = qVar.f28295b;
    }

    @Override // com.applovin.sdk.AxonInitializationConfiguration
    public final String getKey() {
        return this.f28304a;
    }

    @Override // com.applovin.sdk.AxonInitializationConfiguration
    public final List getTestDeviceAdvertisingIds() {
        return new ArrayList(this.f28305b);
    }

    public final String toString() {
        return "AxonInitializationConfiguration{ eventKey=" + this.f28304a + ", testDeviceAdvertisingIds=" + this.f28305b + '}';
    }
}
