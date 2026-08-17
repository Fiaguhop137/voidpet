package com.google.protobuf;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
public class G extends AbstractC3135c implements H, RandomAccess {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final G f37786c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final H f37787d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f37788b;

    static {
        G g10 = new G(false);
        f37786c = g10;
        f37787d = g10;
    }

    public G(int i10) {
        this(new ArrayList(i10));
    }

    private G(ArrayList arrayList) {
        this.f37788b = arrayList;
    }

    private G(boolean z10) {
        super(z10);
        this.f37788b = Collections.EMPTY_LIST;
    }

    private static String e(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        return obj instanceof AbstractC3142h ? ((AbstractC3142h) obj).C() : A.j((byte[]) obj);
    }

    @Override // com.google.protobuf.H
    public Object M3(int i10) {
        return this.f37788b.get(i10);
    }

    @Override // com.google.protobuf.AbstractC3135c, com.google.protobuf.A.i
    public /* bridge */ /* synthetic */ boolean O() {
        return super.O();
    }

    @Override // com.google.protobuf.H
    public H V() {
        return O() ? new y0(this) : this;
    }

    @Override // com.google.protobuf.AbstractC3135c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        return super.add(obj);
    }

    @Override // com.google.protobuf.AbstractC3135c, java.util.AbstractList, java.util.List
    public boolean addAll(int i10, Collection collection) {
        a();
        if (collection instanceof H) {
            collection = ((H) collection).r();
        }
        boolean zAddAll = this.f37788b.addAll(i10, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // com.google.protobuf.AbstractC3135c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void add(int i10, String str) {
        a();
        this.f37788b.add(i10, str);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.AbstractC3135c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        a();
        this.f37788b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.AbstractC3135c, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public String get(int i10) {
        Object obj = this.f37788b.get(i10);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof AbstractC3142h) {
            AbstractC3142h abstractC3142h = (AbstractC3142h) obj;
            String strC = abstractC3142h.C();
            if (abstractC3142h.o()) {
                this.f37788b.set(i10, strC);
            }
            return strC;
        }
        byte[] bArr = (byte[]) obj;
        String strJ = A.j(bArr);
        if (A.g(bArr)) {
            this.f37788b.set(i10, strJ);
        }
        return strJ;
    }

    @Override // com.google.protobuf.A.i
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public G f(int i10) {
        if (i10 < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i10);
        arrayList.addAll(this.f37788b);
        return new G(arrayList);
    }

    @Override // com.google.protobuf.AbstractC3135c, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.protobuf.AbstractC3135c, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public String remove(int i10) {
        a();
        Object objRemove = this.f37788b.remove(i10);
        ((AbstractList) this).modCount++;
        return e(objRemove);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public String set(int i10, String str) {
        a();
        return e(this.f37788b.set(i10, str));
    }

    @Override // com.google.protobuf.H
    public void q0(AbstractC3142h abstractC3142h) {
        a();
        this.f37788b.add(abstractC3142h);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.protobuf.H
    public List r() {
        return Collections.unmodifiableList(this.f37788b);
    }

    @Override // com.google.protobuf.AbstractC3135c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    @Override // com.google.protobuf.AbstractC3135c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    @Override // com.google.protobuf.AbstractC3135c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f37788b.size();
    }
}
