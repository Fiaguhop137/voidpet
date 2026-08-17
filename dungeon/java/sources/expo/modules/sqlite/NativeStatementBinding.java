package expo.modules.sqlite;

import com.facebook.jni.HybridData;
import java.io.Closeable;
import java.util.ArrayList;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\u0011\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0086 J\t\u0010\f\u001a\u00020\tH\u0086 J\t\u0010\r\u001a\u00020\tH\u0086 J\u0011\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\tH\u0086 J\t\u0010\u0010\u001a\u00020\tH\u0086 J\t\u0010\u0011\u001a\u00020\tH\u0086 J\t\u0010\u0012\u001a\u00020\tH\u0086 J\u001b\u0010\u0013\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0086 J\u0013\u0010\u0016\u001a\f\u0012\u0004\u0012\u00020\u000b0\u0017j\u0002`\u0018H\u0086 J\u0013\u0010\u0019\u001a\f\u0012\u0004\u0012\u00020\u00150\u0017j\u0002`\u001aH\u0086 J\t\u0010\u001b\u001a\u00020\u0005H\u0082 R\u0010\u0010\u0004\u001a\u00020\u00058\u0002X\u0083\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lexpo/modules/sqlite/NativeStatementBinding;", "Ljava/io/Closeable;", "<init>", "()V", "mHybridData", "Lcom/facebook/jni/HybridData;", "close", "", "sqlite3_bind_parameter_index", "", "name", "", "sqlite3_clear_bindings", "sqlite3_column_count", "sqlite3_column_name", "index", "sqlite3_finalize", "sqlite3_reset", "sqlite3_step", "bindStatementParam", "param", "", "getColumnNames", "Ljava/util/ArrayList;", "Lexpo/modules/sqlite/SQLiteColumnNames;", "getColumnValues", "Lexpo/modules/sqlite/SQLiteColumnValues;", "initHybrid", "expo-sqlite_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class NativeStatementBinding implements Closeable {

    @NotNull
    private final HybridData mHybridData = initHybrid();

    private final native HybridData initHybrid();

    public final native int bindStatementParam(int index, @Nullable Object param);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.mHybridData.resetNative();
    }

    @NotNull
    public final native ArrayList<String> getColumnNames();

    @NotNull
    public final native ArrayList<Object> getColumnValues();

    public final native int sqlite3_bind_parameter_index(@NotNull String name);

    public final native int sqlite3_clear_bindings();

    public final native int sqlite3_column_count();

    @NotNull
    public final native String sqlite3_column_name(int index);

    public final native int sqlite3_finalize();

    public final native int sqlite3_reset();

    public final native int sqlite3_step();
}
