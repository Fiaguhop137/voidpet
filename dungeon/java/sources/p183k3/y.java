package p183k3;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class y implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f47958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayDeque f47959b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Runnable f47960c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f47961d;

    public y(Executor executor) {
        Intrinsics.checkNotNullParameter(executor, "executor");
        this.f47958a = executor;
        this.f47959b = new ArrayDeque();
        this.f47961d = new Object();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Runnable command, y this$0) {
        Intrinsics.checkNotNullParameter(command, "$command");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            command.run();
        } finally {
            this$0.c();
        }
    }

    public final void c() {
        synchronized (this.f47961d) {
            try {
                Object objPoll = this.f47959b.poll();
                Runnable runnable = (Runnable) objPoll;
                this.f47960c = runnable;
                if (objPoll != null) {
                    this.f47958a.execute(runnable);
                }
                Unit unit = Unit.f48228a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable command) {
        Intrinsics.checkNotNullParameter(command, "command");
        synchronized (this.f47961d) {
            try {
                this.f47959b.offer(new x(command, this));
                if (this.f47960c == null) {
                    c();
                }
                Unit unit = Unit.f48228a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
