package A;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class A implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f0a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f1b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f2c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f3d;

    public /* synthetic */ A(float f10, float f11, float f12, float f13) {
        this.f0a = f10;
        this.f1b = f11;
        this.f2c = f12;
        this.f3d = f13;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        float f10 = this.f0a;
        float f11 = this.f1b;
        float f12 = this.f2c;
        float f13 = this.f3d;
        android.support.v4.media.session.b.a(obj);
        return androidx.compose.foundation.layout.h.p(f10, f11, f12, f13, null);
    }
}
