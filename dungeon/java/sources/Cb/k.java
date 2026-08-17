package Cb;

import java.util.function.Function;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class k implements Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Function1 f1828a;

    public /* synthetic */ k(Function1 function1) {
        this.f1828a = function1;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        return l.e(this.f1828a, obj);
    }
}
