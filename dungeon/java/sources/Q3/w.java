package Q3;

import android.webkit.MimeTypeMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class w {
    public static final String a(String str) {
        return MimeTypeMap.getSingleton().getMimeTypeFromExtension(str);
    }
}
