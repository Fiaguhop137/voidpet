package p318rc;

import kotlin.jvm.internal.F;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.d;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class a extends e {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(JSONObject json) {
        super(json);
        Intrinsics.checkNotNullParameter(json, "json");
    }

    @Override // p318rc.e
    public String b() throws JSONException {
        JSONObject jSONObjectF = f();
        if (!jSONObjectF.has("projectId")) {
            return null;
        }
        d dVarB = F.b(String.class);
        if (Intrinsics.b(dVarB, F.b(String.class))) {
            String string = jSONObjectF.getString("projectId");
            if (string != null) {
                return string;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        if (Intrinsics.b(dVarB, F.b(Double.TYPE))) {
            return (String) Double.valueOf(jSONObjectF.getDouble("projectId"));
        }
        if (Intrinsics.b(dVarB, F.b(Integer.TYPE))) {
            return (String) Integer.valueOf(jSONObjectF.getInt("projectId"));
        }
        if (Intrinsics.b(dVarB, F.b(Long.TYPE))) {
            return (String) Long.valueOf(jSONObjectF.getLong("projectId"));
        }
        if (Intrinsics.b(dVarB, F.b(Boolean.TYPE))) {
            return (String) Boolean.valueOf(jSONObjectF.getBoolean("projectId"));
        }
        if (Intrinsics.b(dVarB, F.b(JSONArray.class))) {
            Object jSONArray = jSONObjectF.getJSONArray("projectId");
            if (jSONArray != null) {
                return (String) jSONArray;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        if (Intrinsics.b(dVarB, F.b(JSONObject.class))) {
            Object jSONObject = jSONObjectF.getJSONObject("projectId");
            if (jSONObject != null) {
                return (String) jSONObject;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        Object obj = jSONObjectF.get("projectId");
        if (obj != null) {
            return (String) obj;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
    }

    @Override // p318rc.e
    public JSONObject c() {
        return f();
    }

    @Override // p318rc.e
    public JSONObject d() {
        return f();
    }

    @Override // p318rc.e
    public String e() throws JSONException {
        JSONObject jSONObjectF = f();
        if (!jSONObjectF.has("sdkVersion")) {
            return null;
        }
        d dVarB = F.b(String.class);
        if (Intrinsics.b(dVarB, F.b(String.class))) {
            String string = jSONObjectF.getString("sdkVersion");
            if (string != null) {
                return string;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        if (Intrinsics.b(dVarB, F.b(Double.TYPE))) {
            return (String) Double.valueOf(jSONObjectF.getDouble("sdkVersion"));
        }
        if (Intrinsics.b(dVarB, F.b(Integer.TYPE))) {
            return (String) Integer.valueOf(jSONObjectF.getInt("sdkVersion"));
        }
        if (Intrinsics.b(dVarB, F.b(Long.TYPE))) {
            return (String) Long.valueOf(jSONObjectF.getLong("sdkVersion"));
        }
        if (Intrinsics.b(dVarB, F.b(Boolean.TYPE))) {
            return (String) Boolean.valueOf(jSONObjectF.getBoolean("sdkVersion"));
        }
        if (Intrinsics.b(dVarB, F.b(JSONArray.class))) {
            Object jSONArray = jSONObjectF.getJSONArray("sdkVersion");
            if (jSONArray != null) {
                return (String) jSONArray;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        if (Intrinsics.b(dVarB, F.b(JSONObject.class))) {
            Object jSONObject = jSONObjectF.getJSONObject("sdkVersion");
            if (jSONObject != null) {
                return (String) jSONObject;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        Object obj = jSONObjectF.get("sdkVersion");
        if (obj != null) {
            return (String) obj;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
    }

    @Override // p318rc.e
    public String j() throws JSONException {
        String string;
        JSONObject jSONObjectF = f();
        if (jSONObjectF.has("scopeKey")) {
            d dVarB = F.b(String.class);
            if (Intrinsics.b(dVarB, F.b(String.class))) {
                string = jSONObjectF.getString("scopeKey");
                if (string == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
            } else if (Intrinsics.b(dVarB, F.b(Double.TYPE))) {
                string = (String) Double.valueOf(jSONObjectF.getDouble("scopeKey"));
            } else if (Intrinsics.b(dVarB, F.b(Integer.TYPE))) {
                string = (String) Integer.valueOf(jSONObjectF.getInt("scopeKey"));
            } else if (Intrinsics.b(dVarB, F.b(Long.TYPE))) {
                string = (String) Long.valueOf(jSONObjectF.getLong("scopeKey"));
            } else if (Intrinsics.b(dVarB, F.b(Boolean.TYPE))) {
                string = (String) Boolean.valueOf(jSONObjectF.getBoolean("scopeKey"));
            } else if (Intrinsics.b(dVarB, F.b(JSONArray.class))) {
                Object jSONArray = jSONObjectF.getJSONArray("scopeKey");
                if (jSONArray == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
                string = (String) jSONArray;
            } else if (Intrinsics.b(dVarB, F.b(JSONObject.class))) {
                Object jSONObject = jSONObjectF.getJSONObject("scopeKey");
                if (jSONObject == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
                string = (String) jSONObject;
            } else {
                Object obj = jSONObjectF.get("scopeKey");
                if (obj == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
                string = (String) obj;
            }
        } else {
            string = null;
        }
        return string == null ? p() : string;
    }

    public JSONArray m() throws JSONException {
        JSONObject jSONObjectF = f();
        if (!jSONObjectF.has("assets")) {
            return null;
        }
        d dVarB = F.b(JSONArray.class);
        if (Intrinsics.b(dVarB, F.b(String.class))) {
            Object string = jSONObjectF.getString("assets");
            if (string != null) {
                return (JSONArray) string;
            }
            throw new NullPointerException("null cannot be cast to non-null type org.json.JSONArray");
        }
        if (Intrinsics.b(dVarB, F.b(Double.TYPE))) {
            return (JSONArray) Double.valueOf(jSONObjectF.getDouble("assets"));
        }
        if (Intrinsics.b(dVarB, F.b(Integer.TYPE))) {
            return (JSONArray) Integer.valueOf(jSONObjectF.getInt("assets"));
        }
        if (Intrinsics.b(dVarB, F.b(Long.TYPE))) {
            return (JSONArray) Long.valueOf(jSONObjectF.getLong("assets"));
        }
        if (Intrinsics.b(dVarB, F.b(Boolean.TYPE))) {
            return (JSONArray) Boolean.valueOf(jSONObjectF.getBoolean("assets"));
        }
        if (Intrinsics.b(dVarB, F.b(JSONArray.class))) {
            JSONArray jSONArray = jSONObjectF.getJSONArray("assets");
            if (jSONArray != null) {
                return jSONArray;
            }
            throw new NullPointerException("null cannot be cast to non-null type org.json.JSONArray");
        }
        if (Intrinsics.b(dVarB, F.b(JSONObject.class))) {
            Object jSONObject = jSONObjectF.getJSONObject("assets");
            if (jSONObject != null) {
                return (JSONArray) jSONObject;
            }
            throw new NullPointerException("null cannot be cast to non-null type org.json.JSONArray");
        }
        Object obj = jSONObjectF.get("assets");
        if (obj != null) {
            return (JSONArray) obj;
        }
        throw new NullPointerException("null cannot be cast to non-null type org.json.JSONArray");
    }

    public final long n() throws JSONException {
        Long lValueOf;
        JSONObject jSONObjectF = f();
        d dVarB = F.b(Long.class);
        if (Intrinsics.b(dVarB, F.b(String.class))) {
            Object string = jSONObjectF.getString("commitTime");
            if (string == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Long");
            }
            lValueOf = (Long) string;
        } else if (Intrinsics.b(dVarB, F.b(Double.TYPE))) {
            lValueOf = (Long) Double.valueOf(jSONObjectF.getDouble("commitTime"));
        } else if (Intrinsics.b(dVarB, F.b(Integer.TYPE))) {
            lValueOf = (Long) Integer.valueOf(jSONObjectF.getInt("commitTime"));
        } else if (Intrinsics.b(dVarB, F.b(Long.TYPE))) {
            lValueOf = Long.valueOf(jSONObjectF.getLong("commitTime"));
        } else if (Intrinsics.b(dVarB, F.b(Boolean.TYPE))) {
            lValueOf = (Long) Boolean.valueOf(jSONObjectF.getBoolean("commitTime"));
        } else if (Intrinsics.b(dVarB, F.b(JSONArray.class))) {
            Object jSONArray = jSONObjectF.getJSONArray("commitTime");
            if (jSONArray == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Long");
            }
            lValueOf = (Long) jSONArray;
        } else if (Intrinsics.b(dVarB, F.b(JSONObject.class))) {
            Object jSONObject = jSONObjectF.getJSONObject("commitTime");
            if (jSONObject == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Long");
            }
            lValueOf = (Long) jSONObject;
        } else {
            Object obj = jSONObjectF.get("commitTime");
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Long");
            }
            lValueOf = (Long) obj;
        }
        return lValueOf.longValue();
    }

    public final String o() throws JSONException {
        JSONObject jSONObjectF = f();
        d dVarB = F.b(String.class);
        if (Intrinsics.b(dVarB, F.b(String.class))) {
            String string = jSONObjectF.getString("id");
            if (string != null) {
                return string;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        if (Intrinsics.b(dVarB, F.b(Double.TYPE))) {
            return (String) Double.valueOf(jSONObjectF.getDouble("id"));
        }
        if (Intrinsics.b(dVarB, F.b(Integer.TYPE))) {
            return (String) Integer.valueOf(jSONObjectF.getInt("id"));
        }
        if (Intrinsics.b(dVarB, F.b(Long.TYPE))) {
            return (String) Long.valueOf(jSONObjectF.getLong("id"));
        }
        if (Intrinsics.b(dVarB, F.b(Boolean.TYPE))) {
            return (String) Boolean.valueOf(jSONObjectF.getBoolean("id"));
        }
        if (Intrinsics.b(dVarB, F.b(JSONArray.class))) {
            Object jSONArray = jSONObjectF.getJSONArray("id");
            if (jSONArray != null) {
                return (String) jSONArray;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        if (Intrinsics.b(dVarB, F.b(JSONObject.class))) {
            Object jSONObject = jSONObjectF.getJSONObject("id");
            if (jSONObject != null) {
                return (String) jSONObject;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        Object obj = jSONObjectF.get("id");
        if (obj != null) {
            return (String) obj;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
    }

    public String p() throws JSONException {
        String string;
        JSONObject jSONObjectF = f();
        if (jSONObjectF.has("originalFullName")) {
            d dVarB = F.b(String.class);
            if (Intrinsics.b(dVarB, F.b(String.class))) {
                string = jSONObjectF.getString("originalFullName");
                if (string == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
            } else if (Intrinsics.b(dVarB, F.b(Double.TYPE))) {
                string = (String) Double.valueOf(jSONObjectF.getDouble("originalFullName"));
            } else if (Intrinsics.b(dVarB, F.b(Integer.TYPE))) {
                string = (String) Integer.valueOf(jSONObjectF.getInt("originalFullName"));
            } else if (Intrinsics.b(dVarB, F.b(Long.TYPE))) {
                string = (String) Long.valueOf(jSONObjectF.getLong("originalFullName"));
            } else if (Intrinsics.b(dVarB, F.b(Boolean.TYPE))) {
                string = (String) Boolean.valueOf(jSONObjectF.getBoolean("originalFullName"));
            } else if (Intrinsics.b(dVarB, F.b(JSONArray.class))) {
                Object jSONArray = jSONObjectF.getJSONArray("originalFullName");
                if (jSONArray == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
                string = (String) jSONArray;
            } else if (Intrinsics.b(dVarB, F.b(JSONObject.class))) {
                Object jSONObject = jSONObjectF.getJSONObject("originalFullName");
                if (jSONObject == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
                string = (String) jSONObject;
            } else {
                Object obj = jSONObjectF.get("originalFullName");
                if (obj == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
                string = (String) obj;
            }
        } else {
            string = null;
        }
        return string == null ? g() : string;
    }
}
