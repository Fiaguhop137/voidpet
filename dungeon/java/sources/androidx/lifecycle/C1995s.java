package androidx.lifecycle;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: androidx.lifecycle.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1995s extends AbstractC1987j {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final a f24361k = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f24362b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private p269p.a f24363c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private AbstractC1987j.b f24364d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final WeakReference f24365e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f24366f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f24367g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f24368h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ArrayList f24369i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final p142hf.t f24370j;

    /* JADX INFO: renamed from: androidx.lifecycle.s$a */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final AbstractC1987j.b a(AbstractC1987j.b state1, AbstractC1987j.b bVar) {
            Intrinsics.checkNotNullParameter(state1, "state1");
            return (bVar == null || bVar.compareTo(state1) >= 0) ? state1 : bVar;
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.s$b */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private AbstractC1987j.b f24371a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private InterfaceC1991n f24372b;

        public b(InterfaceC1993p interfaceC1993p, AbstractC1987j.b initialState) {
            Intrinsics.checkNotNullParameter(initialState, "initialState");
            Intrinsics.c(interfaceC1993p);
            this.f24372b = C1998v.f(interfaceC1993p);
            this.f24371a = initialState;
        }

        public final void a(InterfaceC1994q interfaceC1994q, AbstractC1987j.a event) {
            Intrinsics.checkNotNullParameter(event, "event");
            AbstractC1987j.b bVarG = event.g();
            this.f24371a = C1995s.f24361k.a(this.f24371a, bVarG);
            InterfaceC1991n interfaceC1991n = this.f24372b;
            Intrinsics.c(interfaceC1994q);
            interfaceC1991n.f(interfaceC1994q, event);
            this.f24371a = bVarG;
        }

        public final AbstractC1987j.b b() {
            return this.f24371a;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1995s(InterfaceC1994q provider) {
        this(provider, true);
        Intrinsics.checkNotNullParameter(provider, "provider");
    }

    private C1995s(InterfaceC1994q interfaceC1994q, boolean z10) {
        this.f24362b = z10;
        this.f24363c = new p269p.a();
        AbstractC1987j.b bVar = AbstractC1987j.b.INITIALIZED;
        this.f24364d = bVar;
        this.f24369i = new ArrayList();
        this.f24365e = new WeakReference(interfaceC1994q);
        this.f24370j = p142hf.J.a(bVar);
    }

    private final void e(InterfaceC1994q interfaceC1994q) {
        Iterator itDescendingIterator = this.f24363c.descendingIterator();
        Intrinsics.checkNotNullExpressionValue(itDescendingIterator, "descendingIterator(...)");
        while (itDescendingIterator.hasNext() && !this.f24368h) {
            Map.Entry entry = (Map.Entry) itDescendingIterator.next();
            Intrinsics.c(entry);
            InterfaceC1993p interfaceC1993p = (InterfaceC1993p) entry.getKey();
            b bVar = (b) entry.getValue();
            while (bVar.b().compareTo(this.f24364d) > 0 && !this.f24368h && this.f24363c.contains(interfaceC1993p)) {
                AbstractC1987j.a aVarA = AbstractC1987j.a.Companion.a(bVar.b());
                if (aVarA == null) {
                    throw new IllegalStateException("no event down from " + bVar.b());
                }
                m(aVarA.g());
                bVar.a(interfaceC1994q, aVarA);
                l();
            }
        }
    }

    private final AbstractC1987j.b f(InterfaceC1993p interfaceC1993p) {
        b bVar;
        Map.Entry entryK = this.f24363c.k(interfaceC1993p);
        AbstractC1987j.b bVar2 = null;
        AbstractC1987j.b bVarB = (entryK == null || (bVar = (b) entryK.getValue()) == null) ? null : bVar.b();
        if (!this.f24369i.isEmpty()) {
            ArrayList arrayList = this.f24369i;
            bVar2 = (AbstractC1987j.b) arrayList.get(arrayList.size() - 1);
        }
        a aVar = f24361k;
        return aVar.a(aVar.a(this.f24364d, bVarB), bVar2);
    }

    private final void g(String str) {
        if (!this.f24362b || AbstractC1997u.a()) {
            return;
        }
        throw new IllegalStateException(("Method " + str + " must be called on the main thread").toString());
    }

    private final void h(InterfaceC1994q interfaceC1994q) {
        p.b.d dVarE = this.f24363c.e();
        Intrinsics.checkNotNullExpressionValue(dVarE, "iteratorWithAdditions(...)");
        while (dVarE.hasNext() && !this.f24368h) {
            Map.Entry entry = (Map.Entry) dVarE.next();
            InterfaceC1993p interfaceC1993p = (InterfaceC1993p) entry.getKey();
            b bVar = (b) entry.getValue();
            while (bVar.b().compareTo(this.f24364d) < 0 && !this.f24368h && this.f24363c.contains(interfaceC1993p)) {
                m(bVar.b());
                AbstractC1987j.a aVarB = AbstractC1987j.a.Companion.b(bVar.b());
                if (aVarB == null) {
                    throw new IllegalStateException("no event up from " + bVar.b());
                }
                bVar.a(interfaceC1994q, aVarB);
                l();
            }
        }
    }

    private final boolean j() {
        if (this.f24363c.size() == 0) {
            return true;
        }
        Map.Entry entryA = this.f24363c.a();
        Intrinsics.c(entryA);
        AbstractC1987j.b bVarB = ((b) entryA.getValue()).b();
        Map.Entry entryG = this.f24363c.g();
        Intrinsics.c(entryG);
        AbstractC1987j.b bVarB2 = ((b) entryG.getValue()).b();
        return bVarB == bVarB2 && this.f24364d == bVarB2;
    }

    private final void k(AbstractC1987j.b bVar) {
        if (this.f24364d == bVar) {
            return;
        }
        AbstractC1996t.a((InterfaceC1994q) this.f24365e.get(), this.f24364d, bVar);
        this.f24364d = bVar;
        if (this.f24367g || this.f24366f != 0) {
            this.f24368h = true;
            return;
        }
        this.f24367g = true;
        o();
        this.f24367g = false;
        if (this.f24364d == AbstractC1987j.b.DESTROYED) {
            this.f24363c = new p269p.a();
        }
    }

    private final void l() {
        ArrayList arrayList = this.f24369i;
        arrayList.remove(arrayList.size() - 1);
    }

    private final void m(AbstractC1987j.b bVar) {
        this.f24369i.add(bVar);
    }

    private final void o() {
        InterfaceC1994q interfaceC1994q = (InterfaceC1994q) this.f24365e.get();
        if (interfaceC1994q == null) {
            throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
        }
        while (!j()) {
            this.f24368h = false;
            AbstractC1987j.b bVar = this.f24364d;
            Map.Entry entryA = this.f24363c.a();
            Intrinsics.c(entryA);
            if (bVar.compareTo(((b) entryA.getValue()).b()) < 0) {
                e(interfaceC1994q);
            }
            Map.Entry entryG = this.f24363c.g();
            if (!this.f24368h && entryG != null && this.f24364d.compareTo(((b) entryG.getValue()).b()) > 0) {
                h(interfaceC1994q);
            }
        }
        this.f24368h = false;
        this.f24370j.setValue(b());
    }

    @Override // androidx.lifecycle.AbstractC1987j
    public void a(InterfaceC1993p observer) {
        InterfaceC1994q interfaceC1994q;
        Intrinsics.checkNotNullParameter(observer, "observer");
        g("addObserver");
        AbstractC1987j.b bVar = this.f24364d;
        AbstractC1987j.b bVar2 = AbstractC1987j.b.DESTROYED;
        if (bVar != bVar2) {
            bVar2 = AbstractC1987j.b.INITIALIZED;
        }
        b bVar3 = new b(observer, bVar2);
        if (((b) this.f24363c.i(observer, bVar3)) == null && (interfaceC1994q = (InterfaceC1994q) this.f24365e.get()) != null) {
            boolean z10 = this.f24366f != 0 || this.f24367g;
            AbstractC1987j.b bVarF = f(observer);
            this.f24366f++;
            while (bVar3.b().compareTo(bVarF) < 0 && this.f24363c.contains(observer)) {
                m(bVar3.b());
                AbstractC1987j.a aVarB = AbstractC1987j.a.Companion.b(bVar3.b());
                if (aVarB == null) {
                    throw new IllegalStateException("no event up from " + bVar3.b());
                }
                bVar3.a(interfaceC1994q, aVarB);
                l();
                bVarF = f(observer);
            }
            if (!z10) {
                o();
            }
            this.f24366f--;
        }
    }

    @Override // androidx.lifecycle.AbstractC1987j
    public AbstractC1987j.b b() {
        return this.f24364d;
    }

    @Override // androidx.lifecycle.AbstractC1987j
    public void d(InterfaceC1993p observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        g("removeObserver");
        this.f24363c.j(observer);
    }

    public void i(AbstractC1987j.a event) {
        Intrinsics.checkNotNullParameter(event, "event");
        g("handleLifecycleEvent");
        k(event.g());
    }

    public void n(AbstractC1987j.b state) {
        Intrinsics.checkNotNullParameter(state, "state");
        g("setCurrentState");
        k(state);
    }
}
