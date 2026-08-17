package Ag;

import Pf.C1328t;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class r {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Map f450e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final w f451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final x f452b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f453c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f454d;

    static {
        HashMap map = new HashMap();
        Integer numB = Ug.d.b(1);
        C1328t c1328t = Rf.a.f11228c;
        map.put(numB, new r(20, 2, c1328t));
        map.put(Ug.d.b(2), new r(20, 4, c1328t));
        map.put(Ug.d.b(3), new r(40, 2, c1328t));
        map.put(Ug.d.b(4), new r(40, 4, c1328t));
        map.put(Ug.d.b(5), new r(40, 8, c1328t));
        map.put(Ug.d.b(6), new r(60, 3, c1328t));
        map.put(Ug.d.b(7), new r(60, 6, c1328t));
        map.put(Ug.d.b(8), new r(60, 12, c1328t));
        Integer numB2 = Ug.d.b(9);
        C1328t c1328t2 = Rf.a.f11232e;
        map.put(numB2, new r(20, 2, c1328t2));
        map.put(Ug.d.b(10), new r(20, 4, c1328t2));
        map.put(Ug.d.b(11), new r(40, 2, c1328t2));
        map.put(Ug.d.b(12), new r(40, 4, c1328t2));
        map.put(Ug.d.b(13), new r(40, 8, c1328t2));
        map.put(Ug.d.b(14), new r(60, 3, c1328t2));
        map.put(Ug.d.b(15), new r(60, 6, c1328t2));
        map.put(Ug.d.b(16), new r(60, 12, c1328t2));
        Integer numB3 = Ug.d.b(17);
        C1328t c1328t3 = Rf.a.f11248m;
        map.put(numB3, new r(20, 2, c1328t3));
        map.put(Ug.d.b(18), new r(20, 4, c1328t3));
        map.put(Ug.d.b(19), new r(40, 2, c1328t3));
        map.put(Ug.d.b(20), new r(40, 4, c1328t3));
        map.put(Ug.d.b(21), new r(40, 8, c1328t3));
        map.put(Ug.d.b(22), new r(60, 3, c1328t3));
        map.put(Ug.d.b(23), new r(60, 6, c1328t3));
        map.put(Ug.d.b(24), new r(60, 12, c1328t3));
        Integer numB4 = Ug.d.b(25);
        C1328t c1328t4 = Rf.a.f11250n;
        map.put(numB4, new r(20, 2, c1328t4));
        map.put(Ug.d.b(26), new r(20, 4, c1328t4));
        map.put(Ug.d.b(27), new r(40, 2, c1328t4));
        map.put(Ug.d.b(28), new r(40, 4, c1328t4));
        map.put(Ug.d.b(29), new r(40, 8, c1328t4));
        map.put(Ug.d.b(30), new r(60, 3, c1328t4));
        map.put(Ug.d.b(31), new r(60, 6, c1328t4));
        map.put(Ug.d.b(32), new r(60, 12, c1328t4));
        f450e = Collections.unmodifiableMap(map);
    }

    public r(int i10, int i11, C1328t c1328t) {
        this.f453c = i10;
        this.f454d = i11;
        this.f452b = new x(j(i10, i11), c1328t);
        this.f451a = d.c(e(), f(), g(), c(), a(), i11);
    }

    public r(int i10, int i11, Vf.j jVar) {
        this(i10, i11, f.c(jVar.c()));
    }

    public static r i(int i10) {
        return (r) f450e.get(Ug.d.b(i10));
    }

    private static int j(int i10, int i11) {
        if (i10 < 2) {
            throw new IllegalArgumentException("totalHeight must be > 1");
        }
        if (i10 % i11 != 0) {
            throw new IllegalArgumentException("layers must divide totalHeight without remainder");
        }
        int i12 = i10 / i11;
        if (i12 != 1) {
            return i12;
        }
        throw new IllegalArgumentException("height / layers must be greater than 1");
    }

    public int a() {
        return this.f453c;
    }

    public int b() {
        return this.f454d;
    }

    protected int c() {
        return this.f452b.d();
    }

    protected w d() {
        return this.f451a;
    }

    protected String e() {
        return this.f452b.f();
    }

    public int f() {
        return this.f452b.h();
    }

    int g() {
        return this.f452b.j();
    }

    protected x h() {
        return this.f452b;
    }
}
