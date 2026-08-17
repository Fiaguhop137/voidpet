package p015ae;

/* JADX INFO: loaded from: classes3.dex */
public interface h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h0 f19733a = new a();

    static class a implements h0 {
        a() {
        }

        private static /* synthetic */ void d(int i10) {
            throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", "kotlin/reflect/jvm/internal/impl/descriptors/SourceElement$1", "getContainingFile"));
        }

        @Override // p015ae.h0
        public i0 b() {
            i0 i0Var = i0.f19734a;
            if (i0Var == null) {
                d(0);
            }
            return i0Var;
        }

        public String toString() {
            return "NO_SOURCE";
        }
    }

    i0 b();
}
