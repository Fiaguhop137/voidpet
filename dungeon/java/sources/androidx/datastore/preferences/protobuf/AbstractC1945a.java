package androidx.datastore.preferences.protobuf;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1945a implements K {
    protected int memoizedHashCode = 0;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0285a implements K.a {
        protected static void c(Iterable iterable, List list) {
            AbstractC1964u.a(iterable);
            if (!(iterable instanceof InterfaceC1968y)) {
                if (iterable instanceof U) {
                    list.addAll((Collection) iterable);
                    return;
                } else {
                    d(iterable, list);
                    return;
                }
            }
            List listR = ((InterfaceC1968y) iterable).r();
            android.support.v4.media.session.b.a(list);
            list.size();
            Iterator it = listR.iterator();
            if (it.hasNext()) {
                Object next = it.next();
                if (next == null) {
                    new StringBuilder().append("Element at index ");
                    throw null;
                }
                if (next instanceof AbstractC1950f) {
                    throw null;
                }
                if (next instanceof byte[]) {
                    AbstractC1950f.h((byte[]) next);
                    throw null;
                }
                throw null;
            }
        }

        private static void d(Iterable iterable, List list) {
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
            }
            int size = list.size();
            for (Object obj : iterable) {
                if (obj == null) {
                    String str = "Element at index " + (list.size() - size) + " is null.";
                    for (int size2 = list.size() - 1; size2 >= size; size2--) {
                        list.remove(size2);
                    }
                    throw new NullPointerException(str);
                }
                list.add(obj);
            }
        }

        protected static g0 e(K k10) {
            return new g0(k10);
        }
    }

    protected static void a(Iterable iterable, List list) {
        AbstractC0285a.c(iterable, list);
    }

    abstract int c(a0 a0Var);

    g0 d() {
        return new g0(this);
    }

    public void e(OutputStream outputStream) {
        AbstractC1953i abstractC1953iY = AbstractC1953i.Y(outputStream, AbstractC1953i.C(getSerializedSize()));
        b(abstractC1953iY);
        abstractC1953iY.V();
    }
}
