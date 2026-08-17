package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.n2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractC2725n2 extends AbstractMap {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Object[] f34247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f34248b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map f34249c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f34250d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile C2715l2 f34251e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Map f34252f;

    /* synthetic */ AbstractC2725n2(AbstractC2720m2 abstractC2720m2) {
        Map map = Collections.EMPTY_MAP;
        this.f34249c = map;
        this.f34252f = map;
    }

    private final int n(Comparable comparable) {
        int i10 = this.f34248b;
        int i11 = i10 - 1;
        int i12 = 0;
        if (i11 >= 0) {
            int iCompareTo = comparable.compareTo(((C2695h2) this.f34247a[i11]).e());
            if (iCompareTo > 0) {
                return -(i10 + 1);
            }
            if (iCompareTo == 0) {
                return i11;
            }
        }
        while (i12 <= i11) {
            int i13 = (i12 + i11) / 2;
            int iCompareTo2 = comparable.compareTo(((C2695h2) this.f34247a[i13]).e());
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
    public final Object p(int i10) {
        r();
        Object value = ((C2695h2) this.f34247a[i10]).getValue();
        Object[] objArr = this.f34247a;
        System.arraycopy(objArr, i10 + 1, objArr, i10, (this.f34248b - i10) - 1);
        this.f34248b--;
        if (!this.f34249c.isEmpty()) {
            Iterator it = q().entrySet().iterator();
            Object[] objArr2 = this.f34247a;
            int i11 = this.f34248b;
            Map.Entry entry = (Map.Entry) it.next();
            objArr2[i11] = new C2695h2(this, (Comparable) entry.getKey(), entry.getValue());
            this.f34248b++;
            it.remove();
        }
        return value;
    }

    private final SortedMap q() {
        r();
        if (this.f34249c.isEmpty() && !(this.f34249c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f34249c = treeMap;
            this.f34252f = treeMap.descendingMap();
        }
        return (SortedMap) this.f34249c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r() {
        if (this.f34250d) {
            throw new UnsupportedOperationException();
        }
    }

    public void a() {
        if (this.f34250d) {
            return;
        }
        this.f34249c = this.f34249c.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f34249c);
        this.f34252f = this.f34252f.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(this.f34252f);
        this.f34250d = true;
    }

    public final int c() {
        return this.f34248b;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        r();
        if (this.f34248b != 0) {
            this.f34247a = null;
            this.f34248b = 0;
        }
        if (this.f34249c.isEmpty()) {
            return;
        }
        this.f34249c.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return n(comparable) >= 0 || this.f34249c.containsKey(comparable);
    }

    public final Iterable d() {
        return this.f34249c.isEmpty() ? Collections.EMPTY_SET : this.f34249c.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.f34251e == null) {
            this.f34251e = new C2715l2(this, null);
        }
        return this.f34251e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AbstractC2725n2)) {
            return super.equals(obj);
        }
        AbstractC2725n2 abstractC2725n2 = (AbstractC2725n2) obj;
        int size = size();
        if (size != abstractC2725n2.size()) {
            return false;
        }
        int i10 = this.f34248b;
        if (i10 != abstractC2725n2.f34248b) {
            return entrySet().equals(abstractC2725n2.entrySet());
        }
        for (int i11 = 0; i11 < i10; i11++) {
            if (!g(i11).equals(abstractC2725n2.g(i11))) {
                return false;
            }
        }
        if (i10 != size) {
            return this.f34249c.equals(abstractC2725n2.f34249c);
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        r();
        int iN = n(comparable);
        if (iN >= 0) {
            return ((C2695h2) this.f34247a[iN]).setValue(obj);
        }
        r();
        if (this.f34247a == null) {
            this.f34247a = new Object[16];
        }
        int i10 = -(iN + 1);
        if (i10 >= 16) {
            return q().put(comparable, obj);
        }
        if (this.f34248b == 16) {
            C2695h2 c2695h2 = (C2695h2) this.f34247a[15];
            this.f34248b = 15;
            q().put(c2695h2.e(), c2695h2.getValue());
        }
        Object[] objArr = this.f34247a;
        int length = objArr.length;
        System.arraycopy(objArr, i10, objArr, i10 + 1, 15 - i10);
        this.f34247a[i10] = new C2695h2(this, comparable, obj);
        this.f34248b++;
        return null;
    }

    public final Map.Entry g(int i10) {
        if (i10 < this.f34248b) {
            return (C2695h2) this.f34247a[i10];
        }
        throw new ArrayIndexOutOfBoundsException(i10);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iN = n(comparable);
        return iN >= 0 ? ((C2695h2) this.f34247a[iN]).getValue() : this.f34249c.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i10 = this.f34248b;
        int iHashCode = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            iHashCode += this.f34247a[i11].hashCode();
        }
        return this.f34249c.size() > 0 ? iHashCode + this.f34249c.hashCode() : iHashCode;
    }

    public final boolean k() {
        return this.f34250d;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        r();
        Comparable comparable = (Comparable) obj;
        int iN = n(comparable);
        if (iN >= 0) {
            return p(iN);
        }
        if (this.f34249c.isEmpty()) {
            return null;
        }
        return this.f34249c.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f34248b + this.f34249c.size();
    }
}
