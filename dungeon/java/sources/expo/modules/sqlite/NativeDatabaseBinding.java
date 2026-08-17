package expo.modules.sqlite;

import Md.o;
import com.facebook.jni.HybridData;
import java.io.Closeable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0013\b\u0001\u0018\u0000 F2\u00020\u0001:\u0001\u0019B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0082 ¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tH\u0082 ¢\u0006\u0004\b\n\u0010\u000bJ/\u0010\u0013\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0015\u0010\u0003J7\u0010\u0019\u001a\u00020\u00062(\u0010\u0018\u001a$\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00060\u0016j\u0002`\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\fH\u0086 ¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0006H\u0086 ¢\u0006\u0004\b\u001d\u0010\u0003J\u0010\u0010\u001e\u001a\u00020\fH\u0086 ¢\u0006\u0004\b\u001e\u0010\u001cJ\u0018\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0086 ¢\u0006\u0004\b\u001f\u0010 J\u0018\u0010\"\u001a\u00020\f2\u0006\u0010!\u001a\u00020\fH\u0086 ¢\u0006\u0004\b\"\u0010#J\u0018\u0010%\u001a\u00020\f2\u0006\u0010$\u001a\u00020\u000eH\u0086 ¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\fH\u0086 ¢\u0006\u0004\b'\u0010\u001cJ\u0010\u0010(\u001a\u00020\u0011H\u0086 ¢\u0006\u0004\b(\u0010)J \u0010,\u001a\u00020\f2\u0006\u0010*\u001a\u00020\u000e2\u0006\u0010+\u001a\u00020\u000eH\u0086 ¢\u0006\u0004\b,\u0010-J\u0018\u0010/\u001a\u00020\f2\u0006\u0010.\u001a\u00020\u000eH\u0086 ¢\u0006\u0004\b/\u0010&J \u00102\u001a\u00020\f2\u0006\u0010$\u001a\u00020\u000e2\u0006\u00101\u001a\u000200H\u0086 ¢\u0006\u0004\b2\u00103J\u0018\u00105\u001a\u0002042\u0006\u0010\u000f\u001a\u00020\u000eH\u0086 ¢\u0006\u0004\b5\u00106J \u00108\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u00107\u001a\u000204H\u0086 ¢\u0006\u0004\b8\u00109J \u0010<\u001a\u00020\f2\u0006\u0010:\u001a\u00020\u000e2\u0006\u0010;\u001a\u00020\u000eH\u0086 ¢\u0006\u0004\b<\u0010-J(\u0010=\u001a\u00020\f2\u0006\u0010.\u001a\u00020\u000e2\u0006\u0010:\u001a\u00020\u000e2\u0006\u0010;\u001a\u00020\u000eH\u0086 ¢\u0006\u0004\b=\u0010>J\u0010\u0010?\u001a\u00020\fH\u0086 ¢\u0006\u0004\b?\u0010\u001cJ\u0010\u0010@\u001a\u00020\u000eH\u0086 ¢\u0006\u0004\b@\u0010AR\u0014\u0010B\u001a\u00020\t8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bB\u0010CR<\u0010E\u001a(\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0016j\u0004\u0018\u0001`\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010D¨\u0006G"}, d2 = {"Lexpo/modules/sqlite/NativeDatabaseBinding;", "Ljava/io/Closeable;", "<init>", "()V", "", "enabled", "", "sqlite3_update_hook", "(Z)V", "Lcom/facebook/jni/HybridData;", "initHybrid", "()Lcom/facebook/jni/HybridData;", "", "action", "", "databaseName", "tableName", "", "rowId", "onUpdate", "(ILjava/lang/String;Ljava/lang/String;J)V", "close", "Lkotlin/Function4;", "Lexpo/modules/sqlite/UpdateListener;", "listener", "a", "(LMd/o;)V", "sqlite3_changes", "()I", "sqlite3_finalize_all_statement", "sqlite3_close", "sqlite3_db_filename", "(Ljava/lang/String;)Ljava/lang/String;", "onoff", "sqlite3_enable_load_extension", "(I)I", "source", "sqlite3_exec", "(Ljava/lang/String;)I", "sqlite3_get_autocommit", "sqlite3_last_insert_rowid", "()J", "libPath", "entryPoint", "sqlite3_load_extension", "(Ljava/lang/String;Ljava/lang/String;)I", "dbPath", "sqlite3_open", "Lexpo/modules/sqlite/NativeStatementBinding;", "statement", "sqlite3_prepare_v2", "(Ljava/lang/String;Lexpo/modules/sqlite/NativeStatementBinding;)I", "", "sqlite3_serialize", "(Ljava/lang/String;)[B", "serializedData", "sqlite3_deserialize", "(Ljava/lang/String;[B)I", "url", "authToken", "libsql_open_remote", "libsql_open", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I", "libsql_sync", "convertSqlLiteErrorToString", "()Ljava/lang/String;", "mHybridData", "Lcom/facebook/jni/HybridData;", "LMd/o;", "mUpdateListener", "b", "expo-sqlite_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class NativeDatabaseBinding implements Closeable {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private o mUpdateListener;

    @NotNull
    private final HybridData mHybridData = initHybrid();

    /* JADX INFO: renamed from: expo.modules.sqlite.NativeDatabaseBinding$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a(NativeDatabaseBinding nativeDatabaseBinding, String str, NativeDatabaseBinding nativeDatabaseBinding2, String str2) {
            return NativeDatabaseBinding.sqlite3_backup(nativeDatabaseBinding, str, nativeDatabaseBinding2, str2);
        }
    }

    static {
        System.loadLibrary("expo-sqlite");
    }

    private final native HybridData initHybrid();

    private final void onUpdate(int action, String databaseName, String tableName, long rowId) {
        o oVar = this.mUpdateListener;
        if (oVar != null) {
            oVar.c(databaseName, tableName, Integer.valueOf(action), Long.valueOf(rowId));
        }
    }

    public static final native int sqlite3_backup(@NotNull NativeDatabaseBinding nativeDatabaseBinding, @NotNull String str, @NotNull NativeDatabaseBinding nativeDatabaseBinding2, @NotNull String str2);

    private final native void sqlite3_update_hook(boolean enabled);

    public final void a(o listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        sqlite3_update_hook(true);
        this.mUpdateListener = listener;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.mHybridData.resetNative();
    }

    @NotNull
    public final native String convertSqlLiteErrorToString();

    public final native int libsql_open(@NotNull String dbPath, @NotNull String url, @NotNull String authToken);

    public final native int libsql_open_remote(@NotNull String url, @NotNull String authToken);

    public final native int libsql_sync();

    public final native int sqlite3_changes();

    public final native int sqlite3_close();

    @NotNull
    public final native String sqlite3_db_filename(@NotNull String databaseName);

    public final native int sqlite3_deserialize(@NotNull String databaseName, @NotNull byte[] serializedData);

    public final native int sqlite3_enable_load_extension(int onoff);

    public final native int sqlite3_exec(@NotNull String source);

    public final native void sqlite3_finalize_all_statement();

    public final native int sqlite3_get_autocommit();

    public final native long sqlite3_last_insert_rowid();

    public final native int sqlite3_load_extension(@NotNull String libPath, @NotNull String entryPoint);

    public final native int sqlite3_open(@NotNull String dbPath);

    public final native int sqlite3_prepare_v2(@NotNull String source, @NotNull NativeStatementBinding statement);

    @NotNull
    public final native byte[] sqlite3_serialize(@NotNull String databaseName);
}
