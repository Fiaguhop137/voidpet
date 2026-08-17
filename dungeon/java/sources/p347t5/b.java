package p347t5;

import V4.k;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import java.util.Iterator;
import java.util.List;
import p329s5.q;

/* JADX INFO: loaded from: classes2.dex */
public class b {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final q f54479t = q.f53433h;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final q f54480u = q.f53434i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Resources f54481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f54482b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f54483c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Drawable f54484d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private q f54485e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Drawable f54486f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private q f54487g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Drawable f54488h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private q f54489i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Drawable f54490j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private q f54491k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private q f54492l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Matrix f54493m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private PointF f54494n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private ColorFilter f54495o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Drawable f54496p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private List f54497q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Drawable f54498r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private d f54499s;

    public b(Resources resources) {
        this.f54481a = resources;
        s();
    }

    private void s() {
        this.f54482b = 300;
        this.f54483c = 0.0f;
        this.f54484d = null;
        q qVar = f54479t;
        this.f54485e = qVar;
        this.f54486f = null;
        this.f54487g = qVar;
        this.f54488h = null;
        this.f54489i = qVar;
        this.f54490j = null;
        this.f54491k = qVar;
        this.f54492l = f54480u;
        this.f54493m = null;
        this.f54494n = null;
        this.f54495o = null;
        this.f54496p = null;
        this.f54497q = null;
        this.f54498r = null;
        this.f54499s = null;
    }

    public static b t(Resources resources) {
        return new b(resources);
    }

    private void v() {
        List list = this.f54497q;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                k.g((Drawable) it.next());
            }
        }
    }

    public a a() {
        v();
        return new a(this);
    }

    public ColorFilter b() {
        return this.f54495o;
    }

    public PointF c() {
        return this.f54494n;
    }

    public q d() {
        return this.f54492l;
    }

    public Drawable e() {
        return this.f54496p;
    }

    public int f() {
        return this.f54482b;
    }

    public Drawable g() {
        return this.f54488h;
    }

    public q h() {
        return this.f54489i;
    }

    public List i() {
        return this.f54497q;
    }

    public Drawable j() {
        return this.f54484d;
    }

    public q k() {
        return this.f54485e;
    }

    public Drawable l() {
        return this.f54498r;
    }

    public Drawable m() {
        return this.f54490j;
    }

    public q n() {
        return this.f54491k;
    }

    public Resources o() {
        return this.f54481a;
    }

    public Drawable p() {
        return this.f54486f;
    }

    public q q() {
        return this.f54487g;
    }

    public d r() {
        return this.f54499s;
    }

    public b u(d dVar) {
        this.f54499s = dVar;
        return this;
    }
}
