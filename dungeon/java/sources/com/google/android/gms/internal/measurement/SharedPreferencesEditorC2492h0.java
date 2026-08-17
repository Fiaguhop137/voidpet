package com.google.android.gms.internal.measurement;

import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.h0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class SharedPreferencesEditorC2492h0 implements SharedPreferences.Editor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    boolean f32924a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Set f32925b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Map f32926c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ SharedPreferencesC2501i0 f32927d;

    /* synthetic */ SharedPreferencesEditorC2492h0(SharedPreferencesC2501i0 sharedPreferencesC2501i0, byte[] bArr) {
        Objects.requireNonNull(sharedPreferencesC2501i0);
        this.f32927d = sharedPreferencesC2501i0;
        this.f32924a = false;
        this.f32925b = new HashSet();
        this.f32926c = new HashMap();
    }

    private final void a(String str, Object obj) {
        if (obj != null) {
            this.f32926c.put(str, obj);
        } else {
            remove(str);
        }
    }

    @Override // android.content.SharedPreferences.Editor
    public final void apply() {
        commit();
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor clear() {
        this.f32924a = true;
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final boolean commit() {
        if (this.f32924a) {
            this.f32927d.a().clear();
        }
        SharedPreferencesC2501i0 sharedPreferencesC2501i0 = this.f32927d;
        Set set = this.f32925b;
        sharedPreferencesC2501i0.a().keySet().removeAll(set);
        Map map = this.f32926c;
        for (Map.Entry entry : map.entrySet()) {
            sharedPreferencesC2501i0.a().put((String) entry.getKey(), entry.getValue());
        }
        for (SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener : sharedPreferencesC2501i0.b()) {
            C9.V it = C9.Q.k(set, map.keySet()).iterator();
            while (it.hasNext()) {
                onSharedPreferenceChangeListener.onSharedPreferenceChanged(sharedPreferencesC2501i0, (String) it.next());
            }
        }
        return (!this.f32924a && set.isEmpty() && map.isEmpty()) ? false : true;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putBoolean(String str, boolean z10) {
        a(str, Boolean.valueOf(z10));
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putFloat(String str, float f10) {
        a(str, Float.valueOf(f10));
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putInt(String str, int i10) {
        a(str, Integer.valueOf(i10));
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putLong(String str, long j10) {
        a(str, Long.valueOf(j10));
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putString(String str, String str2) {
        a(str, str2);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor putStringSet(String str, Set set) {
        a(str, set);
        return this;
    }

    @Override // android.content.SharedPreferences.Editor
    public final SharedPreferences.Editor remove(String str) {
        this.f32925b.add(str);
        return this;
    }
}
