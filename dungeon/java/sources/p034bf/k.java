package p034bf;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.collections.AbstractC3948j;
import kotlin.collections.AbstractC3952n;
import kotlin.collections.W;
import kotlin.jvm.internal.AbstractC3966c;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.K;

/* JADX INFO: loaded from: classes3.dex */
public final class k extends AbstractC3948j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f26638c = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Object f26639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f26640b;

    private static final class a implements Iterator, Nd.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Iterator f26641a;

        public a(Object[] array) {
            Intrinsics.checkNotNullParameter(array, "array");
            this.f26641a = AbstractC3966c.a(array);
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void remove() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f26641a.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            return this.f26641a.next();
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final k a() {
            return new k(null);
        }

        public final k b(Collection set) {
            Intrinsics.checkNotNullParameter(set, "set");
            k kVar = new k(null);
            kVar.addAll(set);
            return kVar;
        }
    }

    private static final class c implements Iterator, Nd.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f26642a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f26643b = true;

        public c(Object obj) {
            this.f26642a = obj;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void remove() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f26643b;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (!this.f26643b) {
                throw new NoSuchElementException();
            }
            this.f26643b = false;
            return this.f26642a;
        }
    }

    private k() {
    }

    public /* synthetic */ k(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static final k c() {
        return f26638c.a();
    }

    @Override // kotlin.collections.AbstractC3948j
    public int a() {
        return this.f26640b;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        Object obj2;
        if (size() == 0) {
            this.f26639a = obj;
        } else if (size() == 1) {
            if (Intrinsics.b(this.f26639a, obj)) {
                return false;
            }
            this.f26639a = new Object[]{this.f26639a, obj};
        } else if (size() < 5) {
            Object obj3 = this.f26639a;
            Intrinsics.d(obj3, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
            Object[] objArr = (Object[]) obj3;
            if (AbstractC3952n.M(objArr, obj)) {
                return false;
            }
            if (size() == 4) {
                LinkedHashSet linkedHashSetE = W.e(Arrays.copyOf(objArr, objArr.length));
                linkedHashSetE.add(obj);
                obj2 = linkedHashSetE;
            } else {
                Object[] objArrCopyOf = Arrays.copyOf(objArr, size() + 1);
                Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
                objArrCopyOf[objArrCopyOf.length - 1] = obj;
                obj2 = objArrCopyOf;
            }
            this.f26639a = obj2;
        } else {
            Object obj4 = this.f26639a;
            Intrinsics.d(obj4, "null cannot be cast to non-null type kotlin.collections.MutableSet<T of org.jetbrains.kotlin.utils.SmartSet>");
            if (!K.d(obj4).add(obj)) {
                return false;
            }
        }
        e(size() + 1);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f26639a = null;
        e(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        if (size() == 0) {
            return false;
        }
        if (size() == 1) {
            return Intrinsics.b(this.f26639a, obj);
        }
        if (size() < 5) {
            Object obj2 = this.f26639a;
            Intrinsics.d(obj2, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
            return AbstractC3952n.M((Object[]) obj2, obj);
        }
        Object obj3 = this.f26639a;
        Intrinsics.d(obj3, "null cannot be cast to non-null type kotlin.collections.Set<T of org.jetbrains.kotlin.utils.SmartSet>");
        return ((Set) obj3).contains(obj);
    }

    public void e(int i10) {
        this.f26640b = i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        if (size() == 0) {
            return Collections.EMPTY_SET.iterator();
        }
        if (size() == 1) {
            return new c(this.f26639a);
        }
        if (size() < 5) {
            Object obj = this.f26639a;
            Intrinsics.d(obj, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
            return new a((Object[]) obj);
        }
        Object obj2 = this.f26639a;
        Intrinsics.d(obj2, "null cannot be cast to non-null type kotlin.collections.MutableSet<T of org.jetbrains.kotlin.utils.SmartSet>");
        return K.d(obj2).iterator();
    }
}
