package K9;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: K9.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1135c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f6078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set f6079b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set f6080c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f6081d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f6082e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final g f6083f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Set f6084g;

    /* JADX INFO: renamed from: K9.c$b */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f6085a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Set f6086b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Set f6087c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f6088d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f6089e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private g f6090f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final Set f6091g;

        private b(D d10, D... dArr) {
            this.f6085a = null;
            HashSet hashSet = new HashSet();
            this.f6086b = hashSet;
            this.f6087c = new HashSet();
            this.f6088d = 0;
            this.f6089e = 0;
            this.f6091g = new HashSet();
            C.c(d10, "Null interface");
            hashSet.add(d10);
            for (D d11 : dArr) {
                C.c(d11, "Null interface");
            }
            Collections.addAll(this.f6086b, dArr);
        }

        /* synthetic */ b(D d10, D[] dArr, a aVar) {
            this(d10, dArr);
        }

        private b(Class cls, Class... clsArr) {
            this.f6085a = null;
            HashSet hashSet = new HashSet();
            this.f6086b = hashSet;
            this.f6087c = new HashSet();
            this.f6088d = 0;
            this.f6089e = 0;
            this.f6091g = new HashSet();
            C.c(cls, "Null interface");
            hashSet.add(D.b(cls));
            for (Class cls2 : clsArr) {
                C.c(cls2, "Null interface");
                this.f6086b.add(D.b(cls2));
            }
        }

        /* synthetic */ b(Class cls, Class[] clsArr, a aVar) {
            this(cls, clsArr);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public b g() {
            this.f6089e = 1;
            return this;
        }

        private b i(int i10) {
            C.d(this.f6088d == 0, "Instantiation type has already been set.");
            this.f6088d = i10;
            return this;
        }

        private void j(D d10) {
            C.a(!this.f6086b.contains(d10), "Components are not allowed to depend on interfaces they themselves provide.");
        }

        public b b(q qVar) {
            C.c(qVar, "Null dependency");
            j(qVar.b());
            this.f6087c.add(qVar);
            return this;
        }

        public b c() {
            return i(1);
        }

        public C1135c d() {
            C.d(this.f6090f != null, "Missing required property: factory.");
            return new C1135c(this.f6085a, new HashSet(this.f6086b), new HashSet(this.f6087c), this.f6088d, this.f6089e, this.f6090f, this.f6091g, null);
        }

        public b e() {
            return i(2);
        }

        public b f(g gVar) {
            this.f6090f = (g) C.c(gVar, "Null factory");
            return this;
        }

        public b h(String str) {
            this.f6085a = str;
            return this;
        }
    }

    private C1135c(String str, Set set, Set set2, int i10, int i11, g gVar, Set set3) {
        this.f6078a = str;
        this.f6079b = Collections.unmodifiableSet(set);
        this.f6080c = Collections.unmodifiableSet(set2);
        this.f6081d = i10;
        this.f6082e = i11;
        this.f6083f = gVar;
        this.f6084g = Collections.unmodifiableSet(set3);
    }

    /* synthetic */ C1135c(String str, Set set, Set set2, int i10, int i11, g gVar, Set set3, a aVar) {
        this(str, set, set2, i10, i11, gVar, set3);
    }

    public static /* synthetic */ Object a(Object obj, InterfaceC1136d interfaceC1136d) {
        return obj;
    }

    public static /* synthetic */ Object b(Object obj, InterfaceC1136d interfaceC1136d) {
        return obj;
    }

    public static b c(D d10) {
        return new b(d10, new D[0], (a) null);
    }

    public static b d(D d10, D... dArr) {
        return new b(d10, dArr, (a) null);
    }

    public static b e(Class cls) {
        return new b(cls, new Class[0], (a) null);
    }

    public static b f(Class cls, Class... clsArr) {
        return new b(cls, clsArr, (a) null);
    }

    public static C1135c l(Object obj, Class cls) {
        return m(cls).f(new C1133a(obj)).d();
    }

    public static b m(Class cls) {
        return e(cls).g();
    }

    public static C1135c q(Object obj, Class cls, Class... clsArr) {
        return f(cls, clsArr).f(new C1134b(obj)).d();
    }

    public Set g() {
        return this.f6080c;
    }

    public g h() {
        return this.f6083f;
    }

    public String i() {
        return this.f6078a;
    }

    public Set j() {
        return this.f6079b;
    }

    public Set k() {
        return this.f6084g;
    }

    public boolean n() {
        return this.f6081d == 1;
    }

    public boolean o() {
        return this.f6081d == 2;
    }

    public boolean p() {
        return this.f6082e == 0;
    }

    public C1135c r(g gVar) {
        return new C1135c(this.f6078a, this.f6079b, this.f6080c, this.f6081d, this.f6082e, gVar, this.f6084g);
    }

    public String toString() {
        return "Component<" + Arrays.toString(this.f6079b.toArray()) + ">{" + this.f6081d + ", type=" + this.f6082e + ", deps=" + Arrays.toString(this.f6080c.toArray()) + "}";
    }
}
