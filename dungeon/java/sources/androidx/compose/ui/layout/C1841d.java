package androidx.compose.ui.layout;

import kotlin.collections.AbstractC3952n;

/* JADX INFO: renamed from: androidx.compose.ui.layout.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1841d implements r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final r[] f21584b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final B f21585c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C1840c f21586d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final B f21587e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final C1840c f21588f;

    public C1841d(r[] rVarArr) {
        this.f21584b = rVarArr;
        B.a aVar = B.f21547b;
        int length = rVarArr.length;
        B[] bArr = new B[length];
        for (int i10 = 0; i10 < length; i10++) {
            bArr[i10] = this.f21584b[i10].a();
        }
        this.f21585c = aVar.b(bArr);
        C1840c.a aVar2 = C1840c.f21581b;
        int length2 = this.f21584b.length;
        C1840c[] c1840cArr = new C1840c[length2];
        for (int i11 = 0; i11 < length2; i11++) {
            c1840cArr[i11] = this.f21584b[i11].c();
        }
        this.f21586d = aVar2.a(c1840cArr);
        B.a aVar3 = B.f21547b;
        int length3 = this.f21584b.length;
        B[] bArr2 = new B[length3];
        for (int i12 = 0; i12 < length3; i12++) {
            bArr2[i12] = this.f21584b[i12].b();
        }
        this.f21587e = aVar3.c(bArr2);
        C1840c.a aVar4 = C1840c.f21581b;
        int length4 = this.f21584b.length;
        C1840c[] c1840cArr2 = new C1840c[length4];
        for (int i13 = 0; i13 < length4; i13++) {
            c1840cArr2[i13] = this.f21584b[i13].d();
        }
        this.f21588f = aVar4.b(c1840cArr2);
    }

    @Override // androidx.compose.ui.layout.r
    public B a() {
        return this.f21585c;
    }

    @Override // androidx.compose.ui.layout.r
    public B b() {
        return this.f21587e;
    }

    @Override // androidx.compose.ui.layout.r
    public C1840c c() {
        return this.f21586d;
    }

    @Override // androidx.compose.ui.layout.r
    public C1840c d() {
        return this.f21588f;
    }

    public String toString() {
        return AbstractC3952n.n0(this.f21584b, null, "innermostOf(", ")", 0, null, null, 57, null);
    }
}
