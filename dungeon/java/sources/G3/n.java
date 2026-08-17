package G3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.N;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f3915b = new b(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final n f3916c = new a().b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f3917a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Map f3918a;

        public a() {
            this.f3918a = new LinkedHashMap();
        }

        public a(n nVar) {
            Map map = nVar.f3917a;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : map.entrySet()) {
                linkedHashMap.put(entry.getKey(), CollectionsKt.W0((Collection) entry.getValue()));
            }
            this.f3918a = linkedHashMap;
        }

        public final a a(String str, String str2) {
            Map map = this.f3918a;
            String lowerCase = str.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            Object arrayList = map.get(lowerCase);
            if (arrayList == null) {
                arrayList = new ArrayList();
                map.put(lowerCase, arrayList);
            }
            ((List) arrayList).add(str2);
            return this;
        }

        public final n b() {
            return new n(N.t(this.f3918a), null);
        }

        public final a c(String str, String str2) {
            Map map = this.f3918a;
            String lowerCase = str.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            map.put(lowerCase, CollectionsKt.r(str2));
            return this;
        }

        public final a d(String str, List list) {
            Map map = this.f3918a;
            String lowerCase = str.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            map.put(lowerCase, CollectionsKt.W0(list));
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

    private n(Map map) {
        this.f3917a = map;
    }

    public /* synthetic */ n(Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(map);
    }

    public final Map b() {
        return this.f3917a;
    }

    public final String c(String str) {
        Map map = this.f3917a;
        String lowerCase = str.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        List list = (List) map.get(lowerCase);
        if (list != null) {
            return (String) CollectionsKt.w0(list);
        }
        return null;
    }

    public final a d() {
        return new a(this);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n) && Intrinsics.b(this.f3917a, ((n) obj).f3917a);
    }

    public int hashCode() {
        return this.f3917a.hashCode();
    }

    public String toString() {
        return "NetworkHeaders(data=" + this.f3917a + ')';
    }
}
