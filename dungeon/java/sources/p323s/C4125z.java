package p323s;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p341t.b;
import p341t.c;
import p341t.d;

/* JADX INFO: renamed from: s.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C4125z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f52780a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c f52781b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f52782c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f52783d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f52784e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f52785f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f52786g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f52787h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f52788i;

    public C4125z(int i10) {
        this.f52780a = i10;
        if (!(i10 > 0)) {
            d.a("maxSize <= 0");
        }
        this.f52781b = new c(0, 0.75f);
        this.f52782c = new b();
    }

    private final int f(Object obj, Object obj2) {
        int iG = g(obj, obj2);
        if (!(iG >= 0)) {
            d.b("Negative size: " + obj + '=' + obj2);
        }
        return iG;
    }

    protected Object a(Object key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return null;
    }

    protected void b(boolean z10, Object key, Object oldValue, Object obj) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(oldValue, "oldValue");
    }

    public final Object c(Object key) {
        Object objD;
        Intrinsics.checkNotNullParameter(key, "key");
        synchronized (this.f52782c) {
            Object objA = this.f52781b.a(key);
            if (objA != null) {
                this.f52787h++;
                return objA;
            }
            this.f52788i++;
            Object objA2 = a(key);
            if (objA2 == null) {
                return null;
            }
            synchronized (this.f52782c) {
                try {
                    this.f52785f++;
                    objD = this.f52781b.d(key, objA2);
                    if (objD != null) {
                        this.f52781b.d(key, objD);
                    } else {
                        this.f52783d += f(key, objA2);
                        Unit unit = Unit.f48228a;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (objD != null) {
                b(false, key, objA2, objD);
                return objD;
            }
            i(this.f52780a);
            return objA2;
        }
    }

    public final Object d(Object key, Object value) {
        Object objD;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        synchronized (this.f52782c) {
            try {
                this.f52784e++;
                this.f52783d += f(key, value);
                objD = this.f52781b.d(key, value);
                if (objD != null) {
                    this.f52783d -= f(key, objD);
                }
                Unit unit = Unit.f48228a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (objD != null) {
            b(false, key, objD, value);
        }
        i(this.f52780a);
        return objD;
    }

    public final Object e(Object key) {
        Object objE;
        Intrinsics.checkNotNullParameter(key, "key");
        synchronized (this.f52782c) {
            try {
                objE = this.f52781b.e(key);
                if (objE != null) {
                    this.f52783d -= f(key, objE);
                }
                Unit unit = Unit.f48228a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (objE != null) {
            b(false, key, objE, null);
        }
        return objE;
    }

    protected int g(Object key, Object value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        return 1;
    }

    public final Map h() {
        LinkedHashMap linkedHashMap;
        synchronized (this.f52782c) {
            linkedHashMap = new LinkedHashMap(this.f52781b.b().size());
            for (Map.Entry entry : this.f52781b.b()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    public void i(int i10) {
        Object key;
        Object value;
        while (true) {
            synchronized (this.f52782c) {
                try {
                    if (!(this.f52783d >= 0 && (!this.f52781b.c() || this.f52783d == 0))) {
                        d.b("LruCache.sizeOf() is reporting inconsistent results!");
                    }
                    if (this.f52783d <= i10 || this.f52781b.c()) {
                        break;
                        break;
                    }
                    Map.Entry entry = (Map.Entry) CollectionsKt.k0(this.f52781b.b());
                    if (entry == null) {
                        return;
                    }
                    key = entry.getKey();
                    value = entry.getValue();
                    this.f52781b.e(key);
                    this.f52783d -= f(key, value);
                    this.f52786g++;
                } catch (Throwable th) {
                    throw th;
                }
            }
            b(true, key, value, null);
        }
    }

    public String toString() {
        String str;
        synchronized (this.f52782c) {
            try {
                int i10 = this.f52787h;
                int i11 = this.f52788i + i10;
                str = "LruCache[maxSize=" + this.f52780a + ",hits=" + this.f52787h + ",misses=" + this.f52788i + ",hitRate=" + (i11 != 0 ? (i10 * 100) / i11 : 0) + "%]";
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }
}
