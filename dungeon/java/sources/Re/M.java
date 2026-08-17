package Re;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p015ae.InterfaceC1794h;

/* JADX INFO: loaded from: classes3.dex */
public final class M extends E0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p015ae.m0[] f11063c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final B0[] f11064d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f11065e;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public M(List parameters, List argumentsList) {
        this((p015ae.m0[]) parameters.toArray(new p015ae.m0[0]), (B0[]) argumentsList.toArray(new B0[0]), false, 4, null);
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        Intrinsics.checkNotNullParameter(argumentsList, "argumentsList");
    }

    public M(p015ae.m0[] parameters, B0[] arguments, boolean z10) {
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        Intrinsics.checkNotNullParameter(arguments, "arguments");
        this.f11063c = parameters;
        this.f11064d = arguments;
        this.f11065e = z10;
        int length = parameters.length;
        int length2 = arguments.length;
    }

    public /* synthetic */ M(p015ae.m0[] m0VarArr, B0[] b0Arr, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(m0VarArr, b0Arr, (i10 & 4) != 0 ? false : z10);
    }

    @Override // Re.E0
    public boolean b() {
        return this.f11065e;
    }

    @Override // Re.E0
    public B0 e(S key) {
        Intrinsics.checkNotNullParameter(key, "key");
        InterfaceC1794h interfaceC1794hP = key.N0().p();
        p015ae.m0 m0Var = interfaceC1794hP instanceof p015ae.m0 ? (p015ae.m0) interfaceC1794hP : null;
        if (m0Var == null) {
            return null;
        }
        int index = m0Var.getIndex();
        p015ae.m0[] m0VarArr = this.f11063c;
        if (index >= m0VarArr.length || !Intrinsics.b(m0VarArr[index].l(), m0Var.l())) {
            return null;
        }
        return this.f11064d[index];
    }

    @Override // Re.E0
    public boolean f() {
        return this.f11064d.length == 0;
    }

    public final B0[] i() {
        return this.f11064d;
    }

    public final p015ae.m0[] j() {
        return this.f11063c;
    }
}
