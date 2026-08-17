package p308r2;

import B9.g;
import U1.M;
import W1.j;
import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final g f52036a = g.g(",");

    public static final class a {
        public abstract f a();

        public abstract a b(long j10);

        public abstract a c(String str);

        public abstract a d(String str);

        public abstract a e(String str);
    }

    public static Uri b(Uri uri) {
        return uri.getQueryParameter("CMCD") != null ? M.e(uri, "CMCD") : uri;
    }

    public abstract j a(j jVar);
}
