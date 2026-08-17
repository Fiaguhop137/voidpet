package S9;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class f implements P9.e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Charset f11577f = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final P9.c f11578g = P9.c.a("key").b(S9.a.b().c(1).a()).a();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final P9.c f11579h = P9.c.a("value").b(S9.a.b().c(2).a()).a();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final P9.d f11580i = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private OutputStream f11581a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f11582b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f11583c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final P9.d f11584d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final i f11585e = new i(this);

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f11586a;

        static {
            int[] iArr = new int[d.a.values().length];
            f11586a = iArr;
            try {
                iArr[d.a.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11586a[d.a.SIGNED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11586a[d.a.FIXED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    f(OutputStream outputStream, Map map, Map map2, P9.d dVar) {
        this.f11581a = outputStream;
        this.f11582b = map;
        this.f11583c = map2;
        this.f11584d = dVar;
    }

    public static /* synthetic */ void c(Map.Entry entry, P9.e eVar) {
        eVar.e(f11578g, entry.getKey());
        eVar.e(f11579h, entry.getValue());
    }

    private static ByteBuffer m(int i10) {
        return ByteBuffer.allocate(i10).order(ByteOrder.LITTLE_ENDIAN);
    }

    private long n(P9.d dVar, Object obj) throws IOException {
        b bVar = new b();
        try {
            OutputStream outputStream = this.f11581a;
            this.f11581a = bVar;
            try {
                dVar.a(obj, this);
                this.f11581a = outputStream;
                long jA = bVar.a();
                bVar.close();
                return jA;
            } catch (Throwable th) {
                this.f11581a = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                bVar.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    private f o(P9.d dVar, P9.c cVar, Object obj, boolean z10) throws IOException {
        long jN = n(dVar, obj);
        if (z10 && jN == 0) {
            return this;
        }
        t((s(cVar) << 3) | 2);
        u(jN);
        dVar.a(obj, this);
        return this;
    }

    private f p(P9.f fVar, P9.c cVar, Object obj, boolean z10) {
        this.f11585e.b(cVar, z10);
        fVar.a(obj, this.f11585e);
        return this;
    }

    private static d r(P9.c cVar) {
        d dVar = (d) cVar.c(d.class);
        if (dVar != null) {
            return dVar;
        }
        throw new P9.b("Field has no @Protobuf config");
    }

    private static int s(P9.c cVar) {
        d dVar = (d) cVar.c(d.class);
        if (dVar != null) {
            return dVar.tag();
        }
        throw new P9.b("Field has no @Protobuf config");
    }

    private void t(int i10) throws IOException {
        while ((i10 & (-128)) != 0) {
            this.f11581a.write((i10 & 127) | 128);
            i10 >>>= 7;
        }
        this.f11581a.write(i10 & 127);
    }

    private void u(long j10) throws IOException {
        while (((-128) & j10) != 0) {
            this.f11581a.write((((int) j10) & 127) | 128);
            j10 >>>= 7;
        }
        this.f11581a.write(((int) j10) & 127);
    }

    P9.e d(P9.c cVar, double d10, boolean z10) throws IOException {
        if (z10 && d10 == 0.0d) {
            return this;
        }
        t((s(cVar) << 3) | 1);
        this.f11581a.write(m(8).putDouble(d10).array());
        return this;
    }

    @Override // P9.e
    public P9.e e(P9.c cVar, Object obj) {
        return g(cVar, obj, true);
    }

    P9.e f(P9.c cVar, float f10, boolean z10) throws IOException {
        if (z10 && f10 == 0.0f) {
            return this;
        }
        t((s(cVar) << 3) | 5);
        this.f11581a.write(m(4).putFloat(f10).array());
        return this;
    }

    P9.e g(P9.c cVar, Object obj, boolean z10) throws IOException {
        if (obj != null) {
            if (obj instanceof CharSequence) {
                CharSequence charSequence = (CharSequence) obj;
                if (!z10 || charSequence.length() != 0) {
                    t((s(cVar) << 3) | 2);
                    byte[] bytes = charSequence.toString().getBytes(f11577f);
                    t(bytes.length);
                    this.f11581a.write(bytes);
                    return this;
                }
            } else if (obj instanceof Collection) {
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    g(cVar, it.next(), false);
                }
            } else if (obj instanceof Map) {
                Iterator it2 = ((Map) obj).entrySet().iterator();
                while (it2.hasNext()) {
                    o(f11580i, cVar, (Map.Entry) it2.next(), false);
                }
            } else {
                if (obj instanceof Double) {
                    return d(cVar, ((Double) obj).doubleValue(), z10);
                }
                if (obj instanceof Float) {
                    return f(cVar, ((Float) obj).floatValue(), z10);
                }
                if (obj instanceof Number) {
                    return k(cVar, ((Number) obj).longValue(), z10);
                }
                if (obj instanceof Boolean) {
                    return l(cVar, ((Boolean) obj).booleanValue(), z10);
                }
                if (!(obj instanceof byte[])) {
                    P9.d dVar = (P9.d) this.f11582b.get(obj.getClass());
                    if (dVar != null) {
                        return o(dVar, cVar, obj, z10);
                    }
                    P9.f fVar = (P9.f) this.f11583c.get(obj.getClass());
                    if (fVar != null) {
                        return p(fVar, cVar, obj, z10);
                    }
                    if (obj instanceof c) {
                        return b(cVar, ((c) obj).getNumber());
                    }
                    return obj instanceof Enum ? b(cVar, ((Enum) obj).ordinal()) : o(this.f11584d, cVar, obj, z10);
                }
                byte[] bArr = (byte[]) obj;
                if (!z10 || bArr.length != 0) {
                    t((s(cVar) << 3) | 2);
                    t(bArr.length);
                    this.f11581a.write(bArr);
                    return this;
                }
            }
        }
        return this;
    }

    @Override // P9.e
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public f b(P9.c cVar, int i10) {
        return i(cVar, i10, true);
    }

    f i(P9.c cVar, int i10, boolean z10) throws IOException {
        if (!z10 || i10 != 0) {
            d dVarR = r(cVar);
            int i11 = a.f11586a[dVarR.intEncoding().ordinal()];
            if (i11 == 1) {
                t(dVarR.tag() << 3);
                t(i10);
                return this;
            }
            if (i11 == 2) {
                t(dVarR.tag() << 3);
                t((i10 << 1) ^ (i10 >> 31));
                return this;
            }
            if (i11 == 3) {
                t((dVarR.tag() << 3) | 5);
                this.f11581a.write(m(4).putInt(i10).array());
                return this;
            }
        }
        return this;
    }

    @Override // P9.e
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public f a(P9.c cVar, long j10) {
        return k(cVar, j10, true);
    }

    f k(P9.c cVar, long j10, boolean z10) throws IOException {
        if (!z10 || j10 != 0) {
            d dVarR = r(cVar);
            int i10 = a.f11586a[dVarR.intEncoding().ordinal()];
            if (i10 == 1) {
                t(dVarR.tag() << 3);
                u(j10);
                return this;
            }
            if (i10 == 2) {
                t(dVarR.tag() << 3);
                u((j10 >> 63) ^ (j10 << 1));
                return this;
            }
            if (i10 == 3) {
                t((dVarR.tag() << 3) | 1);
                this.f11581a.write(m(8).putLong(j10).array());
                return this;
            }
        }
        return this;
    }

    f l(P9.c cVar, boolean z10, boolean z11) {
        return i(cVar, z10 ? 1 : 0, z11);
    }

    f q(Object obj) {
        if (obj == null) {
            return this;
        }
        P9.d dVar = (P9.d) this.f11582b.get(obj.getClass());
        if (dVar != null) {
            dVar.a(obj, this);
            return this;
        }
        throw new P9.b("No encoder for " + obj.getClass());
    }
}
