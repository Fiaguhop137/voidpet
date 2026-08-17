package p183k3;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.CancellationSignal;
import android.os.Looper;
import android.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.collections.CollectionsKt;
import kotlin.collections.N;
import kotlin.collections.W;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o;
import p291q3.h;
import p291q3.j;
import p291q3.k;

/* JADX INFO: loaded from: classes.dex */
public abstract class q {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final b f47877o = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected volatile p291q3.g f47878a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Executor f47879b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Executor f47880c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private h f47881d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f47883f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f47884g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected List f47885h;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private p183k3.c f47888k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Map f47890m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Map f47891n;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final androidx.room.c f47882e = g();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Map f47886i = new LinkedHashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final ReentrantReadWriteLock f47887j = new ReentrantReadWriteLock();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final ThreadLocal f47889l = new ThreadLocal();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f47892a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Class f47893b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f47894c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final List f47895d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final List f47896e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private List f47897f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private Executor f47898g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private Executor f47899h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private h.c f47900i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private boolean f47901j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private c f47902k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private Intent f47903l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private boolean f47904m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private boolean f47905n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private long f47906o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private TimeUnit f47907p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private final d f47908q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private Set f47909r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private Set f47910s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private String f47911t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private File f47912u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private Callable f47913v;

        public a(Context context, Class klass, String str) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(klass, "klass");
            this.f47892a = context;
            this.f47893b = klass;
            this.f47894c = str;
            this.f47895d = new ArrayList();
            this.f47896e = new ArrayList();
            this.f47897f = new ArrayList();
            this.f47902k = c.AUTOMATIC;
            this.f47904m = true;
            this.f47906o = -1L;
            this.f47908q = new d();
            this.f47909r = new LinkedHashSet();
        }

        public a a(p201l3.a... migrations) {
            Intrinsics.checkNotNullParameter(migrations, "migrations");
            if (this.f47910s == null) {
                this.f47910s = new HashSet();
            }
            for (p201l3.a aVar : migrations) {
                Set set = this.f47910s;
                Intrinsics.c(set);
                set.add(Integer.valueOf(aVar.f48594a));
                Set set2 = this.f47910s;
                Intrinsics.c(set2);
                set2.add(Integer.valueOf(aVar.f48595b));
            }
            this.f47908q.b((p201l3.a[]) Arrays.copyOf(migrations, migrations.length));
            return this;
        }

        public a b() {
            this.f47901j = true;
            return this;
        }

        public q c() {
            Executor executor = this.f47898g;
            if (executor == null && this.f47899h == null) {
                Executor executorF = p251o.c.f();
                this.f47899h = executorF;
                this.f47898g = executorF;
            } else if (executor != null && this.f47899h == null) {
                this.f47899h = executor;
            } else if (executor == null) {
                this.f47898g = this.f47899h;
            }
            Set set = this.f47910s;
            if (set != null) {
                Intrinsics.c(set);
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    int iIntValue = ((Number) it.next()).intValue();
                    if (this.f47909r.contains(Integer.valueOf(iIntValue))) {
                        throw new IllegalArgumentException(("Inconsistency detected. A Migration was supplied to addMigration(Migration... migrations) that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(int... startVersions). Start version: " + iIntValue).toString());
                    }
                }
            }
            h.c vVar = this.f47900i;
            if (vVar == null) {
                vVar = new p309r3.f();
            }
            if (vVar != null) {
                if (this.f47906o > 0) {
                    if (this.f47894c == null) {
                        throw new IllegalArgumentException("Cannot create auto-closing database for an in-memory database.");
                    }
                    long j10 = this.f47906o;
                    TimeUnit timeUnit = this.f47907p;
                    if (timeUnit == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    Executor executor2 = this.f47898g;
                    if (executor2 == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    vVar = new p183k3.e(vVar, new p183k3.c(j10, timeUnit, executor2));
                }
                String str = this.f47911t;
                if (str != null || this.f47912u != null || this.f47913v != null) {
                    if (this.f47894c == null) {
                        throw new IllegalArgumentException("Cannot create from asset or file for an in-memory database.");
                    }
                    int i10 = str == null ? 0 : 1;
                    File file = this.f47912u;
                    int i11 = file == null ? 0 : 1;
                    Callable callable = this.f47913v;
                    if (i10 + i11 + (callable != null ? 1 : 0) != 1) {
                        throw new IllegalArgumentException("More than one of createFromAsset(), createFromInputStream(), and createFromFile() were called on this Builder, but the database can only be created using one of the three configurations.");
                    }
                    vVar = new v(str, file, callable, vVar);
                }
            } else {
                vVar = null;
            }
            h.c cVar = vVar;
            if (cVar == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            Context context = this.f47892a;
            String str2 = this.f47894c;
            d dVar = this.f47908q;
            List list = this.f47895d;
            boolean z10 = this.f47901j;
            c cVarH = this.f47902k.h(context);
            Executor executor3 = this.f47898g;
            if (executor3 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            Executor executor4 = this.f47899h;
            if (executor4 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            p183k3.f fVar = new p183k3.f(context, str2, cVar, dVar, list, z10, cVarH, executor3, executor4, this.f47903l, this.f47904m, this.f47905n, this.f47909r, this.f47911t, this.f47912u, this.f47913v, null, this.f47896e, this.f47897f);
            q qVar = (q) p.b(this.f47893b, "_Impl");
            qVar.r(fVar);
            return qVar;
        }

        public a d() {
            this.f47904m = false;
            this.f47905n = true;
            return this;
        }

        public a e(Executor executor) {
            Intrinsics.checkNotNullParameter(executor, "executor");
            this.f47898g = executor;
            return this;
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public enum c {
        AUTOMATIC,
        TRUNCATE,
        WRITE_AHEAD_LOGGING;

        private final boolean g(ActivityManager activityManager) {
            return p291q3.c.b(activityManager);
        }

        public final c h(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (this != AUTOMATIC) {
                return this;
            }
            Object systemService = context.getSystemService("activity");
            ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
            return (activityManager == null || g(activityManager)) ? TRUNCATE : WRITE_AHEAD_LOGGING;
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Map f47918a = new LinkedHashMap();

        private final void a(p201l3.a aVar) {
            int i10 = aVar.f48594a;
            int i11 = aVar.f48595b;
            Map map = this.f47918a;
            Integer numValueOf = Integer.valueOf(i10);
            Object treeMap = map.get(numValueOf);
            if (treeMap == null) {
                treeMap = new TreeMap();
                map.put(numValueOf, treeMap);
            }
            TreeMap treeMap2 = (TreeMap) treeMap;
            if (treeMap2.containsKey(Integer.valueOf(i11))) {
                Log.w("ROOM", "Overriding migration " + treeMap2.get(Integer.valueOf(i11)) + " with " + aVar);
            }
            treeMap2.put(Integer.valueOf(i11), aVar);
        }

        private final List e(List list, boolean z10, int i10, int i11) {
            boolean z11;
            do {
                if (z10) {
                    if (i10 >= i11) {
                        return list;
                    }
                } else if (i10 <= i11) {
                    return list;
                }
                TreeMap treeMap = (TreeMap) this.f47918a.get(Integer.valueOf(i10));
                if (treeMap != null) {
                    Iterator it = (z10 ? treeMap.descendingKeySet() : treeMap.keySet()).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z11 = false;
                            break;
                        }
                        Integer targetVersion = (Integer) it.next();
                        if (!z10) {
                            Intrinsics.checkNotNullExpressionValue(targetVersion, "targetVersion");
                            int iIntValue = targetVersion.intValue();
                            if (i11 <= iIntValue && iIntValue < i10) {
                                Object obj = treeMap.get(targetVersion);
                                Intrinsics.c(obj);
                                list.add(obj);
                                i10 = targetVersion.intValue();
                                z11 = true;
                                break;
                                break;
                            }
                        } else {
                            int i12 = i10 + 1;
                            Intrinsics.checkNotNullExpressionValue(targetVersion, "targetVersion");
                            int iIntValue2 = targetVersion.intValue();
                            if (i12 <= iIntValue2 && iIntValue2 <= i11) {
                                Object obj2 = treeMap.get(targetVersion);
                                Intrinsics.c(obj2);
                                list.add(obj2);
                                i10 = targetVersion.intValue();
                                z11 = true;
                                break;
                            }
                        }
                    }
                } else {
                    return null;
                }
            } while (z11);
            return null;
        }

        public void b(p201l3.a... migrations) {
            Intrinsics.checkNotNullParameter(migrations, "migrations");
            for (p201l3.a aVar : migrations) {
                a(aVar);
            }
        }

        public final boolean c(int i10, int i11) {
            Map mapF = f();
            if (!mapF.containsKey(Integer.valueOf(i10))) {
                return false;
            }
            Map mapI = (Map) mapF.get(Integer.valueOf(i10));
            if (mapI == null) {
                mapI = N.i();
            }
            return mapI.containsKey(Integer.valueOf(i11));
        }

        public List d(int i10, int i11) {
            if (i10 == i11) {
                return CollectionsKt.l();
            }
            return e(new ArrayList(), i11 > i10, i10, i11);
        }

        public Map f() {
            return this.f47918a;
        }
    }

    public static abstract class e {
    }

    static final class f extends o implements Function1 {
        f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(p291q3.g it) {
            Intrinsics.checkNotNullParameter(it, "it");
            q.this.s();
            return null;
        }
    }

    static final class g extends o implements Function1 {
        g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(p291q3.g it) {
            Intrinsics.checkNotNullParameter(it, "it");
            q.this.t();
            return null;
        }
    }

    public q() {
        Map mapSynchronizedMap = Collections.synchronizedMap(new LinkedHashMap());
        Intrinsics.checkNotNullExpressionValue(mapSynchronizedMap, "synchronizedMap(mutableMapOf())");
        this.f47890m = mapSynchronizedMap;
        this.f47891n = new LinkedHashMap();
    }

    private final Object A(Class cls, h hVar) {
        if (cls.isInstance(hVar)) {
            return hVar;
        }
        if (hVar instanceof p183k3.g) {
            return A(cls, ((p183k3.g) hVar).a());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s() {
        c();
        p291q3.g gVarX2 = m().X2();
        l().u(gVarX2);
        if (gVarX2.I3()) {
            gVarX2.P0();
        } else {
            gVarX2.a0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t() {
        m().X2().f1();
        if (q()) {
            return;
        }
        l().m();
    }

    public static /* synthetic */ Cursor y(q qVar, j jVar, CancellationSignal cancellationSignal, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: query");
        }
        if ((i10 & 2) != 0) {
            cancellationSignal = null;
        }
        return qVar.x(jVar, cancellationSignal);
    }

    public void c() {
        if (!this.f47883f && v()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public void d() {
        if (!q() && this.f47889l.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    public void e() {
        c();
        p183k3.c cVar = this.f47888k;
        if (cVar == null) {
            s();
        } else {
            cVar.g(new f());
        }
    }

    public k f(String sql) {
        Intrinsics.checkNotNullParameter(sql, "sql");
        c();
        d();
        return m().X2().v2(sql);
    }

    protected abstract androidx.room.c g();

    protected abstract h h(p183k3.f fVar);

    public void i() {
        p183k3.c cVar = this.f47888k;
        if (cVar == null) {
            t();
        } else {
            cVar.g(new g());
        }
    }

    public List j(Map autoMigrationSpecs) {
        Intrinsics.checkNotNullParameter(autoMigrationSpecs, "autoMigrationSpecs");
        return CollectionsKt.l();
    }

    public final Lock k() {
        ReentrantReadWriteLock.ReadLock lock = this.f47887j.readLock();
        Intrinsics.checkNotNullExpressionValue(lock, "readWriteLock.readLock()");
        return lock;
    }

    public androidx.room.c l() {
        return this.f47882e;
    }

    public h m() {
        h hVar = this.f47881d;
        if (hVar != null) {
            return hVar;
        }
        Intrinsics.r("internalOpenHelper");
        return null;
    }

    public Executor n() {
        Executor executor = this.f47879b;
        if (executor != null) {
            return executor;
        }
        Intrinsics.r("internalQueryExecutor");
        return null;
    }

    public Set o() {
        return W.d();
    }

    protected Map p() {
        return N.i();
    }

    public boolean q() {
        return m().X2().v3();
    }

    public void r(p183k3.f configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.f47881d = h(configuration);
        Set setO = o();
        BitSet bitSet = new BitSet();
        Iterator it = setO.iterator();
        while (true) {
            int i10 = -1;
            if (it.hasNext()) {
                Class cls = (Class) it.next();
                int size = configuration.f47864r.size() - 1;
                if (size >= 0) {
                    while (true) {
                        int i11 = size - 1;
                        if (cls.isAssignableFrom(configuration.f47864r.get(size).getClass())) {
                            bitSet.set(size);
                            i10 = size;
                            break;
                        } else if (i11 < 0) {
                            break;
                        } else {
                            size = i11;
                        }
                    }
                }
                if (i10 < 0) {
                    throw new IllegalArgumentException(("A required auto migration spec (" + cls.getCanonicalName() + ") is missing in the database configuration.").toString());
                }
                this.f47886i.put(cls, configuration.f47864r.get(i10));
            } else {
                int size2 = configuration.f47864r.size() - 1;
                if (size2 >= 0) {
                    while (true) {
                        int i12 = size2 - 1;
                        if (!bitSet.get(size2)) {
                            throw new IllegalArgumentException("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
                        }
                        if (i12 < 0) {
                            break;
                        } else {
                            size2 = i12;
                        }
                    }
                }
                for (p201l3.a aVar : j(this.f47886i)) {
                    if (!configuration.f47850d.c(aVar.f48594a, aVar.f48595b)) {
                        configuration.f47850d.b(aVar);
                    }
                }
                u uVar = (u) A(u.class, m());
                if (uVar != null) {
                    uVar.d(configuration);
                }
                p183k3.d dVar = (p183k3.d) A(p183k3.d.class, m());
                if (dVar != null) {
                    this.f47888k = dVar.f47825b;
                    l().p(dVar.f47825b);
                }
                boolean z10 = configuration.f47853g == c.WRITE_AHEAD_LOGGING;
                m().setWriteAheadLoggingEnabled(z10);
                this.f47885h = configuration.f47851e;
                this.f47879b = configuration.f47854h;
                this.f47880c = new y(configuration.f47855i);
                this.f47883f = configuration.f47852f;
                this.f47884g = z10;
                if (configuration.f47856j != null) {
                    if (configuration.f47848b == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    l().q(configuration.f47847a, configuration.f47848b, configuration.f47856j);
                }
                Map mapP = p();
                BitSet bitSet2 = new BitSet();
                for (Map.Entry entry : mapP.entrySet()) {
                    Class cls2 = (Class) entry.getKey();
                    for (Class cls3 : (List) entry.getValue()) {
                        int size3 = configuration.f47863q.size() - 1;
                        if (size3 < 0) {
                            size3 = -1;
                            break;
                        }
                        while (true) {
                            int i13 = size3 - 1;
                            if (cls3.isAssignableFrom(configuration.f47863q.get(size3).getClass())) {
                                bitSet2.set(size3);
                                break;
                            } else {
                                if (i13 < 0) {
                                    size3 = -1;
                                    break;
                                }
                                size3 = i13;
                            }
                        }
                        if (size3 < 0) {
                            throw new IllegalArgumentException(("A required type converter (" + cls3 + ") for " + cls2.getCanonicalName() + " is missing in the database configuration.").toString());
                        }
                        this.f47891n.put(cls3, configuration.f47863q.get(size3));
                    }
                }
                int size4 = configuration.f47863q.size() - 1;
                if (size4 < 0) {
                    return;
                }
                while (true) {
                    int i14 = size4 - 1;
                    if (!bitSet2.get(size4)) {
                        throw new IllegalArgumentException("Unexpected type converter " + configuration.f47863q.get(size4) + ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.");
                    }
                    if (i14 < 0) {
                        return;
                    } else {
                        size4 = i14;
                    }
                }
            }
        }
    }

    protected void u(p291q3.g db2) {
        Intrinsics.checkNotNullParameter(db2, "db");
        l().j(db2);
    }

    public final boolean v() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public final boolean w() {
        p291q3.g gVar = this.f47878a;
        return gVar != null && gVar.isOpen();
    }

    public Cursor x(j query, CancellationSignal cancellationSignal) {
        Intrinsics.checkNotNullParameter(query, "query");
        c();
        d();
        return cancellationSignal != null ? m().X2().C0(query, cancellationSignal) : m().X2().z1(query);
    }

    public void z() {
        m().X2().M0();
    }
}
