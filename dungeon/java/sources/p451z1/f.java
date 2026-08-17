package p451z1;

import java.util.Map;
import kotlin.collections.N;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f58389a;

        public a(String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.f58389a = name;
        }

        public final String a() {
            return this.f58389a;
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                return Intrinsics.b(this.f58389a, ((a) obj).f58389a);
            }
            return false;
        }

        public int hashCode() {
            return this.f58389a.hashCode();
        }

        public String toString() {
            return this.f58389a;
        }
    }

    public static final class b {
    }

    public abstract Map a();

    public abstract Object b(a aVar);

    public final c c() {
        return new c(N.v(a()), false);
    }

    public final f d() {
        return new c(N.v(a()), true);
    }
}
