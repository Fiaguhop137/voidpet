package com.google.android.material.snackbar;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: loaded from: classes2.dex */
class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static a f36944c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f36945a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f36946b = new Handler(Looper.getMainLooper(), new C0405a());

    /* JADX INFO: renamed from: com.google.android.material.snackbar.a$a, reason: collision with other inner class name */
    class C0405a implements Handler.Callback {
        C0405a() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            a aVar = a.this;
            android.support.v4.media.session.b.a(message.obj);
            aVar.c(null);
            return true;
        }
    }

    interface b {
    }

    private static class c {
    }

    private a() {
    }

    private boolean a(c cVar, int i10) {
        throw null;
    }

    static a b() {
        if (f36944c == null) {
            f36944c = new a();
        }
        return f36944c;
    }

    private boolean d(b bVar) {
        return false;
    }

    void c(c cVar) {
        synchronized (this.f36945a) {
            a(cVar, 2);
        }
    }

    public void e(b bVar) {
        synchronized (this.f36945a) {
            try {
                if (d(bVar)) {
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void f(b bVar) {
        synchronized (this.f36945a) {
            try {
                if (d(bVar)) {
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
