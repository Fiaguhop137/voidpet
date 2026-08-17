package p111g2;

import java.util.List;
import p182k2.b;
import p308r2.o;

/* JADX INFO: loaded from: classes.dex */
public final class e implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l f41971a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f41972b;

    public e(l lVar, List list) {
        this.f41971a = lVar;
        this.f41972b = list;
    }

    @Override // p111g2.l
    public o.a a(i iVar, f fVar) {
        return new b(this.f41971a.a(iVar, fVar), this.f41972b);
    }

    @Override // p111g2.l
    public o.a b() {
        return new b(this.f41971a.b(), this.f41972b);
    }
}
