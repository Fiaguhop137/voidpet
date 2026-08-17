package p230me.leolin.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import java.util.Arrays;
import java.util.List;
import p285pf.a;
import p285pf.b;

/* JADX INFO: loaded from: classes3.dex */
public class ApexHomeBadger implements a {
    @Override // p285pf.a
    public List a() {
        return Arrays.asList("com.anddoes.launcher");
    }

    @Override // p285pf.a
    public void b(Context context, ComponentName componentName, int i10) throws b {
        Intent intent = new Intent("com.anddoes.launcher.COUNTER_CHANGED");
        intent.putExtra("package", componentName.getPackageName());
        intent.putExtra("count", i10);
        intent.putExtra("class", componentName.getClassName());
        p321rf.a.c(context, intent);
    }
}
