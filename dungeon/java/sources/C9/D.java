package C9;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes2.dex */
public abstract class D {

    class a extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f1481a;

        a(int i10) {
            this.f1481a = i10;
        }

        @Override // C9.D.e
        Map c() {
            return K.c(this.f1481a);
        }
    }

    class b extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Comparator f1482a;

        b(Comparator comparator) {
            this.f1482a = comparator;
        }

        @Override // C9.D.e
        Map c() {
            return new TreeMap(this.f1482a);
        }
    }

    private static final class c implements B9.t, Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f1483a;

        c(int i10) {
            this.f1483a = AbstractC0865h.b(i10, "expectedValuesPerKey");
        }

        @Override // B9.t
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List get() {
            return new ArrayList(this.f1483a);
        }
    }

    public static abstract class d extends D {
        d() {
            super(null);
        }

        public abstract y e();
    }

    public static abstract class e {

        class a extends d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ int f1484a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ e f1485b;

            a(e eVar, int i10) {
                this.f1484a = i10;
                this.f1485b = eVar;
            }

            @Override // C9.D.d
            public y e() {
                return E.b(this.f1485b.c(), new c(this.f1484a));
            }
        }

        e() {
        }

        public d a() {
            return b(2);
        }

        public d b(int i10) {
            AbstractC0865h.b(i10, "expectedValuesPerKey");
            return new a(this, i10);
        }

        abstract Map c();
    }

    private D() {
    }

    /* synthetic */ D(a aVar) {
        this();
    }

    public static e a() {
        return b(8);
    }

    public static e b(int i10) {
        AbstractC0865h.b(i10, "expectedKeys");
        return new a(i10);
    }

    public static e c() {
        return d(J.c());
    }

    public static e d(Comparator comparator) {
        B9.n.j(comparator);
        return new b(comparator);
    }
}
