package B9;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class p {

    private static class b implements o, Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f617a;

        private b(List list) {
            this.f617a = list;
        }

        /* synthetic */ b(List list, a aVar) {
            this(list);
        }

        @Override // B9.o
        public boolean apply(Object obj) {
            for (int i10 = 0; i10 < this.f617a.size(); i10++) {
                if (!((o) this.f617a.get(i10)).apply(obj)) {
                    return false;
                }
            }
            return true;
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                return this.f617a.equals(((b) obj).f617a);
            }
            return false;
        }

        public int hashCode() {
            return this.f617a.hashCode() + 306654252;
        }

        public String toString() {
            return p.d("and", this.f617a);
        }
    }

    public static o b(o oVar, o oVar2) {
        return new b(c((o) n.j(oVar), (o) n.j(oVar2)), null);
    }

    private static List c(o oVar, o oVar2) {
        return Arrays.asList(oVar, oVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String d(String str, Iterable iterable) {
        StringBuilder sb2 = new StringBuilder("Predicates.");
        sb2.append(str);
        sb2.append('(');
        boolean z10 = true;
        for (Object obj : iterable) {
            if (!z10) {
                sb2.append(',');
            }
            sb2.append(obj);
            z10 = false;
        }
        sb2.append(')');
        return sb2.toString();
    }
}
