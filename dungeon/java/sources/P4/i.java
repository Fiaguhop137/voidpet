package P4;

import V4.k;
import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public class i implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final String f8836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final boolean f8837b;

    public i(String str) {
        this(str, false);
    }

    public i(String str, boolean z10) {
        this.f8836a = (String) k.g(str);
        this.f8837b = z10;
    }

    @Override // P4.d
    public String a() {
        return this.f8836a;
    }

    @Override // P4.d
    public boolean b(Uri uri) {
        return this.f8836a.contains(uri.toString());
    }

    @Override // P4.d
    public boolean c() {
        return this.f8837b;
    }

    @Override // P4.d
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            return this.f8836a.equals(((i) obj).f8836a);
        }
        return false;
    }

    @Override // P4.d
    public int hashCode() {
        return this.f8836a.hashCode();
    }

    public String toString() {
        return this.f8836a;
    }
}
