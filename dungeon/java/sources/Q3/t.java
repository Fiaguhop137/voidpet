package Q3;

import java.util.Map;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes.dex */
public abstract class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f9366a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f9367b = AbstractC1337c.b(0, 0.0f, 3, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f9368c;

    public t(long j10) {
        this.f9366a = j10;
        if (j10 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
    }

    private final long g() {
        long jI = 0;
        for (Map.Entry entry : this.f9367b.entrySet()) {
            jI += i(entry.getKey(), entry.getValue());
        }
        return jI;
    }

    private final long i(Object obj, Object obj2) throws Exception {
        try {
            long j10 = j(obj, obj2);
            if (j10 >= 0) {
                return j10;
            }
            throw new IllegalStateException(("sizeOf(" + obj + ", " + obj2 + ") returned a negative value: " + j10).toString());
        } catch (Exception e10) {
            this.f9368c = -1L;
            throw e10;
        }
    }

    public final void a() {
        k(-1L);
    }

    public abstract void b(Object obj, Object obj2, Object obj3);

    public final Object c(Object obj) {
        return this.f9367b.get(obj);
    }

    public final long d() {
        return this.f9366a;
    }

    public final long e() {
        if (this.f9368c == -1) {
            this.f9368c = g();
        }
        return this.f9368c;
    }

    public final Object f(Object obj, Object obj2) {
        Object objPut = this.f9367b.put(obj, obj2);
        this.f9368c = e() + i(obj, obj2);
        if (objPut != null) {
            this.f9368c = e() - i(obj, objPut);
            b(obj, objPut, obj2);
        }
        k(this.f9366a);
        return objPut;
    }

    public final Object h(Object obj) {
        Object objRemove = this.f9367b.remove(obj);
        if (objRemove != null) {
            this.f9368c = e() - i(obj, objRemove);
            b(obj, objRemove, null);
        }
        return objRemove;
    }

    public abstract long j(Object obj, Object obj2);

    public final void k(long j10) {
        while (e() > j10) {
            if (this.f9367b.isEmpty()) {
                if (e() != 0) {
                    throw new IllegalStateException("sizeOf() is returning inconsistent values");
                }
                return;
            }
            Map.Entry entry = (Map.Entry) CollectionsKt.i0(this.f9367b.entrySet());
            Object key = entry.getKey();
            Object value = entry.getValue();
            this.f9367b.remove(key);
            this.f9368c = e() - i(key, value);
            b(key, value, null);
        }
    }
}
