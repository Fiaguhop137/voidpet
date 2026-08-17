package androidx.compose.ui.platform;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class T0 implements p324s0.p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f21963a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f21964b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Float f21965c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Float f21966d;

    public T0(int i10, List list, Float f10, Float f11, p450z0.i iVar, p450z0.i iVar2) {
        this.f21963a = i10;
        this.f21964b = list;
        this.f21965c = f10;
        this.f21966d = f11;
    }

    @Override // p324s0.p0
    public boolean G0() {
        return this.f21964b.contains(this);
    }

    public final p450z0.i a() {
        return null;
    }

    public final Float b() {
        return this.f21965c;
    }

    public final Float c() {
        return this.f21966d;
    }

    public final int d() {
        return this.f21963a;
    }

    public final p450z0.i e() {
        return null;
    }

    public final void f(p450z0.i iVar) {
    }

    public final void g(p450z0.i iVar) {
    }
}
