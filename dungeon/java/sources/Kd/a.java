package Kd;

import Ad.AbstractC0793c;
import p002a1.e;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {
    public static final void a(AutoCloseable autoCloseable, Throwable th) throws Exception {
        if (autoCloseable != null) {
            if (th == null) {
                e.a(autoCloseable);
                return;
            }
            try {
                e.a(autoCloseable);
            } catch (Throwable th2) {
                AbstractC0793c.a(th, th2);
            }
        }
    }
}
