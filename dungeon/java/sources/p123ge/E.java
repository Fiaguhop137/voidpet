package p123ge;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p302qe.InterfaceC4072a;
import p302qe.x;
import p464ze.b;
import p464ze.c;

/* JADX INFO: loaded from: classes3.dex */
public abstract class E implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f42351a = new a(null);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final E a(Type type) {
            Intrinsics.checkNotNullParameter(type, "type");
            boolean z10 = type instanceof Class;
            if (z10) {
                Class cls = (Class) type;
                if (cls.isPrimitive()) {
                    return new C(cls);
                }
            }
            if ((type instanceof GenericArrayType) || (z10 && ((Class) type).isArray())) {
                return new m(type);
            }
            return type instanceof WildcardType ? new H((WildcardType) type) : new s(type);
        }
    }

    protected abstract Type Q();

    public boolean equals(Object obj) {
        return (obj instanceof E) && Intrinsics.b(Q(), ((E) obj).Q());
    }

    public int hashCode() {
        return Q().hashCode();
    }

    public String toString() {
        return getClass().getName() + ": " + Q();
    }

    @Override // p302qe.InterfaceC4075d
    public InterfaceC4072a u(c fqName) {
        Object obj;
        Object next;
        b bVarD;
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Iterator it = getAnnotations().iterator();
        do {
            obj = null;
            if (it.hasNext()) {
                next = it.next();
                bVarD = ((InterfaceC4072a) next).d();
            }
            return (InterfaceC4072a) obj;
        } while (!Intrinsics.b(bVarD != null ? bVarD.a() : null, fqName));
        obj = next;
        return (InterfaceC4072a) obj;
    }
}
