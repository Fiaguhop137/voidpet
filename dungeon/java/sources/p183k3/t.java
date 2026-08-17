package p183k3;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p291q3.i;
import p291q3.j;

/* JADX INFO: loaded from: classes.dex */
public final class t implements j, i {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f47930i = new a(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final TreeMap f47931j = new TreeMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f47932a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile String f47933b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long[] f47934c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final double[] f47935d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String[] f47936e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte[][] f47937f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int[] f47938g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f47939h;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final t a(String query, int i10) {
            Intrinsics.checkNotNullParameter(query, "query");
            TreeMap treeMap = t.f47931j;
            synchronized (treeMap) {
                Map.Entry entryCeilingEntry = treeMap.ceilingEntry(Integer.valueOf(i10));
                if (entryCeilingEntry == null) {
                    Unit unit = Unit.f48228a;
                    t tVar = new t(i10, null);
                    tVar.d(query, i10);
                    return tVar;
                }
                treeMap.remove(entryCeilingEntry.getKey());
                t sqliteQuery = (t) entryCeilingEntry.getValue();
                sqliteQuery.d(query, i10);
                Intrinsics.checkNotNullExpressionValue(sqliteQuery, "sqliteQuery");
                return sqliteQuery;
            }
        }

        public final void b() {
            TreeMap treeMap = t.f47931j;
            if (treeMap.size() <= 15) {
                return;
            }
            int size = treeMap.size() - 10;
            Iterator it = treeMap.descendingKeySet().iterator();
            Intrinsics.checkNotNullExpressionValue(it, "queryPool.descendingKeySet().iterator()");
            while (true) {
                int i10 = size - 1;
                if (size <= 0) {
                    return;
                }
                it.next();
                it.remove();
                size = i10;
            }
        }
    }

    private t(int i10) {
        this.f47932a = i10;
        int i11 = i10 + 1;
        this.f47938g = new int[i11];
        this.f47934c = new long[i11];
        this.f47935d = new double[i11];
        this.f47936e = new String[i11];
        this.f47937f = new byte[i11][];
    }

    public /* synthetic */ t(int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10);
    }

    @Override // p291q3.i
    public void N2(int i10, long j10) {
        this.f47938g[i10] = 2;
        this.f47934c[i10] = j10;
    }

    @Override // p291q3.i
    public void R2(int i10, byte[] value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f47938g[i10] = 5;
        this.f47937f[i10] = value;
    }

    @Override // p291q3.j
    public void a(i statement) {
        Intrinsics.checkNotNullParameter(statement, "statement");
        int iC = c();
        if (1 > iC) {
            return;
        }
        int i10 = 1;
        while (true) {
            int i11 = this.f47938g[i10];
            if (i11 == 1) {
                statement.q3(i10);
            } else if (i11 == 2) {
                statement.N2(i10, this.f47934c[i10]);
            } else if (i11 == 3) {
                statement.w0(i10, this.f47935d[i10]);
            } else if (i11 == 4) {
                String str = this.f47936e[i10];
                if (str == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                statement.n2(i10, str);
            } else if (i11 == 5) {
                byte[] bArr = this.f47937f[i10];
                if (bArr == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                statement.R2(i10, bArr);
            }
            if (i10 == iC) {
                return;
            } else {
                i10++;
            }
        }
    }

    @Override // p291q3.j
    public String b() {
        String str = this.f47933b;
        if (str != null) {
            return str;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public int c() {
        return this.f47939h;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public final void d(String query, int i10) {
        Intrinsics.checkNotNullParameter(query, "query");
        this.f47933b = query;
        this.f47939h = i10;
    }

    public final void e() {
        TreeMap treeMap = f47931j;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.f47932a), this);
            f47930i.b();
            Unit unit = Unit.f48228a;
        }
    }

    @Override // p291q3.i
    public void n2(int i10, String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f47938g[i10] = 4;
        this.f47936e[i10] = value;
    }

    @Override // p291q3.i
    public void q3(int i10) {
        this.f47938g[i10] = 1;
    }

    @Override // p291q3.i
    public void w0(int i10, double d10) {
        this.f47938g[i10] = 3;
        this.f47935d[i10] = d10;
    }
}
