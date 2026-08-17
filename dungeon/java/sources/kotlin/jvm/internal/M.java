package kotlin.jvm.internal;

import kotlin.jvm.functions.Function1;
import kotlin.reflect.KTypeProjection;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class M implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ N f48345a;

    public /* synthetic */ M(N n10) {
        this.f48345a = n10;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return N.q(this.f48345a, (KTypeProjection) obj);
    }
}
