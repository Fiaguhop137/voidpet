package H3;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Function1 f4151a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object f4152b = d.f4153a;

    public b(Function1 function1) {
        this.f4151a = function1;
    }

    public final Object a(Object obj) {
        Object objInvoke;
        Object obj2 = this.f4152b;
        d dVar = d.f4153a;
        if (obj2 != dVar) {
            return obj2;
        }
        synchronized (this) {
            objInvoke = this.f4152b;
            if (objInvoke == dVar) {
                Function1 function1 = this.f4151a;
                Intrinsics.c(function1);
                objInvoke = function1.invoke(obj);
                this.f4152b = objInvoke;
                this.f4151a = null;
            }
        }
        return objInvoke;
    }
}
