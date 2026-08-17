package p195kf;

import java.util.Collection;
import java.util.ServiceLoader;
import kotlin.sequences.k;
import p088ef.L;

/* JADX INFO: renamed from: kf.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3927e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Collection f48141a = k.V(k.h(ServiceLoader.load(L.class, L.class.getClassLoader()).iterator()));

    public static final Collection a() {
        return f48141a;
    }

    public static final void b(Throwable th) {
        Thread threadCurrentThread = Thread.currentThread();
        threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
    }
}
