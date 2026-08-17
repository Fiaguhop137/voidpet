package com.google.android.gms.internal.play_billing;

import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
final class D0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final D f34431a = new D();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f34432b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile Logger f34433c;

    D0(Class cls) {
        this.f34432b = cls.getName();
    }

    final Logger a() {
        Logger logger = this.f34433c;
        if (logger != null) {
            return logger;
        }
        synchronized (this.f34431a) {
            try {
                Logger logger2 = this.f34433c;
                if (logger2 != null) {
                    return logger2;
                }
                Logger logger3 = Logger.getLogger(this.f34432b);
                this.f34433c = logger3;
                return logger3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
