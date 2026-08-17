package N;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class y extends u {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final i f7162d;

    public y(i iVar) {
        this.f7162d = iVar;
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public Map.Entry next() {
        P.a.a(f());
        n(d() + 2);
        return new c(this.f7162d, c()[d() - 2], c()[d() - 1]);
    }
}
