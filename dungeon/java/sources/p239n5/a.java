package p239n5;

import I5.j;
import p042c5.b;

/* JADX INFO: loaded from: classes2.dex */
public class a extends p061d6.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f49906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final j f49907b;

    public a(b bVar, j jVar) {
        this.f49906a = bVar;
        this.f49907b = jVar;
    }

    @Override // p061d6.e
    public void b(p133h6.b bVar, String str, Throwable th, boolean z10) {
        this.f49907b.J(this.f49906a.now());
        this.f49907b.I(bVar);
        this.f49907b.P(str);
        this.f49907b.O(z10);
    }

    @Override // p061d6.e
    public void c(p133h6.b bVar, Object obj, String str, boolean z10) {
        this.f49907b.K(this.f49906a.now());
        this.f49907b.I(bVar);
        this.f49907b.y(obj);
        this.f49907b.P(str);
        this.f49907b.O(z10);
    }

    @Override // p061d6.e
    public void g(p133h6.b bVar, String str, boolean z10) {
        this.f49907b.J(this.f49906a.now());
        this.f49907b.I(bVar);
        this.f49907b.P(str);
        this.f49907b.O(z10);
    }

    @Override // p061d6.e
    public void k(String str) {
        this.f49907b.J(this.f49906a.now());
        this.f49907b.P(str);
    }
}
