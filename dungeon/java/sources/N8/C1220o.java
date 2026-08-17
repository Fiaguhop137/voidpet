package N8;

import java.util.Objects;

/* JADX INFO: renamed from: N8.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C1220o extends AbstractC1210e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final transient Object[] f8030d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final transient int f8031e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final transient int f8032f;

    C1220o(Object[] objArr, int i10, int i11) {
        this.f8030d = objArr;
        this.f8031e = i10;
        this.f8032f = i11;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        P.a(i10, this.f8032f, "index");
        Object obj = this.f8030d[i10 + i10 + this.f8031e];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f8032f;
    }
}
