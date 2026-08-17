package A;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class B implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ E f4a;

    public /* synthetic */ B(E e10) {
        this.f4a = e10;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        E e10 = this.f4a;
        android.support.v4.media.session.b.a(obj);
        return androidx.compose.foundation.layout.h.h(e10, null);
    }
}
