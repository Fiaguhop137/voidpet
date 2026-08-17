package A8;

import L8.C1169p0;
import L8.t0;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.util.Pair;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class r {
    /* JADX WARN: Code duplicated, block: B:55:0x0088 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x0057 A[SYNTHETIC] */
    public static p a(Context context, Class cls) {
        Bundle bundle;
        Long lValueOf;
        ActivityInfo activityInfo;
        Bundle bundle2;
        try {
            ApplicationInfo applicationInfoC = p278p8.d.a(context).c(context.getPackageName(), 128);
            bundle = applicationInfoC == null ? null : applicationInfoC.metaData;
        } catch (PackageManager.NameNotFoundException unused) {
        }
        String string = "";
        if (bundle == null) {
            lValueOf = null;
        } else {
            try {
                lValueOf = Long.valueOf(Long.parseLong(bundle.getString("com.google.android.gms.games.APP_ID", "")));
            } catch (NumberFormatException unused2) {
                lValueOf = null;
            }
        }
        if (lValueOf == null) {
            return null;
        }
        List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(new Intent("android.intent.action.MAIN").addCategory("android.intent.category.LAUNCHER").setPackage(context.getPackageName()), 795136);
        int i10 = t0.f6506c;
        C1169p0 c1169p0 = new C1169p0();
        for (ResolveInfo resolveInfo : listQueryIntentActivities) {
            ActivityInfo activityInfo2 = resolveInfo.activityInfo;
            if (activityInfo2 != null) {
                int componentEnabledSetting = context.getPackageManager().getComponentEnabledSetting(new ComponentName(activityInfo2.packageName, activityInfo2.name));
                if (componentEnabledSetting == 0) {
                    if (activityInfo2.enabled) {
                        if (resolveInfo.activityInfo.exported) {
                            c1169p0.d(resolveInfo);
                        }
                    }
                } else if (componentEnabledSetting == 1) {
                    if (resolveInfo.activityInfo.exported) {
                        c1169p0.d(resolveInfo);
                    }
                }
            }
        }
        t0 t0VarE = c1169p0.e();
        int size = t0VarE.size();
        int iMin = Integer.MAX_VALUE;
        for (int i11 = 0; i11 < size; i11++) {
            ActivityInfo activityInfo3 = ((ResolveInfo) t0VarE.get(i11)).activityInfo;
            if (activityInfo3 != null) {
                try {
                    activityInfo = context.getPackageManager().getActivityInfo(new ComponentName(activityInfo3.packageName, activityInfo3.name), 795264);
                } catch (PackageManager.NameNotFoundException unused3) {
                    activityInfo = null;
                }
                if (activityInfo != null && (bundle2 = activityInfo.metaData) != null) {
                    iMin = Integer.min(iMin, bundle2.getInt("com.google.android.gms.games.APP_SHORTCUTS_MAX_NUMBER", Integer.MAX_VALUE));
                    string = bundle2.getString("com.google.android.gms.games.APP_SHORTCUTS_TARGET_ACTIVITY", string);
                }
            }
        }
        Pair pair = new Pair(Integer.valueOf(iMin), string);
        return new p(lValueOf.longValue(), context.getPackageName(), ((Integer) pair.first).intValue(), new ComponentName(context, (Class<?>) cls), ((String) pair.second).trim());
    }
}
