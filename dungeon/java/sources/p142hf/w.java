package p142hf;

import Ed.b;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
final class w extends AbstractC3562a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Function2 f43038a;

    public w(Function2 function2) {
        this.f43038a = function2;
    }

    @Override // p142hf.AbstractC3562a
    public Object c(InterfaceC3565d interfaceC3565d, b bVar) {
        Object objInvoke = this.f43038a.invoke(interfaceC3565d, bVar);
        return objInvoke == Fd.b.e() ? objInvoke : Unit.f48228a;
    }
}
