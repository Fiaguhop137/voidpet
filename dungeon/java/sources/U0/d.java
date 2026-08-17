package U0;

import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f12657b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f12658c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public d f12659d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    T0.i f12662g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HashSet f12656a = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f12660e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f12661f = -1;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f12663a;

        static {
            int[] iArr = new int[b.values().length];
            f12663a = iArr;
            try {
                iArr[b.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12663a[b.LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12663a[b.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f12663a[b.TOP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f12663a[b.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f12663a[b.BASELINE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f12663a[b.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f12663a[b.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f12663a[b.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public enum b {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    public d(e eVar, b bVar) {
        this.f12657b = eVar;
        this.f12658c = bVar;
    }

    public boolean a(d dVar, int i10) {
        return b(dVar, i10, -1, false);
    }

    public boolean b(d dVar, int i10, int i11, boolean z10) {
        if (dVar == null) {
            l();
            return true;
        }
        if (!z10 && !k(dVar)) {
            return false;
        }
        this.f12659d = dVar;
        if (dVar.f12656a == null) {
            dVar.f12656a = new HashSet();
        }
        this.f12659d.f12656a.add(this);
        if (i10 > 0) {
            this.f12660e = i10;
        } else {
            this.f12660e = 0;
        }
        this.f12661f = i11;
        return true;
    }

    public int c() {
        d dVar;
        if (this.f12657b.O() == 8) {
            return 0;
        }
        return (this.f12661f <= -1 || (dVar = this.f12659d) == null || dVar.f12657b.O() != 8) ? this.f12660e : this.f12661f;
    }

    public final d d() {
        switch (a.f12663a[this.f12658c.ordinal()]) {
            case 1:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
            case 2:
                return this.f12657b.f12678D;
            case 3:
                return this.f12657b.f12676B;
            case 4:
                return this.f12657b.f12679E;
            case 5:
                return this.f12657b.f12677C;
            default:
                throw new AssertionError(this.f12658c.name());
        }
    }

    public e e() {
        return this.f12657b;
    }

    public T0.i f() {
        return this.f12662g;
    }

    public d g() {
        return this.f12659d;
    }

    public b h() {
        return this.f12658c;
    }

    public boolean i() {
        HashSet hashSet = this.f12656a;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((d) it.next()).d().j()) {
                return true;
            }
        }
        return false;
    }

    public boolean j() {
        return this.f12659d != null;
    }

    public boolean k(d dVar) {
        if (dVar == null) {
            return false;
        }
        b bVarH = dVar.h();
        b bVar = this.f12658c;
        if (bVarH == bVar) {
            return bVar != b.BASELINE || (dVar.e().S() && e().S());
        }
        switch (a.f12663a[bVar.ordinal()]) {
            case 1:
                return (bVarH == b.BASELINE || bVarH == b.CENTER_X || bVarH == b.CENTER_Y) ? false : true;
            case 2:
            case 3:
                boolean z10 = bVarH == b.LEFT || bVarH == b.RIGHT;
                if (dVar.e() instanceof h) {
                    return z10 || bVarH == b.CENTER_X;
                }
                return z10;
            case 4:
            case 5:
                boolean z11 = bVarH == b.TOP || bVarH == b.BOTTOM;
                if (dVar.e() instanceof h) {
                    return z11 || bVarH == b.CENTER_Y;
                }
                return z11;
            case 6:
            case 7:
            case 8:
            case 9:
                return false;
            default:
                throw new AssertionError(this.f12658c.name());
        }
    }

    public void l() {
        HashSet hashSet;
        d dVar = this.f12659d;
        if (dVar != null && (hashSet = dVar.f12656a) != null) {
            hashSet.remove(this);
        }
        this.f12659d = null;
        this.f12660e = 0;
        this.f12661f = -1;
    }

    public void m(T0.c cVar) {
        T0.i iVar = this.f12662g;
        if (iVar == null) {
            this.f12662g = new T0.i(T0.i.a.UNRESTRICTED, null);
        } else {
            iVar.d();
        }
    }

    public void n(int i10) {
        if (j()) {
            this.f12661f = i10;
        }
    }

    public String toString() {
        return this.f12657b.r() + ":" + this.f12658c.toString();
    }
}
