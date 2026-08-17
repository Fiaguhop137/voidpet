package p170j8;

import com.google.android.gms.common.api.Status;
import p135h8.b;
import p135h8.j;

/* JADX INFO: renamed from: j8.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3836b {
    public static b a(Status status) {
        return status.e4() ? new j(status) : new b(status);
    }
}
