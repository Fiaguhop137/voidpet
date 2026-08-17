package androidx.room;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.N;
import kotlin.collections.W;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import p183k3.l;
import p183k3.q;
import p291q3.g;
import p291q3.k;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final a f25368q = new a(null);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final String[] f25369r = {"UPDATE", "DELETE", "INSERT"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q f25370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f25371b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f25372c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f25373d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String[] f25374e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private p183k3.c f25375f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final AtomicBoolean f25376g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile boolean f25377h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private volatile k f25378i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final b f25379j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final p183k3.k f25380k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final p269p.b f25381l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private androidx.room.d f25382m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Object f25383n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Object f25384o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Runnable f25385p;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(g database) {
            Intrinsics.checkNotNullParameter(database, "database");
            if (database.I3()) {
                database.P0();
            } else {
                database.a0();
            }
        }

        public final String b(String tableName, String triggerType) {
            Intrinsics.checkNotNullParameter(tableName, "tableName");
            Intrinsics.checkNotNullParameter(triggerType, "triggerType");
            return "`room_table_modification_trigger_" + tableName + '_' + triggerType + '`';
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final a f25386e = new a(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long[] f25387a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean[] f25388b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int[] f25389c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f25390d;

        public static final class a {
            private a() {
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public b(int i10) {
            this.f25387a = new long[i10];
            this.f25388b = new boolean[i10];
            this.f25389c = new int[i10];
        }

        public final int[] a() {
            synchronized (this) {
                try {
                    if (!this.f25390d) {
                        return null;
                    }
                    long[] jArr = this.f25387a;
                    int length = jArr.length;
                    int i10 = 0;
                    int i11 = 0;
                    while (i10 < length) {
                        int i12 = i11 + 1;
                        int i13 = 1;
                        boolean z10 = jArr[i10] > 0;
                        boolean[] zArr = this.f25388b;
                        if (z10 != zArr[i11]) {
                            int[] iArr = this.f25389c;
                            if (!z10) {
                                i13 = 2;
                            }
                            iArr[i11] = i13;
                        } else {
                            this.f25389c[i11] = 0;
                        }
                        zArr[i11] = z10;
                        i10++;
                        i11 = i12;
                    }
                    this.f25390d = false;
                    return (int[]) this.f25389c.clone();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final boolean b(int... tableIds) {
            boolean z10;
            Intrinsics.checkNotNullParameter(tableIds, "tableIds");
            synchronized (this) {
                try {
                    z10 = false;
                    for (int i10 : tableIds) {
                        long[] jArr = this.f25387a;
                        long j10 = jArr[i10];
                        jArr[i10] = 1 + j10;
                        if (j10 == 0) {
                            z10 = true;
                            this.f25390d = true;
                        }
                    }
                    Unit unit = Unit.f48228a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return z10;
        }

        public final boolean c(int... tableIds) {
            boolean z10;
            Intrinsics.checkNotNullParameter(tableIds, "tableIds");
            synchronized (this) {
                try {
                    z10 = false;
                    for (int i10 : tableIds) {
                        long[] jArr = this.f25387a;
                        long j10 = jArr[i10];
                        jArr[i10] = j10 - 1;
                        if (j10 == 1) {
                            z10 = true;
                            this.f25390d = true;
                        }
                    }
                    Unit unit = Unit.f48228a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return z10;
        }

        public final void d() {
            synchronized (this) {
                Arrays.fill(this.f25388b, false);
                this.f25390d = true;
                Unit unit = Unit.f48228a;
            }
        }
    }

    /* JADX INFO: renamed from: androidx.room.c$c, reason: collision with other inner class name */
    public static abstract class AbstractC0319c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String[] f25391a;

        public AbstractC0319c(String[] tables) {
            Intrinsics.checkNotNullParameter(tables, "tables");
            this.f25391a = tables;
        }

        public final String[] a() {
            return this.f25391a;
        }

        public abstract boolean b();

        public abstract void c(Set set);
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AbstractC0319c f25392a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int[] f25393b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String[] f25394c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Set f25395d;

        public d(AbstractC0319c observer, int[] tableIds, String[] tableNames) {
            Intrinsics.checkNotNullParameter(observer, "observer");
            Intrinsics.checkNotNullParameter(tableIds, "tableIds");
            Intrinsics.checkNotNullParameter(tableNames, "tableNames");
            this.f25392a = observer;
            this.f25393b = tableIds;
            this.f25394c = tableNames;
            this.f25395d = !(tableNames.length == 0) ? W.c(tableNames[0]) : W.d();
            if (tableIds.length != tableNames.length) {
                throw new IllegalStateException("Check failed.");
            }
        }

        public final int[] a() {
            return this.f25393b;
        }

        public final void b(Set invalidatedTablesIds) {
            Set setD;
            Intrinsics.checkNotNullParameter(invalidatedTablesIds, "invalidatedTablesIds");
            int[] iArr = this.f25393b;
            int length = iArr.length;
            if (length != 0) {
                int i10 = 0;
                if (length != 1) {
                    Set setB = W.b();
                    int[] iArr2 = this.f25393b;
                    int length2 = iArr2.length;
                    int i11 = 0;
                    while (i10 < length2) {
                        int i12 = i11 + 1;
                        if (invalidatedTablesIds.contains(Integer.valueOf(iArr2[i10]))) {
                            setB.add(this.f25394c[i11]);
                        }
                        i10++;
                        i11 = i12;
                    }
                    setD = W.a(setB);
                } else {
                    setD = invalidatedTablesIds.contains(Integer.valueOf(iArr[0])) ? this.f25395d : W.d();
                }
            } else {
                setD = W.d();
            }
            if (setD.isEmpty()) {
                return;
            }
            this.f25392a.c(setD);
        }

        public final void c(String[] tables) {
            Set setD;
            Intrinsics.checkNotNullParameter(tables, "tables");
            int length = this.f25394c.length;
            if (length == 0) {
                setD = W.d();
            } else if (length == 1) {
                int length2 = tables.length;
                int i10 = 0;
                while (true) {
                    if (i10 >= length2) {
                        setD = W.d();
                        break;
                    } else {
                        if (StringsKt.z(tables[i10], this.f25394c[0], true)) {
                            setD = this.f25395d;
                            break;
                        }
                        i10++;
                    }
                }
            } else {
                Set setB = W.b();
                for (String str : tables) {
                    for (String str2 : this.f25394c) {
                        if (StringsKt.z(str2, str, true)) {
                            setB.add(str2);
                        }
                    }
                }
                setD = W.a(setB);
            }
            if (setD.isEmpty()) {
                return;
            }
            this.f25392a.c(setD);
        }
    }

    public static final class e implements Runnable {
        e() {
        }

        private final Set a() throws IOException {
            c cVar = c.this;
            Set setB = W.b();
            Cursor cursorY = q.y(cVar.f(), new p291q3.a("SELECT * FROM room_table_modification_log WHERE invalidated = 1;"), null, 2, null);
            while (cursorY.moveToNext()) {
                try {
                    setB.add(Integer.valueOf(cursorY.getInt(0)));
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        kotlin.io.c.a(cursorY, th);
                        throw th2;
                    }
                }
            }
            Unit unit = Unit.f48228a;
            kotlin.io.c.a(cursorY, null);
            Set setA = W.a(setB);
            if (setA.isEmpty()) {
                return setA;
            }
            if (c.this.e() == null) {
                throw new IllegalStateException("Required value was null.");
            }
            k kVarE = c.this.e();
            if (kVarE == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            kVarE.n0();
            return setA;
        }

        @Override // java.lang.Runnable
        public void run() {
            Set setD;
            p183k3.c cVar;
            Lock lockK = c.this.f().k();
            lockK.lock();
            try {
                try {
                    if (!c.this.d()) {
                        lockK.unlock();
                        p183k3.c cVar2 = c.this.f25375f;
                        if (cVar2 != null) {
                            cVar2.e();
                            return;
                        }
                        return;
                    }
                    if (!c.this.h().compareAndSet(true, false)) {
                        lockK.unlock();
                        p183k3.c cVar3 = c.this.f25375f;
                        if (cVar3 != null) {
                            cVar3.e();
                            return;
                        }
                        return;
                    }
                    if (c.this.f().q()) {
                        lockK.unlock();
                        p183k3.c cVar4 = c.this.f25375f;
                        if (cVar4 != null) {
                            cVar4.e();
                            return;
                        }
                        return;
                    }
                    g gVarX2 = c.this.f().m().X2();
                    gVarX2.P0();
                    try {
                        setD = a();
                        gVarX2.M0();
                        gVarX2.f1();
                        lockK.unlock();
                        cVar = c.this.f25375f;
                        if (cVar != null) {
                            cVar.e();
                        }
                        if (setD.isEmpty()) {
                            return;
                        }
                        p269p.b bVarG = c.this.g();
                        c cVar5 = c.this;
                        synchronized (bVarG) {
                            try {
                                Iterator it = cVar5.g().iterator();
                                while (it.hasNext()) {
                                    ((d) ((Map.Entry) it.next()).getValue()).b(setD);
                                }
                                Unit unit = Unit.f48228a;
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    } catch (Throwable th2) {
                        gVarX2.f1();
                        throw th2;
                    }
                } catch (Throwable th3) {
                    lockK.unlock();
                    p183k3.c cVar6 = c.this.f25375f;
                    if (cVar6 != null) {
                        cVar6.e();
                    }
                    throw th3;
                }
            } catch (SQLiteException e10) {
                Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e10);
                setD = W.d();
                lockK.unlock();
                cVar = c.this.f25375f;
                if (cVar != null) {
                }
            } catch (IllegalStateException e11) {
                Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e11);
                setD = W.d();
                lockK.unlock();
                cVar = c.this.f25375f;
                if (cVar != null) {
                }
            }
        }
    }

    public c(q database, Map shadowTablesMap, Map viewTables, String... tableNames) {
        String lowerCase;
        Intrinsics.checkNotNullParameter(database, "database");
        Intrinsics.checkNotNullParameter(shadowTablesMap, "shadowTablesMap");
        Intrinsics.checkNotNullParameter(viewTables, "viewTables");
        Intrinsics.checkNotNullParameter(tableNames, "tableNames");
        this.f25370a = database;
        this.f25371b = shadowTablesMap;
        this.f25372c = viewTables;
        this.f25376g = new AtomicBoolean(false);
        this.f25379j = new b(tableNames.length);
        this.f25380k = new p183k3.k(database);
        this.f25381l = new p269p.b();
        this.f25383n = new Object();
        this.f25384o = new Object();
        this.f25373d = new LinkedHashMap();
        int length = tableNames.length;
        String[] strArr = new String[length];
        for (int i10 = 0; i10 < length; i10++) {
            String str = tableNames[i10];
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            String lowerCase2 = str.toLowerCase(US);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
            this.f25373d.put(lowerCase2, Integer.valueOf(i10));
            String str2 = (String) this.f25371b.get(tableNames[i10]);
            if (str2 != null) {
                Intrinsics.checkNotNullExpressionValue(US, "US");
                lowerCase = str2.toLowerCase(US);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            } else {
                lowerCase = null;
            }
            if (lowerCase != null) {
                lowerCase2 = lowerCase;
            }
            strArr[i10] = lowerCase2;
        }
        this.f25374e = strArr;
        for (Map.Entry entry : this.f25371b.entrySet()) {
            String str3 = (String) entry.getValue();
            Locale US2 = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US2, "US");
            String lowerCase3 = str3.toLowerCase(US2);
            Intrinsics.checkNotNullExpressionValue(lowerCase3, "this as java.lang.String).toLowerCase(locale)");
            if (this.f25373d.containsKey(lowerCase3)) {
                String str4 = (String) entry.getKey();
                Intrinsics.checkNotNullExpressionValue(US2, "US");
                String lowerCase4 = str4.toLowerCase(US2);
                Intrinsics.checkNotNullExpressionValue(lowerCase4, "this as java.lang.String).toLowerCase(locale)");
                Map map = this.f25373d;
                map.put(lowerCase4, N.j(map, lowerCase3));
            }
        }
        this.f25385p = new e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l() {
        synchronized (this.f25384o) {
            this.f25377h = false;
            this.f25379j.d();
            k kVar = this.f25378i;
            if (kVar != null) {
                kVar.close();
                Unit unit = Unit.f48228a;
            }
        }
    }

    private final String[] o(String[] strArr) {
        Set setB = W.b();
        for (String str : strArr) {
            Map map = this.f25372c;
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            String lowerCase = str.toLowerCase(US);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (map.containsKey(lowerCase)) {
                Map map2 = this.f25372c;
                Intrinsics.checkNotNullExpressionValue(US, "US");
                String lowerCase2 = str.toLowerCase(US);
                Intrinsics.checkNotNullExpressionValue(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
                Object obj = map2.get(lowerCase2);
                Intrinsics.c(obj);
                setB.addAll((Collection) obj);
            } else {
                setB.add(str);
            }
        }
        return (String[]) W.a(setB).toArray(new String[0]);
    }

    private final void r(g gVar, int i10) {
        gVar.i0("INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i10 + ", 0)");
        String str = this.f25374e[i10];
        for (String str2 : f25369r) {
            String str3 = "CREATE TEMP TRIGGER IF NOT EXISTS " + f25368q.b(str, str2) + " AFTER " + str2 + " ON `" + str + "` BEGIN UPDATE room_table_modification_log SET invalidated = 1 WHERE table_id = " + i10 + " AND invalidated = 0; END";
            Intrinsics.checkNotNullExpressionValue(str3, "StringBuilder().apply(builderAction).toString()");
            gVar.i0(str3);
        }
    }

    private final void s(g gVar, int i10) {
        String str = this.f25374e[i10];
        for (String str2 : f25369r) {
            String str3 = "DROP TRIGGER IF EXISTS " + f25368q.b(str, str2);
            Intrinsics.checkNotNullExpressionValue(str3, "StringBuilder().apply(builderAction).toString()");
            gVar.i0(str3);
        }
    }

    public void c(AbstractC0319c observer) {
        d dVar;
        Intrinsics.checkNotNullParameter(observer, "observer");
        String[] strArrO = o(observer.a());
        ArrayList arrayList = new ArrayList(strArrO.length);
        for (String str : strArrO) {
            Map map = this.f25373d;
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            String lowerCase = str.toLowerCase(US);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            Integer num = (Integer) map.get(lowerCase);
            if (num == null) {
                throw new IllegalArgumentException("There is no table with name " + str);
            }
            arrayList.add(num);
        }
        int[] iArrT0 = CollectionsKt.T0(arrayList);
        d dVar2 = new d(observer, iArrT0, strArrO);
        synchronized (this.f25381l) {
            dVar = (d) this.f25381l.i(observer, dVar2);
        }
        if (dVar == null && this.f25379j.b(Arrays.copyOf(iArrT0, iArrT0.length))) {
            t();
        }
    }

    public final boolean d() {
        if (!this.f25370a.w()) {
            return false;
        }
        if (!this.f25377h) {
            this.f25370a.m().X2();
        }
        if (this.f25377h) {
            return true;
        }
        Log.e("ROOM", "database is not initialized even though it is open");
        return false;
    }

    public final k e() {
        return this.f25378i;
    }

    public final q f() {
        return this.f25370a;
    }

    public final p269p.b g() {
        return this.f25381l;
    }

    public final AtomicBoolean h() {
        return this.f25376g;
    }

    public final Map i() {
        return this.f25373d;
    }

    public final void j(g database) {
        Intrinsics.checkNotNullParameter(database, "database");
        synchronized (this.f25384o) {
            if (this.f25377h) {
                Log.e("ROOM", "Invalidation tracker is initialized twice :/.");
                return;
            }
            database.i0("PRAGMA temp_store = MEMORY;");
            database.i0("PRAGMA recursive_triggers='ON';");
            database.i0("CREATE TEMP TABLE room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
            u(database);
            this.f25378i = database.v2("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1");
            this.f25377h = true;
            Unit unit = Unit.f48228a;
        }
    }

    public final void k(String... tables) {
        Intrinsics.checkNotNullParameter(tables, "tables");
        synchronized (this.f25381l) {
            try {
                for (Map.Entry entry : this.f25381l) {
                    Intrinsics.checkNotNullExpressionValue(entry, "(observer, wrapper)");
                    AbstractC0319c abstractC0319c = (AbstractC0319c) entry.getKey();
                    d dVar = (d) entry.getValue();
                    if (!abstractC0319c.b()) {
                        dVar.c(tables);
                    }
                }
                Unit unit = Unit.f48228a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void m() {
        if (this.f25376g.compareAndSet(false, true)) {
            p183k3.c cVar = this.f25375f;
            if (cVar != null) {
                cVar.j();
            }
            this.f25370a.n().execute(this.f25385p);
        }
    }

    public void n(AbstractC0319c observer) {
        d dVar;
        Intrinsics.checkNotNullParameter(observer, "observer");
        synchronized (this.f25381l) {
            dVar = (d) this.f25381l.j(observer);
        }
        if (dVar != null) {
            b bVar = this.f25379j;
            int[] iArrA = dVar.a();
            if (bVar.c(Arrays.copyOf(iArrA, iArrA.length))) {
                t();
            }
        }
    }

    public final void p(p183k3.c autoCloser) {
        Intrinsics.checkNotNullParameter(autoCloser, "autoCloser");
        this.f25375f = autoCloser;
        autoCloser.l(new l(this));
    }

    public final void q(Context context, String name, Intent serviceIntent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(serviceIntent, "serviceIntent");
        this.f25382m = new androidx.room.d(context, name, serviceIntent, this, this.f25370a.n());
    }

    public final void t() {
        if (this.f25370a.w()) {
            u(this.f25370a.m().X2());
        }
    }

    public final void u(g database) {
        Intrinsics.checkNotNullParameter(database, "database");
        if (database.v3()) {
            return;
        }
        try {
            Lock lockK = this.f25370a.k();
            lockK.lock();
            try {
                synchronized (this.f25383n) {
                    try {
                        int[] iArrA = this.f25379j.a();
                        if (iArrA != null) {
                            f25368q.a(database);
                            try {
                                int length = iArrA.length;
                                int i10 = 0;
                                int i11 = 0;
                                while (i10 < length) {
                                    int i12 = iArrA[i10];
                                    int i13 = i11 + 1;
                                    if (i12 == 1) {
                                        r(database, i11);
                                    } else if (i12 == 2) {
                                        s(database, i11);
                                    }
                                    i10++;
                                    i11 = i13;
                                }
                                database.M0();
                                database.f1();
                                Unit unit = Unit.f48228a;
                            } catch (Throwable th) {
                                database.f1();
                                throw th;
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                lockK.unlock();
            } catch (Throwable th3) {
                lockK.unlock();
                throw th3;
            }
        } catch (SQLiteException e10) {
            Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e10);
        } catch (IllegalStateException e11) {
            Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e11);
        }
    }
}
