package com.google.common.util.concurrent;

import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f37333a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f37334b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile Logger f37335c;

    f(Class cls) {
        this.f37334b = cls.getName();
    }

    Logger a() {
        Logger logger = this.f37335c;
        if (logger != null) {
            return logger;
        }
        synchronized (this.f37333a) {
            try {
                Logger logger2 = this.f37335c;
                if (logger2 != null) {
                    return logger2;
                }
                Logger logger3 = Logger.getLogger(this.f37334b);
                this.f37335c = logger3;
                return logger3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
