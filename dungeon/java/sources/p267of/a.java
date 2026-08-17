package p267of;

import Ed.b;

/* JADX INFO: loaded from: classes3.dex */
public interface a {

    /* JADX INFO: renamed from: of.a$a, reason: collision with other inner class name */
    public static final class C0602a {
        public static /* synthetic */ Object a(a aVar, Object obj, b bVar, int i10, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: lock");
            }
            if ((i10 & 1) != 0) {
                obj = null;
            }
            return aVar.a(obj, bVar);
        }

        public static /* synthetic */ boolean b(a aVar, Object obj, int i10, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: tryLock");
            }
            if ((i10 & 1) != 0) {
                obj = null;
            }
            return aVar.c(obj);
        }

        public static /* synthetic */ void c(a aVar, Object obj, int i10, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: unlock");
            }
            if ((i10 & 1) != 0) {
                obj = null;
            }
            aVar.e(obj);
        }
    }

    Object a(Object obj, b bVar);

    boolean c(Object obj);

    boolean d();

    void e(Object obj);
}
