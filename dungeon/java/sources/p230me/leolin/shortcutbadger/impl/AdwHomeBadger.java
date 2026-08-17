package p230me.leolin.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import java.util.Arrays;
import java.util.List;
import p285pf.a;
import p285pf.b;

/* JADX INFO: loaded from: classes3.dex */
public class AdwHomeBadger implements a {
    @Override // p285pf.a
    public List a() {
        return Arrays.asList("org.adw.launcher", "org.adwfreak.launcher");
    }

    @Override // p285pf.a
    public void b(Context context, ComponentName componentName, int i10) throws b {
        Intent intent = new Intent("org.adw.launcher.counter.SEND");
        intent.putExtra("PNAME", componentName.getPackageName());
        intent.putExtra("CNAME", componentName.getClassName());
        intent.putExtra("COUNT", i10);
        p321rf.a.c(context, intent);
    }
}
