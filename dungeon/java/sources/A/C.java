package A;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f5a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f6b;

    public /* synthetic */ C(float f10, float f11) {
        this.f5a = f10;
        this.f6b = f11;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        float f10 = this.f5a;
        float f11 = this.f6b;
        android.support.v4.media.session.b.a(obj);
        return androidx.compose.foundation.layout.h.o(f10, f11, null);
    }
}
