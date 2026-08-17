package p104fd;

import Ad.j;
import Ad.v;
import android.util.Base64;
import android.util.Log;
import java.security.Signature;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.collections.CollectionsKt;
import kotlin.collections.N;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p050cd.d;
import p050cd.o;

/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f41855g = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f41856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f41857b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f41858c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f41859d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Lazy f41860e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Lazy f41861f;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final List a(String certificateChainInManifestResponse) {
            Intrinsics.checkNotNullParameter(certificateChainInManifestResponse, "certificateChainInManifestResponse");
            ArrayList arrayList = new ArrayList();
            int i10 = 0;
            while (true) {
                String str = certificateChainInManifestResponse;
                int iH0 = StringsKt.h0(str, "-----BEGIN CERTIFICATE-----", i10, false, 4, null);
                int iH1 = StringsKt.h0(str, "-----END CERTIFICATE-----", i10, false, 4, null);
                if (iH0 == -1 || iH1 == -1) {
                    break;
                }
                i10 = iH1 + 25;
                String strSubstring = str.substring(iH0, i10);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
                arrayList.add(strSubstring);
                certificateChainInManifestResponse = str;
            }
            return arrayList;
        }
    }

    public f(String embeddedCertificateString, Map map, boolean z10, boolean z11) {
        Intrinsics.checkNotNullParameter(embeddedCertificateString, "embeddedCertificateString");
        this.f41856a = embeddedCertificateString;
        this.f41857b = map;
        this.f41858c = z10;
        this.f41859d = z11;
        this.f41860e = j.b(new d(this));
        this.f41861f = j.b(new e(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final c c(f fVar) {
        c.a aVar = c.f41848b;
        Map map = fVar.f41857b;
        return aVar.a(map != null ? (String) map.get("alg") : null);
    }

    private final c e() {
        return (c) this.f41860e.getValue();
    }

    private final String f() {
        return (String) this.f41861f.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String g(f fVar) {
        String str;
        Map map = fVar.f41857b;
        return (map == null || (str = (String) map.get("keyid")) == null) ? "root" : str;
    }

    private final i i(h hVar, byte[] bArr, String str) throws Exception {
        b bVar;
        if (this.f41858c) {
            a aVar = f41855g;
            if (str == null) {
                str = "";
            }
            bVar = new b(CollectionsKt.D0(aVar.a(str), this.f41856a));
        } else {
            if (!Intrinsics.b(hVar.b(), f())) {
                throw new Exception("Key with keyid=" + hVar.b() + " from signature not found in client configuration");
            }
            if (hVar.a() != e()) {
                Log.i("CodeSigning", "Key with alg=" + hVar.a() + " from signature does not match client configuration algorithm, continuing");
            }
            bVar = new b(CollectionsKt.e(this.f41856a));
        }
        Signature signature = Signature.getInstance("SHA256withRSA");
        signature.initVerify(bVar.c().getPublicKey());
        signature.update(bArr);
        return new i(signature.verify(Base64.decode(hVar.c(), 0)) ? j.VALID : j.INVALID, b.f41845c.e(bVar.c()));
    }

    public final String d() {
        String strE = d.f(N.l(v.a("sig", p050cd.a.e(true)), v.a("keyid", o.f(f())), v.a("alg", o.f(e().g())))).e();
        Intrinsics.checkNotNullExpressionValue(strE, "serialize(...)");
        return strE;
    }

    public final i h(String str, byte[] bodyBytes, String str2) throws Exception {
        Intrinsics.checkNotNullParameter(bodyBytes, "bodyBytes");
        if (str != null) {
            return i(h.f41864d.a(str), bodyBytes, str2);
        }
        if (this.f41859d) {
            return new i(j.SKIPPED, null);
        }
        throw new Exception("No expo-signature header specified");
    }
}
