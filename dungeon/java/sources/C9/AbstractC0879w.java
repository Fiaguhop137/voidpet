package C9;

import java.util.Collection;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

/* JADX INFO: renamed from: C9.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0879w {
    public static boolean a(Iterable iterable, B9.o oVar) {
        return x.b(iterable.iterator(), oVar);
    }

    private static Collection b(Iterable iterable) {
        return iterable instanceof Collection ? (Collection) iterable : z.i(iterable.iterator());
    }

    public static Object c(Iterable iterable, Object obj) {
        return x.k(iterable.iterator(), obj);
    }

    public static Object d(Iterable iterable) {
        if (!(iterable instanceof List)) {
            return x.i(iterable.iterator());
        }
        List list = (List) iterable;
        if (list.isEmpty()) {
            throw new NoSuchElementException();
        }
        return f(list);
    }

    public static Object e(Iterable iterable, Object obj) {
        if (iterable instanceof Collection) {
            if (((Collection) iterable).isEmpty()) {
                return obj;
            }
            if (iterable instanceof List) {
                return f(z.a(iterable));
            }
        }
        return x.j(iterable.iterator(), obj);
    }

    private static Object f(List list) {
        return list.get(list.size() - 1);
    }

    public static Object g(Iterable iterable) {
        return x.l(iterable.iterator());
    }

    public static boolean h(Iterable iterable, B9.o oVar) {
        return ((iterable instanceof RandomAccess) && (iterable instanceof List)) ? i((List) iterable, (B9.o) B9.n.j(oVar)) : x.p(iterable.iterator(), oVar);
    }

    private static boolean i(List list, B9.o oVar) {
        int i10 = 0;
        int i11 = 0;
        while (i10 < list.size()) {
            Object obj = list.get(i10);
            if (!oVar.apply(obj)) {
                if (i10 > i11) {
                    try {
                        list.set(i11, obj);
                    } catch (IllegalArgumentException unused) {
                        j(list, oVar, i11, i10);
                        return true;
                    } catch (UnsupportedOperationException unused2) {
                        j(list, oVar, i11, i10);
                        return true;
                    }
                }
                i11++;
            }
            i10++;
        }
        list.subList(i11, list.size()).clear();
        return i10 != i11;
    }

    private static void j(List list, B9.o oVar, int i10, int i11) {
        for (int size = list.size() - 1; size > i11; size--) {
            if (oVar.apply(list.get(size))) {
                list.remove(size);
            }
        }
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            list.remove(i12);
        }
    }

    static Object[] k(Iterable iterable) {
        return b(iterable).toArray();
    }
}
