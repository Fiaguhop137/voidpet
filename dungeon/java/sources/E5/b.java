package E5;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p329s5.C4164d;

/* JADX INFO: loaded from: classes2.dex */
public class b extends Drawable implements Animatable, p185k5.a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final a f2683r = new a(null);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final Class f2684s = b.class;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final d f2685t = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private p419x5.a f2686a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private G5.b f2687b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile boolean f2688c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f2689d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f2690e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f2691f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f2692g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f2693h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f2694i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f2695j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f2697l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f2698m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final p419x5.a.InterfaceC0742a f2700o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private C4164d f2701p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Runnable f2702q;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f2696k = 8;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private volatile d f2699n = f2685t;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final G5.b b(p419x5.a aVar) {
            if (aVar == null) {
                return null;
            }
            return new G5.a(aVar);
        }
    }

    /* JADX INFO: renamed from: E5.b$b, reason: collision with other inner class name */
    public static final class RunnableC0056b implements Runnable {
        RunnableC0056b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.unscheduleSelf(this);
            b.this.invalidateSelf();
        }
    }

    public b(p419x5.a aVar) {
        this.f2686a = aVar;
        E5.a aVar2 = new E5.a(this);
        this.f2700o = aVar2;
        this.f2702q = new RunnableC0056b();
        this.f2687b = f2683r.b(this.f2686a);
        p419x5.a aVar3 = this.f2686a;
        if (aVar3 != null) {
            aVar3.k(aVar2);
        }
    }

    private final long b() {
        return SystemClock.uptimeMillis();
    }

    private final void c() {
        this.f2698m++;
        if (W4.a.w(2)) {
            W4.a.y(f2684s, "Dropped a frame. Count: %s", Integer.valueOf(this.f2698m));
        }
    }

    private final void d(long j10) {
        long j11 = this.f2689d + j10;
        this.f2691f = j11;
        scheduleSelf(this.f2702q, j11);
    }

    @Override // p185k5.a
    public void a() {
        p419x5.a aVar = this.f2686a;
        if (aVar != null) {
            aVar.clear();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (this.f2686a == null || this.f2687b == null) {
            return;
        }
        long jB = b();
        long jMax = this.f2688c ? (jB - this.f2689d) + this.f2697l : (long) Math.max(this.f2690e, 0.0d);
        G5.b bVar = this.f2687b;
        Intrinsics.c(bVar);
        int iB = bVar.b(jMax, this.f2690e);
        if (iB == -1) {
            p419x5.a aVar = this.f2686a;
            Intrinsics.c(aVar);
            iB = aVar.a() - 1;
            this.f2699n.c(this);
            this.f2688c = false;
        } else if (iB == 0 && this.f2692g != -1 && jB >= this.f2691f) {
            this.f2699n.a(this);
        }
        p419x5.a aVar2 = this.f2686a;
        Intrinsics.c(aVar2);
        boolean zH = aVar2.h(this, canvas, iB);
        if (zH) {
            this.f2699n.d(this, iB);
            this.f2692g = iB;
        }
        if (!zH) {
            c();
        }
        long jB2 = b();
        if (this.f2688c) {
            G5.b bVar2 = this.f2687b;
            Intrinsics.c(bVar2);
            long jA = bVar2.a(jB2 - this.f2689d);
            if (jA != -1) {
                d(jA + this.f2696k);
            } else {
                this.f2699n.c(this);
                this.f2688c = false;
            }
        }
        this.f2690e = jMax;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        p419x5.a aVar = this.f2686a;
        return aVar != null ? aVar.c() : super.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        p419x5.a aVar = this.f2686a;
        return aVar != null ? aVar.e() : super.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f2688c;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect bounds) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        super.onBoundsChange(bounds);
        p419x5.a aVar = this.f2686a;
        if (aVar != null) {
            aVar.d(bounds);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i10) {
        if (this.f2688c) {
            return false;
        }
        long j10 = i10;
        if (this.f2690e == j10) {
            return false;
        }
        this.f2690e = j10;
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        if (this.f2701p == null) {
            this.f2701p = new C4164d();
        }
        C4164d c4164d = this.f2701p;
        Intrinsics.c(c4164d);
        c4164d.b(i10);
        p419x5.a aVar = this.f2686a;
        if (aVar != null) {
            aVar.m(i10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.f2701p == null) {
            this.f2701p = new C4164d();
        }
        C4164d c4164d = this.f2701p;
        Intrinsics.c(c4164d);
        c4164d.c(colorFilter);
        p419x5.a aVar = this.f2686a;
        if (aVar != null) {
            aVar.f(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        p419x5.a aVar;
        if (this.f2688c || (aVar = this.f2686a) == null) {
            return;
        }
        Intrinsics.c(aVar);
        if (aVar.a() <= 1) {
            return;
        }
        this.f2688c = true;
        long jB = b();
        long j10 = jB - this.f2693h;
        this.f2689d = j10;
        this.f2691f = j10;
        this.f2690e = jB - this.f2694i;
        this.f2692g = this.f2695j;
        invalidateSelf();
        this.f2699n.b(this);
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        if (this.f2688c) {
            long jB = b();
            this.f2693h = jB - this.f2689d;
            this.f2694i = jB - this.f2690e;
            this.f2695j = this.f2692g;
            this.f2688c = false;
            this.f2689d = 0L;
            this.f2691f = 0L;
            this.f2690e = -1L;
            this.f2692g = -1;
            unscheduleSelf(this.f2702q);
            this.f2699n.c(this);
        }
    }
}
