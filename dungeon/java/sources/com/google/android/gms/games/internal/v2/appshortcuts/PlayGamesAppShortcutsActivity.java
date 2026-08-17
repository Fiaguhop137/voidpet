package com.google.android.gms.games.internal.v2.appshortcuts;

import L8.C1169p0;
import L8.HandlerC1143c0;
import L8.t0;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.PersistableBundle;
import com.google.android.gms.common.api.internal.AbstractC2326t;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class PlayGamesAppShortcutsActivity extends Activity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Intent f32108a;

    final /* synthetic */ void a() {
        startActivityForResult(this.f32108a, 1005000001);
        finish();
        System.exit(0);
    }

    @Override // android.app.Activity
    protected final void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        if (i10 != 1005000000) {
            return;
        }
        if (i11 != -1) {
            finish();
        } else {
            new HandlerC1143c0(Looper.getMainLooper()).postDelayed(new t(this), 50L);
        }
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0083 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x0052 A[SYNTHETIC] */
    @Override // android.app.Activity
    protected final void onCreate(Bundle bundle) {
        Intent intentAddFlags;
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT < 25) {
            finish();
            return;
        }
        A8.p pVarA = A8.r.a(this, PlayGamesAppShortcutsActivity.class);
        if (pVarA == null) {
            finish();
            return;
        }
        String strZzb = pVarA.zzb();
        if (strZzb == null || strZzb.isEmpty()) {
            List<ResolveInfo> listQueryIntentActivities = getPackageManager().queryIntentActivities(new Intent("android.intent.action.MAIN").addCategory("android.intent.category.LAUNCHER").setPackage(getPackageName()), 795136);
            int i10 = t0.f6506c;
            C1169p0 c1169p0 = new C1169p0();
            for (ResolveInfo resolveInfo : listQueryIntentActivities) {
                ActivityInfo activityInfo = resolveInfo.activityInfo;
                if (activityInfo != null) {
                    int componentEnabledSetting = getPackageManager().getComponentEnabledSetting(new ComponentName(activityInfo.packageName, activityInfo.name));
                    if (componentEnabledSetting == 0) {
                        if (activityInfo.enabled) {
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
            int i11 = 0;
            while (true) {
                if (i11 >= size) {
                    strZzb = null;
                    break;
                }
                ActivityInfo activityInfo2 = ((ResolveInfo) t0VarE.get(i11)).activityInfo;
                i11++;
                if (activityInfo2 != null) {
                    strZzb = activityInfo2.name;
                    break;
                }
            }
        }
        if (strZzb == null || strZzb.isEmpty()) {
            intentAddFlags = null;
        } else {
            String packageName = getPackageName();
            intentAddFlags = new Intent().setComponent(new ComponentName(packageName, strZzb)).setPackage(packageName).addFlags(335577088);
        }
        if (intentAddFlags == null) {
            finish();
            return;
        }
        this.f32108a = intentAddFlags;
        q qVar = new q((Activity) this);
        Intent intent = getIntent();
        qVar.i(AbstractC2326t.a().e(6745).d(p350t8.p.f54559g).c(false).b(new o(qVar, pVarA, new i(intent.getStringExtra("com.google.android.gms.games.EXTRA_APP_SHORTCUT_ID"), (PersistableBundle) intent.getParcelableExtra("com.google.android.gms.games.EXTRA_APP_SHORTCUT_EXTRAS"), null, Boolean.TRUE))).a()).addOnCompleteListener(this, new u(this));
    }
}
