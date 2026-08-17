package com.appsflyer.internal;

import android.net.TrafficStats;
import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public abstract class AFe1mSDK<Result> implements Comparable<AFe1mSDK<?>>, Callable<AFe1uSDK> {
    private static final AtomicInteger component3 = new AtomicInteger();

    @NonNull
    public final Set<AFe1pSDK> AFAdRevenueData;
    private long areAllFieldsValid;
    private Throwable component1;
    private final int component2;
    private final String component4;
    private boolean copy;

    @NonNull
    public final Set<AFe1pSDK> getCurrencyIso4217Code;
    public volatile int getMediationNetwork;
    public AFe1uSDK getMonetizationNetwork;

    @NonNull
    public final AFe1pSDK getRevenue;

    public AFe1mSDK(@NonNull AFe1pSDK aFe1pSDK, @NonNull AFe1pSDK[] aFe1pSDKArr, String str) {
        HashSet hashSet = new HashSet();
        this.AFAdRevenueData = hashSet;
        this.getCurrencyIso4217Code = new HashSet();
        int iIncrementAndGet = component3.incrementAndGet();
        this.component2 = iIncrementAndGet;
        this.copy = false;
        this.getMediationNetwork = 0;
        this.getRevenue = aFe1pSDK;
        Collections.addAll(hashSet, aFe1pSDKArr);
        if (str != null) {
            this.component4 = str;
        } else {
            this.component4 = String.valueOf(iIncrementAndGet);
        }
    }

    protected abstract long AFAdRevenueData();

    protected void AFAdRevenueData(Throwable th) {
    }

    protected final boolean areAllFieldsValid() {
        return this.copy;
    }

    public final Throwable component1() {
        return this.component1;
    }

    @Override // java.util.concurrent.Callable
    /* JADX INFO: renamed from: component4, reason: merged with bridge method [inline-methods] */
    public final AFe1uSDK call() throws Exception {
        TrafficStats.setThreadStatsTag(82339054);
        this.getMonetizationNetwork = null;
        this.component1 = null;
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.getMediationNetwork++;
        try {
            AFe1uSDK revenue = getRevenue();
            this.getMonetizationNetwork = revenue;
            this.areAllFieldsValid = System.currentTimeMillis() - jCurrentTimeMillis;
            getCurrencyIso4217Code();
            return revenue;
        } catch (Throwable th) {
            try {
                this.component1 = th;
                this.getMonetizationNetwork = AFe1uSDK.FAILURE;
                AFAdRevenueData(th);
                throw th;
            } catch (Throwable th2) {
                this.areAllFieldsValid = System.currentTimeMillis() - jCurrentTimeMillis;
                getCurrencyIso4217Code();
                throw th2;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AFe1mSDK aFe1mSDK = (AFe1mSDK) obj;
        if (this.getRevenue != aFe1mSDK.getRevenue) {
            return false;
        }
        return this.component4.equals(aFe1mSDK.component4);
    }

    public void getCurrencyIso4217Code() {
    }

    public void getMediationNetwork() {
        this.copy = true;
    }

    protected abstract boolean getMonetizationNetwork();

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: getRevenue, reason: merged with bridge method [inline-methods] */
    public final int compareTo(AFe1mSDK<?> aFe1mSDK) {
        int i10 = this.getRevenue.unregisterClient - aFe1mSDK.getRevenue.unregisterClient;
        if (i10 != 0) {
            return i10;
        }
        if (this.component4.equals(aFe1mSDK.component4)) {
            return 0;
        }
        return this.component2 - aFe1mSDK.component2;
    }

    @NonNull
    protected abstract AFe1uSDK getRevenue() throws Exception;

    public final int hashCode() {
        return (this.getRevenue.hashCode() * 31) + this.component4.hashCode();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.getRevenue);
        sb2.append("-");
        sb2.append(this.component4);
        String string = sb2.toString();
        if (String.valueOf(this.component2).equals(this.component4)) {
            return string;
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(string);
        sb3.append("-");
        sb3.append(this.component2);
        return sb3.toString();
    }
}
