package W1;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f14552a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map f14553b;

    public synchronized void a(Map map) {
        this.f14553b = null;
        this.f14552a.clear();
        this.f14552a.putAll(map);
    }

    public synchronized Map b() {
        try {
            if (this.f14553b == null) {
                this.f14553b = Collections.unmodifiableMap(new HashMap(this.f14552a));
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f14553b;
    }
}
