package Sb;

import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class d implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CopyOnWriteArrayList f11606a = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private WeakReference f11607b = new WeakReference(null);

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(e eVar, androidx.appcompat.app.c cVar) {
        eVar.a(cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(d dVar, androidx.appcompat.app.c cVar) {
        Iterator it = dVar.f11606a.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            ((e) it.next()).a(cVar);
        }
    }

    @Override // Sb.a
    public void b(e listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f11606a.add(listener);
        androidx.appcompat.app.c cVar = (androidx.appcompat.app.c) this.f11607b.get();
        if (cVar != null) {
            cVar.runOnUiThread(new b(listener, cVar));
        }
    }

    @Override // Sb.a
    public void c(e listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f11606a.remove(listener);
    }

    public final void f(androidx.appcompat.app.c activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f11607b = new WeakReference(activity);
        activity.runOnUiThread(new c(this, activity));
    }
}
