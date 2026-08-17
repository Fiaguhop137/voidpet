package E4;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class s implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set f2681a = Collections.newSetFromMap(new WeakHashMap());

    @Override // E4.l
    public void a() {
        Iterator it = L4.l.k(this.f2681a).iterator();
        while (it.hasNext()) {
            ((I4.d) it.next()).a();
        }
    }

    @Override // E4.l
    public void c() {
        Iterator it = L4.l.k(this.f2681a).iterator();
        while (it.hasNext()) {
            ((I4.d) it.next()).c();
        }
    }

    @Override // E4.l
    public void d() {
        Iterator it = L4.l.k(this.f2681a).iterator();
        while (it.hasNext()) {
            ((I4.d) it.next()).d();
        }
    }

    public void f() {
        this.f2681a.clear();
    }

    public List h() {
        return L4.l.k(this.f2681a);
    }

    public void n(I4.d dVar) {
        this.f2681a.add(dVar);
    }

    public void o(I4.d dVar) {
        this.f2681a.remove(dVar);
    }
}
