package Ce;

import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p015ae.InterfaceC1791e;
import p015ae.InterfaceC1794h;
import p015ae.InterfaceC1799m;
import p015ae.N;
import p015ae.m0;

/* JADX INFO: renamed from: Ce.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC0906b {

    /* JADX INFO: renamed from: Ce.b$a */
    public static final class a implements InterfaceC0906b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f1864a = new a();

        private a() {
        }

        @Override // Ce.InterfaceC0906b
        public String a(InterfaceC1794h classifier, n renderer) {
            Intrinsics.checkNotNullParameter(classifier, "classifier");
            Intrinsics.checkNotNullParameter(renderer, "renderer");
            if (classifier instanceof m0) {
                p464ze.f name = ((m0) classifier).getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                return renderer.R(name, false);
            }
            p464ze.d dVarM = De.i.m(classifier);
            Intrinsics.checkNotNullExpressionValue(dVarM, "getFqName(...)");
            return renderer.Q(dVarM);
        }
    }

    /* JADX INFO: renamed from: Ce.b$b, reason: collision with other inner class name */
    public static final class C0040b implements InterfaceC0906b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0040b f1865a = new C0040b();

        private C0040b() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v0, types: [ae.h, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r2v1, types: [ae.J, ae.m] */
        /* JADX WARN: Type inference failed for: r2v2, types: [ae.m] */
        @Override // Ce.InterfaceC0906b
        public String a(InterfaceC1794h classifier, n renderer) {
            Intrinsics.checkNotNullParameter(classifier, "classifier");
            Intrinsics.checkNotNullParameter(renderer, "renderer");
            if (classifier instanceof m0) {
                p464ze.f name = ((m0) classifier).getName();
                Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
                return renderer.R(name, false);
            }
            ArrayList arrayList = new ArrayList();
            do {
                arrayList.add(classifier.getName());
                classifier = classifier.b();
            } while (classifier instanceof InterfaceC1791e);
            return G.c(CollectionsKt.S(arrayList));
        }
    }

    /* JADX INFO: renamed from: Ce.b$c */
    public static final class c implements InterfaceC0906b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f1866a = new c();

        private c() {
        }

        private final String b(InterfaceC1794h interfaceC1794h) {
            p464ze.f name = interfaceC1794h.getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            String strB = G.b(name);
            if (interfaceC1794h instanceof m0) {
                return strB;
            }
            InterfaceC1799m interfaceC1799mB = interfaceC1794h.b();
            Intrinsics.checkNotNullExpressionValue(interfaceC1799mB, "getContainingDeclaration(...)");
            String strC = c(interfaceC1799mB);
            if (strC == null || Intrinsics.b(strC, "")) {
                return strB;
            }
            return strC + '.' + strB;
        }

        private final String c(InterfaceC1799m interfaceC1799m) {
            if (interfaceC1799m instanceof InterfaceC1791e) {
                return b((InterfaceC1794h) interfaceC1799m);
            }
            if (interfaceC1799m instanceof N) {
                return G.a(((N) interfaceC1799m).f().i());
            }
            return null;
        }

        @Override // Ce.InterfaceC0906b
        public String a(InterfaceC1794h classifier, n renderer) {
            Intrinsics.checkNotNullParameter(classifier, "classifier");
            Intrinsics.checkNotNullParameter(renderer, "renderer");
            return b(classifier);
        }
    }

    String a(InterfaceC1794h interfaceC1794h, n nVar);
}
