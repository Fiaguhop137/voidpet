package p335sb;

import android.app.Application;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static SharedPreferences f53477b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f53476a = new d();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final List f53478c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final SharedPreferences.OnSharedPreferenceChangeListener f53479d = new c();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f53480e = 8;

    private d() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(SharedPreferences sharedPreferences, String str) {
        Iterator it = f53478c.iterator();
        while (it.hasNext()) {
            ((Function0) it.next()).invoke();
        }
    }

    public final void b(Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        SharedPreferences sharedPreferences = application.getSharedPreferences("expo.modules.devmenu.sharedpreferences", 0);
        f53477b = sharedPreferences;
        if (sharedPreferences == null) {
            Intrinsics.r("sharedPreferences");
            sharedPreferences = null;
        }
        sharedPreferences.registerOnSharedPreferenceChangeListener(f53479d);
    }
}
