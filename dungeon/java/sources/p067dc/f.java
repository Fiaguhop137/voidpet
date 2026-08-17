package p067dc;

import Rb.h;
import Rb.u;
import Yb.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.AbstractC3952n;
import kotlin.collections.N;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.o;
import p013ac.e;
import p013ac.j;
import p013ac.k;
import p013ac.m;
import p013ac.t;
import p157ic.C3594b;
import p157ic.C3596d;
import p157ic.P;
import p157ic.a0;

/* JADX INFO: loaded from: classes2.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a0 f39914a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private g f39916c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Function0 f39915b = new e();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Map f39917d = new LinkedHashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Map f39918e = new LinkedHashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Map f39919f = new LinkedHashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Map f39920g = new LinkedHashMap();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Map f39921h = new LinkedHashMap();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Map f39922i = new LinkedHashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final List f39923j = new ArrayList();

    public static final class a implements Function2 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ d.EnumC0442d f39925b;

        public a(d.EnumC0442d enumC0442d) {
            this.f39925b = enumC0442d;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void a(Object[] objArr, u promise) {
            Intrinsics.checkNotNullParameter(objArr, "<unused var>");
            Intrinsics.checkNotNullParameter(promise, "promise");
            String str = (String) promise;
            Iterator it = f.this.f39923j.iterator();
            while (it.hasNext()) {
                ((d) it.next()).a(this.f39925b, str);
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((Object[]) obj, (u) obj2);
            return Unit.f48228a;
        }
    }

    public static final class b implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f39926a = new b();

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final o invoke() {
            return F.n(String.class);
        }
    }

    public static final class c implements Function1 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ d.EnumC0442d f39928b;

        public c(d.EnumC0442d enumC0442d) {
            this.f39928b = enumC0442d;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object[] objArr) {
            Intrinsics.checkNotNullParameter(objArr, "<destruct>");
            String str = (String) objArr[0];
            Iterator it = f.this.f39923j.iterator();
            while (it.hasNext()) {
                ((d) it.next()).a(this.f39928b, str);
            }
            return Unit.f48228a;
        }
    }

    public f(a0 a0Var) {
        this.f39914a = a0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map s() {
        return N.i();
    }

    public final p013ac.b b(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        p013ac.b bVar = new p013ac.b(name, this.f39914a);
        this.f39920g.put(name, bVar);
        return bVar;
    }

    public final void c(Function0 legacyConstantsProvider) {
        Intrinsics.checkNotNullParameter(legacyConstantsProvider, "legacyConstantsProvider");
        this.f39915b = legacyConstantsProvider;
    }

    public final void d(String... events) {
        Intrinsics.checkNotNullParameter(events, "events");
        this.f39916c = new g((String[]) AbstractC3952n.e(events).toArray(new String[0]));
    }

    public final void e(Enum r10, Function0 body) {
        Intrinsics.checkNotNullParameter(r10, "enum");
        Intrinsics.checkNotNullParameter(body, "body");
        f(h.a(r10), body);
    }

    public final void f(String eventName, Function0 body) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(body, "body");
        this.f39923j.add(new d(d.EnumC0442d.StartObserving, new d.c(eventName), body));
    }

    public final void g(Function0 body) {
        Intrinsics.checkNotNullParameter(body, "body");
        this.f39923j.add(new d(d.EnumC0442d.StartObserving, d.a.f39907a, body));
    }

    public final void h(Enum r10, Function0 body) {
        Intrinsics.checkNotNullParameter(r10, "enum");
        Intrinsics.checkNotNullParameter(body, "body");
        i(h.a(r10), body);
    }

    public final void i(String eventName, Function0 body) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(body, "body");
        this.f39923j.add(new d(d.EnumC0442d.StopObserving, new d.c(eventName), body));
    }

    public final void j(Function0 body) {
        Intrinsics.checkNotNullParameter(body, "body");
        this.f39923j.add(new d(d.EnumC0442d.StopObserving, d.a.f39907a, body));
    }

    public final h l() {
        e oVar;
        e fVar;
        for (d.EnumC0442d enumC0442d : d.EnumC0442d.g()) {
            if (!this.f39919f.containsKey(enumC0442d.h())) {
                String strH = enumC0442d.h();
                if (Intrinsics.b(String.class, u.class)) {
                    fVar = new p013ac.f(strH, new C3594b[0], new a(enumC0442d));
                } else {
                    a0 a0VarO = o();
                    C3594b c3594b = (C3594b) C3596d.f43900a.a().get(new Pair(F.b(String.class), Boolean.FALSE));
                    if (c3594b == null) {
                        c3594b = new C3594b(new P(F.b(String.class), false, b.f39926a), a0VarO);
                    }
                    C3594b[] c3594bArr = {c3594b};
                    c cVar = new c(enumC0442d);
                    if (Intrinsics.b(Unit.class, Integer.TYPE)) {
                        oVar = new m(strH, c3594bArr, cVar);
                    } else if (Intrinsics.b(Unit.class, Boolean.TYPE)) {
                        oVar = new p013ac.h(strH, c3594bArr, cVar);
                    } else if (Intrinsics.b(Unit.class, Double.TYPE)) {
                        oVar = new j(strH, c3594bArr, cVar);
                    } else if (Intrinsics.b(Unit.class, Float.TYPE)) {
                        oVar = new k(strH, c3594bArr, cVar);
                    } else {
                        oVar = Intrinsics.b(Unit.class, String.class) ? new p013ac.o(strH, c3594bArr, cVar) : new t(strH, c3594bArr, cVar);
                    }
                    fVar = oVar;
                }
                m().put(strH, fVar);
            }
        }
        Map map = this.f39919f;
        Map map2 = this.f39920g;
        LinkedHashMap linkedHashMap = new LinkedHashMap(N.e(map2.size()));
        for (Map.Entry entry : map2.entrySet()) {
            linkedHashMap.put(entry.getKey(), ((p013ac.b) entry.getValue()).a());
        }
        Map mapV = N.v(N.o(map, linkedHashMap));
        Function0 function0 = this.f39915b;
        Map map3 = this.f39917d;
        Map map4 = this.f39918e;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(N.e(map4.size()));
        Iterator it = map4.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it.next();
            entry2.getKey();
            android.support.v4.media.session.b.a(entry2.getValue());
            throw null;
        }
        Map mapO = N.o(map3, linkedHashMap2);
        g gVar = this.f39916c;
        Map map5 = this.f39921h;
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(N.e(map5.size()));
        for (Map.Entry entry3 : map5.entrySet()) {
            linkedHashMap3.put(entry3.getKey(), ((l) entry3.getValue()).a());
        }
        Map map6 = this.f39922i;
        LinkedHashMap linkedHashMap4 = new LinkedHashMap(N.e(map6.size()));
        for (Map.Entry entry4 : map6.entrySet()) {
            linkedHashMap4.put(entry4.getKey(), ((p067dc.c) entry4.getValue()).a());
        }
        return new h(function0, mapO, mapV, gVar, linkedHashMap3, linkedHashMap4);
    }

    public final Map m() {
        return this.f39919f;
    }

    public final Map n() {
        return this.f39922i;
    }

    public final a0 o() {
        return this.f39914a;
    }

    public final g p() {
        return this.f39916c;
    }

    public final Map q() {
        return this.f39921h;
    }

    public final Map r() {
        return this.f39917d;
    }

    public final void t(g gVar) {
        this.f39916c = gVar;
    }
}
