package R9;

import P9.f;
import P9.g;
import android.util.Base64;
import android.util.JsonWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class e implements P9.e, g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private e f10909a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f10910b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final JsonWriter f10911c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f10912d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map f10913e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final P9.d f10914f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f10915g;

    e(Writer writer, Map map, Map map2, P9.d dVar, boolean z10) {
        this.f10911c = new JsonWriter(writer);
        this.f10912d = map;
        this.f10913e = map2;
        this.f10914f = dVar;
        this.f10915g = z10;
    }

    private boolean o(Object obj) {
        return obj == null || obj.getClass().isArray() || (obj instanceof Collection) || (obj instanceof Date) || (obj instanceof Enum) || (obj instanceof Number);
    }

    private e r(String str, Object obj) throws IOException {
        t();
        this.f10911c.name(str);
        if (obj != null) {
            return h(obj, false);
        }
        this.f10911c.nullValue();
        return this;
    }

    private e s(String str, Object obj) throws IOException {
        if (obj == null) {
            return this;
        }
        t();
        this.f10911c.name(str);
        return h(obj, false);
    }

    private void t() throws IOException {
        if (!this.f10910b) {
            throw new IllegalStateException("Parent context used since this context was created. Cannot use this context anymore.");
        }
        e eVar = this.f10909a;
        if (eVar != null) {
            eVar.t();
            this.f10909a.f10910b = false;
            this.f10909a = null;
            this.f10911c.endObject();
        }
    }

    @Override // P9.e
    public P9.e a(P9.c cVar, long j10) {
        return k(cVar.b(), j10);
    }

    @Override // P9.e
    public P9.e b(P9.c cVar, int i10) {
        return j(cVar.b(), i10);
    }

    @Override // P9.e
    public P9.e e(P9.c cVar, Object obj) {
        return l(cVar.b(), obj);
    }

    public e f(int i10) throws IOException {
        t();
        this.f10911c.value(i10);
        return this;
    }

    public e g(long j10) throws IOException {
        t();
        this.f10911c.value(j10);
        return this;
    }

    e h(Object obj, boolean z10) {
        if (z10 && o(obj)) {
            throw new P9.b(String.format("%s cannot be encoded inline", obj == null ? null : obj.getClass()));
        }
        if (obj == null) {
            this.f10911c.nullValue();
            return this;
        }
        if (obj instanceof Number) {
            this.f10911c.value((Number) obj);
            return this;
        }
        int i10 = 0;
        if (!obj.getClass().isArray()) {
            if (obj instanceof Collection) {
                this.f10911c.beginArray();
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    h(it.next(), false);
                }
                this.f10911c.endArray();
                return this;
            }
            if (obj instanceof Map) {
                this.f10911c.beginObject();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    Object key = entry.getKey();
                    try {
                        l((String) key, entry.getValue());
                    } catch (ClassCastException e10) {
                        throw new P9.b(String.format("Only String keys are currently supported in maps, got %s of type %s instead.", key, key.getClass()), e10);
                    }
                }
                this.f10911c.endObject();
                return this;
            }
            P9.d dVar = (P9.d) this.f10912d.get(obj.getClass());
            if (dVar != null) {
                return q(dVar, obj, z10);
            }
            f fVar = (f) this.f10913e.get(obj.getClass());
            if (fVar != null) {
                fVar.a(obj, this);
                return this;
            }
            if (!(obj instanceof Enum)) {
                return q(this.f10914f, obj, z10);
            }
            c(((Enum) obj).name());
            return this;
        }
        if (obj instanceof byte[]) {
            return n((byte[]) obj);
        }
        this.f10911c.beginArray();
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            int length = iArr.length;
            while (i10 < length) {
                this.f10911c.value(iArr[i10]);
                i10++;
            }
        } else if (obj instanceof long[]) {
            long[] jArr = (long[]) obj;
            int length2 = jArr.length;
            while (i10 < length2) {
                g(jArr[i10]);
                i10++;
            }
        } else if (obj instanceof double[]) {
            double[] dArr = (double[]) obj;
            int length3 = dArr.length;
            while (i10 < length3) {
                this.f10911c.value(dArr[i10]);
                i10++;
            }
        } else if (obj instanceof boolean[]) {
            boolean[] zArr = (boolean[]) obj;
            int length4 = zArr.length;
            while (i10 < length4) {
                this.f10911c.value(zArr[i10]);
                i10++;
            }
        } else if (obj instanceof Number[]) {
            for (Number number : (Number[]) obj) {
                h(number, false);
            }
        } else {
            for (Object obj2 : (Object[]) obj) {
                h(obj2, false);
            }
        }
        this.f10911c.endArray();
        return this;
    }

    @Override // P9.g
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public e c(String str) throws IOException {
        t();
        this.f10911c.value(str);
        return this;
    }

    public e j(String str, int i10) throws IOException {
        t();
        this.f10911c.name(str);
        return f(i10);
    }

    public e k(String str, long j10) throws IOException {
        t();
        this.f10911c.name(str);
        return g(j10);
    }

    public e l(String str, Object obj) {
        return this.f10915g ? s(str, obj) : r(str, obj);
    }

    @Override // P9.g
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public e d(boolean z10) throws IOException {
        t();
        this.f10911c.value(z10);
        return this;
    }

    public e n(byte[] bArr) throws IOException {
        t();
        if (bArr == null) {
            this.f10911c.nullValue();
            return this;
        }
        this.f10911c.value(Base64.encodeToString(bArr, 2));
        return this;
    }

    void p() {
        t();
        this.f10911c.flush();
    }

    e q(P9.d dVar, Object obj, boolean z10) throws IOException {
        if (!z10) {
            this.f10911c.beginObject();
        }
        dVar.a(obj, this);
        if (!z10) {
            this.f10911c.endObject();
        }
        return this;
    }
}
