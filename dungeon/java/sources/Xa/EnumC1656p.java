package Xa;

import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Xa.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC1656p {
    Unknown("unknown"),
    UserCancelled("user-cancelled"),
    UserError("user-error"),
    ItemUnavailable("item-unavailable"),
    RemoteError("remote-error"),
    NetworkError("network-error"),
    ServiceError("service-error"),
    ReceiptFailed("receipt-failed"),
    ReceiptFinished("receipt-finished"),
    ReceiptFinishedFailed("receipt-finished-failed"),
    PurchaseVerificationFailed("purchase-verification-failed"),
    PurchaseVerificationFinished("purchase-verification-finished"),
    PurchaseVerificationFinishFailed("purchase-verification-finish-failed"),
    NotPrepared("not-prepared"),
    NotEnded("not-ended"),
    AlreadyOwned("already-owned"),
    DeveloperError("developer-error"),
    BillingResponseJsonParseError("billing-response-json-parse-error"),
    DeferredPayment("deferred-payment"),
    Interrupted("interrupted"),
    IapNotAvailable("iap-not-available"),
    PurchaseError("purchase-error"),
    SyncError("sync-error"),
    TransactionValidationFailed("transaction-validation-failed"),
    ActivityUnavailable("activity-unavailable"),
    AlreadyPrepared("already-prepared"),
    Pending("pending"),
    ConnectionClosed("connection-closed"),
    InitConnection("init-connection"),
    ServiceDisconnected("service-disconnected"),
    QueryProduct("query-product"),
    SkuNotFound("sku-not-found"),
    SkuOfferMismatch("sku-offer-mismatch"),
    ItemNotOwned("item-not-owned"),
    BillingUnavailable("billing-unavailable"),
    FeatureNotSupported("feature-not-supported"),
    EmptySkuList("empty-sku-list");


    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final /* synthetic */ EnumEntries f16130O = Gd.a.a(e());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f16131b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f16156a;

    /* JADX INFO: renamed from: Xa.p$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public final EnumC1656p a(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            switch (value.hashCode()) {
                case -2125705996:
                    if (value.equals("TransactionValidationFailed")) {
                        return EnumC1656p.TransactionValidationFailed;
                    }
                    break;
                case -2070993780:
                    if (value.equals("SkuNotFound")) {
                        return EnumC1656p.SkuNotFound;
                    }
                    break;
                case -2069606034:
                    if (value.equals("EmptySkuList")) {
                        return EnumC1656p.EmptySkuList;
                    }
                    break;
                case -2048694871:
                    if (value.equals("network-error")) {
                        return EnumC1656p.NetworkError;
                    }
                    break;
                case -2004214414:
                    if (value.equals("receipt-failed")) {
                        return EnumC1656p.ReceiptFailed;
                    }
                    break;
                case -1975534371:
                    if (value.equals("UserError")) {
                        return EnumC1656p.UserError;
                    }
                    break;
                case -1947652542:
                    if (value.equals("interrupted")) {
                        return EnumC1656p.Interrupted;
                    }
                    break;
                case -1940352027:
                    if (value.equals("ItemNotOwned")) {
                        return EnumC1656p.ItemNotOwned;
                    }
                    break;
                case -1875591534:
                    if (value.equals("activity-unavailable")) {
                        return EnumC1656p.ActivityUnavailable;
                    }
                    break;
                case -1820504051:
                    if (value.equals("SyncError")) {
                        return EnumC1656p.SyncError;
                    }
                    break;
                case -1809505507:
                    if (value.equals("ItemUnavailable")) {
                        return EnumC1656p.ItemUnavailable;
                    }
                    break;
                case -1760074802:
                    if (value.equals("empty-sku-list")) {
                        return EnumC1656p.EmptySkuList;
                    }
                    break;
                case -1754234646:
                    if (value.equals("query-product")) {
                        return EnumC1656p.QueryProduct;
                    }
                    break;
                case -1725642728:
                    if (value.equals("purchase-verification-finished")) {
                        return EnumC1656p.PurchaseVerificationFinished;
                    }
                    break;
                case -1646973954:
                    if (value.equals("billing-unavailable")) {
                        return EnumC1656p.BillingUnavailable;
                    }
                    break;
                case -1593116262:
                    if (value.equals("iap-not-available")) {
                        return EnumC1656p.IapNotAvailable;
                    }
                    break;
                case -1495183803:
                    if (value.equals("developer-error")) {
                        return EnumC1656p.DeveloperError;
                    }
                    break;
                case -1491273661:
                    if (value.equals("billing-response-json-parse-error")) {
                        return EnumC1656p.BillingResponseJsonParseError;
                    }
                    break;
                case -1436117703:
                    if (value.equals("PurchaseVerificationFailed")) {
                        return EnumC1656p.PurchaseVerificationFailed;
                    }
                    break;
                case -1145826879:
                    if (value.equals("remote-error")) {
                        return EnumC1656p.RemoteError;
                    }
                    break;
                case -1055415898:
                    if (value.equals("UserCancelled")) {
                        return EnumC1656p.UserCancelled;
                    }
                    break;
                case -1024143848:
                    if (value.equals("deferred-payment")) {
                        return EnumC1656p.DeferredPayment;
                    }
                    break;
                case -1015548465:
                    if (value.equals("user-cancelled")) {
                        return EnumC1656p.UserCancelled;
                    }
                    break;
                case -861964242:
                    if (value.equals("InitConnection")) {
                        return EnumC1656p.InitConnection;
                    }
                    break;
                case -750578562:
                    if (value.equals("DeveloperError")) {
                        return EnumC1656p.DeveloperError;
                    }
                    break;
                case -682587753:
                    if (value.equals("pending")) {
                        return EnumC1656p.Pending;
                    }
                    break;
                case -548928153:
                    if (value.equals("PurchaseError")) {
                        return EnumC1656p.PurchaseError;
                    }
                    break;
                case -451978669:
                    if (value.equals("service-disconnected")) {
                        return EnumC1656p.ServiceDisconnected;
                    }
                    break;
                case -443081395:
                    if (value.equals("AlreadyOwned")) {
                        return EnumC1656p.AlreadyOwned;
                    }
                    break;
                case -439062006:
                    if (value.equals("ConnectionClosed")) {
                        return EnumC1656p.ConnectionClosed;
                    }
                    break;
                case -424751806:
                    if (value.equals("RemoteError")) {
                        return EnumC1656p.RemoteError;
                    }
                    break;
                case -284840886:
                    if (value.equals("unknown")) {
                        return EnumC1656p.Unknown;
                    }
                    break;
                case -279783902:
                    if (value.equals("Interrupted")) {
                        return EnumC1656p.Interrupted;
                    }
                    break;
                case -50558827:
                    if (value.equals("AlreadyPrepared")) {
                        return EnumC1656p.AlreadyPrepared;
                    }
                    break;
                case 120785050:
                    if (value.equals("NetworkError")) {
                        return EnumC1656p.NetworkError;
                    }
                    break;
                case 183099200:
                    if (value.equals("not-ended")) {
                        return EnumC1656p.NotEnded;
                    }
                    break;
                case 213557837:
                    if (value.equals("SkuOfferMismatch")) {
                        return EnumC1656p.SkuOfferMismatch;
                    }
                    break;
                case 289730439:
                    if (value.equals("ReceiptFinishedFailed")) {
                        return EnumC1656p.ReceiptFinishedFailed;
                    }
                    break;
                case 325864803:
                    if (value.equals("purchase-verification-failed")) {
                        return EnumC1656p.PurchaseVerificationFailed;
                    }
                    break;
                case 421159062:
                    if (value.equals("item-unavailable")) {
                        return EnumC1656p.ItemUnavailable;
                    }
                    break;
                case 424197021:
                    if (value.equals("feature-not-supported")) {
                        return EnumC1656p.FeatureNotSupported;
                    }
                    break;
                case 465987132:
                    if (value.equals("purchase-error")) {
                        return EnumC1656p.PurchaseError;
                    }
                    break;
                case 475830389:
                    if (value.equals("ReceiptFailed")) {
                        return EnumC1656p.ReceiptFailed;
                    }
                    break;
                case 490376582:
                    if (value.equals("user-error")) {
                        return EnumC1656p.UserError;
                    }
                    break;
                case 500324467:
                    if (value.equals("ServiceError")) {
                        return EnumC1656p.ServiceError;
                    }
                    break;
                case 573630705:
                    if (value.equals("item-not-owned")) {
                        return EnumC1656p.ItemNotOwned;
                    }
                    break;
                case 630663536:
                    if (value.equals("ServiceDisconnected")) {
                        return EnumC1656p.ServiceDisconnected;
                    }
                    break;
                case 657364650:
                    if (value.equals("ReceiptFinished")) {
                        return EnumC1656p.ReceiptFinished;
                    }
                    break;
                case 807323664:
                    if (value.equals("NotPrepared")) {
                        return EnumC1656p.NotPrepared;
                    }
                    break;
                case 911162467:
                    if (value.equals("receipt-finished-failed")) {
                        return EnumC1656p.ReceiptFinishedFailed;
                    }
                    break;
                case 914340795:
                    if (value.equals("init-connection")) {
                        return EnumC1656p.InitConnection;
                    }
                    break;
                case 982065527:
                    if (value.equals("Pending")) {
                        return EnumC1656p.Pending;
                    }
                    break;
                case 1001349206:
                    if (value.equals("sync-error")) {
                        return EnumC1656p.SyncError;
                    }
                    break;
                case 1012033196:
                    if (value.equals("PurchaseVerificationFinishFailed")) {
                        return EnumC1656p.PurchaseVerificationFinishFailed;
                    }
                    break;
                case 1041158247:
                    if (value.equals("receipt-finished")) {
                        return EnumC1656p.ReceiptFinished;
                    }
                    break;
                case 1050367183:
                    if (value.equals("sku-offer-mismatch")) {
                        return EnumC1656p.SkuOfferMismatch;
                    }
                    break;
                case 1127092464:
                    if (value.equals("service-error")) {
                        return EnumC1656p.ServiceError;
                    }
                    break;
                case 1239437045:
                    if (value.equals("BillingUnavailable")) {
                        return EnumC1656p.BillingUnavailable;
                    }
                    break;
                case 1298312999:
                    if (value.equals("QueryProduct")) {
                        return EnumC1656p.QueryProduct;
                    }
                    break;
                case 1319434043:
                    if (value.equals("connection-closed")) {
                        return EnumC1656p.ConnectionClosed;
                    }
                    break;
                case 1336550817:
                    if (value.equals("ActivityUnavailable")) {
                        return EnumC1656p.ActivityUnavailable;
                    }
                    break;
                case 1379812394:
                    if (value.equals("Unknown")) {
                        return EnumC1656p.Unknown;
                    }
                    break;
                case 1384704503:
                    if (value.equals("not-prepared")) {
                        return EnumC1656p.NotPrepared;
                    }
                    break;
                case 1521250926:
                    if (value.equals("PurchaseVerificationFinished")) {
                        return EnumC1656p.PurchaseVerificationFinished;
                    }
                    break;
                case 1567246866:
                    if (value.equals("already-prepared")) {
                        return EnumC1656p.AlreadyPrepared;
                    }
                    break;
                case 1596759313:
                    if (value.equals("FeatureNotSupported")) {
                        return EnumC1656p.FeatureNotSupported;
                    }
                    break;
                case 1616994247:
                    if (value.equals("NotEnded")) {
                        return EnumC1656p.NotEnded;
                    }
                    break;
                case 1644872418:
                    if (value.equals("transaction-validation-failed")) {
                        return EnumC1656p.TransactionValidationFailed;
                    }
                    break;
                case 1664881904:
                    if (value.equals("already-owned")) {
                        return EnumC1656p.AlreadyOwned;
                    }
                    break;
                case 1686326104:
                    if (value.equals("sku-not-found")) {
                        return EnumC1656p.SkuNotFound;
                    }
                    break;
                case 1713473233:
                    if (value.equals("purchase-verification-finish-failed")) {
                        return EnumC1656p.PurchaseVerificationFinishFailed;
                    }
                    break;
                case 1776922887:
                    if (value.equals("DeferredPayment")) {
                        return EnumC1656p.DeferredPayment;
                    }
                    break;
                case 1915902862:
                    if (value.equals("IapNotAvailable")) {
                        return EnumC1656p.IapNotAvailable;
                    }
                    break;
                case 2057076985:
                    if (value.equals("BillingResponseJsonParseError")) {
                        return EnumC1656p.BillingResponseJsonParseError;
                    }
                    break;
            }
            throw new IllegalArgumentException("Unknown ErrorCode value: " + value);
        }
    }

    EnumC1656p(String str) {
        this.f16156a = str;
    }

    public final String g() {
        return this.f16156a;
    }
}
