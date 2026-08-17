package p123ge;

import java.lang.reflect.Method;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
class p implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q f42391a;

    public p(q qVar) {
        this.f42391a = qVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public Object invoke(Object obj) {
        return Boolean.valueOf(q.S(this.f42391a, (Method) obj));
    }
}
