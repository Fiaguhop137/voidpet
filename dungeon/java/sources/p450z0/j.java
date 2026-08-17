package p450z0;

import O0.p;
import android.graphics.Region;
import kotlin.jvm.internal.Intrinsics;
import p037c0.s0;

/* JADX INFO: loaded from: classes.dex */
final class j implements C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Region f58263a = new Region();

    @Override // p450z0.C
    public boolean a(C c10) {
        Region region = this.f58263a;
        Intrinsics.d(c10, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticRegionImpl");
        return region.op(((j) c10).f58263a, Region.Op.INTERSECT);
    }

    @Override // p450z0.C
    public void b(p pVar) {
        this.f58263a.set(pVar.f(), pVar.h(), pVar.g(), pVar.d());
    }

    @Override // p450z0.C
    public boolean c(p pVar) {
        return this.f58263a.op(pVar.f(), pVar.h(), pVar.g(), pVar.d(), Region.Op.DIFFERENCE);
    }

    @Override // p450z0.C
    public p getBounds() {
        return s0.d(this.f58263a.getBounds());
    }

    @Override // p450z0.C
    public boolean isEmpty() {
        return this.f58263a.isEmpty();
    }
}
