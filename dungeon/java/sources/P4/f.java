package P4;

import V4.k;
import android.net.Uri;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class f implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final List f8833a;

    public f(List list) {
        this.f8833a = (List) k.g(list);
    }

    @Override // P4.d
    public String a() {
        return ((d) this.f8833a.get(0)).a();
    }

    @Override // P4.d
    public boolean b(Uri uri) {
        for (int i10 = 0; i10 < this.f8833a.size(); i10++) {
            if (((d) this.f8833a.get(i10)).b(uri)) {
                return true;
            }
        }
        return false;
    }

    @Override // P4.d
    public boolean c() {
        return false;
    }

    public List d() {
        return this.f8833a;
    }

    @Override // P4.d
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            return this.f8833a.equals(((f) obj).f8833a);
        }
        return false;
    }

    @Override // P4.d
    public int hashCode() {
        return this.f8833a.hashCode();
    }

    public String toString() {
        return "MultiCacheKey:" + this.f8833a.toString();
    }
}
