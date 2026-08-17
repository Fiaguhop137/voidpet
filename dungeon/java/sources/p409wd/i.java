package p409wd;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static i f56844b = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private JSONObject f56845a;

    private i() {
        try {
            this.f56845a = new JSONObject("{}");
        } catch (JSONException unused) {
        }
    }

    public static i d() {
        return f56844b;
    }

    public WritableMap a() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        JSONArray jSONArrayNames = this.f56845a.names();
        for (int i10 = 0; i10 < jSONArrayNames.length(); i10++) {
            try {
                String string = jSONArrayNames.getString(i10);
                l.f(string, this.f56845a.get(string), writableMapCreateMap);
            } catch (JSONException unused) {
            }
        }
        return writableMapCreateMap;
    }

    public int b(String str, int i10) {
        JSONObject jSONObject = this.f56845a;
        return jSONObject == null ? i10 : jSONObject.optInt(str, i10);
    }

    public String c() {
        return "{}";
    }
}
