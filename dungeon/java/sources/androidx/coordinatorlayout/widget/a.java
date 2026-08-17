package androidx.coordinatorlayout.widget;

import androidx.core.util.Pools$SimplePool;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import p199l1.e;
import p323s.f0;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f23071a = new Pools$SimplePool(10);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final f0 f23072b = new f0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ArrayList f23073c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final HashSet f23074d = new HashSet();

    private void e(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (hashSet.contains(obj)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(obj);
        ArrayList arrayList2 = (ArrayList) this.f23072b.get(obj);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i10 = 0; i10 < size; i10++) {
                e(arrayList2.get(i10), arrayList, hashSet);
            }
        }
        hashSet.remove(obj);
        arrayList.add(obj);
    }

    private ArrayList f() {
        ArrayList arrayList = (ArrayList) this.f23071a.acquire();
        return arrayList == null ? new ArrayList() : arrayList;
    }

    private void l(ArrayList arrayList) {
        arrayList.clear();
        this.f23071a.a(arrayList);
    }

    public void a(Object obj, Object obj2) {
        if (!this.f23072b.containsKey(obj) || !this.f23072b.containsKey(obj2)) {
            throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
        }
        ArrayList arrayListF = (ArrayList) this.f23072b.get(obj);
        if (arrayListF == null) {
            arrayListF = f();
            this.f23072b.put(obj, arrayListF);
        }
        arrayListF.add(obj2);
    }

    public void b(Object obj) {
        if (this.f23072b.containsKey(obj)) {
            return;
        }
        this.f23072b.put(obj, null);
    }

    public void c() {
        int size = this.f23072b.size();
        for (int i10 = 0; i10 < size; i10++) {
            ArrayList arrayList = (ArrayList) this.f23072b.k(i10);
            if (arrayList != null) {
                l(arrayList);
            }
        }
        this.f23072b.clear();
    }

    public boolean d(Object obj) {
        return this.f23072b.containsKey(obj);
    }

    public List g(Object obj) {
        ArrayList arrayListH = h(obj);
        if (arrayListH == null) {
            return null;
        }
        return new ArrayList(arrayListH);
    }

    ArrayList h(Object obj) {
        return (ArrayList) this.f23072b.get(obj);
    }

    public List i(Object obj) {
        int size = this.f23072b.size();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < size; i10++) {
            ArrayList arrayList2 = (ArrayList) this.f23072b.k(i10);
            if (arrayList2 != null && arrayList2.contains(obj)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(this.f23072b.f(i10));
            }
        }
        return arrayList;
    }

    public ArrayList j() {
        this.f23073c.clear();
        this.f23074d.clear();
        int size = this.f23072b.size();
        for (int i10 = 0; i10 < size; i10++) {
            e(this.f23072b.f(i10), this.f23073c, this.f23074d);
        }
        return this.f23073c;
    }

    public boolean k(Object obj) {
        int size = this.f23072b.size();
        for (int i10 = 0; i10 < size; i10++) {
            ArrayList arrayList = (ArrayList) this.f23072b.k(i10);
            if (arrayList != null && arrayList.contains(obj)) {
                return true;
            }
        }
        return false;
    }
}
