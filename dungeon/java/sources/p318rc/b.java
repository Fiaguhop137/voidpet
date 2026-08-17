package p318rc;

import kotlin.jvm.internal.F;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.d;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class b extends e {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(JSONObject json) {
        super(json);
        Intrinsics.checkNotNullParameter(json, "json");
    }

    private final JSONObject o() throws JSONException {
        JSONObject jSONObjectF = f();
        if (!jSONObjectF.has("extra")) {
            return null;
        }
        d dVarB = F.b(JSONObject.class);
        if (Intrinsics.b(dVarB, F.b(String.class))) {
            Object string = jSONObjectF.getString("extra");
            if (string != null) {
                return (JSONObject) string;
            }
            throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
        }
        if (Intrinsics.b(dVarB, F.b(Double.TYPE))) {
            return (JSONObject) Double.valueOf(jSONObjectF.getDouble("extra"));
        }
        if (Intrinsics.b(dVarB, F.b(Integer.TYPE))) {
            return (JSONObject) Integer.valueOf(jSONObjectF.getInt("extra"));
        }
        if (Intrinsics.b(dVarB, F.b(Long.TYPE))) {
            return (JSONObject) Long.valueOf(jSONObjectF.getLong("extra"));
        }
        if (Intrinsics.b(dVarB, F.b(Boolean.TYPE))) {
            return (JSONObject) Boolean.valueOf(jSONObjectF.getBoolean("extra"));
        }
        if (Intrinsics.b(dVarB, F.b(JSONArray.class))) {
            Object jSONArray = jSONObjectF.getJSONArray("extra");
            if (jSONArray != null) {
                return (JSONObject) jSONArray;
            }
            throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
        }
        if (Intrinsics.b(dVarB, F.b(JSONObject.class))) {
            JSONObject jSONObject = jSONObjectF.getJSONObject("extra");
            if (jSONObject != null) {
                return jSONObject;
            }
            throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
        }
        Object obj = jSONObjectF.get("extra");
        if (obj != null) {
            return (JSONObject) obj;
        }
        throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
    }

    @Override // p318rc.e
    public String b() throws JSONException {
        JSONObject jSONObject;
        JSONObject jSONObjectO = o();
        if (jSONObjectO != null) {
            boolean zHas = jSONObjectO.has("eas");
            Class cls = Boolean.TYPE;
            Class cls2 = Long.TYPE;
            Class cls3 = Integer.TYPE;
            Class cls4 = Double.TYPE;
            if (zHas) {
                d dVarB = F.b(JSONObject.class);
                if (Intrinsics.b(dVarB, F.b(String.class))) {
                    Object string = jSONObjectO.getString("eas");
                    if (string == null) {
                        throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                    }
                    jSONObject = (JSONObject) string;
                } else if (Intrinsics.b(dVarB, F.b(cls4))) {
                    jSONObject = (JSONObject) Double.valueOf(jSONObjectO.getDouble("eas"));
                } else if (Intrinsics.b(dVarB, F.b(cls3))) {
                    jSONObject = (JSONObject) Integer.valueOf(jSONObjectO.getInt("eas"));
                } else if (Intrinsics.b(dVarB, F.b(cls2))) {
                    jSONObject = (JSONObject) Long.valueOf(jSONObjectO.getLong("eas"));
                } else if (Intrinsics.b(dVarB, F.b(cls))) {
                    jSONObject = (JSONObject) Boolean.valueOf(jSONObjectO.getBoolean("eas"));
                } else if (Intrinsics.b(dVarB, F.b(JSONArray.class))) {
                    Object jSONArray = jSONObjectO.getJSONArray("eas");
                    if (jSONArray == null) {
                        throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                    }
                    jSONObject = (JSONObject) jSONArray;
                } else if (Intrinsics.b(dVarB, F.b(JSONObject.class))) {
                    jSONObject = jSONObjectO.getJSONObject("eas");
                    if (jSONObject == null) {
                        throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                    }
                } else {
                    Object obj = jSONObjectO.get("eas");
                    if (obj == null) {
                        throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                    }
                    jSONObject = (JSONObject) obj;
                }
            } else {
                jSONObject = null;
            }
            if (jSONObject == null || !jSONObject.has("projectId")) {
                return null;
            }
            d dVarB2 = F.b(String.class);
            if (Intrinsics.b(dVarB2, F.b(String.class))) {
                String string2 = jSONObject.getString("projectId");
                if (string2 != null) {
                    return string2;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
            if (Intrinsics.b(dVarB2, F.b(cls4))) {
                return (String) Double.valueOf(jSONObject.getDouble("projectId"));
            }
            if (Intrinsics.b(dVarB2, F.b(cls3))) {
                return (String) Integer.valueOf(jSONObject.getInt("projectId"));
            }
            if (Intrinsics.b(dVarB2, F.b(cls2))) {
                return (String) Long.valueOf(jSONObject.getLong("projectId"));
            }
            if (Intrinsics.b(dVarB2, F.b(cls))) {
                return (String) Boolean.valueOf(jSONObject.getBoolean("projectId"));
            }
            if (Intrinsics.b(dVarB2, F.b(JSONArray.class))) {
                Object jSONArray2 = jSONObject.getJSONArray("projectId");
                if (jSONArray2 != null) {
                    return (String) jSONArray2;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
            if (Intrinsics.b(dVarB2, F.b(JSONObject.class))) {
                Object jSONObject2 = jSONObject.getJSONObject("projectId");
                if (jSONObject2 != null) {
                    return (String) jSONObject2;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
            Object obj2 = jSONObject.get("projectId");
            if (obj2 != null) {
                return (String) obj2;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        return null;
    }

    @Override // p318rc.e
    public JSONObject c() throws JSONException {
        JSONObject jSONObjectO = o();
        if (jSONObjectO == null || !jSONObjectO.has("expoClient")) {
            return null;
        }
        d dVarB = F.b(JSONObject.class);
        if (Intrinsics.b(dVarB, F.b(String.class))) {
            Object string = jSONObjectO.getString("expoClient");
            if (string != null) {
                return (JSONObject) string;
            }
            throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
        }
        if (Intrinsics.b(dVarB, F.b(Double.TYPE))) {
            return (JSONObject) Double.valueOf(jSONObjectO.getDouble("expoClient"));
        }
        if (Intrinsics.b(dVarB, F.b(Integer.TYPE))) {
            return (JSONObject) Integer.valueOf(jSONObjectO.getInt("expoClient"));
        }
        if (Intrinsics.b(dVarB, F.b(Long.TYPE))) {
            return (JSONObject) Long.valueOf(jSONObjectO.getLong("expoClient"));
        }
        if (Intrinsics.b(dVarB, F.b(Boolean.TYPE))) {
            return (JSONObject) Boolean.valueOf(jSONObjectO.getBoolean("expoClient"));
        }
        if (Intrinsics.b(dVarB, F.b(JSONArray.class))) {
            Object jSONArray = jSONObjectO.getJSONArray("expoClient");
            if (jSONArray != null) {
                return (JSONObject) jSONArray;
            }
            throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
        }
        if (Intrinsics.b(dVarB, F.b(JSONObject.class))) {
            JSONObject jSONObject = jSONObjectO.getJSONObject("expoClient");
            if (jSONObject != null) {
                return jSONObject;
            }
            throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
        }
        Object obj = jSONObjectO.get("expoClient");
        if (obj != null) {
            return (JSONObject) obj;
        }
        throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
    }

    @Override // p318rc.e
    public JSONObject d() throws JSONException {
        JSONObject jSONObjectO = o();
        if (jSONObjectO == null || !jSONObjectO.has("expoGo")) {
            return null;
        }
        d dVarB = F.b(JSONObject.class);
        if (Intrinsics.b(dVarB, F.b(String.class))) {
            Object string = jSONObjectO.getString("expoGo");
            if (string != null) {
                return (JSONObject) string;
            }
            throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
        }
        if (Intrinsics.b(dVarB, F.b(Double.TYPE))) {
            return (JSONObject) Double.valueOf(jSONObjectO.getDouble("expoGo"));
        }
        if (Intrinsics.b(dVarB, F.b(Integer.TYPE))) {
            return (JSONObject) Integer.valueOf(jSONObjectO.getInt("expoGo"));
        }
        if (Intrinsics.b(dVarB, F.b(Long.TYPE))) {
            return (JSONObject) Long.valueOf(jSONObjectO.getLong("expoGo"));
        }
        if (Intrinsics.b(dVarB, F.b(Boolean.TYPE))) {
            return (JSONObject) Boolean.valueOf(jSONObjectO.getBoolean("expoGo"));
        }
        if (Intrinsics.b(dVarB, F.b(JSONArray.class))) {
            Object jSONArray = jSONObjectO.getJSONArray("expoGo");
            if (jSONArray != null) {
                return (JSONObject) jSONArray;
            }
            throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
        }
        if (Intrinsics.b(dVarB, F.b(JSONObject.class))) {
            JSONObject jSONObject = jSONObjectO.getJSONObject("expoGo");
            if (jSONObject != null) {
                return jSONObject;
            }
            throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
        }
        Object obj = jSONObjectO.get("expoGo");
        if (obj != null) {
            return (JSONObject) obj;
        }
        throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
    }

    @Override // p318rc.e
    public String e() throws JSONException {
        JSONObject jSONObjectC = c();
        if (jSONObjectC != null) {
            return jSONObjectC.getString("sdkVersion");
        }
        return null;
    }

    @Override // p318rc.e
    public String j() throws JSONException {
        JSONObject jSONObject;
        JSONObject jSONObjectF = f();
        d dVarB = F.b(JSONObject.class);
        boolean zB = Intrinsics.b(dVarB, F.b(String.class));
        Class cls = Boolean.TYPE;
        Class cls2 = Long.TYPE;
        Class cls3 = Integer.TYPE;
        Class cls4 = Double.TYPE;
        if (zB) {
            Object string = jSONObjectF.getString("extra");
            if (string == null) {
                throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
            }
            jSONObject = (JSONObject) string;
        } else if (Intrinsics.b(dVarB, F.b(cls4))) {
            jSONObject = (JSONObject) Double.valueOf(jSONObjectF.getDouble("extra"));
        } else if (Intrinsics.b(dVarB, F.b(cls3))) {
            jSONObject = (JSONObject) Integer.valueOf(jSONObjectF.getInt("extra"));
        } else if (Intrinsics.b(dVarB, F.b(cls2))) {
            jSONObject = (JSONObject) Long.valueOf(jSONObjectF.getLong("extra"));
        } else if (Intrinsics.b(dVarB, F.b(cls))) {
            jSONObject = (JSONObject) Boolean.valueOf(jSONObjectF.getBoolean("extra"));
        } else if (Intrinsics.b(dVarB, F.b(JSONArray.class))) {
            Object jSONArray = jSONObjectF.getJSONArray("extra");
            if (jSONArray == null) {
                throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
            }
            jSONObject = (JSONObject) jSONArray;
        } else if (Intrinsics.b(dVarB, F.b(JSONObject.class))) {
            jSONObject = jSONObjectF.getJSONObject("extra");
            if (jSONObject == null) {
                throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
            }
        } else {
            Object obj = jSONObjectF.get("extra");
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
            }
            jSONObject = (JSONObject) obj;
        }
        d dVarB2 = F.b(String.class);
        if (Intrinsics.b(dVarB2, F.b(String.class))) {
            String string2 = jSONObject.getString("scopeKey");
            if (string2 != null) {
                return string2;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        if (Intrinsics.b(dVarB2, F.b(cls4))) {
            return (String) Double.valueOf(jSONObject.getDouble("scopeKey"));
        }
        if (Intrinsics.b(dVarB2, F.b(cls3))) {
            return (String) Integer.valueOf(jSONObject.getInt("scopeKey"));
        }
        if (Intrinsics.b(dVarB2, F.b(cls2))) {
            return (String) Long.valueOf(jSONObject.getLong("scopeKey"));
        }
        if (Intrinsics.b(dVarB2, F.b(cls))) {
            return (String) Boolean.valueOf(jSONObject.getBoolean("scopeKey"));
        }
        if (Intrinsics.b(dVarB2, F.b(JSONArray.class))) {
            Object jSONArray2 = jSONObject.getJSONArray("scopeKey");
            if (jSONArray2 != null) {
                return (String) jSONArray2;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        if (Intrinsics.b(dVarB2, F.b(JSONObject.class))) {
            Object jSONObject2 = jSONObject.getJSONObject("scopeKey");
            if (jSONObject2 != null) {
                return (String) jSONObject2;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        Object obj2 = jSONObject.get("scopeKey");
        if (obj2 != null) {
            return (String) obj2;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
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

    public final String n() throws JSONException {
        JSONObject jSONObjectF = f();
        d dVarB = F.b(String.class);
        if (Intrinsics.b(dVarB, F.b(String.class))) {
            String string = jSONObjectF.getString("createdAt");
            if (string != null) {
                return string;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        if (Intrinsics.b(dVarB, F.b(Double.TYPE))) {
            return (String) Double.valueOf(jSONObjectF.getDouble("createdAt"));
        }
        if (Intrinsics.b(dVarB, F.b(Integer.TYPE))) {
            return (String) Integer.valueOf(jSONObjectF.getInt("createdAt"));
        }
        if (Intrinsics.b(dVarB, F.b(Long.TYPE))) {
            return (String) Long.valueOf(jSONObjectF.getLong("createdAt"));
        }
        if (Intrinsics.b(dVarB, F.b(Boolean.TYPE))) {
            return (String) Boolean.valueOf(jSONObjectF.getBoolean("createdAt"));
        }
        if (Intrinsics.b(dVarB, F.b(JSONArray.class))) {
            Object jSONArray = jSONObjectF.getJSONArray("createdAt");
            if (jSONArray != null) {
                return (String) jSONArray;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        if (Intrinsics.b(dVarB, F.b(JSONObject.class))) {
            Object jSONObject = jSONObjectF.getJSONObject("createdAt");
            if (jSONObject != null) {
                return (String) jSONObject;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        Object obj = jSONObjectF.get("createdAt");
        if (obj != null) {
            return (String) obj;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
    }

    public final String p() throws JSONException {
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

    public final JSONObject q() throws JSONException {
        JSONObject jSONObjectF = f();
        d dVarB = F.b(JSONObject.class);
        if (Intrinsics.b(dVarB, F.b(String.class))) {
            Object string = jSONObjectF.getString("launchAsset");
            if (string != null) {
                return (JSONObject) string;
            }
            throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
        }
        if (Intrinsics.b(dVarB, F.b(Double.TYPE))) {
            return (JSONObject) Double.valueOf(jSONObjectF.getDouble("launchAsset"));
        }
        if (Intrinsics.b(dVarB, F.b(Integer.TYPE))) {
            return (JSONObject) Integer.valueOf(jSONObjectF.getInt("launchAsset"));
        }
        if (Intrinsics.b(dVarB, F.b(Long.TYPE))) {
            return (JSONObject) Long.valueOf(jSONObjectF.getLong("launchAsset"));
        }
        if (Intrinsics.b(dVarB, F.b(Boolean.TYPE))) {
            return (JSONObject) Boolean.valueOf(jSONObjectF.getBoolean("launchAsset"));
        }
        if (Intrinsics.b(dVarB, F.b(JSONArray.class))) {
            Object jSONArray = jSONObjectF.getJSONArray("launchAsset");
            if (jSONArray != null) {
                return (JSONObject) jSONArray;
            }
            throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
        }
        if (Intrinsics.b(dVarB, F.b(JSONObject.class))) {
            JSONObject jSONObject = jSONObjectF.getJSONObject("launchAsset");
            if (jSONObject != null) {
                return jSONObject;
            }
            throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
        }
        Object obj = jSONObjectF.get("launchAsset");
        if (obj != null) {
            return (JSONObject) obj;
        }
        throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
    }

    public final String r() throws JSONException {
        JSONObject jSONObjectF = f();
        d dVarB = F.b(String.class);
        if (Intrinsics.b(dVarB, F.b(String.class))) {
            String string = jSONObjectF.getString("runtimeVersion");
            if (string != null) {
                return string;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        if (Intrinsics.b(dVarB, F.b(Double.TYPE))) {
            return (String) Double.valueOf(jSONObjectF.getDouble("runtimeVersion"));
        }
        if (Intrinsics.b(dVarB, F.b(Integer.TYPE))) {
            return (String) Integer.valueOf(jSONObjectF.getInt("runtimeVersion"));
        }
        if (Intrinsics.b(dVarB, F.b(Long.TYPE))) {
            return (String) Long.valueOf(jSONObjectF.getLong("runtimeVersion"));
        }
        if (Intrinsics.b(dVarB, F.b(Boolean.TYPE))) {
            return (String) Boolean.valueOf(jSONObjectF.getBoolean("runtimeVersion"));
        }
        if (Intrinsics.b(dVarB, F.b(JSONArray.class))) {
            Object jSONArray = jSONObjectF.getJSONArray("runtimeVersion");
            if (jSONArray != null) {
                return (String) jSONArray;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        if (Intrinsics.b(dVarB, F.b(JSONObject.class))) {
            Object jSONObject = jSONObjectF.getJSONObject("runtimeVersion");
            if (jSONObject != null) {
                return (String) jSONObject;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        Object obj = jSONObjectF.get("runtimeVersion");
        if (obj != null) {
            return (String) obj;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
    }
}
