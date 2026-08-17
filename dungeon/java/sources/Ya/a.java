package Ya;

import Xa.AbstractC1644j;
import Xa.D0;
import Xa.V;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f17720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Boolean f17721b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f17722c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f17723d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f17724e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f17725f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Integer f17726g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List f17727h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final D0 f17728i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final V f17729j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Boolean f17730k;

    public a(List skus, Boolean bool, String str, String str2, String str3, String str4, Integer num, List list, D0 d10, AbstractC1644j abstractC1644j, V type, Boolean bool2) {
        Intrinsics.checkNotNullParameter(skus, "skus");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f17720a = skus;
        this.f17721b = bool;
        this.f17722c = str;
        this.f17723d = str2;
        this.f17724e = str3;
        this.f17725f = str4;
        this.f17726g = num;
        this.f17727h = list;
        this.f17728i = d10;
        this.f17729j = type;
        this.f17730k = bool2;
    }

    public final AbstractC1644j a() {
        return null;
    }

    public final String b() {
        return this.f17722c;
    }

    public final String c() {
        return this.f17723d;
    }

    public final String d() {
        return this.f17724e;
    }

    public final String e() {
        return this.f17725f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.b(this.f17720a, aVar.f17720a) && Intrinsics.b(this.f17721b, aVar.f17721b) && Intrinsics.b(this.f17722c, aVar.f17722c) && Intrinsics.b(this.f17723d, aVar.f17723d) && Intrinsics.b(this.f17724e, aVar.f17724e) && Intrinsics.b(this.f17725f, aVar.f17725f) && Intrinsics.b(this.f17726g, aVar.f17726g) && Intrinsics.b(this.f17727h, aVar.f17727h) && Intrinsics.b(this.f17728i, aVar.f17728i) && Intrinsics.b(null, null) && this.f17729j == aVar.f17729j && Intrinsics.b(this.f17730k, aVar.f17730k);
    }

    public final Integer f() {
        return this.f17726g;
    }

    public final List g() {
        return this.f17720a;
    }

    public final List h() {
        return this.f17727h;
    }

    public int hashCode() {
        int iHashCode = this.f17720a.hashCode() * 31;
        Boolean bool = this.f17721b;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.f17722c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f17723d;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f17724e;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f17725f;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.f17726g;
        int iHashCode7 = (iHashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        List list = this.f17727h;
        int iHashCode8 = (iHashCode7 + (list == null ? 0 : list.hashCode())) * 31;
        D0 d10 = this.f17728i;
        int iHashCode9 = (((iHashCode8 + (d10 == null ? 0 : d10.hashCode())) * 961) + this.f17729j.hashCode()) * 31;
        Boolean bool2 = this.f17730k;
        return iHashCode9 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final D0 i() {
        return this.f17728i;
    }

    public final V j() {
        return this.f17729j;
    }

    public final Boolean k() {
        return this.f17730k;
    }

    public final Boolean l() {
        return this.f17721b;
    }

    public String toString() {
        return "AndroidPurchaseArgs(skus=" + this.f17720a + ", isOfferPersonalized=" + this.f17721b + ", obfuscatedAccountId=" + this.f17722c + ", obfuscatedProfileId=" + this.f17723d + ", offerToken=" + this.f17724e + ", purchaseToken=" + this.f17725f + ", replacementMode=" + this.f17726g + ", subscriptionOffers=" + this.f17727h + ", subscriptionProductReplacementParams=" + this.f17728i + ", developerBillingOption=" + ((Object) null) + ", type=" + this.f17729j + ", useAlternativeBilling=" + this.f17730k + ")";
    }
}
