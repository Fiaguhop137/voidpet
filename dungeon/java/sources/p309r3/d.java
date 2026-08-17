package p309r3;

import Ad.j;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import java.io.File;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o;
import p291q3.g;
import p291q3.h;

/* JADX INFO: loaded from: classes.dex */
public final class d implements h {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f52130h = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f52131a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f52132b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final h.a f52133c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f52134d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f52135e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Lazy f52136f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f52137g;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private p309r3.c f52138a;

        public b(p309r3.c cVar) {
            this.f52138a = cVar;
        }

        public final p309r3.c a() {
            return this.f52138a;
        }

        public final void b(p309r3.c cVar) {
            this.f52138a = cVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class c extends SQLiteOpenHelper {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final C0625c f52139h = new C0625c(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f52140a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final b f52141b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final h.a f52142c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final boolean f52143d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f52144e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final p327s3.a f52145f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f52146g;

        private static final class a extends RuntimeException {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final b f52147a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final Throwable f52148b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(b callbackName, Throwable cause) {
                super(cause);
                Intrinsics.checkNotNullParameter(callbackName, "callbackName");
                Intrinsics.checkNotNullParameter(cause, "cause");
                this.f52147a = callbackName;
                this.f52148b = cause;
            }

            public final b a() {
                return this.f52147a;
            }

            @Override // java.lang.Throwable
            public Throwable getCause() {
                return this.f52148b;
            }
        }

        public enum b {
            ON_CONFIGURE,
            ON_CREATE,
            ON_UPGRADE,
            ON_DOWNGRADE,
            ON_OPEN
        }

        /* JADX INFO: renamed from: r3.d$c$c, reason: collision with other inner class name */
        public static final class C0625c {
            private C0625c() {
            }

            public /* synthetic */ C0625c(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final p309r3.c a(b refHolder, SQLiteDatabase sqLiteDatabase) {
                Intrinsics.checkNotNullParameter(refHolder, "refHolder");
                Intrinsics.checkNotNullParameter(sqLiteDatabase, "sqLiteDatabase");
                p309r3.c cVarA = refHolder.a();
                if (cVarA != null && cVarA.c(sqLiteDatabase)) {
                    return cVarA;
                }
                p309r3.c cVar = new p309r3.c(sqLiteDatabase);
                refHolder.b(cVar);
                return cVar;
            }
        }

        /* JADX INFO: renamed from: r3.d$c$d, reason: collision with other inner class name */
        public /* synthetic */ class C0626d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f52155a;

            static {
                int[] iArr = new int[b.values().length];
                try {
                    iArr[b.ON_CONFIGURE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[b.ON_CREATE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[b.ON_UPGRADE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[b.ON_DOWNGRADE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[b.ON_OPEN.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                f52155a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Context context, String str, b dbRef, h.a callback, boolean z10) {
            String string;
            super(context, str, null, callback.f51414a, new e(callback, dbRef));
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(dbRef, "dbRef");
            Intrinsics.checkNotNullParameter(callback, "callback");
            this.f52140a = context;
            this.f52141b = dbRef;
            this.f52142c = callback;
            this.f52143d = z10;
            if (str == null) {
                string = UUID.randomUUID().toString();
                Intrinsics.checkNotNullExpressionValue(string, "randomUUID().toString()");
            } else {
                string = str;
            }
            this.f52145f = new p327s3.a(string, context.getCacheDir(), false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(h.a callback, b dbRef, SQLiteDatabase dbObj) {
            Intrinsics.checkNotNullParameter(callback, "$callback");
            Intrinsics.checkNotNullParameter(dbRef, "$dbRef");
            C0625c c0625c = f52139h;
            Intrinsics.checkNotNullExpressionValue(dbObj, "dbObj");
            callback.c(c0625c.a(dbRef, dbObj));
        }

        private final SQLiteDatabase e(boolean z10) {
            if (z10) {
                SQLiteDatabase writableDatabase = super.getWritableDatabase();
                Intrinsics.checkNotNullExpressionValue(writableDatabase, "{\n                super.…eDatabase()\n            }");
                return writableDatabase;
            }
            SQLiteDatabase readableDatabase = super.getReadableDatabase();
            Intrinsics.checkNotNullExpressionValue(readableDatabase, "{\n                super.…eDatabase()\n            }");
            return readableDatabase;
        }

        private final SQLiteDatabase f(boolean z10) throws Throwable {
            File parentFile;
            String databaseName = getDatabaseName();
            boolean z11 = this.f52146g;
            if (databaseName != null && !z11 && (parentFile = this.f52140a.getDatabasePath(databaseName).getParentFile()) != null) {
                parentFile.mkdirs();
                if (!parentFile.isDirectory()) {
                    Log.w("SupportSQLite", "Invalid database parent file, not a directory: " + parentFile);
                }
            }
            try {
                return e(z10);
            } catch (Throwable unused) {
                super.close();
                try {
                    Thread.sleep(500L);
                } catch (InterruptedException unused2) {
                }
                try {
                    return e(z10);
                } catch (Throwable th) {
                    super.close();
                    if (th instanceof a) {
                        a aVar = th;
                        Throwable cause = aVar.getCause();
                        int i10 = C0626d.f52155a[aVar.a().ordinal()];
                        if (i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4 || !(cause instanceof SQLiteException)) {
                            throw cause;
                        }
                    } else if (!(th instanceof SQLiteException) || databaseName == null || !this.f52143d) {
                        throw th;
                    }
                    this.f52140a.deleteDatabase(databaseName);
                    try {
                        return e(z10);
                    } catch (a e10) {
                        throw e10.getCause();
                    }
                }
            }
        }

        public final g c(boolean z10) {
            g gVarD;
            try {
                this.f52145f.b((this.f52146g || getDatabaseName() == null) ? false : true);
                this.f52144e = false;
                SQLiteDatabase sQLiteDatabaseF = f(z10);
                if (this.f52144e) {
                    close();
                    gVarD = c(z10);
                } else {
                    gVarD = d(sQLiteDatabaseF);
                }
                return gVarD;
            } finally {
                this.f52145f.d();
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
        public void close() {
            try {
                p327s3.a.c(this.f52145f, false, 1, null);
                super.close();
                this.f52141b.b(null);
                this.f52146g = false;
            } finally {
                this.f52145f.d();
            }
        }

        public final p309r3.c d(SQLiteDatabase sqLiteDatabase) {
            Intrinsics.checkNotNullParameter(sqLiteDatabase, "sqLiteDatabase");
            return f52139h.a(this.f52141b, sqLiteDatabase);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onConfigure(SQLiteDatabase db2) {
            Intrinsics.checkNotNullParameter(db2, "db");
            if (!this.f52144e && this.f52142c.f51414a != db2.getVersion()) {
                db2.setMaxSqlCacheSize(1);
            }
            try {
                this.f52142c.b(d(db2));
            } catch (Throwable th) {
                throw new a(b.ON_CONFIGURE, th);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sqLiteDatabase) {
            Intrinsics.checkNotNullParameter(sqLiteDatabase, "sqLiteDatabase");
            try {
                this.f52142c.d(d(sqLiteDatabase));
            } catch (Throwable th) {
                throw new a(b.ON_CREATE, th);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onDowngrade(SQLiteDatabase db2, int i10, int i11) {
            Intrinsics.checkNotNullParameter(db2, "db");
            this.f52144e = true;
            try {
                this.f52142c.e(d(db2), i10, i11);
            } catch (Throwable th) {
                throw new a(b.ON_DOWNGRADE, th);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onOpen(SQLiteDatabase db2) {
            Intrinsics.checkNotNullParameter(db2, "db");
            if (!this.f52144e) {
                try {
                    this.f52142c.f(d(db2));
                } catch (Throwable th) {
                    throw new a(b.ON_OPEN, th);
                }
            }
            this.f52146g = true;
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i10, int i11) {
            Intrinsics.checkNotNullParameter(sqLiteDatabase, "sqLiteDatabase");
            this.f52144e = true;
            try {
                this.f52142c.g(d(sqLiteDatabase), i10, i11);
            } catch (Throwable th) {
                throw new a(b.ON_UPGRADE, th);
            }
        }
    }

    /* JADX INFO: renamed from: r3.d$d, reason: collision with other inner class name */
    static final class C0627d extends o implements Function0 {
        C0627d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final c invoke() {
            c cVar;
            if (d.this.f52132b == null || !d.this.f52134d) {
                cVar = new c(d.this.f52131a, d.this.f52132b, new b(null), d.this.f52133c, d.this.f52135e);
            } else {
                cVar = new c(d.this.f52131a, new File(p291q3.d.a(d.this.f52131a), d.this.f52132b).getAbsolutePath(), new b(null), d.this.f52133c, d.this.f52135e);
            }
            p291q3.b.d(cVar, d.this.f52137g);
            return cVar;
        }
    }

    public d(Context context, String str, h.a callback, boolean z10, boolean z11) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f52131a = context;
        this.f52132b = str;
        this.f52133c = callback;
        this.f52134d = z10;
        this.f52135e = z11;
        this.f52136f = j.b(new C0627d());
    }

    private final c g() {
        return (c) this.f52136f.getValue();
    }

    @Override // p291q3.h
    public g X2() {
        return g().c(true);
    }

    @Override // p291q3.h, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f52136f.isInitialized()) {
            g().close();
        }
    }

    @Override // p291q3.h
    public String getDatabaseName() {
        return this.f52132b;
    }

    @Override // p291q3.h
    public void setWriteAheadLoggingEnabled(boolean z10) {
        if (this.f52136f.isInitialized()) {
            p291q3.b.d(g(), z10);
        }
        this.f52137g = z10;
    }
}
