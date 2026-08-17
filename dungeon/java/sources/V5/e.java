package V5;

import android.graphics.Bitmap;
import android.graphics.ColorSpace;

/* JADX INFO: loaded from: classes2.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f14083a = 100;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f14084b = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f14085c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f14086d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f14087e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f14088f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f14089g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Bitmap.Config f14090h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Bitmap.Config f14091i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Z5.c f14092j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private ColorSpace f14093k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f14094l;

    public e() {
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        this.f14090h = config;
        this.f14091i = config;
    }

    public d a() {
        return new d(this);
    }

    public Bitmap.Config b() {
        return this.f14091i;
    }

    public Bitmap.Config c() {
        return this.f14090h;
    }

    public p186k6.a d() {
        return null;
    }

    public ColorSpace e() {
        return this.f14093k;
    }

    public Z5.c f() {
        return this.f14092j;
    }

    public boolean g() {
        return this.f14088f;
    }

    public boolean h() {
        return this.f14085c;
    }

    public boolean i() {
        return this.f14094l;
    }

    public boolean j() {
        return this.f14089g;
    }

    public int k() {
        return this.f14084b;
    }

    public int l() {
        return this.f14083a;
    }

    public boolean m() {
        return this.f14087e;
    }

    public boolean n() {
        return this.f14086d;
    }
}
