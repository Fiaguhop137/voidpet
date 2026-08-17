package io.sentry.android.core;

import android.app.Activity;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: io.sentry.android.core.q0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C3664q0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final C3664q0 f45152b = new C3664q0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private WeakReference f45153a;

    private C3664q0() {
    }

    public static C3664q0 c() {
        return f45152b;
    }

    public void a(Activity activity) {
        WeakReference weakReference = this.f45153a;
        if (weakReference == null || weakReference.get() == activity) {
            this.f45153a = null;
        }
    }

    public Activity b() {
        WeakReference weakReference = this.f45153a;
        if (weakReference != null) {
            return (Activity) weakReference.get();
        }
        return null;
    }

    public void d(Activity activity) {
        WeakReference weakReference = this.f45153a;
        if (weakReference == null || weakReference.get() != activity) {
            this.f45153a = new WeakReference(activity);
        }
    }
}
