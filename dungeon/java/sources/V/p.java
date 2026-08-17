package V;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public abstract class p {
    public static AtomicReference a() {
        return b(new AtomicReference(null));
    }

    private static AtomicReference b(AtomicReference atomicReference) {
        return atomicReference;
    }

    public static final Object c(AtomicReference atomicReference) {
        android.support.v4.media.session.b.a(atomicReference.get());
        return null;
    }
}
