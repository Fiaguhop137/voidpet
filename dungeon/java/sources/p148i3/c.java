package p148i3;

import android.content.Context;
import android.view.Choreographer;
import androidx.profileinstaller.ProfileInstallerInitializer;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements Choreographer.FrameCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ProfileInstallerInitializer f43746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f43747b;

    public /* synthetic */ c(ProfileInstallerInitializer profileInstallerInitializer, Context context) {
        this.f43746a = profileInstallerInitializer;
        this.f43747b = context;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j10) {
        this.f43746a.e(this.f43747b);
    }
}
