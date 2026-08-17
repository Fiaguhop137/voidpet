package com.facebook.react.devsupport;

/* JADX INFO: renamed from: com.facebook.react.devsupport.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC2209j implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CxxInspectorPackagerConnection.WebSocketDelegate f29690a;

    public /* synthetic */ RunnableC2209j(CxxInspectorPackagerConnection.WebSocketDelegate webSocketDelegate) {
        this.f29690a = webSocketDelegate;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CxxInspectorPackagerConnection.DelegateImpl.b.n(this.f29690a);
    }
}
