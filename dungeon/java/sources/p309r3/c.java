package p309r3;

import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteStatement;
import android.os.CancellationSignal;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o;
import p291q3.g;
import p291q3.j;
import p291q3.k;

/* JADX INFO: loaded from: classes.dex */
public final class c implements g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f52125b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String[] f52126c = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String[] f52127d = new String[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SQLiteDatabase f52128a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static final class b extends o implements Md.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ j f52129a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(j jVar) {
            super(4);
            this.f52129a = jVar;
        }

        @Override // Md.o
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SQLiteCursor c(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            j jVar = this.f52129a;
            Intrinsics.c(sQLiteQuery);
            jVar.a(new g(sQLiteQuery));
            return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }
    }

    public c(SQLiteDatabase delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f52128a = delegate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Cursor d(Md.o tmp0, SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        return (Cursor) tmp0.c(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Cursor e(j query, SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
        Intrinsics.checkNotNullParameter(query, "$query");
        Intrinsics.c(sQLiteQuery);
        query.a(new g(sQLiteQuery));
        return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
    }

    @Override // p291q3.g
    public Cursor C0(j query, CancellationSignal cancellationSignal) {
        Intrinsics.checkNotNullParameter(query, "query");
        SQLiteDatabase sQLiteDatabase = this.f52128a;
        String strB = query.b();
        String[] strArr = f52127d;
        Intrinsics.c(cancellationSignal);
        return p291q3.b.c(sQLiteDatabase, strB, strArr, null, cancellationSignal, new p309r3.a(query));
    }

    @Override // p291q3.g
    public String H() {
        return this.f52128a.getPath();
    }

    @Override // p291q3.g
    public boolean I3() {
        return p291q3.b.b(this.f52128a);
    }

    @Override // p291q3.g
    public void M0() {
        this.f52128a.setTransactionSuccessful();
    }

    @Override // p291q3.g
    public void O0(String sql, Object[] bindArgs) {
        Intrinsics.checkNotNullParameter(sql, "sql");
        Intrinsics.checkNotNullParameter(bindArgs, "bindArgs");
        this.f52128a.execSQL(sql, bindArgs);
    }

    @Override // p291q3.g
    public void P0() {
        this.f52128a.beginTransactionNonExclusive();
    }

    @Override // p291q3.g
    public Cursor Z2(String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        return z1(new p291q3.a(query));
    }

    @Override // p291q3.g
    public void a0() {
        this.f52128a.beginTransaction();
    }

    public final boolean c(SQLiteDatabase sqLiteDatabase) {
        Intrinsics.checkNotNullParameter(sqLiteDatabase, "sqLiteDatabase");
        return Intrinsics.b(this.f52128a, sqLiteDatabase);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f52128a.close();
    }

    @Override // p291q3.g
    public List f0() {
        return this.f52128a.getAttachedDbs();
    }

    @Override // p291q3.g
    public void f1() {
        this.f52128a.endTransaction();
    }

    @Override // p291q3.g
    public void i0(String sql) {
        Intrinsics.checkNotNullParameter(sql, "sql");
        this.f52128a.execSQL(sql);
    }

    @Override // p291q3.g
    public boolean isOpen() {
        return this.f52128a.isOpen();
    }

    @Override // p291q3.g
    public k v2(String sql) {
        Intrinsics.checkNotNullParameter(sql, "sql");
        SQLiteStatement sQLiteStatementCompileStatement = this.f52128a.compileStatement(sql);
        Intrinsics.checkNotNullExpressionValue(sQLiteStatementCompileStatement, "delegate.compileStatement(sql)");
        return new h(sQLiteStatementCompileStatement);
    }

    @Override // p291q3.g
    public boolean v3() {
        return this.f52128a.inTransaction();
    }

    @Override // p291q3.g
    public Cursor z1(j query) {
        Intrinsics.checkNotNullParameter(query, "query");
        Cursor cursorRawQueryWithFactory = this.f52128a.rawQueryWithFactory(new p309r3.b(new b(query)), query.b(), f52127d, null);
        Intrinsics.checkNotNullExpressionValue(cursorRawQueryWithFactory, "delegate.rawQueryWithFac…EMPTY_STRING_ARRAY, null)");
        return cursorRawQueryWithFactory;
    }
}
