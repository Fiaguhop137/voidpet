package p303qf;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import java.util.Arrays;
import java.util.List;
import p285pf.a;

/* JADX INFO: loaded from: classes3.dex */
public class f implements a {
    @Override // p285pf.a
    public List a() {
        return Arrays.asList("com.vivo.launcher");
    }

    @Override // p285pf.a
    public void b(Context context, ComponentName componentName, int i10) {
        Intent intent = new Intent("launcher.action.CHANGE_APPLICATION_NOTIFICATION_NUM");
        intent.putExtra("packageName", context.getPackageName());
        intent.putExtra("className", componentName.getClassName());
        intent.putExtra("notificationNum", i10);
        context.sendBroadcast(intent);
    }
}
