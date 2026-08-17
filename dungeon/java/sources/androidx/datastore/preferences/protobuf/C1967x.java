package androidx.datastore.preferences.protobuf;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
class C1967x implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Iterator f23672a;

    public C1967x(Iterator it) {
        this.f23672a = it;
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Map.Entry next() {
        Map.Entry entry = (Map.Entry) this.f23672a.next();
        entry.getValue();
        return entry;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f23672a.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        this.f23672a.remove();
    }
}
