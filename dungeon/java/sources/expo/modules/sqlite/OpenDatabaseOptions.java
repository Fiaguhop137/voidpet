package expo.modules.sqlite;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p103fc.b;
import p103fc.c;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0013\b\u0080\b\u0018\u00002\u00020\u0001BG\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\rJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\rJP\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0011J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u00022\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u001e\u0012\u0004\b \u0010!\u001a\u0004\b\u001f\u0010\rR \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\u001e\u0012\u0004\b#\u0010!\u001a\u0004\b\"\u0010\rR \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u001e\u0012\u0004\b%\u0010!\u001a\u0004\b$\u0010\rR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010&\u0012\u0004\b(\u0010!\u001a\u0004\b'\u0010\u0011R\"\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010&\u0012\u0004\b*\u0010!\u001a\u0004\b)\u0010\u0011R \u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010\u001e\u0012\u0004\b,\u0010!\u001a\u0004\b+\u0010\r¨\u0006-"}, d2 = {"Lexpo/modules/sqlite/OpenDatabaseOptions;", "Lfc/c;", "", "enableChangeListener", "useNewConnection", "finalizeUnusedStatementsBeforeClosing", "", "libSQLUrl", "libSQLAuthToken", "libSQLRemoteOnly", "<init>", "(ZZZLjava/lang/String;Ljava/lang/String;Z)V", "component1", "()Z", "component2", "component3", "component4", "()Ljava/lang/String;", "component5", "component6", "copy", "(ZZZLjava/lang/String;Ljava/lang/String;Z)Lexpo/modules/sqlite/OpenDatabaseOptions;", "toString", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getEnableChangeListener", "getEnableChangeListener$annotations", "()V", "getUseNewConnection", "getUseNewConnection$annotations", "getFinalizeUnusedStatementsBeforeClosing", "getFinalizeUnusedStatementsBeforeClosing$annotations", "Ljava/lang/String;", "getLibSQLUrl", "getLibSQLUrl$annotations", "getLibSQLAuthToken", "getLibSQLAuthToken$annotations", "getLibSQLRemoteOnly", "getLibSQLRemoteOnly$annotations", "expo-sqlite_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class OpenDatabaseOptions implements c {
    private final boolean enableChangeListener;
    private final boolean finalizeUnusedStatementsBeforeClosing;

    @Nullable
    private final String libSQLAuthToken;
    private final boolean libSQLRemoteOnly;

    @Nullable
    private final String libSQLUrl;
    private final boolean useNewConnection;

    public OpenDatabaseOptions() {
        this(false, false, false, null, null, false, 63, null);
    }

    public OpenDatabaseOptions(boolean z10, boolean z11, boolean z12, @Nullable String str, @Nullable String str2, boolean z13) {
        this.enableChangeListener = z10;
        this.useNewConnection = z11;
        this.finalizeUnusedStatementsBeforeClosing = z12;
        this.libSQLUrl = str;
        this.libSQLAuthToken = str2;
        this.libSQLRemoteOnly = z13;
    }

    public /* synthetic */ OpenDatabaseOptions(boolean z10, boolean z11, boolean z12, String str, String str2, boolean z13, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? false : z11, (i10 & 4) != 0 ? true : z12, (i10 & 8) != 0 ? null : str, (i10 & 16) != 0 ? null : str2, (i10 & 32) != 0 ? false : z13);
    }

    public static /* synthetic */ OpenDatabaseOptions copy$default(OpenDatabaseOptions openDatabaseOptions, boolean z10, boolean z11, boolean z12, String str, String str2, boolean z13, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = openDatabaseOptions.enableChangeListener;
        }
        if ((i10 & 2) != 0) {
            z11 = openDatabaseOptions.useNewConnection;
        }
        if ((i10 & 4) != 0) {
            z12 = openDatabaseOptions.finalizeUnusedStatementsBeforeClosing;
        }
        if ((i10 & 8) != 0) {
            str = openDatabaseOptions.libSQLUrl;
        }
        if ((i10 & 16) != 0) {
            str2 = openDatabaseOptions.libSQLAuthToken;
        }
        if ((i10 & 32) != 0) {
            z13 = openDatabaseOptions.libSQLRemoteOnly;
        }
        String str3 = str2;
        boolean z14 = z13;
        return openDatabaseOptions.copy(z10, z11, z12, str, str3, z14);
    }

    @b
    public static /* synthetic */ void getEnableChangeListener$annotations() {
    }

    @b
    public static /* synthetic */ void getFinalizeUnusedStatementsBeforeClosing$annotations() {
    }

    @b
    public static /* synthetic */ void getLibSQLAuthToken$annotations() {
    }

    @b
    public static /* synthetic */ void getLibSQLRemoteOnly$annotations() {
    }

    @b
    public static /* synthetic */ void getLibSQLUrl$annotations() {
    }

    @b
    public static /* synthetic */ void getUseNewConnection$annotations() {
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getEnableChangeListener() {
        return this.enableChangeListener;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getUseNewConnection() {
        return this.useNewConnection;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getFinalizeUnusedStatementsBeforeClosing() {
        return this.finalizeUnusedStatementsBeforeClosing;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getLibSQLUrl() {
        return this.libSQLUrl;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getLibSQLAuthToken() {
        return this.libSQLAuthToken;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getLibSQLRemoteOnly() {
        return this.libSQLRemoteOnly;
    }

    @NotNull
    public final OpenDatabaseOptions copy(boolean enableChangeListener, boolean useNewConnection, boolean finalizeUnusedStatementsBeforeClosing, @Nullable String libSQLUrl, @Nullable String libSQLAuthToken, boolean libSQLRemoteOnly) {
        return new OpenDatabaseOptions(enableChangeListener, useNewConnection, finalizeUnusedStatementsBeforeClosing, libSQLUrl, libSQLAuthToken, libSQLRemoteOnly);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OpenDatabaseOptions)) {
            return false;
        }
        OpenDatabaseOptions openDatabaseOptions = (OpenDatabaseOptions) other;
        return this.enableChangeListener == openDatabaseOptions.enableChangeListener && this.useNewConnection == openDatabaseOptions.useNewConnection && this.finalizeUnusedStatementsBeforeClosing == openDatabaseOptions.finalizeUnusedStatementsBeforeClosing && Intrinsics.b(this.libSQLUrl, openDatabaseOptions.libSQLUrl) && Intrinsics.b(this.libSQLAuthToken, openDatabaseOptions.libSQLAuthToken) && this.libSQLRemoteOnly == openDatabaseOptions.libSQLRemoteOnly;
    }

    public final boolean getEnableChangeListener() {
        return this.enableChangeListener;
    }

    public final boolean getFinalizeUnusedStatementsBeforeClosing() {
        return this.finalizeUnusedStatementsBeforeClosing;
    }

    @Nullable
    public final String getLibSQLAuthToken() {
        return this.libSQLAuthToken;
    }

    public final boolean getLibSQLRemoteOnly() {
        return this.libSQLRemoteOnly;
    }

    @Nullable
    public final String getLibSQLUrl() {
        return this.libSQLUrl;
    }

    public final boolean getUseNewConnection() {
        return this.useNewConnection;
    }

    public int hashCode() {
        int iHashCode = ((((Boolean.hashCode(this.enableChangeListener) * 31) + Boolean.hashCode(this.useNewConnection)) * 31) + Boolean.hashCode(this.finalizeUnusedStatementsBeforeClosing)) * 31;
        String str = this.libSQLUrl;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.libSQLAuthToken;
        return ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + Boolean.hashCode(this.libSQLRemoteOnly);
    }

    @NotNull
    public String toString() {
        return "OpenDatabaseOptions(enableChangeListener=" + this.enableChangeListener + ", useNewConnection=" + this.useNewConnection + ", finalizeUnusedStatementsBeforeClosing=" + this.finalizeUnusedStatementsBeforeClosing + ", libSQLUrl=" + this.libSQLUrl + ", libSQLAuthToken=" + this.libSQLAuthToken + ", libSQLRemoteOnly=" + this.libSQLRemoteOnly + ")";
    }
}
