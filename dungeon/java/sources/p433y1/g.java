package p433y1;

import androidx.datastore.preferences.protobuf.AbstractC1945a;
import androidx.datastore.preferences.protobuf.AbstractC1963t;
import androidx.datastore.preferences.protobuf.AbstractC1964u;
import androidx.datastore.preferences.protobuf.L;
import androidx.datastore.preferences.protobuf.T;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class g extends AbstractC1963t implements L {
    private static final g DEFAULT_INSTANCE;
    private static volatile T PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private AbstractC1964u.b strings_ = AbstractC1963t.p();

    public static final class a extends AbstractC1963t.a implements L {
        private a() {
            super(g.DEFAULT_INSTANCE);
        }

        /* synthetic */ a(e eVar) {
            this();
        }

        public a p(Iterable iterable) {
            j();
            ((g) this.f23640b).N(iterable);
            return this;
        }
    }

    static {
        g gVar = new g();
        DEFAULT_INSTANCE = gVar;
        AbstractC1963t.I(g.class, gVar);
    }

    private g() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N(Iterable iterable) {
        O();
        AbstractC1945a.a(iterable, this.strings_);
    }

    private void O() {
        AbstractC1964u.b bVar = this.strings_;
        if (bVar.O()) {
            return;
        }
        this.strings_ = AbstractC1963t.B(bVar);
    }

    public static g P() {
        return DEFAULT_INSTANCE;
    }

    public static a R() {
        return (a) DEFAULT_INSTANCE.l();
    }

    public List Q() {
        return this.strings_;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1963t
    protected final Object o(AbstractC1963t.d dVar, Object obj, Object obj2) {
        T bVar;
        switch (e.f57754a[dVar.ordinal()]) {
            case 1:
                return new g();
            case 2:
                return new a(null);
            case 3:
                return AbstractC1963t.D(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                T t10 = PARSER;
                if (t10 != null) {
                    return t10;
                }
                synchronized (g.class) {
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
