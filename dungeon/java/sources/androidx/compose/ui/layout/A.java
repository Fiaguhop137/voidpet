package androidx.compose.ui.layout;

import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;
import kotlin.jvm.internal.AbstractC3970g;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p323s.M;
import p323s.X;

/* JADX INFO: loaded from: classes.dex */
public interface A {

    public static final class a implements Collection, Nd.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final M f21546a;

        public a(M m10) {
            this.f21546a = m10;
        }

        public /* synthetic */ a(M m10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? X.a() : m10);
        }

        @Override // java.util.Collection
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final boolean add(Object obj) {
            return this.f21546a.g(obj);
        }

        @Override // java.util.Collection
        public boolean addAll(Collection collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public int c() {
            return this.f21546a.c();
        }

        @Override // java.util.Collection
        public final void clear() {
            this.f21546a.k();
        }

        @Override // java.util.Collection
        public boolean contains(Object obj) {
            return this.f21546a.a(obj);
        }

        @Override // java.util.Collection
        public boolean containsAll(Collection collection) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                if (!this.f21546a.a(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Collection
        public boolean isEmpty() {
            return this.f21546a.d();
        }

        @Override // java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return this.f21546a.j().iterator();
        }

        @Override // java.util.Collection
        public final boolean remove(Object obj) {
            return this.f21546a.x(obj);
        }

        @Override // java.util.Collection
        public final boolean removeAll(Collection collection) {
            return this.f21546a.x(collection);
        }

        @Override // java.util.Collection
        public boolean removeIf(Predicate predicate) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Collection
        public final boolean retainAll(Collection collection) {
            return this.f21546a.B(collection);
        }

        @Override // java.util.Collection
        public final /* bridge */ int size() {
            return c();
        }

        @Override // java.util.Collection
        public Object[] toArray() {
            return AbstractC3970g.a(this);
        }

        @Override // java.util.Collection
        public Object[] toArray(Object[] objArr) {
            return AbstractC3970g.b(this, objArr);
        }
    }

    void a(a aVar);

    boolean b(Object obj, Object obj2);
}
