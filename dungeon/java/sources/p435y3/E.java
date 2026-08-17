package p435y3;

import android.net.Uri;

/* JADX INFO: loaded from: classes.dex */
public abstract class E {
    public static final Uri a(C c10) {
        return Uri.parse(c10.toString());
    }

    public static final C b(Uri uri) {
        return D.j(uri.toString(), null, 1, null);
    }
}
