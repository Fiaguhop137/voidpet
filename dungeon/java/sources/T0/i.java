package T0;

import java.util.Arrays;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public class i {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static int f11888o = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f11889a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f11890b;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f11894f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    a f11898j;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f11891c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f11892d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f11893e = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f11895g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    float[] f11896h = new float[9];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    float[] f11897i = new float[9];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    b[] f11899k = new b[16];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    int f11900l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f11901m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    HashSet f11902n = null;

    public enum a {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public i(a aVar, String str) {
        this.f11898j = aVar;
    }

    static void b() {
        f11888o++;
    }

    public final void a(b bVar) {
        int i10 = 0;
        while (true) {
            int i11 = this.f11900l;
            if (i10 >= i11) {
                b[] bVarArr = this.f11899k;
                if (i11 >= bVarArr.length) {
                    this.f11899k = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
                }
                b[] bVarArr2 = this.f11899k;
                int i12 = this.f11900l;
                bVarArr2[i12] = bVar;
                this.f11900l = i12 + 1;
                return;
            }
            if (this.f11899k[i10] == bVar) {
                return;
            } else {
                i10++;
            }
        }
    }

    public final void c(b bVar) {
        int i10 = this.f11900l;
        int i11 = 0;
        while (i11 < i10) {
            if (this.f11899k[i11] == bVar) {
                while (i11 < i10 - 1) {
                    b[] bVarArr = this.f11899k;
                    int i12 = i11 + 1;
                    bVarArr[i11] = bVarArr[i12];
                    i11 = i12;
                }
                this.f11900l--;
                return;
            }
            i11++;
        }
    }

    public void d() {
        this.f11890b = null;
        this.f11898j = a.UNKNOWN;
        this.f11893e = 0;
        this.f11891c = -1;
        this.f11892d = -1;
        this.f11894f = 0.0f;
        this.f11895g = false;
        int i10 = this.f11900l;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f11899k[i11] = null;
        }
        this.f11900l = 0;
        this.f11901m = 0;
        this.f11889a = false;
        Arrays.fill(this.f11897i, 0.0f);
    }

    public void e(d dVar, float f10) {
        this.f11894f = f10;
        this.f11895g = true;
        int i10 = this.f11900l;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f11899k[i11].B(dVar, this, false);
        }
        this.f11900l = 0;
    }

    public void f(a aVar, String str) {
        this.f11898j = aVar;
    }

    public final void g(b bVar) {
        int i10 = this.f11900l;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f11899k[i11].C(bVar, false);
        }
        this.f11900l = 0;
    }

    public String toString() {
        if (this.f11890b != null) {
            return "" + this.f11890b;
        }
        return "" + this.f11891c;
    }
}
