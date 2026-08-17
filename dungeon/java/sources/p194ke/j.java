package p194ke;

import p015ae.InterfaceC1791e;
import p015ae.InterfaceC1798l;
import p015ae.Z;
import p015ae.g0;
import p302qe.g;
import p302qe.l;
import p302qe.n;
import p302qe.q;
import p464ze.c;

/* JADX INFO: loaded from: classes3.dex */
public interface j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f48106a = new a();

    static class a implements j {
        a() {
        }

        private static /* synthetic */ void f(int i10) {
            Object[] objArr = new Object[3];
            switch (i10) {
                case 1:
                    objArr[0] = "member";
                    break;
                case 2:
                case 4:
                case 6:
                case 8:
                    objArr[0] = "descriptor";
                    break;
                case 3:
                    objArr[0] = "element";
                    break;
                case 5:
                    objArr[0] = "field";
                    break;
                case 7:
                    objArr[0] = "javaClass";
                    break;
                default:
                    objArr[0] = "fqName";
                    break;
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/JavaResolverCache$1";
            switch (i10) {
                case 1:
                case 2:
                    objArr[2] = "recordMethod";
                    break;
                case 3:
                case 4:
                    objArr[2] = "recordConstructor";
                    break;
                case 5:
                case 6:
                    objArr[2] = "recordField";
                    break;
                case 7:
                case 8:
                    objArr[2] = "recordClass";
                    break;
                default:
                    objArr[2] = "getClassResolvedFromSource";
                    break;
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // p194ke.j
        public void a(n nVar, Z z10) {
            if (nVar == null) {
                f(5);
            }
            if (z10 == null) {
                f(6);
            }
        }

        @Override // p194ke.j
        public InterfaceC1791e b(c cVar) {
            if (cVar != null) {
                return null;
            }
            f(0);
            return null;
        }

        @Override // p194ke.j
        public void c(g gVar, InterfaceC1791e interfaceC1791e) {
            if (gVar == null) {
                f(7);
            }
            if (interfaceC1791e == null) {
                f(8);
            }
        }

        @Override // p194ke.j
        public void d(q qVar, g0 g0Var) {
            if (qVar == null) {
                f(1);
            }
            if (g0Var == null) {
                f(2);
            }
        }

        @Override // p194ke.j
        public void e(l lVar, InterfaceC1798l interfaceC1798l) {
            if (lVar == null) {
                f(3);
            }
            if (interfaceC1798l == null) {
                f(4);
            }
        }
    }

    void a(n nVar, Z z10);

    InterfaceC1791e b(c cVar);

    void c(g gVar, InterfaceC1791e interfaceC1791e);

    void d(q qVar, g0 g0Var);

    void e(l lVar, InterfaceC1798l interfaceC1798l);
}
