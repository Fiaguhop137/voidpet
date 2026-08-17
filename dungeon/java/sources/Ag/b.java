package Ag;

import Pf.C1328t;
import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes3.dex */
public class b implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f390a = new TreeMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private transient long f391b;

    b(long j10) {
        this.f391b = j10;
    }

    b(b bVar, long j10) {
        for (Integer num : bVar.f390a.keySet()) {
            this.f390a.put(num, new C0796a((C0796a) bVar.f390a.get(num)));
        }
        this.f391b = j10;
    }

    b(r rVar, long j10, byte[] bArr, byte[] bArr2) {
        this.f391b = (1 << rVar.a()) - 1;
        for (long j11 = 0; j11 < j10; j11++) {
            e(rVar, j11, bArr, bArr2);
        }
    }

    C0796a a(int i10) {
        return (C0796a) this.f390a.get(Ug.d.b(i10));
    }

    public long b() {
        return this.f391b;
    }

    void c(int i10, C0796a c0796a) {
        this.f390a.put(Ug.d.b(i10), c0796a);
    }

    C0796a d(int i10, byte[] bArr, byte[] bArr2, j jVar) {
        return (C0796a) this.f390a.put(Ug.d.b(i10), ((C0796a) this.f390a.get(Ug.d.b(i10))).d(bArr, bArr2, jVar));
    }

    void e(r rVar, long j10, byte[] bArr, byte[] bArr2) {
        x xVarH = rVar.h();
        int iB = xVarH.b();
        long j11 = A.j(j10, iB);
        int i10 = A.i(j10, iB);
        j jVar = (j) ((j.b) new j.b().h(j11)).p(i10).l();
        int i11 = (1 << iB) - 1;
        if (i10 < i11) {
            if (a(0) == null || i10 == 0) {
                c(0, new C0796a(xVarH, bArr, bArr2, jVar));
            }
            d(0, bArr, bArr2, jVar);
        }
        for (int i12 = 1; i12 < rVar.b(); i12++) {
            int i13 = A.i(j11, iB);
            j11 = A.j(j11, iB);
            j jVar2 = (j) ((j.b) ((j.b) new j.b().g(i12)).h(j11)).p(i13).l();
            if (this.f390a.get(Integer.valueOf(i12)) == null || A.n(j10, iB, i12)) {
                this.f390a.put(Integer.valueOf(i12), new C0796a(xVarH, bArr, bArr2, jVar2));
            }
            if (i13 < i11 && A.m(j10, iB, i12)) {
                d(i12, bArr, bArr2, jVar2);
            }
        }
    }

    public b f(C1328t c1328t) {
        b bVar = new b(this.f391b);
        for (Integer num : this.f390a.keySet()) {
            bVar.f390a.put(num, ((C0796a) this.f390a.get(num)).h(c1328t));
        }
        return bVar;
    }
}
