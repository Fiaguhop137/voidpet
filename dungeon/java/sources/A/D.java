package A;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class D implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f7a;

    public /* synthetic */ D(float f10) {
        this.f7a = f10;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        float f10 = this.f7a;
        android.support.v4.media.session.b.a(obj);
        return androidx.compose.foundation.layout.h.n(f10, null);
    }
}
