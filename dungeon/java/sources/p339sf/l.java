package p339sf;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p375uf.e;

/* JADX INFO: loaded from: classes3.dex */
public final class l {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f53994e = new b(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final C4190i[] f53995f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final C4190i[] f53996g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final l f53997h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final l f53998i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final l f53999j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final l f54000k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f54001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f54002b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String[] f54003c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String[] f54004d;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f54005a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String[] f54006b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String[] f54007c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f54008d;

        public a(l connectionSpec) {
            Intrinsics.checkNotNullParameter(connectionSpec, "connectionSpec");
            this.f54005a = connectionSpec.f();
            this.f54006b = connectionSpec.f54003c;
            this.f54007c = connectionSpec.f54004d;
            this.f54008d = connectionSpec.h();
        }

        public a(boolean z10) {
            this.f54005a = z10;
        }

        public final l a() {
            return new l(this.f54005a, this.f54008d, this.f54006b, this.f54007c);
        }

        public final a b(String... cipherSuites) {
            Intrinsics.checkNotNullParameter(cipherSuites, "cipherSuites");
            if (!this.f54005a) {
                throw new IllegalArgumentException("no cipher suites for cleartext connections");
            }
            if (cipherSuites.length == 0) {
                throw new IllegalArgumentException("At least one cipher suite is required");
            }
            this.f54006b = (String[]) cipherSuites.clone();
            return this;
        }

        public final a c(C4190i... cipherSuites) {
            Intrinsics.checkNotNullParameter(cipherSuites, "cipherSuites");
            if (!this.f54005a) {
                throw new IllegalArgumentException("no cipher suites for cleartext connections");
            }
            ArrayList arrayList = new ArrayList(cipherSuites.length);
            for (C4190i c4190i : cipherSuites) {
                arrayList.add(c4190i.c());
            }
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            return b((String[]) Arrays.copyOf(strArr, strArr.length));
        }

        public final a d(boolean z10) {
            if (!this.f54005a) {
                throw new IllegalArgumentException("no TLS extensions for cleartext connections");
            }
            this.f54008d = z10;
            return this;
        }

        public final a e(String... tlsVersions) {
            Intrinsics.checkNotNullParameter(tlsVersions, "tlsVersions");
            if (!this.f54005a) {
                throw new IllegalArgumentException("no TLS versions for cleartext connections");
            }
            if (tlsVersions.length == 0) {
                throw new IllegalArgumentException("At least one TLS version is required");
            }
            this.f54007c = (String[]) tlsVersions.clone();
            return this;
        }

        public final a f(H... tlsVersions) {
            Intrinsics.checkNotNullParameter(tlsVersions, "tlsVersions");
            if (!this.f54005a) {
                throw new IllegalArgumentException("no TLS versions for cleartext connections");
            }
            ArrayList arrayList = new ArrayList(tlsVersions.length);
            for (H h10 : tlsVersions) {
                arrayList.add(h10.g());
            }
            String[] strArr = (String[]) arrayList.toArray(new String[0]);
            return e((String[]) Arrays.copyOf(strArr, strArr.length));
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        C4190i c4190i = C4190i.f53965o1;
        C4190i c4190i2 = C4190i.f53968p1;
        C4190i c4190i3 = C4190i.f53971q1;
        C4190i c4190i4 = C4190i.f53923a1;
        C4190i c4190i5 = C4190i.f53935e1;
        C4190i c4190i6 = C4190i.f53926b1;
        C4190i c4190i7 = C4190i.f53938f1;
        C4190i c4190i8 = C4190i.f53956l1;
        C4190i c4190i9 = C4190i.f53953k1;
        C4190i[] c4190iArr = {c4190i, c4190i2, c4190i3, c4190i4, c4190i5, c4190i6, c4190i7, c4190i8, c4190i9};
        f53995f = c4190iArr;
        C4190i[] c4190iArr2 = {c4190i, c4190i2, c4190i3, c4190i4, c4190i5, c4190i6, c4190i7, c4190i8, c4190i9, C4190i.f53893L0, C4190i.f53895M0, C4190i.f53949j0, C4190i.f53952k0, C4190i.f53884H, C4190i.f53892L, C4190i.f53954l};
        f53996g = c4190iArr2;
        a aVarC = new a(true).c((C4190i[]) Arrays.copyOf(c4190iArr, c4190iArr.length));
        H h10 = H.TLS_1_3;
        H h11 = H.TLS_1_2;
        f53997h = aVarC.f(h10, h11).d(true).a();
        f53998i = new a(true).c((C4190i[]) Arrays.copyOf(c4190iArr2, c4190iArr2.length)).f(h10, h11).d(true).a();
        f53999j = new a(true).c((C4190i[]) Arrays.copyOf(c4190iArr2, c4190iArr2.length)).f(h10, h11, H.TLS_1_1, H.TLS_1_0).d(true).a();
        f54000k = new a(false).a();
    }

    public l(boolean z10, boolean z11, String[] strArr, String[] strArr2) {
        this.f54001a = z10;
        this.f54002b = z11;
        this.f54003c = strArr;
        this.f54004d = strArr2;
    }

    private final l g(SSLSocket sSLSocket, boolean z10) {
        String[] cipherSuitesIntersection;
        String[] tlsVersionsIntersection;
        if (this.f54003c != null) {
            String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
            Intrinsics.checkNotNullExpressionValue(enabledCipherSuites, "sslSocket.enabledCipherSuites");
            cipherSuitesIntersection = e.E(enabledCipherSuites, this.f54003c, C4190i.f53924b.c());
        } else {
            cipherSuitesIntersection = sSLSocket.getEnabledCipherSuites();
        }
        if (this.f54004d != null) {
            String[] enabledProtocols = sSLSocket.getEnabledProtocols();
            Intrinsics.checkNotNullExpressionValue(enabledProtocols, "sslSocket.enabledProtocols");
            tlsVersionsIntersection = e.E(enabledProtocols, this.f54004d, Cd.a.f());
        } else {
            tlsVersionsIntersection = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        Intrinsics.checkNotNullExpressionValue(supportedCipherSuites, "supportedCipherSuites");
        int iX = e.x(supportedCipherSuites, "TLS_FALLBACK_SCSV", C4190i.f53924b.c());
        if (z10 && iX != -1) {
            Intrinsics.checkNotNullExpressionValue(cipherSuitesIntersection, "cipherSuitesIntersection");
            String str = supportedCipherSuites[iX];
            Intrinsics.checkNotNullExpressionValue(str, "supportedCipherSuites[indexOfFallbackScsv]");
            cipherSuitesIntersection = e.o(cipherSuitesIntersection, str);
        }
        a aVar = new a(this);
        Intrinsics.checkNotNullExpressionValue(cipherSuitesIntersection, "cipherSuitesIntersection");
        a aVarB = aVar.b((String[]) Arrays.copyOf(cipherSuitesIntersection, cipherSuitesIntersection.length));
        Intrinsics.checkNotNullExpressionValue(tlsVersionsIntersection, "tlsVersionsIntersection");
        return aVarB.e((String[]) Arrays.copyOf(tlsVersionsIntersection, tlsVersionsIntersection.length)).a();
    }

    public final void c(SSLSocket sslSocket, boolean z10) {
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        l lVarG = g(sslSocket, z10);
        if (lVarG.i() != null) {
            sslSocket.setEnabledProtocols(lVarG.f54004d);
        }
        if (lVarG.d() != null) {
            sslSocket.setEnabledCipherSuites(lVarG.f54003c);
        }
    }

    public final List d() {
        String[] strArr = this.f54003c;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(C4190i.f53924b.b(str));
        }
        return CollectionsKt.U0(arrayList);
    }

    public final boolean e(SSLSocket socket) {
        Intrinsics.checkNotNullParameter(socket, "socket");
        if (!this.f54001a) {
            return false;
        }
        String[] strArr = this.f54004d;
        if (strArr != null && !e.u(strArr, socket.getEnabledProtocols(), Cd.a.f())) {
            return false;
        }
        String[] strArr2 = this.f54003c;
        return strArr2 == null || e.u(strArr2, socket.getEnabledCipherSuites(), C4190i.f53924b.c());
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof l)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        boolean z10 = this.f54001a;
        l lVar = (l) obj;
        if (z10 != lVar.f54001a) {
            return false;
        }
        return !z10 || (Arrays.equals(this.f54003c, lVar.f54003c) && Arrays.equals(this.f54004d, lVar.f54004d) && this.f54002b == lVar.f54002b);
    }

    public final boolean f() {
        return this.f54001a;
    }

    public final boolean h() {
        return this.f54002b;
    }

    public int hashCode() {
        if (!this.f54001a) {
            return 17;
        }
        String[] strArr = this.f54003c;
        int iHashCode = (527 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
        String[] strArr2 = this.f54004d;
        return ((iHashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.f54002b ? 1 : 0);
    }

    public final List i() {
        String[] strArr = this.f54004d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(H.f53781b.a(str));
        }
        return CollectionsKt.U0(arrayList);
    }

    public String toString() {
        if (!this.f54001a) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + Objects.toString(d(), "[all enabled]") + ", tlsVersions=" + Objects.toString(i(), "[all enabled]") + ", supportsTlsExtensions=" + this.f54002b + ')';
    }
}
