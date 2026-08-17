package kotlin.collections;

import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: kotlin.collections.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C3943e implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC3944f f48256a;

    public /* synthetic */ C3943e(AbstractC3944f abstractC3944f) {
        this.f48256a = abstractC3944f;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return AbstractC3944f.m(this.f48256a, (Map.Entry) obj);
    }
}
