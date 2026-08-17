package A1;

import android.content.Context;
import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f128a;

    a(a aVar) {
        this.f128a = aVar;
    }

    public static a g(Context context, Uri uri) {
        return new c(null, context, uri);
    }

    public static a h(Context context, Uri uri) {
        String strC = p146i1.c.c(uri);
        if (p146i1.c.d(context, uri)) {
            strC = p146i1.c.b(uri);
        }
        if (strC == null) {
            throw new IllegalArgumentException("Could not get document ID from Uri: " + uri);
        }
        Uri uriA = p146i1.c.a(uri, strC);
        if (uriA != null) {
            return new d(null, context, uriA);
        }
        throw new NullPointerException("Failed to build documentUri from a tree: " + uri);
    }

    public abstract boolean a();

    public abstract boolean b();

    public abstract a c(String str);

    public abstract a d(String str, String str2);

    public abstract boolean e();

    public abstract boolean f();

    public abstract String i();

    public abstract String j();

    public abstract Uri k();

    public abstract boolean l();

    public abstract boolean m();

    public abstract long n();

    public abstract long o();

    public abstract a[] p();
}
