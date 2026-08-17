package p323s;

import Nd.b;
import Nd.f;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.AbstractC3952n;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: s.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4102b implements Collection, Set, b, f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int[] f52679a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object[] f52680b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f52681c;

    /* JADX INFO: renamed from: s.b$a */
    private final class a extends AbstractC4109i {
        public a() {
            super(C4102b.this.h());
        }

        @Override // p323s.AbstractC4109i
        protected Object a(int i10) {
            return C4102b.this.q(i10);
        }

        @Override // p323s.AbstractC4109i
        protected void b(int i10) {
            C4102b.this.i(i10);
        }
    }

    public C4102b() {
        this(0, 1, null);
    }

    public C4102b(int i10) {
        this.f52679a = p341t.a.f54133a;
        this.f52680b = p341t.a.f54135c;
        if (i10 > 0) {
            AbstractC4104d.a(this, i10);
        }
    }

    public /* synthetic */ C4102b(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0 : i10);
    }

    public final void a(int i10) {
        int iH = h();
        if (e().length < i10) {
            int[] iArrE = e();
            Object[] objArrC = c();
            AbstractC4104d.a(this, i10);
            if (h() > 0) {
                AbstractC3952n.o(iArrE, e(), 0, 0, h(), 6, null);
                AbstractC3952n.q(objArrC, c(), 0, 0, h(), 6, null);
            }
        }
        if (h() != iH) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        int i10;
        int iC;
        int iH = h();
        if (obj == null) {
            iC = AbstractC4104d.d(this);
            i10 = 0;
        } else {
            int iHashCode = obj.hashCode();
            i10 = iHashCode;
            iC = AbstractC4104d.c(this, obj, iHashCode);
        }
        if (iC >= 0) {
            return false;
        }
        int i11 = ~iC;
        if (iH >= e().length) {
            int i12 = 8;
            if (iH >= 8) {
                i12 = (iH >> 1) + iH;
            } else if (iH < 4) {
                i12 = 4;
            }
            int[] iArrE = e();
            Object[] objArrC = c();
            AbstractC4104d.a(this, i12);
            if (iH != h()) {
                throw new ConcurrentModificationException();
            }
            if (!(e().length == 0)) {
                AbstractC3952n.o(iArrE, e(), 0, 0, iArrE.length, 6, null);
                AbstractC3952n.q(objArrC, c(), 0, 0, objArrC.length, 6, null);
            }
        }
        if (i11 < iH) {
            int i13 = i11 + 1;
            AbstractC3952n.j(e(), e(), i13, i11, iH);
            AbstractC3952n.l(c(), c(), i13, i11, iH);
        }
        if (iH != h() || i11 >= e().length) {
            throw new ConcurrentModificationException();
        }
        e()[i11] = i10;
        c()[i11] = obj;
        p(h() + 1);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        a(h() + elements.size());
        Iterator it = elements.iterator();
        boolean zAdd = false;
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    public final Object[] c() {
        return this.f52680b;
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
        if (h() != 0) {
            n(p341t.a.f54133a);
            k(p341t.a.f54135c);
            p(0);
        }
        if (h() != 0) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final int[] e() {
        return this.f52679a;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Set) || size() != ((Set) obj).size()) {
            return false;
        }
        try {
            int iH = h();
            for (int i10 = 0; i10 < iH; i10++) {
                if (!((Set) obj).contains(q(i10))) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public int g() {
        return this.f52681c;
    }

    public final int h() {
        return this.f52681c;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int[] iArrE = e();
        int iH = h();
        int i10 = 0;
        for (int i11 = 0; i11 < iH; i11++) {
            i10 += iArrE[i11];
        }
        return i10;
    }

    public final Object i(int i10) {
        int i11;
        Object[] objArr;
        int iH = h();
        Object obj = c()[i10];
        if (iH <= 1) {
            clear();
            return obj;
        }
        int i12 = iH - 1;
        if (e().length <= 8 || h() >= e().length / 3) {
            if (i10 < i12) {
                int i13 = i10 + 1;
                AbstractC3952n.j(e(), e(), i10, i13, iH);
                AbstractC3952n.l(c(), c(), i10, i13, iH);
            }
            c()[i12] = null;
        } else {
            int iH2 = h() > 8 ? h() + (h() >> 1) : 8;
            int[] iArrE = e();
            Object[] objArrC = c();
            AbstractC4104d.a(this, iH2);
            if (i10 > 0) {
                AbstractC3952n.o(iArrE, e(), 0, 0, i10, 6, null);
                objArr = objArrC;
                AbstractC3952n.q(objArr, c(), 0, 0, i10, 6, null);
                i11 = i10;
            } else {
                i11 = i10;
                objArr = objArrC;
            }
            if (i11 < i12) {
                int i14 = i11 + 1;
                AbstractC3952n.j(iArrE, e(), i11, i14, iH);
                AbstractC3952n.l(objArr, c(), i11, i14, iH);
            }
        }
        if (iH != h()) {
            throw new ConcurrentModificationException();
        }
        p(i12);
        return obj;
    }

    public final int indexOf(Object obj) {
        return obj == null ? AbstractC4104d.d(this) : AbstractC4104d.c(this, obj, obj.hashCode());
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return h() <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return new a();
    }

    public final void k(Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<set-?>");
        this.f52680b = objArr;
    }

    public final void n(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<set-?>");
        this.f52679a = iArr;
    }

    public final void p(int i10) {
        this.f52681c = i10;
    }

    public final Object q(int i10) {
        return c()[i10];
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf < 0) {
            return false;
        }
        i(iIndexOf);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Iterator it = elements.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(Collection elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        boolean z10 = false;
        for (int iH = h() - 1; -1 < iH; iH--) {
            if (!CollectionsKt.b0(elements, c()[iH])) {
                i(iH);
                z10 = true;
            }
        }
        return z10;
    }

    @Override // java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        return g();
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return AbstractC3952n.s(this.f52680b, 0, this.f52681c);
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        Object[] objArrA = AbstractC4103c.a(array, this.f52681c);
        AbstractC3952n.l(this.f52680b, objArrA, 0, 0, this.f52681c);
        Intrinsics.c(objArrA);
        return objArrA;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(h() * 14);
        sb2.append('{');
        int iH = h();
        for (int i10 = 0; i10 < iH; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            Object objQ = q(i10);
            if (objQ != this) {
                sb2.append(objQ);
            } else {
                sb2.append("(this Set)");
            }
        }
        sb2.append('}');
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }
}
