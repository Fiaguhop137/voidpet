package M6;

import com.facebook.react.modules.core.JavaTimerManager;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ JavaTimerManager f6810a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f6811b;

    public /* synthetic */ e(JavaTimerManager javaTimerManager, boolean z10) {
        this.f6810a = javaTimerManager;
        this.f6811b = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        JavaTimerManager.A(this.f6810a, this.f6811b);
    }
}
