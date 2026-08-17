package com.facebook.react.devsupport;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class g0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j0 f29682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f29683b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z6.e.a f29684c;

    public /* synthetic */ g0(j0 j0Var, String str, z6.e.a aVar) {
        this.f29682a = j0Var;
        this.f29683b = str;
        this.f29684c = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        j0.f(this.f29682a, this.f29683b, this.f29684c);
    }
}
