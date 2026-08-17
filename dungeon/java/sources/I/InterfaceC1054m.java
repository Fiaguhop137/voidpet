package I;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: I.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC1054m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f4688a = a.f4689a;

    /* JADX INFO: renamed from: I.m$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f4689a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final Object f4690b = new C0100a();

        /* JADX INFO: renamed from: I.m$a$a, reason: collision with other inner class name */
        public static final class C0100a {
            C0100a() {
            }

            public String toString() {
                return "Empty";
            }
        }

        private a() {
        }

        public final Object a() {
            return f4690b;
        }
    }

    void A();

    void B(int i10);

    void C(InterfaceC1023b1 interfaceC1023b1);

    Object D();

    U.e E();

    boolean F(Object obj);

    void G();

    void H(int i10, Object obj);

    void I();

    void J(int i10, Object obj);

    void K(Function0 function0);

    void L();

    void M();

    boolean N();

    void O();

    default int P() {
        return Long.hashCode(n());
    }

    AbstractC1089y Q();

    void R();

    void S();

    Object T(D d10);

    boolean U(Object obj);

    void V(int i10);

    boolean a(boolean z10);

    boolean b(float f10);

    boolean c(int i10);

    boolean d(long j10);

    void e(C1020a1[] c1020a1Arr);

    boolean f();

    void g(boolean z10);

    InterfaceC1054m h(int i10);

    boolean i();

    InterfaceC1027d j();

    InterfaceC1094z1 k();

    void l();

    void m(Object obj, Function2 function2);

    long n();

    boolean o(boolean z10, int i10);

    void p(C1020a1 c1020a1);

    CoroutineContext q();

    I r();

    void s();

    void t(Object obj);

    void u();

    void v();

    void w();

    void x(Function0 function0);

    void y();

    InterfaceC1023b1 z();
}
