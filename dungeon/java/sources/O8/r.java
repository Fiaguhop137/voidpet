package O8;

import java.util.AbstractMap;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class r extends AbstractC1263l {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ C1269s f8509d;

    r(C1269s c1269s) {
        this.f8509d = c1269s;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i10) {
        AbstractC1256e.a(i10, this.f8509d.f8512e, "index");
        int i11 = i10 + i10;
        Object obj = this.f8509d.f8511d[i11];
        Objects.requireNonNull(obj);
        Object obj2 = this.f8509d.f8511d[i11 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f8509d.f8512e;
    }
}
