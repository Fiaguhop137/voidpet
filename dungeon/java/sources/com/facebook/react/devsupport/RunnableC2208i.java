package com.facebook.react.devsupport;

/* JADX INFO: renamed from: com.facebook.react.devsupport.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC2208i implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CxxInspectorPackagerConnection.WebSocketDelegate f29688a;

    public /* synthetic */ RunnableC2208i(CxxInspectorPackagerConnection.WebSocketDelegate webSocketDelegate) {
        this.f29688a = webSocketDelegate;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CxxInspectorPackagerConnection.DelegateImpl.b.k(this.f29688a);
    }
}
