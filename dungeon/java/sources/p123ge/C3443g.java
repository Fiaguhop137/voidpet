package p123ge;

import Ld.a;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;
import p302qe.InterfaceC4072a;
import p464ze.b;
import p464ze.f;

/* JADX INFO: renamed from: ge.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3443g extends u implements InterfaceC4072a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Annotation f42380a;

    public C3443g(Annotation annotation) {
        Intrinsics.checkNotNullParameter(annotation, "annotation");
        this.f42380a = annotation;
    }

    @Override // p302qe.InterfaceC4072a
    public boolean H() {
        return false;
    }

    public final Annotation Q() {
        return this.f42380a;
    }

    @Override // p302qe.InterfaceC4072a
    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public q c() {
        return new q(a.b(a.a(this.f42380a)));
    }

    @Override // p302qe.InterfaceC4072a
    public b d() {
        return AbstractC3442f.e(a.b(a.a(this.f42380a)));
    }

    public boolean equals(Object obj) {
        return (obj instanceof C3443g) && this.f42380a == ((C3443g) obj).f42380a;
    }

    @Override // p302qe.InterfaceC4072a
    public boolean h() {
        return false;
    }

    public int hashCode() {
        return System.identityHashCode(this.f42380a);
    }

    @Override // p302qe.InterfaceC4072a
    public Collection k() throws IllegalAccessException, InvocationTargetException {
        Method[] declaredMethods = a.b(a.a(this.f42380a)).getDeclaredMethods();
        Intrinsics.checkNotNullExpressionValue(declaredMethods, "getDeclaredMethods(...)");
        ArrayList arrayList = new ArrayList(declaredMethods.length);
        for (Method method : declaredMethods) {
            AbstractC3444h.a aVar = AbstractC3444h.f42381b;
            Object objInvoke = method.invoke(this.f42380a, null);
            Intrinsics.checkNotNullExpressionValue(objInvoke, "invoke(...)");
            arrayList.add(aVar.a(objInvoke, f.p(method.getName())));
        }
        return arrayList;
    }

    public String toString() {
        return C3443g.class.getName() + ": " + this.f42380a;
    }
}
