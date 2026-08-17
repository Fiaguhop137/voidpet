package p194ke;

import Re.S;
import java.util.Collections;
import java.util.List;
import p015ae.InterfaceC1788b;
import p015ae.InterfaceC1791e;
import p302qe.r;

/* JADX INFO: loaded from: classes3.dex */
public interface o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o f48113a = new a();

    static class a implements o {
        a() {
        }

        private static /* synthetic */ void c(int i10) {
            Object[] objArr = new Object[3];
            switch (i10) {
                case 1:
                    objArr[0] = "owner";
                    break;
                case 2:
                    objArr[0] = "returnType";
                    break;
                case 3:
                    objArr[0] = "valueParameters";
                    break;
                case 4:
                    objArr[0] = "typeParameters";
                    break;
                case 5:
                    objArr[0] = "descriptor";
                    break;
                case 6:
                    objArr[0] = "signatureErrors";
                    break;
                default:
                    objArr[0] = "method";
                    break;
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$1";
            if (i10 == 5 || i10 == 6) {
                objArr[2] = "reportSignatureErrors";
            } else {
                objArr[2] = "resolvePropagatedSignature";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // p194ke.o
        public void a(InterfaceC1788b interfaceC1788b, List list) {
            if (interfaceC1788b == null) {
                c(5);
            }
            if (list == null) {
                c(6);
            }
            throw new UnsupportedOperationException("Should not be called");
        }

        @Override // p194ke.o
        public b b(r rVar, InterfaceC1791e interfaceC1791e, S s10, S s11, List list, List list2) {
            if (rVar == null) {
                c(0);
            }
            if (interfaceC1791e == null) {
                c(1);
            }
            if (s10 == null) {
                c(2);
            }
            if (list == null) {
                c(3);
            }
            if (list2 == null) {
                c(4);
            }
            return new b(s10, s11, list, list2, Collections.EMPTY_LIST, false);
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final S f48114a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final S f48115b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final List f48116c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final List f48117d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final List f48118e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final boolean f48119f;

        public b(S s10, S s11, List list, List list2, List list3, boolean z10) {
            if (s10 == null) {
                a(0);
            }
            if (list == null) {
                a(1);
            }
            if (list2 == null) {
                a(2);
            }
            if (list3 == null) {
                a(3);
            }
            this.f48114a = s10;
            this.f48115b = s11;
            this.f48116c = list;
            this.f48117d = list2;
            this.f48118e = list3;
            this.f48119f = z10;
        }

        private static /* synthetic */ void a(int i10) {
            String str = (i10 == 4 || i10 == 5 || i10 == 6 || i10 == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i10 == 4 || i10 == 5 || i10 == 6 || i10 == 7) ? 2 : 3];
            switch (i10) {
                case 1:
                    objArr[0] = "valueParameters";
                    break;
                case 2:
                    objArr[0] = "typeParameters";
                    break;
                case 3:
                    objArr[0] = "signatureErrors";
                    break;
                case 4:
                case 5:
                case 6:
                case 7:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$PropagatedSignature";
                    break;
                default:
                    objArr[0] = "returnType";
                    break;
            }
            if (i10 == 4) {
                objArr[1] = "getReturnType";
            } else if (i10 == 5) {
                objArr[1] = "getValueParameters";
            } else if (i10 == 6) {
                objArr[1] = "getTypeParameters";
            } else if (i10 != 7) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$PropagatedSignature";
            } else {
                objArr[1] = "getErrors";
            }
            if (i10 != 4 && i10 != 5 && i10 != 6 && i10 != 7) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i10 != 4 && i10 != 5 && i10 != 6 && i10 != 7) {
                throw new IllegalArgumentException(str2);
            }
            throw new IllegalStateException(str2);
        }

        public List b() {
            List list = this.f48118e;
            if (list == null) {
                a(7);
            }
            return list;
        }

        public S c() {
            return this.f48115b;
        }

        public S d() {
            S s10 = this.f48114a;
            if (s10 == null) {
                a(4);
            }
            return s10;
        }

        public List e() {
            List list = this.f48117d;
            if (list == null) {
                a(6);
            }
            return list;
        }

        public List f() {
            List list = this.f48116c;
            if (list == null) {
                a(5);
            }
            return list;
        }

        public boolean g() {
            return this.f48119f;
        }
    }

    void a(InterfaceC1788b interfaceC1788b, List list);

    b b(r rVar, InterfaceC1791e interfaceC1791e, S s10, S s11, List list, List list2);
}
