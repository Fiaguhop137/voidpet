package com.applovin.impl;

import android.content.ContentResolver;
import android.content.Context;
import android.os.Handler;
import android.provider.Settings;
import android.text.TextUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f28024a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f28025b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final HashSet f28026c = new HashSet();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static boolean f28027d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static f f28028e;

    public static f a(Context context) {
        f fVar;
        HashSet hashSet;
        Handler handler = i3.f28069a;
        Object obj = f28025b;
        synchronized (obj) {
            try {
                if (f28027d) {
                    return f28028e;
                }
                HashSet hashSet2 = f28026c;
                boolean zIsEmpty = hashSet2.isEmpty();
                CountDownLatch countDownLatch = new CountDownLatch(1);
                hashSet2.add(countDownLatch);
                if (zIsEmpty) {
                    f fVarCollectGoogleAdvertisingInfo = collectGoogleAdvertisingInfo(context);
                    if (fVarCollectGoogleAdvertisingInfo == null) {
                        fVarCollectGoogleAdvertisingInfo = collectFireOSAdvertisingInfo(context);
                    }
                    if (fVarCollectGoogleAdvertisingInfo == null) {
                        fVarCollectGoogleAdvertisingInfo = new f();
                    }
                    synchronized (obj) {
                        f28027d = true;
                        f28028e = fVarCollectGoogleAdvertisingInfo;
                        hashSet = new HashSet(hashSet2);
                        hashSet2.clear();
                    }
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        ((CountDownLatch) it.next()).countDown();
                    }
                }
                try {
                    if (!countDownLatch.await(60L, TimeUnit.SECONDS)) {
                        p1.c("DataCollector", "Could not collect Google Advertising ID - this will negatively impact your eCPMs! Please integrate the Google Play Services SDK into your application. More info can be found online at http://developer.android.com/google/play-services/setup.html. If you're sure you've integrated the SDK and are still seeing this message, you may need to add a ProGuard exception: -keep public class com.google.android.gms.** { public protected *; }: collection timeout", null);
                    }
                } catch (InterruptedException e10) {
                    p1.c("DataCollector", "Could not collect Google Advertising ID - this will negatively impact your eCPMs! Please integrate the Google Play Services SDK into your application. More info can be found online at http://developer.android.com/google/play-services/setup.html. If you're sure you've integrated the SDK and are still seeing this message, you may need to add a ProGuard exception: -keep public class com.google.android.gms.** { public protected *; }", e10);
                }
                synchronized (f28025b) {
                    fVar = f28028e;
                }
                return fVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static f collectFireOSAdvertisingInfo(Context context) {
        if (f28024a) {
            try {
                ContentResolver contentResolver = context.getContentResolver();
                f fVar = new f();
                fVar.f27992b = StringUtils.emptyIfNull(Settings.Secure.getString(contentResolver, "advertising_id"));
                boolean z10 = Settings.Secure.getInt(contentResolver, "limit_ad_tracking") != 0;
                fVar.f27991a = z10;
                fVar.f27993c = z10 ? 2 : 3;
                return fVar;
            } catch (Settings.SettingNotFoundException e10) {
                p1.c("DataCollector", "Unable to determine if Fire OS limited ad tracking is turned on", e10);
            } catch (Throwable th) {
                p1.c("DataCollector", "Unable to collect Fire OS IDFA", th);
            }
        }
        f28024a = false;
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0040  */
    private static f collectGoogleAdvertisingInfo(Context context) {
        Handler handler = i3.f28069a;
        if (!TextUtils.isEmpty("com.google.android.gms.ads.identifier.AdvertisingIdClient")) {
            try {
                int i10 = AdvertisingIdClient.f31589a;
                try {
                    f fVar = new f();
                    AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(context);
                    boolean zIsLimitAdTrackingEnabled = advertisingIdInfo.isLimitAdTrackingEnabled();
                    fVar.f27991a = zIsLimitAdTrackingEnabled;
                    fVar.f27993c = zIsLimitAdTrackingEnabled ? 2 : 3;
                    fVar.f27992b = advertisingIdInfo.getId();
                    return fVar;
                } catch (Throwable th) {
                    if (!t0.a(context)) {
                        p1.c("DataCollector", "Could not collect Google Advertising ID - this will negatively impact your eCPMs! Please integrate the Google Play Services SDK into your application. More info can be found online at http://developer.android.com/google/play-services/setup.html. If you're sure you've integrated the SDK and are still seeing this message, you may need to add a ProGuard exception: -keep public class com.google.android.gms.** { public protected *; }", th);
                    }
                }
            } catch (Throwable unused) {
                if (!t0.a(context)) {
                    p1.c("DataCollector", "Could not collect Google Advertising ID - this will negatively impact your eCPMs! Please integrate the Google Play Services SDK into your application. More info can be found online at http://developer.android.com/google/play-services/setup.html. If you're sure you've integrated the SDK and are still seeing this message, you may need to add a ProGuard exception: -keep public class com.google.android.gms.** { public protected *; }", null);
                }
            }
        } else if (!t0.a(context)) {
            p1.c("DataCollector", "Could not collect Google Advertising ID - this will negatively impact your eCPMs! Please integrate the Google Play Services SDK into your application. More info can be found online at http://developer.android.com/google/play-services/setup.html. If you're sure you've integrated the SDK and are still seeing this message, you may need to add a ProGuard exception: -keep public class com.google.android.gms.** { public protected *; }", null);
        }
        return null;
    }
}
