package androidx.compose.foundation;

import I.AbstractC1083w;
import I.H;
import I.InterfaceC1054m;
import I.Z0;
import Md.n;
import V.k;
import androidx.compose.ui.platform.I0;
import androidx.compose.ui.platform.J0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.o;
import p395w.p;
import p395w.q;
import p395w.r;
import p395w.s;
import p431y.i;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Z0 f21174a = H.h(null, new r(), 1, null);

    public static final class a extends o implements Function1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ i f21175a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ p f21176b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(i iVar, p pVar) {
            super(1);
            this.f21175a = iVar;
            this.f21176b = pVar;
        }

        public final void a(J0 j10) {
            throw null;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            android.support.v4.media.session.b.a(obj);
            a(null);
            return Unit.f48228a;
        }
    }

    static final class b implements n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ p f21177a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ i f21178b;

        b(p pVar, i iVar) {
            this.f21177a = pVar;
            this.f21178b = iVar;
        }

        public final k a(k kVar, InterfaceC1054m interfaceC1054m, int i10) {
            interfaceC1054m.V(-353972293);
            if (AbstractC1083w.L()) {
                AbstractC1083w.U(-353972293, i10, -1, "androidx.compose.foundation.indication.<anonymous> (Indication.kt:176)");
            }
            q qVarB = this.f21177a.b(this.f21178b, interfaceC1054m, 0);
            boolean zU = interfaceC1054m.U(qVarB);
            Object objD = interfaceC1054m.D();
            if (zU || objD == InterfaceC1054m.f4688a.a()) {
                objD = new g(qVarB);
                interfaceC1054m.t(objD);
            }
            g gVar = (g) objD;
            if (AbstractC1083w.L()) {
                AbstractC1083w.T();
            }
            interfaceC1054m.O();
            return gVar;
        }

        @Override // Md.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return a((k) obj, (InterfaceC1054m) obj2, ((Number) obj3).intValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p b() {
        return e.f21163a;
    }

    public static final Z0 c() {
        return f21174a;
    }

    public static final k d(k kVar, i iVar, p pVar) {
        if (pVar == null) {
            return kVar;
        }
        if (pVar instanceof s) {
            return kVar.then(new IndicationModifierElement(iVar, (s) pVar));
        }
        return V.i.b(kVar, I0.b() ? new a(iVar, pVar) : I0.a(), new b(pVar, iVar));
    }
}
