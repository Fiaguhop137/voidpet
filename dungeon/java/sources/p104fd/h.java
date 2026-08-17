package p104fd;

import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p050cd.n;
import p050cd.o;

/* JADX INFO: loaded from: classes3.dex */
public final class h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f41864d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f41865a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f41866b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c f41867c;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final h a(String signatureHeader) throws Exception {
            Intrinsics.checkNotNullParameter(signatureHeader, "signatureHeader");
            Map map = new n(signatureHeader).B().get();
            p050cd.h hVar = (p050cd.h) map.get("sig");
            p050cd.h hVar2 = (p050cd.h) map.get("keyid");
            p050cd.h hVar3 = (p050cd.h) map.get("alg");
            if (!(hVar instanceof o)) {
                throw new Exception("Structured field sig not found in expo-signature header");
            }
            String str = ((o) hVar).get();
            String str2 = hVar2 instanceof o ? ((o) hVar2).get() : "root";
            String str3 = hVar3 instanceof o ? ((o) hVar3).get() : null;
            Intrinsics.c(str);
            Intrinsics.c(str2);
            return new h(str, str2, c.f41848b.a(str3));
        }
    }

    public h(String signature, String keyId, c algorithm) {
        Intrinsics.checkNotNullParameter(signature, "signature");
        Intrinsics.checkNotNullParameter(keyId, "keyId");
        Intrinsics.checkNotNullParameter(algorithm, "algorithm");
        this.f41865a = signature;
        this.f41866b = keyId;
        this.f41867c = algorithm;
    }

    public final c a() {
        return this.f41867c;
    }

    public final String b() {
        return this.f41866b;
    }

    public final String c() {
        return this.f41865a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return Intrinsics.b(this.f41865a, hVar.f41865a) && Intrinsics.b(this.f41866b, hVar.f41866b) && this.f41867c == hVar.f41867c;
    }

    public int hashCode() {
        return (((this.f41865a.hashCode() * 31) + this.f41866b.hashCode()) * 31) + this.f41867c.hashCode();
    }

    public String toString() {
        return "SignatureHeaderInfo(signature=" + this.f41865a + ", keyId=" + this.f41866b + ", algorithm=" + this.f41867c + ")";
    }
}
