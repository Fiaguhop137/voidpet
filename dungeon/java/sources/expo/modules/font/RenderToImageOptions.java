package expo.modules.font;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p103fc.b;
import p103fc.c;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000bJ\u0010\u0010\u0013\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u000fJ\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0019\u0012\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001a\u0010\u000bR \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u001d\u0012\u0004\b\u001f\u0010\u001c\u001a\u0004\b\u001e\u0010\rR \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010 \u0012\u0004\b\"\u0010\u001c\u001a\u0004\b!\u0010\u000f¨\u0006#"}, d2 = {"Lexpo/modules/font/RenderToImageOptions;", "Lfc/c;", "", "fontFamily", "", "size", "", "color", "<init>", "(Ljava/lang/String;FI)V", "component1", "()Ljava/lang/String;", "component2", "()F", "component3", "()I", "copy", "(Ljava/lang/String;FI)Lexpo/modules/font/RenderToImageOptions;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getFontFamily", "getFontFamily$annotations", "()V", "F", "getSize", "getSize$annotations", "I", "getColor", "getColor$annotations", "expo-font_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class RenderToImageOptions implements c {
    private final int color;

    @NotNull
    private final String fontFamily;
    private final float size;

    public RenderToImageOptions() {
        this(null, 0.0f, 0, 7, null);
    }

    public RenderToImageOptions(@NotNull String fontFamily, float f10, int i10) {
        Intrinsics.checkNotNullParameter(fontFamily, "fontFamily");
        this.fontFamily = fontFamily;
        this.size = f10;
        this.color = i10;
    }

    public /* synthetic */ RenderToImageOptions(String str, float f10, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? 24.0f : f10, (i11 & 4) != 0 ? -16777216 : i10);
    }

    public static /* synthetic */ RenderToImageOptions copy$default(RenderToImageOptions renderToImageOptions, String str, float f10, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = renderToImageOptions.fontFamily;
        }
        if ((i11 & 2) != 0) {
            f10 = renderToImageOptions.size;
        }
        if ((i11 & 4) != 0) {
            i10 = renderToImageOptions.color;
        }
        return renderToImageOptions.copy(str, f10, i10);
    }

    @b
    public static /* synthetic */ void getColor$annotations() {
    }

    @b
    public static /* synthetic */ void getFontFamily$annotations() {
    }

    @b
    public static /* synthetic */ void getSize$annotations() {
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getFontFamily() {
        return this.fontFamily;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getSize() {
        return this.size;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getColor() {
        return this.color;
    }

    @NotNull
    public final RenderToImageOptions copy(@NotNull String fontFamily, float size, int color) {
        Intrinsics.checkNotNullParameter(fontFamily, "fontFamily");
        return new RenderToImageOptions(fontFamily, size, color);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RenderToImageOptions)) {
            return false;
        }
        RenderToImageOptions renderToImageOptions = (RenderToImageOptions) other;
        return Intrinsics.b(this.fontFamily, renderToImageOptions.fontFamily) && Float.compare(this.size, renderToImageOptions.size) == 0 && this.color == renderToImageOptions.color;
    }

    public final int getColor() {
        return this.color;
    }

    @NotNull
    public final String getFontFamily() {
        return this.fontFamily;
    }

    public final float getSize() {
        return this.size;
    }

    public int hashCode() {
        return (((this.fontFamily.hashCode() * 31) + Float.hashCode(this.size)) * 31) + Integer.hashCode(this.color);
    }

    @NotNull
    public String toString() {
        return "RenderToImageOptions(fontFamily=" + this.fontFamily + ", size=" + this.size + ", color=" + this.color + ")";
    }
}
