package Zc;

import android.view.View;
import p163j1.s;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s f18919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f18920b;

    public /* synthetic */ c(s sVar, View view) {
        this.f18919a = sVar;
        this.f18920b = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        d.h(this.f18919a, this.f18920b);
    }
}
