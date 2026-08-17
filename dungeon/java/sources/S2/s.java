package S2;

import C9.AbstractC0876t;
import U1.InterfaceC1470l;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public interface s {

    public interface a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f11528a = new C0169a();

        /* JADX INFO: renamed from: S2.s$a$a, reason: collision with other inner class name */
        class C0169a implements a {
            C0169a() {
            }

            @Override // S2.s.a
            public boolean a(R1.r rVar) {
                return false;
            }

            @Override // S2.s.a
            public int b(R1.r rVar) {
                return 1;
            }

            @Override // S2.s.a
            public s c(R1.r rVar) {
                throw new IllegalStateException("This SubtitleParser.Factory doesn't support any formats.");
            }
        }

        boolean a(R1.r rVar);

        int b(R1.r rVar);

        s c(R1.r rVar);
    }

    public static class b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final b f11529c = new b(-9223372036854775807L, false);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f11530a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f11531b;

        private b(long j10, boolean z10) {
            this.f11530a = j10;
            this.f11531b = z10;
        }

        public static b b() {
            return f11529c;
        }

        public static b c(long j10) {
            return new b(j10, true);
        }
    }

    default k a(byte[] bArr, int i10, int i11) {
        AbstractC0876t.a aVarL = AbstractC0876t.l();
        b bVar = b.f11529c;
        Objects.requireNonNull(aVarL);
        b(bArr, i10, i11, bVar, new r(aVarL));
        return new g(aVarL.k());
    }

    void b(byte[] bArr, int i10, int i11, b bVar, InterfaceC1470l interfaceC1470l);

    int c();

    default void reset() {
    }
}
