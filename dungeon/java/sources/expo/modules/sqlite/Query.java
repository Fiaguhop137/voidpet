package expo.modules.sqlite;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p103fc.b;
import p103fc.c;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ,\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\nJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0017\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0018\u0010\nR(\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010\u001b\u0012\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001c\u0010\f¨\u0006\u001e"}, d2 = {"Lexpo/modules/sqlite/Query;", "Lfc/c;", "", "sql", "", "", "args", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/util/List;)Lexpo/modules/sqlite/Query;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getSql", "getSql$annotations", "()V", "Ljava/util/List;", "getArgs", "getArgs$annotations", "expo-sqlite_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class Query implements c {

    @NotNull
    private final List<Object> args;

    @NotNull
    private final String sql;

    public Query(@NotNull String sql, @NotNull List<? extends Object> args) {
        Intrinsics.checkNotNullParameter(sql, "sql");
        Intrinsics.checkNotNullParameter(args, "args");
        this.sql = sql;
        this.args = args;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Query copy$default(Query query, String str, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = query.sql;
        }
        if ((i10 & 2) != 0) {
            list = query.args;
        }
        return query.copy(str, list);
    }

    @b
    public static /* synthetic */ void getArgs$annotations() {
    }

    @b
    public static /* synthetic */ void getSql$annotations() {
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSql() {
        return this.sql;
    }

    @NotNull
    public final List<Object> component2() {
        return this.args;
    }

    @NotNull
    public final Query copy(@NotNull String sql, @NotNull List<? extends Object> args) {
        Intrinsics.checkNotNullParameter(sql, "sql");
        Intrinsics.checkNotNullParameter(args, "args");
        return new Query(sql, args);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Query)) {
            return false;
        }
        Query query = (Query) other;
        return Intrinsics.b(this.sql, query.sql) && Intrinsics.b(this.args, query.args);
    }

    @NotNull
    public final List<Object> getArgs() {
        return this.args;
    }

    @NotNull
    public final String getSql() {
        return this.sql;
    }

    public int hashCode() {
        return (this.sql.hashCode() * 31) + this.args.hashCode();
    }

    @NotNull
    public String toString() {
        return "Query(sql=" + this.sql + ", args=" + this.args + ")";
    }
}
