package p382v4;

import L4.h;
import L4.l;
import java.util.Queue;

/* JADX INFO: loaded from: classes.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h f56224a;

    class a extends h {
        a(long j10) {
            super(j10);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // L4.h
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public void j(b bVar, Object obj) {
            bVar.c();
        }
    }

    static final class b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final Queue f56226d = l.g(0);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f56227a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f56228b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Object f56229c;

        private b() {
        }

        static b a(Object obj, int i10, int i11) {
            b bVar;
            Queue queue = f56226d;
            synchronized (queue) {
                bVar = (b) queue.poll();
            }
            if (bVar == null) {
                bVar = new b();
            }
            bVar.b(obj, i10, i11);
            return bVar;
        }

        private void b(Object obj, int i10, int i11) {
            this.f56229c = obj;
            this.f56228b = i10;
            this.f56227a = i11;
        }

        public void c() {
            Queue queue = f56226d;
            synchronized (queue) {
                queue.offer(this);
            }
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.f56228b == bVar.f56228b && this.f56227a == bVar.f56227a && this.f56229c.equals(bVar.f56229c)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (((this.f56227a * 31) + this.f56228b) * 31) + this.f56229c.hashCode();
        }
    }

    public m(long j10) {
        this.f56224a = new a(j10);
    }

    public Object a(Object obj, int i10, int i11) {
        b bVarA = b.a(obj, i10, i11);
        Object objG = this.f56224a.g(bVarA);
        bVarA.c();
        return objG;
    }

    public void b(Object obj, int i10, int i11, Object obj2) {
        this.f56224a.k(b.a(obj, i10, i11), obj2);
    }
}
