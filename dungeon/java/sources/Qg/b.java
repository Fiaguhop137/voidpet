package Qg;

import Sg.h;
import Sg.i;
import Sg.k;

/* JADX INFO: loaded from: classes3.dex */
public class b extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f9831c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f9832d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Sg.b f9833e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private i f9834f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private h f9835g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Sg.a f9836h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private i[] f9837i;

    public b(int i10, int i11, Sg.b bVar, i iVar, Sg.a aVar, h hVar, String str) {
        super(true, str);
        this.f9831c = i10;
        this.f9832d = i11;
        this.f9833e = bVar;
        this.f9834f = iVar;
        this.f9836h = aVar;
        this.f9835g = hVar;
        this.f9837i = new k(bVar, iVar).c();
    }

    public b(int i10, int i11, Sg.b bVar, i iVar, h hVar, String str) {
        this(i10, i11, bVar, iVar, Sg.c.a(bVar, iVar), hVar, str);
    }

    public Sg.b c() {
        return this.f9833e;
    }

    public i d() {
        return this.f9834f;
    }

    public int e() {
        return this.f9832d;
    }

    public int f() {
        return this.f9831c;
    }

    public h g() {
        return this.f9835g;
    }
}
