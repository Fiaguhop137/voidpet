package O8;

import java.util.Objects;

/* JADX INFO: renamed from: O8.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C1271u extends AbstractC1263l {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final transient Object[] f8515d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final transient int f8516e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final transient int f8517f = 1;

    C1271u(Object[] objArr, int i10, int i11) {
        this.f8515d = objArr;
        this.f8516e = i10;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        AbstractC1256e.a(i10, this.f8517f, "index");
        Object obj = this.f8515d[i10 + i10 + this.f8516e];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f8517f;
    }
}
