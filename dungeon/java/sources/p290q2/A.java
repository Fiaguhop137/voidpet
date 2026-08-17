package p290q2;

import java.util.List;
import p254o2.e;
import p254o2.n;

/* JADX INFO: loaded from: classes.dex */
public abstract class A implements y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final y f51211a;

    public A(y yVar) {
        this.f51211a = yVar;
    }

    @Override // p290q2.y
    public boolean a(int i10, long j10) {
        return this.f51211a.a(i10, j10);
    }

    @Override // p290q2.y
    public int b() {
        return this.f51211a.b();
    }

    @Override // p290q2.C
    public int d(int i10) {
        return this.f51211a.d(i10);
    }

    @Override // p290q2.y
    public void disable() {
        this.f51211a.disable();
    }

    @Override // p290q2.y
    public boolean e(long j10, e eVar, List list) {
        return this.f51211a.e(j10, eVar, list);
    }

    @Override // p290q2.y
    public void enable() {
        this.f51211a.enable();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof A) {
            return this.f51211a.equals(((A) obj).f51211a);
        }
        return false;
    }

    @Override // p290q2.y
    public boolean f(int i10, long j10) {
        return this.f51211a.f(i10, j10);
    }

    @Override // p290q2.y
    public void g(float f10) {
        this.f51211a.g(f10);
    }

    @Override // p290q2.y
    public Object h() {
        return this.f51211a.h();
    }

    public int hashCode() {
        return this.f51211a.hashCode();
    }

    @Override // p290q2.y
    public void i() {
        this.f51211a.i();
    }

    @Override // p290q2.C
    public int j(int i10) {
        return this.f51211a.j(i10);
    }

    @Override // p290q2.y
    public void l(long j10, long j11, long j12, List list, n[] nVarArr) {
        this.f51211a.l(j10, j11, j12, list, nVarArr);
    }

    @Override // p290q2.C
    public int length() {
        return this.f51211a.length();
    }

    @Override // p290q2.y
    public void m(boolean z10) {
        this.f51211a.m(z10);
    }

    @Override // p290q2.y
    public int n(long j10, List list) {
        return this.f51211a.n(j10, list);
    }

    @Override // p290q2.y
    public int o() {
        return this.f51211a.o();
    }

    @Override // p290q2.y
    public int q() {
        return this.f51211a.q();
    }

    @Override // p290q2.y
    public void s() {
        this.f51211a.s();
    }

    public y t() {
        return this.f51211a;
    }
}
