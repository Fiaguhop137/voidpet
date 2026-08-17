package p320re;

import Ad.v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.AbstractC3952n;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.collections.N;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.e;
import p338se.F;

/* JADX INFO: loaded from: classes3.dex */
final class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f52560a = new LinkedHashMap();

    public final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f52561a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ n0 f52562b;

        /* JADX INFO: renamed from: re.n0$a$a, reason: collision with other inner class name */
        public final class C0635a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final String f52563a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final String f52564b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final List f52565c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private Pair f52566d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ a f52567e;

            public C0635a(a aVar, String functionName, String str) {
                Intrinsics.checkNotNullParameter(functionName, "functionName");
                this.f52567e = aVar;
                this.f52563a = functionName;
                this.f52564b = str;
                this.f52565c = new ArrayList();
                this.f52566d = v.a("V", null);
            }

            public final Pair a() {
                F f10 = F.f53539a;
                String strC = this.f52567e.c();
                String str = this.f52563a;
                List list = this.f52565c;
                ArrayList arrayList = new ArrayList(CollectionsKt.w(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add((String) ((Pair) it.next()).c());
                }
                String strM = f10.m(strC, f10.k(str, arrayList, (String) this.f52566d.c()));
                r0 r0Var = (r0) this.f52566d.d();
                List list2 = this.f52565c;
                ArrayList arrayList2 = new ArrayList(CollectionsKt.w(list2, 10));
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add((r0) ((Pair) it2.next()).d());
                }
                return v.a(strM, new g0(r0Var, arrayList2, this.f52564b));
            }

            public final void b(String type, C4083h... qualifiers) {
                r0 r0Var;
                Intrinsics.checkNotNullParameter(type, "type");
                Intrinsics.checkNotNullParameter(qualifiers, "qualifiers");
                List list = this.f52565c;
                if (qualifiers.length == 0) {
                    r0Var = null;
                } else {
                    Iterable<IndexedValue> iterableX0 = AbstractC3952n.X0(qualifiers);
                    LinkedHashMap linkedHashMap = new LinkedHashMap(e.e(N.e(CollectionsKt.w(iterableX0, 10)), 16));
                    for (IndexedValue indexedValue : iterableX0) {
                        linkedHashMap.put(Integer.valueOf(indexedValue.c()), (C4083h) indexedValue.d());
                    }
                    r0Var = new r0(linkedHashMap);
                }
                list.add(v.a(type, r0Var));
            }

            public final void c(Ie.e type) {
                Intrinsics.checkNotNullParameter(type, "type");
                String strI = type.i();
                Intrinsics.checkNotNullExpressionValue(strI, "getDesc(...)");
                this.f52566d = v.a(strI, null);
            }

            public final void d(String type, C4083h... qualifiers) {
                Intrinsics.checkNotNullParameter(type, "type");
                Intrinsics.checkNotNullParameter(qualifiers, "qualifiers");
                Iterable<IndexedValue> iterableX0 = AbstractC3952n.X0(qualifiers);
                LinkedHashMap linkedHashMap = new LinkedHashMap(e.e(N.e(CollectionsKt.w(iterableX0, 10)), 16));
                for (IndexedValue indexedValue : iterableX0) {
                    linkedHashMap.put(Integer.valueOf(indexedValue.c()), (C4083h) indexedValue.d());
                }
                this.f52566d = v.a(type, new r0(linkedHashMap));
            }
        }

        public a(n0 n0Var, String className) {
            Intrinsics.checkNotNullParameter(className, "className");
            this.f52562b = n0Var;
            this.f52561a = className;
        }

        public static /* synthetic */ void b(a aVar, String str, String str2, Function1 function1, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                str2 = null;
            }
            aVar.a(str, str2, function1);
        }

        public final void a(String name, String str, Function1 block) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(block, "block");
            Map map = this.f52562b.f52560a;
            C0635a c0635a = new C0635a(this, name, str);
            block.invoke(c0635a);
            Pair pairA = c0635a.a();
            map.put(pairA.c(), pairA.d());
        }

        public final String c() {
            return this.f52561a;
        }
    }

    public final Map b() {
        return this.f52560a;
    }
}
