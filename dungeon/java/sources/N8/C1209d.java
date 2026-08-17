package N8;

import java.util.List;

/* JADX INFO: renamed from: N8.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C1209d extends AbstractC1210e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final transient int f8009d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final transient int f8010e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ AbstractC1210e f8011f;

    C1209d(AbstractC1210e abstractC1210e, int i10, int i11) {
        this.f8011f = abstractC1210e;
        this.f8009d = i10;
        this.f8010e = i11;
    }

    @Override // N8.AbstractC1207b
    final int c() {
        return this.f8011f.e() + this.f8009d + this.f8010e;
    }

    @Override // N8.AbstractC1207b
    final int e() {
        return this.f8011f.e() + this.f8009d;
    }

    @Override // N8.AbstractC1207b
    final Object[] g() {
        return this.f8011f.g();
    }

    @Override // java.util.List
    public final Object get(int i10) {
        P.a(i10, this.f8010e, "index");
        return this.f8011f.get(i10 + this.f8009d);
    }

    @Override // N8.AbstractC1210e
    /* JADX INFO: renamed from: h */
    public final AbstractC1210e subList(int i10, int i11) {
        P.c(i10, i11, this.f8010e);
        int i12 = this.f8009d;
        return this.f8011f.subList(i10 + i12, i11 + i12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f8010e;
    }

    @Override // N8.AbstractC1210e, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i10, int i11) {
        return subList(i10, i11);
    }
}
