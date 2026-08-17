package Zf;

import Vf.o;

/* JADX INFO: loaded from: classes3.dex */
public class b extends o implements a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Vf.a f19028b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f19029c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private byte[] f19030d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private byte[] f19031e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private byte[] f19032f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f19033g;

    public b(Vf.a aVar) {
        super(aVar);
        this.f19028b = aVar;
        int iA = aVar.a();
        this.f19029c = iA;
        this.f19030d = new byte[iA];
        this.f19031e = new byte[iA];
        this.f19032f = new byte[iA];
        this.f19033g = 0;
    }

    public static a b(Vf.a aVar) {
        return new b(aVar);
    }

    @Override // Vf.a
    public int a() {
        return this.f19028b.a();
    }
}
