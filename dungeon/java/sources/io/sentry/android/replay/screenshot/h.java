package io.sentry.android.replay.screenshot;

import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class h implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j f45526a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ io.sentry.android.replay.viewhierarchy.b f45527b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f45528c;

    public /* synthetic */ h(j jVar, io.sentry.android.replay.viewhierarchy.b bVar, View view) {
        this.f45526a = jVar;
        this.f45527b = bVar;
        this.f45528c = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        j.o(this.f45526a, this.f45527b, this.f45528c);
    }
}
