package Ag;

import Pf.C1328t;

/* JADX INFO: loaded from: classes3.dex */
final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w f432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f433b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f434c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f435d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f436e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f437f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final C1328t f438g;

    protected m(C1328t c1328t) {
        if (c1328t == null) {
            throw new NullPointerException("treeDigest == null");
        }
        this.f438g = c1328t;
        Vf.j jVarA = f.a(c1328t);
        int iH = A.h(jVarA);
        this.f433b = iH;
        this.f434c = 16;
        int iCeil = (int) Math.ceil(((double) (iH * 8)) / ((double) A.o(16)));
        this.f436e = iCeil;
        int iFloor = ((int) Math.floor(A.o((16 - 1) * iCeil) / A.o(16))) + 1;
        this.f437f = iFloor;
        int i10 = iCeil + iFloor;
        this.f435d = i10;
        l lVarC = l.c(jVarA.c(), iH, 16, i10);
        this.f432a = lVarC;
        if (lVarC != null) {
            return;
        }
        throw new IllegalArgumentException("cannot find OID for digest algorithm: " + jVarA.c());
    }

    protected int a() {
        return this.f435d;
    }

    public C1328t b() {
        return this.f438g;
    }

    protected int c() {
        return this.f433b;
    }

    protected int d() {
        return this.f434c;
    }
}
