package p123ge;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.AbstractC3952n;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p015ae.w0;
import p015ae.x0;
import p087ee.a;
import p087ee.b;
import p087ee.c;
import p302qe.InterfaceC4072a;
import p302qe.q;
import p464ze.f;
import p464ze.h;

/* JADX INFO: loaded from: classes3.dex */
public abstract class y extends u implements j, A, q {
    @Override // p302qe.InterfaceC4075d
    public boolean E() {
        return false;
    }

    @Override // p302qe.q
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public q P() {
        Class<?> declaringClass = R().getDeclaringClass();
        Intrinsics.checkNotNullExpressionValue(declaringClass, "getDeclaringClass(...)");
        return new q(declaringClass);
    }

    public abstract Member R();

    protected final List S(Type[] parameterTypes, Annotation[][] parameterAnnotations, boolean z10) throws IllegalAccessException, InvocationTargetException {
        String str;
        Intrinsics.checkNotNullParameter(parameterTypes, "parameterTypes");
        Intrinsics.checkNotNullParameter(parameterAnnotations, "parameterAnnotations");
        ArrayList arrayList = new ArrayList(parameterTypes.length);
        List listB = C3439c.f42370a.b(R());
        int size = listB != null ? listB.size() - parameterTypes.length : 0;
        int length = parameterTypes.length;
        int i10 = 0;
        while (i10 < length) {
            E eA = E.f42351a.a(parameterTypes[i10]);
            if (listB != null) {
                str = (String) CollectionsKt.l0(listB, i10 + size);
                if (str == null) {
                    throw new IllegalStateException(("No parameter with index " + i10 + '+' + size + " (name=" + getName() + " type=" + eA + ") in " + this).toString());
                }
            } else {
                str = null;
            }
            arrayList.add(new G(eA, parameterAnnotations[i10], str, z10 && i10 == AbstractC3952n.X(parameterTypes)));
            i10++;
        }
        return arrayList;
    }

    public boolean equals(Object obj) {
        return (obj instanceof y) && Intrinsics.b(R(), ((y) obj).R());
    }

    @Override // p302qe.InterfaceC4075d
    public /* bridge */ /* synthetic */ Collection getAnnotations() {
        return getAnnotations();
    }

    @Override // p123ge.j, p302qe.InterfaceC4075d
    public List getAnnotations() {
        Annotation[] declaredAnnotations;
        List listB;
        AnnotatedElement annotatedElementS = s();
        return (annotatedElementS == null || (declaredAnnotations = annotatedElementS.getDeclaredAnnotations()) == null || (listB = k.b(declaredAnnotations)) == null) ? CollectionsKt.l() : listB;
    }

    @Override // p123ge.A
    public int getModifiers() {
        return R().getModifiers();
    }

    @Override // p302qe.t
    public f getName() {
        f fVarP;
        String name = R().getName();
        return (name == null || (fVarP = f.p(name)) == null) ? h.f58580b : fVarP;
    }

    @Override // p302qe.s
    public x0 getVisibility() {
        int modifiers = getModifiers();
        if (Modifier.isPublic(modifiers)) {
            return w0.h.f19769c;
        }
        if (Modifier.isPrivate(modifiers)) {
            return w0.e.f19766c;
        }
        if (Modifier.isProtected(modifiers)) {
            return Modifier.isStatic(modifiers) ? c.f40742c : b.f40741c;
        }
        return a.f40740c;
    }

    public int hashCode() {
        return R().hashCode();
    }

    @Override // p302qe.s
    public boolean isAbstract() {
        return Modifier.isAbstract(getModifiers());
    }

    @Override // p302qe.s
    public boolean isFinal() {
        return Modifier.isFinal(getModifiers());
    }

    @Override // p302qe.s
    public boolean j() {
        return Modifier.isStatic(getModifiers());
    }

    @Override // p123ge.j
    public AnnotatedElement s() {
        Member memberR = R();
        Intrinsics.d(memberR, "null cannot be cast to non-null type java.lang.reflect.AnnotatedElement");
        return (AnnotatedElement) memberR;
    }

    public String toString() {
        return getClass().getName() + ": " + R();
    }

    @Override // p123ge.j, p302qe.InterfaceC4075d
    public C3443g u(p464ze.c fqName) {
        Annotation[] declaredAnnotations;
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        AnnotatedElement annotatedElementS = s();
        if (annotatedElementS == null || (declaredAnnotations = annotatedElementS.getDeclaredAnnotations()) == null) {
            return null;
        }
        return k.a(declaredAnnotations, fqName);
    }

    @Override // p302qe.InterfaceC4075d
    public /* bridge */ /* synthetic */ InterfaceC4072a u(p464ze.c cVar) {
        return u(cVar);
    }
}
