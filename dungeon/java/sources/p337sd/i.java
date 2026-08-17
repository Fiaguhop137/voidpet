package p337sd;

import android.util.Log;
import java.util.Iterator;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import p158id.d;
import p318rc.e;

/* JADX INFO: loaded from: classes3.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f53529a = new i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f53530b;

    static {
        String simpleName = i.class.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
        f53530b = simpleName;
    }

    private i() {
    }

    public final boolean a(d update, JSONObject jSONObject) {
        JSONObject jSONObjectH;
        Intrinsics.checkNotNullParameter(update, "update");
        if (jSONObject == null || (jSONObjectH = e.f52434c.a(update.i()).h()) == null) {
            return true;
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            Iterator<String> itKeys = jSONObjectH.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Intrinsics.c(next);
                String lowerCase = next.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                jSONObject2.put(lowerCase, jSONObjectH.get(next));
            }
            Iterator<String> itKeys2 = jSONObject.keys();
            while (itKeys2.hasNext()) {
                String next2 = itKeys2.next();
                if (jSONObject2.has(next2) && !Intrinsics.b(jSONObject.get(next2), jSONObject2.get(next2))) {
                    return false;
                }
            }
            return true;
        } catch (Exception e10) {
            Log.e(f53530b, "Error filtering manifest using server data", e10);
            return true;
        }
    }
}
