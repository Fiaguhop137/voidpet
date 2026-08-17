package C;

import O0.t;
import p019b0.k;
import p037c0.k0;
import p037c0.x0;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f1055a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f1056b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f1057c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final b f1058d;

    public a(b bVar, b bVar2, b bVar3, b bVar4) {
        this.f1055a = bVar;
        this.f1056b = bVar2;
        this.f1057c = bVar3;
        this.f1058d = bVar4;
    }

    @Override // p037c0.x0
    public final k0 a(long j10, t tVar, O0.d dVar) {
        float fA = this.f1055a.a(j10, dVar);
        float fA2 = this.f1056b.a(j10, dVar);
        float fA3 = this.f1057c.a(j10, dVar);
        float fA4 = this.f1058d.a(j10, dVar);
        float fH = k.h(j10);
        float f10 = fA + fA4;
        if (f10 > fH) {
            float f11 = fH / f10;
            fA *= f11;
            fA4 *= f11;
        }
        float f12 = fA2 + fA3;
        if (f12 > fH) {
            float f13 = fH / f12;
            fA2 *= f13;
            fA3 *= f13;
        }
        if (!(fA >= 0.0f && fA2 >= 0.0f && fA3 >= 0.0f && fA4 >= 0.0f)) {
            p449z.a.a("Corner size in Px can't be negative(topStart = " + fA + ", topEnd = " + fA2 + ", bottomEnd = " + fA3 + ", bottomStart = " + fA4 + ")!");
        }
        return d(j10, fA, fA2, fA3, fA4, tVar);
    }

    public final a b(b bVar) {
        return c(bVar, bVar, bVar, bVar);
    }

    public abstract a c(b bVar, b bVar2, b bVar3, b bVar4);

    public abstract k0 d(long j10, float f10, float f11, float f12, float f13, t tVar);

    public final b e() {
        return this.f1057c;
    }

    public final b f() {
        return this.f1058d;
    }

    public final b g() {
        return this.f1056b;
    }

    public final b h() {
        return this.f1055a;
    }
}
