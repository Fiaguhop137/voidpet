package W5;

import android.os.Process;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class B implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f14631a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f14632b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f14633c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AtomicInteger f14634d;

    public B(int i10, String prefix, boolean z10) {
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        this.f14631a = i10;
        this.f14632b = prefix;
        this.f14633c = z10;
        this.f14634d = new AtomicInteger(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(B this$0, Runnable runnable) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(runnable, "$runnable");
        try {
            Process.setThreadPriority(this$0.f14631a);
        } catch (Throwable unused) {
        }
        runnable.run();
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        String str;
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        A a10 = new A(this, runnable);
        if (this.f14633c) {
            str = this.f14632b + "-" + this.f14634d.getAndIncrement();
        } else {
            str = this.f14632b;
        }
        return new Thread(a10, str);
    }
}
