package p274p4;

import L4.b;
import java.security.MessageDigest;
import p323s.C4101a;

/* JADX INFO: loaded from: classes.dex */
public final class h implements f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C4101a f50784b = new b();

    private static void f(g gVar, Object obj, MessageDigest messageDigest) {
        gVar.g(obj, messageDigest);
    }

    @Override // p274p4.f
    public void b(MessageDigest messageDigest) {
        for (int i10 = 0; i10 < this.f50784b.size(); i10++) {
            f((g) this.f50784b.f(i10), this.f50784b.k(i10), messageDigest);
        }
    }

    public Object c(g gVar) {
        return this.f50784b.containsKey(gVar) ? this.f50784b.get(gVar) : gVar.c();
    }

    public void d(h hVar) {
        this.f50784b.g(hVar.f50784b);
    }

    public h e(g gVar, Object obj) {
        this.f50784b.put(gVar, obj);
        return this;
    }

    @Override // p274p4.f
    public boolean equals(Object obj) {
        if (obj instanceof h) {
            return this.f50784b.equals(((h) obj).f50784b);
        }
        return false;
    }

    @Override // p274p4.f
    public int hashCode() {
        return this.f50784b.hashCode();
    }

    public String toString() {
        return "Options{values=" + this.f50784b + '}';
    }
}
