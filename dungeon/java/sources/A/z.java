package A;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Function1 f106a;

    public /* synthetic */ z(Function1 function1) {
        this.f106a = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Function1 function1 = this.f106a;
        android.support.v4.media.session.b.a(obj);
        return androidx.compose.foundation.layout.e.c(function1, null);
    }
}
