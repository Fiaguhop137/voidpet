package kotlin.coroutines.jvm.internal;

import kotlin.jvm.internal.F;
import kotlin.jvm.internal.InterfaceC3973j;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public abstract class m extends d implements InterfaceC3973j {
    private final int arity;

    public m(int i10, Ed.b bVar) {
        super(bVar);
        this.arity = i10;
    }

    @Override // kotlin.jvm.internal.InterfaceC3973j
    public int getArity() {
        return this.arity;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        String strL = F.l(this);
        Intrinsics.checkNotNullExpressionValue(strL, "renderLambdaToString(...)");
        return strL;
    }
}
