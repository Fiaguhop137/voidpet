package p170j8;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.gms.common.AbstractC2348q;

/* JADX INFO: renamed from: j8.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C3855u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Resources f47040a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f47041b;

    public C3855u(Context context) {
        r.l(context);
        Resources resources = context.getResources();
        this.f47040a = resources;
        this.f47041b = resources.getResourcePackageName(AbstractC2348q.f31923a);
    }

    public String a(String str) {
        String str2 = this.f47041b;
        Resources resources = this.f47040a;
        int identifier = resources.getIdentifier(str, "string", str2);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }
}
