package com.swmansion.reanimated;

import com.facebook.react.uimanager.events.EventDispatcher;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ NodesManager f38918a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EventDispatcher f38919b;

    public /* synthetic */ d(NodesManager nodesManager, EventDispatcher eventDispatcher) {
        this.f38918a = nodesManager;
        this.f38919b = eventDispatcher;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f38918a.lambda$new$0(this.f38919b);
    }
}
