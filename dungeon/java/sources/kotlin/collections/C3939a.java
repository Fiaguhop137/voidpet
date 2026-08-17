package kotlin.collections;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: kotlin.collections.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C3939a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC3940b f48246a;

    public /* synthetic */ C3939a(AbstractC3940b abstractC3940b) {
        this.f48246a = abstractC3940b;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return AbstractC3940b.e(this.f48246a, obj);
    }
}
