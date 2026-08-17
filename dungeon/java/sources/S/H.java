package S;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class H implements V, Map, Nd.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private X f11278a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set f11279b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set f11280c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Collection f11281d;

    public static final class a extends X {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private L.f f11282c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f11283d;

        public a(long j10, L.f fVar) {
            super(j10);
            this.f11282c = fVar;
        }

        @Override // S.X
        public void c(X x10) {
            Intrinsics.d(x10, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord, V of androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord>");
            a aVar = (a) x10;
            synchronized (I.f11284a) {
                this.f11282c = aVar.f11282c;
                this.f11283d = aVar.f11283d;
                Unit unit = Unit.f48228a;
            }
        }

        @Override // S.X
        public X d(long j10) {
            return new a(j10, this.f11282c);
        }

        public final L.f i() {
            return this.f11282c;
        }

        public final int j() {
            return this.f11283d;
        }

        public final void k(L.f fVar) {
            this.f11282c = fVar;
        }

        public final void l(int i10) {
            this.f11283d = i10;
        }
    }

    public H() {
        L.f fVarA = L.a.a();
        AbstractC1432l abstractC1432lM = AbstractC1442w.M();
        a aVar = new a(abstractC1432lM.i(), fVarA);
        if (!(abstractC1432lM instanceof C1422b)) {
            aVar.g(new a(r.c(1), fVarA));
        }
        this.f11278a = aVar;
        this.f11279b = new C1443x(this);
        this.f11280c = new C1444y(this);
        this.f11281d = new A(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean b(a aVar, int i10, L.f fVar) {
        boolean z10;
        synchronized (I.f11284a) {
            if (aVar.j() == i10) {
                aVar.k(fVar);
                z10 = true;
                aVar.l(aVar.j() + 1);
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    private final int c(a aVar, L.f fVar) {
        int iJ;
        synchronized (I.f11284a) {
            aVar.k(fVar);
            iJ = aVar.j();
            aVar.l(iJ + 1);
        }
        return iJ;
    }

    @Override // java.util.Map
    public void clear() {
        AbstractC1432l abstractC1432lC;
        X xW = w();
        Intrinsics.d(xW, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        a aVar = (a) AbstractC1442w.K((a) xW);
        aVar.i();
        L.f fVarA = L.a.a();
        if (fVarA != aVar.i()) {
            X xW2 = w();
            Intrinsics.d(xW2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            a aVar2 = (a) xW2;
            synchronized (AbstractC1442w.O()) {
                abstractC1432lC = AbstractC1432l.f11377e.c();
                c((a) AbstractC1442w.p0(aVar2, this, abstractC1432lC), fVarA);
            }
            AbstractC1442w.X(abstractC1432lC, this);
        }
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return g().i().containsKey(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return g().i().containsValue(obj);
    }

    public Set d() {
        return this.f11279b;
    }

    public Set e() {
        return this.f11280c;
    }

    @Override // java.util.Map
    public final /* bridge */ Set entrySet() {
        return d();
    }

    public final int f() {
        return g().j();
    }

    public final a g() {
        X xW = w();
        Intrinsics.d(xW, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        return (a) AbstractC1442w.e0((a) xW, this);
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        return g().i().get(obj);
    }

    public int h() {
        return g().i().size();
    }

    public Collection i() {
        return this.f11281d;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return g().i().isEmpty();
    }

    public final boolean k(Object obj) {
        Object next;
        Iterator it = entrySet().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.b(((Map.Entry) next).getValue(), obj));
        Map.Entry entry = (Map.Entry) next;
        if (entry == null) {
            return false;
        }
        remove(entry.getKey());
        return true;
    }

    @Override // java.util.Map
    public final /* bridge */ Set keySet() {
        return e();
    }

    @Override // S.V
    public void n(X x10) {
        Intrinsics.d(x10, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        this.f11278a = (a) x10;
    }

    @Override // java.util.Map
    public Object put(Object obj, Object obj2) {
        L.f fVarI;
        int iJ;
        Object objPut;
        AbstractC1432l abstractC1432lC;
        boolean zB;
        do {
            synchronized (I.f11284a) {
                X xW = w();
                Intrinsics.d(xW, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                a aVar = (a) AbstractC1442w.K((a) xW);
                fVarI = aVar.i();
                iJ = aVar.j();
                Unit unit = Unit.f48228a;
            }
            Intrinsics.c(fVarI);
            L.f.a aVarBuilder = fVarI.builder();
            objPut = aVarBuilder.put(obj, obj2);
            L.f fVarBuild = aVarBuilder.build();
            if (Intrinsics.b(fVarBuild, fVarI)) {
                break;
            }
            X xW2 = w();
            Intrinsics.d(xW2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            a aVar2 = (a) xW2;
            synchronized (AbstractC1442w.O()) {
                abstractC1432lC = AbstractC1432l.f11377e.c();
                zB = b((a) AbstractC1442w.p0(aVar2, this, abstractC1432lC), iJ, fVarBuild);
            }
            AbstractC1442w.X(abstractC1432lC, this);
        } while (!zB);
        return objPut;
    }

    @Override // java.util.Map
    public void putAll(Map map) {
        L.f fVarI;
        int iJ;
        AbstractC1432l abstractC1432lC;
        boolean zB;
        do {
            synchronized (I.f11284a) {
                X xW = w();
                Intrinsics.d(xW, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                a aVar = (a) AbstractC1442w.K((a) xW);
                fVarI = aVar.i();
                iJ = aVar.j();
                Unit unit = Unit.f48228a;
            }
            Intrinsics.c(fVarI);
            L.f.a aVarBuilder = fVarI.builder();
            aVarBuilder.putAll(map);
            L.f fVarBuild = aVarBuilder.build();
            if (Intrinsics.b(fVarBuild, fVarI)) {
                return;
            }
            X xW2 = w();
            Intrinsics.d(xW2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            a aVar2 = (a) xW2;
            synchronized (AbstractC1442w.O()) {
                abstractC1432lC = AbstractC1432l.f11377e.c();
                zB = b((a) AbstractC1442w.p0(aVar2, this, abstractC1432lC), iJ, fVarBuild);
            }
            AbstractC1442w.X(abstractC1432lC, this);
        } while (!zB);
    }

    @Override // java.util.Map
    public Object remove(Object obj) {
        L.f fVarI;
        int iJ;
        Object objRemove;
        AbstractC1432l abstractC1432lC;
        boolean zB;
        do {
            synchronized (I.f11284a) {
                X xW = w();
                Intrinsics.d(xW, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                a aVar = (a) AbstractC1442w.K((a) xW);
                fVarI = aVar.i();
                iJ = aVar.j();
                Unit unit = Unit.f48228a;
            }
            Intrinsics.c(fVarI);
            L.f.a aVarBuilder = fVarI.builder();
            objRemove = aVarBuilder.remove(obj);
            L.f fVarBuild = aVarBuilder.build();
            if (Intrinsics.b(fVarBuild, fVarI)) {
                break;
            }
            X xW2 = w();
            Intrinsics.d(xW2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            a aVar2 = (a) xW2;
            synchronized (AbstractC1442w.O()) {
                abstractC1432lC = AbstractC1432l.f11377e.c();
                zB = b((a) AbstractC1442w.p0(aVar2, this, abstractC1432lC), iJ, fVarBuild);
            }
            AbstractC1442w.X(abstractC1432lC, this);
        } while (!zB);
        return objRemove;
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return h();
    }

    public String toString() {
        X xW = w();
        Intrinsics.d(xW, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        return "SnapshotStateMap(value=" + ((a) AbstractC1442w.K((a) xW)).i() + ")@" + hashCode();
    }

    @Override // java.util.Map
    public final /* bridge */ Collection values() {
        return i();
    }

    @Override // S.V
    public X w() {
        return this.f11278a;
    }
}
