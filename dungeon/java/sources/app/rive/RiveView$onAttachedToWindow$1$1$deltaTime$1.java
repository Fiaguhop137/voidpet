package app.rive;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.o;
import p070df.b;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "frameTimeNs", "Lkotlin/time/a;", "invoke-5sfh64U", "(J)J", "<anonymous>"}, k = 3, mv = {1, 9, 0})
final class RiveView$onAttachedToWindow$1$1$deltaTime$1 extends o implements Function1<Long, kotlin.time.a> {
    final /* synthetic */ D $lastFrameTime;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RiveView$onAttachedToWindow$1$1$deltaTime$1(D d10) {
        super(1);
        this.$lastFrameTime = d10;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return kotlin.time.a.h(m64invoke5sfh64U(((Number) obj).longValue()));
    }

    /* JADX INFO: renamed from: invoke-5sfh64U, reason: not valid java name */
    public final long m64invoke5sfh64U(long j10) {
        kotlin.time.a.C0570a c0570a = kotlin.time.a.f48546b;
        b bVar = b.NANOSECONDS;
        long jQ = kotlin.time.b.q(j10, bVar);
        long jP = kotlin.time.a.s(this.$lastFrameTime.f48337a, kotlin.time.b.p(0, bVar)) ? kotlin.time.b.p(0, bVar) : kotlin.time.a.M(jQ, this.$lastFrameTime.f48337a);
        this.$lastFrameTime.f48337a = jQ;
        return jP;
    }
}
