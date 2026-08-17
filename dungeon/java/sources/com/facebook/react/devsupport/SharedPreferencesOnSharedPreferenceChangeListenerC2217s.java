package com.facebook.react.devsupport;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.facebook.react.devsupport.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class SharedPreferencesOnSharedPreferenceChangeListenerC2217s implements N6.a, SharedPreferences.OnSharedPreferenceChangeListener {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f29741e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f29742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SharedPreferences f29743b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final T6.e f29744c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f29745d;

    /* JADX INFO: renamed from: com.facebook.react.devsupport.s$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.devsupport.s$b */
    public interface b {
        void a();
    }

    public SharedPreferencesOnSharedPreferenceChangeListenerC2217s(Context applicationContext, b bVar) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        this.f29742a = bVar;
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(applicationContext);
        Intrinsics.checkNotNullExpressionValue(defaultSharedPreferences, "getDefaultSharedPreferences(...)");
        this.f29743b = defaultSharedPreferences;
        this.f29744c = new T6.e(applicationContext);
        defaultSharedPreferences.registerOnSharedPreferenceChangeListener(this);
        this.f29745d = p384v6.a.f56277b;
    }

    @Override // N6.a
    public void d(boolean z10) {
        this.f29743b.edit().putBoolean("hot_module_replacement", z10).apply();
    }

    @Override // N6.a
    public void j(boolean z10) {
        this.f29743b.edit().putBoolean("fps_debug", z10).apply();
    }

    @Override // N6.a
    public boolean k() {
        return this.f29743b.getBoolean("inspector_debug", false);
    }

    @Override // N6.a
    public void l(boolean z10) {
        this.f29743b.edit().putBoolean("inspector_debug", z10).apply();
    }

    @Override // N6.a
    public boolean m() {
        return this.f29743b.getBoolean("fps_debug", false);
    }

    @Override // N6.a
    public boolean n() {
        return this.f29743b.getBoolean("hot_module_replacement", true);
    }

    @Override // N6.a
    public boolean o() {
        return this.f29745d;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        if (this.f29742a != null) {
            if (Intrinsics.b("fps_debug", str) || Intrinsics.b("js_dev_mode_debug", str) || Intrinsics.b("js_minify_debug", str)) {
                this.f29742a.a();
            }
        }
    }

    @Override // N6.a
    public boolean p() {
        return this.f29743b.getBoolean("js_minify_debug", false);
    }

    @Override // N6.a
    public boolean q() {
        return this.f29743b.getBoolean("js_dev_mode_debug", true);
    }

    @Override // N6.a
    public T6.e r() {
        return this.f29744c;
    }

    @Override // N6.a
    public void s(boolean z10) {
        this.f29743b.edit().putBoolean("js_dev_mode_debug", z10).apply();
    }
}
