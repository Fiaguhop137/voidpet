package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.t0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2599t0 extends O implements InterfaceC2617v0 {
    C2599t0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2617v0
    public final void beginAdUnitExposure(String str, long j10) {
        Parcel parcelH = h();
        parcelH.writeString(str);
        parcelH.writeLong(j10);
        k(23, parcelH);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2617v0
    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        Parcel parcelH = h();
        parcelH.writeString(str);
        parcelH.writeString(str2);
        Q.c(parcelH, bundle);
        k(9, parcelH);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2617v0
    public final void endAdUnitExposure(String str, long j10) {
        Parcel parcelH = h();
        parcelH.writeString(str);
        parcelH.writeLong(j10);
        k(24, parcelH);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2617v0
    public final void generateEventId(InterfaceC2642y0 interfaceC2642y0) {
        Parcel parcelH = h();
        Q.d(parcelH, interfaceC2642y0);
        k(22, parcelH);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2617v0
    public final void getAppInstanceId(InterfaceC2642y0 interfaceC2642y0) {
        Parcel parcelH = h();
        Q.d(parcelH, interfaceC2642y0);
        k(20, parcelH);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2617v0
    public final void getCachedAppInstanceId(InterfaceC2642y0 interfaceC2642y0) {
        Parcel parcelH = h();
        Q.d(parcelH, interfaceC2642y0);
        k(19, parcelH);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2617v0
    public final void getConditionalUserProperties(String str, String str2, InterfaceC2642y0 interfaceC2642y0) {
        Parcel parcelH = h();
        parcelH.writeString(str);
        parcelH.writeString(str2);
        Q.d(parcelH, interfaceC2642y0);
        k(10, parcelH);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2617v0
    public final void getCurrentScreenClass(InterfaceC2642y0 interfaceC2642y0) {
        Parcel parcelH = h();
        Q.d(parcelH, interfaceC2642y0);
        k(17, parcelH);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2617v0
    public final void getCurrentScreenName(InterfaceC2642y0 interfaceC2642y0) {
        Parcel parcelH = h();
        Q.d(parcelH, interfaceC2642y0);
        k(16, parcelH);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2617v0
    public final void getGmpAppId(InterfaceC2642y0 interfaceC2642y0) {
        Parcel parcelH = h();
        Q.d(parcelH, interfaceC2642y0);
        k(21, parcelH);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2617v0
    public final void getMaxUserProperties(String str, InterfaceC2642y0 interfaceC2642y0) {
        Parcel parcelH = h();
        parcelH.writeString(str);
        Q.d(parcelH, interfaceC2642y0);
        k(6, parcelH);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2617v0
    public final void getSessionId(InterfaceC2642y0 interfaceC2642y0) {
        Parcel parcelH = h();
        Q.d(parcelH, interfaceC2642y0);
        k(46, parcelH);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2617v0
    public final void getUserProperties(String str, String str2, boolean z10, InterfaceC2642y0 interfaceC2642y0) {
        Parcel parcelH = h();
        parcelH.writeString(str);
        parcelH.writeString(str2);
        int i10 = Q.f32699b;
        parcelH.writeInt(z10 ? 1 : 0);
        Q.d(parcelH, interfaceC2642y0);
        k(5, parcelH);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2617v0
    public final void initialize(p314r8.a aVar, H0 h10, long j10) {
        Parcel parcelH = h();
        Q.d(parcelH, aVar);
        Q.c(parcelH, h10);
        parcelH.writeLong(j10);
        k(1, parcelH);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2617v0
    public final void logEvent(String str, String str2, Bundle bundle, boolean z10, boolean z11, long j10) {
        Parcel parcelH = h();
        parcelH.writeString(str);
        parcelH.writeString(str2);
        Q.c(parcelH, bundle);
        parcelH.writeInt(z10 ? 1 : 0);
        parcelH.writeInt(z11 ? 1 : 0);
        parcelH.writeLong(j10);
        k(2, parcelH);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2617v0
    public final void logHealthData(int i10, String str, p314r8.a aVar, p314r8.a aVar2, p314r8.a aVar3) {
        Parcel parcelH = h();
        parcelH.writeInt(5);
        parcelH.writeString(str);
        Q.d(parcelH, aVar);
        Q.d(parcelH, aVar2);
        Q.d(parcelH, aVar3);
        k(33, parcelH);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2617v0
    public final void onActivityCreatedByScionActivityInfo(J0 j10, Bundle bundle, long j11) {
        Parcel parcelH = h();
        Q.c(parcelH, j10);
        Q.c(parcelH, bundle);
        parcelH.writeLong(j11);
        k(53, parcelH);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2617v0
    public final void onActivityDestroyedByScionActivityInfo(J0 j10, long j11) {
        Parcel parcelH = h();
        Q.c(parcelH, j10);
        parcelH.writeLong(j11);
        k(54, parcelH);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2617v0
    public final void onActivityPausedByScionActivityInfo(J0 j10, long j11) {
        Parcel parcelH = h();
        Q.c(parcelH, j10);
        parcelH.writeLong(j11);
        k(55, parcelH);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2617v0
    public final void onActivityResumedByScionActivityInfo(J0 j10, long j11) {
        Parcel parcelH = h();
        Q.c(parcelH, j10);
        parcelH.writeLong(j11);
        k(56, parcelH);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2617v0
    public final void onActivitySaveInstanceStateByScionActivityInfo(J0 j10, InterfaceC2642y0 interfaceC2642y0, long j11) {
        Parcel parcelH = h();
        Q.c(parcelH, j10);
        Q.d(parcelH, interfaceC2642y0);
        parcelH.writeLong(j11);
        k(57, parcelH);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2617v0
    public final void onActivityStartedByScionActivityInfo(J0 j10, long j11) {
        Parcel parcelH = h();
        Q.c(parcelH, j10);
        parcelH.writeLong(j11);
        k(51, parcelH);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2617v0
    public final void onActivityStoppedByScionActivityInfo(J0 j10, long j11) {
        Parcel parcelH = h();
        Q.c(parcelH, j10);
        parcelH.writeLong(j11);
        k(52, parcelH);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2617v0
    public final void resetAnalyticsData(long j10) {
        Parcel parcelH = h();
        parcelH.writeLong(j10);
        k(12, parcelH);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2617v0
    public final void retrieveAndUploadBatches(B0 b10) {
        Parcel parcelH = h();
        Q.d(parcelH, b10);
        k(58, parcelH);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2617v0
    public final void setConditionalUserProperty(Bundle bundle, long j10) {
        Parcel parcelH = h();
        Q.c(parcelH, bundle);
        parcelH.writeLong(j10);
        k(8, parcelH);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2617v0
    public final void setConsentThirdParty(Bundle bundle, long j10) {
        Parcel parcelH = h();
        Q.c(parcelH, bundle);
        parcelH.writeLong(j10);
        k(45, parcelH);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2617v0
    public final void setCurrentScreenByScionActivityInfo(J0 j10, String str, String str2, long j11) {
        Parcel parcelH = h();
        Q.c(parcelH, j10);
        parcelH.writeString(str);
        parcelH.writeString(str2);
        parcelH.writeLong(j11);
        k(50, parcelH);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2617v0
    public final void setDataCollectionEnabled(boolean z10) {
        Parcel parcelH = h();
        int i10 = Q.f32699b;
        parcelH.writeInt(z10 ? 1 : 0);
        k(39, parcelH);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2617v0
    public final void setDefaultEventParameters(Bundle bundle) {
        Parcel parcelH = h();
        Q.c(parcelH, bundle);
        k(42, parcelH);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2617v0
    public final void setMeasurementEnabled(boolean z10, long j10) {
        Parcel parcelH = h();
        int i10 = Q.f32699b;
        parcelH.writeInt(z10 ? 1 : 0);
        parcelH.writeLong(j10);
        k(11, parcelH);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2617v0
    public final void setSessionTimeoutDuration(long j10) {
        Parcel parcelH = h();
        parcelH.writeLong(j10);
        k(14, parcelH);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2617v0
    public final void setUserId(String str, long j10) {
        Parcel parcelH = h();
        parcelH.writeString(str);
        parcelH.writeLong(j10);
        k(7, parcelH);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2617v0
    public final void setUserProperty(String str, String str2, p314r8.a aVar, boolean z10, long j10) {
        Parcel parcelH = h();
        parcelH.writeString(str);
        parcelH.writeString(str2);
        Q.d(parcelH, aVar);
        parcelH.writeInt(z10 ? 1 : 0);
        parcelH.writeLong(j10);
        k(4, parcelH);
    }
}
