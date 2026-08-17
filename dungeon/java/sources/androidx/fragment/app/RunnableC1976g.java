package androidx.fragment.app;

import android.view.View;

/* JADX INFO: renamed from: androidx.fragment.app.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1976g implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1975f f23959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f23960b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C1975f.a f23961c;

    public /* synthetic */ RunnableC1976g(C1975f c1975f, View view, C1975f.a aVar) {
        this.f23959a = c1975f;
        this.f23960b = view;
        this.f23961c = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C1975f.AnimationAnimationListenerC0295f.b(this.f23959a, this.f23960b, this.f23961c);
    }
}
