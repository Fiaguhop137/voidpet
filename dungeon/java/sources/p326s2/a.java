package p326s2;

import U1.InterfaceC1470l;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public interface a extends Executor {

    /* JADX INFO: renamed from: s2.a$a, reason: collision with other inner class name */
    class C0645a implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Executor f53243a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ InterfaceC1470l f53244b;

        C0645a(Executor executor, InterfaceC1470l interfaceC1470l) {
            this.f53243a = executor;
            this.f53244b = interfaceC1470l;
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.f53243a.execute(runnable);
        }

        @Override // p326s2.a
        public void release() {
            this.f53244b.accept(this.f53243a);
        }
    }

    static a Z(Executor executor, InterfaceC1470l interfaceC1470l) {
        return new C0645a(executor, interfaceC1470l);
    }

    void release();
}
