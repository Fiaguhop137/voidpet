package p140hd;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p158id.b;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c {

    public enum a {
        STATIC_BUILD_DATA("staticBuildData"),
        EXTRA_PARAMS("extraParams"),
        MANIFEST_SERVER_DEFINED_HEADERS("serverDefinedHeaders"),
        MANIFEST_FILTERS("manifestFilters");


        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f42838g = Gd.a.a(e());

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f42839a;

        a(String str) {
            this.f42839a = str;
        }

        public final String g() {
            return this.f42839a;
        }
    }

    protected abstract void a(String str, String str2);

    public void b(List keys) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        ArrayList arrayList = new ArrayList(CollectionsKt.w(keys, 10));
        Iterator it = keys.iterator();
        while (it.hasNext()) {
            arrayList.add(((a) it.next()).g());
        }
        c(arrayList);
    }

    protected abstract void c(List list);

    protected abstract void d(b bVar);

    protected abstract List e(String str, String str2);

    public final String f(a key, String scopeKey) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(scopeKey, "scopeKey");
        List listE = e(key.g(), scopeKey);
        if (listE.isEmpty()) {
            return null;
        }
        return ((b) listE.get(0)).e();
    }

    public void g(a key, String value, String scopeKey) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(scopeKey, "scopeKey");
        a(key.g(), scopeKey);
        d(new b(key.g(), value, new Date(), scopeKey));
    }

    public void h(Map fields, String scopeKey) {
        Intrinsics.checkNotNullParameter(fields, "fields");
        Intrinsics.checkNotNullParameter(scopeKey, "scopeKey");
        for (Map.Entry entry : fields.entrySet()) {
            a(((a) entry.getKey()).g(), scopeKey);
            d(new b(((a) entry.getKey()).g(), (String) entry.getValue(), new Date(), scopeKey));
        }
    }

    public void i(a key, String scopeKey, Function1 updater) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(scopeKey, "scopeKey");
        Intrinsics.checkNotNullParameter(updater, "updater");
        String strF = f(key, scopeKey);
        a(key.g(), scopeKey);
        d(new b(key.g(), (String) updater.invoke(strF), new Date(), scopeKey));
    }
}
