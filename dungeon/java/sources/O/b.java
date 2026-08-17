package O;

import L.g;
import N.d;
import java.util.Iterator;
import kotlin.collections.AbstractC3949k;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class b extends AbstractC3949k implements g {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f8251e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f8252f = 8;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final b f8253g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f8254b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f8255c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final d f8256d;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final g a() {
            return b.f8253g;
        }
    }

    static {
        P.c cVar = P.c.f8568a;
        f8253g = new b(cVar, cVar, d.f7125f.a());
    }

    public b(Object obj, Object obj2, d dVar) {
        this.f8254b = obj;
        this.f8255c = obj2;
        this.f8256d = dVar;
    }

    @Override // java.util.Collection, java.util.Set, L.g
    public g add(Object obj) {
        if (this.f8256d.containsKey(obj)) {
            return this;
        }
        if (isEmpty()) {
            return new b(obj, obj, this.f8256d.v(obj, new O.a()));
        }
        Object obj2 = this.f8255c;
        Object obj3 = this.f8256d.get(obj2);
        Intrinsics.c(obj3);
        return new b(this.f8254b, obj, this.f8256d.v(obj2, ((O.a) obj3).e(obj)).v(obj, new O.a(obj2)));
    }

    @Override // kotlin.collections.AbstractC3940b
    public int c() {
        return this.f8256d.size();
    }

    @Override // kotlin.collections.AbstractC3940b, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return this.f8256d.containsKey(obj);
    }

    @Override // kotlin.collections.AbstractC3949k, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return new c(this.f8254b, this.f8256d);
    }

    @Override // java.util.Collection, java.util.Set, L.g
    public g remove(Object obj) {
        O.a aVar = (O.a) this.f8256d.get(obj);
        if (aVar == null) {
            return this;
        }
        d dVarW = this.f8256d.w(obj);
        if (aVar.b()) {
            Object obj2 = dVarW.get(aVar.d());
            Intrinsics.c(obj2);
            dVarW = dVarW.v(aVar.d(), ((O.a) obj2).e(aVar.c()));
        }
        if (aVar.a()) {
            Object obj3 = dVarW.get(aVar.c());
            Intrinsics.c(obj3);
            dVarW = dVarW.v(aVar.c(), ((O.a) obj3).f(aVar.d()));
        }
        return new b(!aVar.b() ? aVar.c() : this.f8254b, !aVar.a() ? aVar.d() : this.f8255c, dVarW);
    }
}
