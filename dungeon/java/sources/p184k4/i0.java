package p184k4;

import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SharedPreferences.Editor f48004a;

    public /* synthetic */ i0(SharedPreferences.Editor editor) {
        this.f48004a = editor;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f48004a.commit();
    }
}
