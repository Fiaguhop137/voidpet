package com.facebook.react.views.debuggingoverlay;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f30687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f30688b;

    public /* synthetic */ a(b bVar, int i10) {
        this.f30687a = bVar;
        this.f30688b = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        b.c(this.f30687a, this.f30688b);
    }
}
