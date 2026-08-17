package p117g8;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class p implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC3430b f42216a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Intent f42217b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Context f42218c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f42219d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ BroadcastReceiver.PendingResult f42220e;

    public /* synthetic */ p(AbstractC3430b abstractC3430b, Intent intent, Context context, boolean z10, BroadcastReceiver.PendingResult pendingResult) {
        this.f42216a = abstractC3430b;
        this.f42217b = intent;
        this.f42218c = context;
        this.f42219d = z10;
        this.f42220e = pendingResult;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f42216a.d(this.f42217b, this.f42218c, this.f42219d, this.f42220e);
    }
}
