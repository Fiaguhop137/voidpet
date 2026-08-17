package B9;

import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public abstract class u {

    static class a implements t, Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private transient Object f630a = new Object();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final t f631b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        volatile transient boolean f632c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        transient Object f633d;

        a(t tVar) {
            this.f631b = (t) n.j(tVar);
        }

        @Override // B9.t
        public Object get() {
            if (!this.f632c) {
                synchronized (this.f630a) {
                    try {
                        if (!this.f632c) {
                            Object obj = this.f631b.get();
                            this.f633d = obj;
                            this.f632c = true;
                            return obj;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return i.a(this.f633d);
        }

        public String toString() {
            Object obj;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Suppliers.memoize(");
            if (this.f632c) {
                obj = "<supplier that returned " + this.f633d + ">";
            } else {
                obj = this.f631b;
            }
            sb2.append(obj);
            sb2.append(")");
            return sb2.toString();
        }
    }

    static class b implements t {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final t f634d = new v();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f635a = new Object();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private volatile t f636b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Object f637c;

        b(t tVar) {
            this.f636b = (t) n.j(tVar);
        }

        public static /* synthetic */ Void a() {
            throw new IllegalStateException();
        }

        @Override // B9.t
        public Object get() {
            t tVar = this.f636b;
            t tVar2 = f634d;
            if (tVar != tVar2) {
                synchronized (this.f635a) {
                    try {
                        if (this.f636b != tVar2) {
                            Object obj = this.f636b.get();
                            this.f637c = obj;
                            this.f636b = tVar2;
                            return obj;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return i.a(this.f637c);
        }

        public String toString() {
            Object obj = this.f636b;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Suppliers.memoize(");
            if (obj == f634d) {
                obj = "<supplier that returned " + this.f637c + ">";
            }
            sb2.append(obj);
            sb2.append(")");
            return sb2.toString();
        }
    }

    private static class c implements t, Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Object f638a;

        c(Object obj) {
            this.f638a = obj;
        }

        public boolean equals(Object obj) {
            if (obj instanceof c) {
                return j.a(this.f638a, ((c) obj).f638a);
            }
            return false;
        }

        @Override // B9.t
        public Object get() {
            return this.f638a;
        }

        public int hashCode() {
            return j.b(this.f638a);
        }

        public String toString() {
            return "Suppliers.ofInstance(" + this.f638a + ")";
        }
    }

    public static t a(t tVar) {
        if ((tVar instanceof b) || (tVar instanceof a)) {
            return tVar;
        }
        return tVar instanceof Serializable ? new a(tVar) : new b(tVar);
    }

    public static t b(Object obj) {
        return new c(obj);
    }
}
