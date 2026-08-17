package Xa;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class s0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f16176i = new a(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f16177j = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Boolean f16178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f16179b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f16180c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f16181d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Integer f16182e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List f16183f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List f16184g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final D0 f16185h;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public s0(AbstractC1644j abstractC1644j, Boolean bool, String str, String str2, String str3, Integer num, List skus, List list, D0 d10) {
        Intrinsics.checkNotNullParameter(skus, "skus");
        this.f16178a = bool;
        this.f16179b = str;
        this.f16180c = str2;
        this.f16181d = str3;
        this.f16182e = num;
        this.f16183f = skus;
        this.f16184g = list;
        this.f16185h = d10;
    }

    public /* synthetic */ s0(AbstractC1644j abstractC1644j, Boolean bool, String str, String str2, String str3, Integer num, List list, List list2, D0 d10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : abstractC1644j, (i10 & 2) != 0 ? null : bool, (i10 & 4) != 0 ? null : str, (i10 & 8) != 0 ? null : str2, (i10 & 16) != 0 ? null : str3, (i10 & 32) != 0 ? null : num, list, (i10 & 128) != 0 ? null : list2, (i10 & 256) != 0 ? null : d10);
    }

    public final AbstractC1644j a() {
        return null;
    }

    public final String b() {
        return this.f16179b;
    }

    public final String c() {
        return this.f16180c;
    }

    public final String d() {
        return this.f16181d;
    }

    public final Integer e() {
        return this.f16182e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s0)) {
            return false;
        }
        s0 s0Var = (s0) obj;
        s0Var.getClass();
        return Intrinsics.b(null, null) && Intrinsics.b(this.f16178a, s0Var.f16178a) && Intrinsics.b(this.f16179b, s0Var.f16179b) && Intrinsics.b(this.f16180c, s0Var.f16180c) && Intrinsics.b(this.f16181d, s0Var.f16181d) && Intrinsics.b(this.f16182e, s0Var.f16182e) && Intrinsics.b(this.f16183f, s0Var.f16183f) && Intrinsics.b(this.f16184g, s0Var.f16184g) && Intrinsics.b(this.f16185h, s0Var.f16185h);
    }

    public final List f() {
        return this.f16183f;
    }

    public final List g() {
        return this.f16184g;
    }

    public final D0 h() {
        return this.f16185h;
    }

    public int hashCode() {
        Boolean bool = this.f16178a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.f16179b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f16180c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f16181d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.f16182e;
        int iHashCode5 = (((iHashCode4 + (num == null ? 0 : num.hashCode())) * 31) + this.f16183f.hashCode()) * 31;
        List list = this.f16184g;
        int iHashCode6 = (iHashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        D0 d10 = this.f16185h;
        return iHashCode6 + (d10 != null ? d10.hashCode() : 0);
    }

    public final Boolean i() {
        return this.f16178a;
    }

    public String toString() {
        return "RequestSubscriptionAndroidProps(developerBillingOption=" + ((Object) null) + ", isOfferPersonalized=" + this.f16178a + ", obfuscatedAccountId=" + this.f16179b + ", obfuscatedProfileId=" + this.f16180c + ", purchaseToken=" + this.f16181d + ", replacementMode=" + this.f16182e + ", skus=" + this.f16183f + ", subscriptionOffers=" + this.f16184g + ", subscriptionProductReplacementParams=" + this.f16185h + ")";
    }
}
