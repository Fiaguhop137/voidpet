package io.sentry;

import java.net.InetAddress;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class I implements Callable {
    @Override // java.util.concurrent.Callable
    public final Object call() {
        return InetAddress.getLocalHost();
    }
}
