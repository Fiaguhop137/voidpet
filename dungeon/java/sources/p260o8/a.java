package p260o8;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import p170j8.r;

/* JADX INFO: loaded from: classes2.dex */
public class a implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f50456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ThreadFactory f50457b = Executors.defaultThreadFactory();

    public a(String str) {
        r.m(str, "Name must not be null");
        this.f50456a = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = this.f50457b.newThread(new b(runnable, 0));
        threadNewThread.setName(this.f50456a);
        return threadNewThread;
    }
}
