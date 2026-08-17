package p328s4;

import L4.k;
import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public final class i implements p328s4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g f53267a = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f53268b = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f53269c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f53270d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f53271e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f53272f;

    private static final class a implements l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final b f53273a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f53274b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Class f53275c;

        a(b bVar) {
            this.f53273a = bVar;
        }

        @Override // p328s4.l
        public void a() {
            this.f53273a.c(this);
        }

        void b(int i10, Class cls) {
            this.f53274b = i10;
            this.f53275c = cls;
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (this.f53274b == aVar.f53274b && this.f53275c == aVar.f53275c) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            int i10 = this.f53274b * 31;
            Class cls = this.f53275c;
            return i10 + (cls != null ? cls.hashCode() : 0);
        }

        public String toString() {
            return "Key{size=" + this.f53274b + "array=" + this.f53275c + '}';
        }
    }

    private static final class b extends c {
        b() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // p328s4.c
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public a a() {
            return new a(this);
        }

        a e(int i10, Class cls) {
            a aVar = (a) b();
            aVar.b(i10, cls);
            return aVar;
        }
    }

    public i(int i10) {
        this.f53271e = i10;
    }

    private void e(int i10, Class cls) {
        NavigableMap navigableMapL = l(cls);
        Integer num = (Integer) navigableMapL.get(Integer.valueOf(i10));
        if (num != null) {
            if (num.intValue() == 1) {
                navigableMapL.remove(Integer.valueOf(i10));
                return;
            } else {
                navigableMapL.put(Integer.valueOf(i10), Integer.valueOf(num.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + i10 + ", this: " + this);
    }

    private void f() {
        g(this.f53271e);
    }

    private void g(int i10) {
        while (this.f53272f > i10) {
            Object objF = this.f53267a.f();
            k.d(objF);
            p328s4.a aVarH = h(objF);
            this.f53272f -= aVarH.b(objF) * aVarH.a();
            e(aVarH.b(objF), objF.getClass());
            if (Log.isLoggable(aVarH.getTag(), 2)) {
                Log.v(aVarH.getTag(), "evicted: " + aVarH.b(objF));
            }
        }
    }

    private p328s4.a h(Object obj) {
        return i(obj.getClass());
    }

    private p328s4.a i(Class cls) {
        p328s4.a fVar;
        p328s4.a aVar = (p328s4.a) this.f53270d.get(cls);
        if (aVar != null) {
            return aVar;
        }
        if (cls.equals(int[].class)) {
            fVar = new h();
        } else {
            if (!cls.equals(byte[].class)) {
                throw new IllegalArgumentException("No array pool found for: " + cls.getSimpleName());
            }
            fVar = new f();
        }
        this.f53270d.put(cls, fVar);
        return fVar;
    }

    private Object j(a aVar) {
        return this.f53267a.a(aVar);
    }

    private Object k(a aVar, Class cls) {
        p328s4.a aVarI = i(cls);
        Object objJ = j(aVar);
        if (objJ != null) {
            this.f53272f -= aVarI.b(objJ) * aVarI.a();
            e(aVarI.b(objJ), cls);
        }
        if (objJ != null) {
            return objJ;
        }
        if (Log.isLoggable(aVarI.getTag(), 2)) {
            Log.v(aVarI.getTag(), "Allocated " + aVar.f53274b + " bytes");
        }
        return aVarI.newArray(aVar.f53274b);
    }

    private NavigableMap l(Class cls) {
        NavigableMap navigableMap = (NavigableMap) this.f53269c.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f53269c.put(cls, treeMap);
        return treeMap;
    }

    private boolean m() {
        int i10 = this.f53272f;
        return i10 == 0 || this.f53271e / i10 >= 2;
    }

    private boolean n(int i10) {
        return i10 <= this.f53271e / 2;
    }

    private boolean o(int i10, Integer num) {
        if (num != null) {
            return m() || num.intValue() <= i10 * 8;
        }
        return false;
    }

    @Override // p328s4.b
    public synchronized void a(int i10) {
        try {
            if (i10 >= 40) {
                b();
            } else if (i10 >= 20 || i10 == 15) {
                g(this.f53271e / 2);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p328s4.b
    public synchronized void b() {
        g(0);
    }

    @Override // p328s4.b
    public synchronized Object c(int i10, Class cls) {
        Integer num;
        try {
            num = (Integer) l(cls).ceilingKey(Integer.valueOf(i10));
        } catch (Throwable th) {
            throw th;
        }
        return k(o(i10, num) ? this.f53268b.e(num.intValue(), cls) : this.f53268b.e(i10, cls), cls);
    }

    @Override // p328s4.b
    public synchronized Object d(int i10, Class cls) {
        return k(this.f53268b.e(i10, cls), cls);
    }

    @Override // p328s4.b
    public synchronized void put(Object obj) {
        Class<?> cls = obj.getClass();
        p328s4.a aVarI = i(cls);
        int iB = aVarI.b(obj);
        int iA = aVarI.a() * iB;
        if (n(iA)) {
            a aVarE = this.f53268b.e(iB, cls);
            this.f53267a.d(aVarE, obj);
            NavigableMap navigableMapL = l(cls);
            Integer num = (Integer) navigableMapL.get(Integer.valueOf(aVarE.f53274b));
            Integer numValueOf = Integer.valueOf(aVarE.f53274b);
            int iIntValue = 1;
            if (num != null) {
                iIntValue = 1 + num.intValue();
            }
            navigableMapL.put(numValueOf, Integer.valueOf(iIntValue));
            this.f53272f += iA;
            f();
        }
    }
}
