package p291q3;

import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import android.util.Pair;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
public interface h extends Closeable {

    public static abstract class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final C0615a f51413b = new C0615a(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f51414a;

        /* JADX INFO: renamed from: q3.h$a$a, reason: collision with other inner class name */
        public static final class C0615a {
            private C0615a() {
            }

            public /* synthetic */ C0615a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public a(int i10) {
            this.f51414a = i10;
        }

        private final void a(String str) {
            if (StringsKt.z(str, ":memory:", true)) {
                return;
            }
            int length = str.length() - 1;
            int i10 = 0;
            boolean z10 = false;
            while (i10 <= length) {
                boolean z11 = Intrinsics.e(str.charAt(!z10 ? i10 : length), 32) <= 0;
                if (z10) {
                    if (!z11) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z11) {
                    i10++;
                } else {
                    z10 = true;
                }
            }
            if (str.subSequence(i10, length + 1).toString().length() == 0) {
                return;
            }
            Log.w("SupportSQLite", "deleting the database file: " + str);
            try {
                p291q3.b.a(new File(str));
            } catch (Exception e10) {
                Log.w("SupportSQLite", "delete failed: ", e10);
            }
        }

        public void b(g db2) {
            Intrinsics.checkNotNullParameter(db2, "db");
        }

        public void c(g db2) {
            Intrinsics.checkNotNullParameter(db2, "db");
            Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + db2 + ".path");
            if (!db2.isOpen()) {
                String strH = db2.H();
                if (strH != null) {
                    a(strH);
                    return;
                }
                return;
            }
            List listF0 = null;
            try {
                try {
                    listF0 = db2.f0();
                } catch (SQLiteException unused) {
                }
                try {
                    db2.close();
                } catch (IOException unused2) {
                }
                if (listF0 != null) {
                    return;
                }
            } finally {
                if (listF0 != null) {
                    Iterator it = listF0.iterator();
                    while (it.hasNext()) {
                        Object obj = ((Pair) it.next()).second;
                        Intrinsics.checkNotNullExpressionValue(obj, "p.second");
                        a((String) obj);
                    }
                } else {
                    String strH2 = db2.H();
                    if (strH2 != null) {
                        a(strH2);
                    }
                }
            }
        }

        public abstract void d(g gVar);

        public abstract void e(g gVar, int i10, int i11);

        public void f(g db2) {
            Intrinsics.checkNotNullParameter(db2, "db");
        }

        public abstract void g(g gVar, int i10, int i11);
    }

    public static final class b {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final C0616b f51415f = new C0616b(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f51416a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f51417b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final a f51418c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f51419d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f51420e;

        public static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final Context f51421a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private String f51422b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private a f51423c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private boolean f51424d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private boolean f51425e;

            public a(Context context) {
                Intrinsics.checkNotNullParameter(context, "context");
                this.f51421a = context;
            }

            public b a() {
                String str;
                a aVar = this.f51423c;
                if (aVar == null) {
                    throw new IllegalArgumentException("Must set a callback to create the configuration.");
                }
                if (this.f51424d && ((str = this.f51422b) == null || str.length() == 0)) {
                    throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
                }
                return new b(this.f51421a, this.f51422b, aVar, this.f51424d, this.f51425e);
            }

            public a b(a callback) {
                Intrinsics.checkNotNullParameter(callback, "callback");
                this.f51423c = callback;
                return this;
            }

            public a c(String str) {
                this.f51422b = str;
                return this;
            }
        }

        /* JADX INFO: renamed from: q3.h$b$b, reason: collision with other inner class name */
        public static final class C0616b {
            private C0616b() {
            }

            public /* synthetic */ C0616b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final a a(Context context) {
                Intrinsics.checkNotNullParameter(context, "context");
                return new a(context);
            }
        }

        public b(Context context, String str, a callback, boolean z10, boolean z11) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(callback, "callback");
            this.f51416a = context;
            this.f51417b = str;
            this.f51418c = callback;
            this.f51419d = z10;
            this.f51420e = z11;
        }
    }

    public interface c {
        h a(b bVar);
    }

    g X2();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    String getDatabaseName();

    void setWriteAheadLoggingEnabled(boolean z10);
}
