package p285pf;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.util.Log;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import p230me.leolin.shortcutbadger.impl.AdwHomeBadger;
import p230me.leolin.shortcutbadger.impl.ApexHomeBadger;
import p230me.leolin.shortcutbadger.impl.DefaultBadger;
import p230me.leolin.shortcutbadger.impl.NewHtcHomeBadger;
import p230me.leolin.shortcutbadger.impl.NovaHomeBadger;
import p230me.leolin.shortcutbadger.impl.SonyHomeBadger;
import p303qf.a;
import p303qf.b;
import p303qf.d;
import p303qf.e;
import p303qf.f;
import p303qf.g;
import p303qf.h;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final List f50959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f50960b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static a f50961c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static ComponentName f50962d;

    static {
        LinkedList linkedList = new LinkedList();
        f50959a = linkedList;
        f50960b = new Object();
        linkedList.add(AdwHomeBadger.class);
        linkedList.add(ApexHomeBadger.class);
        linkedList.add(DefaultBadger.class);
        linkedList.add(NewHtcHomeBadger.class);
        linkedList.add(NovaHomeBadger.class);
        linkedList.add(SonyHomeBadger.class);
        linkedList.add(a.class);
        linkedList.add(p303qf.c.class);
        linkedList.add(d.class);
        linkedList.add(e.class);
        linkedList.add(h.class);
        linkedList.add(f.class);
        linkedList.add(g.class);
        linkedList.add(b.class);
    }

    public static void a(Context context, int i10) throws b {
        if (f50961c == null && !b(context)) {
            throw new b("No default launcher available");
        }
        try {
            f50961c.b(context, f50962d, i10);
        } catch (Exception e10) {
            throw new b("Unable to execute badge", e10);
        }
    }

    private static boolean b(Context context) {
        a aVar;
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
        if (launchIntentForPackage == null) {
            Log.e("ShortcutBadger", "Unable to find launch intent for package " + context.getPackageName());
            return false;
        }
        f50962d = launchIntentForPackage.getComponent();
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.HOME");
        Iterator<ResolveInfo> it = context.getPackageManager().queryIntentActivities(intent, 65536).iterator();
        while (it.hasNext()) {
            String str = it.next().activityInfo.packageName;
            Iterator it2 = f50959a.iterator();
            while (it2.hasNext()) {
                try {
                    aVar = (a) ((Class) it2.next()).newInstance();
                } catch (Exception unused) {
                    aVar = null;
                }
                if (aVar != null && aVar.a().contains(str)) {
                    f50961c = aVar;
                    break;
                }
            }
            if (f50961c != null) {
                break;
            }
        }
        if (f50961c != null) {
            return true;
        }
        String str2 = Build.MANUFACTURER;
        if (str2.equalsIgnoreCase("ZUK")) {
            f50961c = new h();
            return true;
        }
        if (str2.equalsIgnoreCase("OPPO")) {
            f50961c = new d();
            return true;
        }
        if (str2.equalsIgnoreCase("VIVO")) {
            f50961c = new f();
            return true;
        }
        if (str2.equalsIgnoreCase("ZTE")) {
            f50961c = new g();
            return true;
        }
        f50961c = new DefaultBadger();
        return true;
    }
}
