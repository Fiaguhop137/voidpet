package dev.hyo.openiap.listener;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Ldev/hyo/openiap/listener/UserChoiceDetails;", "", "externalTransactionToken", "", "products", "", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getExternalTransactionToken", "()Ljava/lang/String;", "getProducts", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "openiap_playRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class UserChoiceDetails {
    public static final int $stable = 8;

    @NotNull
    private final String externalTransactionToken;

    @NotNull
    private final List<String> products;

    public UserChoiceDetails(@NotNull String externalTransactionToken, @NotNull List<String> products) {
        Intrinsics.checkNotNullParameter(externalTransactionToken, "externalTransactionToken");
        Intrinsics.checkNotNullParameter(products, "products");
        this.externalTransactionToken = externalTransactionToken;
        this.products = products;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UserChoiceDetails copy$default(UserChoiceDetails userChoiceDetails, String str, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = userChoiceDetails.externalTransactionToken;
        }
        if ((i10 & 2) != 0) {
            list = userChoiceDetails.products;
        }
        return userChoiceDetails.copy(str, list);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getExternalTransactionToken() {
        return this.externalTransactionToken;
    }

    @NotNull
    public final List<String> component2() {
        return this.products;
    }

    @NotNull
    public final UserChoiceDetails copy(@NotNull String externalTransactionToken, @NotNull List<String> products) {
        Intrinsics.checkNotNullParameter(externalTransactionToken, "externalTransactionToken");
        Intrinsics.checkNotNullParameter(products, "products");
        return new UserChoiceDetails(externalTransactionToken, products);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserChoiceDetails)) {
            return false;
        }
        UserChoiceDetails userChoiceDetails = (UserChoiceDetails) other;
        return Intrinsics.b(this.externalTransactionToken, userChoiceDetails.externalTransactionToken) && Intrinsics.b(this.products, userChoiceDetails.products);
    }

    @NotNull
    public final String getExternalTransactionToken() {
        return this.externalTransactionToken;
    }

    @NotNull
    public final List<String> getProducts() {
        return this.products;
    }

    public int hashCode() {
        return (this.externalTransactionToken.hashCode() * 31) + this.products.hashCode();
    }

    @NotNull
    public String toString() {
        return "UserChoiceDetails(externalTransactionToken=" + this.externalTransactionToken + ", products=" + this.products + ")";
    }
}
