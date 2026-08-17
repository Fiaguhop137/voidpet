package p176je;

import kotlin.jvm.functions.Function1;
import p015ae.InterfaceC1788b;
import p015ae.g0;

/* JADX INFO: renamed from: je.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
class C3874e implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g0 f47344a;

    public C3874e(g0 g0Var) {
        this.f47344a = g0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return Boolean.valueOf(C3875f.l(this.f47344a, (InterfaceC1788b) obj));
    }
}
