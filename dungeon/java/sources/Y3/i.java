package Y3;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class i implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f16909a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f16910b;

    public i(b bVar, b bVar2) {
        this.f16909a = bVar;
        this.f16910b = bVar2;
    }

    @Override // Y3.o
    public boolean j() {
        return this.f16909a.j() && this.f16910b.j();
    }

    @Override // Y3.o
    public U3.a k() {
        return new U3.n(this.f16909a.k(), this.f16910b.k());
    }

    @Override // Y3.o
    public List l() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }
}
