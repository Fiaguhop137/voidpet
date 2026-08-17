package expo.modules.sharing;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p103fc.b;
import p103fc.c;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ4\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0017\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0018\u0010\tR\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\u0017\u0012\u0004\b\u001c\u0010\u001a\u001a\u0004\b\u001b\u0010\tR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0017\u0012\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u001d\u0010\t¨\u0006\u001f"}, d2 = {"Lexpo/modules/sharing/SharingOptions;", "Lfc/c;", "", "mimeType", "UTI", "dialogTitle", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lexpo/modules/sharing/SharingOptions;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getMimeType", "getMimeType$annotations", "()V", "getUTI", "getUTI$annotations", "getDialogTitle", "getDialogTitle$annotations", "expo-sharing_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class SharingOptions implements c {

    @Nullable
    private final String UTI;

    @Nullable
    private final String dialogTitle;

    @Nullable
    private final String mimeType;

    public SharingOptions(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        this.mimeType = str;
        this.UTI = str2;
        this.dialogTitle = str3;
    }

    public static /* synthetic */ SharingOptions copy$default(SharingOptions sharingOptions, String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = sharingOptions.mimeType;
        }
        if ((i10 & 2) != 0) {
            str2 = sharingOptions.UTI;
        }
        if ((i10 & 4) != 0) {
            str3 = sharingOptions.dialogTitle;
        }
        return sharingOptions.copy(str, str2, str3);
    }

    @b
    public static /* synthetic */ void getDialogTitle$annotations() {
    }

    @b
    public static /* synthetic */ void getMimeType$annotations() {
    }

    @b
    public static /* synthetic */ void getUTI$annotations() {
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMimeType() {
        return this.mimeType;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUTI() {
        return this.UTI;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDialogTitle() {
        return this.dialogTitle;
    }

    @NotNull
    public final SharingOptions copy(@Nullable String mimeType, @Nullable String UTI, @Nullable String dialogTitle) {
        return new SharingOptions(mimeType, UTI, dialogTitle);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SharingOptions)) {
            return false;
        }
        SharingOptions sharingOptions = (SharingOptions) other;
        return Intrinsics.b(this.mimeType, sharingOptions.mimeType) && Intrinsics.b(this.UTI, sharingOptions.UTI) && Intrinsics.b(this.dialogTitle, sharingOptions.dialogTitle);
    }

    @Nullable
    public final String getDialogTitle() {
        return this.dialogTitle;
    }

    @Nullable
    public final String getMimeType() {
        return this.mimeType;
    }

    @Nullable
    public final String getUTI() {
        return this.UTI;
    }

    public int hashCode() {
        String str = this.mimeType;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.UTI;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.dialogTitle;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "SharingOptions(mimeType=" + this.mimeType + ", UTI=" + this.UTI + ", dialogTitle=" + this.dialogTitle + ")";
    }
}
