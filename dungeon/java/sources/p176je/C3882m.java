package p176je;

import He.e;
import Xd.i;
import java.util.Collection;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p015ae.InterfaceC1788b;
import p464ze.f;

/* JADX INFO: renamed from: je.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3882m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C3882m f47356a = new C3882m();

    private C3882m() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean c(InterfaceC1788b it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return f47356a.d(it);
    }

    private final boolean e(InterfaceC1788b interfaceC1788b) {
        if (CollectionsKt.b0(C3879j.f47349a.c(), e.k(interfaceC1788b)) && interfaceC1788b.i().isEmpty()) {
            return true;
        }
        if (!i.h0(interfaceC1788b)) {
            return false;
        }
        Collection collectionE = interfaceC1788b.e();
        Intrinsics.checkNotNullExpressionValue(collectionE, "getOverriddenDescriptors(...)");
        Collection<InterfaceC1788b> collection = collectionE;
        if (collection.isEmpty()) {
            return false;
        }
        for (InterfaceC1788b interfaceC1788b2 : collection) {
            C3882m c3882m = f47356a;
            Intrinsics.c(interfaceC1788b2);
            if (c3882m.d(interfaceC1788b2)) {
                return true;
            }
        }
        return false;
    }

    public final String b(InterfaceC1788b interfaceC1788b) {
        f fVar;
        Intrinsics.checkNotNullParameter(interfaceC1788b, "<this>");
        i.h0(interfaceC1788b);
        InterfaceC1788b interfaceC1788bI = e.i(e.w(interfaceC1788b), false, C3881l.f47355a, 1, null);
        if (interfaceC1788bI == null || (fVar = (f) C3879j.f47349a.a().get(e.o(interfaceC1788bI))) == null) {
            return null;
        }
        return fVar.g();
    }

    public final boolean d(InterfaceC1788b callableMemberDescriptor) {
        Intrinsics.checkNotNullParameter(callableMemberDescriptor, "callableMemberDescriptor");
        if (C3879j.f47349a.d().contains(callableMemberDescriptor.getName())) {
            return e(callableMemberDescriptor);
        }
        return false;
    }
}
