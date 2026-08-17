package p194ke;

import Ad.v;
import Fe.g;
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
public final class l extends c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final /* synthetic */ k[] f48108h = {F.j(new w(l.class, "allValueArguments", "getAllValueArguments()Ljava/util/Map;", 0))};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final i f48109g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(InterfaceC4072a annotation, p230me.k c10) {
        super(c10, annotation, o.a.f16370L);
        Intrinsics.checkNotNullParameter(annotation, "annotation");
        Intrinsics.checkNotNullParameter(c10, "c");
        this.f48109g = c10.e().c(new k(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map i(l lVar) {
        g gVarB = f.f48099a.b(lVar.c());
        Map mapF = gVarB != null ? N.f(v.a(d.f48093a.c(), gVarB)) : null;
        return mapF == null ? N.i() : mapF;
    }

    @Override // p194ke.c, p033be.c
    public Map a() {
        return (Map) m.a(this.f48109g, this, f48108h[0]);
    }
}
