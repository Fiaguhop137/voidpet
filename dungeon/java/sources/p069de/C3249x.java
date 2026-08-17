package p069de;

import Ke.b;
import Qe.i;
import Qe.m;
import Qe.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.w;
import kotlin.reflect.k;
import p015ae.InterfaceC1801o;
import p015ae.N;
import p015ae.T;
import p015ae.V;
import p033be.h;
import p464ze.c;

/* JADX INFO: renamed from: de.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C3249x extends AbstractC3239m implements V {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final /* synthetic */ k[] f40174h = {F.j(new w(C3249x.class, "fragments", "getFragments()Ljava/util/List;", 0)), F.j(new w(C3249x.class, "empty", "getEmpty()Z", 0))};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final F f40175c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c f40176d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final i f40177e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final i f40178f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Ke.k f40179g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3249x(F module, c fqName, n storageManager) {
        super(h.f26532n1.b(), fqName.g());
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Intrinsics.checkNotNullParameter(storageManager, "storageManager");
        this.f40175c = module;
        this.f40176d = fqName;
        this.f40177e = storageManager.c(new C3246u(this));
        this.f40178f = storageManager.c(new C3247v(this));
        this.f40179g = new Ke.i(storageManager, new C3248w(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean L0(C3249x c3249x) {
        return T.b(c3249x.B0().M0(), c3249x.f());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List M0(C3249x c3249x) {
        return T.c(c3249x.B0().M0(), c3249x.f());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Ke.k Q0(C3249x c3249x) {
        if (c3249x.isEmpty()) {
            return Ke.k.b.f6227b;
        }
        List listL0 = c3249x.l0();
        ArrayList arrayList = new ArrayList(CollectionsKt.w(listL0, 10));
        Iterator it = listL0.iterator();
        while (it.hasNext()) {
            arrayList.add(((N) it.next()).o());
        }
        List listD0 = CollectionsKt.D0(arrayList, new P(c3249x.B0(), c3249x.f()));
        return b.f6180d.a("package view scope for " + c3249x.f() + " in " + c3249x.B0().getName(), listD0);
    }

    @Override // p015ae.InterfaceC1799m
    public Object H0(InterfaceC1801o visitor, Object obj) {
        Intrinsics.checkNotNullParameter(visitor, "visitor");
        return visitor.e(this, obj);
    }

    @Override // p015ae.InterfaceC1799m
    /* JADX INFO: renamed from: N0, reason: merged with bridge method [inline-methods] */
    public V b() {
        if (f().c()) {
            return null;
        }
        return B0().V(f().d());
    }

    protected final boolean O0() {
        return ((Boolean) m.a(this.f40178f, this, f40174h[1])).booleanValue();
    }

    @Override // p015ae.V
    /* JADX INFO: renamed from: P0, reason: merged with bridge method [inline-methods] */
    public F B0() {
        return this.f40175c;
    }

    public boolean equals(Object obj) {
        V v10 = obj instanceof V ? (V) obj : null;
        return v10 != null && Intrinsics.b(f(), v10.f()) && Intrinsics.b(B0(), v10.B0());
    }

    @Override // p015ae.V
    public c f() {
        return this.f40176d;
    }

    public int hashCode() {
        return (B0().hashCode() * 31) + f().hashCode();
    }

    @Override // p015ae.V
    public boolean isEmpty() {
        return O0();
    }

    @Override // p015ae.V
    public List l0() {
        return (List) m.a(this.f40177e, this, f40174h[0]);
    }

    @Override // p015ae.V
    public Ke.k o() {
        return this.f40179g;
    }
}
