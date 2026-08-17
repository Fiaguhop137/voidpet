package com.android.volley;

/* JADX INFO: loaded from: classes.dex */
public class e implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f27862a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f27863b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f27864c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f27865d;

    public e() {
        this(2500, 1, 1.0f);
    }

    public e(int i10, int i11, float f10) {
        this.f27862a = i10;
        this.f27864c = i11;
        this.f27865d = f10;
    }

    @Override // com.android.volley.r
    public int a() {
        return this.f27863b;
    }

    @Override // com.android.volley.r
    public void b(u uVar) throws u {
        this.f27863b++;
        int i10 = this.f27862a;
        this.f27862a = i10 + ((int) (i10 * this.f27865d));
        if (!d()) {
            throw uVar;
        }
    }

    @Override // com.android.volley.r
    public int c() {
        return this.f27862a;
    }

    protected boolean d() {
        return this.f27863b <= this.f27864c;
    }
}
