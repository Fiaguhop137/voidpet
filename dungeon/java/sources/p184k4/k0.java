package p184k4;

import android.app.Activity;
import com.applovin.impl.q0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q0 f48006a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Activity f48007b;

    public /* synthetic */ k0(q0 q0Var, Activity activity) {
        this.f48006a = q0Var;
        this.f48007b = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f48006a.a(this.f48007b);
    }
}
