package p123ge;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.Collection;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p302qe.f;

/* JADX INFO: loaded from: classes3.dex */
public final class m extends E implements f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Type f42385b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final E f42386c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Collection f42387d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f42388e;

    public m(Type reflectType) {
        E eA;
        Intrinsics.checkNotNullParameter(reflectType, "reflectType");
        this.f42385b = reflectType;
        Type typeQ = Q();
        if (!(typeQ instanceof GenericArrayType)) {
            if (typeQ instanceof Class) {
                Class cls = (Class) typeQ;
                if (cls.isArray()) {
                    E.a aVar = E.f42351a;
                    Class<?> componentType = cls.getComponentType();
                    Intrinsics.checkNotNullExpressionValue(componentType, "getComponentType(...)");
                    eA = aVar.a(componentType);
                }
            }
            throw new IllegalArgumentException("Not an array type (" + Q().getClass() + "): " + Q());
        }
        E.a aVar2 = E.f42351a;
        Type genericComponentType = ((GenericArrayType) typeQ).getGenericComponentType();
        Intrinsics.checkNotNullExpressionValue(genericComponentType, "getGenericComponentType(...)");
        eA = aVar2.a(genericComponentType);
        this.f42386c = eA;
        this.f42387d = CollectionsKt.l();
    }

    @Override // p302qe.InterfaceC4075d
    public boolean E() {
        return this.f42388e;
    }

    @Override // p123ge.E
    protected Type Q() {
        return this.f42385b;
    }

    @Override // p302qe.f
    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public E n() {
        return this.f42386c;
    }

    @Override // p302qe.InterfaceC4075d
    public Collection getAnnotations() {
        return this.f42387d;
    }
}
