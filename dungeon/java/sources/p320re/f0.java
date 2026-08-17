package p320re;

import Ie.e;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import p338se.F;

/* JADX INFO: loaded from: classes3.dex */
public abstract class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final C4083h f52520a = new C4083h(EnumC4086k.NULLABLE, null, false, false, 8, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final C4083h f52521b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final C4083h f52522c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Map f52523d;

    static {
        EnumC4086k enumC4086k = EnumC4086k.NOT_NULL;
        f52521b = new C4083h(enumC4086k, null, false, false, 8, null);
        f52522c = new C4083h(enumC4086k, null, true, false, 8, null);
        F f10 = F.f53539a;
        String strH = f10.h("Object");
        String strG = f10.g("Predicate");
        String strG2 = f10.g("Function");
        String strG3 = f10.g("Consumer");
        String strG4 = f10.g("BiFunction");
        String strG5 = f10.g("BiConsumer");
        String strG6 = f10.g("UnaryOperator");
        String strI = f10.i("stream/Stream");
        String strI2 = f10.i("Optional");
        n0 n0Var = new n0();
        n0.a.b(new n0.a(n0Var, f10.i("Iterator")), "forEachRemaining", null, new C4088m(strG3), 2, null);
        n0.a.b(new n0.a(n0Var, f10.h("Iterable")), "spliterator", null, new C4098x(f10), 2, null);
        n0.a aVar = new n0.a(n0Var, f10.i("Collection"));
        n0.a.b(aVar, "removeIf", null, new I(strG), 2, null);
        n0.a.b(aVar, "stream", null, new U(strI), 2, null);
        n0.a.b(aVar, "parallelStream", null, new Z(strI), 2, null);
        n0.a aVar2 = new n0.a(n0Var, f10.i("List"));
        n0.a.b(aVar2, "replaceAll", null, new a0(strG6), 2, null);
        aVar2.a("addFirst", "2.1", new b0(strH));
        aVar2.a("addLast", "2.1", new c0(strH));
        aVar2.a("removeFirst", "2.1", new d0(strH));
        aVar2.a("removeLast", "2.1", new e0(strH));
        n0.a aVar3 = new n0.a(n0Var, f10.i("LinkedList"));
        aVar3.a("addFirst", "2.1", new C4089n(strH));
        aVar3.a("addLast", "2.1", new C4090o(strH));
        aVar3.a("removeFirst", "2.1", new C4091p(strH));
        aVar3.a("removeLast", "2.1", new C4092q(strH));
        n0.a aVar4 = new n0.a(n0Var, f10.i("LinkedHashSet"));
        aVar4.a("addFirst", "2.2", new r(strH));
        aVar4.a("addLast", "2.2", new C4093s(strH));
        aVar4.a("removeFirst", "2.2", new C4094t(strH));
        aVar4.a("removeLast", "2.2", new C4095u(strH));
        aVar4.a("getFirst", "2.2", new C4096v(strH));
        aVar4.a("getLast", "2.2", new C4097w(strH));
        n0.a aVar5 = new n0.a(n0Var, f10.i("Map"));
        n0.a.b(aVar5, "forEach", null, new C4099y(strG5), 2, null);
        n0.a.b(aVar5, "putIfAbsent", null, new C4100z(strH), 2, null);
        n0.a.b(aVar5, "replace", null, new A(strH), 2, null);
        n0.a.b(aVar5, "replace", null, new B(strH), 2, null);
        n0.a.b(aVar5, "replaceAll", null, new C(strG4), 2, null);
        n0.a.b(aVar5, "compute", null, new D(strH, strG4), 2, null);
        n0.a.b(aVar5, "computeIfAbsent", null, new E(strH, strG2), 2, null);
        n0.a.b(aVar5, "computeIfPresent", null, new F(strH, strG4), 2, null);
        n0.a.b(aVar5, "merge", null, new G(strH, strG4), 2, null);
        n0.a aVar6 = new n0.a(n0Var, f10.i("LinkedHashMap"));
        aVar6.a("putFirst", "2.2", new H(strH));
        aVar6.a("putLast", "2.2", new J(strH));
        n0.a aVar7 = new n0.a(n0Var, strI2);
        n0.a.b(aVar7, "empty", null, new K(strI2), 2, null);
        n0.a.b(aVar7, "of", null, new L(strH, strI2), 2, null);
        n0.a.b(aVar7, "ofNullable", null, new M(strH, strI2), 2, null);
        n0.a.b(aVar7, "get", null, new N(strH), 2, null);
        n0.a.b(aVar7, "ifPresent", null, new O(strG3), 2, null);
        n0.a.b(new n0.a(n0Var, f10.h("ref/Reference")), "get", null, new P(strH), 2, null);
        n0.a.b(new n0.a(n0Var, strG), "test", null, new Q(strH), 2, null);
        n0.a.b(new n0.a(n0Var, f10.g("BiPredicate")), "test", null, new S(strH), 2, null);
        n0.a.b(new n0.a(n0Var, strG3), "accept", null, new T(strH), 2, null);
        n0.a.b(new n0.a(n0Var, strG5), "accept", null, new V(strH), 2, null);
        n0.a.b(new n0.a(n0Var, strG2), "apply", null, new W(strH), 2, null);
        n0.a.b(new n0.a(n0Var, strG4), "apply", null, new X(strH), 2, null);
        n0.a.b(new n0.a(n0Var, f10.g("Supplier")), "get", null, new Y(strH), 2, null);
        f52523d = n0Var.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit A(String str, n0.a.C0635a function) {
        Intrinsics.checkNotNullParameter(function, "$this$function");
        C4083h c4083h = f52521b;
        function.b(str, c4083h);
        function.b(str, c4083h);
        function.d(str, f52520a);
        return Unit.f48228a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit B(String str, n0.a.C0635a function) {
        Intrinsics.checkNotNullParameter(function, "$this$function");
        C4083h c4083h = f52521b;
        function.b(str, c4083h);
        function.b(str, c4083h);
        function.d(str, f52520a);
        return Unit.f48228a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit C(String str, n0.a.C0635a function) {
        Intrinsics.checkNotNullParameter(function, "$this$function");
        function.d(str, f52521b, f52522c);
        return Unit.f48228a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit D(String str, String str2, n0.a.C0635a function) {
        Intrinsics.checkNotNullParameter(function, "$this$function");
        C4083h c4083h = f52522c;
        function.b(str, c4083h);
        function.d(str2, f52521b, c4083h);
        return Unit.f48228a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit E(String str, String str2, n0.a.C0635a function) {
        Intrinsics.checkNotNullParameter(function, "$this$function");
        function.b(str, f52520a);
        function.d(str2, f52521b, f52522c);
        return Unit.f48228a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit F(String str, n0.a.C0635a function) {
        Intrinsics.checkNotNullParameter(function, "$this$function");
        function.d(str, f52522c);
        return Unit.f48228a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit G(String str, n0.a.C0635a function) {
        Intrinsics.checkNotNullParameter(function, "$this$function");
        function.b(str, f52521b, f52522c);
        return Unit.f48228a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit H(String str, n0.a.C0635a function) {
        Intrinsics.checkNotNullParameter(function, "$this$function");
        function.d(str, f52520a);
        return Unit.f48228a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit I(String str, n0.a.C0635a function) {
        Intrinsics.checkNotNullParameter(function, "$this$function");
        function.b(str, f52521b);
        function.c(e.BOOLEAN);
        return Unit.f48228a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit J(String str, n0.a.C0635a function) {
        Intrinsics.checkNotNullParameter(function, "$this$function");
        C4083h c4083h = f52521b;
        function.b(str, c4083h);
        function.b(str, c4083h);
        function.c(e.BOOLEAN);
        return Unit.f48228a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit K(String str, n0.a.C0635a function) {
        Intrinsics.checkNotNullParameter(function, "$this$function");
        function.b(str, f52521b);
        return Unit.f48228a;
    }

    public static final Map K0() {
        return f52523d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit L(String str, n0.a.C0635a function) {
        Intrinsics.checkNotNullParameter(function, "$this$function");
        C4083h c4083h = f52521b;
        function.b(str, c4083h);
        function.b(str, c4083h);
        return Unit.f48228a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit M(String str, n0.a.C0635a function) {
        Intrinsics.checkNotNullParameter(function, "$this$function");
        C4083h c4083h = f52521b;
        function.b(str, c4083h);
        function.d(str, c4083h);
        return Unit.f48228a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit N(String str, n0.a.C0635a function) {
        Intrinsics.checkNotNullParameter(function, "$this$function");
        C4083h c4083h = f52521b;
        function.b(str, c4083h);
        function.b(str, c4083h);
        function.d(str, c4083h);
        return Unit.f48228a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit O(String str, n0.a.C0635a function) {
        Intrinsics.checkNotNullParameter(function, "$this$function");
        function.d(str, f52521b);
        return Unit.f48228a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit P(String str, n0.a.C0635a function) {
        Intrinsics.checkNotNullParameter(function, "$this$function");
        C4083h c4083h = f52521b;
        function.b(str, c4083h, c4083h);
        function.c(e.BOOLEAN);
        return Unit.f48228a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Q(String str, n0.a.C0635a function) {
        Intrinsics.checkNotNullParameter(function, "$this$function");
        C4083h c4083h = f52521b;
        function.d(str, c4083h, c4083h);
        return Unit.f48228a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit R(String str, n0.a.C0635a function) {
        Intrinsics.checkNotNullParameter(function, "$this$function");
        C4083h c4083h = f52521b;
        function.d(str, c4083h, c4083h);
        return Unit.f48228a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(String str, n0.a.C0635a function) {
        Intrinsics.checkNotNullParameter(function, "$this$function");
        C4083h c4083h = f52521b;
        function.b(str, c4083h, c4083h);
        return Unit.f48228a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b(String str, n0.a.C0635a function) {
        Intrinsics.checkNotNullParameter(function, "$this$function");
        function.b(str, f52521b);
        return Unit.f48228a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c(String str, n0.a.C0635a function) {
        Intrinsics.checkNotNullParameter(function, "$this$function");
        function.d(str, f52521b);
        return Unit.f48228a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(String str, n0.a.C0635a function) {
        Intrinsics.checkNotNullParameter(function, "$this$function");
        function.d(str, f52521b);
        return Unit.f48228a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(String str, n0.a.C0635a function) {
        Intrinsics.checkNotNullParameter(function, "$this$function");
        C4083h c4083h = f52521b;
        function.b(str, c4083h, c4083h);
        return Unit.f48228a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(String str, n0.a.C0635a function) {
        Intrinsics.checkNotNullParameter(function, "$this$function");
        function.b(str, f52521b);
        return Unit.f48228a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(String str, n0.a.C0635a function) {
        Intrinsics.checkNotNullParameter(function, "$this$function");
        function.b(str, f52521b);
        return Unit.f48228a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(String str, n0.a.C0635a function) {
        Intrinsics.checkNotNullParameter(function, "$this$function");
        function.b(str, f52521b);
        return Unit.f48228a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(String str, n0.a.C0635a function) {
        Intrinsics.checkNotNullParameter(function, "$this$function");
        function.d(str, f52521b);
        return Unit.f48228a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j(String str, n0.a.C0635a function) {
        Intrinsics.checkNotNullParameter(function, "$this$function");
        function.d(str, f52521b);
        return Unit.f48228a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(String str, n0.a.C0635a function) {
        Intrinsics.checkNotNullParameter(function, "$this$function");
        function.b(str, f52521b);
        return Unit.f48228a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(String str, n0.a.C0635a function) {
        Intrinsics.checkNotNullParameter(function, "$this$function");
        function.b(str, f52521b);
        return Unit.f48228a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m(String str, n0.a.C0635a function) {
        Intrinsics.checkNotNullParameter(function, "$this$function");
        function.d(str, f52521b);
        return Unit.f48228a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n(String str, n0.a.C0635a function) {
        Intrinsics.checkNotNullParameter(function, "$this$function");
        function.d(str, f52521b);
        return Unit.f48228a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o(String str, n0.a.C0635a function) {
        Intrinsics.checkNotNullParameter(function, "$this$function");
        function.d(str, f52521b);
        return Unit.f48228a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p(String str, n0.a.C0635a function) {
        Intrinsics.checkNotNullParameter(function, "$this$function");
        function.d(str, f52521b);
        return Unit.f48228a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit q(F f10, n0.a.C0635a function) {
        Intrinsics.checkNotNullParameter(function, "$this$function");
        String strI = f10.i("Spliterator");
        C4083h c4083h = f52521b;
        function.d(strI, c4083h, c4083h);
        return Unit.f48228a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit r(String str, n0.a.C0635a function) {
        Intrinsics.checkNotNullParameter(function, "$this$function");
        C4083h c4083h = f52521b;
        function.b(str, c4083h, c4083h, c4083h);
        return Unit.f48228a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit s(String str, n0.a.C0635a function) {
        Intrinsics.checkNotNullParameter(function, "$this$function");
        C4083h c4083h = f52521b;
        function.b(str, c4083h);
        function.b(str, c4083h);
        function.d(str, f52520a);
        return Unit.f48228a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(String str, n0.a.C0635a function) {
        Intrinsics.checkNotNullParameter(function, "$this$function");
        C4083h c4083h = f52521b;
        function.b(str, c4083h);
        function.b(str, c4083h);
        function.d(str, f52520a);
        return Unit.f48228a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit u(String str, n0.a.C0635a function) {
        Intrinsics.checkNotNullParameter(function, "$this$function");
        C4083h c4083h = f52521b;
        function.b(str, c4083h);
        function.b(str, c4083h);
        function.b(str, c4083h);
        function.c(e.BOOLEAN);
        return Unit.f48228a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit v(String str, n0.a.C0635a function) {
        Intrinsics.checkNotNullParameter(function, "$this$function");
        C4083h c4083h = f52521b;
        function.b(str, c4083h, c4083h, c4083h, c4083h);
        return Unit.f48228a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit w(String str, String str2, n0.a.C0635a function) {
        Intrinsics.checkNotNullParameter(function, "$this$function");
        C4083h c4083h = f52521b;
        function.b(str, c4083h);
        C4083h c4083h2 = f52520a;
        function.b(str2, c4083h, c4083h, c4083h2, c4083h2);
        function.d(str, c4083h2);
        return Unit.f48228a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit x(String str, String str2, n0.a.C0635a function) {
        Intrinsics.checkNotNullParameter(function, "$this$function");
        C4083h c4083h = f52521b;
        function.b(str, c4083h);
        function.b(str2, c4083h, c4083h, c4083h);
        function.d(str, c4083h);
        return Unit.f48228a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit y(String str, String str2, n0.a.C0635a function) {
        Intrinsics.checkNotNullParameter(function, "$this$function");
        C4083h c4083h = f52521b;
        function.b(str, c4083h);
        C4083h c4083h2 = f52522c;
        C4083h c4083h3 = f52520a;
        function.b(str2, c4083h, c4083h, c4083h2, c4083h3);
        function.d(str, c4083h3);
        return Unit.f48228a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit z(String str, String str2, n0.a.C0635a function) {
        Intrinsics.checkNotNullParameter(function, "$this$function");
        C4083h c4083h = f52521b;
        function.b(str, c4083h);
        C4083h c4083h2 = f52522c;
        function.b(str, c4083h2);
        C4083h c4083h3 = f52520a;
        function.b(str2, c4083h, c4083h2, c4083h2, c4083h3);
        function.d(str, c4083h3);
        return Unit.f48228a;
    }
}
