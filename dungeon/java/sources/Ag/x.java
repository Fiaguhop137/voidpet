package Ag;

import Pf.C1328t;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class x {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Map f482i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w f483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f484b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f485c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C1328t f486d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f487e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f488f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f489g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final m f490h;

    static {
        HashMap map = new HashMap();
        Integer numB = Ug.d.b(1);
        C1328t c1328t = Rf.a.f11228c;
        map.put(numB, new x(10, c1328t));
        map.put(Ug.d.b(2), new x(16, c1328t));
        map.put(Ug.d.b(3), new x(20, c1328t));
        Integer numB2 = Ug.d.b(4);
        C1328t c1328t2 = Rf.a.f11232e;
        map.put(numB2, new x(10, c1328t2));
        map.put(Ug.d.b(5), new x(16, c1328t2));
        map.put(Ug.d.b(6), new x(20, c1328t2));
        Integer numB3 = Ug.d.b(7);
        C1328t c1328t3 = Rf.a.f11248m;
        map.put(numB3, new x(10, c1328t3));
        map.put(Ug.d.b(8), new x(16, c1328t3));
        map.put(Ug.d.b(9), new x(20, c1328t3));
        Integer numB4 = Ug.d.b(10);
        C1328t c1328t4 = Rf.a.f11250n;
        map.put(numB4, new x(10, c1328t4));
        map.put(Ug.d.b(11), new x(16, c1328t4));
        map.put(Ug.d.b(12), new x(20, c1328t4));
        f482i = Collections.unmodifiableMap(map);
    }

    public x(int i10, C1328t c1328t) {
        if (i10 < 2) {
            throw new IllegalArgumentException("height must be >= 2");
        }
        if (c1328t == null) {
            throw new NullPointerException("digest == null");
        }
        this.f484b = i10;
        this.f485c = a();
        String strB = f.b(c1328t);
        this.f488f = strB;
        this.f486d = c1328t;
        m mVar = new m(c1328t);
        this.f490h = mVar;
        int iC = mVar.c();
        this.f489g = iC;
        int iD = mVar.d();
        this.f487e = iD;
        this.f483a = e.c(strB, iC, iD, mVar.a(), i10);
    }

    public x(int i10, Vf.j jVar) {
        this(i10, f.c(jVar.c()));
    }

    private int a() {
        int i10 = 2;
        while (true) {
            int i11 = this.f484b;
            if (i10 > i11) {
                throw new IllegalStateException("should never happen...");
            }
            if ((i11 - i10) % 2 == 0) {
                return i10;
            }
            i10++;
        }
    }

    public static x k(int i10) {
        return (x) f482i.get(Ug.d.b(i10));
    }

    public int b() {
        return this.f484b;
    }

    int c() {
        return this.f485c;
    }

    int d() {
        return this.f490h.a();
    }

    w e() {
        return this.f483a;
    }

    String f() {
        return this.f488f;
    }

    public C1328t g() {
        return this.f486d;
    }

    public int h() {
        return this.f489g;
    }

    k i() {
        return new k(this.f490h);
    }

    int j() {
        return this.f487e;
    }
}
