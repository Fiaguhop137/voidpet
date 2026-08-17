package Ad;

import java.io.Serializable;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class D implements Lazy, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Function0 f306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object f307b;

    public D(Function0 initializer) {
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        this.f306a = initializer;
        this.f307b = A.f303a;
    }

    @Override // kotlin.Lazy
    public Object getValue() {
        if (this.f307b == A.f303a) {
            Function0 function0 = this.f306a;
            Intrinsics.c(function0);
            this.f307b = function0.invoke();
            this.f306a = null;
        }
        return this.f307b;
    }

    @Override // kotlin.Lazy
    public boolean isInitialized() {
        return this.f307b != A.f303a;
    }

    public String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
