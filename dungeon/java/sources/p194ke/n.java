package p194ke;

import Ad.v;
import Fe.g;
import Qe.i;
import Xd.o;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.N;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.w;
import kotlin.reflect.k;
import p302qe.InterfaceC4072a;
import p302qe.InterfaceC4073b;
import p302qe.e;
import p302qe.m;

/* JADX INFO: loaded from: classes3.dex */
public final class n extends c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final /* synthetic */ k[] f48111h = {F.j(new w(n.class, "allValueArguments", "getAllValueArguments()Ljava/util/Map;", 0))};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final i f48112g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(InterfaceC4072a annotation, p230me.k c10) {
        super(c10, annotation, o.a.f16362H);
        Intrinsics.checkNotNullParameter(annotation, "annotation");
        Intrinsics.checkNotNullParameter(c10, "c");
        this.f48112g = c10.e().c(new m(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map i(n nVar) {
        g gVarD;
        InterfaceC4073b interfaceC4073bC = nVar.c();
        if (interfaceC4073bC instanceof e) {
            gVarD = f.f48099a.d(((e) nVar.c()).c());
        } else {
            gVarD = interfaceC4073bC instanceof m ? f.f48099a.d(CollectionsKt.e(nVar.c())) : null;
        }
        Map mapF = gVarD != null ? N.f(v.a(d.f48093a.d(), gVarD)) : null;
        return mapF == null ? N.i() : mapF;
    }

    @Override // p194ke.c, p033be.c
    public Map a() {
        return (Map) Qe.m.a(this.f48112g, this, f48111h[0]);
    }
}
