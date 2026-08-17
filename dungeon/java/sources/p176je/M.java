package p176je;

import Qe.f;
import Qe.h;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import p464ze.c;
import p464ze.e;

/* JADX INFO: loaded from: classes3.dex */
public final class M implements K {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f47284b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f f47285c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final h f47286d;

    public M(Map states) {
        Intrinsics.checkNotNullParameter(states, "states");
        this.f47284b = states;
        f fVar = new f("Java nullability annotation states");
        this.f47285c = fVar;
        h hVarG = fVar.g(new L(this));
        Intrinsics.checkNotNullExpressionValue(hVarG, "createMemoizedFunctionWithNullableValues(...)");
        this.f47286d = hVarG;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object c(M m10, c cVar) {
        Intrinsics.c(cVar);
        return e.a(cVar, m10.f47284b);
    }

    @Override // p176je.K
    public Object a(c fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        return this.f47286d.invoke(fqName);
    }
}
