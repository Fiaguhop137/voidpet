package p172ja;

import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p119ga.e;
import p119ga.h;
import p119ga.i;
import p119ga.k;
import p262oa.c;

/* JADX INFO: loaded from: classes2.dex */
public final class f extends c {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final Writer f47069p = new a();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final k f47070q = new k("closed");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final List f47071m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f47072n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private p119ga.f f47073o;

    class a extends Writer {
        a() {
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            throw new AssertionError();
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
            throw new AssertionError();
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i10, int i11) {
            throw new AssertionError();
        }
    }

    public f() {
        super(f47069p);
        this.f47071m = new ArrayList();
        this.f47073o = h.f42281a;
    }

    private p119ga.f c0() {
        List list = this.f47071m;
        return (p119ga.f) list.get(list.size() - 1);
    }

    private void e0(p119ga.f fVar) {
        if (this.f47072n != null) {
            if (!fVar.h() || h()) {
                ((i) c0()).k(this.f47072n, fVar);
            }
            this.f47072n = null;
            return;
        }
        if (this.f47071m.isEmpty()) {
            this.f47073o = fVar;
            return;
        }
        p119ga.f fVarC0 = c0();
        if (!(fVarC0 instanceof e)) {
            throw new IllegalStateException();
        }
        ((e) fVarC0).k(fVar);
    }

    @Override // p262oa.c
    public c L(double d10) {
        if (k() || !(Double.isNaN(d10) || Double.isInfinite(d10))) {
            e0(new k(Double.valueOf(d10)));
            return this;
        }
        throw new IllegalArgumentException("JSON forbids NaN and infinities: " + d10);
    }

    @Override // p262oa.c
    public c O(long j10) {
        e0(new k(Long.valueOf(j10)));
        return this;
    }

    @Override // p262oa.c
    public c P(Boolean bool) {
        if (bool == null) {
            return r();
        }
        e0(new k(bool));
        return this;
    }

    @Override // p262oa.c
    public c S(Number number) {
        if (number == null) {
            return r();
        }
        if (!k()) {
            double dDoubleValue = number.doubleValue();
            if (Double.isNaN(dDoubleValue) || Double.isInfinite(dDoubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        e0(new k(number));
        return this;
    }

    @Override // p262oa.c
    public c U(String str) {
        if (str == null) {
            return r();
        }
        e0(new k(str));
        return this;
    }

    @Override // p262oa.c
    public c V(boolean z10) {
        e0(new k(Boolean.valueOf(z10)));
        return this;
    }

    public p119ga.f b0() {
        if (this.f47071m.isEmpty()) {
            return this.f47073o;
        }
        throw new IllegalStateException("Expected one JSON element but was " + this.f47071m);
    }

    @Override // p262oa.c
    public c c() {
        e eVar = new e();
        e0(eVar);
        this.f47071m.add(eVar);
        return this;
    }

    @Override // p262oa.c, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (!this.f47071m.isEmpty()) {
            throw new IOException("Incomplete document");
        }
        this.f47071m.add(f47070q);
    }

    @Override // p262oa.c
    public c d() {
        i iVar = new i();
        e0(iVar);
        this.f47071m.add(iVar);
        return this;
    }

    @Override // p262oa.c
    public c f() {
        if (this.f47071m.isEmpty() || this.f47072n != null) {
            throw new IllegalStateException();
        }
        if (!(c0() instanceof e)) {
            throw new IllegalStateException();
        }
        List list = this.f47071m;
        list.remove(list.size() - 1);
        return this;
    }

    @Override // p262oa.c, java.io.Flushable
    public void flush() {
    }

    @Override // p262oa.c
    public c g() {
        if (this.f47071m.isEmpty() || this.f47072n != null) {
            throw new IllegalStateException();
        }
        if (!(c0() instanceof i)) {
            throw new IllegalStateException();
        }
        List list = this.f47071m;
        list.remove(list.size() - 1);
        return this;
    }

    @Override // p262oa.c
    public c o(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.f47071m.isEmpty() || this.f47072n != null) {
            throw new IllegalStateException();
        }
        if (!(c0() instanceof i)) {
            throw new IllegalStateException();
        }
        this.f47072n = str;
        return this;
    }

    @Override // p262oa.c
    public c r() {
        e0(h.f42281a);
        return this;
    }
}
