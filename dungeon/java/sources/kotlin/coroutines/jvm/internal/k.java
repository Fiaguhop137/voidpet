package kotlin.coroutines.jvm.internal;

import kotlin.jvm.internal.F;
import kotlin.jvm.internal.InterfaceC3973j;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class k extends j implements InterfaceC3973j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f48291a;

    public k(int i10, Ed.b bVar) {
        super(bVar);
        this.f48291a = i10;
    }

    @Override // kotlin.jvm.internal.InterfaceC3973j
    public int getArity() {
        return this.f48291a;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        String strL = F.l(this);
        Intrinsics.checkNotNullExpressionValue(strL, "renderLambdaToString(...)");
        return strL;
    }
}
