package p254o2;

import R1.r;
import U1.AbstractC1459a;
import W1.f;
import W1.j;

/* JADX INFO: loaded from: classes.dex */
public abstract class a extends m {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f50319k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f50320l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private c f50321m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int[] f50322n;

    public a(f fVar, j jVar, r rVar, int i10, Object obj, long j10, long j11, long j12, long j13, long j14) {
        super(fVar, jVar, rVar, i10, obj, j10, j11, j14);
        this.f50319k = j12;
        this.f50320l = j13;
    }

    public final int i(int i10) {
        return ((int[]) AbstractC1459a.i(this.f50322n))[i10];
    }

    protected final c j() {
        return (c) AbstractC1459a.i(this.f50321m);
    }

    public void k(c cVar) {
        this.f50321m = cVar;
        this.f50322n = cVar.a();
    }
}
