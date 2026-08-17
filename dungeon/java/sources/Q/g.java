package Q;

import I.AbstractC1032e1;
import I.InterfaceC1023b1;
import I.InterfaceC1054m;
import I.InterfaceC1094z1;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC3964a;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.K;

/* JADX INFO: loaded from: classes.dex */
public final class g implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f9203a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f9204b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Object f9205c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private InterfaceC1023b1 f9206d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private List f9207e;

    /* synthetic */ class a extends AbstractC3964a implements Function2 {
        a(Object obj) {
            super(2, obj, g.class, "invoke", "invoke(Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", 8);
        }

        public final void a(InterfaceC1054m interfaceC1054m, int i10) {
            ((g) this.f48352a).g(interfaceC1054m, i10);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC1054m) obj, ((Number) obj2).intValue());
            return Unit.f48228a;
        }
    }

    public g(int i10, boolean z10, Object obj) {
        this.f9203a = i10;
        this.f9204b = z10;
        this.f9205c = obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m(g gVar, Object obj, int i10, InterfaceC1054m interfaceC1054m, int i11) {
        gVar.i(obj, interfaceC1054m, AbstractC1032e1.a(i10) | 1);
        return Unit.f48228a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n(g gVar, Object obj, Object obj2, int i10, InterfaceC1054m interfaceC1054m, int i11) {
        gVar.j(obj, obj2, interfaceC1054m, AbstractC1032e1.a(i10) | 1);
        return Unit.f48228a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p(g gVar, Object obj, Object obj2, Object obj3, int i10, InterfaceC1054m interfaceC1054m, int i11) {
        gVar.k(obj, obj2, obj3, interfaceC1054m, AbstractC1032e1.a(i10) | 1);
        return Unit.f48228a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(g gVar, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10, InterfaceC1054m interfaceC1054m, int i11) {
        gVar.l(obj, obj2, obj3, obj4, obj5, interfaceC1054m, AbstractC1032e1.a(i10) | 1);
        return Unit.f48228a;
    }

    private final void u(InterfaceC1054m interfaceC1054m) {
        InterfaceC1023b1 interfaceC1023b1Z;
        if (!this.f9204b || (interfaceC1023b1Z = interfaceC1054m.z()) == null) {
            return;
        }
        interfaceC1054m.C(interfaceC1023b1Z);
        if (h.f(this.f9206d, interfaceC1023b1Z)) {
            this.f9206d = interfaceC1023b1Z;
            return;
        }
        List list = this.f9207e;
        if (list == null) {
            ArrayList arrayList = new ArrayList();
            this.f9207e = arrayList;
            arrayList.add(interfaceC1023b1Z);
            return;
        }
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (h.f((InterfaceC1023b1) list.get(i10), interfaceC1023b1Z)) {
                list.set(i10, interfaceC1023b1Z);
                return;
            }
        }
        list.add(interfaceC1023b1Z);
    }

    private final void v() {
        if (this.f9204b) {
            InterfaceC1023b1 interfaceC1023b1 = this.f9206d;
            if (interfaceC1023b1 != null) {
                interfaceC1023b1.invalidate();
                this.f9206d = null;
            }
            List list = this.f9207e;
            if (list != null) {
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((InterfaceC1023b1) list.get(i10)).invalidate();
                }
                list.clear();
            }
        }
    }

    @Override // Md.o
    public /* bridge */ /* synthetic */ Object c(Object obj, Object obj2, Object obj3, Object obj4) {
        return j(obj, obj2, (InterfaceC1054m) obj3, ((Number) obj4).intValue());
    }

    public Object g(InterfaceC1054m interfaceC1054m, int i10) {
        InterfaceC1054m interfaceC1054mH = interfaceC1054m.h(this.f9203a);
        u(interfaceC1054mH);
        int iD = i10 | (interfaceC1054mH.U(this) ? h.d(0) : h.g(0));
        Object obj = this.f9205c;
        Intrinsics.d(obj, "null cannot be cast to non-null type kotlin.Function2<@[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        Object objInvoke = ((Function2) K.e(obj, 2)).invoke(interfaceC1054mH, Integer.valueOf(iD));
        InterfaceC1094z1 interfaceC1094z1K = interfaceC1054mH.k();
        if (interfaceC1094z1K != null) {
            interfaceC1094z1K.a(new a(this));
        }
        return objInvoke;
    }

    public Object i(Object obj, InterfaceC1054m interfaceC1054m, int i10) {
        InterfaceC1054m interfaceC1054mH = interfaceC1054m.h(this.f9203a);
        u(interfaceC1054mH);
        int iD = interfaceC1054mH.U(this) ? h.d(1) : h.g(1);
        Object obj2 = this.f9205c;
        Intrinsics.d(obj2, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        Object objInvoke = ((Md.n) K.e(obj2, 3)).invoke(obj, interfaceC1054mH, Integer.valueOf(iD | i10));
        InterfaceC1094z1 interfaceC1094z1K = interfaceC1054mH.k();
        if (interfaceC1094z1K != null) {
            interfaceC1094z1K.a(new e(this, obj, i10));
        }
        return objInvoke;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return g((InterfaceC1054m) obj, ((Number) obj2).intValue());
    }

    @Override // Md.n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return i(obj, (InterfaceC1054m) obj2, ((Number) obj3).intValue());
    }

    @Override // Md.r
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        return l(obj, obj2, obj3, obj4, obj5, (InterfaceC1054m) obj6, ((Number) obj7).intValue());
    }

    public Object j(Object obj, Object obj2, InterfaceC1054m interfaceC1054m, int i10) {
        InterfaceC1054m interfaceC1054mH = interfaceC1054m.h(this.f9203a);
        u(interfaceC1054mH);
        int iD = interfaceC1054mH.U(this) ? h.d(2) : h.g(2);
        Object obj3 = this.f9205c;
        Intrinsics.d(obj3, "null cannot be cast to non-null type kotlin.Function4<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        Object objC = ((Md.o) K.e(obj3, 4)).c(obj, obj2, interfaceC1054mH, Integer.valueOf(iD | i10));
        InterfaceC1094z1 interfaceC1094z1K = interfaceC1054mH.k();
        if (interfaceC1094z1K != null) {
            interfaceC1094z1K.a(new c(this, obj, obj2, i10));
        }
        return objC;
    }

    public Object k(Object obj, Object obj2, Object obj3, InterfaceC1054m interfaceC1054m, int i10) {
        InterfaceC1054m interfaceC1054mH = interfaceC1054m.h(this.f9203a);
        u(interfaceC1054mH);
        int iD = interfaceC1054mH.U(this) ? h.d(3) : h.g(3);
        Object obj4 = this.f9205c;
        Intrinsics.d(obj4, "null cannot be cast to non-null type kotlin.Function5<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"p3\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        Object objR = ((Md.p) K.e(obj4, 5)).r(obj, obj2, obj3, interfaceC1054mH, Integer.valueOf(iD | i10));
        InterfaceC1094z1 interfaceC1094z1K = interfaceC1054mH.k();
        if (interfaceC1094z1K != null) {
            interfaceC1094z1K.a(new d(this, obj, obj2, obj3, i10));
        }
        return objR;
    }

    public Object l(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, InterfaceC1054m interfaceC1054m, int i10) {
        InterfaceC1054m interfaceC1054mH = interfaceC1054m.h(this.f9203a);
        u(interfaceC1054mH);
        int iD = interfaceC1054mH.U(this) ? h.d(5) : h.g(5);
        Object obj6 = this.f9205c;
        Intrinsics.d(obj6, "null cannot be cast to non-null type kotlin.Function7<@[ParameterName(name = \"p1\")] kotlin.Any?, @[ParameterName(name = \"p2\")] kotlin.Any?, @[ParameterName(name = \"p3\")] kotlin.Any?, @[ParameterName(name = \"p4\")] kotlin.Any?, @[ParameterName(name = \"p5\")] kotlin.Any?, @[ParameterName(name = \"c\")] androidx.compose.runtime.Composer, @[ParameterName(name = \"changed\")] kotlin.Int, kotlin.Any?>");
        Object objInvoke = ((Md.r) K.e(obj6, 7)).invoke(obj, obj2, obj3, obj4, obj5, interfaceC1054mH, Integer.valueOf(i10 | iD));
        InterfaceC1094z1 interfaceC1094z1K = interfaceC1054mH.k();
        if (interfaceC1094z1K != null) {
            interfaceC1094z1K.a(new f(this, obj, obj2, obj3, obj4, obj5, i10));
        }
        return objInvoke;
    }

    @Override // Md.p
    public /* bridge */ /* synthetic */ Object r(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return k(obj, obj2, obj3, (InterfaceC1054m) obj4, ((Number) obj5).intValue());
    }

    public final void w(Object obj) {
        if (Intrinsics.b(this.f9205c, obj)) {
            return;
        }
        boolean z10 = this.f9205c == null;
        this.f9205c = obj;
        if (z10) {
            return;
        }
        v();
    }
}
