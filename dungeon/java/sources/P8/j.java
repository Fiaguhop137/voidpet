package P8;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class j extends k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final transient int f8859c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final transient int f8860d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ k f8861e;

    j(k kVar, int i10, int i11) {
        this.f8861e = kVar;
        this.f8859c = i10;
        this.f8860d = i11;
    }

    @Override // P8.h
    final int c() {
        return this.f8861e.e() + this.f8859c + this.f8860d;
    }

    @Override // P8.h
    final int e() {
        return this.f8861e.e() + this.f8859c;
    }

    @Override // P8.h
    final Object[] g() {
        return this.f8861e.g();
    }

    @Override // java.util.List
    public final Object get(int i10) {
        e.a(i10, this.f8860d, "index");
        return this.f8861e.get(i10 + this.f8859c);
    }

    @Override // P8.k
    /* JADX INFO: renamed from: h */
    public final k subList(int i10, int i11) {
        e.c(i10, i11, this.f8860d);
        k kVar = this.f8861e;
        int i12 = this.f8859c;
        return kVar.subList(i10 + i12, i11 + i12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f8860d;
    }

    @Override // P8.k, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i10, int i11) {
        return subList(i10, i11);
    }
}
