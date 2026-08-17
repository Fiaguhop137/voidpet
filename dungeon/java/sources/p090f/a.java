package p090f;

import android.content.Context;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set f41508a = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile Context f41509b;

    public final void a(b listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        Context context = this.f41509b;
        if (context != null) {
            listener.a(context);
        }
        this.f41508a.add(listener);
    }

    public final void b() {
        this.f41509b = null;
    }

    public final void c(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f41509b = context;
        Iterator it = this.f41508a.iterator();
        while (it.hasNext()) {
            ((b) it.next()).a(context);
        }
    }
}
