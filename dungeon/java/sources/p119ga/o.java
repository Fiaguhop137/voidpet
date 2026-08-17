package p119ga;

import java.io.IOException;
import java.math.BigDecimal;
import p155ia.g;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public abstract class o implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o f42292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final o f42293b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final o f42294c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final o f42295d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ o[] f42296e;

    final enum a extends o {
        a(String str, int i10) {
            super(str, i10, null);
        }

        @Override // p119ga.p
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public Double e(p262oa.a aVar) {
            return Double.valueOf(aVar.nextDouble());
        }
    }

    final enum b extends o {
        b(String str, int i10) {
            super(str, i10, null);
        }

        @Override // p119ga.p
        public Number e(p262oa.a aVar) {
            return new g(aVar.j2());
        }
    }

    final enum c extends o {
        c(String str, int i10) {
            super(str, i10, null);
        }

        @Override // p119ga.p
        public Number e(p262oa.a aVar) throws IOException {
            String strJ2 = aVar.j2();
            try {
                try {
                    return Long.valueOf(Long.parseLong(strJ2));
                } catch (NumberFormatException unused) {
                    Double dValueOf = Double.valueOf(strJ2);
                    if (dValueOf.isInfinite() || dValueOf.isNaN()) {
                        if (!aVar.g()) {
                            throw new p262oa.d("JSON forbids NaN and infinities: " + dValueOf + "; at path " + aVar.f());
                        }
                    }
                    return dValueOf;
                }
            } catch (NumberFormatException e10) {
                throw new j("Cannot parse " + strJ2 + "; at path " + aVar.f(), e10);
            }
        }
    }

    final enum d extends o {
        d(String str, int i10) {
            super(str, i10, null);
        }

        @Override // p119ga.p
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public BigDecimal e(p262oa.a aVar) throws IOException {
            String strJ2 = aVar.j2();
            try {
                return new BigDecimal(strJ2);
            } catch (NumberFormatException e10) {
                throw new j("Cannot parse " + strJ2 + "; at path " + aVar.f(), e10);
            }
        }
    }

    static {
        a aVar = new a("DOUBLE", 0);
        f42292a = aVar;
        b bVar = new b("LAZILY_PARSED_NUMBER", 1);
        f42293b = bVar;
        c cVar = new c("LONG_OR_DOUBLE", 2);
        f42294c = cVar;
        d dVar = new d("BIG_DECIMAL", 3);
        f42295d = dVar;
        f42296e = new o[]{aVar, bVar, cVar, dVar};
    }

    private o(String str, int i10) {
        super(str, i10);
    }

    /* synthetic */ o(String str, int i10, a aVar) {
        this(str, i10);
    }

    public static o valueOf(String str) {
        return (o) Enum.valueOf(o.class, str);
    }

    public static o[] values() {
        return (o[]) f42296e.clone();
    }
}
