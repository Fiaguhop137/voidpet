package I7;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public class c extends e {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    static final int f5049m = e.a("ANMF");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f5050d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f5051e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f5052f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f5053g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    int f5054h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    byte f5055i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    a f5056j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    i f5057k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    j f5058l;

    @Override // I7.e
    void b(J7.a aVar) throws IOException {
        int iAvailable = aVar.available();
        this.f5050d = aVar.d();
        this.f5051e = aVar.d();
        this.f5052f = aVar.a();
        this.f5053g = aVar.a();
        this.f5054h = aVar.d();
        this.f5055i = aVar.peek();
        long j10 = iAvailable - this.f5067b;
        while (aVar.available() > j10) {
            e eVarC = m.c(aVar);
            if (eVarC instanceof a) {
                this.f5056j = (a) eVarC;
            } else if (eVarC instanceof i) {
                this.f5057k = (i) eVarC;
            } else if (eVarC instanceof j) {
                this.f5058l = (j) eVarC;
            }
        }
    }

    boolean d() {
        return (this.f5055i & 2) == 2;
    }

    boolean e() {
        return (this.f5055i & 1) == 1;
    }
}
