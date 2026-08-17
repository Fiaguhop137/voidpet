package Ve;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends ArrayList implements l {
    public a(int i10) {
        super(i10);
    }

    public /* bridge */ boolean c(m mVar) {
        return super.contains(mVar);
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof m) {
            return c((m) obj);
        }
        return false;
    }

    public /* bridge */ int e() {
        return super.size();
    }

    public /* bridge */ int g(m mVar) {
        return super.indexOf(mVar);
    }

    public /* bridge */ int h(m mVar) {
        return super.lastIndexOf(mVar);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof m) {
            return g((m) obj);
        }
        return -1;
    }

    public /* bridge */ boolean j(m mVar) {
        return super.remove(mVar);
    }

    @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof m) {
            return h((m) obj);
        }
        return -1;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof m) {
            return j((m) obj);
        }
        return false;
    }

    @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return e();
    }
}
