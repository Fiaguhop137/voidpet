package p321rf;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Build;
import java.util.Collections;
import java.util.List;
import p285pf.b;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {
    public static List a(Context context, Intent intent) {
        List<ResolveInfo> listQueryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 0);
        return listQueryBroadcastReceivers != null ? listQueryBroadcastReceivers : Collections.EMPTY_LIST;
    }

    public static void b(Context context, Intent intent) throws b {
        if (Build.VERSION.SDK_INT >= 26) {
            Intent intent2 = new Intent(intent);
            intent2.setAction("me.leolin.shortcutbadger.BADGE_COUNT_UPDATE");
            try {
                c(context, intent2);
                return;
            } catch (b unused) {
            }
        }
        c(context, intent);
    }

    public static void c(Context context, Intent intent) throws b {
        List<ResolveInfo> listA = a(context, intent);
        if (listA.size() == 0) {
            throw new b("unable to resolve intent: " + intent.toString());
        }
        for (ResolveInfo resolveInfo : listA) {
            Intent intent2 = new Intent(intent);
            if (resolveInfo != null) {
                intent2.setPackage(resolveInfo.resolvePackageName);
                context.sendBroadcast(intent2);
            }
        }
    }
}
