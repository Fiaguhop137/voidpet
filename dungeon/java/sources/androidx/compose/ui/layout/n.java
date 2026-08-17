package androidx.compose.ui.layout;

import kotlin.jvm.functions.Function1;
import p324s0.InterfaceC4155u;

/* JADX INFO: loaded from: classes.dex */
final class n extends V.k.c implements InterfaceC4155u {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Function1 f21662o;

    public n(Function1 function1) {
        this.f21662o = function1;
    }

    public final void W1(Function1 function1) {
        this.f21662o = function1;
    }

    @Override // p324s0.InterfaceC4155u
    public void z0(p288q0.m mVar) {
        this.f21662o.invoke(mVar);
    }
}
