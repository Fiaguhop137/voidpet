package G3;

import Ad.AbstractC0793c;
import If.AbstractC1113o;
import If.InterfaceC1107i;
import If.InterfaceC1108j;
import If.K;
import If.Q;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
final class s implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC1108j f3928a;

    private /* synthetic */ s(InterfaceC1108j interfaceC1108j) {
        this.f3928a = interfaceC1108j;
    }

    public static final /* synthetic */ s a(InterfaceC1108j interfaceC1108j) {
        return new s(interfaceC1108j);
    }

    public static void b(InterfaceC1108j interfaceC1108j) {
        interfaceC1108j.close();
    }

    public static InterfaceC1108j c(InterfaceC1108j interfaceC1108j) {
        return interfaceC1108j;
    }

    public static boolean d(InterfaceC1108j interfaceC1108j, Object obj) {
        return (obj instanceof s) && Intrinsics.b(interfaceC1108j, ((s) obj).g());
    }

    public static int e(InterfaceC1108j interfaceC1108j) {
        return interfaceC1108j.hashCode();
    }

    public static String f(InterfaceC1108j interfaceC1108j) {
        return "SourceResponseBody(source=" + interfaceC1108j + ')';
    }

    public static Object h(InterfaceC1108j interfaceC1108j, InterfaceC1107i interfaceC1107i, Ed.b bVar) {
        interfaceC1108j.J3(interfaceC1107i);
        return Unit.f48228a;
    }

    public static Object i(InterfaceC1108j interfaceC1108j, AbstractC1113o abstractC1113o, Q q10, Ed.b bVar) throws Throwable {
        InterfaceC1107i interfaceC1107iC = K.c(abstractC1113o.p(q10, false));
        try {
            kotlin.coroutines.jvm.internal.b.e(interfaceC1108j.J3(interfaceC1107iC));
            if (interfaceC1107iC != null) {
                try {
                    interfaceC1107iC.close();
                } catch (Throwable th) {
                    th = th;
                }
            }
            th = null;
        } catch (Throwable th2) {
            th = th2;
            if (interfaceC1107iC != null) {
                try {
                    interfaceC1107iC.close();
                } catch (Throwable th3) {
                    AbstractC0793c.a(th, th3);
                }
            }
        }
        if (th == null) {
            return Unit.f48228a;
        }
        throw th;
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        b(this.f3928a);
    }

    public boolean equals(Object obj) {
        return d(this.f3928a, obj);
    }

    public final /* synthetic */ InterfaceC1108j g() {
        return this.f3928a;
    }

    public int hashCode() {
        return e(this.f3928a);
    }

    @Override // G3.r
    public Object i3(AbstractC1113o abstractC1113o, Q q10, Ed.b bVar) {
        return i(this.f3928a, abstractC1113o, q10, bVar);
    }

    public String toString() {
        return f(this.f3928a);
    }

    @Override // G3.r
    public Object x0(InterfaceC1107i interfaceC1107i, Ed.b bVar) {
        return h(this.f3928a, interfaceC1107i, bVar);
    }
}
