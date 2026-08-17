package p104fd;

import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public enum c {
    RSA_SHA256("rsa-v1_5-sha256");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f41852a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f41851e = Gd.a.a(e());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f41848b = new a(null);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final c a(String str) throws Exception {
            c cVar = c.RSA_SHA256;
            if (Intrinsics.b(str, cVar.g()) || str == null) {
                return cVar;
            }
            throw new Exception("Invalid code signing algorithm name: " + str);
        }
    }

    c(String str) {
        this.f41852a = str;
    }

    public final String g() {
        return this.f41852a;
    }
}
