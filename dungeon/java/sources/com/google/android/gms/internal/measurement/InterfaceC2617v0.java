package com.google.android.gms.internal.measurement;

import android.content.Intent;
import android.os.Bundle;
import android.os.IInterface;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.v0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC2617v0 extends IInterface {
    void beginAdUnitExposure(String str, long j10);

    void clearConditionalUserProperty(String str, String str2, Bundle bundle);

    void clearMeasurementEnabled(long j10);

    void endAdUnitExposure(String str, long j10);

    void generateEventId(InterfaceC2642y0 interfaceC2642y0);

    void getAppInstanceId(InterfaceC2642y0 interfaceC2642y0);

    void getCachedAppInstanceId(InterfaceC2642y0 interfaceC2642y0);

    void getConditionalUserProperties(String str, String str2, InterfaceC2642y0 interfaceC2642y0);

    void getCurrentScreenClass(InterfaceC2642y0 interfaceC2642y0);

    void getCurrentScreenName(InterfaceC2642y0 interfaceC2642y0);

    void getGmpAppId(InterfaceC2642y0 interfaceC2642y0);

    void getMaxUserProperties(String str, InterfaceC2642y0 interfaceC2642y0);

    void getSessionId(InterfaceC2642y0 interfaceC2642y0);

    void getTestFlag(InterfaceC2642y0 interfaceC2642y0, int i10);

    void getUserProperties(String str, String str2, boolean z10, InterfaceC2642y0 interfaceC2642y0);

    void initForTests(Map map);

    void initialize(p314r8.a aVar, H0 h10, long j10);

    void isDataCollectionEnabled(InterfaceC2642y0 interfaceC2642y0);

    void logEvent(String str, String str2, Bundle bundle, boolean z10, boolean z11, long j10);

    void logEventAndBundle(String str, String str2, Bundle bundle, InterfaceC2642y0 interfaceC2642y0, long j10);

    void logHealthData(int i10, String str, p314r8.a aVar, p314r8.a aVar2, p314r8.a aVar3);

    void onActivityCreated(p314r8.a aVar, Bundle bundle, long j10);

    void onActivityCreatedByScionActivityInfo(J0 j10, Bundle bundle, long j11);

    void onActivityDestroyed(p314r8.a aVar, long j10);

    void onActivityDestroyedByScionActivityInfo(J0 j10, long j11);

    void onActivityPaused(p314r8.a aVar, long j10);

    void onActivityPausedByScionActivityInfo(J0 j10, long j11);

    void onActivityResumed(p314r8.a aVar, long j10);

    void onActivityResumedByScionActivityInfo(J0 j10, long j11);

    void onActivitySaveInstanceState(p314r8.a aVar, InterfaceC2642y0 interfaceC2642y0, long j10);

    void onActivitySaveInstanceStateByScionActivityInfo(J0 j10, InterfaceC2642y0 interfaceC2642y0, long j11);

    void onActivityStarted(p314r8.a aVar, long j10);

    void onActivityStartedByScionActivityInfo(J0 j10, long j11);

    void onActivityStopped(p314r8.a aVar, long j10);

    void onActivityStoppedByScionActivityInfo(J0 j10, long j11);

    void performAction(Bundle bundle, InterfaceC2642y0 interfaceC2642y0, long j10);

    void registerOnMeasurementEventListener(E0 e10);

    void resetAnalyticsData(long j10);

    void retrieveAndUploadBatches(B0 b10);

    void setConditionalUserProperty(Bundle bundle, long j10);

    void setConsent(Bundle bundle, long j10);

    void setConsentThirdParty(Bundle bundle, long j10);

    void setCurrentScreen(p314r8.a aVar, String str, String str2, long j10);

    void setCurrentScreenByScionActivityInfo(J0 j10, String str, String str2, long j11);

    void setDataCollectionEnabled(boolean z10);

    void setDefaultEventParameters(Bundle bundle);

    void setEventInterceptor(E0 e10);

    void setInstanceIdProvider(G0 g10);

    void setMeasurementEnabled(boolean z10, long j10);

    void setMinimumSessionDuration(long j10);

    void setSessionTimeoutDuration(long j10);

    void setSgtmDebugInfo(Intent intent);

    void setUserId(String str, long j10);

    void setUserProperty(String str, String str2, p314r8.a aVar, boolean z10, long j10);

    void unregisterOnMeasurementEventListener(E0 e10);
}
