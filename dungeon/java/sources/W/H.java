package W;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f14373a = new LinkedHashMap();

    public final Map a() {
        return this.f14373a;
    }

    public final Unit b(int i10, String str) {
        android.support.v4.media.session.b.a(this.f14373a.get(Integer.valueOf(i10)));
        return null;
    }
}
