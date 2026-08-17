package p148i3;

import android.content.Context;
import androidx.profileinstaller.ProfileInstallerInitializer;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f43748a;

    public /* synthetic */ d(Context context) {
        this.f43748a = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ProfileInstallerInitializer.f(this.f43748a);
    }
}
