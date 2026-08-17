package K9;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
class x implements W9.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile Set f6135b = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile Set f6134a = Collections.newSetFromMap(new ConcurrentHashMap());

    x(Collection collection) {
        this.f6134a.addAll(collection);
    }

    static x b(Collection collection) {
        return new x((Set) collection);
    }

    private synchronized void d() {
        try {
            Iterator it = this.f6134a.iterator();
            while (it.hasNext()) {
                this.f6135b.add(((W9.b) it.next()).get());
            }
            this.f6134a = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    synchronized void a(W9.b bVar) {
        try {
            if (this.f6135b == null) {
                this.f6134a.add(bVar);
            } else {
                this.f6135b.add(bVar.get());
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // W9.b
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Set get() {
        if (this.f6135b == null) {
            synchronized (this) {
                try {
                    if (this.f6135b == null) {
                        this.f6135b = Collections.newSetFromMap(new ConcurrentHashMap());
                        d();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return Collections.unmodifiableSet(this.f6135b);
    }
}
