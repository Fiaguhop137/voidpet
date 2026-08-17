package S;

import I.T0;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import kotlin.Unit;
import kotlin.jvm.internal.AbstractC3970g;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class F implements Parcelable, V, List, RandomAccess, Nd.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private X f11276a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f11275b = new b(null);

    @NotNull
    public static final Parcelable.Creator<F> CREATOR = new a();

    public static final class a implements Parcelable.ClassLoaderCreator {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object d(Parcel parcel, ClassLoader classLoader, int i10) {
            return parcel.readValue(classLoader);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public F createFromParcel(Parcel parcel) {
            return createFromParcel(parcel, null);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public F createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (classLoader == null) {
                classLoader = a.class.getClassLoader();
            }
            return G.a(parcel.readInt(), new E(parcel, classLoader));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public F[] newArray(int i10) {
            return new F[i10];
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public F() {
        this(L.a.b());
    }

    public F(L.e eVar) {
        this.f11276a = G.l(this, eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean B(Collection collection, List list) {
        return list.retainAll(collection);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean t(int i10, Collection collection, List list) {
        return list.addAll(i10, collection);
    }

    public final void A(int i10, int i11) {
        int iJ;
        L.e eVarI;
        AbstractC1432l abstractC1432lC;
        boolean zF;
        do {
            synchronized (G.f11277a) {
                X xW = w();
                Intrinsics.d(xW, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                P p10 = (P) AbstractC1442w.K((P) xW);
                iJ = p10.j();
                eVarI = p10.i();
                Unit unit = Unit.f48228a;
            }
            Intrinsics.c(eVarI);
            L.e.a aVarBuilder = eVarI.builder();
            aVarBuilder.subList(i10, i11).clear();
            L.e eVarBuild = aVarBuilder.build();
            if (Intrinsics.b(eVarBuild, eVarI)) {
                return;
            }
            X xW2 = w();
            Intrinsics.d(xW2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            P p11 = (P) xW2;
            synchronized (AbstractC1442w.O()) {
                abstractC1432lC = AbstractC1432l.f11377e.c();
                zF = G.f((P) AbstractC1442w.p0(p11, this, abstractC1432lC), iJ, eVarBuild, true);
            }
            AbstractC1442w.X(abstractC1432lC, this);
        } while (!zF);
    }

    public final int C(Collection collection, int i10, int i11) {
        int iJ;
        L.e eVarI;
        AbstractC1432l abstractC1432lC;
        boolean zF;
        int size = size();
        do {
            synchronized (G.f11277a) {
                X xW = w();
                Intrinsics.d(xW, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                P p10 = (P) AbstractC1442w.K((P) xW);
                iJ = p10.j();
                eVarI = p10.i();
                Unit unit = Unit.f48228a;
            }
            Intrinsics.c(eVarI);
            L.e.a aVarBuilder = eVarI.builder();
            aVarBuilder.subList(i10, i11).retainAll(collection);
            L.e eVarBuild = aVarBuilder.build();
            if (Intrinsics.b(eVarBuild, eVarI)) {
                break;
            }
            X xW2 = w();
            Intrinsics.d(xW2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            P p11 = (P) xW2;
            synchronized (AbstractC1442w.O()) {
                abstractC1432lC = AbstractC1432l.f11377e.c();
                zF = G.f((P) AbstractC1442w.p0(p11, this, abstractC1432lC), iJ, eVarBuild, true);
            }
            AbstractC1442w.X(abstractC1432lC, this);
        } while (!zF);
        return size - size();
    }

    public final List D() {
        return G.g(this).i();
    }

    @Override // java.util.List
    public void add(int i10, Object obj) {
        int iJ;
        L.e eVarI;
        AbstractC1432l abstractC1432lC;
        boolean zF;
        do {
            synchronized (G.f11277a) {
                X xW = w();
                Intrinsics.d(xW, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                P p10 = (P) AbstractC1442w.K((P) xW);
                iJ = p10.j();
                eVarI = p10.i();
                Unit unit = Unit.f48228a;
            }
            Intrinsics.c(eVarI);
            L.e eVarAdd = eVarI.add(i10, obj);
            if (Intrinsics.b(eVarAdd, eVarI)) {
                return;
            }
            X xW2 = w();
            Intrinsics.d(xW2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            P p11 = (P) xW2;
            synchronized (AbstractC1442w.O()) {
                abstractC1432lC = AbstractC1432l.f11377e.c();
                zF = G.f((P) AbstractC1442w.p0(p11, this, abstractC1432lC), iJ, eVarAdd, true);
            }
            AbstractC1442w.X(abstractC1432lC, this);
        } while (!zF);
    }

    @Override // java.util.List, java.util.Collection
    public boolean add(Object obj) {
        int iJ;
        L.e eVarI;
        AbstractC1432l abstractC1432lC;
        boolean zF;
        do {
            synchronized (G.f11277a) {
                X xW = w();
                Intrinsics.d(xW, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                P p10 = (P) AbstractC1442w.K((P) xW);
                iJ = p10.j();
                eVarI = p10.i();
                Unit unit = Unit.f48228a;
            }
            Intrinsics.c(eVarI);
            L.e eVarAdd = eVarI.add(obj);
            if (Intrinsics.b(eVarAdd, eVarI)) {
                return false;
            }
            X xW2 = w();
            Intrinsics.d(xW2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            P p11 = (P) xW2;
            synchronized (AbstractC1442w.O()) {
                abstractC1432lC = AbstractC1432l.f11377e.c();
                zF = G.f((P) AbstractC1442w.p0(p11, this, abstractC1432lC), iJ, eVarAdd, true);
            }
            AbstractC1442w.X(abstractC1432lC, this);
        } while (!zF);
        return true;
    }

    @Override // java.util.List
    public boolean addAll(int i10, Collection collection) {
        return G.k(this, new D(i10, collection));
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection collection) {
        int iJ;
        L.e eVarI;
        AbstractC1432l abstractC1432lC;
        boolean zF;
        do {
            synchronized (G.f11277a) {
                X xW = w();
                Intrinsics.d(xW, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                P p10 = (P) AbstractC1442w.K((P) xW);
                iJ = p10.j();
                eVarI = p10.i();
                Unit unit = Unit.f48228a;
            }
            Intrinsics.c(eVarI);
            L.e eVarAddAll = eVarI.addAll(collection);
            if (Intrinsics.b(eVarAddAll, eVarI)) {
                return false;
            }
            X xW2 = w();
            Intrinsics.d(xW2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            P p11 = (P) xW2;
            synchronized (AbstractC1442w.O()) {
                abstractC1432lC = AbstractC1432l.f11377e.c();
                zF = G.f((P) AbstractC1442w.p0(p11, this, abstractC1432lC), iJ, eVarAddAll, true);
            }
            AbstractC1442w.X(abstractC1432lC, this);
        } while (!zF);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        AbstractC1432l abstractC1432lC;
        X xW = w();
        Intrinsics.d(xW, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
        P p10 = (P) xW;
        synchronized (AbstractC1442w.O()) {
            abstractC1432lC = AbstractC1432l.f11377e.c();
            P p11 = (P) AbstractC1442w.p0(p10, this, abstractC1432lC);
            synchronized (G.f11277a) {
                p11.l(L.a.b());
                p11.m(p11.j() + 1);
                p11.n(p11.k() + 1);
            }
        }
        AbstractC1442w.X(abstractC1432lC, this);
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object obj) {
        return G.g(this).i().contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection collection) {
        return G.g(this).i().containsAll(collection);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // java.util.List
    public Object get(int i10) {
        return G.g(this).i().get(i10);
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        return G.g(this).i().indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return G.g(this).i().isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        return G.g(this).i().lastIndexOf(obj);
    }

    @Override // java.util.List
    public ListIterator listIterator() {
        return new O(this, 0);
    }

    @Override // java.util.List
    public ListIterator listIterator(int i10) {
        return new O(this, i10);
    }

    @Override // S.V
    public void n(X x10) {
        x10.g(w());
        Intrinsics.d(x10, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        this.f11276a = (P) x10;
    }

    @Override // java.util.List
    public final /* bridge */ Object remove(int i10) {
        return y(i10);
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        int iJ;
        L.e eVarI;
        AbstractC1432l abstractC1432lC;
        boolean zF;
        do {
            synchronized (G.f11277a) {
                X xW = w();
                Intrinsics.d(xW, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                P p10 = (P) AbstractC1442w.K((P) xW);
                iJ = p10.j();
                eVarI = p10.i();
                Unit unit = Unit.f48228a;
            }
            Intrinsics.c(eVarI);
            L.e eVarRemove = eVarI.remove(obj);
            if (Intrinsics.b(eVarRemove, eVarI)) {
                return false;
            }
            X xW2 = w();
            Intrinsics.d(xW2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            P p11 = (P) xW2;
            synchronized (AbstractC1442w.O()) {
                abstractC1432lC = AbstractC1432l.f11377e.c();
                zF = G.f((P) AbstractC1442w.p0(p11, this, abstractC1432lC), iJ, eVarRemove, true);
            }
            AbstractC1442w.X(abstractC1432lC, this);
        } while (!zF);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection collection) {
        int iJ;
        L.e eVarI;
        AbstractC1432l abstractC1432lC;
        boolean zF;
        do {
            synchronized (G.f11277a) {
                X xW = w();
                Intrinsics.d(xW, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                P p10 = (P) AbstractC1442w.K((P) xW);
                iJ = p10.j();
                eVarI = p10.i();
                Unit unit = Unit.f48228a;
            }
            Intrinsics.c(eVarI);
            L.e eVarRemoveAll = eVarI.removeAll(collection);
            if (Intrinsics.b(eVarRemoveAll, eVarI)) {
                return false;
            }
            X xW2 = w();
            Intrinsics.d(xW2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            P p11 = (P) xW2;
            synchronized (AbstractC1442w.O()) {
                abstractC1432lC = AbstractC1432l.f11377e.c();
                zF = G.f((P) AbstractC1442w.p0(p11, this, abstractC1432lC), iJ, eVarRemoveAll, true);
            }
            AbstractC1442w.X(abstractC1432lC, this);
        } while (!zF);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection collection) {
        return G.k(this, new C(collection));
    }

    @Override // java.util.List
    public Object set(int i10, Object obj) {
        int iJ;
        L.e eVarI;
        AbstractC1432l abstractC1432lC;
        boolean zF;
        Object obj2 = get(i10);
        do {
            synchronized (G.f11277a) {
                X xW = w();
                Intrinsics.d(xW, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                P p10 = (P) AbstractC1442w.K((P) xW);
                iJ = p10.j();
                eVarI = p10.i();
                Unit unit = Unit.f48228a;
            }
            Intrinsics.c(eVarI);
            L.e eVar = eVarI.set(i10, obj);
            if (Intrinsics.b(eVar, eVarI)) {
                return obj2;
            }
            X xW2 = w();
            Intrinsics.d(xW2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            P p11 = (P) xW2;
            synchronized (AbstractC1442w.O()) {
                abstractC1432lC = AbstractC1432l.f11377e.c();
                zF = G.f((P) AbstractC1442w.p0(p11, this, abstractC1432lC), iJ, eVar, false);
            }
            AbstractC1442w.X(abstractC1432lC, this);
        } while (!zF);
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return x();
    }

    @Override // java.util.List
    public List subList(int i10, int i11) {
        if (!(i10 >= 0 && i10 <= i11 && i11 <= size())) {
            T0.a("fromIndex or toIndex are out of bounds");
        }
        return new Y(this, i10, i11);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return AbstractC3970g.a(this);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray(Object[] objArr) {
        return AbstractC3970g.b(this, objArr);
    }

    public String toString() {
        X xW = w();
        Intrinsics.d(xW, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return "SnapshotStateList(value=" + ((P) AbstractC1442w.K((P) xW)).i() + ")@" + hashCode();
    }

    @Override // S.V
    public X w() {
        return this.f11276a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        List listD = D();
        int size = listD.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            parcel.writeValue(listD.get(i11));
        }
    }

    public int x() {
        return G.g(this).i().size();
    }

    public Object y(int i10) {
        int iJ;
        L.e eVarI;
        AbstractC1432l abstractC1432lC;
        boolean zF;
        Object obj = get(i10);
        do {
            synchronized (G.f11277a) {
                X xW = w();
                Intrinsics.d(xW, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                P p10 = (P) AbstractC1442w.K((P) xW);
                iJ = p10.j();
                eVarI = p10.i();
                Unit unit = Unit.f48228a;
            }
            Intrinsics.c(eVarI);
            L.e eVarJ0 = eVarI.J0(i10);
            if (Intrinsics.b(eVarJ0, eVarI)) {
                return obj;
            }
            X xW2 = w();
            Intrinsics.d(xW2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            P p11 = (P) xW2;
            synchronized (AbstractC1442w.O()) {
                abstractC1432lC = AbstractC1432l.f11377e.c();
                zF = G.f((P) AbstractC1442w.p0(p11, this, abstractC1432lC), iJ, eVarJ0, true);
            }
            AbstractC1442w.X(abstractC1432lC, this);
        } while (!zF);
        return obj;
    }
}
