package E5;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.Intrinsics;
import p329s5.C4164d;

/* JADX INFO: loaded from: classes2.dex */
public class f extends Drawable implements Animatable, p185k5.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private p419x5.a f2716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c f2717b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private d f2718c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C4164d f2719d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final a f2720e;

    public static final class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            f.this.unscheduleSelf(this);
            f.this.invalidateSelf();
        }
    }

    public f(p419x5.a animationBackend) {
        Intrinsics.checkNotNullParameter(animationBackend, "animationBackend");
        this.f2716a = animationBackend;
        this.f2717b = new c(new G5.a(this.f2716a));
        this.f2718c = new e();
        C4164d c4164d = new C4164d();
        c4164d.a(this);
        this.f2719d = c4164d;
        this.f2720e = new a();
    }

    @Override // p185k5.a
    public void a() {
        this.f2716a.clear();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        int iA = this.f2717b.a();
        if (iA == -1) {
            iA = this.f2716a.a() - 1;
            this.f2717b.g(false);
            this.f2718c.c(this);
        } else if (iA == 0 && this.f2717b.h()) {
            this.f2718c.a(this);
        }
        if (this.f2716a.h(this, canvas, iA)) {
            this.f2718c.d(this, iA);
            this.f2717b.f(iA);
        } else {
            this.f2717b.e();
        }
        long jC = this.f2717b.c();
        if (jC != -1) {
            scheduleSelf(this.f2720e, jC);
        } else {
            this.f2718c.c(this);
            this.f2717b.g(false);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f2716a.c();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f2716a.e();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f2717b.b();
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect bounds) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        this.f2716a.d(bounds);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.f2719d.b(i10);
        this.f2716a.m(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f2719d.c(colorFilter);
        this.f2716a.f(colorFilter);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        if (this.f2716a.a() <= 0) {
            return;
        }
        this.f2717b.i();
        this.f2718c.b(this);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.f2717b.j();
        this.f2718c.c(this);
        unscheduleSelf(this.f2720e);
    }
}
