package C;

import O0.t;
import kotlin.jvm.internal.Intrinsics;
import p019b0.j;
import p019b0.l;
import p037c0.k0;

/* JADX INFO: loaded from: classes.dex */
public final class f extends a {
    public f(b bVar, b bVar2, b bVar3, b bVar4) {
        super(bVar, bVar2, bVar3, bVar4);
    }

    @Override // C.a
    public k0 d(long j10, float f10, float f11, float f12, float f13, t tVar) {
        if (f10 + f11 + f12 + f13 == 0.0f) {
            return new k0.b(l.b(j10));
        }
        p019b0.g gVarB = l.b(j10);
        t tVar2 = t.Ltr;
        float f14 = tVar == tVar2 ? f10 : f11;
        long jB = p019b0.a.b((((long) Float.floatToRawIntBits(f14)) << 32) | (((long) Float.floatToRawIntBits(f14)) & 4294967295L));
        float f15 = tVar == tVar2 ? f11 : f10;
        long jB2 = p019b0.a.b((((long) Float.floatToRawIntBits(f15)) & 4294967295L) | (((long) Float.floatToRawIntBits(f15)) << 32));
        float f16 = tVar == tVar2 ? f12 : f13;
        long jB3 = p019b0.a.b((((long) Float.floatToRawIntBits(f16)) << 32) | (((long) Float.floatToRawIntBits(f16)) & 4294967295L));
        float f17 = tVar == tVar2 ? f13 : f12;
        return new k0.c(j.b(gVarB, jB, jB2, jB3, p019b0.a.b((((long) Float.floatToRawIntBits(f17)) & 4294967295L) | (((long) Float.floatToRawIntBits(f17)) << 32))));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Intrinsics.b(h(), fVar.h()) && Intrinsics.b(g(), fVar.g()) && Intrinsics.b(e(), fVar.e()) && Intrinsics.b(f(), fVar.f());
    }

    public int hashCode() {
        return (((((h().hashCode() * 31) + g().hashCode()) * 31) + e().hashCode()) * 31) + f().hashCode();
    }

    @Override // C.a
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public f c(b bVar, b bVar2, b bVar3, b bVar4) {
        return new f(bVar, bVar2, bVar3, bVar4);
    }

    public String toString() {
        return "RoundedCornerShape(topStart = " + h() + ", topEnd = " + g() + ", bottomEnd = " + e() + ", bottomStart = " + f() + ')';
    }
}
