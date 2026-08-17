package Ag;

import Pf.C1328t;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.TreeMap;

/* JADX INFO: renamed from: Ag.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0796a implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private transient k f378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f379b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f380c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f381d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private u f382e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private List f383f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Map f384g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Stack f385h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Map f386i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f387j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f388k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private transient int f389l;

    C0796a(C0796a c0796a) {
        this.f378a = new k(c0796a.f378a.d());
        this.f379b = c0796a.f379b;
        this.f381d = c0796a.f381d;
        this.f382e = c0796a.f382e;
        ArrayList arrayList = new ArrayList();
        this.f383f = arrayList;
        arrayList.addAll(c0796a.f383f);
        this.f384g = new TreeMap();
        for (Integer num : c0796a.f384g.keySet()) {
            this.f384g.put(num, (LinkedList) ((LinkedList) c0796a.f384g.get(num)).clone());
        }
        Stack stack = new Stack();
        this.f385h = stack;
        stack.addAll(c0796a.f385h);
        this.f380c = new ArrayList();
        Iterator it = c0796a.f380c.iterator();
        while (it.hasNext()) {
            this.f380c.add(((c) it.next()).clone());
        }
        this.f386i = new TreeMap(c0796a.f386i);
        this.f387j = c0796a.f387j;
        this.f389l = c0796a.f389l;
        this.f388k = c0796a.f388k;
    }

    private C0796a(C0796a c0796a, C1328t c1328t) {
        this.f378a = new k(new m(c1328t));
        this.f379b = c0796a.f379b;
        this.f381d = c0796a.f381d;
        this.f382e = c0796a.f382e;
        ArrayList arrayList = new ArrayList();
        this.f383f = arrayList;
        arrayList.addAll(c0796a.f383f);
        this.f384g = new TreeMap();
        for (Integer num : c0796a.f384g.keySet()) {
            this.f384g.put(num, (LinkedList) ((LinkedList) c0796a.f384g.get(num)).clone());
        }
        Stack stack = new Stack();
        this.f385h = stack;
        stack.addAll(c0796a.f385h);
        this.f380c = new ArrayList();
        Iterator it = c0796a.f380c.iterator();
        while (it.hasNext()) {
            this.f380c.add(((c) it.next()).clone());
        }
        this.f386i = new TreeMap(c0796a.f386i);
        this.f387j = c0796a.f387j;
        this.f389l = c0796a.f389l;
        this.f388k = c0796a.f388k;
        g();
    }

    private C0796a(C0796a c0796a, byte[] bArr, byte[] bArr2, j jVar) {
        this.f378a = new k(c0796a.f378a.d());
        this.f379b = c0796a.f379b;
        this.f381d = c0796a.f381d;
        this.f382e = c0796a.f382e;
        ArrayList arrayList = new ArrayList();
        this.f383f = arrayList;
        arrayList.addAll(c0796a.f383f);
        this.f384g = new TreeMap();
        for (Integer num : c0796a.f384g.keySet()) {
            this.f384g.put(num, (LinkedList) ((LinkedList) c0796a.f384g.get(num)).clone());
        }
        Stack stack = new Stack();
        this.f385h = stack;
        stack.addAll(c0796a.f385h);
        this.f380c = new ArrayList();
        Iterator it = c0796a.f380c.iterator();
        while (it.hasNext()) {
            this.f380c.add(((c) it.next()).clone());
        }
        this.f386i = new TreeMap(c0796a.f386i);
        this.f387j = c0796a.f387j;
        this.f389l = c0796a.f389l;
        this.f388k = false;
        f(bArr, bArr2, jVar);
    }

    private C0796a(k kVar, int i10, int i11, int i12) {
        this.f378a = kVar;
        this.f379b = i10;
        this.f389l = i12;
        this.f381d = i11;
        if (i11 <= i10 && i11 >= 2) {
            int i13 = i10 - i11;
            if (i13 % 2 == 0) {
                this.f383f = new ArrayList();
                this.f384g = new TreeMap();
                this.f385h = new Stack();
                this.f380c = new ArrayList();
                for (int i14 = 0; i14 < i13; i14++) {
                    this.f380c.add(new c(i14));
                }
                this.f386i = new TreeMap();
                this.f387j = 0;
                this.f388k = false;
                return;
            }
        }
        throw new IllegalArgumentException("illegal value for BDS parameter k");
    }

    C0796a(x xVar, int i10, int i11) {
        this(xVar.i(), xVar.b(), xVar.c(), i11);
        this.f389l = i10;
        this.f387j = i11;
        this.f388k = true;
    }

    C0796a(x xVar, byte[] bArr, byte[] bArr2, j jVar) {
        this(xVar.i(), xVar.b(), xVar.c(), (1 << xVar.b()) - 1);
        e(bArr, bArr2, jVar);
    }

    C0796a(x xVar, byte[] bArr, byte[] bArr2, j jVar, int i10) {
        this(xVar.i(), xVar.b(), xVar.c(), (1 << xVar.b()) - 1);
        e(bArr, bArr2, jVar);
        while (this.f387j < i10) {
            f(bArr, bArr2, jVar);
            this.f388k = false;
        }
    }

    private c a() {
        c cVar = null;
        for (c cVar2 : this.f380c) {
            if (!cVar2.g() && cVar2.h() && (cVar == null || cVar2.c() < cVar.c() || (cVar2.c() == cVar.c() && cVar2.d() < cVar.d()))) {
                cVar = cVar2;
            }
        }
        return cVar;
    }

    private void e(byte[] bArr, byte[] bArr2, j jVar) {
        if (jVar == null) {
            throw new NullPointerException("otsHashAddress == null");
        }
        i iVar = (i) ((i.b) ((i.b) new i.b().g(jVar.b())).h(jVar.c())).l();
        g gVar = (g) ((g.b) ((g.b) new g.b().g(jVar.b())).h(jVar.c())).k();
        for (int i10 = 0; i10 < (1 << this.f379b); i10++) {
            jVar = (j) ((j.b) ((j.b) ((j.b) new j.b().g(jVar.b())).h(jVar.c())).p(i10).n(jVar.e()).o(jVar.f()).f(jVar.a())).l();
            k kVar = this.f378a;
            kVar.h(kVar.g(bArr2, jVar), bArr);
            n nVarE = this.f378a.e(jVar);
            iVar = (i) ((i.b) ((i.b) ((i.b) new i.b().g(iVar.b())).h(iVar.c())).n(i10).o(iVar.f()).p(iVar.g()).f(iVar.a())).l();
            u uVarA = v.a(this.f378a, nVarE, iVar);
            gVar = (g) ((g.b) ((g.b) ((g.b) new g.b().g(gVar.b())).h(gVar.c())).n(i10).f(gVar.a())).k();
            while (!this.f385h.isEmpty() && ((u) this.f385h.peek()).a() == uVarA.a()) {
                int iA = i10 / (1 << uVarA.a());
                if (iA == 1) {
                    this.f383f.add(uVarA);
                }
                if (iA == 3 && uVarA.a() < this.f379b - this.f381d) {
                    ((c) this.f380c.get(uVarA.a())).j(uVarA);
                }
                if (iA >= 3 && (iA & 1) == 1 && uVarA.a() >= this.f379b - this.f381d && uVarA.a() <= this.f379b - 2) {
                    if (this.f384g.get(Integer.valueOf(uVarA.a())) == null) {
                        LinkedList linkedList = new LinkedList();
                        linkedList.add(uVarA);
                        this.f384g.put(Integer.valueOf(uVarA.a()), linkedList);
                    } else {
                        ((LinkedList) this.f384g.get(Integer.valueOf(uVarA.a()))).add(uVarA);
                    }
                }
                g gVar2 = (g) ((g.b) ((g.b) ((g.b) new g.b().g(gVar.b())).h(gVar.c())).m(gVar.e()).n((gVar.f() - 1) / 2).f(gVar.a())).k();
                u uVarB = v.b(this.f378a, (u) this.f385h.pop(), uVarA, gVar2);
                u uVar = new u(uVarB.a() + 1, uVarB.b());
                gVar = (g) ((g.b) ((g.b) ((g.b) new g.b().g(gVar2.b())).h(gVar2.c())).m(gVar2.e() + 1).n(gVar2.f()).f(gVar2.a())).k();
                uVarA = uVar;
            }
            this.f385h.push(uVarA);
        }
        this.f382e = (u) this.f385h.pop();
    }

    private void f(byte[] bArr, byte[] bArr2, j jVar) {
        List list;
        Object objRemoveFirst;
        byte[] bArr3;
        byte[] bArr4;
        if (jVar == null) {
            throw new NullPointerException("otsHashAddress == null");
        }
        if (this.f388k) {
            throw new IllegalStateException("index already used");
        }
        int i10 = this.f387j;
        if (i10 > this.f389l - 1) {
            throw new IllegalStateException("index out of bounds");
        }
        int iB = A.b(i10, this.f379b);
        if (((this.f387j >> (iB + 1)) & 1) == 0 && iB < this.f379b - 1) {
            this.f386i.put(Integer.valueOf(iB), this.f383f.get(iB));
        }
        i iVar = (i) ((i.b) ((i.b) new i.b().g(jVar.b())).h(jVar.c())).l();
        g gVar = (g) ((g.b) ((g.b) new g.b().g(jVar.b())).h(jVar.c())).k();
        int i11 = 0;
        if (iB == 0) {
            jVar = (j) ((j.b) ((j.b) ((j.b) new j.b().g(jVar.b())).h(jVar.c())).p(this.f387j).n(jVar.e()).o(jVar.f()).f(jVar.a())).l();
            k kVar = this.f378a;
            kVar.h(kVar.g(bArr2, jVar), bArr);
            this.f383f.set(0, v.a(this.f378a, this.f378a.e(jVar), (i) ((i.b) ((i.b) ((i.b) new i.b().g(iVar.b())).h(iVar.c())).n(this.f387j).o(iVar.f()).p(iVar.g()).f(iVar.a())).l()));
        } else {
            int i12 = iB - 1;
            g gVar2 = (g) ((g.b) ((g.b) ((g.b) new g.b().g(gVar.b())).h(gVar.c())).m(i12).n(this.f387j >> iB).f(gVar.a())).k();
            k kVar2 = this.f378a;
            kVar2.h(kVar2.g(bArr2, jVar), bArr);
            u uVarB = v.b(this.f378a, (u) this.f383f.get(i12), (u) this.f386i.get(Integer.valueOf(i12)), gVar2);
            this.f383f.set(iB, new u(uVarB.a() + 1, uVarB.b()));
            this.f386i.remove(Integer.valueOf(i12));
            for (int i13 = 0; i13 < iB; i13++) {
                if (i13 < this.f379b - this.f381d) {
                    list = this.f383f;
                    objRemoveFirst = ((c) this.f380c.get(i13)).e();
                } else {
                    list = this.f383f;
                    objRemoveFirst = ((LinkedList) this.f384g.get(Integer.valueOf(i13))).removeFirst();
                }
                list.set(i13, objRemoveFirst);
            }
            int iMin = Math.min(iB, this.f379b - this.f381d);
            for (int i14 = 0; i14 < iMin; i14++) {
                int i15 = this.f387j + 1 + ((1 << i14) * 3);
                if (i15 < (1 << this.f379b)) {
                    ((c) this.f380c.get(i14)).f(i15);
                }
            }
        }
        j jVar2 = jVar;
        while (i11 < ((this.f379b - this.f381d) >> 1)) {
            c cVarA = a();
            if (cVarA != null) {
                bArr3 = bArr;
                bArr4 = bArr2;
                cVarA.l(this.f385h, this.f378a, bArr3, bArr4, jVar2);
            } else {
                bArr3 = bArr;
                bArr4 = bArr2;
            }
            i11++;
            bArr = bArr3;
            bArr2 = bArr4;
        }
        this.f387j++;
    }

    private void g() {
        if (this.f383f == null) {
            throw new IllegalStateException("authenticationPath == null");
        }
        if (this.f384g == null) {
            throw new IllegalStateException("retain == null");
        }
        if (this.f385h == null) {
            throw new IllegalStateException("stack == null");
        }
        if (this.f380c == null) {
            throw new IllegalStateException("treeHashInstances == null");
        }
        if (this.f386i == null) {
            throw new IllegalStateException("keep == null");
        }
        if (!A.l(this.f379b, this.f387j)) {
            throw new IllegalStateException("index in BDS state out of bounds");
        }
    }

    protected int b() {
        return this.f387j;
    }

    public int c() {
        return this.f389l;
    }

    public C0796a d(byte[] bArr, byte[] bArr2, j jVar) {
        return new C0796a(this, bArr, bArr2, jVar);
    }

    public C0796a h(C1328t c1328t) {
        return new C0796a(this, c1328t);
    }
}
