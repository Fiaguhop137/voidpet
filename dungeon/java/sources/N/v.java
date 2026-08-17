package N;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class v extends u {
    @Override // java.util.Iterator
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public Map.Entry next() {
        P.a.a(f());
        n(d() + 2);
        return new b(c()[d() - 2], c()[d() - 1]);
    }
}
