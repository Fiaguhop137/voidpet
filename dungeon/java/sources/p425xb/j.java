package p425xb;

import android.net.Uri;
import expo.modules.kotlin.exception.CodedException;

/* JADX INFO: loaded from: classes2.dex */
public final class j extends CodedException {
    public j(Uri uri) {
        super("Uri '" + uri + "' doesn't exist or isn't a directory", null, 2, null);
    }
}
