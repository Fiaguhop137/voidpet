package p394vg;

import Vf.b;
import Vf.j;
import Xf.e;
import Xf.g;

/* JADX INFO: loaded from: classes3.dex */
public class f implements b {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final f f56399j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final f f56400k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final f f56401l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final f f56402m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final f f56403n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final f f56404o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f56405a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f56406b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f56407c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f56408d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f56409e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f56410f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final j f56411g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final j f56412h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f56413i;

    static {
        j jVar = j.CLASSIC;
        f56399j = new f("rainbow-III-classic", 3, jVar);
        j jVar2 = j.CIRCUMZENITHAL;
        f56400k = new f("rainbow-III-circumzenithal", 3, jVar2);
        j jVar3 = j.COMPRESSED;
        f56401l = new f("rainbow-III-compressed", 3, jVar3);
        f56402m = new f("rainbow-V-classic", 5, jVar);
        f56403n = new f("rainbow-V-circumzenithal", 5, jVar2);
        f56404o = new f("rainbow-V-compressed", 5, jVar3);
    }

    private f(String str, int i10, j jVar) {
        j eVar;
        this.f56413i = str;
        if (i10 == 3) {
            this.f56405a = 68;
            this.f56407c = 32;
            this.f56408d = 48;
            eVar = new e();
        } else {
            if (i10 != 5) {
                throw new IllegalArgumentException("No valid version. Please choose one of the following: 3, 5");
            }
            this.f56405a = 96;
            this.f56407c = 36;
            this.f56408d = 64;
            eVar = new g();
        }
        this.f56411g = eVar;
        int i11 = this.f56405a;
        int i12 = this.f56407c;
        this.f56406b = i11 + i12;
        int i13 = this.f56408d;
        this.f56409e = i11 + i12 + i13;
        this.f56410f = i12 + i13;
        this.f56412h = jVar;
    }

    j a() {
        return this.f56411g;
    }

    int b() {
        return 32;
    }

    int c() {
        return 32;
    }

    int d() {
        return this.f56410f;
    }

    int e() {
        return this.f56409e;
    }

    int f() {
        return this.f56407c;
    }

    int g() {
        return this.f56408d;
    }

    int h() {
        return this.f56405a;
    }

    j i() {
        return this.f56412h;
    }
}
