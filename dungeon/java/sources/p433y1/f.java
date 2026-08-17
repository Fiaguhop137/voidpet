package p433y1;

import androidx.datastore.preferences.protobuf.AbstractC1963t;
import androidx.datastore.preferences.protobuf.D;
import androidx.datastore.preferences.protobuf.E;
import androidx.datastore.preferences.protobuf.L;
import androidx.datastore.preferences.protobuf.T;
import androidx.datastore.preferences.protobuf.m0;
import java.io.InputStream;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class f extends AbstractC1963t implements L {
    private static final f DEFAULT_INSTANCE;
    private static volatile T PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private E preferences_ = E.e();

    public static final class a extends AbstractC1963t.a implements L {
        private a() {
            super(f.DEFAULT_INSTANCE);
        }

        /* synthetic */ a(e eVar) {
            this();
        }

        public a p(String str, h hVar) {
            str.getClass();
            hVar.getClass();
            j();
            ((f) this.f23640b).N().put(str, hVar);
            return this;
        }
    }

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final D f57755a = D.d(m0.b.f23536k, "", m0.b.f23538m, h.W());
    }

    static {
        f fVar = new f();
        DEFAULT_INSTANCE = fVar;
        AbstractC1963t.I(f.class, fVar);
    }

    private f() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map N() {
        return P();
    }

    private E P() {
        if (!this.preferences_.m()) {
            this.preferences_ = this.preferences_.q();
        }
        return this.preferences_;
    }

    private E Q() {
        return this.preferences_;
    }

    public static a R() {
        return (a) DEFAULT_INSTANCE.l();
    }

    public static f S(InputStream inputStream) {
        return (f) AbstractC1963t.F(DEFAULT_INSTANCE, inputStream);
    }

    public Map O() {
        return Collections.unmodifiableMap(Q());
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC1963t
    protected final Object o(AbstractC1963t.d dVar, Object obj, Object obj2) {
        T bVar;
        switch (e.f57754a[dVar.ordinal()]) {
            case 1:
                return new f();
            case 2:
                return new a(null);
            case 3:
                return AbstractC1963t.D(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", b.f57755a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                T t10 = PARSER;
                if (t10 != null) {
                    return t10;
                }
                synchronized (f.class) {
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
