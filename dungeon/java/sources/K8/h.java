package K8;

import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class h extends i {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final transient int f6047d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final transient int f6048e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ i f6049f;

    h(i iVar, int i10, int i11) {
        Objects.requireNonNull(iVar);
        this.f6049f = iVar;
        this.f6047d = i10;
        this.f6048e = i11;
    }

    @Override // K8.d
    final Object[] a() {
        return this.f6049f.a();
    }

    @Override // K8.d
    final int c() {
        return this.f6049f.c() + this.f6047d;
    }

    @Override // K8.d
    final int e() {
        return this.f6049f.c() + this.f6047d + this.f6048e;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        t.b(i10, this.f6048e, "index");
        return this.f6049f.get(i10 + this.f6047d);
    }

    @Override // K8.i
    /* JADX INFO: renamed from: i */
    public final i subList(int i10, int i11) {
        t.d(i10, i11, this.f6048e);
        int i12 = this.f6047d;
        return this.f6049f.subList(i10 + i12, i11 + i12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f6048e;
    }

    @Override // K8.i, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i10, int i11) {
        return subList(i10, i11);
    }
}
