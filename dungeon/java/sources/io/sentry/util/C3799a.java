package io.sentry.util;

import io.sentry.InterfaceC3698e0;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: io.sentry.util.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3799a extends ReentrantLock {

    /* JADX INFO: renamed from: io.sentry.util.a$a, reason: collision with other inner class name */
    static final class C0544a implements InterfaceC3698e0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ReentrantLock f46566a;

        C0544a(ReentrantLock reentrantLock) {
            this.f46566a = reentrantLock;
        }

        @Override // io.sentry.InterfaceC3698e0, java.lang.AutoCloseable
        public void close() {
            this.f46566a.unlock();
        }
    }

    public InterfaceC3698e0 a() {
        lock();
        return new C0544a(this);
    }
}
