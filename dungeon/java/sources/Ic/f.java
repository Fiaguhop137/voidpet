package Ic;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class f {
    public static Map a(Map data) {
        Intrinsics.checkNotNullParameter(data, "data");
        return data;
    }

    public static final boolean b(Map map) {
        String str = (String) map.get("autoDismiss");
        if (str != null) {
            return Boolean.parseBoolean(str);
        }
        return true;
    }

    public static final Integer c(Map map) {
        String str = (String) map.get("badge");
        if (str != null) {
            return StringsKt.toIntOrNull(str);
        }
        return null;
    }

    public static final JSONObject d(Map map) {
        try {
            String str = (String) map.get("body");
            if (str != null) {
                return new JSONObject(str);
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public static final String e(Map map) {
        return (String) map.get("categoryId");
    }

    public static final String f(Map map) {
        return (String) map.get("color");
    }

    public static final String g(Map map) {
        return (String) map.get("message");
    }

    public static final boolean h(Map map) {
        return j(map) == null;
    }

    public static final boolean i(Map map) {
        String str = (String) map.get("vibrate");
        return str != null && Boolean.parseBoolean(str);
    }

    public static final String j(Map map) {
        return (String) map.get("sound");
    }

    public static final String k(Map map) {
        return (String) map.get("subtitle");
    }

    public static final String l(Map map) {
        return (String) map.get("title");
    }

    public static final long[] m(Map map) {
        try {
            String str = (String) map.get("vibrate");
            if (str != null) {
                JSONArray jSONArray = new JSONArray(str);
                int length = jSONArray.length();
                long[] jArr = new long[length];
                for (int i10 = 0; i10 < length; i10++) {
                    jArr[i10] = jSONArray.getLong(i10);
                }
                return jArr;
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public static final boolean n(Map map) {
        String str = (String) map.get("sticky");
        if (str != null) {
            return Boolean.parseBoolean(str);
        }
        return false;
    }
}
