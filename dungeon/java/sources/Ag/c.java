package Ag;

import java.io.Serializable;
import java.util.Stack;

/* JADX INFO: loaded from: classes3.dex */
class c implements Serializable, Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private u f392a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f393b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f394c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f395d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f396e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f397f = false;

    c(int i10) {
        this.f393b = i10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public c clone() {
        c cVar = new c(this.f393b);
        cVar.f392a = this.f392a;
        cVar.f394c = this.f394c;
        cVar.f395d = this.f395d;
        cVar.f396e = this.f396e;
        cVar.f397f = this.f397f;
        return cVar;
    }

    int c() {
        if (!this.f396e || this.f397f) {
            return Integer.MAX_VALUE;
        }
        return this.f394c;
    }

    int d() {
        return this.f395d;
    }

    public u e() {
        return this.f392a;
    }

    void f(int i10) {
        this.f392a = null;
        this.f394c = this.f393b;
        this.f395d = i10;
        this.f396e = true;
        this.f397f = false;
    }

    boolean g() {
        return this.f397f;
    }

    boolean h() {
        return this.f396e;
    }

    void j(u uVar) {
        this.f392a = uVar;
        int iA = uVar.a();
        this.f394c = iA;
        if (iA == this.f393b) {
            this.f397f = true;
        }
    }

    void l(Stack stack, k kVar, byte[] bArr, byte[] bArr2, j jVar) {
        if (jVar == null) {
            throw new NullPointerException("otsHashAddress == null");
        }
        if (this.f397f || !this.f396e) {
            throw new IllegalStateException("finished or not initialized");
        }
        j jVar2 = (j) ((j.b) ((j.b) ((j.b) new j.b().g(jVar.b())).h(jVar.c())).p(this.f395d).n(jVar.e()).o(jVar.f()).f(jVar.a())).l();
        i iVar = (i) ((i.b) ((i.b) new i.b().g(jVar2.b())).h(jVar2.c())).n(this.f395d).l();
        g gVar = (g) ((g.b) ((g.b) new g.b().g(jVar2.b())).h(jVar2.c())).n(this.f395d).k();
        kVar.h(kVar.g(bArr2, jVar2), bArr);
        u uVarA = v.a(kVar, kVar.e(jVar2), iVar);
        while (!stack.isEmpty() && ((u) stack.peek()).a() == uVarA.a() && ((u) stack.peek()).a() != this.f393b) {
            g gVar2 = (g) ((g.b) ((g.b) ((g.b) new g.b().g(gVar.b())).h(gVar.c())).m(gVar.e()).n((gVar.f() - 1) / 2).f(gVar.a())).k();
            u uVarB = v.b(kVar, (u) stack.pop(), uVarA, gVar2);
            u uVar = new u(uVarB.a() + 1, uVarB.b());
            gVar = (g) ((g.b) ((g.b) ((g.b) new g.b().g(gVar2.b())).h(gVar2.c())).m(gVar2.e() + 1).n(gVar2.f()).f(gVar2.a())).k();
            uVarA = uVar;
        }
        u uVar2 = this.f392a;
        if (uVar2 == null) {
            this.f392a = uVarA;
        } else if (uVar2.a() == uVarA.a()) {
            g gVar3 = (g) ((g.b) ((g.b) ((g.b) new g.b().g(gVar.b())).h(gVar.c())).m(gVar.e()).n((gVar.f() - 1) / 2).f(gVar.a())).k();
            uVarA = new u(this.f392a.a() + 1, v.b(kVar, this.f392a, uVarA, gVar3).b());
            this.f392a = uVarA;
        } else {
            stack.push(uVarA);
        }
        if (this.f392a.a() == this.f393b) {
            this.f397f = true;
        } else {
            this.f394c = uVarA.a();
            this.f395d++;
        }
    }
}
