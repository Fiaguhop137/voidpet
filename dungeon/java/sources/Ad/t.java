package Ad;

import java.io.Serializable;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
final class t implements Lazy, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Function0 f335a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile Object f336b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f337c;

    public t(Function0 initializer, Object obj) {
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        this.f335a = initializer;
        this.f336b = A.f303a;
        this.f337c = obj == null ? this : obj;
    }

    public /* synthetic */ t(Function0 function0, Object obj, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(function0, (i10 & 2) != 0 ? null : obj);
    }

    @Override // kotlin.Lazy
    public Object getValue() {
        Object objInvoke;
        Object obj = this.f336b;
        A a10 = A.f303a;
        if (obj != a10) {
            return obj;
        }
        synchronized (this.f337c) {
            objInvoke = this.f336b;
            if (objInvoke == a10) {
                Function0 function0 = this.f335a;
                Intrinsics.c(function0);
                objInvoke = function0.invoke();
                this.f336b = objInvoke;
                this.f335a = null;
            }
        }
        return objInvoke;
    }

    @Override // kotlin.Lazy
    public boolean isInitialized() {
        return this.f336b != A.f303a;
    }

    public String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
