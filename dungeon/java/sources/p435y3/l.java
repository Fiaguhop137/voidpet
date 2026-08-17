package p435y3;

import Q3.AbstractC1337c;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.N;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f57811b = new b(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l f57812c = new a().a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f57813a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Map f57814a;

        public a() {
            this.f57814a = new LinkedHashMap();
        }

        public a(Map map) {
            this.f57814a = N.v(map);
        }

        public a(l lVar) {
            this.f57814a = N.v(lVar.f57813a);
        }

        public final l a() {
            return new l(AbstractC1337c.d(this.f57814a), null);
        }

        public final a b(c cVar, Object obj) {
            if (obj != null) {
                this.f57814a.put(cVar, obj);
                return this;
            }
            this.f57814a.remove(cVar);
            return this;
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f57815b = new a(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f57816a;

        public static final class a {
            private a() {
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public c(Object obj) {
            this.f57816a = obj;
        }

        public final Object a() {
            return this.f57816a;
        }
    }

    private l(Map map) {
        this.f57813a = map;
    }

    public /* synthetic */ l(Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(map);
    }

    public final Map b() {
        return this.f57813a;
    }

    public final Object c(c cVar) {
        return this.f57813a.get(cVar);
    }

    public final a d() {
        return new a(this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l) && Intrinsics.b(this.f57813a, ((l) obj).f57813a);
    }

    public int hashCode() {
        return this.f57813a.hashCode();
    }

    public String toString() {
        return "Extras(data=" + this.f57813a + ')';
    }
}
