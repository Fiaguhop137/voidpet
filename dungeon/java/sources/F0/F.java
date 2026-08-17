package F0;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class F implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ G f2826a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ E f2827b;

    public /* synthetic */ F(G g10, E e10) {
        this.f2826a = g10;
        this.f2827b = e10;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return G.c(this.f2826a, this.f2827b, (H) obj);
    }
}
