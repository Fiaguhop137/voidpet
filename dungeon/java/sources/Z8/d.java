package Z8;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;

/* JADX INFO: loaded from: classes2.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f18808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f18809b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private TimeInterpolator f18810c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f18811d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f18812e;

    public d(long j10, long j11) {
        this.f18810c = null;
        this.f18811d = 0;
        this.f18812e = 1;
        this.f18808a = j10;
        this.f18809b = j11;
    }

    public d(long j10, long j11, TimeInterpolator timeInterpolator) {
        this.f18811d = 0;
        this.f18812e = 1;
        this.f18808a = j10;
        this.f18809b = j11;
        this.f18810c = timeInterpolator;
    }

    static d a(ValueAnimator valueAnimator) {
        d dVar = new d(valueAnimator.getStartDelay(), valueAnimator.getDuration(), e(valueAnimator));
        dVar.f18811d = valueAnimator.getRepeatCount();
        dVar.f18812e = valueAnimator.getRepeatMode();
        return dVar;
    }

    private static TimeInterpolator e(ValueAnimator valueAnimator) {
        TimeInterpolator interpolator = valueAnimator.getInterpolator();
        if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
            return a.f18802b;
        }
        if (interpolator instanceof AccelerateInterpolator) {
            return a.f18803c;
        }
        return interpolator instanceof DecelerateInterpolator ? a.f18804d : interpolator;
    }

    public long b() {
        return this.f18808a;
    }

    public long c() {
        return this.f18809b;
    }

    public TimeInterpolator d() {
        TimeInterpolator timeInterpolator = this.f18810c;
        return timeInterpolator != null ? timeInterpolator : a.f18802b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (b() == dVar.b() && c() == dVar.c() && f() == dVar.f() && g() == dVar.g()) {
            return d().getClass().equals(dVar.d().getClass());
        }
        return false;
    }

    public int f() {
        return this.f18811d;
    }

    public int g() {
        return this.f18812e;
    }

    public int hashCode() {
        return (((((((((int) (b() ^ (b() >>> 32))) * 31) + ((int) (c() ^ (c() >>> 32)))) * 31) + d().getClass().hashCode()) * 31) + f()) * 31) + g();
    }

    public String toString() {
        return '\n' + getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + b() + " duration: " + c() + " interpolator: " + d().getClass() + " repeatCount: " + f() + " repeatMode: " + g() + "}\n";
    }
}
