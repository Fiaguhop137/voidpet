package Xa;

import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Xa.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC1663x {
    Entitled("entitled"),
    PendingAcknowledgment("pending-acknowledgment"),
    Pending("pending"),
    Canceled("canceled"),
    Expired("expired"),
    ReadyToConsume("ready-to-consume"),
    Consumed("consumed"),
    Unknown("unknown"),
    Inauthentic("inauthentic");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f16222a;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f16221m = Gd.a.a(e());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f16210b = new a(null);

    /* JADX INFO: renamed from: Xa.x$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public final EnumC1663x a(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            switch (value.hashCode()) {
                case -2102111499:
                    if (value.equals("entitled")) {
                        return EnumC1663x.Entitled;
                    }
                    break;
                case -2037467371:
                    if (value.equals("Entitled")) {
                        return EnumC1663x.Entitled;
                    }
                    break;
                case -1510374114:
                    if (value.equals("PendingAcknowledgment")) {
                        return EnumC1663x.PendingAcknowledgment;
                    }
                    break;
                case -1309235419:
                    if (value.equals("expired")) {
                        return EnumC1663x.Expired;
                    }
                    break;
                case -1003813128:
                    if (value.equals("Inauthentic")) {
                        return EnumC1663x.Inauthentic;
                    }
                    break;
                case -1002383683:
                    if (value.equals("pending-acknowledgment")) {
                        return EnumC1663x.PendingAcknowledgment;
                    }
                    break;
                case -682587753:
                    if (value.equals("pending")) {
                        return EnumC1663x.Pending;
                    }
                    break;
                case -567770136:
                    if (value.equals("consumed")) {
                        return EnumC1663x.Consumed;
                    }
                    break;
                case -503126008:
                    if (value.equals("Consumed")) {
                        return EnumC1663x.Consumed;
                    }
                    break;
                case -332955372:
                    if (value.equals("ready-to-consume")) {
                        return EnumC1663x.ReadyToConsume;
                    }
                    break;
                case -284840886:
                    if (value.equals("unknown")) {
                        return EnumC1663x.Unknown;
                    }
                    break;
                case -123173735:
                    if (value.equals("canceled")) {
                        return EnumC1663x.Canceled;
                    }
                    break;
                case -58529607:
                    if (value.equals("Canceled")) {
                        return EnumC1663x.Canceled;
                    }
                    break;
                case 355417861:
                    if (value.equals("Expired")) {
                        return EnumC1663x.Expired;
                    }
                    break;
                case 982065527:
                    if (value.equals("Pending")) {
                        return EnumC1663x.Pending;
                    }
                    break;
                case 1243516606:
                    if (value.equals("ReadyToConsume")) {
                        return EnumC1663x.ReadyToConsume;
                    }
                    break;
                case 1379812394:
                    if (value.equals("Unknown")) {
                        return EnumC1663x.Unknown;
                    }
                    break;
                case 1623285528:
                    if (value.equals("inauthentic")) {
                        return EnumC1663x.Inauthentic;
                    }
                    break;
            }
            throw new IllegalArgumentException("Unknown IapkitPurchaseState value: " + value);
        }
    }

    EnumC1663x(String str) {
        this.f16222a = str;
    }

    public final String g() {
        return this.f16222a;
    }
}
