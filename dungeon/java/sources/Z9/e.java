package Z9;

import com.google.firebase.installations.i;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
class e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f18838d = TimeUnit.HOURS.toMillis(24);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f18839e = TimeUnit.MINUTES.toMillis(30);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f18840a = i.c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f18841b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f18842c;

    e() {
    }

    private synchronized long a(int i10) {
        if (c(i10)) {
            return (long) Math.min(Math.pow(2.0d, this.f18842c) + this.f18840a.e(), f18839e);
        }
        return f18838d;
    }

    private static boolean c(int i10) {
        if (i10 != 429) {
            return i10 >= 500 && i10 < 600;
        }
        return true;
    }

    private static boolean d(int i10) {
        return (i10 >= 200 && i10 < 300) || i10 == 401 || i10 == 404;
    }

    private synchronized void e() {
        this.f18842c = 0;
    }

    public synchronized boolean b() {
        return this.f18842c == 0 || this.f18840a.a() > this.f18841b;
    }

    public synchronized void f(int i10) {
        if (d(i10)) {
            e();
            return;
        }
        this.f18842c++;
        this.f18841b = this.f18840a.a() + a(i10);
    }
}
