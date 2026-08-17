package S9;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
class i implements P9.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f11594a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f11595b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private P9.c f11596c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final f f11597d;

    i(f fVar) {
        this.f11597d = fVar;
    }

    private void a() {
        if (this.f11594a) {
            throw new P9.b("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f11594a = true;
    }

    void b(P9.c cVar, boolean z10) {
        this.f11594a = false;
        this.f11596c = cVar;
        this.f11595b = z10;
    }

    @Override // P9.g
    public P9.g c(String str) throws IOException {
        a();
        this.f11597d.g(this.f11596c, str, this.f11595b);
        return this;
    }

    @Override // P9.g
    public P9.g d(boolean z10) {
        a();
        this.f11597d.l(this.f11596c, z10, this.f11595b);
        return this;
    }
}
