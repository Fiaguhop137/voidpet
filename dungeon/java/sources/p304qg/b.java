package p304qg;

import Pf.C1328t;
import Vf.j;
import Xf.d;
import Xf.h;

/* JADX INFO: loaded from: classes3.dex */
abstract class b {

    static class a implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final j f51923a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f51924b;

        a(j jVar, int i10) {
            this.f51923a = jVar;
            this.f51924b = i10;
        }

        @Override // Vf.j
        public int a(byte[] bArr, int i10) {
            byte[] bArr2 = new byte[this.f51923a.d()];
            this.f51923a.a(bArr2, 0);
            System.arraycopy(bArr2, 0, bArr, i10, this.f51924b);
            return this.f51924b;
        }

        @Override // Vf.j
        public void b(byte b10) {
            this.f51923a.b(b10);
        }

        @Override // Vf.j
        public String c() {
            return this.f51923a.c() + "/" + (this.f51924b * 8);
        }

        @Override // Vf.j
        public int d() {
            return this.f51924b;
        }

        @Override // Vf.j
        public void update(byte[] bArr, int i10, int i11) {
            this.f51923a.update(bArr, i10, i11);
        }
    }

    private static j a(C1328t c1328t) {
        if (c1328t.q(Rf.a.f11228c)) {
            return new d();
        }
        if (c1328t.q(Rf.a.f11259t)) {
            return new h(256);
        }
        throw new IllegalArgumentException("unrecognized digest OID: " + c1328t);
    }

    private static j b(C1328t c1328t, int i10) {
        j jVarA = a(c1328t);
        return (Rf.a.f11259t.q(c1328t) || jVarA.d() != i10) ? new a(jVarA, i10) : jVarA;
    }

    static j c(e eVar) {
        return b(eVar.b(), eVar.c());
    }

    static j d(k kVar) {
        return b(kVar.b(), kVar.d());
    }
}
