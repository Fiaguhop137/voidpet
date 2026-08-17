package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import com.appsflyer.AFLogger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class AFj1sSDK {
    public final AFd1zSDK getCurrencyIso4217Code;
    public final CopyOnWriteArrayList<AFj1tSDK> getRevenue = new CopyOnWriteArrayList<>();

    public AFj1sSDK(AFd1zSDK aFd1zSDK) {
        this.getCurrencyIso4217Code = aFd1zSDK;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void AFAdRevenueData(Runnable runnable) {
        AFj1ySDK aFj1ySDK = new AFj1ySDK(this.getCurrencyIso4217Code.AFAdRevenueData(), this.getCurrencyIso4217Code.getMonetizationNetwork(), AFj1zSDK.FACEBOOK_LITE, runnable, new I());
        this.getRevenue.add(aFj1ySDK);
        aFj1ySDK.getMonetizationNetwork(this.getCurrencyIso4217Code.AFInAppEventParameterName().getMonetizationNetwork);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void component1(Runnable runnable) {
        AFj1ySDK aFj1ySDK = new AFj1ySDK(this.getCurrencyIso4217Code.AFAdRevenueData(), this.getCurrencyIso4217Code.getMonetizationNetwork(), AFj1zSDK.INSTAGRAM, runnable, new F(this, runnable));
        this.getRevenue.add(aFj1ySDK);
        aFj1ySDK.getMonetizationNetwork(this.getCurrencyIso4217Code.AFInAppEventParameterName().getMonetizationNetwork);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void getCurrencyIso4217Code(AFi1aSDK aFi1aSDK, Runnable runnable) {
        AFc1qSDK aFc1qSDKComponent4 = this.getCurrencyIso4217Code.component4();
        int revenue = this.getCurrencyIso4217Code.AFAdRevenueData().getMediationNetwork.getRevenue("appsFlyerCount", 0);
        boolean mediationNetwork = aFc1qSDKComponent4.getMediationNetwork("newGPReferrerSent", false);
        boolean z10 = aFi1aSDK.component4 == AFj1tSDK.AFa1tSDK.NOT_STARTED;
        if (revenue == 1) {
            if (z10 || mediationNetwork) {
                runnable.run();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void getMonetizationNetwork(Context context, Runnable runnable, AFd1zSDK aFd1zSDK) {
        List<ResolveInfo> listQueryIntentContentProviders = context.getPackageManager().queryIntentContentProviders(new Intent("com.appsflyer.referrer.INSTALL_PROVIDER"), 0);
        if (listQueryIntentContentProviders == null || listQueryIntentContentProviders.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<ResolveInfo> it = listQueryIntentContentProviders.iterator();
        while (it.hasNext()) {
            ProviderInfo providerInfo = it.next().providerInfo;
            if (providerInfo != null) {
                arrayList.add(new AFj1uSDK(providerInfo, runnable, aFd1zSDK));
            } else {
                AFLogger.INSTANCE.w(AFg1cSDK.PREINSTALL, "com.appsflyer.referrer.INSTALL_PROVIDER Action is set for non ContentProvider component");
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        this.getRevenue.addAll(arrayList);
        AFLogger aFLogger = AFLogger.INSTANCE;
        AFg1cSDK aFg1cSDK = AFg1cSDK.PREINSTALL;
        StringBuilder sb2 = new StringBuilder("Detected ");
        sb2.append(arrayList.size());
        sb2.append(" valid preinstall provider(s)");
        aFLogger.d(aFg1cSDK, sb2.toString());
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((AFj1tSDK) it2.next()).getMonetizationNetwork(aFd1zSDK.AFInAppEventParameterName().getMonetizationNetwork);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void getMonetizationNetwork(Runnable runnable) {
        try {
            if (getMediationNetwork(new AFh1kSDK())) {
                runnable.run();
            }
        } catch (Throwable th) {
            AFLogger.afErrorLog(th.getMessage(), th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void getRevenue() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void getRevenue(Runnable runnable) {
        this.getCurrencyIso4217Code.getMonetizationNetwork().execute(new G(this, runnable));
    }

    public final Runnable AFAdRevenueData(AFi1aSDK aFi1aSDK, Runnable runnable) {
        return new L(this, aFi1aSDK, runnable);
    }

    public final AFi1aSDK getCurrencyIso4217Code(Runnable runnable) {
        return new AFi1aSDK(new J(this, runnable), this.getCurrencyIso4217Code.getMonetizationNetwork(), this.getCurrencyIso4217Code.AFAdRevenueData());
    }

    public final boolean getCurrencyIso4217Code() {
        return this.getCurrencyIso4217Code.AFAdRevenueData().getMediationNetwork("AF_PREINSTALL_DISABLED");
    }

    public final void getMediationNetwork(Runnable runnable) {
        this.getRevenue.add(new AFj1ySDK(this.getCurrencyIso4217Code.AFAdRevenueData(), this.getCurrencyIso4217Code.getMonetizationNetwork(), AFj1zSDK.FACEBOOK, runnable, new H(this, runnable)));
    }

    public final boolean getMediationNetwork() {
        Iterator<AFj1tSDK> it = this.getRevenue.iterator();
        while (it.hasNext()) {
            if (it.next().component4 == AFj1tSDK.AFa1tSDK.STARTED) {
                return false;
            }
        }
        return true;
    }

    public final boolean getMediationNetwork(AFh1mSDK aFh1mSDK) {
        int revenue = this.getCurrencyIso4217Code.AFAdRevenueData().getMediationNetwork.getRevenue("appsFlyerCount", 0);
        return (!this.getCurrencyIso4217Code.component4().getMediationNetwork("newGPReferrerSent", false) && revenue == 1) || (revenue == 1 && !(aFh1mSDK instanceof AFh1kSDK));
    }

    public final void getRevenue(Context context, Runnable runnable, AFd1zSDK aFd1zSDK) {
        if (aFd1zSDK.AFAdRevenueData().getMediationNetwork.getRevenue("appsFlyerCount", 0) > 0) {
            AFLogger.INSTANCE.d(AFg1cSDK.PREINSTALL, "Preinstall referrer will not load, the counter >= 1, ");
        } else {
            aFd1zSDK.getMonetizationNetwork().execute(new K(this, context, runnable, aFd1zSDK));
        }
    }
}
