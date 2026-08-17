package p324s0;

import K.c;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class Z {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f53043c = c.f5866d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f53044a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Function0 f53045b;

    public Z(c cVar, Function0 function0) {
        this.f53044a = cVar;
        this.f53045b = function0;
    }

    public final void a(int i10, Object obj) {
        this.f53044a.a(i10, obj);
        this.f53045b.invoke();
    }

    public final void b() {
        this.f53044a.i();
        this.f53045b.invoke();
    }

    public final c c() {
        return this.f53044a;
    }

    public final Object d(int i10) {
        Object objR = this.f53044a.r(i10);
        this.f53045b.invoke();
        return objR;
    }
}
