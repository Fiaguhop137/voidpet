package expo.modules.updates.reloadscreen;

import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p103fc.b;
import p103fc.c;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\rJ@\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u001d\u0012\u0004\b\u001f\u0010 \u001a\u0004\b\u001e\u0010\u000bR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010!\u0012\u0004\b#\u0010 \u001a\u0004\b\"\u0010\rR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010!\u0012\u0004\b%\u0010 \u001a\u0004\b$\u0010\rR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010!\u0012\u0004\b'\u0010 \u001a\u0004\b&\u0010\r¨\u0006("}, d2 = {"Lexpo/modules/updates/reloadscreen/ReloadScreenImageSource;", "Lfc/c;", "Landroid/net/Uri;", "url", "", "width", "height", "scale", "<init>", "(Landroid/net/Uri;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)V", "component1", "()Landroid/net/Uri;", "component2", "()Ljava/lang/Double;", "component3", "component4", "copy", "(Landroid/net/Uri;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)Lexpo/modules/updates/reloadscreen/ReloadScreenImageSource;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroid/net/Uri;", "getUrl", "getUrl$annotations", "()V", "Ljava/lang/Double;", "getWidth", "getWidth$annotations", "getHeight", "getHeight$annotations", "getScale", "getScale$annotations", "expo-updates_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class ReloadScreenImageSource implements c {

    @Nullable
    private final Double height;

    @Nullable
    private final Double scale;

    @Nullable
    private final Uri url;

    @Nullable
    private final Double width;

    public ReloadScreenImageSource() {
        this(null, null, null, null, 15, null);
    }

    public ReloadScreenImageSource(@Nullable Uri uri, @Nullable Double d10, @Nullable Double d11, @Nullable Double d12) {
        this.url = uri;
        this.width = d10;
        this.height = d11;
        this.scale = d12;
    }

    public /* synthetic */ ReloadScreenImageSource(Uri uri, Double d10, Double d11, Double d12, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : uri, (i10 & 2) != 0 ? null : d10, (i10 & 4) != 0 ? null : d11, (i10 & 8) != 0 ? null : d12);
    }

    public static /* synthetic */ ReloadScreenImageSource copy$default(ReloadScreenImageSource reloadScreenImageSource, Uri uri, Double d10, Double d11, Double d12, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            uri = reloadScreenImageSource.url;
        }
        if ((i10 & 2) != 0) {
            d10 = reloadScreenImageSource.width;
        }
        if ((i10 & 4) != 0) {
            d11 = reloadScreenImageSource.height;
        }
        if ((i10 & 8) != 0) {
            d12 = reloadScreenImageSource.scale;
        }
        return reloadScreenImageSource.copy(uri, d10, d11, d12);
    }

    @b
    public static /* synthetic */ void getHeight$annotations() {
    }

    @b
    public static /* synthetic */ void getScale$annotations() {
    }

    @b
    public static /* synthetic */ void getUrl$annotations() {
    }

    @b
    public static /* synthetic */ void getWidth$annotations() {
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Uri getUrl() {
        return this.url;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Double getWidth() {
        return this.width;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Double getHeight() {
        return this.height;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Double getScale() {
        return this.scale;
    }

    @NotNull
    public final ReloadScreenImageSource copy(@Nullable Uri url, @Nullable Double width, @Nullable Double height, @Nullable Double scale) {
        return new ReloadScreenImageSource(url, width, height, scale);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReloadScreenImageSource)) {
            return false;
        }
        ReloadScreenImageSource reloadScreenImageSource = (ReloadScreenImageSource) other;
        return Intrinsics.b(this.url, reloadScreenImageSource.url) && Intrinsics.b(this.width, reloadScreenImageSource.width) && Intrinsics.b(this.height, reloadScreenImageSource.height) && Intrinsics.b(this.scale, reloadScreenImageSource.scale);
    }

    @Nullable
    public final Double getHeight() {
        return this.height;
    }

    @Nullable
    public final Double getScale() {
        return this.scale;
    }

    @Nullable
    public final Uri getUrl() {
        return this.url;
    }

    @Nullable
    public final Double getWidth() {
        return this.width;
    }

    public int hashCode() {
        Uri uri = this.url;
        int iHashCode = (uri == null ? 0 : uri.hashCode()) * 31;
        Double d10 = this.width;
        int iHashCode2 = (iHashCode + (d10 == null ? 0 : d10.hashCode())) * 31;
        Double d11 = this.height;
        int iHashCode3 = (iHashCode2 + (d11 == null ? 0 : d11.hashCode())) * 31;
        Double d12 = this.scale;
        return iHashCode3 + (d12 != null ? d12.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ReloadScreenImageSource(url=" + this.url + ", width=" + this.width + ", height=" + this.height + ", scale=" + this.scale + ")";
    }
}
