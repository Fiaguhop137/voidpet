package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

/* JADX INFO: renamed from: com.google.firebase.messaging.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3116k implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f37632a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Intent f37633b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f37634c;

    public /* synthetic */ C3116k(Context context, Intent intent, boolean z10) {
        this.f37632a = context;
        this.f37633b = intent;
        this.f37634c = z10;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        return C3119n.a(this.f37632a, this.f37633b, this.f37634c, task);
    }
}
