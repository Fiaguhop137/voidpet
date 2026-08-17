package p194ke;

import Ad.v;
import Fe.x;
import Qe.i;
import Qe.m;
import Xd.o;
import java.util.Map;
import kotlin.collections.N;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.w;
import kotlin.reflect.k;
import p302qe.InterfaceC4072a;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final /* synthetic */ k[] f48103h = {F.j(new w(h.class, "allValueArguments", "getAllValueArguments()Ljava/util/Map;", 0))};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final i f48104g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(InterfaceC4072a interfaceC4072a, p230me.k c10) {
        super(c10, interfaceC4072a, o.a.f16444y);
        Intrinsics.checkNotNullParameter(c10, "c");
        this.f48104g = c10.e().c(g.f48102a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map i() {
        return N.f(v.a(d.f48093a.b(), new x("Deprecated in Java")));
    }

    @Override // p194ke.c, p033be.c
    public Map a() {
        return (Map) m.a(this.f48104g, this, f48103h[0]);
    }
}
