package androidx.compose.ui.platform;

import android.view.ViewGroup;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: androidx.compose.ui.platform.h0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
final class C1858h0 extends V.k.c implements p396w0.a {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private ViewGroup f22036o;

    public C1858h0(ViewGroup viewGroup) {
        this.f22036o = viewGroup;
    }

    @Override // p396w0.a
    public Object H0(p288q0.m mVar, Function0 function0, Ed.b bVar) {
        long jE = p288q0.n.e(mVar);
        p019b0.g gVar = (p019b0.g) function0.invoke();
        p019b0.g gVarN = gVar != null ? gVar.n(jE) : null;
        if (gVarN != null) {
            this.f22036o.requestRectangleOnScreen(p037c0.s0.b(gVarN), false);
        }
        return Unit.f48228a;
    }

    public final void W1(ViewGroup viewGroup) {
        this.f22036o = viewGroup;
    }
}
