package p015ae;

import De.s;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.w;
import kotlin.sequences.k;
import p159ie.d;
import p464ze.b;
import p464ze.f;

/* JADX INFO: renamed from: ae.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1810y {

    /* JADX INFO: renamed from: ae.y$a */
    /* synthetic */ class a extends w {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f19774b = new a();

        a() {
            super(b.class, "outerClassId", "getOuterClassId()Lorg/jetbrains/kotlin/name/ClassId;", 0);
        }

        @Override // kotlin.jvm.internal.w, kotlin.reflect.m
        public Object get(Object obj) {
            return ((b) obj).e();
        }
    }

    public static final InterfaceC1791e b(H h10, b classId) {
        Intrinsics.checkNotNullParameter(h10, "<this>");
        Intrinsics.checkNotNullParameter(classId, "classId");
        InterfaceC1794h interfaceC1794hC = c(h10, classId);
        if (interfaceC1794hC instanceof InterfaceC1791e) {
            return (InterfaceC1791e) interfaceC1794hC;
        }
        return null;
    }

    public static final InterfaceC1794h c(H h10, b classId) {
        Intrinsics.checkNotNullParameter(h10, "<this>");
        Intrinsics.checkNotNullParameter(classId, "classId");
        H hA = s.a(h10);
        if (hA == null) {
            V V10 = h10.V(classId.f());
            List listE = classId.g().e();
            InterfaceC1794h interfaceC1794hF = V10.o().f((f) CollectionsKt.j0(listE), d.FROM_DESERIALIZATION);
            if (interfaceC1794hF == null) {
                return null;
            }
            for (f fVar : listE.subList(1, listE.size())) {
                if (!(interfaceC1794hF instanceof InterfaceC1791e)) {
                    return null;
                }
                InterfaceC1794h interfaceC1794hF2 = ((InterfaceC1791e) interfaceC1794hF).W().f(fVar, d.FROM_DESERIALIZATION);
                interfaceC1794hF = interfaceC1794hF2 instanceof InterfaceC1791e ? (InterfaceC1791e) interfaceC1794hF2 : null;
                if (interfaceC1794hF == null) {
                    return null;
                }
            }
            return interfaceC1794hF;
        }
        V V11 = hA.V(classId.f());
        List listE2 = classId.g().e();
        InterfaceC1794h interfaceC1794hF3 = V11.o().f((f) CollectionsKt.j0(listE2), d.FROM_DESERIALIZATION);
        if (interfaceC1794hF3 == null) {
            interfaceC1794hF3 = null;
            break;
        }
        for (f fVar2 : listE2.subList(1, listE2.size())) {
            if (interfaceC1794hF3 instanceof InterfaceC1791e) {
                InterfaceC1794h interfaceC1794hF4 = ((InterfaceC1791e) interfaceC1794hF3).W().f(fVar2, d.FROM_DESERIALIZATION);
                interfaceC1794hF3 = interfaceC1794hF4 instanceof InterfaceC1791e ? (InterfaceC1791e) interfaceC1794hF4 : null;
                if (interfaceC1794hF3 != null) {
                }
            }
            interfaceC1794hF3 = null;
        }
        if (interfaceC1794hF3 != null) {
            return interfaceC1794hF3;
        }
        V V12 = h10.V(classId.f());
        List listE3 = classId.g().e();
        InterfaceC1794h interfaceC1794hF5 = V12.o().f((f) CollectionsKt.j0(listE3), d.FROM_DESERIALIZATION);
        if (interfaceC1794hF5 == null) {
            return null;
        }
        for (f fVar3 : listE3.subList(1, listE3.size())) {
            if (!(interfaceC1794hF5 instanceof InterfaceC1791e)) {
                return null;
            }
            InterfaceC1794h interfaceC1794hF6 = ((InterfaceC1791e) interfaceC1794hF5).W().f(fVar3, d.FROM_DESERIALIZATION);
            interfaceC1794hF5 = interfaceC1794hF6 instanceof InterfaceC1791e ? (InterfaceC1791e) interfaceC1794hF6 : null;
            if (interfaceC1794hF5 == null) {
                return null;
            }
        }
        return interfaceC1794hF5;
    }

    public static final InterfaceC1791e d(H h10, b classId, M notFoundClasses) {
        Intrinsics.checkNotNullParameter(h10, "<this>");
        Intrinsics.checkNotNullParameter(classId, "classId");
        Intrinsics.checkNotNullParameter(notFoundClasses, "notFoundClasses");
        InterfaceC1791e interfaceC1791eB = b(h10, classId);
        return interfaceC1791eB != null ? interfaceC1791eB : notFoundClasses.d(classId, k.V(k.N(k.q(classId, a.f19774b), C1809x.f19771a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int e(b it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return 0;
    }

    public static final l0 f(H h10, b classId) {
        Intrinsics.checkNotNullParameter(h10, "<this>");
        Intrinsics.checkNotNullParameter(classId, "classId");
        InterfaceC1794h interfaceC1794hC = c(h10, classId);
        if (interfaceC1794hC instanceof l0) {
            return (l0) interfaceC1794hC;
        }
        return null;
    }
}
