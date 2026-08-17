package M;

import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.collections.AbstractC3942d;

/* JADX INFO: loaded from: classes.dex */
public abstract class c extends AbstractC3942d implements L.e {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean h(Collection collection, Object obj) {
        return collection.contains(obj);
    }

    @Override // java.util.Collection, java.util.List, L.e
    public L.e addAll(Collection collection) {
        L.e.a aVarBuilder = builder();
        aVarBuilder.addAll(collection);
        return aVarBuilder.build();
    }

    @Override // kotlin.collections.AbstractC3940b, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // kotlin.collections.AbstractC3940b, java.util.Collection, java.util.List
    public boolean containsAll(Collection collection) {
        Collection collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // kotlin.collections.AbstractC3942d, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return listIterator();
    }

    @Override // kotlin.collections.AbstractC3942d, java.util.List
    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.Collection, java.util.List, L.e
    public L.e remove(Object obj) {
        int iIndexOf = indexOf(obj);
        return iIndexOf != -1 ? J0(iIndexOf) : this;
    }

    @Override // java.util.Collection, java.util.List, L.e
    public L.e removeAll(Collection collection) {
        return V2(new b(collection));
    }

    @Override // kotlin.collections.AbstractC3942d, java.util.List, L.c
    public L.c subList(int i10, int i11) {
        return super.subList(i10, i11);
    }
}
