package com.google.android.gms.internal.auth;

/* JADX INFO: loaded from: classes2.dex */
public abstract class B0 extends AbstractC2354a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C0 f32210a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected C0 f32211b;

    protected B0(C0 c10) {
        this.f32210a = c10;
        if (c10.n()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f32211b = c10.e();
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final B0 clone() {
        B0 b10 = (B0) this.f32210a.o(5, null, null);
        b10.f32211b = a();
        return b10;
    }

    @Override // com.google.android.gms.internal.auth.Y0
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public C0 a() {
        if (!this.f32211b.n()) {
            return this.f32211b;
        }
        this.f32211b.j();
        return this.f32211b;
    }
}
