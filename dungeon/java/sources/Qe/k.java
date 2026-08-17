package Qe;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public interface k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f9600a = a.f9601a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f9601a = new a();

        private a() {
        }

        public final d a(Runnable runnable, Function1 function1) {
            return (runnable == null || function1 == null) ? new d(null, 1, null) : new c(runnable, function1);
        }
    }

    void lock();

    void unlock();
}
