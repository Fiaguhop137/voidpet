package Ne;

import java.util.List;
import p015ae.InterfaceC1788b;
import p015ae.InterfaceC1791e;

/* JADX INFO: renamed from: Ne.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC1248w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final InterfaceC1248w f8220a = new a();

    /* JADX INFO: renamed from: Ne.w$a */
    static class a implements InterfaceC1248w {
        a() {
        }

        private static /* synthetic */ void c(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "descriptor";
            } else {
                objArr[0] = "unresolvedSuperClasses";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/serialization/deserialization/ErrorReporter$1";
            if (i10 != 2) {
                objArr[2] = "reportIncompleteHierarchy";
            } else {
                objArr[2] = "reportCannotInferVisibility";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // Ne.InterfaceC1248w
        public void a(InterfaceC1788b interfaceC1788b) {
            if (interfaceC1788b == null) {
                c(2);
            }
        }

        @Override // Ne.InterfaceC1248w
        public void b(InterfaceC1791e interfaceC1791e, List list) {
            if (interfaceC1791e == null) {
                c(0);
            }
            if (list == null) {
                c(1);
            }
        }
    }

    void a(InterfaceC1788b interfaceC1788b);

    void b(InterfaceC1791e interfaceC1791e, List list);
}
