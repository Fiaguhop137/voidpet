package p054d;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f39470a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Function0 f39471b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f39472c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f39473d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f39474e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f39475f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List f39476g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Runnable f39477h;

    public t(Executor executor, Function0 reportFullyDrawn) {
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(reportFullyDrawn, "reportFullyDrawn");
        this.f39470a = executor;
        this.f39471b = reportFullyDrawn;
        this.f39472c = new Object();
        this.f39476g = new ArrayList();
        this.f39477h = new s(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(t this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        synchronized (this$0.f39472c) {
            try {
                this$0.f39474e = false;
                if (this$0.f39473d == 0 && !this$0.f39475f) {
                    this$0.f39471b.invoke();
                    this$0.b();
                }
                Unit unit = Unit.f48228a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b() {
        synchronized (this.f39472c) {
            try {
                this.f39475f = true;
                Iterator it = this.f39476g.iterator();
                while (it.hasNext()) {
                    ((Function0) it.next()).invoke();
                }
                this.f39476g.clear();
                Unit unit = Unit.f48228a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean c() {
        boolean z10;
        synchronized (this.f39472c) {
            z10 = this.f39475f;
        }
        return z10;
    }
}
