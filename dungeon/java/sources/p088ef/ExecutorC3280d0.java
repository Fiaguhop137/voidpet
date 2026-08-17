package p088ef;

import java.util.concurrent.Executor;
import kotlin.coroutines.e;

/* JADX INFO: renamed from: ef.d0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class ExecutorC3280d0 implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final K f40818a;

    public ExecutorC3280d0(K k10) {
        this.f40818a = k10;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        K k10 = this.f40818a;
        e eVar = e.f48283a;
        if (k10.h0(eVar)) {
            this.f40818a.e0(eVar, runnable);
        } else {
            runnable.run();
        }
    }

    public String toString() {
        return this.f40818a.toString();
    }
}
