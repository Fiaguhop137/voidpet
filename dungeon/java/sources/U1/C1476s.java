package U1;

import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: renamed from: U1.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1476s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC1466h f12936a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC1474p f12937b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f12938c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final CopyOnWriteArraySet f12939d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ArrayDeque f12940e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ArrayDeque f12941f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Object f12942g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f12943h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f12944i;

    /* JADX INFO: renamed from: U1.s$a */
    public interface a {
        void invoke(Object obj);
    }

    /* JADX INFO: renamed from: U1.s$b */
    public interface b {
        void a(Object obj, R1.p pVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U1.s$c */
    static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f12945a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private R1.p.b f12946b = new R1.p.b();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f12947c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f12948d;

        public c(Object obj) {
            this.f12945a = obj;
        }

        public void a(int i10, a aVar) {
            if (this.f12948d) {
                return;
            }
            if (i10 != -1) {
                this.f12946b.a(i10);
            }
            this.f12947c = true;
            aVar.invoke(this.f12945a);
        }

        public void b(b bVar) {
            if (this.f12948d || !this.f12947c) {
                return;
            }
            R1.p pVarE = this.f12946b.e();
            this.f12946b = new R1.p.b();
            this.f12947c = false;
            bVar.a(this.f12945a, pVarE);
        }

        public void c(b bVar) {
            this.f12948d = true;
            if (this.f12947c) {
                this.f12947c = false;
                bVar.a(this.f12945a, this.f12946b.e());
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || c.class != obj.getClass()) {
                return false;
            }
            return this.f12945a.equals(((c) obj).f12945a);
        }

        public int hashCode() {
            return this.f12945a.hashCode();
        }
    }

    public C1476s(Looper looper, InterfaceC1466h interfaceC1466h, b bVar) {
        this(new CopyOnWriteArraySet(), looper, interfaceC1466h, bVar, true);
    }

    private C1476s(CopyOnWriteArraySet copyOnWriteArraySet, Looper looper, InterfaceC1466h interfaceC1466h, b bVar, boolean z10) {
        this.f12936a = interfaceC1466h;
        this.f12939d = copyOnWriteArraySet;
        this.f12938c = bVar;
        this.f12942g = new Object();
        this.f12940e = new ArrayDeque();
        this.f12941f = new ArrayDeque();
        this.f12937b = interfaceC1466h.e(looper, new C1475q(this));
        this.f12944i = z10;
    }

    public static /* synthetic */ void a(CopyOnWriteArraySet copyOnWriteArraySet, int i10, a aVar) {
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            ((c) it.next()).a(i10, aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean g(Message message) {
        Iterator it = this.f12939d.iterator();
        while (it.hasNext()) {
            ((c) it.next()).b(this.f12938c);
            if (this.f12937b.b(1)) {
                break;
            }
        }
        return true;
    }

    private void k() {
        if (this.f12944i) {
            AbstractC1459a.g(Thread.currentThread() == this.f12937b.f().getThread());
        }
    }

    public void c(Object obj) {
        AbstractC1459a.e(obj);
        synchronized (this.f12942g) {
            try {
                if (this.f12943h) {
                    return;
                }
                this.f12939d.add(new c(obj));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public C1476s d(Looper looper, InterfaceC1466h interfaceC1466h, b bVar) {
        return new C1476s(this.f12939d, looper, interfaceC1466h, bVar, this.f12944i);
    }

    public C1476s e(Looper looper, b bVar) {
        return d(looper, this.f12936a, bVar);
    }

    public void f() {
        k();
        if (this.f12941f.isEmpty()) {
            return;
        }
        if (!this.f12937b.b(1)) {
            InterfaceC1474p interfaceC1474p = this.f12937b;
            interfaceC1474p.j(interfaceC1474p.a(1));
        }
        boolean zIsEmpty = this.f12940e.isEmpty();
        this.f12940e.addAll(this.f12941f);
        this.f12941f.clear();
        if (zIsEmpty) {
            while (!this.f12940e.isEmpty()) {
                ((Runnable) this.f12940e.peekFirst()).run();
                this.f12940e.removeFirst();
            }
        }
    }

    public void h(int i10, a aVar) {
        k();
        this.f12941f.add(new r(new CopyOnWriteArraySet(this.f12939d), i10, aVar));
    }

    public void i() {
        k();
        synchronized (this.f12942g) {
            this.f12943h = true;
        }
        Iterator it = this.f12939d.iterator();
        while (it.hasNext()) {
            ((c) it.next()).c(this.f12938c);
        }
        this.f12939d.clear();
    }

    public void j(int i10, a aVar) {
        h(i10, aVar);
        f();
    }
}
