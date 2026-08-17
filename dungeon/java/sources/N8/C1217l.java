package N8;

import java.util.AbstractMap;
import java.util.Objects;

/* JADX INFO: renamed from: N8.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C1217l extends AbstractC1210e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ C1218m f8024d;

    C1217l(C1218m c1218m) {
        this.f8024d = c1218m;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i10) {
        P.a(i10, this.f8024d.f8027e, "index");
        int i11 = i10 + i10;
        Object obj = this.f8024d.f8026d[i11];
        Objects.requireNonNull(obj);
        Object obj2 = this.f8024d.f8026d[i11 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f8024d.f8027e;
    }
}
