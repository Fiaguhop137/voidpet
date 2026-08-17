package com.google.android.gms.internal.measurement;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes2.dex */
abstract class X5 extends AbstractMap {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Object[] f32826a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f32827b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map f32828c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f32829d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile W5 f32830e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Map f32831f;

    /* synthetic */ X5(byte[] bArr) {
        Map map = Collections.EMPTY_MAP;
        this.f32828c = map;
        this.f32831f = map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final Object g(int i10) {
        h();
        Object value = ((U5) this.f32826a[i10]).getValue();
        Object[] objArr = this.f32826a;
        System.arraycopy(objArr, i10 + 1, objArr, i10, (this.f32827b - i10) - 1);
        this.f32827b--;
        if (!this.f32828c.isEmpty()) {
            Iterator it = r().entrySet().iterator();
            Object[] objArr2 = this.f32826a;
            int i11 = this.f32827b;
            Map.Entry entry = (Map.Entry) it.next();
            objArr2[i11] = new U5(this, (Comparable) entry.getKey(), entry.getValue());
            this.f32827b++;
            it.remove();
        }
        return value;
    }

    private final int p(Comparable comparable) {
        int i10 = this.f32827b;
        int i11 = i10 - 1;
        int i12 = 0;
        if (i11 >= 0) {
            int iCompareTo = comparable.compareTo(((U5) this.f32826a[i11]).e());
            if (iCompareTo > 0) {
                return -(i10 + 1);
            }
            if (iCompareTo == 0) {
                return i11;
            }
        }
        while (i12 <= i11) {
            int i13 = (i12 + i11) / 2;
            int iCompareTo2 = comparable.compareTo(((U5) this.f32826a[i13]).e());
            if (iCompareTo2 < 0) {
                i11 = i13 - 1;
            } else {
                if (iCompareTo2 <= 0) {
                    return i13;
                }
                i12 = i13 + 1;
            }
        }
        return -(i12 + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public final void h() {
        if (this.f32829d) {
            throw new UnsupportedOperationException();
        }
    }

    private final SortedMap r() {
        h();
        if (this.f32828c.isEmpty() && !(this.f32828c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f32828c = treeMap;
            this.f32831f = treeMap.descendingMap();
        }
        return (SortedMap) this.f32828c;
    }

    public void a() {
        if (this.f32829d) {
            return;
        }
        this.f32828c = this.f32828c.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f32828c);
        this.f32831f = this.f32831f.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f32831f);
        this.f32829d = true;
    }

    public final boolean b() {
        return this.f32829d;
    }

    public final int c() {
        return this.f32827b;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        h();
        if (this.f32827b != 0) {
            this.f32826a = null;
            this.f32827b = 0;
        }
        if (this.f32828c.isEmpty()) {
            return;
        }
        this.f32828c.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return p(comparable) >= 0 || this.f32828c.containsKey(comparable);
    }

    public final Map.Entry d(int i10) {
        if (i10 < this.f32827b) {
            return (U5) this.f32826a[i10];
        }
        throw new ArrayIndexOutOfBoundsException(i10);
    }

    public final Iterable e() {
        return this.f32828c.isEmpty() ? Collections.EMPTY_SET : this.f32828c.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f32830e == null) {
            this.f32830e = new W5(this, null);
        }
        return this.f32830e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof X5)) {
            return super.equals(obj);
        }
        X5 x10 = (X5) obj;
        int size = size();
        if (size != x10.size()) {
            return false;
        }
        int i10 = this.f32827b;
        if (i10 != x10.f32827b) {
            return entrySet().equals(x10.entrySet());
        }
        for (int i11 = 0; i11 < i10; i11++) {
            if (!d(i11).equals(x10.d(i11))) {
                return false;
            }
        }
        if (i10 != size) {
            return this.f32828c.equals(x10.f32828c);
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        h();
        int iP = p(comparable);
        if (iP >= 0) {
            return ((U5) this.f32826a[iP]).setValue(obj);
        }
        h();
        if (this.f32826a == null) {
            this.f32826a = new Object[16];
        }
        int i10 = -(iP + 1);
        if (i10 >= 16) {
            return r().put(comparable, obj);
        }
        if (this.f32827b == 16) {
            U5 u10 = (U5) this.f32826a[15];
            this.f32827b = 15;
            r().put(u10.e(), u10.getValue());
        }
        Object[] objArr = this.f32826a;
        int length = objArr.length;
        System.arraycopy(objArr, i10, objArr, i10 + 1, 15 - i10);
        this.f32826a[i10] = new U5(this, comparable, obj);
        this.f32827b++;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iP = p(comparable);
        return iP >= 0 ? ((U5) this.f32826a[iP]).getValue() : this.f32828c.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i10 = this.f32827b;
        int iHashCode = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            iHashCode += this.f32826a[i11].hashCode();
        }
        return this.f32828c.size() > 0 ? iHashCode + this.f32828c.hashCode() : iHashCode;
    }

    final /* synthetic */ Object[] i() {
        return this.f32826a;
    }

    final /* synthetic */ int k() {
        return this.f32827b;
    }

    final /* synthetic */ Map m() {
        return this.f32828c;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        h();
        Comparable comparable = (Comparable) obj;
        int iP = p(comparable);
        if (iP >= 0) {
            return g(iP);
        }
        if (this.f32828c.isEmpty()) {
            return null;
        }
        return this.f32828c.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f32827b + this.f32828c.size();
    }
}
