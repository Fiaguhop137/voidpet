package com.google.android.gms.internal.measurement;

import android.content.SharedPreferences;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.p4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class SharedPreferencesOnSharedPreferenceChangeListenerC2568p4 implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ C2577q4 f33079a;

    /* synthetic */ SharedPreferencesOnSharedPreferenceChangeListenerC2568p4(C2577q4 c2577q4) {
        this.f33079a = c2577q4;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final /* synthetic */ void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        this.f33079a.e(sharedPreferences, str);
    }
}
