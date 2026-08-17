package Be;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
public class m extends AbstractList implements RandomAccess, n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n f769b = new m().V();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f770a;

    public m() {
        this.f770a = new ArrayList();
    }

    public m(n nVar) {
        this.f770a = new ArrayList(nVar.size());
        addAll(nVar);
    }

    private static d c(Object obj) {
        if (obj instanceof d) {
            return (d) obj;
        }
        return obj instanceof String ? d.i((String) obj) : d.g((byte[]) obj);
    }

    private static String e(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        return obj instanceof d ? ((d) obj).x() : j.b((byte[]) obj);
    }

    @Override // Be.n
    public d E1(int i10) {
        Object obj = this.f770a.get(i10);
        d dVarC = c(obj);
        if (dVarC != obj) {
            this.f770a.set(i10, dVarC);
        }
        return dVarC;
    }

    @Override // Be.n
    public n V() {
        return new w(this);
    }

    @Override // Be.n
    public void W1(d dVar) {
        this.f770a.add(dVar);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void add(int i10, String str) {
        this.f770a.add(i10, str);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i10, Collection collection) {
        if (collection instanceof n) {
            collection = ((n) collection).r();
        }
        boolean zAddAll = this.f770a.addAll(i10, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        this.f770a.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public String get(int i10) {
        Object obj = this.f770a.get(i10);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            String strX = dVar.x();
            if (dVar.o()) {
                this.f770a.set(i10, strX);
            }
            return strX;
        }
        byte[] bArr = (byte[]) obj;
        String strB = j.b(bArr);
        if (j.a(bArr)) {
            this.f770a.set(i10, strB);
        }
        return strB;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public String remove(int i10) {
        Object objRemove = this.f770a.remove(i10);
        ((AbstractList) this).modCount++;
        return e(objRemove);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public String set(int i10, String str) {
        return e(this.f770a.set(i10, str));
    }

    @Override // Be.n
    public List r() {
        return Collections.unmodifiableList(this.f770a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f770a.size();
    }
}
