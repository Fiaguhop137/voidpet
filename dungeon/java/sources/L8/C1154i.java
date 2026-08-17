package L8;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: renamed from: L8.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C1154i implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Application f6468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f6469b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f6470c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ C1156j f6471d;

    /* synthetic */ C1154i(C1156j c1156j, Application application, byte[] bArr) {
        Objects.requireNonNull(c1156j);
        this.f6471d = c1156j;
        this.f6469b = false;
        this.f6468a = application;
    }

    final /* synthetic */ void a() {
        if (this.f6469b) {
            return;
        }
        this.f6468a.registerActivityLifecycleCallbacks(this);
        this.f6469b = true;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        String className = activity.getComponentName().getClassName();
        if (this.f6470c) {
            if (!Objects.equals(className, "com.epicgames.unreal.GameActivity")) {
                return;
            }
        } else if (Objects.equals(className, "com.epicgames.unreal.SplashActivity") && C1158k.f6477c.a(activity)) {
            this.f6470c = true;
            return;
        }
        this.f6468a.unregisterActivityLifecycleCallbacks(this);
        if (this.f6469b) {
            this.f6469b = false;
            Y.a("AutomaticGamesAuthenticator", "Automatic connection attempt triggered");
            this.f6471d.c().a();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
