package O8;

import java.util.List;

/* JADX INFO: renamed from: O8.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C1262k extends AbstractC1263l {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final transient int f8497d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final transient int f8498e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ AbstractC1263l f8499f;

    C1262k(AbstractC1263l abstractC1263l, int i10, int i11) {
        this.f8499f = abstractC1263l;
        this.f8497d = i10;
        this.f8498e = i11;
    }

    @Override // O8.AbstractC1260i
    final int c() {
        return this.f8499f.e() + this.f8497d + this.f8498e;
    }

    @Override // O8.AbstractC1260i
    final int e() {
        return this.f8499f.e() + this.f8497d;
    }

    @Override // O8.AbstractC1260i
    final Object[] g() {
        return this.f8499f.g();
    }

    @Override // java.util.List
    public final Object get(int i10) {
        AbstractC1256e.a(i10, this.f8498e, "index");
        return this.f8499f.get(i10 + this.f8497d);
    }

    @Override // O8.AbstractC1263l
    /* JADX INFO: renamed from: h */
    public final AbstractC1263l subList(int i10, int i11) {
        AbstractC1256e.c(i10, i11, this.f8498e);
        int i12 = this.f8497d;
        return this.f8499f.subList(i10 + i12, i11 + i12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f8498e;
    }

    @Override // O8.AbstractC1263l, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i10, int i11) {
        return subList(i10, i11);
    }
}
