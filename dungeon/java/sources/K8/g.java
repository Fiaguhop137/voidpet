package K8;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class g extends i {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final transient i f6046d;

    g(i iVar) {
        this.f6046d = iVar;
    }

    private final int q(int i10) {
        return (this.f6046d.size() - 1) - i10;
    }

    @Override // K8.i, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f6046d.contains(obj);
    }

    @Override // java.util.List
    public final Object get(int i10) {
        i iVar = this.f6046d;
        t.b(i10, iVar.size(), "index");
        return iVar.get(q(i10));
    }

    @Override // K8.i
    public final i h() {
        return this.f6046d;
    }

    @Override // K8.i
    /* JADX INFO: renamed from: i */
    public final i subList(int i10, int i11) {
        i iVar = this.f6046d;
        t.d(i10, i11, iVar.size());
        return iVar.subList(iVar.size() - i11, iVar.size() - i10).h();
    }

    @Override // K8.i, java.util.List
    public final int indexOf(Object obj) {
        int iLastIndexOf = this.f6046d.lastIndexOf(obj);
        if (iLastIndexOf >= 0) {
            return q(iLastIndexOf);
        }
        return -1;
    }

    @Override // K8.i, java.util.List
    public final int lastIndexOf(Object obj) {
        int iIndexOf = this.f6046d.indexOf(obj);
        if (iIndexOf >= 0) {
            return q(iIndexOf);
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f6046d.size();
    }

    @Override // K8.i, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i10, int i11) {
        return subList(i10, i11);
    }
}
