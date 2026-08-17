package p414x0;

import android.support.v4.media.session.b;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashMap f57288a = new HashMap();

    public final void a() {
        this.f57288a.clear();
    }

    public final void b(int i10) {
        Iterator it = this.f57288a.entrySet().iterator();
        while (it.hasNext()) {
            b.a(((WeakReference) ((Map.Entry) it.next()).getValue()).get());
            it.remove();
        }
    }
}
