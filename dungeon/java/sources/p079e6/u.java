package p079e6;

import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public abstract class u implements A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set f40522a = new HashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final k f40523b = new k();

    private Object b(Object obj) {
        if (obj == null) {
            return obj;
        }
        synchronized (this) {
            this.f40522a.remove(obj);
        }
        return obj;
    }

    @Override // p079e6.A
    public Object get(int i10) {
        return b(this.f40523b.a(i10));
    }

    @Override // p079e6.A
    public Object pop() {
        return b(this.f40523b.f());
    }

    @Override // p079e6.A
    public void put(Object obj) {
        boolean zAdd;
        synchronized (this) {
            zAdd = this.f40522a.add(obj);
        }
        if (zAdd) {
            this.f40523b.e(a(obj), obj);
        }
    }
}
