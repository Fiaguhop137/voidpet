package com.google.android.play.core.integrity;

/* JADX INFO: loaded from: classes2.dex */
final class m extends IntegrityTokenRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f37276a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Long f37277b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f37278c = null;

    /* synthetic */ m(String str, Long l10, Object obj, p369u9.c cVar) {
        this.f37276a = str;
        this.f37277b = l10;
    }

    private static boolean c() {
        return true;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest
    public final Long a() {
        return this.f37277b;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest
    public final String b() {
        return this.f37276a;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0024  */
    public final boolean equals(Object obj) {
        boolean z10;
        Long l10;
        if (obj == this) {
            return true;
        }
        if (obj instanceof IntegrityTokenRequest) {
            IntegrityTokenRequest integrityTokenRequest = (IntegrityTokenRequest) obj;
            if (!this.f37276a.equals(integrityTokenRequest.b()) || ((l10 = this.f37277b) != null ? !l10.equals(integrityTokenRequest.a()) : integrityTokenRequest.a() != null)) {
                z10 = false;
            } else {
                z10 = true;
            }
        } else {
            z10 = false;
        }
        if (!(obj instanceof m) || !c()) {
            return z10;
        }
        m mVar = (m) obj;
        if (!z10) {
            return false;
        }
        Object obj2 = mVar.f37278c;
        return true;
    }

    public final int hashCode() {
        int iHashCode = this.f37276a.hashCode() ^ 1000003;
        Long l10 = this.f37277b;
        int iHashCode2 = (iHashCode * 1000003) ^ (l10 == null ? 0 : l10.hashCode());
        return c() ? iHashCode2 * 1000003 : iHashCode2;
    }

    public final String toString() {
        String strConcat = "IntegrityTokenRequest{nonce=" + this.f37276a + ", cloudProjectNumber=" + this.f37277b;
        if (c()) {
            strConcat = strConcat.concat(", network=null");
        }
        return strConcat.concat("}");
    }
}
