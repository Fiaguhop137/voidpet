package V1;

import U1.AbstractC1459a;
import U1.F;
import U1.S;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f14029a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayDeque f14030b = new ArrayDeque();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ArrayDeque f14031c = new ArrayDeque();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final PriorityQueue f14032d = new PriorityQueue();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f14033e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private a f14034f;

    private static final class a implements Comparable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f14036b = -9223372036854775807L;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f14035a = new ArrayList();

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public int compareTo(a aVar) {
            return Long.compare(this.f14036b, aVar.f14036b);
        }

        public void g(long j10, F f10) {
            AbstractC1459a.a(j10 != -9223372036854775807L);
            AbstractC1459a.g(this.f14035a.isEmpty());
            this.f14036b = j10;
            this.f14035a.add(f10);
        }
    }

    public interface b {
        void a(long j10, F f10);
    }

    public k(b bVar) {
        this.f14029a = bVar;
    }

    private F c(F f10) {
        F f11 = this.f14030b.isEmpty() ? new F() : (F) this.f14030b.pop();
        f11.W(f10.a());
        System.arraycopy(f10.f(), f10.g(), f11.f(), 0, f11.a());
        return f11;
    }

    private void e(int i10) {
        while (this.f14032d.size() > i10) {
            a aVar = (a) S.i((a) this.f14032d.poll());
            for (int i11 = 0; i11 < aVar.f14035a.size(); i11++) {
                this.f14029a.a(aVar.f14036b, (F) aVar.f14035a.get(i11));
                this.f14030b.push((F) aVar.f14035a.get(i11));
            }
            aVar.f14035a.clear();
            a aVar2 = this.f14034f;
            if (aVar2 != null && aVar2.f14036b == aVar.f14036b) {
                this.f14034f = null;
            }
            this.f14031c.push(aVar);
        }
    }

    public void a(long j10, F f10) {
        int i10 = this.f14033e;
        if (i10 == 0 || (i10 != -1 && this.f14032d.size() >= this.f14033e && j10 < ((a) S.i((a) this.f14032d.peek())).f14036b)) {
            this.f14029a.a(j10, f10);
            return;
        }
        F fC = c(f10);
        a aVar = this.f14034f;
        if (aVar != null && j10 == aVar.f14036b) {
            aVar.f14035a.add(fC);
            return;
        }
        a aVar2 = this.f14031c.isEmpty() ? new a() : (a) this.f14031c.pop();
        aVar2.g(j10, fC);
        this.f14032d.add(aVar2);
        this.f14034f = aVar2;
        int i11 = this.f14033e;
        if (i11 != -1) {
            e(i11);
        }
    }

    public void b() {
        this.f14032d.clear();
    }

    public void d() {
        e(0);
    }

    public int f() {
        return this.f14033e;
    }

    public void g(int i10) {
        AbstractC1459a.g(i10 >= 0);
        this.f14033e = i10;
        e(i10);
    }
}
