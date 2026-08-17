package expo.modules.updates.reloadscreen;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p103fc.b;
import p103fc.c;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ4\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0012\u0010\rJ\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00022\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u001a\u0012\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001b\u0010\u000bR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u001e\u0012\u0004\b \u0010\u001d\u001a\u0004\b\u001f\u0010\rR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010!\u0012\u0004\b#\u0010\u001d\u001a\u0004\b\"\u0010\u000f¨\u0006$"}, d2 = {"Lexpo/modules/updates/reloadscreen/SpinnerOptions;", "Lfc/c;", "", "enabled", "", "color", "Lexpo/modules/updates/reloadscreen/SpinnerSize;", "size", "<init>", "(Ljava/lang/Boolean;Ljava/lang/String;Lexpo/modules/updates/reloadscreen/SpinnerSize;)V", "component1", "()Ljava/lang/Boolean;", "component2", "()Ljava/lang/String;", "component3", "()Lexpo/modules/updates/reloadscreen/SpinnerSize;", "copy", "(Ljava/lang/Boolean;Ljava/lang/String;Lexpo/modules/updates/reloadscreen/SpinnerSize;)Lexpo/modules/updates/reloadscreen/SpinnerOptions;", "toString", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Boolean;", "getEnabled", "getEnabled$annotations", "()V", "Ljava/lang/String;", "getColor", "getColor$annotations", "Lexpo/modules/updates/reloadscreen/SpinnerSize;", "getSize", "getSize$annotations", "expo-updates_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class SpinnerOptions implements c {

    @Nullable
    private final String color;

    @Nullable
    private final Boolean enabled;

    @Nullable
    private final SpinnerSize size;

    public SpinnerOptions() {
        this(null, null, null, 7, null);
    }

    public SpinnerOptions(@Nullable Boolean bool, @Nullable String str, @Nullable SpinnerSize spinnerSize) {
        this.enabled = bool;
        this.color = str;
        this.size = spinnerSize;
    }

    public /* synthetic */ SpinnerOptions(Boolean bool, String str, SpinnerSize spinnerSize, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : bool, (i10 & 2) != 0 ? null : str, (i10 & 4) != 0 ? null : spinnerSize);
    }

    public static /* synthetic */ SpinnerOptions copy$default(SpinnerOptions spinnerOptions, Boolean bool, String str, SpinnerSize spinnerSize, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            bool = spinnerOptions.enabled;
        }
        if ((i10 & 2) != 0) {
            str = spinnerOptions.color;
        }
        if ((i10 & 4) != 0) {
            spinnerSize = spinnerOptions.size;
        }
        return spinnerOptions.copy(bool, str, spinnerSize);
    }

    @b
    public static /* synthetic */ void getColor$annotations() {
    }

    @b
    public static /* synthetic */ void getEnabled$annotations() {
    }

    @b
    public static /* synthetic */ void getSize$annotations() {
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Boolean getEnabled() {
        return this.enabled;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getColor() {
        return this.color;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final SpinnerSize getSize() {
        return this.size;
    }

    @NotNull
    public final SpinnerOptions copy(@Nullable Boolean enabled, @Nullable String color, @Nullable SpinnerSize size) {
        return new SpinnerOptions(enabled, color, size);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SpinnerOptions)) {
            return false;
        }
        SpinnerOptions spinnerOptions = (SpinnerOptions) other;
        return Intrinsics.b(this.enabled, spinnerOptions.enabled) && Intrinsics.b(this.color, spinnerOptions.color) && this.size == spinnerOptions.size;
    }

    @Nullable
    public final String getColor() {
        return this.color;
    }

    @Nullable
    public final Boolean getEnabled() {
        return this.enabled;
    }

    @Nullable
    public final SpinnerSize getSize() {
        return this.size;
    }

    public int hashCode() {
        Boolean bool = this.enabled;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.color;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        SpinnerSize spinnerSize = this.size;
        return iHashCode2 + (spinnerSize != null ? spinnerSize.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "SpinnerOptions(enabled=" + this.enabled + ", color=" + this.color + ", size=" + this.size + ")";
    }
}
