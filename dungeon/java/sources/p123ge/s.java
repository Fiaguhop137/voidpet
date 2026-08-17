package p123ge;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p302qe.InterfaceC4072a;
import p302qe.i;
import p302qe.j;
import p464ze.c;

/* JADX INFO: loaded from: classes3.dex */
public final class s extends E implements j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Type f42399b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final i f42400c;

    public s(Type reflectType) {
        i qVar;
        Intrinsics.checkNotNullParameter(reflectType, "reflectType");
        this.f42399b = reflectType;
        Type typeQ = Q();
        if (typeQ instanceof Class) {
            qVar = new q((Class) typeQ);
        } else if (typeQ instanceof TypeVariable) {
            qVar = new F((TypeVariable) typeQ);
        } else {
            if (!(typeQ instanceof ParameterizedType)) {
                throw new IllegalStateException("Not a classifier type (" + typeQ.getClass() + "): " + typeQ);
            }
            Type rawType = ((ParameterizedType) typeQ).getRawType();
            Intrinsics.d(rawType, "null cannot be cast to non-null type java.lang.Class<*>");
            qVar = new q((Class) rawType);
        }
        this.f42400c = qVar;
    }

    @Override // p302qe.j
    public List A() {
        List listH = AbstractC3442f.h(Q());
        E.a aVar = E.f42351a;
        ArrayList arrayList = new ArrayList(CollectionsKt.w(listH, 10));
        Iterator it = listH.iterator();
        while (it.hasNext()) {
            arrayList.add(aVar.a((Type) it.next()));
        }
        return arrayList;
    }

    @Override // p302qe.InterfaceC4075d
    public boolean E() {
        return false;
    }

    @Override // p302qe.j
    public String F() {
        return Q().toString();
    }

    @Override // p302qe.j
    public String I() {
        throw new UnsupportedOperationException("Type not found: " + Q());
    }

    @Override // p123ge.E
    public Type Q() {
        return this.f42399b;
    }

    @Override // p302qe.j
    public i e() {
        return this.f42400c;
    }

    @Override // p302qe.InterfaceC4075d
    public Collection getAnnotations() {
        return CollectionsKt.l();
    }

    @Override // p302qe.j
    public boolean t() {
        Type typeQ = Q();
        if (typeQ instanceof Class) {
            TypeVariable[] typeParameters = ((Class) typeQ).getTypeParameters();
            Intrinsics.checkNotNullExpressionValue(typeParameters, "getTypeParameters(...)");
            if (!(typeParameters.length == 0)) {
                return true;
            }
        }
        return false;
    }

    @Override // p123ge.E, p302qe.InterfaceC4075d
    public InterfaceC4072a u(c fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        return null;
    }
}
