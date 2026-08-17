package p121gc;

import Ad.j;
import Rb.n;
import expo.modules.kotlin.jni.ExpectedType;
import expo.modules.kotlin.sharedobjects.SharedRef;
import expo.modules.kotlin.types.a;
import java.util.List;
import kotlin.Lazy;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KTypeProjection;
import kotlin.reflect.d;
import kotlin.reflect.e;
import kotlin.reflect.o;

/* JADX INFO: loaded from: classes2.dex */
public final class i extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o f42320a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final f f42321b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Lazy f42322c;

    public i(o type) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f42320a = type;
        this.f42321b = new f(type);
        this.f42322c = j.b(new h(this));
    }

    private final SharedRef f(SharedRef sharedRef) throws Zb.o {
        Object ref = sharedRef.getRef();
        if (ref != null) {
            o oVarH = h();
            e eVarE = oVarH != null ? oVarH.e() : null;
            d dVar = eVarE instanceof d ? (d) eVarE : null;
            if (dVar != null && !n.a(dVar, ref.getClass())) {
                throw new Zb.o(this.f42320a, sharedRef.getClass());
            }
        }
        return sharedRef;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final o i(i iVar) {
        List listK;
        e eVarE = iVar.f42320a.e();
        d dVar = eVarE instanceof d ? (d) eVarE : null;
        o oVar = iVar.f42320a;
        while (dVar != null) {
            if (Intrinsics.b(dVar, F.b(SharedRef.class))) {
                KTypeProjection kTypeProjection = (oVar == null || (listK = oVar.k()) == null) ? null : (KTypeProjection) CollectionsKt.j0(listK);
                if (Intrinsics.b(kTypeProjection, KTypeProjection.INSTANCE.c())) {
                    return null;
                }
                o oVarC = kTypeProjection != null ? kTypeProjection.c() : null;
                if (oVarC != null) {
                    return oVarC;
                }
                throw new IllegalArgumentException(("The " + iVar.h() + " type should contain the type of the inner ref").toString());
            }
            oVar = (o) CollectionsKt.firstOrNull(dVar.a());
            e eVarE2 = oVar != null ? oVar.e() : null;
            dVar = eVarE2 instanceof d ? (d) eVarE2 : null;
        }
        return null;
    }

    @Override // expo.modules.kotlin.types.a, expo.modules.kotlin.types.b
    public boolean b() {
        return this.f42321b.b();
    }

    @Override // expo.modules.kotlin.types.b
    public ExpectedType c() {
        return this.f42321b.c();
    }

    @Override // expo.modules.kotlin.types.a
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public SharedRef d(Object value, Rb.d dVar, boolean z10) throws Zb.o {
        Intrinsics.checkNotNullParameter(value, "value");
        SharedRef sharedRefF = f((SharedRef) this.f42321b.a(value, dVar, z10));
        Intrinsics.d(sharedRefF, "null cannot be cast to non-null type T of expo.modules.kotlin.sharedobjects.SharedRefTypeConverter");
        return sharedRefF;
    }

    public final o h() {
        return (o) this.f42322c.getValue();
    }
}
