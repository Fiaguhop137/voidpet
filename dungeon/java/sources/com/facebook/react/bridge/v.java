package com.facebook.react.bridge;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class v implements Executor {
    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        ReactInstanceManagerInspectorTarget.mHybridData$lambda$0(runnable);
    }
}
