package p334sa;

import W9.b;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f53461a = new HashMap();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Class f53462a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final b f53463b;

        public a(Class cls, b bVar) {
            this.f53462a = cls;
            this.f53463b = bVar;
        }

        final b a() {
            return this.f53463b;
        }

        final Class b() {
            return this.f53462a;
        }
    }

    public c(Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            this.f53461a.put(aVar.b(), aVar.a());
        }
    }
}
