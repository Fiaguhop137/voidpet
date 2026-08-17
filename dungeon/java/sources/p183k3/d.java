package p183k3;

import android.content.ContentResolver;
import android.database.CharArrayBuffer;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3975l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o;
import p291q3.e;
import p291q3.f;
import p291q3.g;
import p291q3.h;
import p291q3.j;
import p291q3.k;

/* JADX INFO: loaded from: classes.dex */
public final class d implements h, g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h f47824a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p183k3.c f47825b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f47826c;

    public static final class a implements p291q3.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final p183k3.c f47827a;

        /* JADX INFO: renamed from: k3.d$a$a, reason: collision with other inner class name */
        static final class C0560a extends o implements Function1 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0560a f47828a = new C0560a();

            C0560a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final List invoke(p291q3.g obj) {
                Intrinsics.checkNotNullParameter(obj, "obj");
                return obj.f0();
            }
        }

        static final class b extends o implements Function1 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f47829a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(String str) {
                super(1);
                this.f47829a = str;
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(p291q3.g db2) {
                Intrinsics.checkNotNullParameter(db2, "db");
                db2.i0(this.f47829a);
                return null;
            }
        }

        static final class c extends o implements Function1 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f47830a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Object[] f47831b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(String str, Object[] objArr) {
                super(1);
                this.f47830a = str;
                this.f47831b = objArr;
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(p291q3.g db2) {
                Intrinsics.checkNotNullParameter(db2, "db");
                db2.O0(this.f47830a, this.f47831b);
                return null;
            }
        }

        /* JADX INFO: renamed from: k3.d$a$d, reason: collision with other inner class name */
        /* synthetic */ class C0561d extends AbstractC3975l implements Function1 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0561d f47832a = new C0561d();

            C0561d() {
                super(1, p291q3.g.class, "inTransaction", "inTransaction()Z", 0);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(p291q3.g p10) {
                Intrinsics.checkNotNullParameter(p10, "p0");
                return Boolean.valueOf(p10.v3());
            }
        }

        static final class e extends o implements Function1 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final e f47833a = new e();

            e() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(p291q3.g db2) {
                Intrinsics.checkNotNullParameter(db2, "db");
                return Boolean.valueOf(db2.I3());
            }
        }

        static final class f extends o implements Function1 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final f f47834a = new f();

            f() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke(p291q3.g obj) {
                Intrinsics.checkNotNullParameter(obj, "obj");
                return obj.H();
            }
        }

        static final class g extends o implements Function1 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final g f47835a = new g();

            g() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(p291q3.g it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return null;
            }
        }

        public a(p183k3.c autoCloser) {
            Intrinsics.checkNotNullParameter(autoCloser, "autoCloser");
            this.f47827a = autoCloser;
        }

        @Override // p291q3.g
        public Cursor C0(j query, CancellationSignal cancellationSignal) {
            Intrinsics.checkNotNullParameter(query, "query");
            try {
                return new c(this.f47827a.j().C0(query, cancellationSignal), this.f47827a);
            } catch (Throwable th) {
                this.f47827a.e();
                throw th;
            }
        }

        @Override // p291q3.g
        public String H() {
            return (String) this.f47827a.g(f.f47834a);
        }

        @Override // p291q3.g
        public boolean I3() {
            return ((Boolean) this.f47827a.g(e.f47833a)).booleanValue();
        }

        @Override // p291q3.g
        public void M0() {
            Unit unit;
            p291q3.g gVarH = this.f47827a.h();
            if (gVarH != null) {
                gVarH.M0();
                unit = Unit.f48228a;
            } else {
                unit = null;
            }
            if (unit == null) {
                throw new IllegalStateException("setTransactionSuccessful called but delegateDb is null");
            }
        }

        @Override // p291q3.g
        public void O0(String sql, Object[] bindArgs) {
            Intrinsics.checkNotNullParameter(sql, "sql");
            Intrinsics.checkNotNullParameter(bindArgs, "bindArgs");
            this.f47827a.g(new c(sql, bindArgs));
        }

        @Override // p291q3.g
        public void P0() {
            try {
                this.f47827a.j().P0();
            } catch (Throwable th) {
                this.f47827a.e();
                throw th;
            }
        }

        @Override // p291q3.g
        public Cursor Z2(String query) {
            Intrinsics.checkNotNullParameter(query, "query");
            try {
                return new c(this.f47827a.j().Z2(query), this.f47827a);
            } catch (Throwable th) {
                this.f47827a.e();
                throw th;
            }
        }

        public final void a() {
            this.f47827a.g(g.f47835a);
        }

        @Override // p291q3.g
        public void a0() {
            try {
                this.f47827a.j().a0();
            } catch (Throwable th) {
                this.f47827a.e();
                throw th;
            }
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f47827a.d();
        }

        @Override // p291q3.g
        public List f0() {
            return (List) this.f47827a.g(C0560a.f47828a);
        }

        @Override // p291q3.g
        public void f1() {
            if (this.f47827a.h() == null) {
                throw new IllegalStateException("End transaction called but delegateDb is null");
            }
            try {
                p291q3.g gVarH = this.f47827a.h();
                Intrinsics.c(gVarH);
                gVarH.f1();
            } finally {
                this.f47827a.e();
            }
        }

        @Override // p291q3.g
        public void i0(String sql) {
            Intrinsics.checkNotNullParameter(sql, "sql");
            this.f47827a.g(new b(sql));
        }

        @Override // p291q3.g
        public boolean isOpen() {
            p291q3.g gVarH = this.f47827a.h();
            if (gVarH == null) {
                return false;
            }
            return gVarH.isOpen();
        }

        @Override // p291q3.g
        public k v2(String sql) {
            Intrinsics.checkNotNullParameter(sql, "sql");
            return new b(sql, this.f47827a);
        }

        @Override // p291q3.g
        public boolean v3() {
            if (this.f47827a.h() == null) {
                return false;
            }
            return ((Boolean) this.f47827a.g(C0561d.f47832a)).booleanValue();
        }

        @Override // p291q3.g
        public Cursor z1(j query) {
            Intrinsics.checkNotNullParameter(query, "query");
            try {
                return new c(this.f47827a.j().z1(query), this.f47827a);
            } catch (Throwable th) {
                this.f47827a.e();
                throw th;
            }
        }
    }

    private static final class b implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f47836a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final p183k3.c f47837b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final ArrayList f47838c;

        static final class a extends o implements Function1 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f47839a = new a();

            a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Long invoke(k obj) {
                Intrinsics.checkNotNullParameter(obj, "obj");
                return Long.valueOf(obj.b2());
            }
        }

        /* JADX INFO: renamed from: k3.d$b$b, reason: collision with other inner class name */
        static final class C0562b extends o implements Function1 {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function1 f47841b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0562b(Function1 function1) {
                super(1);
                this.f47841b = function1;
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(g db2) {
                Intrinsics.checkNotNullParameter(db2, "db");
                k kVarV2 = db2.v2(b.this.f47836a);
                b.this.c(kVarV2);
                return this.f47841b.invoke(kVarV2);
            }
        }

        static final class c extends o implements Function1 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final c f47842a = new c();

            c() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Integer invoke(k obj) {
                Intrinsics.checkNotNullParameter(obj, "obj");
                return Integer.valueOf(obj.n0());
            }
        }

        public b(String sql, p183k3.c autoCloser) {
            Intrinsics.checkNotNullParameter(sql, "sql");
            Intrinsics.checkNotNullParameter(autoCloser, "autoCloser");
            this.f47836a = sql;
            this.f47837b = autoCloser;
            this.f47838c = new ArrayList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void c(k kVar) {
            Iterator it = this.f47838c.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                it.next();
                int i11 = i10 + 1;
                if (i10 < 0) {
                    CollectionsKt.v();
                }
                Object obj = this.f47838c.get(i10);
                if (obj == null) {
                    kVar.q3(i11);
                } else if (obj instanceof Long) {
                    kVar.N2(i11, ((Number) obj).longValue());
                } else if (obj instanceof Double) {
                    kVar.w0(i11, ((Number) obj).doubleValue());
                } else if (obj instanceof String) {
                    kVar.n2(i11, (String) obj);
                } else if (obj instanceof byte[]) {
                    kVar.R2(i11, (byte[]) obj);
                }
                i10 = i11;
            }
        }

        private final Object d(Function1 function1) {
            return this.f47837b.g(new C0562b(function1));
        }

        private final void e(int i10, Object obj) {
            int size;
            int i11 = i10 - 1;
            if (i11 >= this.f47838c.size() && (size = this.f47838c.size()) <= i11) {
                while (true) {
                    this.f47838c.add(null);
                    if (size == i11) {
                        break;
                    } else {
                        size++;
                    }
                }
            }
            this.f47838c.set(i11, obj);
        }

        @Override // p291q3.i
        public void N2(int i10, long j10) {
            e(i10, Long.valueOf(j10));
        }

        @Override // p291q3.i
        public void R2(int i10, byte[] value) {
            Intrinsics.checkNotNullParameter(value, "value");
            e(i10, value);
        }

        @Override // p291q3.k
        public long b2() {
            return ((Number) d(a.f47839a)).longValue();
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // p291q3.k
        public int n0() {
            return ((Number) d(c.f47842a)).intValue();
        }

        @Override // p291q3.i
        public void n2(int i10, String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            e(i10, value);
        }

        @Override // p291q3.i
        public void q3(int i10) {
            e(i10, null);
        }

        @Override // p291q3.i
        public void w0(int i10, double d10) {
            e(i10, Double.valueOf(d10));
        }
    }

    private static final class c implements Cursor {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Cursor f47843a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final p183k3.c f47844b;

        public c(Cursor delegate, p183k3.c autoCloser) {
            Intrinsics.checkNotNullParameter(delegate, "delegate");
            Intrinsics.checkNotNullParameter(autoCloser, "autoCloser");
            this.f47843a = delegate;
            this.f47844b = autoCloser;
        }

        @Override // android.database.Cursor, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f47843a.close();
            this.f47844b.e();
        }

        @Override // android.database.Cursor
        public void copyStringToBuffer(int i10, CharArrayBuffer charArrayBuffer) {
            this.f47843a.copyStringToBuffer(i10, charArrayBuffer);
        }

        @Override // android.database.Cursor
        public void deactivate() {
            this.f47843a.deactivate();
        }

        @Override // android.database.Cursor
        public byte[] getBlob(int i10) {
            return this.f47843a.getBlob(i10);
        }

        @Override // android.database.Cursor
        public int getColumnCount() {
            return this.f47843a.getColumnCount();
        }

        @Override // android.database.Cursor
        public int getColumnIndex(String str) {
            return this.f47843a.getColumnIndex(str);
        }

        @Override // android.database.Cursor
        public int getColumnIndexOrThrow(String str) {
            return this.f47843a.getColumnIndexOrThrow(str);
        }

        @Override // android.database.Cursor
        public String getColumnName(int i10) {
            return this.f47843a.getColumnName(i10);
        }

        @Override // android.database.Cursor
        public String[] getColumnNames() {
            return this.f47843a.getColumnNames();
        }

        @Override // android.database.Cursor
        public int getCount() {
            return this.f47843a.getCount();
        }

        @Override // android.database.Cursor
        public double getDouble(int i10) {
            return this.f47843a.getDouble(i10);
        }

        @Override // android.database.Cursor
        public Bundle getExtras() {
            return this.f47843a.getExtras();
        }

        @Override // android.database.Cursor
        public float getFloat(int i10) {
            return this.f47843a.getFloat(i10);
        }

        @Override // android.database.Cursor
        public int getInt(int i10) {
            return this.f47843a.getInt(i10);
        }

        @Override // android.database.Cursor
        public long getLong(int i10) {
            return this.f47843a.getLong(i10);
        }

        @Override // android.database.Cursor
        public Uri getNotificationUri() {
            return p291q3.c.a(this.f47843a);
        }

        @Override // android.database.Cursor
        public List getNotificationUris() {
            return f.a(this.f47843a);
        }

        @Override // android.database.Cursor
        public int getPosition() {
            return this.f47843a.getPosition();
        }

        @Override // android.database.Cursor
        public short getShort(int i10) {
            return this.f47843a.getShort(i10);
        }

        @Override // android.database.Cursor
        public String getString(int i10) {
            return this.f47843a.getString(i10);
        }

        @Override // android.database.Cursor
        public int getType(int i10) {
            return this.f47843a.getType(i10);
        }

        @Override // android.database.Cursor
        public boolean getWantsAllOnMoveCalls() {
            return this.f47843a.getWantsAllOnMoveCalls();
        }

        @Override // android.database.Cursor
        public boolean isAfterLast() {
            return this.f47843a.isAfterLast();
        }

        @Override // android.database.Cursor
        public boolean isBeforeFirst() {
            return this.f47843a.isBeforeFirst();
        }

        @Override // android.database.Cursor
        public boolean isClosed() {
            return this.f47843a.isClosed();
        }

        @Override // android.database.Cursor
        public boolean isFirst() {
            return this.f47843a.isFirst();
        }

        @Override // android.database.Cursor
        public boolean isLast() {
            return this.f47843a.isLast();
        }

        @Override // android.database.Cursor
        public boolean isNull(int i10) {
            return this.f47843a.isNull(i10);
        }

        @Override // android.database.Cursor
        public boolean move(int i10) {
            return this.f47843a.move(i10);
        }

        @Override // android.database.Cursor
        public boolean moveToFirst() {
            return this.f47843a.moveToFirst();
        }

        @Override // android.database.Cursor
        public boolean moveToLast() {
            return this.f47843a.moveToLast();
        }

        @Override // android.database.Cursor
        public boolean moveToNext() {
            return this.f47843a.moveToNext();
        }

        @Override // android.database.Cursor
        public boolean moveToPosition(int i10) {
            return this.f47843a.moveToPosition(i10);
        }

        @Override // android.database.Cursor
        public boolean moveToPrevious() {
            return this.f47843a.moveToPrevious();
        }

        @Override // android.database.Cursor
        public void registerContentObserver(ContentObserver contentObserver) {
            this.f47843a.registerContentObserver(contentObserver);
        }

        @Override // android.database.Cursor
        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            this.f47843a.registerDataSetObserver(dataSetObserver);
        }

        @Override // android.database.Cursor
        public boolean requery() {
            return this.f47843a.requery();
        }

        @Override // android.database.Cursor
        public Bundle respond(Bundle bundle) {
            return this.f47843a.respond(bundle);
        }

        @Override // android.database.Cursor
        public void setExtras(Bundle extras) {
            Intrinsics.checkNotNullParameter(extras, "extras");
            e.a(this.f47843a, extras);
        }

        @Override // android.database.Cursor
        public void setNotificationUri(ContentResolver contentResolver, Uri uri) {
            this.f47843a.setNotificationUri(contentResolver, uri);
        }

        @Override // android.database.Cursor
        public void setNotificationUris(ContentResolver cr, List uris) {
            Intrinsics.checkNotNullParameter(cr, "cr");
            Intrinsics.checkNotNullParameter(uris, "uris");
            f.b(this.f47843a, cr, uris);
        }

        @Override // android.database.Cursor
        public void unregisterContentObserver(ContentObserver contentObserver) {
            this.f47843a.unregisterContentObserver(contentObserver);
        }

        @Override // android.database.Cursor
        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            this.f47843a.unregisterDataSetObserver(dataSetObserver);
        }
    }

    public d(h delegate, p183k3.c autoCloser) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(autoCloser, "autoCloser");
        this.f47824a = delegate;
        this.f47825b = autoCloser;
        autoCloser.k(a());
        this.f47826c = new a(autoCloser);
    }

    @Override // p291q3.h
    public g X2() {
        this.f47826c.a();
        return this.f47826c;
    }

    @Override // p183k3.g
    public h a() {
        return this.f47824a;
    }

    @Override // p291q3.h, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f47826c.close();
    }

    @Override // p291q3.h
    public String getDatabaseName() {
        return this.f47824a.getDatabaseName();
    }

    @Override // p291q3.h
    public void setWriteAheadLoggingEnabled(boolean z10) {
        this.f47824a.setWriteAheadLoggingEnabled(z10);
    }
}
