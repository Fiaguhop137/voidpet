package K4;

import L4.k;
import java.security.MessageDigest;
import p274p4.f;

/* JADX INFO: loaded from: classes.dex */
public final class c implements f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f6034b;

    public c(Object obj) {
        this.f6034b = k.d(obj);
    }

    @Override // p274p4.f
    public void b(MessageDigest messageDigest) {
        messageDigest.update(this.f6034b.toString().getBytes(f.f50778a));
    }

    @Override // p274p4.f
    public boolean equals(Object obj) {
        if (obj instanceof c) {
            return this.f6034b.equals(((c) obj).f6034b);
        }
        return false;
    }

    @Override // p274p4.f
    public int hashCode() {
        return this.f6034b.hashCode();
    }

    public String toString() {
        return "ObjectKey{object=" + this.f6034b + '}';
    }
}
