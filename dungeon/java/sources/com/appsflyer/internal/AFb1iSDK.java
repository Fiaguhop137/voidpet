package com.appsflyer.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import com.appsflyer.AFLogger;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
final class AFb1iSDK implements Application.ActivityLifecycleCallbacks {

    @NotNull
    private final AFi1oSDK AFAdRevenueData;

    @NotNull
    private final Runnable areAllFieldsValid;

    @Nullable
    private ScheduledFuture<?> component4;

    @NotNull
    private final ScheduledExecutorService getCurrencyIso4217Code;
    private volatile boolean getMediationNetwork;

    @NotNull
    private final AFa1mSDK getMonetizationNetwork;

    @NotNull
    final AFb1aSDK.AFa1tSDK getRevenue;

    public AFb1iSDK(@NotNull ScheduledExecutorService scheduledExecutorService, @NotNull AFa1mSDK aFa1mSDK, @NotNull AFi1oSDK aFi1oSDK, @NotNull AFb1aSDK.AFa1tSDK aFa1tSDK) {
        Intrinsics.checkNotNullParameter(scheduledExecutorService, "");
        Intrinsics.checkNotNullParameter(aFa1mSDK, "");
        Intrinsics.checkNotNullParameter(aFi1oSDK, "");
        Intrinsics.checkNotNullParameter(aFa1tSDK, "");
        this.getCurrencyIso4217Code = scheduledExecutorService;
        this.getMonetizationNetwork = aFa1mSDK;
        this.AFAdRevenueData = aFi1oSDK;
        this.getRevenue = aFa1tSDK;
        this.areAllFieldsValid = new RunnableC2163k(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getMediationNetwork(AFb1iSDK aFb1iSDK) {
        Object objB;
        Intrinsics.checkNotNullParameter(aFb1iSDK, "");
        aFb1iSDK.getMediationNetwork = false;
        try {
            Ad.q.a aVar = Ad.q.f327b;
            aFb1iSDK.getRevenue.getMediationNetwork();
            objB = Ad.q.b(Unit.f48228a);
        } catch (Throwable th) {
            Ad.q.a aVar2 = Ad.q.f327b;
            objB = Ad.q.b(Ad.r.a(th));
        }
        Throwable thD = Ad.q.d(objB);
        if (thD != null) {
            AFLogger.afErrorLog("Background task failed with a throwable: ", thD);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getMonetizationNetwork(AFb1iSDK aFb1iSDK, AFh1qSDK aFh1qSDK) {
        Object objB;
        Intrinsics.checkNotNullParameter(aFb1iSDK, "");
        Intrinsics.checkNotNullParameter(aFh1qSDK, "");
        try {
            Ad.q.a aVar = Ad.q.f327b;
            aFb1iSDK.getRevenue.getRevenue(aFh1qSDK);
            objB = Ad.q.b(Unit.f48228a);
        } catch (Throwable th) {
            Ad.q.a aVar2 = Ad.q.f327b;
            objB = Ad.q.b(Ad.r.a(th));
        }
        Throwable thD = Ad.q.d(objB);
        if (thD != null) {
            AFLogger.afErrorLog("Listener thrown an exception: ", thD, true);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(@NotNull Activity activity, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "");
        AFa1mSDK aFa1mSDK = this.getMonetizationNetwork;
        Intent intent = activity.getIntent();
        if (((intent == null || !"android.intent.action.VIEW".equals(intent.getAction())) ? null : intent.getData()) != null && intent != aFa1mSDK.AFAdRevenueData) {
            aFa1mSDK.AFAdRevenueData = intent;
        }
        this.AFAdRevenueData.getMonetizationNetwork(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        if (this.getMediationNetwork) {
            ScheduledExecutorService scheduledExecutorService = this.getCurrencyIso4217Code;
            Runnable runnable = this.areAllFieldsValid;
            AFb1aSDK.Companion companion = AFb1aSDK.INSTANCE;
            this.component4 = scheduledExecutorService.schedule(runnable, AFb1aSDK.Companion.getMediationNetwork(), TimeUnit.MILLISECONDS);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        if (!this.getMediationNetwork) {
            this.getMediationNetwork = true;
            this.getCurrencyIso4217Code.execute(new RunnableC2164l(this, new AFh1qSDK(activity, this.AFAdRevenueData)));
        } else {
            ScheduledFuture<?> scheduledFuture = this.component4;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(true);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(@NotNull Activity activity, @NotNull Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "");
        Intrinsics.checkNotNullParameter(bundle, "");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
    }
}
