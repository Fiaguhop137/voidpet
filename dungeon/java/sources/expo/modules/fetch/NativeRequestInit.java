package expo.modules.fetch;

import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0080\b\u0018\u00002\u00020\u0001BA\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u001a\b\u0002\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00050\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\"\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014JJ\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u001a\b\u0002\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0012J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010 \u0012\u0004\b\"\u0010#\u001a\u0004\b!\u0010\u000eR2\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010$\u0012\u0004\b&\u0010#\u001a\u0004\b%\u0010\u0010R \u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010'\u0012\u0004\b)\u0010#\u001a\u0004\b(\u0010\u0012R \u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010*\u0012\u0004\b,\u0010#\u001a\u0004\b+\u0010\u0014¨\u0006-"}, d2 = {"Lexpo/modules/fetch/NativeRequestInit;", "Lfc/c;", "Lexpo/modules/fetch/NativeRequestCredentials;", "credentials", "", "Lkotlin/Pair;", "", "headers", "method", "Lexpo/modules/fetch/NativeRequestRedirect;", "redirect", "<init>", "(Lexpo/modules/fetch/NativeRequestCredentials;Ljava/util/List;Ljava/lang/String;Lexpo/modules/fetch/NativeRequestRedirect;)V", "component1", "()Lexpo/modules/fetch/NativeRequestCredentials;", "component2", "()Ljava/util/List;", "component3", "()Ljava/lang/String;", "component4", "()Lexpo/modules/fetch/NativeRequestRedirect;", "copy", "(Lexpo/modules/fetch/NativeRequestCredentials;Ljava/util/List;Ljava/lang/String;Lexpo/modules/fetch/NativeRequestRedirect;)Lexpo/modules/fetch/NativeRequestInit;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lexpo/modules/fetch/NativeRequestCredentials;", "getCredentials", "getCredentials$annotations", "()V", "Ljava/util/List;", "getHeaders", "getHeaders$annotations", "Ljava/lang/String;", "getMethod", "getMethod$annotations", "Lexpo/modules/fetch/NativeRequestRedirect;", "getRedirect", "getRedirect$annotations", "expo_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class NativeRequestInit implements p103fc.c {

    @NotNull
    private final NativeRequestCredentials credentials;

    @NotNull
    private final List<Pair<String, String>> headers;

    @NotNull
    private final String method;

    @NotNull
    private final NativeRequestRedirect redirect;

    public NativeRequestInit() {
        this(null, null, null, null, 15, null);
    }

    public NativeRequestInit(@NotNull NativeRequestCredentials credentials, @NotNull List<Pair<String, String>> headers, @NotNull String method, @NotNull NativeRequestRedirect redirect) {
        Intrinsics.checkNotNullParameter(credentials, "credentials");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(redirect, "redirect");
        this.credentials = credentials;
        this.headers = headers;
        this.method = method;
        this.redirect = redirect;
    }

    public /* synthetic */ NativeRequestInit(NativeRequestCredentials nativeRequestCredentials, List list, String str, NativeRequestRedirect nativeRequestRedirect, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? NativeRequestCredentials.INCLUDE : nativeRequestCredentials, (i10 & 2) != 0 ? CollectionsKt.l() : list, (i10 & 4) != 0 ? "GET" : str, (i10 & 8) != 0 ? NativeRequestRedirect.FOLLOW : nativeRequestRedirect);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NativeRequestInit copy$default(NativeRequestInit nativeRequestInit, NativeRequestCredentials nativeRequestCredentials, List list, String str, NativeRequestRedirect nativeRequestRedirect, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            nativeRequestCredentials = nativeRequestInit.credentials;
        }
        if ((i10 & 2) != 0) {
            list = nativeRequestInit.headers;
        }
        if ((i10 & 4) != 0) {
            str = nativeRequestInit.method;
        }
        if ((i10 & 8) != 0) {
            nativeRequestRedirect = nativeRequestInit.redirect;
        }
        return nativeRequestInit.copy(nativeRequestCredentials, list, str, nativeRequestRedirect);
    }

    @p103fc.b
    public static /* synthetic */ void getCredentials$annotations() {
    }

    @p103fc.b
    public static /* synthetic */ void getHeaders$annotations() {
    }

    @p103fc.b
    public static /* synthetic */ void getMethod$annotations() {
    }

    @p103fc.b
    public static /* synthetic */ void getRedirect$annotations() {
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final NativeRequestCredentials getCredentials() {
        return this.credentials;
    }

    @NotNull
    public final List<Pair<String, String>> component2() {
        return this.headers;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMethod() {
        return this.method;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final NativeRequestRedirect getRedirect() {
        return this.redirect;
    }

    @NotNull
    public final NativeRequestInit copy(@NotNull NativeRequestCredentials credentials, @NotNull List<Pair<String, String>> headers, @NotNull String method, @NotNull NativeRequestRedirect redirect) {
        Intrinsics.checkNotNullParameter(credentials, "credentials");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(redirect, "redirect");
        return new NativeRequestInit(credentials, headers, method, redirect);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NativeRequestInit)) {
            return false;
        }
        NativeRequestInit nativeRequestInit = (NativeRequestInit) other;
        return this.credentials == nativeRequestInit.credentials && Intrinsics.b(this.headers, nativeRequestInit.headers) && Intrinsics.b(this.method, nativeRequestInit.method) && this.redirect == nativeRequestInit.redirect;
    }

    @NotNull
    public final NativeRequestCredentials getCredentials() {
        return this.credentials;
    }

    @NotNull
    public final List<Pair<String, String>> getHeaders() {
        return this.headers;
    }

    @NotNull
    public final String getMethod() {
        return this.method;
    }

    @NotNull
    public final NativeRequestRedirect getRedirect() {
        return this.redirect;
    }

    public int hashCode() {
        return (((((this.credentials.hashCode() * 31) + this.headers.hashCode()) * 31) + this.method.hashCode()) * 31) + this.redirect.hashCode();
    }

    @NotNull
    public String toString() {
        return "NativeRequestInit(credentials=" + this.credentials + ", headers=" + this.headers + ", method=" + this.method + ", redirect=" + this.redirect + ")";
    }
}
