package p339sf;

import java.io.IOException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public enum B {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic");


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f53718b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f53726a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final B a(String protocol) throws IOException {
            Intrinsics.checkNotNullParameter(protocol, "protocol");
            B b10 = B.HTTP_1_0;
            if (Intrinsics.b(protocol, b10.f53726a)) {
                return b10;
            }
            B b11 = B.HTTP_1_1;
            if (Intrinsics.b(protocol, b11.f53726a)) {
                return b11;
            }
            B b12 = B.H2_PRIOR_KNOWLEDGE;
            if (Intrinsics.b(protocol, b12.f53726a)) {
                return b12;
            }
            B b13 = B.HTTP_2;
            if (Intrinsics.b(protocol, b13.f53726a)) {
                return b13;
            }
            B b14 = B.SPDY_3;
            if (Intrinsics.b(protocol, b14.f53726a)) {
                return b14;
            }
            B b15 = B.QUIC;
            if (Intrinsics.b(protocol, b15.f53726a)) {
                return b15;
            }
            throw new IOException("Unexpected protocol: " + protocol);
        }
    }

    B(String str) {
        this.f53726a = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f53726a;
    }
}
