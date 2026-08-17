package p303qf;

import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import java.util.Collections;
import java.util.List;
import p285pf.a;

/* JADX INFO: loaded from: classes3.dex */
public class h implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Uri f51921a = Uri.parse("content://com.android.badge/badge");

    @Override // p285pf.a
    public List a() {
        return Collections.singletonList("com.zui.launcher");
    }

    @Override // p285pf.a
    public void b(Context context, ComponentName componentName, int i10) {
        Bundle bundle = new Bundle();
        bundle.putInt("app_badge_count", i10);
        context.getContentResolver().call(this.f51921a, "setAppBadgeCount", (String) null, bundle);
    }
}
