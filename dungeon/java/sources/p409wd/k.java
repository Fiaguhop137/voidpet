package p409wd;

import android.content.SharedPreferences;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import io.invertase.firebase.app.a;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static k f56847b = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private SharedPreferences f56848a;

    private SharedPreferences c() {
        if (this.f56848a == null) {
            this.f56848a = a.a().getSharedPreferences("io.invertase.firebase", 0);
        }
        return this.f56848a;
    }

    public static k d() {
        return f56847b;
    }

    public void a() {
        c().edit().clear().apply();
    }

    public WritableMap b() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        for (Map.Entry<String, ?> entry : c().getAll().entrySet()) {
            l.f(entry.getKey(), entry.getValue(), writableMapCreateMap);
        }
        return writableMapCreateMap;
    }

    public void e(String str, boolean z10) {
        c().edit().putBoolean(str, z10).apply();
    }

    public void f(String str, String str2) {
        c().edit().putString(str, str2).apply();
    }
}
