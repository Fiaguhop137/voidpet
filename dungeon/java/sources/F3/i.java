package F3;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p435y3.n;

/* JADX INFO: loaded from: classes.dex */
public final class i implements k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f2944c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LinkedHashMap f2945a = new LinkedHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f2946b;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference f2947a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Map f2948b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f2949c;

        public b(WeakReference weakReference, Map map, long j10) {
            this.f2947a = weakReference;
            this.f2948b = map;
            this.f2949c = j10;
        }

        public final Map a() {
            return this.f2948b;
        }

        public final WeakReference b() {
            return this.f2947a;
        }

        public final long c() {
            return this.f2949c;
        }
    }

    private final void e() {
        int i10 = this.f2946b;
        this.f2946b = i10 + 1;
        if (i10 >= 10) {
            a();
        }
    }

    public final void a() {
        WeakReference weakReferenceB;
        this.f2946b = 0;
        Iterator it = this.f2945a.values().iterator();
        while (it.hasNext()) {
            ArrayList arrayList = (ArrayList) it.next();
            if (arrayList.size() <= 1) {
                b bVar = (b) CollectionsKt.firstOrNull(arrayList);
                if (((bVar == null || (weakReferenceB = bVar.b()) == null) ? null : (n) weakReferenceB.get()) == null) {
                    it.remove();
                }
            } else {
                int size = arrayList.size();
                int i10 = 0;
                for (int i11 = 0; i11 < size; i11++) {
                    int i12 = i11 - i10;
                    if (((b) arrayList.get(i12)).b().get() == null) {
                        arrayList.remove(i12);
                        i10++;
                    }
                }
                if (arrayList.isEmpty()) {
                    it.remove();
                }
            }
        }
    }

    @Override // F3.k
    public d.c b(d.b bVar) {
        ArrayList arrayList = (ArrayList) this.f2945a.get(bVar);
        d.c cVar = null;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            b bVar2 = (b) arrayList.get(i10);
            n nVar = (n) bVar2.b().get();
            d.c cVar2 = nVar != null ? new d.c(nVar, bVar2.a()) : null;
            if (cVar2 != null) {
                cVar = cVar2;
                break;
            }
        }
        e();
        return cVar;
    }

    @Override // F3.k
    public boolean c(d.b bVar) {
        return this.f2945a.remove(bVar) != null;
    }

    @Override // F3.k
    public void clear() {
        this.f2946b = 0;
        this.f2945a.clear();
    }

    @Override // F3.k
    public void d(d.b bVar, n nVar, Map map, long j10) {
        LinkedHashMap linkedHashMap = this.f2945a;
        Object arrayList = linkedHashMap.get(bVar);
        if (arrayList == null) {
            arrayList = new ArrayList();
            linkedHashMap.put(bVar, arrayList);
        }
        ArrayList arrayList2 = (ArrayList) arrayList;
        b bVar2 = new b(new WeakReference(nVar), map, j10);
        if (arrayList2.isEmpty()) {
            arrayList2.add(bVar2);
        } else {
            int size = arrayList2.size();
            for (int i10 = 0; i10 < size; i10++) {
                b bVar3 = (b) arrayList2.get(i10);
                if (j10 >= bVar3.c()) {
                    if (bVar3.b().get() == nVar) {
                        arrayList2.set(i10, bVar2);
                        break;
                    } else {
                        arrayList2.add(i10, bVar2);
                        break;
                    }
                }
            }
        }
        e();
    }
}
