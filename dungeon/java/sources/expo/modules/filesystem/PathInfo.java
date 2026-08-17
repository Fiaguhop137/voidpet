package expo.modules.filesystem;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p103fc.b;
import p103fc.c;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ&\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R(\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0003\u0010\u0017\u0012\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0018\u0010\b\"\u0004\b\u0019\u0010\u001aR*\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0004\u0010\u001d\u0012\u0004\b \u0010\u001c\u001a\u0004\b\u0004\u0010\n\"\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lexpo/modules/filesystem/PathInfo;", "Lfc/c;", "", "exists", "isDirectory", "<init>", "(ZLjava/lang/Boolean;)V", "component1", "()Z", "component2", "()Ljava/lang/Boolean;", "copy", "(ZLjava/lang/Boolean;)Lexpo/modules/filesystem/PathInfo;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getExists", "setExists", "(Z)V", "getExists$annotations", "()V", "Ljava/lang/Boolean;", "setDirectory", "(Ljava/lang/Boolean;)V", "isDirectory$annotations", "expo-file-system_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class PathInfo implements c {
    private boolean exists;

    @Nullable
    private Boolean isDirectory;

    public PathInfo(boolean z10, @Nullable Boolean bool) {
        this.exists = z10;
        this.isDirectory = bool;
    }

    public static /* synthetic */ PathInfo copy$default(PathInfo pathInfo, boolean z10, Boolean bool, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = pathInfo.exists;
        }
        if ((i10 & 2) != 0) {
            bool = pathInfo.isDirectory;
        }
        return pathInfo.copy(z10, bool);
    }

    @b
    public static /* synthetic */ void getExists$annotations() {
    }

    @b
    public static /* synthetic */ void isDirectory$annotations() {
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getExists() {
        return this.exists;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Boolean getIsDirectory() {
        return this.isDirectory;
    }

    @NotNull
    public final PathInfo copy(boolean exists, @Nullable Boolean isDirectory) {
        return new PathInfo(exists, isDirectory);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PathInfo)) {
            return false;
        }
        PathInfo pathInfo = (PathInfo) other;
        return this.exists == pathInfo.exists && Intrinsics.b(this.isDirectory, pathInfo.isDirectory);
    }

    public final boolean getExists() {
        return this.exists;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.exists) * 31;
        Boolean bool = this.isDirectory;
        return iHashCode + (bool == null ? 0 : bool.hashCode());
    }

    @Nullable
    public final Boolean isDirectory() {
        return this.isDirectory;
    }

    public final void setDirectory(@Nullable Boolean bool) {
        this.isDirectory = bool;
    }

    public final void setExists(boolean z10) {
        this.exists = z10;
    }

    @NotNull
    public String toString() {
        return "PathInfo(exists=" + this.exists + ", isDirectory=" + this.isDirectory + ")";
    }
}
