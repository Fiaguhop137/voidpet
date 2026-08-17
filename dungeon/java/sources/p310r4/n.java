package p310r4;

import L4.k;
import java.security.MessageDigest;
import java.util.Map;
import p274p4.f;
import p274p4.h;

/* JADX INFO: loaded from: classes.dex */
class n implements f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f52328b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f52329c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f52330d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Class f52331e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Class f52332f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final f f52333g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Map f52334h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final h f52335i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f52336j;

    n(Object obj, f fVar, int i10, int i11, Map map, Class cls, Class cls2, h hVar) {
        this.f52328b = k.d(obj);
        this.f52333g = (f) k.e(fVar, "Signature must not be null");
        this.f52329c = i10;
        this.f52330d = i11;
        this.f52334h = (Map) k.d(map);
        this.f52331e = (Class) k.e(cls, "Resource class must not be null");
        this.f52332f = (Class) k.e(cls2, "Transcode class must not be null");
        this.f52335i = (h) k.d(hVar);
    }

    @Override // p274p4.f
    public void b(MessageDigest messageDigest) {
        throw new UnsupportedOperationException();
    }

    @Override // p274p4.f
    public boolean equals(Object obj) {
        if (obj instanceof n) {
            n nVar = (n) obj;
            if (this.f52328b.equals(nVar.f52328b) && this.f52333g.equals(nVar.f52333g) && this.f52330d == nVar.f52330d && this.f52329c == nVar.f52329c && this.f52334h.equals(nVar.f52334h) && this.f52331e.equals(nVar.f52331e) && this.f52332f.equals(nVar.f52332f) && this.f52335i.equals(nVar.f52335i)) {
                return true;
            }
        }
        return false;
    }

    @Override // p274p4.f
    public int hashCode() {
        if (this.f52336j == 0) {
            int iHashCode = this.f52328b.hashCode();
            this.f52336j = iHashCode;
            int iHashCode2 = (((((iHashCode * 31) + this.f52333g.hashCode()) * 31) + this.f52329c) * 31) + this.f52330d;
            this.f52336j = iHashCode2;
            int iHashCode3 = (iHashCode2 * 31) + this.f52334h.hashCode();
            this.f52336j = iHashCode3;
            int iHashCode4 = (iHashCode3 * 31) + this.f52331e.hashCode();
            this.f52336j = iHashCode4;
            int iHashCode5 = (iHashCode4 * 31) + this.f52332f.hashCode();
            this.f52336j = iHashCode5;
            this.f52336j = (iHashCode5 * 31) + this.f52335i.hashCode();
        }
        return this.f52336j;
    }

    public String toString() {
        return "EngineKey{model=" + this.f52328b + ", width=" + this.f52329c + ", height=" + this.f52330d + ", resourceClass=" + this.f52331e + ", transcodeClass=" + this.f52332f + ", signature=" + this.f52333g + ", hashCode=" + this.f52336j + ", transformations=" + this.f52334h + ", options=" + this.f52335i + '}';
    }
}
