package F3;

import Q3.AbstractC1337c;
import Q3.AbstractC1338d;
import android.content.Context;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import p435y3.n;

/* JADX INFO: loaded from: classes.dex */
public interface d {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Function0 f2923a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f2924b = true;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f2925c = true;

        public static /* synthetic */ a d(a aVar, Context context, double d10, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                d10 = AbstractC1338d.a(context);
            }
            return aVar.c(context, d10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final long e(double d10, Context context) {
            return (long) (d10 * AbstractC1338d.g(context));
        }

        public final d b() {
            j aVar;
            k iVar = this.f2925c ? new i() : new F3.b();
            if (this.f2924b) {
                Function0 function0 = this.f2923a;
                if (function0 == null) {
                    throw new IllegalStateException("maxSizeBytesFactory == null");
                }
                long jLongValue = ((Number) function0.invoke()).longValue();
                aVar = jLongValue > 0 ? new h(jLongValue, iVar) : new F3.a(iVar);
            } else {
                aVar = new F3.a(iVar);
            }
            return new g(aVar, iVar);
        }

        public final a c(Context context, double d10) {
            if (0.0d > d10 || d10 > 1.0d) {
                throw new IllegalArgumentException("percent must be in the range [0.0, 1.0].");
            }
            this.f2923a = new F3.c(d10, context);
            return this;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f2926a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Map f2927b;

        public b(String str, Map map) {
            this.f2926a = str;
            this.f2927b = AbstractC1337c.d(map);
        }

        public final Map a() {
            return this.f2927b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.b(this.f2926a, bVar.f2926a) && Intrinsics.b(this.f2927b, bVar.f2927b);
        }

        public int hashCode() {
            return (this.f2926a.hashCode() * 31) + this.f2927b.hashCode();
        }

        public String toString() {
            return "Key(key=" + this.f2926a + ", extras=" + this.f2927b + ')';
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final n f2928a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Map f2929b;

        public c(n nVar, Map map) {
            this.f2928a = nVar;
            this.f2929b = AbstractC1337c.d(map);
        }

        public final Map a() {
            return this.f2929b;
        }

        public final n b() {
            return this.f2928a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Intrinsics.b(this.f2928a, cVar.f2928a) && Intrinsics.b(this.f2929b, cVar.f2929b);
        }

        public int hashCode() {
            return (this.f2928a.hashCode() * 31) + this.f2929b.hashCode();
        }

        public String toString() {
            return "Value(image=" + this.f2928a + ", extras=" + this.f2929b + ')';
        }
    }

    long a();

    c b(b bVar);

    void clear();

    void e(long j10);

    void f(b bVar, c cVar);
}
