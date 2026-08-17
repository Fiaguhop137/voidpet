package io.sentry.android.core.performance;

import android.os.SystemClock;
import io.sentry.AbstractC3732l;
import io.sentry.AbstractC3750o2;
import io.sentry.C3751o3;

/* JADX INFO: loaded from: classes3.dex */
public class h implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f45144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f45145b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f45146c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f45147d;

    public void A(long j10) {
        this.f45146c = j10;
        this.f45145b = System.currentTimeMillis() - (SystemClock.uptimeMillis() - this.f45146c);
    }

    public void B(String str, long j10, long j11, long j12) {
        this.f45144a = str;
        this.f45145b = j10;
        this.f45146c = j11;
        this.f45147d = j12;
    }

    public void C() {
        this.f45147d = SystemClock.uptimeMillis();
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public int compareTo(h hVar) {
        return Long.compare(this.f45145b, hVar.f45145b);
    }

    public String g() {
        return this.f45144a;
    }

    public long h() {
        if (y()) {
            return this.f45147d - this.f45146c;
        }
        return 0L;
    }

    public AbstractC3750o2 i() {
        if (y()) {
            return new C3751o3(AbstractC3732l.i(o()));
        }
        return null;
    }

    public long o() {
        if (x()) {
            return this.f45145b + h();
        }
        return 0L;
    }

    public double p() {
        return AbstractC3732l.j(o());
    }

    public AbstractC3750o2 r() {
        if (x()) {
            return new C3751o3(AbstractC3732l.i(s()));
        }
        return null;
    }

    public long s() {
        return this.f45145b;
    }

    public double t() {
        return AbstractC3732l.j(this.f45145b);
    }

    public long u() {
        return this.f45146c;
    }

    public boolean v() {
        return this.f45146c == 0;
    }

    public boolean w() {
        return this.f45147d == 0;
    }

    public boolean x() {
        return this.f45146c != 0;
    }

    public boolean y() {
        return this.f45147d != 0;
    }

    public void z() {
        this.f45144a = null;
        this.f45146c = 0L;
        this.f45147d = 0L;
        this.f45145b = 0L;
    }
}
