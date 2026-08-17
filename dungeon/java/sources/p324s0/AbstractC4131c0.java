package p324s0;

import K.c;
import V.f;
import V.k;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o;

/* JADX INFO: renamed from: s0.c0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4131c0 {

    /* JADX INFO: renamed from: s0.c0$a */
    static final class a extends o implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ c f53078a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(c cVar) {
            super(1);
            this.f53078a = cVar;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(k.b bVar) {
            this.f53078a.b(bVar);
            return Boolean.TRUE;
        }
    }

    public static final int c(k.b bVar, k.b bVar2) {
        if (Intrinsics.b(bVar, bVar2)) {
            return 2;
        }
        return V.c.a(bVar, bVar2) ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final c d(k kVar, c cVar, c cVar2) {
        cVar2.b(kVar);
        a aVar = null;
        while (cVar2.l() != 0) {
            k kVar2 = (k) cVar2.r(cVar2.l() - 1);
            if (kVar2 instanceof f) {
                f fVar = (f) kVar2;
                cVar2.b(fVar.c());
                cVar2.b(fVar.d());
            } else if (kVar2 instanceof k.b) {
                cVar.b(kVar2);
            } else {
                if (aVar == null) {
                    aVar = new a(cVar);
                }
                kVar2.all(aVar);
                aVar = aVar;
            }
        }
        return cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(X x10, k.c cVar) {
        Intrinsics.d(cVar, "null cannot be cast to non-null type T of androidx.compose.ui.node.NodeChainKt.updateUnsafe");
        x10.d(cVar);
    }
}
