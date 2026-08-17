package p142hf;

/* JADX INFO: loaded from: classes3.dex */
public interface D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f42871a = a.f42872a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f42872a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final D f42873b = new E();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final D f42874c = new F();

        private a() {
        }

        public static /* synthetic */ D b(a aVar, long j10, long j11, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                j10 = 0;
            }
            if ((i10 & 2) != 0) {
                j11 = Long.MAX_VALUE;
            }
            return aVar.a(j10, j11);
        }

        public final D a(long j10, long j11) {
            return new G(j10, j11);
        }

        public final D c() {
            return f42873b;
        }

        public final D d() {
            return f42874c;
        }
    }

    InterfaceC3564c a(H h10);
}
