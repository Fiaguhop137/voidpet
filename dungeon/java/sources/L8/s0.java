package L8;

import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class s0 extends t0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final transient int f6500d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final transient int f6501e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ t0 f6502f;

    s0(t0 t0Var, int i10, int i11) {
        Objects.requireNonNull(t0Var);
        this.f6502f = t0Var;
        this.f6500d = i10;
        this.f6501e = i11;
    }

    @Override // L8.AbstractC1167o0
    final Object[] a() {
        return this.f6502f.a();
    }

    @Override // L8.AbstractC1167o0
    final int c() {
        return this.f6502f.c() + this.f6500d;
    }

    @Override // L8.AbstractC1167o0
    final int e() {
        return this.f6502f.c() + this.f6500d + this.f6501e;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        AbstractC1149f0.a(i10, this.f6501e, "index");
        return this.f6502f.get(i10 + this.f6500d);
    }

    @Override // L8.t0
    /* JADX INFO: renamed from: h */
    public final t0 subList(int i10, int i11) {
        AbstractC1149f0.c(i10, i11, this.f6501e);
        int i12 = this.f6500d;
        return this.f6502f.subList(i10 + i12, i11 + i12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f6501e;
    }

    @Override // L8.t0, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i10, int i11) {
        return subList(i10, i11);
    }
}
