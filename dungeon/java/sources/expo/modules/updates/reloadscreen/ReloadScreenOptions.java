package expo.modules.updates.reloadscreen;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p103fc.b;
import p103fc.c;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0016\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019JX\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u0010J\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020\b2\b\u0010!\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b\"\u0010#R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010$\u0012\u0004\b&\u0010'\u001a\u0004\b%\u0010\u0010R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010(\u0012\u0004\b*\u0010'\u001a\u0004\b)\u0010\u0012R\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010+\u0012\u0004\b-\u0010'\u001a\u0004\b,\u0010\u0014R\"\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010.\u0012\u0004\b0\u0010'\u001a\u0004\b/\u0010\u0016R\"\u0010\n\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010.\u0012\u0004\b2\u0010'\u001a\u0004\b1\u0010\u0016R\"\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u00103\u0012\u0004\b5\u0010'\u001a\u0004\b4\u0010\u0019¨\u00066"}, d2 = {"Lexpo/modules/updates/reloadscreen/ReloadScreenOptions;", "Lfc/c;", "", "backgroundColor", "Lexpo/modules/updates/reloadscreen/ReloadScreenImageSource;", "image", "Lexpo/modules/updates/reloadscreen/ImageResizeMode;", "imageResizeMode", "", "imageFullScreen", "fade", "Lexpo/modules/updates/reloadscreen/SpinnerOptions;", "spinner", "<init>", "(Ljava/lang/String;Lexpo/modules/updates/reloadscreen/ReloadScreenImageSource;Lexpo/modules/updates/reloadscreen/ImageResizeMode;Ljava/lang/Boolean;Ljava/lang/Boolean;Lexpo/modules/updates/reloadscreen/SpinnerOptions;)V", "component1", "()Ljava/lang/String;", "component2", "()Lexpo/modules/updates/reloadscreen/ReloadScreenImageSource;", "component3", "()Lexpo/modules/updates/reloadscreen/ImageResizeMode;", "component4", "()Ljava/lang/Boolean;", "component5", "component6", "()Lexpo/modules/updates/reloadscreen/SpinnerOptions;", "copy", "(Ljava/lang/String;Lexpo/modules/updates/reloadscreen/ReloadScreenImageSource;Lexpo/modules/updates/reloadscreen/ImageResizeMode;Ljava/lang/Boolean;Ljava/lang/Boolean;Lexpo/modules/updates/reloadscreen/SpinnerOptions;)Lexpo/modules/updates/reloadscreen/ReloadScreenOptions;", "toString", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getBackgroundColor", "getBackgroundColor$annotations", "()V", "Lexpo/modules/updates/reloadscreen/ReloadScreenImageSource;", "getImage", "getImage$annotations", "Lexpo/modules/updates/reloadscreen/ImageResizeMode;", "getImageResizeMode", "getImageResizeMode$annotations", "Ljava/lang/Boolean;", "getImageFullScreen", "getImageFullScreen$annotations", "getFade", "getFade$annotations", "Lexpo/modules/updates/reloadscreen/SpinnerOptions;", "getSpinner", "getSpinner$annotations", "expo-updates_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ReloadScreenOptions implements c {

    @Nullable
    private final String backgroundColor;

    @Nullable
    private final Boolean fade;

    @Nullable
    private final ReloadScreenImageSource image;

    @Nullable
    private final Boolean imageFullScreen;

    @Nullable
    private final ImageResizeMode imageResizeMode;

    @Nullable
    private final SpinnerOptions spinner;

    public ReloadScreenOptions(@Nullable String str, @Nullable ReloadScreenImageSource reloadScreenImageSource, @Nullable ImageResizeMode imageResizeMode, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable SpinnerOptions spinnerOptions) {
        this.backgroundColor = str;
        this.image = reloadScreenImageSource;
        this.imageResizeMode = imageResizeMode;
        this.imageFullScreen = bool;
        this.fade = bool2;
        this.spinner = spinnerOptions;
    }

    public static /* synthetic */ ReloadScreenOptions copy$default(ReloadScreenOptions reloadScreenOptions, String str, ReloadScreenImageSource reloadScreenImageSource, ImageResizeMode imageResizeMode, Boolean bool, Boolean bool2, SpinnerOptions spinnerOptions, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = reloadScreenOptions.backgroundColor;
        }
        if ((i10 & 2) != 0) {
            reloadScreenImageSource = reloadScreenOptions.image;
        }
        if ((i10 & 4) != 0) {
            imageResizeMode = reloadScreenOptions.imageResizeMode;
        }
        if ((i10 & 8) != 0) {
            bool = reloadScreenOptions.imageFullScreen;
        }
        if ((i10 & 16) != 0) {
            bool2 = reloadScreenOptions.fade;
        }
        if ((i10 & 32) != 0) {
            spinnerOptions = reloadScreenOptions.spinner;
        }
        Boolean bool3 = bool2;
        SpinnerOptions spinnerOptions2 = spinnerOptions;
        return reloadScreenOptions.copy(str, reloadScreenImageSource, imageResizeMode, bool, bool3, spinnerOptions2);
    }

    @b
    public static /* synthetic */ void getBackgroundColor$annotations() {
    }

    @b
    public static /* synthetic */ void getFade$annotations() {
    }

    @b
    public static /* synthetic */ void getImage$annotations() {
    }

    @b
    public static /* synthetic */ void getImageFullScreen$annotations() {
    }

    @b
    public static /* synthetic */ void getImageResizeMode$annotations() {
    }

    @b
    public static /* synthetic */ void getSpinner$annotations() {
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ReloadScreenImageSource getImage() {
        return this.image;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final ImageResizeMode getImageResizeMode() {
        return this.imageResizeMode;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Boolean getImageFullScreen() {
        return this.imageFullScreen;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Boolean getFade() {
        return this.fade;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final SpinnerOptions getSpinner() {
        return this.spinner;
    }

    @NotNull
    public final ReloadScreenOptions copy(@Nullable String backgroundColor, @Nullable ReloadScreenImageSource image, @Nullable ImageResizeMode imageResizeMode, @Nullable Boolean imageFullScreen, @Nullable Boolean fade, @Nullable SpinnerOptions spinner) {
        return new ReloadScreenOptions(backgroundColor, image, imageResizeMode, imageFullScreen, fade, spinner);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReloadScreenOptions)) {
            return false;
        }
        ReloadScreenOptions reloadScreenOptions = (ReloadScreenOptions) other;
        return Intrinsics.b(this.backgroundColor, reloadScreenOptions.backgroundColor) && Intrinsics.b(this.image, reloadScreenOptions.image) && this.imageResizeMode == reloadScreenOptions.imageResizeMode && Intrinsics.b(this.imageFullScreen, reloadScreenOptions.imageFullScreen) && Intrinsics.b(this.fade, reloadScreenOptions.fade) && Intrinsics.b(this.spinner, reloadScreenOptions.spinner);
    }

    @Nullable
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @Nullable
    public final Boolean getFade() {
        return this.fade;
    }

    @Nullable
    public final ReloadScreenImageSource getImage() {
        return this.image;
    }

    @Nullable
    public final Boolean getImageFullScreen() {
        return this.imageFullScreen;
    }

    @Nullable
    public final ImageResizeMode getImageResizeMode() {
        return this.imageResizeMode;
    }

    @Nullable
    public final SpinnerOptions getSpinner() {
        return this.spinner;
    }

    public int hashCode() {
        String str = this.backgroundColor;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        ReloadScreenImageSource reloadScreenImageSource = this.image;
        int iHashCode2 = (iHashCode + (reloadScreenImageSource == null ? 0 : reloadScreenImageSource.hashCode())) * 31;
        ImageResizeMode imageResizeMode = this.imageResizeMode;
        int iHashCode3 = (iHashCode2 + (imageResizeMode == null ? 0 : imageResizeMode.hashCode())) * 31;
        Boolean bool = this.imageFullScreen;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.fade;
        int iHashCode5 = (iHashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        SpinnerOptions spinnerOptions = this.spinner;
        return iHashCode5 + (spinnerOptions != null ? spinnerOptions.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ReloadScreenOptions(backgroundColor=" + this.backgroundColor + ", image=" + this.image + ", imageResizeMode=" + this.imageResizeMode + ", imageFullScreen=" + this.imageFullScreen + ", fade=" + this.fade + ", spinner=" + this.spinner + ")";
    }
}
