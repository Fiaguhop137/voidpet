package p123ge;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: ge.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
final class C3439c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C3439c f42370a = new C3439c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static a f42371b;

    /* JADX INFO: renamed from: ge.c$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Method f42372a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Method f42373b;

        public a(Method method, Method method2) {
            this.f42372a = method;
            this.f42373b = method2;
        }

        public final Method a() {
            return this.f42373b;
        }

        public final Method b() {
            return this.f42372a;
        }
    }

    private C3439c() {
    }

    public final a a(Member member) {
        Intrinsics.checkNotNullParameter(member, "member");
        Class<?> cls = member.getClass();
        try {
            return new a(cls.getMethod("getParameters", null), AbstractC3442f.j(cls).loadClass("java.lang.reflect.Parameter").getMethod("getName", null));
        } catch (NoSuchMethodException unused) {
            return new a(null, null);
        }
    }

    public final List b(Member member) throws IllegalAccessException, InvocationTargetException {
        Method methodA;
        Intrinsics.checkNotNullParameter(member, "member");
        a aVarA = f42371b;
        if (aVarA == null) {
            synchronized (this) {
                aVarA = f42371b;
                if (aVarA == null) {
                    aVarA = f42370a.a(member);
                    f42371b = aVarA;
                }
            }
        }
        Method methodB = aVarA.b();
        if (methodB == null || (methodA = aVarA.a()) == null) {
            return null;
        }
        Object objInvoke = methodB.invoke(member, null);
        Intrinsics.d(objInvoke, "null cannot be cast to non-null type kotlin.Array<*>");
        Object[] objArr = (Object[]) objInvoke;
        ArrayList arrayList = new ArrayList(objArr.length);
        for (Object obj : objArr) {
            Object objInvoke2 = methodA.invoke(obj, null);
            Intrinsics.d(objInvoke2, "null cannot be cast to non-null type kotlin.String");
            arrayList.add((String) objInvoke2);
        }
        return arrayList;
    }
}
