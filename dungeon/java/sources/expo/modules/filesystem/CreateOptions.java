package expo.modules.filesystem;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p103fc.b;
import p103fc.c;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ.\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0018\u0012\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0019\u0010\tR \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010\u0018\u0012\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u001c\u0010\tR \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0018\u0012\u0004\b\u001f\u0010\u001b\u001a\u0004\b\u001e\u0010\t¨\u0006 "}, d2 = {"Lexpo/modules/filesystem/CreateOptions;", "Lfc/c;", "", "intermediates", "overwrite", "idempotent", "<init>", "(ZZZ)V", "component1", "()Z", "component2", "component3", "copy", "(ZZZ)Lexpo/modules/filesystem/CreateOptions;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getIntermediates", "getIntermediates$annotations", "()V", "getOverwrite", "getOverwrite$annotations", "getIdempotent", "getIdempotent$annotations", "expo-file-system_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class CreateOptions implements c {
    private final boolean idempotent;
    private final boolean intermediates;
    private final boolean overwrite;

    public CreateOptions() {
        this(false, false, false, 7, null);
    }

    public CreateOptions(boolean z10, boolean z11, boolean z12) {
        this.intermediates = z10;
        this.overwrite = z11;
        this.idempotent = z12;
    }

    public /* synthetic */ CreateOptions(boolean z10, boolean z11, boolean z12, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? false : z11, (i10 & 4) != 0 ? false : z12);
    }

    public static /* synthetic */ CreateOptions copy$default(CreateOptions createOptions, boolean z10, boolean z11, boolean z12, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = createOptions.intermediates;
        }
        if ((i10 & 2) != 0) {
            z11 = createOptions.overwrite;
        }
        if ((i10 & 4) != 0) {
            z12 = createOptions.idempotent;
        }
        return createOptions.copy(z10, z11, z12);
    }

    @b
    public static /* synthetic */ void getIdempotent$annotations() {
    }

    @b
    public static /* synthetic */ void getIntermediates$annotations() {
    }

    @b
    public static /* synthetic */ void getOverwrite$annotations() {
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIntermediates() {
        return this.intermediates;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getOverwrite() {
        return this.overwrite;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIdempotent() {
        return this.idempotent;
    }

    @NotNull
    public final CreateOptions copy(boolean intermediates, boolean overwrite, boolean idempotent) {
        return new CreateOptions(intermediates, overwrite, idempotent);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CreateOptions)) {
            return false;
        }
        CreateOptions createOptions = (CreateOptions) other;
        return this.intermediates == createOptions.intermediates && this.overwrite == createOptions.overwrite && this.idempotent == createOptions.idempotent;
    }

    public final boolean getIdempotent() {
        return this.idempotent;
    }

    public final boolean getIntermediates() {
        return this.intermediates;
    }

    public final boolean getOverwrite() {
        return this.overwrite;
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.intermediates) * 31) + Boolean.hashCode(this.overwrite)) * 31) + Boolean.hashCode(this.idempotent);
    }

    @NotNull
    public String toString() {
        return "CreateOptions(intermediates=" + this.intermediates + ", overwrite=" + this.overwrite + ", idempotent=" + this.idempotent + ")";
    }
}
