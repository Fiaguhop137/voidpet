package com.google.firebase.messaging;

import android.content.Intent;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: renamed from: com.google.firebase.messaging.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC3113h implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractServiceC3114i f37612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Intent f37613b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f37614c;

    public /* synthetic */ RunnableC3113h(AbstractServiceC3114i abstractServiceC3114i, Intent intent, TaskCompletionSource taskCompletionSource) {
        this.f37612a = abstractServiceC3114i;
        this.f37613b = intent;
        this.f37614c = taskCompletionSource;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractServiceC3114i.a(this.f37612a, this.f37613b, this.f37614c);
    }
}
