package p086ed;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e {
    private static final int b(String str) {
        if (str == null) {
            return -1;
        }
        switch (str.hashCode()) {
            case 3804:
                return str.equals("ws") ? 80 : -1;
            case 101730:
                return !str.equals("ftp") ? -1 : 21;
            case 118039:
                return !str.equals("wss") ? -1 : 443;
            case 3213448:
                return !str.equals("http") ? -1 : 80;
            case 99617003:
                return !str.equals("https") ? -1 : 443;
            default:
                return -1;
        }
    }

    public static final String c(Uri url) {
        Intrinsics.checkNotNullParameter(url, "url");
        String scheme = url.getScheme();
        int port = url.getPort();
        if (port == b(scheme)) {
            port = -1;
        }
        String host = url.getHost();
        if (port <= -1) {
            return scheme + "://" + host;
        }
        return scheme + "://" + host + ":" + port;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String d(String str, Uri uri) {
        return str == null ? c(uri) : str;
    }
}
