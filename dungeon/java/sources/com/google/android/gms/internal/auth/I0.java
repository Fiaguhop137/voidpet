package com.google.android.gms.internal.auth;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
public final class I0 extends AbstractC2360c0 implements RandomAccess, J0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final I0 f32229c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final J0 f32230d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f32231b;

    static {
        I0 i10 = new I0(false);
        f32229c = i10;
        f32230d = i10;
    }

    public I0(int i10) {
        ArrayList arrayList = new ArrayList(i10);
        super(true);
        this.f32231b = arrayList;
    }

    private I0(ArrayList arrayList) {
        super(true);
        this.f32231b = arrayList;
    }

    private I0(boolean z10) {
        super(false);
        this.f32231b = Collections.EMPTY_LIST;
    }

    private static String e(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        return obj instanceof AbstractC2402q0 ? ((AbstractC2402q0) obj).o(G0.f32217b) : G0.d((byte[]) obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i10, Object obj) {
        a();
        this.f32231b.add(i10, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.auth.AbstractC2360c0, java.util.AbstractList, java.util.List
    public final boolean addAll(int i10, Collection collection) {
        a();
        if (collection instanceof J0) {
            collection = ((J0) collection).d();
        }
        boolean zAddAll = this.f32231b.addAll(i10, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // com.google.android.gms.internal.auth.AbstractC2360c0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }

    @Override // com.google.android.gms.internal.auth.J0
    public final J0 b() {
        return zzc() ? new C2417v1(this) : this;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final String get(int i10) {
        Object obj = this.f32231b.get(i10);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof AbstractC2402q0) {
            AbstractC2402q0 abstractC2402q0 = (AbstractC2402q0) obj;
            String strO = abstractC2402q0.o(G0.f32217b);
            if (abstractC2402q0.j()) {
                this.f32231b.set(i10, strO);
            }
            return strO;
        }
        byte[] bArr = (byte[]) obj;
        String strD = G0.d(bArr);
        if (E1.b(bArr)) {
            this.f32231b.set(i10, strD);
        }
        return strD;
    }

    @Override // com.google.android.gms.internal.auth.AbstractC2360c0, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        a();
        this.f32231b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.auth.J0
    public final List d() {
        return Collections.unmodifiableList(this.f32231b);
    }

    @Override // com.google.android.gms.internal.auth.E0
    public final /* bridge */ /* synthetic */ E0 m(int i10) {
        if (i10 < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i10);
        arrayList.addAll(this.f32231b);
        return new I0(arrayList);
    }

    @Override // com.google.android.gms.internal.auth.AbstractC2360c0, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i10) {
        a();
        Object objRemove = this.f32231b.remove(i10);
        ((AbstractList) this).modCount++;
        return e(objRemove);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i10, Object obj) {
        a();
        return e(this.f32231b.set(i10, (String) obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f32231b.size();
    }
}
