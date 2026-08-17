package Xa;

import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Xa.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC1634e {
    Unspecified("unspecified"),
    UserChoiceBilling("user-choice-billing"),
    ExternalContentLink("external-content-link"),
    ExternalOffer("external-offer"),
    ExternalPayments("external-payments");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f16010a;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f16009i = Gd.a.a(e());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f16002b = new a(null);

    /* JADX INFO: renamed from: Xa.e$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public final EnumC1634e a(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            switch (value.hashCode()) {
                case -1797848176:
                    if (value.equals("external-content-link")) {
                        return EnumC1634e.ExternalContentLink;
                    }
                    break;
                case -1626174665:
                    if (value.equals("unspecified")) {
                        return EnumC1634e.Unspecified;
                    }
                    break;
                case -1555411494:
                    if (value.equals("external-offer")) {
                        return EnumC1634e.ExternalOffer;
                    }
                    break;
                case -1005305105:
                    if (value.equals("external-payments")) {
                        return EnumC1634e.ExternalPayments;
                    }
                    break;
                case 41693975:
                    if (value.equals("Unspecified")) {
                        return EnumC1634e.Unspecified;
                    }
                    break;
                case 446743336:
                    if (value.equals("ExternalContentLink")) {
                        return EnumC1634e.ExternalContentLink;
                    }
                    break;
                case 570112879:
                    if (value.equals("UserChoiceBilling")) {
                        return EnumC1634e.UserChoiceBilling;
                    }
                    break;
                case 779918641:
                    if (value.equals("ExternalOffer")) {
                        return EnumC1634e.ExternalOffer;
                    }
                    break;
                case 926254225:
                    if (value.equals("user-choice-billing")) {
                        return EnumC1634e.UserChoiceBilling;
                    }
                    break;
                case 934486072:
                    if (value.equals("ExternalPayments")) {
                        return EnumC1634e.ExternalPayments;
                    }
                    break;
            }
            throw new IllegalArgumentException("Unknown BillingProgramAndroid value: " + value);
        }
    }

    EnumC1634e(String str) {
        this.f16010a = str;
    }
}
