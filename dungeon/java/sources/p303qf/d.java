package p303qf;

import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import java.util.Collections;
import java.util.List;
import p285pf.a;
import p285pf.b;

/* JADX INFO: loaded from: classes3.dex */
public class d implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f51920a = -1;

    private void c(Context context, int i10) throws b {
        try {
            Bundle bundle = new Bundle();
            bundle.putInt("app_badge_count", i10);
            context.getContentResolver().call(Uri.parse("content://com.android.badge/badge"), "setAppBadgeCount", (String) null, bundle);
        } catch (Throwable unused) {
            throw new b("Unable to execute Badge By Content Provider");
        }
    }

    @Override // p285pf.a
    public List a() {
        return Collections.singletonList("com.oppo.launcher");
    }

    @Override // p285pf.a
    public void b(Context context, ComponentName componentName, int i10) throws b {
        if (this.f51920a == i10) {
            return;
        }
        this.f51920a = i10;
        c(context, i10);
    }
}
