package p433y1;

import androidx.datastore.preferences.protobuf.AbstractC1950f;
import androidx.datastore.preferences.protobuf.AbstractC1963t;
import androidx.datastore.preferences.protobuf.L;
import androidx.datastore.preferences.protobuf.T;

/* JADX INFO: loaded from: classes.dex */
public final class h extends AbstractC1963t implements L {
    public static final int BOOLEAN_FIELD_NUMBER = 1;
    public static final int BYTES_FIELD_NUMBER = 8;
    private static final h DEFAULT_INSTANCE;
    public static final int DOUBLE_FIELD_NUMBER = 7;
    public static final int FLOAT_FIELD_NUMBER = 2;
    public static final int INTEGER_FIELD_NUMBER = 3;
    public static final int LONG_FIELD_NUMBER = 4;
    private static volatile T PARSER = null;
    public static final int STRING_FIELD_NUMBER = 5;
    public static final int STRING_SET_FIELD_NUMBER = 6;
    private int valueCase_ = 0;
    private Object value_;

    public static final class a extends AbstractC1963t.a implements L {
        private a() {
            super(h.DEFAULT_INSTANCE);
        }

        /* synthetic */ a(e eVar) {
            this();
        }

        public a p(boolean z10) {
            j();
            ((h) this.f23640b).f0(z10);
            return this;
        }

        public a q(AbstractC1950f abstractC1950f) {
            j();
            ((h) this.f23640b).g0(abstractC1950f);
            return this;
        }

        public a r(double d10) {
            j();
            ((h) this.f23640b).h0(d10);
            return this;
        }

        public a s(float f10) {
            j();
            ((h) this.f23640b).i0(f10);
            return this;
        }

        public a u(int i10) {
            j();
            ((h) this.f23640b).j0(i10);
            return this;
        }

        public a v(long j10) {
            j();
            ((h) this.f23640b).k0(j10);
            return this;
        }

        public a w(String str) {
            j();
            ((h) this.f23640b).l0(str);
            return this;
        }

        public a x(g.a aVar) {
            j();
            ((h) this.f23640b).m0((g) aVar.f());
            return this;
        }
    }

    public enum b {
        BOOLEAN(1),
        FLOAT(2),
        INTEGER(3),
        LONG(4),
        STRING(5),
        STRING_SET(6),
        DOUBLE(7),
        BYTES(8),
        VALUE_NOT_SET(0);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f57766a;

        b(int i10) {
            this.f57766a = i10;
        }

        public static b g(int i10) {
            switch (i10) {
                case 0:
                    return VALUE_NOT_SET;
                case 1:
                    return BOOLEAN;
                case 2:
                    return FLOAT;
                case 3:
                    return INTEGER;
                case 4:
                    return LONG;
                case 5:
                    return STRING;
                case 6:
                    return STRING_SET;
                case 7:
                    return DOUBLE;
                case 8:
                    return BYTES;
                default:
                    return null;
            }
        }
    }

    static {
        h hVar = new h();
        DEFAULT_INSTANCE = hVar;
        AbstractC1963t.I(h.class, hVar);
    }

    private h() {
    }

    public static h W() {
        return DEFAULT_INSTANCE;
    }

    public static a e0() {
        return (a) DEFAULT_INSTANCE.l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f0(boolean z10) {
        this.valueCase_ = 1;
        this.value_ = Boolean.valueOf(z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g0(AbstractC1950f abstractC1950f) {
        abstractC1950f.getClass();
        this.valueCase_ = 8;
        this.value_ = abstractC1950f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h0(double d10) {
        this.valueCase_ = 7;
        this.value_ = Double.valueOf(d10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i0(float f10) {
        this.valueCase_ = 2;
        this.value_ = Float.valueOf(f10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j0(int i10) {
        this.valueCase_ = 3;
        this.value_ = Integer.valueOf(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k0(long j10) {
        this.valueCase_ = 4;
        this.value_ = Long.valueOf(j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l0(String str) {
        str.getClass();
        this.valueCase_ = 5;
        this.value_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m0(g gVar) {
        gVar.getClass();
        this.value_ = gVar;
        this.valueCase_ = 6;
    }

    public boolean U() {
        if (this.valueCase_ == 1) {
            return ((Boolean) this.value_).booleanValue();
        }
        return false;
    }

    public AbstractC1950f V() {
        return this.valueCase_ == 8 ? (AbstractC1950f) this.value_ : AbstractC1950f.f23435b;
    }

    public double X() {
        if (this.valueCase_ == 7) {
            return ((Double) this.value_).doubleValue();
        }
        return 0.0d;
    }

    public float Y() {
        if (this.valueCase_ == 2) {
            return ((Float) this.value_).floatValue();
        }
        return 0.0f;
    }

    public int Z() {
        if (this.valueCase_ == 3) {
            return ((Integer) this.value_).intValue();
        }
        return 0;
    }

    public long a0() {
        if (this.valueCase_ == 4) {
            return ((Long) this.value_).longValue();
        }
        return 0L;
    }

    public String b0() {
        return this.valueCase_ == 5 ? (String) this.value_ : "";
    }

    public g c0() {
        return this.valueCase_ == 6 ? (g) this.value_ : g.P();
    }

    public b d0() {
        return b.g(this.valueCase_);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1963t
    protected final Object o(AbstractC1963t.d dVar, Object obj, Object obj2) {
        T bVar;
        switch (e.f57754a[dVar.ordinal()]) {
            case 1:
                return new h();
            case 2:
                return new a(null);
            case 3:
                return AbstractC1963t.D(DEFAULT_INSTANCE, "\u0001\b\u0001\u0000\u0001\b\b\u0000\u0000\u0000\u0001:\u0000\u00024\u0000\u00037\u0000\u00045\u0000\u0005;\u0000\u0006<\u0000\u00073\u0000\b=\u0000", new Object[]{"value_", "valueCase_", g.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                T t10 = PARSER;
                if (t10 != null) {
                    return t10;
                }
                synchronized (h.class) {
                    try {
                        bVar = PARSER;
                        if (bVar == null) {
                            bVar = new AbstractC1963t.b(DEFAULT_INSTANCE);
                            PARSER = bVar;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return bVar;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
