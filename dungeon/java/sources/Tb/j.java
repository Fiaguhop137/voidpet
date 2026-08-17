package Tb;

import android.content.IntentSender;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class j implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f12409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f12410b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ IntentSender.SendIntentException f12411c;

    public /* synthetic */ j(k kVar, int i10, IntentSender.SendIntentException sendIntentException) {
        this.f12409a = kVar;
        this.f12410b = i10;
        this.f12411c = sendIntentException;
    }

    @Override // java.lang.Runnable
    public final void run() {
        k.l(this.f12409a, this.f12410b, this.f12411c);
    }
}
