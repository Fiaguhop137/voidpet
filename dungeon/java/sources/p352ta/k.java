package p352ta;

import K9.C1135c;
import K9.q;
import android.content.Context;
import android.content.SharedPreferences;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public class k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C1135c f54606b = C1135c.e(k.class).b(q.k(h.class)).b(q.k(Context.class)).f(new v()).d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final Context f54607a;

    public k(Context context) {
        this.f54607a = context;
    }

    public synchronized String a() {
        String string = b().getString("ml_sdk_instance_id", null);
        if (string != null) {
            return string;
        }
        String string2 = UUID.randomUUID().toString();
        b().edit().putString("ml_sdk_instance_id", string2).apply();
        return string2;
    }

    protected final SharedPreferences b() {
        return this.f54607a.getSharedPreferences("com.google.mlkit.internal", 0);
    }
}
