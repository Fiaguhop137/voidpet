package L4;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f6341a = new LinkedHashMap(100, 0.75f, true);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f6342b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f6343c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f6344d;

    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Object f6345a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f6346b;

        a(Object obj, int i10) {
            this.f6345a = obj;
            this.f6346b = i10;
        }
    }

    public h(long j10) {
        this.f6342b = j10;
        this.f6343c = j10;
    }

    private void f() {
        m(this.f6343c);
    }

    public void b() {
        m(0L);
    }

    public synchronized Object g(Object obj) {
        a aVar;
        aVar = (a) this.f6341a.get(obj);
        return aVar != null ? aVar.f6345a : null;
    }

    public synchronized long h() {
        return this.f6343c;
    }

    protected int i(Object obj) {
        return 1;
    }

    protected void j(Object obj, Object obj2) {
    }

    public synchronized Object k(Object obj, Object obj2) {
        int i10 = i(obj2);
        long j10 = i10;
        if (j10 >= this.f6343c) {
            j(obj, obj2);
            return null;
        }
        if (obj2 != null) {
            this.f6344d += j10;
        }
        a aVar = (a) this.f6341a.put(obj, obj2 == null ? null : new a(obj2, i10));
        if (aVar != null) {
            this.f6344d -= (long) aVar.f6346b;
            if (!aVar.f6345a.equals(obj2)) {
                j(obj, aVar.f6345a);
            }
        }
        f();
        return aVar != null ? aVar.f6345a : null;
    }

    public synchronized Object l(Object obj) {
        a aVar = (a) this.f6341a.remove(obj);
        if (aVar == null) {
            return null;
        }
        this.f6344d -= (long) aVar.f6346b;
        return aVar.f6345a;
    }

    protected synchronized void m(long j10) {
        while (this.f6344d > j10) {
            Iterator it = this.f6341a.entrySet().iterator();
            Map.Entry entry = (Map.Entry) it.next();
            a aVar = (a) entry.getValue();
            this.f6344d -= (long) aVar.f6346b;
            Object key = entry.getKey();
            it.remove();
            j(key, aVar.f6345a);
        }
    }
}
