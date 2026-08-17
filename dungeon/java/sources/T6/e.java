package T6;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public class e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final a f12295e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f12296f = e.class.getSimpleName();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f12297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SharedPreferences f12298b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f12299c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f12300d;

    private static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public e(Context appContext) {
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        this.f12297a = appContext;
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(appContext);
        Intrinsics.checkNotNullExpressionValue(defaultSharedPreferences, "getDefaultSharedPreferences(...)");
        this.f12298b = defaultSharedPreferences;
        String packageName = appContext.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "getPackageName(...)");
        this.f12299c = packageName;
        this.f12300d = new LinkedHashMap();
    }

    public final Map a() {
        return this.f12300d;
    }

    public String b() {
        String string = this.f12298b.getString("debug_http_host", null);
        if (string != null && string.length() != 0) {
            return string;
        }
        String strI = com.facebook.react.modules.systeminfo.a.i(this.f12297a);
        if (Intrinsics.b(strI, "localhost")) {
            W4.a.I(f12296f, "You seem to be running on device. Run '" + com.facebook.react.modules.systeminfo.a.b(this.f12297a) + "' to forward the debug server's port to the device.");
        }
        return strI;
    }

    public final String c() {
        return this.f12299c;
    }

    public void d(String host) {
        Intrinsics.checkNotNullParameter(host, "host");
        if (host.length() == 0) {
            this.f12298b.edit().remove("debug_http_host").apply();
        } else {
            this.f12298b.edit().putString("debug_http_host", host).apply();
        }
    }
}
