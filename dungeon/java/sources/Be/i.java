package Be;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public abstract class i extends Be.a implements Serializable {

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f745a;

        static {
            int[] iArr = new int[y.c.values().length];
            f745a = iArr;
            try {
                iArr[y.c.MESSAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f745a[y.c.ENUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static abstract class b extends Be.a.AbstractC0017a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Be.d f746a = Be.d.f710a;

        protected b() {
        }

        public final Be.d d() {
            return this.f746a;
        }

        public abstract b e(i iVar);

        public final b f(Be.d dVar) {
            this.f746a = dVar;
            return this;
        }
    }

    public static abstract class c extends b implements q {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private h f747b = h.g();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f748c;

        protected c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public h h() {
            this.f747b.q();
            this.f748c = false;
            return this.f747b;
        }

        private void j() {
            if (this.f748c) {
                return;
            }
            this.f747b = this.f747b.clone();
            this.f748c = true;
        }

        protected final void l(d dVar) {
            j();
            this.f747b.r(dVar.f749b);
        }
    }

    public static abstract class d extends i implements q {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final h f749b;

        protected class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final Iterator f750a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private Map.Entry f751b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final boolean f752c;

            private a(boolean z10) {
                Iterator itP = d.this.f749b.p();
                this.f750a = itP;
                if (itP.hasNext()) {
                    this.f751b = (Map.Entry) itP.next();
                }
                this.f752c = z10;
            }

            /* synthetic */ a(d dVar, boolean z10, a aVar) {
                this(z10);
            }

            public void a(int i10, Be.f fVar) {
                while (true) {
                    Map.Entry entry = this.f751b;
                    if (entry == null || ((e) entry.getKey()).getNumber() >= i10) {
                        return;
                    }
                    e eVar = (e) this.f751b.getKey();
                    if (this.f752c && eVar.l() == y.c.MESSAGE && !eVar.f()) {
                        fVar.e0(eVar.getNumber(), (p) this.f751b.getValue());
                    } else {
                        h.z(eVar, this.f751b.getValue(), fVar);
                    }
                    if (this.f750a.hasNext()) {
                        this.f751b = (Map.Entry) this.f750a.next();
                    } else {
                        this.f751b = null;
                    }
                }
            }
        }

        protected d() {
            this.f749b = h.t();
        }

        protected d(c cVar) {
            this.f749b = cVar.h();
        }

        private void t(f fVar) {
            if (fVar.b() != getDefaultInstanceForType()) {
                throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
            }
        }

        @Override // Be.i
        protected void g() {
            this.f749b.q();
        }

        @Override // Be.i
        protected boolean j(Be.e eVar, Be.f fVar, g gVar, int i10) {
            return i.k(this.f749b, getDefaultInstanceForType(), eVar, fVar, gVar, i10);
        }

        protected boolean m() {
            return this.f749b.n();
        }

        protected int n() {
            return this.f749b.k();
        }

        public final Object o(f fVar) {
            t(fVar);
            Object objH = this.f749b.h(fVar.f762d);
            return objH == null ? fVar.f760b : fVar.a(objH);
        }

        public final Object p(f fVar, int i10) {
            t(fVar);
            return fVar.e(this.f749b.i(fVar.f762d, i10));
        }

        public final int q(f fVar) {
            t(fVar);
            return this.f749b.j(fVar.f762d);
        }

        public final boolean r(f fVar) {
            t(fVar);
            return this.f749b.m(fVar.f762d);
        }

        protected a s() {
            return new a(this, false, null);
        }
    }

    static final class e implements h.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final j.b f754a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f755b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final y.b f756c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final boolean f757d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final boolean f758e;

        e(j.b bVar, int i10, y.b bVar2, boolean z10, boolean z11) {
            this.f754a = bVar;
            this.f755b = i10;
            this.f756c = bVar2;
            this.f757d = z10;
            this.f758e = z11;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public int compareTo(e eVar) {
            return this.f755b - eVar.f755b;
        }

        @Override // Be.h.b
        public boolean f() {
            return this.f757d;
        }

        public j.b g() {
            return this.f754a;
        }

        @Override // Be.h.b
        public int getNumber() {
            return this.f755b;
        }

        @Override // Be.h.b
        public y.b j() {
            return this.f756c;
        }

        @Override // Be.h.b
        public boolean k() {
            return this.f758e;
        }

        @Override // Be.h.b
        public y.c l() {
            return this.f756c.e();
        }

        @Override // Be.h.b
        public p.a n(p.a aVar, p pVar) {
            return ((b) aVar).e((i) pVar);
        }
    }

    public static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final p f759a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Object f760b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final p f761c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final e f762d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final Class f763e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final Method f764f;

        f(p pVar, Object obj, p pVar2, e eVar, Class cls) {
            if (pVar == null) {
                throw new IllegalArgumentException("Null containingTypeDefaultInstance");
            }
            if (eVar.j() == y.b.f826m && pVar2 == null) {
                throw new IllegalArgumentException("Null messageDefaultInstance");
            }
            this.f759a = pVar;
            this.f760b = obj;
            this.f761c = pVar2;
            this.f762d = eVar;
            this.f763e = cls;
            if (j.a.class.isAssignableFrom(cls)) {
                this.f764f = i.e(cls, "valueOf", Integer.TYPE);
            } else {
                this.f764f = null;
            }
        }

        Object a(Object obj) {
            if (!this.f762d.f()) {
                return e(obj);
            }
            if (this.f762d.l() != y.c.ENUM) {
                return obj;
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                arrayList.add(e(it.next()));
            }
            return arrayList;
        }

        public p b() {
            return this.f759a;
        }

        public p c() {
            return this.f761c;
        }

        public int d() {
            return this.f762d.getNumber();
        }

        Object e(Object obj) {
            return this.f762d.l() == y.c.ENUM ? i.f(this.f764f, null, (Integer) obj) : obj;
        }

        Object f(Object obj) {
            return this.f762d.l() == y.c.ENUM ? Integer.valueOf(((j.a) obj).getNumber()) : obj;
        }
    }

    protected i() {
    }

    protected i(b bVar) {
    }

    static Method e(Class cls, String str, Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e10) {
            String name = cls.getName();
            String strValueOf = String.valueOf(str);
            StringBuilder sb2 = new StringBuilder(name.length() + 45 + strValueOf.length());
            sb2.append("Generated message class \"");
            sb2.append(name);
            sb2.append("\" missing method \"");
            sb2.append(strValueOf);
            sb2.append("\".");
            throw new RuntimeException(sb2.toString(), e10);
        }
    }

    static Object f(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e10);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static f h(p pVar, p pVar2, j.b bVar, int i10, y.b bVar2, boolean z10, Class cls) {
        return new f(pVar, Collections.EMPTY_LIST, pVar2, new e(bVar, i10, bVar2, true, z10), cls);
    }

    public static f i(p pVar, Object obj, p pVar2, j.b bVar, int i10, y.b bVar2, Class cls) {
        return new f(pVar, obj, pVar2, new e(bVar, i10, bVar2, false, false), cls);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:4:0x0010  */
    public static boolean k(h hVar, p pVar, Be.e eVar, Be.f fVar, g gVar, int i10) throws k {
        boolean z10;
        boolean z11;
        Object objBuild;
        p pVar2;
        int iB = y.b(i10);
        f fVarB = gVar.b(pVar, y.a(i10));
        if (fVarB == null) {
            z11 = true;
            z10 = false;
        } else if (iB == h.l(fVarB.f762d.j(), false)) {
            z11 = false;
            z10 = false;
        } else {
            e eVar2 = fVarB.f762d;
            if (eVar2.f757d && eVar2.f756c.h() && iB == h.l(fVarB.f762d.j(), true)) {
                z10 = true;
                z11 = false;
            } else {
                z11 = true;
                z10 = false;
            }
        }
        if (z11) {
            return eVar.O(i10, fVar);
        }
        if (z10) {
            int i11 = eVar.i(eVar.z());
            if (fVarB.f762d.j() == y.b.f829p) {
                while (eVar.e() > 0) {
                    j.a aVarA = fVarB.f762d.g().a(eVar.m());
                    if (aVarA == null) {
                        return true;
                    }
                    hVar.a(fVarB.f762d, fVarB.f(aVarA));
                }
            } else {
                while (eVar.e() > 0) {
                    hVar.a(fVarB.f762d, h.u(eVar, fVarB.f762d.j(), false));
                }
            }
            eVar.h(i11);
        } else {
            int i12 = a.f745a[fVarB.f762d.l().ordinal()];
            if (i12 == 1) {
                p.a builder = (fVarB.f762d.f() || (pVar2 = (p) hVar.h(fVarB.f762d)) == null) ? null : pVar2.toBuilder();
                if (builder == null) {
                    builder = fVarB.c().newBuilderForType();
                }
                if (fVarB.f762d.j() == y.b.f825l) {
                    eVar.q(fVarB.d(), builder, gVar);
                } else {
                    eVar.u(builder, gVar);
                }
                objBuild = builder.build();
            } else if (i12 != 2) {
                objBuild = h.u(eVar, fVarB.f762d.j(), false);
            } else {
                int iM = eVar.m();
                j.a aVarA2 = fVarB.f762d.g().a(iM);
                if (aVarA2 == null) {
                    fVar.n0(i10);
                    fVar.x0(iM);
                    return true;
                }
                objBuild = aVarA2;
            }
            if (fVarB.f762d.f()) {
                hVar.a(fVarB.f762d, fVarB.f(objBuild));
            } else {
                hVar.v(fVarB.f762d, fVarB.f(objBuild));
            }
        }
        return true;
    }

    protected void g() {
    }

    protected boolean j(Be.e eVar, Be.f fVar, g gVar, int i10) {
        return eVar.O(i10, fVar);
    }
}
