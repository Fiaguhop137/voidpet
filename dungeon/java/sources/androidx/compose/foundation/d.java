package androidx.compose.foundation;

import I.AbstractC1083w;
import I.InterfaceC1054m;
import Md.n;
import V.i;
import V.k;
import android.view.KeyEvent;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.A;
import kotlin.jvm.internal.Intrinsics;
import p324s0.G0;
import p324s0.H0;
import p395w.p;
import p395w.s;
import p413x.u;
import p431y.j;
import p450z0.C4368g;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    public static final class a implements n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ p f21158a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f21159b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f21160c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ C4368g f21161d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function0 f21162e;

        public a(p pVar, boolean z10, String str, C4368g c4368g, Function0 function0) {
            this.f21158a = pVar;
            this.f21159b = z10;
            this.f21160c = str;
            this.f21161d = c4368g;
            this.f21162e = function0;
        }

        public final k a(k kVar, InterfaceC1054m interfaceC1054m, int i10) {
            interfaceC1054m.V(-1525724089);
            if (AbstractC1083w.L()) {
                AbstractC1083w.U(-1525724089, i10, -1, "androidx.compose.foundation.clickableWithIndicationIfNeeded.<anonymous> (Clickable.kt:708)");
            }
            Object objD = interfaceC1054m.D();
            if (objD == InterfaceC1054m.f4688a.a()) {
                objD = j.a();
                interfaceC1054m.t(objD);
            }
            p431y.k kVar2 = (p431y.k) objD;
            k kVarThen = f.d(k.f13755a, kVar2, this.f21158a).then(new ClickableElement(kVar2, null, false, this.f21159b, this.f21160c, this.f21161d, this.f21162e, null));
            if (AbstractC1083w.L()) {
                AbstractC1083w.T();
            }
            interfaceC1054m.O();
            return kVarThen;
        }

        @Override // Md.n
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return a((k) obj, (InterfaceC1054m) obj2, ((Number) obj3).intValue());
        }
    }

    public static final k e(k kVar, p431y.k kVar2, p pVar, boolean z10, String str, C4368g c4368g, Function0 function0) {
        k kVarThen;
        if (pVar instanceof s) {
            kVarThen = new ClickableElement(kVar2, (s) pVar, false, z10, str, c4368g, function0, null);
        } else if (pVar == null) {
            kVarThen = new ClickableElement(kVar2, null, false, z10, str, c4368g, function0, null);
        } else {
            kVarThen = kVar2 != null ? f.d(k.f13755a, kVar2, pVar).then(new ClickableElement(kVar2, null, false, z10, str, c4368g, function0, null)) : i.c(k.f13755a, null, new a(pVar, z10, str, c4368g, function0), 1, null);
        }
        return kVar.then(kVarThen);
    }

    public static /* synthetic */ k f(k kVar, p431y.k kVar2, p pVar, boolean z10, String str, C4368g c4368g, Function0 function0, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        return e(kVar, kVar2, pVar, z10, (i10 & 8) != 0 ? null : str, (i10 & 16) != 0 ? null : c4368g, function0);
    }

    public static final boolean g(G0 g10) {
        A a10 = new A();
        H0.c(g10, u.f57189o, new p395w.g(a10));
        return a10.f48334a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean h(A a10, G0 g10) {
        if (a10.f48334a) {
            a10.f48334a = true;
            return !true;
        }
        Intrinsics.d(g10, "null cannot be cast to non-null type androidx.compose.foundation.gestures.ScrollableContainerNode");
        android.support.v4.media.session.b.a(g10);
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean i(KeyEvent keyEvent) {
        return p180k0.c.e(p180k0.d.b(keyEvent), p180k0.c.f47765a.b()) && j(keyEvent);
    }

    private static final boolean j(KeyEvent keyEvent) {
        long jA = p180k0.d.a(keyEvent);
        p180k0.a.C0557a c0557a = p180k0.a.f47608a;
        return p180k0.a.q(jA, c0557a.b()) || p180k0.a.q(jA, c0557a.g()) || p180k0.a.q(jA, c0557a.k()) || p180k0.a.q(jA, c0557a.n());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean k(KeyEvent keyEvent) {
        return p180k0.c.e(p180k0.d.b(keyEvent), p180k0.c.f47765a.a()) && j(keyEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String l(p pVar) {
        return "clickable only supports IndicationNodeFactory instances provided to LocalIndication, but Indication was provided instead. Either migrate the Indication implementation to implement IndicationNodeFactory, or use the other clickable overload that takes an Indication parameter, and explicitly pass LocalIndication.current there. You can also use ComposeFoundationFlags.isNonComposedClickableEnabled to temporarily opt-out; note that this flag will be removed in a future release and is only intended to be a temporary migration aid. The Indication instance provided here was: " + pVar;
    }
}
