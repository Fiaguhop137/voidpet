package p123ge;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import kotlin.collections.AbstractC3952n;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p302qe.C;

/* JADX INFO: loaded from: classes3.dex */
public final class H extends E implements C {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final WildcardType f42357b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Collection f42358c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f42359d;

    public H(WildcardType reflectType) {
        Intrinsics.checkNotNullParameter(reflectType, "reflectType");
        this.f42357b = reflectType;
        this.f42358c = CollectionsKt.l();
    }

    @Override // p302qe.InterfaceC4075d
    public boolean E() {
        return this.f42359d;
    }

    @Override // p302qe.C
    public boolean M() {
        Type[] upperBounds = Q().getUpperBounds();
        Intrinsics.checkNotNullExpressionValue(upperBounds, "getUpperBounds(...)");
        return !Intrinsics.b(AbstractC3952n.S(upperBounds), Object.class);
    }

    @Override // p302qe.C
    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public E x() {
        Type[] upperBounds = Q().getUpperBounds();
        Type[] lowerBounds = Q().getLowerBounds();
        if (upperBounds.length > 1 || lowerBounds.length > 1) {
            throw new UnsupportedOperationException("Wildcard types with many bounds are not yet supported: " + Q());
        }
        if (lowerBounds.length == 1) {
            E.a aVar = E.f42351a;
            Intrinsics.c(lowerBounds);
            Object objV0 = AbstractC3952n.v0(lowerBounds);
            Intrinsics.checkNotNullExpressionValue(objV0, "single(...)");
            return aVar.a((Type) objV0);
        }
        if (upperBounds.length == 1) {
            Intrinsics.c(upperBounds);
            Type type = (Type) AbstractC3952n.v0(upperBounds);
            if (!Intrinsics.b(type, Object.class)) {
                E.a aVar2 = E.f42351a;
                Intrinsics.c(type);
                return aVar2.a(type);
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p123ge.E
    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
    public WildcardType Q() {
        return this.f42357b;
    }

    @Override // p302qe.InterfaceC4075d
    public Collection getAnnotations() {
        return this.f42358c;
    }
}
