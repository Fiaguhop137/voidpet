package com.facebook.react.devsupport;

/* JADX INFO: renamed from: com.facebook.react.devsupport.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC2210k implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CxxInspectorPackagerConnection.WebSocketDelegate f29693a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f29694b;

    public /* synthetic */ RunnableC2210k(CxxInspectorPackagerConnection.WebSocketDelegate webSocketDelegate, String str) {
        this.f29693a = webSocketDelegate;
        this.f29694b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CxxInspectorPackagerConnection.DelegateImpl.b.m(this.f29693a, this.f29694b);
    }
}
