package androidx.datastore.preferences.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1963t extends AbstractC1945a {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, AbstractC1963t> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize = -1;
    protected i0 unknownFields = i0.c();

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.t$a */
    public static abstract class a extends AbstractC1945a.AbstractC0285a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AbstractC1963t f23639a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        protected AbstractC1963t f23640b;

        protected a(AbstractC1963t abstractC1963t) {
            this.f23639a = abstractC1963t;
            if (abstractC1963t.y()) {
                throw new IllegalArgumentException("Default instance must be immutable.");
            }
            this.f23640b = o();
        }

        private static void n(Object obj, Object obj2) {
            W.a().d(obj).a(obj, obj2);
        }

        private AbstractC1963t o() {
            return this.f23639a.E();
        }

        public final AbstractC1963t f() {
            AbstractC1963t abstractC1963tG = G();
            if (abstractC1963tG.w()) {
                return abstractC1963tG;
            }
            throw AbstractC1945a.AbstractC0285a.e(abstractC1963tG);
        }

        @Override // androidx.datastore.preferences.protobuf.K.a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public AbstractC1963t G() {
            if (!this.f23640b.y()) {
                return this.f23640b;
            }
            this.f23640b.z();
            return this.f23640b;
        }

        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public a clone() {
            a aVarNewBuilderForType = getDefaultInstanceForType().newBuilderForType();
            aVarNewBuilderForType.f23640b = G();
            return aVarNewBuilderForType;
        }

        protected final void j() {
            if (this.f23640b.y()) {
                return;
            }
            l();
        }

        protected void l() {
            AbstractC1963t abstractC1963tO = o();
            n(abstractC1963tO, this.f23640b);
            this.f23640b = abstractC1963tO;
        }

        @Override // androidx.datastore.preferences.protobuf.L
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public AbstractC1963t getDefaultInstanceForType() {
            return this.f23639a;
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.t$b */
    protected static class b extends AbstractC1946b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final AbstractC1963t f23641b;

        public b(AbstractC1963t abstractC1963t) {
            this.f23641b = abstractC1963t;
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.t$c */
    public static class c extends AbstractC1955k {
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.t$d */
    public enum d {
        GET_MEMOIZED_IS_INITIALIZED,
        SET_MEMOIZED_IS_INITIALIZED,
        BUILD_MESSAGE_INFO,
        NEW_MUTABLE_INSTANCE,
        NEW_BUILDER,
        GET_DEFAULT_INSTANCE,
        GET_PARSER
    }

    protected static AbstractC1964u.b B(AbstractC1964u.b bVar) {
        int size = bVar.size();
        return bVar.f(size == 0 ? 10 : size * 2);
    }

    protected static Object D(K k10, String str, Object[] objArr) {
        return new Y(k10, str, objArr);
    }

    protected static AbstractC1963t F(AbstractC1963t abstractC1963t, InputStream inputStream) {
        return g(H(abstractC1963t, AbstractC1951g.g(inputStream), C1957m.b()));
    }

    static AbstractC1963t H(AbstractC1963t abstractC1963t, AbstractC1951g abstractC1951g, C1957m c1957m) throws C1965v {
        AbstractC1963t abstractC1963tE = abstractC1963t.E();
        try {
            a0 a0VarD = W.a().d(abstractC1963tE);
            a0VarD.h(abstractC1963tE, C1952h.N(abstractC1951g), c1957m);
            a0VarD.c(abstractC1963tE);
            return abstractC1963tE;
        } catch (g0 e10) {
            throw e10.a().k(abstractC1963tE);
        } catch (C1965v e11) {
            e = e11;
            if (e.a()) {
                e = new C1965v(e);
            }
            throw e.k(abstractC1963tE);
        } catch (IOException e12) {
            if (e12.getCause() instanceof C1965v) {
                throw ((C1965v) e12.getCause());
            }
            throw new C1965v(e12).k(abstractC1963tE);
        } catch (RuntimeException e13) {
            if (e13.getCause() instanceof C1965v) {
                throw ((C1965v) e13.getCause());
            }
            throw e13;
        }
    }

    protected static void I(Class cls, AbstractC1963t abstractC1963t) {
        abstractC1963t.A();
        defaultInstanceMap.put(cls, abstractC1963t);
    }

    private static AbstractC1963t g(AbstractC1963t abstractC1963t) throws C1965v {
        if (abstractC1963t == null || abstractC1963t.w()) {
            return abstractC1963t;
        }
        throw abstractC1963t.d().a().k(abstractC1963t);
    }

    private int k(a0 a0Var) {
        return a0Var == null ? W.a().d(this).e(this) : a0Var.e(this);
    }

    protected static AbstractC1964u.b p() {
        return X.e();
    }

    static AbstractC1963t q(Class cls) {
        AbstractC1963t abstractC1963t = defaultInstanceMap.get(cls);
        if (abstractC1963t == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC1963t = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (abstractC1963t != null) {
            return abstractC1963t;
        }
        AbstractC1963t defaultInstanceForType = ((AbstractC1963t) k0.i(cls)).getDefaultInstanceForType();
        if (defaultInstanceForType == null) {
            throw new IllegalStateException();
        }
        defaultInstanceMap.put(cls, defaultInstanceForType);
        return defaultInstanceForType;
    }

    static Object v(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e10);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    protected static final boolean x(AbstractC1963t abstractC1963t, boolean z10) {
        byte bByteValue = ((Byte) abstractC1963t.m(d.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zD = W.a().d(abstractC1963t).d(abstractC1963t);
        if (z10) {
            abstractC1963t.n(d.SET_MEMOIZED_IS_INITIALIZED, zD ? abstractC1963t : null);
        }
        return zD;
    }

    void A() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    @Override // androidx.datastore.preferences.protobuf.K
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public final a newBuilderForType() {
        return (a) m(d.NEW_BUILDER);
    }

    AbstractC1963t E() {
        return (AbstractC1963t) m(d.NEW_MUTABLE_INSTANCE);
    }

    void J(int i10) {
        this.memoizedHashCode = i10;
    }

    void K(int i10) {
        if (i10 >= 0) {
            this.memoizedSerializedSize = (i10 & Integer.MAX_VALUE) | (this.memoizedSerializedSize & Integer.MIN_VALUE);
        } else {
            throw new IllegalStateException("serialized size must be non-negative, was " + i10);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.K
    public void b(AbstractC1953i abstractC1953i) {
        W.a().d(this).i(this, C1954j.P(abstractC1953i));
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1945a
    int c(a0 a0Var) {
        if (!y()) {
            if (t() != Integer.MAX_VALUE) {
                return t();
            }
            int iK = k(a0Var);
            K(iK);
            return iK;
        }
        int iK2 = k(a0Var);
        if (iK2 >= 0) {
            return iK2;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + iK2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return W.a().d(this).g(this, (AbstractC1963t) obj);
        }
        return false;
    }

    Object f() {
        return m(d.BUILD_MESSAGE_INFO);
    }

    @Override // androidx.datastore.preferences.protobuf.K
    public int getSerializedSize() {
        return c(null);
    }

    void h() {
        this.memoizedHashCode = 0;
    }

    public int hashCode() {
        if (y()) {
            return j();
        }
        if (u()) {
            J(j());
        }
        return s();
    }

    void i() {
        K(Integer.MAX_VALUE);
    }

    int j() {
        return W.a().d(this).f(this);
    }

    protected final a l() {
        return (a) m(d.NEW_BUILDER);
    }

    protected Object m(d dVar) {
        return o(dVar, null, null);
    }

    protected Object n(d dVar, Object obj) {
        return o(dVar, obj, null);
    }

    protected abstract Object o(d dVar, Object obj, Object obj2);

    @Override // androidx.datastore.preferences.protobuf.L
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public final AbstractC1963t getDefaultInstanceForType() {
        return (AbstractC1963t) m(d.GET_DEFAULT_INSTANCE);
    }

    int s() {
        return this.memoizedHashCode;
    }

    int t() {
        return this.memoizedSerializedSize & Integer.MAX_VALUE;
    }

    public String toString() {
        return M.f(this, super.toString());
    }

    boolean u() {
        return s() == 0;
    }

    public final boolean w() {
        return x(this, true);
    }

    boolean y() {
        return (this.memoizedSerializedSize & Integer.MIN_VALUE) != 0;
    }

    protected void z() {
        W.a().d(this).c(this);
        A();
    }
}
