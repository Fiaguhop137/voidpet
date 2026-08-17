package com.facebook.react.devsupport;

/* JADX INFO: renamed from: com.facebook.react.devsupport.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC2207h implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Throwable f29685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CxxInspectorPackagerConnection.WebSocketDelegate f29686b;

    public /* synthetic */ RunnableC2207h(Throwable th, CxxInspectorPackagerConnection.WebSocketDelegate webSocketDelegate) {
        this.f29685a = th;
        this.f29686b = webSocketDelegate;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CxxInspectorPackagerConnection.DelegateImpl.b.l(this.f29685a, this.f29686b);
    }
}
