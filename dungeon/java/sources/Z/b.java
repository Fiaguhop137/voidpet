package Z;

import V.k;
import kotlin.jvm.functions.Function1;
import p324s0.InterfaceC4153s;

/* JADX INFO: loaded from: classes.dex */
public final class b extends k.c implements InterfaceC4153s {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Function1 f17941o;

    public b(Function1 function1) {
        this.f17941o = function1;
    }

    public final void W1(Function1 function1) {
        this.f17941o = function1;
    }

    @Override // p324s0.InterfaceC4153s
    public void z(p073e0.c cVar) {
        this.f17941o.invoke(cVar);
        cVar.r1();
    }
}
