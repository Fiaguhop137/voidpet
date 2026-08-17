package com.google.protobuf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
abstract class I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final I f37814a = new b(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final I f37815b = new c(null);

    private static final class b extends I {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final Class f37816c = Collections.unmodifiableList(Collections.EMPTY_LIST).getClass();

        private b() {
            super(null);
        }

        /* synthetic */ b(a aVar) {
            this();
        }

        static List f(Object obj, long j10) {
            return (List) z0.G(obj, j10);
        }

        private static List g(Object obj, long j10, int i10) {
            List listF;
            List listF2 = f(obj, j10);
            if (listF2.isEmpty()) {
                if (listF2 instanceof H) {
                    listF = new G(i10);
                } else {
                    listF = ((listF2 instanceof h0) && (listF2 instanceof A.i)) ? ((A.i) listF2).f(i10) : new ArrayList(i10);
                }
                z0.V(obj, j10, listF);
                return listF;
            }
            if (f37816c.isAssignableFrom(listF2.getClass())) {
                ArrayList arrayList = new ArrayList(listF2.size() + i10);
                arrayList.addAll(listF2);
                z0.V(obj, j10, arrayList);
                return arrayList;
            }
            if (listF2 instanceof y0) {
                G g10 = new G(listF2.size() + i10);
                g10.addAll((y0) listF2);
                z0.V(obj, j10, g10);
                return g10;
            }
            if ((listF2 instanceof h0) && (listF2 instanceof A.i)) {
                A.i iVar = (A.i) listF2;
                if (!iVar.O()) {
                    A.i iVarF = iVar.f(listF2.size() + i10);
                    z0.V(obj, j10, iVarF);
                    return iVarF;
                }
            }
            return listF2;
        }

        @Override // com.google.protobuf.I
        void c(Object obj, long j10) {
            Object objUnmodifiableList;
            List list = (List) z0.G(obj, j10);
            if (list instanceof H) {
                objUnmodifiableList = ((H) list).V();
            } else {
                if (f37816c.isAssignableFrom(list.getClass())) {
                    return;
                }
                if ((list instanceof h0) && (list instanceof A.i)) {
                    A.i iVar = (A.i) list;
                    if (iVar.O()) {
                        iVar.z();
                        return;
                    }
                    return;
                }
                objUnmodifiableList = Collections.unmodifiableList(list);
            }
            z0.V(obj, j10, objUnmodifiableList);
        }

        @Override // com.google.protobuf.I
        void d(Object obj, Object obj2, long j10) {
            List listF = f(obj2, j10);
            List listG = g(obj, j10, listF.size());
            int size = listG.size();
            int size2 = listF.size();
            if (size > 0 && size2 > 0) {
                listG.addAll(listF);
            }
            if (size > 0) {
                listF = listG;
            }
            z0.V(obj, j10, listF);
        }

        @Override // com.google.protobuf.I
        List e(Object obj, long j10) {
            return g(obj, j10, 10);
        }
    }

    private static final class c extends I {
        private c() {
            super(null);
        }

        /* synthetic */ c(a aVar) {
            this();
        }

        static A.i f(Object obj, long j10) {
            return (A.i) z0.G(obj, j10);
        }

        @Override // com.google.protobuf.I
        void c(Object obj, long j10) {
            f(obj, j10).z();
        }

        @Override // com.google.protobuf.I
        void d(Object obj, Object obj2, long j10) {
            A.i iVarF = f(obj, j10);
            A.i iVarF2 = f(obj2, j10);
            int size = iVarF.size();
            int size2 = iVarF2.size();
            if (size > 0 && size2 > 0) {
                if (!iVarF.O()) {
                    iVarF = iVarF.f(size2 + size);
                }
                iVarF.addAll(iVarF2);
            }
            if (size > 0) {
                iVarF2 = iVarF;
            }
            z0.V(obj, j10, iVarF2);
        }

        @Override // com.google.protobuf.I
        List e(Object obj, long j10) {
            A.i iVarF = f(obj, j10);
            if (iVarF.O()) {
                return iVarF;
            }
            int size = iVarF.size();
            A.i iVarF2 = iVarF.f(size == 0 ? 10 : size * 2);
            z0.V(obj, j10, iVarF2);
            return iVarF2;
        }
    }

    private I() {
    }

    /* synthetic */ I(a aVar) {
        this();
    }

    static I a() {
        return f37814a;
    }

    static I b() {
        return f37815b;
    }

    abstract void c(Object obj, long j10);

    abstract void d(Object obj, Object obj2, long j10);

    abstract List e(Object obj, long j10);
}
