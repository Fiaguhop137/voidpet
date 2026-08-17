package kotlin.jvm.internal;

import java.io.Serializable;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public abstract class o implements InterfaceC3973j, Serializable {
    private final int arity;

    public o(int i10) {
        this.arity = i10;
    }

    @Override // kotlin.jvm.internal.InterfaceC3973j
    public int getArity() {
        return this.arity;
    }

    @NotNull
    public String toString() {
        String strM = F.m(this);
        Intrinsics.checkNotNullExpressionValue(strM, "renderLambdaToString(...)");
        return strM;
    }
}
