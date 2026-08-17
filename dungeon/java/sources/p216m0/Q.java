package p216m0;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class Q implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private J f48816a;

    public void a(boolean z10) {
        J j10 = this.f48816a;
        if (j10 != null) {
            j10.f(z10);
        }
    }

    public final void b(J j10) {
        this.f48816a = j10;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a(((Boolean) obj).booleanValue());
        return Unit.f48228a;
    }
}
