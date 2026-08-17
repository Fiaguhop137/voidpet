package p025b6;

import W4.a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class h extends a {
    protected void finalize() throws Throwable {
        if (isClosed()) {
            return;
        }
        a.K("CloseableImage", "finalize: %s %x still open.", getClass().getSimpleName(), Integer.valueOf(System.identityHashCode(this)));
        try {
            close();
        } finally {
            super.finalize();
        }
    }
}
