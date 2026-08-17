package expo.modules.sqlite;

import com.facebook.jni.HybridData;
import java.io.Closeable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0086 J\u0013\u0010\u000e\u001a\u00020\t2\b\u0010\u000f\u001a\u0004\u0018\u00010\rH\u0086 J\u0011\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0012H\u0086 J\t\u0010\u0013\u001a\u00020\u0007H\u0086 J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0086 J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0086 J\u0019\u0010\u0017\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u0015H\u0086 J\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0018\u001a\u00020\u0015H\u0086 J\t\u0010\u001a\u001a\u00020\u0005H\u0082 R\u0010\u0010\u0004\u001a\u00020\u00058\u0002X\u0083\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lexpo/modules/sqlite/NativeSessionBinding;", "Ljava/io/Closeable;", "<init>", "()V", "mHybridData", "Lcom/facebook/jni/HybridData;", "close", "", "sqlite3session_create", "", "db", "Lexpo/modules/sqlite/NativeDatabaseBinding;", "dbName", "", "sqlite3session_attach", "tableName", "sqlite3session_enable", "enabled", "", "sqlite3session_delete", "sqlite3session_changeset", "", "sqlite3session_changeset_inverted", "sqlite3changeset_apply", "changeset", "sqlite3changeset_invert", "initHybrid", "expo-sqlite_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class NativeSessionBinding implements Closeable {

    @NotNull
    private final HybridData mHybridData = initHybrid();

    private final native HybridData initHybrid();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.mHybridData.resetNative();
    }

    public final native int sqlite3changeset_apply(@NotNull NativeDatabaseBinding db2, @NotNull byte[] changeset);

    @Nullable
    public final native byte[] sqlite3changeset_invert(@NotNull byte[] changeset);

    public final native int sqlite3session_attach(@Nullable String tableName);

    @Nullable
    public final native byte[] sqlite3session_changeset();

    @Nullable
    public final native byte[] sqlite3session_changeset_inverted();

    public final native int sqlite3session_create(@NotNull NativeDatabaseBinding db2, @NotNull String dbName);

    public final native void sqlite3session_delete();

    public final native int sqlite3session_enable(boolean enabled);
}
