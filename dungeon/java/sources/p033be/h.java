package p033be;

import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p464ze.c;

/* JADX INFO: loaded from: classes3.dex */
public interface h extends Iterable, Nd.a {

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    public static final a f26532n1 = a.f26533a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f26533a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final h f26534b = new C0348a();

        /* JADX INFO: renamed from: be.h$a$a, reason: collision with other inner class name */
        public static final class C0348a implements h {
            C0348a() {
            }

            public Void a(c fqName) {
                Intrinsics.checkNotNullParameter(fqName, "fqName");
                return null;
            }

            @Override // p033be.h
            public boolean b1(c cVar) {
                return b.b(this, cVar);
            }

            @Override // p033be.h
            public boolean isEmpty() {
                return true;
            }

            @Override // java.lang.Iterable
            public Iterator iterator() {
                return CollectionsKt.l().iterator();
            }

            public String toString() {
                return "EMPTY";
            }

            @Override // p033be.h
            public /* bridge */ /* synthetic */ c u(c cVar) {
                return (c) a(cVar);
            }
        }

        private a() {
        }

        public final h a(List annotations) {
            Intrinsics.checkNotNullParameter(annotations, "annotations");
            return annotations.isEmpty() ? f26534b : new i(annotations);
        }

        public final h b() {
            return f26534b;
        }
    }

    public static final class b {
        public static c a(h hVar, c fqName) {
            Object next;
            Intrinsics.checkNotNullParameter(fqName, "fqName");
            Iterator it = hVar.iterator();
            while (it.hasNext()) {
                next = it.next();
                if (Intrinsics.b(((c) next).f(), fqName)) {
                    return (c) next;
                }
            }
            next = null;
            return (c) next;
        }

        public static boolean b(h hVar, c fqName) {
            Intrinsics.checkNotNullParameter(fqName, "fqName");
            return hVar.u(fqName) != null;
        }
    }

    boolean b1(c cVar);

    boolean isEmpty();

    c u(c cVar);
}
