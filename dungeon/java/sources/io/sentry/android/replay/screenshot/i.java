package io.sentry.android.replay.screenshot;

import android.view.View;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class i implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j f45529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f45530b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f45531c;

    public /* synthetic */ i(j jVar, View view, List list) {
        this.f45529a = jVar;
        this.f45530b = view;
        this.f45531c = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        j.p(this.f45529a, this.f45530b, this.f45531c);
    }
}
