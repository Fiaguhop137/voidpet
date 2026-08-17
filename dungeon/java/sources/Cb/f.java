package Cb;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f1687a = new f();

    private f() {
    }

    private final Object e(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Map) {
            return f((Map) obj);
        }
        if (obj instanceof List) {
            ArrayList arrayList = new ArrayList();
            Iterator it = ((Iterable) obj).iterator();
            while (it.hasNext()) {
                Object objE = f1687a.e(it.next());
                if (objE != null) {
                    arrayList.add(objE);
                }
            }
            return arrayList;
        }
        if (!(obj instanceof Object[])) {
            return obj;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : (Object[]) obj) {
            Object objE2 = f1687a.e(obj2);
            if (objE2 != null) {
                arrayList2.add(objE2);
            }
        }
        return arrayList2;
    }

    private final Map f(Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            String str = key instanceof String ? (String) key : null;
            if (str != null) {
                String lowerCase = str.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                if (StringsKt.U(lowerCase, "token", false, 2, null)) {
                    linkedHashMap.put(str, "hidden");
                } else {
                    linkedHashMap.put(str, e(value));
                }
            }
        }
        return linkedHashMap;
    }

    private final String g(Object obj) {
        Object objE = e(obj);
        if (objE == null) {
            return "null";
        }
        if (objE instanceof String) {
            return (String) objE;
        }
        if ((objE instanceof Number) || (objE instanceof Boolean)) {
            return objE.toString();
        }
        if (objE instanceof Map) {
            String string = new JSONObject((Map) objE).toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            return string;
        }
        if (!(objE instanceof List)) {
            return objE.toString();
        }
        String string2 = new JSONArray((Collection) objE).toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return string2;
    }

    public final void a(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        Log.d("ExpoIap", message);
    }

    public final void b(String name, Throwable error) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(error, "error");
        Log.e("ExpoIap", name + " failed: " + error.getLocalizedMessage(), error);
    }

    public final void c(String name, Object obj) {
        Intrinsics.checkNotNullParameter(name, "name");
        a(name + " payload: " + g(obj));
    }

    public final void d(String name, Object obj) {
        Intrinsics.checkNotNullParameter(name, "name");
        a(name + " result: " + g(obj));
    }

    public final void h(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        Log.w("ExpoIap", message);
    }
}
