package p216m0;

import android.view.MotionEvent;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f48773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f48774b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private MotionEvent f48775c;

    public B(long j10, List list, MotionEvent motionEvent) {
        this.f48773a = j10;
        this.f48774b = list;
        this.f48775c = motionEvent;
    }

    public final MotionEvent a() {
        return this.f48775c;
    }

    public final List b() {
        return this.f48774b;
    }

    public final void c(MotionEvent motionEvent) {
        this.f48775c = motionEvent;
    }
}
