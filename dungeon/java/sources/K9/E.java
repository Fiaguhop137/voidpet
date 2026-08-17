package K9;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
final class E implements InterfaceC1136d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Set f6067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set f6068b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set f6069c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Set f6070d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Set f6071e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Set f6072f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final InterfaceC1136d f6073g;

    private static class a implements T9.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Set f6074a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final T9.c f6075b;

        public a(Set set, T9.c cVar) {
            this.f6074a = set;
            this.f6075b = cVar;
        }

        @Override // T9.c
        public void c(T9.a aVar) {
            if (!this.f6074a.contains(aVar.b())) {
                throw new s(String.format("Attempting to publish an undeclared event %s.", aVar));
            }
            this.f6075b.c(aVar);
        }
    }

    E(C1135c c1135c, InterfaceC1136d interfaceC1136d) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (q qVar : c1135c.g()) {
            if (qVar.d()) {
                if (qVar.f()) {
                    hashSet4.add(qVar.b());
                } else {
                    hashSet.add(qVar.b());
                }
            } else if (qVar.c()) {
                hashSet3.add(qVar.b());
            } else if (qVar.f()) {
                hashSet5.add(qVar.b());
            } else {
                hashSet2.add(qVar.b());
            }
        }
        if (!c1135c.k().isEmpty()) {
            hashSet.add(D.b(T9.c.class));
        }
        this.f6067a = Collections.unmodifiableSet(hashSet);
        this.f6068b = Collections.unmodifiableSet(hashSet2);
        this.f6069c = Collections.unmodifiableSet(hashSet3);
        this.f6070d = Collections.unmodifiableSet(hashSet4);
        this.f6071e = Collections.unmodifiableSet(hashSet5);
        this.f6072f = c1135c.k();
        this.f6073g = interfaceC1136d;
    }

    @Override // K9.InterfaceC1136d
    public Object a(Class cls) {
        if (!this.f6067a.contains(D.b(cls))) {
            throw new s(String.format("Attempting to request an undeclared dependency %s.", cls));
        }
        Object objA = this.f6073g.a(cls);
        return !cls.equals(T9.c.class) ? objA : new a(this.f6072f, (T9.c) objA);
    }

    @Override // K9.InterfaceC1136d
    public Set b(D d10) {
        if (this.f6070d.contains(d10)) {
            return this.f6073g.b(d10);
        }
        throw new s(String.format("Attempting to request an undeclared dependency Set<%s>.", d10));
    }

    @Override // K9.InterfaceC1136d
    public W9.b c(D d10) {
        if (this.f6071e.contains(d10)) {
            return this.f6073g.c(d10);
        }
        throw new s(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", d10));
    }

    @Override // K9.InterfaceC1136d
    public W9.b d(D d10) {
        if (this.f6068b.contains(d10)) {
            return this.f6073g.d(d10);
        }
        throw new s(String.format("Attempting to request an undeclared dependency Provider<%s>.", d10));
    }

    @Override // K9.InterfaceC1136d
    public Object e(D d10) {
        if (this.f6067a.contains(d10)) {
            return this.f6073g.e(d10);
        }
        throw new s(String.format("Attempting to request an undeclared dependency %s.", d10));
    }

    @Override // K9.InterfaceC1136d
    public W9.b g(Class cls) {
        return d(D.b(cls));
    }
}
