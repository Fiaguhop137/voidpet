package p054d;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f39478a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CopyOnWriteArrayList f39479b = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Function0 f39480c;

    public v(boolean z10) {
        this.f39478a = z10;
    }

    public final void a(c cancellable) {
        Intrinsics.checkNotNullParameter(cancellable, "cancellable");
        this.f39479b.add(cancellable);
    }

    public final Function0 b() {
        return this.f39480c;
    }

    public void c() {
    }

    public abstract void d();

    public void e(C3216b backEvent) {
        Intrinsics.checkNotNullParameter(backEvent, "backEvent");
    }

    public void f(C3216b backEvent) {
        Intrinsics.checkNotNullParameter(backEvent, "backEvent");
    }

    public final boolean g() {
        return this.f39478a;
    }

    public final void h() {
        Iterator it = this.f39479b.iterator();
        while (it.hasNext()) {
            ((c) it.next()).cancel();
        }
    }

    public final void i(c cancellable) {
        Intrinsics.checkNotNullParameter(cancellable, "cancellable");
        this.f39479b.remove(cancellable);
    }

    public final void j(boolean z10) {
        this.f39478a = z10;
        Function0 function0 = this.f39480c;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final void k(Function0 function0) {
        this.f39480c = function0;
    }
}
