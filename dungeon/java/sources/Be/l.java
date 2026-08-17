package Be;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
class l implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Iterator f768a;

    public l(Iterator it) {
        this.f768a = it;
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Map.Entry next() {
        Map.Entry entry = (Map.Entry) this.f768a.next();
        entry.getValue();
        return entry;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f768a.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        this.f768a.remove();
    }
}
