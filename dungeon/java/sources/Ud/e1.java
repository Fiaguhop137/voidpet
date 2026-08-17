package Ud;

import java.io.IOException;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p015ae.InterfaceC1787a;
import p015ae.InterfaceC1811z;

/* JADX INFO: loaded from: classes3.dex */
public final class e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e1 f13592a = new e1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Ce.n f13593b = Ce.n.f1885h;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f13594a;

        static {
            int[] iArr = new int[kotlin.reflect.j.a.values().length];
            try {
                iArr[kotlin.reflect.j.a.EXTENSION_RECEIVER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[kotlin.reflect.j.a.INSTANCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[kotlin.reflect.j.a.VALUE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f13594a = iArr;
        }
    }

    private e1() {
    }

    private final void c(StringBuilder sb2, p015ae.c0 c0Var) {
        if (c0Var != null) {
            Re.S type = c0Var.getType();
            Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
            sb2.append(l(type));
            sb2.append(".");
        }
    }

    private final void d(StringBuilder sb2, InterfaceC1787a interfaceC1787a) {
        p015ae.c0 c0VarI = j1.i(interfaceC1787a);
        p015ae.c0 c0VarR = interfaceC1787a.R();
        c(sb2, c0VarI);
        boolean z10 = (c0VarI == null || c0VarR == null) ? false : true;
        if (z10) {
            sb2.append("(");
        }
        c(sb2, c0VarR);
        if (z10) {
            sb2.append(")");
        }
    }

    private final String e(InterfaceC1787a interfaceC1787a) {
        if (interfaceC1787a instanceof p015ae.Z) {
            return k((p015ae.Z) interfaceC1787a);
        }
        if (interfaceC1787a instanceof InterfaceC1811z) {
            return f((InterfaceC1811z) interfaceC1787a);
        }
        throw new IllegalStateException(("Illegal callable: " + interfaceC1787a).toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence g(p015ae.t0 t0Var) {
        e1 e1Var = f13592a;
        Re.S type = t0Var.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        return e1Var.l(type);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence i(p015ae.t0 t0Var) {
        e1 e1Var = f13592a;
        Re.S type = t0Var.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        return e1Var.l(type);
    }

    public final String f(InterfaceC1811z descriptor) throws IOException {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("fun ");
        e1 e1Var = f13592a;
        e1Var.d(sb2, descriptor);
        Ce.n nVar = f13593b;
        p464ze.f name = descriptor.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        sb2.append(nVar.R(name, true));
        List listI = descriptor.i();
        Intrinsics.checkNotNullExpressionValue(listI, "getValueParameters(...)");
        CollectionsKt___CollectionsKt.p0(listI, sb2, (124 & 2) != 0 ? ", " : ", ", (124 & 4) != 0 ? "" : "(", (124 & 8) == 0 ? ")" : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : c1.f13575a);
        sb2.append(": ");
        Re.S returnType = descriptor.getReturnType();
        Intrinsics.c(returnType);
        sb2.append(e1Var.l(returnType));
        return sb2.toString();
    }

    public final String h(InterfaceC1811z invoke) throws IOException {
        Intrinsics.checkNotNullParameter(invoke, "invoke");
        StringBuilder sb2 = new StringBuilder();
        e1 e1Var = f13592a;
        e1Var.d(sb2, invoke);
        List listI = invoke.i();
        Intrinsics.checkNotNullExpressionValue(listI, "getValueParameters(...)");
        CollectionsKt___CollectionsKt.p0(listI, sb2, (124 & 2) != 0 ? ", " : ", ", (124 & 4) != 0 ? "" : "(", (124 & 8) == 0 ? ")" : "", (124 & 16) != 0 ? -1 : 0, (124 & 32) != 0 ? "..." : null, (124 & 64) != 0 ? null : d1.f13589a);
        sb2.append(" -> ");
        Re.S returnType = invoke.getReturnType();
        Intrinsics.c(returnType);
        sb2.append(e1Var.l(returnType));
        return sb2.toString();
    }

    public final String j(C1555y0 parameter) {
        Intrinsics.checkNotNullParameter(parameter, "parameter");
        StringBuilder sb2 = new StringBuilder();
        int i10 = a.f13594a[parameter.j().ordinal()];
        if (i10 == 1) {
            sb2.append("extension receiver parameter");
        } else if (i10 == 2) {
            sb2.append("instance parameter");
        } else {
            if (i10 != 3) {
                throw new Ad.n();
            }
            sb2.append("parameter #" + parameter.getIndex() + ' ' + parameter.getName());
        }
        sb2.append(" of ");
        sb2.append(f13592a.e(parameter.v().b0()));
        return sb2.toString();
    }

    public final String k(p015ae.Z descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(descriptor.Q() ? "var " : "val ");
        e1 e1Var = f13592a;
        e1Var.d(sb2, descriptor);
        Ce.n nVar = f13593b;
        p464ze.f name = descriptor.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        sb2.append(nVar.R(name, true));
        sb2.append(": ");
        Re.S type = descriptor.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        sb2.append(e1Var.l(type));
        return sb2.toString();
    }

    public final String l(Re.S type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return f13593b.S(type);
    }
}
