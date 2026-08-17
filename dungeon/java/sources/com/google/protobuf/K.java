package com.google.protobuf;

/* JADX INFO: loaded from: classes2.dex */
final class K implements o0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final S f37822b = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final S f37823a;

    class a implements S {
        a() {
        }

        @Override // com.google.protobuf.S
        public Q a(Class cls) {
            throw new IllegalStateException("This should never be called.");
        }

        @Override // com.google.protobuf.S
        public boolean b(Class cls) {
            return false;
        }
    }

    static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f37824a;

        static {
            int[] iArr = new int[i0.values().length];
            f37824a = iArr;
            try {
                iArr[i0.PROTO3.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    private static class c implements S {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private S[] f37825a;

        c(S... sArr) {
            this.f37825a = sArr;
        }

        @Override // com.google.protobuf.S
        public Q a(Class cls) {
            for (S s10 : this.f37825a) {
                if (s10.b(cls)) {
                    return s10.a(cls);
                }
            }
            throw new UnsupportedOperationException("No factory is available for message type: " + cls.getName());
        }

        @Override // com.google.protobuf.S
        public boolean b(Class cls) {
            for (S s10 : this.f37825a) {
                if (s10.b(cls)) {
                    return true;
                }
            }
            return false;
        }
    }

    public K() {
        this(c());
    }

    private K(S s10) {
        this.f37823a = (S) A.b(s10, "messageInfoFactory");
    }

    private static boolean b(Q q10) {
        return b.f37824a[q10.c().ordinal()] != 1;
    }

    private static S c() {
        return new c(C3158y.c(), d());
    }

    private static S d() {
        try {
            return (S) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            return f37822b;
        }
    }

    private static n0 e(Class cls, Q q10) {
        if (GeneratedMessageLite.class.isAssignableFrom(cls)) {
            return b(q10) ? W.T(cls, q10, AbstractC3136c0.b(), I.b(), p0.L(), AbstractC3153t.b(), P.b()) : W.T(cls, q10, AbstractC3136c0.b(), I.b(), p0.L(), null, P.b());
        }
        return b(q10) ? W.T(cls, q10, AbstractC3136c0.a(), I.a(), p0.K(), AbstractC3153t.a(), P.a()) : W.T(cls, q10, AbstractC3136c0.a(), I.a(), p0.K(), null, P.a());
    }

    @Override // com.google.protobuf.o0
    public n0 a(Class cls) {
        p0.H(cls);
        Q qA = this.f37823a.a(cls);
        if (qA.a()) {
            return GeneratedMessageLite.class.isAssignableFrom(cls) ? X.m(p0.L(), AbstractC3153t.b(), qA.b()) : X.m(p0.K(), AbstractC3153t.a(), qA.b());
        }
        return e(cls, qA);
    }
}
