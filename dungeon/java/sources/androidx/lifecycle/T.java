package androidx.lifecycle;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public class T {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f24328a = new LinkedHashMap();

    public final void a() {
        Iterator it = this.f24328a.values().iterator();
        while (it.hasNext()) {
            ((Q) it.next()).b();
        }
        this.f24328a.clear();
    }

    public final Q b(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return (Q) this.f24328a.get(key);
    }

    public final Set c() {
        return new HashSet(this.f24328a.keySet());
    }

    public final void d(String key, Q viewModel) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Q q10 = (Q) this.f24328a.put(key, viewModel);
        if (q10 != null) {
            q10.b();
        }
    }
}
