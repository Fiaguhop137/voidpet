package Ne;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class r extends p069de.H {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Qe.n f8210g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(p464ze.c fqName, Qe.n storageManager, p015ae.H module) {
        super(module, fqName);
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        Intrinsics.checkNotNullParameter(module, "module");
        this.f8210g = storageManager;
    }

    public abstract InterfaceC1236j G0();

    public boolean K0(p464ze.f name) {
        Intrinsics.checkNotNullParameter(name, "name");
        Ke.k kVarO = o();
        return (kVarO instanceof Pe.w) && ((Pe.w) kVarO).t().contains(name);
    }

    public abstract void L0(C1240n c1240n);
}
