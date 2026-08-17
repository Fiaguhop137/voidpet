package S1;

import C9.AbstractC0876t;
import U1.AbstractC1459a;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AbstractC0876t f11442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f11443b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ByteBuffer[] f11444c = new ByteBuffer[0];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private o.a f11445d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private o.a f11446e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f11447f;

    public n(AbstractC0876t abstractC0876t) {
        this.f11442a = abstractC0876t;
        o.a aVar = o.a.f11449e;
        this.f11445d = aVar;
        this.f11446e = aVar;
        this.f11447f = false;
    }

    private int c() {
        return this.f11444c.length - 1;
    }

    private void g(ByteBuffer byteBuffer) {
        boolean z10;
        for (boolean z11 = true; z11; z11 = z10) {
            z10 = false;
            for (int i10 = 0; i10 <= c(); i10++) {
                if (!this.f11444c[i10].hasRemaining()) {
                    o oVar = (o) this.f11443b.get(i10);
                    if (!oVar.b()) {
                        ByteBuffer byteBuffer2 = i10 > 0 ? this.f11444c[i10 - 1] : byteBuffer.hasRemaining() ? byteBuffer : o.f11448a;
                        long jRemaining = byteBuffer2.remaining();
                        oVar.d(byteBuffer2);
                        this.f11444c[i10] = oVar.c();
                        z10 |= jRemaining - ((long) byteBuffer2.remaining()) > 0 || this.f11444c[i10].hasRemaining();
                    } else if (!this.f11444c[i10].hasRemaining() && i10 < c()) {
                        ((o) this.f11443b.get(i10 + 1)).f();
                    }
                }
            }
        }
    }

    public o.a a(o.a aVar) throws o.b {
        if (aVar.equals(o.a.f11449e)) {
            throw new o.b(aVar);
        }
        for (int i10 = 0; i10 < this.f11442a.size(); i10++) {
            o oVar = (o) this.f11442a.get(i10);
            o.a aVarE = oVar.e(aVar);
            if (oVar.a()) {
                AbstractC1459a.g(!aVarE.equals(o.a.f11449e));
                aVar = aVarE;
            }
        }
        this.f11446e = aVar;
        return aVar;
    }

    public void b() {
        this.f11443b.clear();
        this.f11445d = this.f11446e;
        this.f11447f = false;
        for (int i10 = 0; i10 < this.f11442a.size(); i10++) {
            o oVar = (o) this.f11442a.get(i10);
            oVar.flush();
            if (oVar.a()) {
                this.f11443b.add(oVar);
            }
        }
        this.f11444c = new ByteBuffer[this.f11443b.size()];
        for (int i11 = 0; i11 <= c(); i11++) {
            this.f11444c[i11] = ((o) this.f11443b.get(i11)).c();
        }
    }

    public ByteBuffer d() {
        if (!f()) {
            return o.f11448a;
        }
        ByteBuffer byteBuffer = this.f11444c[c()];
        if (byteBuffer.hasRemaining()) {
            return byteBuffer;
        }
        g(o.f11448a);
        return this.f11444c[c()];
    }

    public boolean e() {
        return this.f11447f && ((o) this.f11443b.get(c())).b() && !this.f11444c[c()].hasRemaining();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        if (this.f11442a.size() != nVar.f11442a.size()) {
            return false;
        }
        for (int i10 = 0; i10 < this.f11442a.size(); i10++) {
            if (this.f11442a.get(i10) != nVar.f11442a.get(i10)) {
                return false;
            }
        }
        return true;
    }

    public boolean f() {
        return !this.f11443b.isEmpty();
    }

    public void h() {
        if (!f() || this.f11447f) {
            return;
        }
        this.f11447f = true;
        ((o) this.f11443b.get(0)).f();
    }

    public int hashCode() {
        return this.f11442a.hashCode();
    }

    public void i(ByteBuffer byteBuffer) {
        if (!f() || this.f11447f) {
            return;
        }
        g(byteBuffer);
    }

    public void j() {
        for (int i10 = 0; i10 < this.f11442a.size(); i10++) {
            o oVar = (o) this.f11442a.get(i10);
            oVar.flush();
            oVar.reset();
        }
        this.f11444c = new ByteBuffer[0];
        o.a aVar = o.a.f11449e;
        this.f11445d = aVar;
        this.f11446e = aVar;
        this.f11447f = false;
    }
}
