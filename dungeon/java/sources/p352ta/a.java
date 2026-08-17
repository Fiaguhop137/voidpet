package p352ta;

import java.lang.ref.ReferenceQueue;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ReferenceQueue f54589a = new ReferenceQueue();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set f54590b = Collections.synchronizedSet(new HashSet());

    /* JADX INFO: renamed from: ta.a$a, reason: collision with other inner class name */
    public interface InterfaceC0676a {
        void a();
    }

    private a() {
    }

    public static a a() {
        a aVar = new a();
        aVar.b(aVar, new m());
        Thread thread = new Thread(new n(aVar.f54589a, aVar.f54590b), "MlKitCleaner");
        thread.setDaemon(true);
        thread.start();
        return aVar;
    }

    public InterfaceC0676a b(Object obj, Runnable runnable) {
        p pVar = new p(obj, this.f54589a, this.f54590b, runnable, null);
        this.f54590b.add(pVar);
        return pVar;
    }
}
