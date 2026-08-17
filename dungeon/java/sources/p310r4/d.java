package p310r4;

import java.security.MessageDigest;
import p274p4.f;

/* JADX INFO: loaded from: classes.dex */
final class d implements f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final f f52182b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f f52183c;

    d(f fVar, f fVar2) {
        this.f52182b = fVar;
        this.f52183c = fVar2;
    }

    @Override // p274p4.f
    public void b(MessageDigest messageDigest) {
        this.f52182b.b(messageDigest);
        this.f52183c.b(messageDigest);
    }

    @Override // p274p4.f
    public boolean equals(Object obj) {
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (this.f52182b.equals(dVar.f52182b) && this.f52183c.equals(dVar.f52183c)) {
                return true;
            }
        }
        return false;
    }

    @Override // p274p4.f
    public int hashCode() {
        return (this.f52182b.hashCode() * 31) + this.f52183c.hashCode();
    }

    public String toString() {
        return "DataCacheKey{sourceKey=" + this.f52182b + ", signature=" + this.f52183c + '}';
    }
}
