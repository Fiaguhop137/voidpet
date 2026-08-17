package p079e6;

import android.util.SparseArray;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes2.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final SparseArray f40500a = new SparseArray();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    a f40501b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    a f40502c;

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        a f40503a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f40504b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        LinkedList f40505c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        a f40506d;

        private a(a aVar, int i10, LinkedList linkedList, a aVar2) {
            this.f40503a = aVar;
            this.f40504b = i10;
            this.f40505c = linkedList;
            this.f40506d = aVar2;
        }

        /* synthetic */ a(a aVar, int i10, LinkedList linkedList, a aVar2, l lVar) {
            this(aVar, i10, linkedList, aVar2);
        }

        public String toString() {
            return "LinkedEntry(key: " + this.f40504b + ")";
        }
    }

    private void b(a aVar) {
        if (aVar == null || !aVar.f40505c.isEmpty()) {
            return;
        }
        d(aVar);
        this.f40500a.remove(aVar.f40504b);
    }

    private void c(a aVar) {
        if (this.f40501b == aVar) {
            return;
        }
        d(aVar);
        a aVar2 = this.f40501b;
        if (aVar2 == null) {
            this.f40501b = aVar;
            this.f40502c = aVar;
        } else {
            aVar.f40506d = aVar2;
            aVar2.f40503a = aVar;
            this.f40501b = aVar;
        }
    }

    private synchronized void d(a aVar) {
        try {
            a aVar2 = aVar.f40503a;
            a aVar3 = aVar.f40506d;
            if (aVar2 != null) {
                aVar2.f40506d = aVar3;
            }
            if (aVar3 != null) {
                aVar3.f40503a = aVar2;
            }
            aVar.f40503a = null;
            aVar.f40506d = null;
            if (aVar == this.f40501b) {
                this.f40501b = aVar3;
            }
            if (aVar == this.f40502c) {
                this.f40502c = aVar2;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized Object a(int i10) {
        a aVar = (a) this.f40500a.get(i10);
        if (aVar == null) {
            return null;
        }
        Object objPollFirst = aVar.f40505c.pollFirst();
        c(aVar);
        return objPollFirst;
    }

    public synchronized void e(int i10, Object obj) {
        try {
            a aVar = (a) this.f40500a.get(i10);
            if (aVar == null) {
                a aVar2 = new a(null, i10, new LinkedList(), null, null);
                this.f40500a.put(i10, aVar2);
                aVar = aVar2;
            }
            aVar.f40505c.addLast(obj);
            c(aVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized Object f() {
        a aVar = this.f40502c;
        if (aVar == null) {
            return null;
        }
        Object objPollLast = aVar.f40505c.pollLast();
        b(aVar);
        return objPollLast;
    }
}
