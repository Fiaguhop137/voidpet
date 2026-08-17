package p177jf;

import Ed.b;
import kotlin.Unit;
import p124gf.w;
import p142hf.InterfaceC3565d;

/* JADX INFO: loaded from: classes3.dex */
public final class v implements InterfaceC3565d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w f47435a;

    public v(w wVar) {
        this.f47435a = wVar;
    }

    @Override // p142hf.InterfaceC3565d
    public Object emit(Object obj, b bVar) {
        Object objL = this.f47435a.l(obj, bVar);
        return objL == Fd.b.e() ? objL : Unit.f48228a;
    }
}
