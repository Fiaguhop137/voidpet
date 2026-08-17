package p318rc;

import Ad.j;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.reflect.d;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f52434c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final JSONObject f52435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Lazy f52436b;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final e a(JSONObject manifestJson) throws Exception {
            Intrinsics.checkNotNullParameter(manifestJson, "manifestJson");
            if (manifestJson.has("releaseId")) {
                throw new Exception("Legacy manifests are no longer supported");
            }
            return manifestJson.has("metadata") ? new b(manifestJson) : new p318rc.a(manifestJson);
        }
    }

    public e(JSONObject json) {
        Intrinsics.checkNotNullParameter(json, "json");
        this.f52435a = json;
        this.f52436b = j.b(new d(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:132:0x0254  */
    /* JADX WARN: Code duplicated, block: B:89:0x0197  */
    /* JADX WARN: Code duplicated, block: B:90:0x0199  */
    public static final String l(e eVar) throws JSONException {
        String string;
        String string2;
        JSONObject jSONObject;
        JSONObject jSONObjectC = eVar.c();
        Class cls = Boolean.TYPE;
        Class cls2 = Long.TYPE;
        Class cls3 = Integer.TYPE;
        Class cls4 = Double.TYPE;
        if (jSONObjectC != null) {
            if (jSONObjectC.has("android")) {
                d dVarB = F.b(JSONObject.class);
                if (Intrinsics.b(dVarB, F.b(String.class))) {
                    Object string3 = jSONObjectC.getString("android");
                    if (string3 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                    }
                    jSONObject = (JSONObject) string3;
                } else if (Intrinsics.b(dVarB, F.b(cls4))) {
                    jSONObject = (JSONObject) Double.valueOf(jSONObjectC.getDouble("android"));
                } else if (Intrinsics.b(dVarB, F.b(cls3))) {
                    jSONObject = (JSONObject) Integer.valueOf(jSONObjectC.getInt("android"));
                } else if (Intrinsics.b(dVarB, F.b(cls2))) {
                    jSONObject = (JSONObject) Long.valueOf(jSONObjectC.getLong("android"));
                } else if (Intrinsics.b(dVarB, F.b(cls))) {
                    jSONObject = (JSONObject) Boolean.valueOf(jSONObjectC.getBoolean("android"));
                } else if (Intrinsics.b(dVarB, F.b(JSONArray.class))) {
                    Object jSONArray = jSONObjectC.getJSONArray("android");
                    if (jSONArray == null) {
                        throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                    }
                    jSONObject = (JSONObject) jSONArray;
                } else if (Intrinsics.b(dVarB, F.b(JSONObject.class))) {
                    jSONObject = jSONObjectC.getJSONObject("android");
                    if (jSONObject == null) {
                        throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                    }
                } else {
                    Object obj = jSONObjectC.get("android");
                    if (obj == null) {
                        throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                    }
                    jSONObject = (JSONObject) obj;
                }
            } else {
                jSONObject = null;
            }
            if (jSONObject != null) {
                if (jSONObject.has("jsEngine")) {
                    d dVarB2 = F.b(String.class);
                    if (Intrinsics.b(dVarB2, F.b(String.class))) {
                        string = jSONObject.getString("jsEngine");
                        if (string == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                        }
                    } else if (Intrinsics.b(dVarB2, F.b(cls4))) {
                        string = (String) Double.valueOf(jSONObject.getDouble("jsEngine"));
                    } else if (Intrinsics.b(dVarB2, F.b(cls3))) {
                        string = (String) Integer.valueOf(jSONObject.getInt("jsEngine"));
                    } else if (Intrinsics.b(dVarB2, F.b(cls2))) {
                        string = (String) Long.valueOf(jSONObject.getLong("jsEngine"));
                    } else if (Intrinsics.b(dVarB2, F.b(cls))) {
                        string = (String) Boolean.valueOf(jSONObject.getBoolean("jsEngine"));
                    } else if (Intrinsics.b(dVarB2, F.b(JSONArray.class))) {
                        Object jSONArray2 = jSONObject.getJSONArray("jsEngine");
                        if (jSONArray2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                        }
                        string = (String) jSONArray2;
                    } else if (Intrinsics.b(dVarB2, F.b(JSONObject.class))) {
                        Object jSONObject2 = jSONObject.getJSONObject("jsEngine");
                        if (jSONObject2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                        }
                        string = (String) jSONObject2;
                    } else {
                        Object obj2 = jSONObject.get("jsEngine");
                        if (obj2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                        }
                        string = (String) obj2;
                    }
                } else {
                    string = null;
                }
                if (string == null) {
                    if (jSONObjectC == null) {
                        string = null;
                    } else {
                        string = null;
                    }
                }
            } else if (jSONObjectC == null) {
                string = null;
            } else {
                string = null;
            }
        } else if (jSONObjectC == null && jSONObjectC.has("jsEngine")) {
            d dVarB3 = F.b(String.class);
            if (Intrinsics.b(dVarB3, F.b(String.class))) {
                string2 = jSONObjectC.getString("jsEngine");
                if (string2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
            } else if (Intrinsics.b(dVarB3, F.b(cls4))) {
                string2 = (String) Double.valueOf(jSONObjectC.getDouble("jsEngine"));
            } else if (Intrinsics.b(dVarB3, F.b(cls3))) {
                string2 = (String) Integer.valueOf(jSONObjectC.getInt("jsEngine"));
            } else if (Intrinsics.b(dVarB3, F.b(cls2))) {
                string2 = (String) Long.valueOf(jSONObjectC.getLong("jsEngine"));
            } else if (Intrinsics.b(dVarB3, F.b(cls))) {
                string2 = (String) Boolean.valueOf(jSONObjectC.getBoolean("jsEngine"));
            } else if (Intrinsics.b(dVarB3, F.b(JSONArray.class))) {
                Object jSONArray3 = jSONObjectC.getJSONArray("jsEngine");
                if (jSONArray3 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
                string2 = (String) jSONArray3;
            } else if (Intrinsics.b(dVarB3, F.b(JSONObject.class))) {
                Object jSONObject3 = jSONObjectC.getJSONObject("jsEngine");
                if (jSONObject3 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
                string2 = (String) jSONObject3;
            } else {
                Object obj3 = jSONObjectC.get("jsEngine");
                if (obj3 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
                string2 = (String) obj3;
            }
            string = string2;
        } else {
            string = null;
        }
        if (string != null) {
            return string;
        }
        String strE = eVar.e();
        List listSplit$default = strE != null ? StringsKt.split$default(strE, new String[]{"."}, false, 0, 6, null) : null;
        Integer intOrNull = (listSplit$default == null || listSplit$default.size() != 3) ? 0 : StringsKt.toIntOrNull((String) listSplit$default.get(0));
        return (intOrNull == null || !new IntRange(1, 47).S(intOrNull.intValue())) ? "hermes" : "jsc";
    }

    public abstract String b();

    public abstract JSONObject c();

    public abstract JSONObject d();

    public abstract String e();

    protected final JSONObject f() {
        return this.f52435a;
    }

    public final String g() throws JSONException {
        JSONObject jSONObject = this.f52435a;
        d dVarB = F.b(String.class);
        if (Intrinsics.b(dVarB, F.b(String.class))) {
            String string = jSONObject.getString("id");
            if (string != null) {
                return string;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        if (Intrinsics.b(dVarB, F.b(Double.TYPE))) {
            return (String) Double.valueOf(jSONObject.getDouble("id"));
        }
        if (Intrinsics.b(dVarB, F.b(Integer.TYPE))) {
            return (String) Integer.valueOf(jSONObject.getInt("id"));
        }
        if (Intrinsics.b(dVarB, F.b(Long.TYPE))) {
            return (String) Long.valueOf(jSONObject.getLong("id"));
        }
        if (Intrinsics.b(dVarB, F.b(Boolean.TYPE))) {
            return (String) Boolean.valueOf(jSONObject.getBoolean("id"));
        }
        if (Intrinsics.b(dVarB, F.b(JSONArray.class))) {
            Object jSONArray = jSONObject.getJSONArray("id");
            if (jSONArray != null) {
                return (String) jSONArray;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        if (Intrinsics.b(dVarB, F.b(JSONObject.class))) {
            Object jSONObject2 = jSONObject.getJSONObject("id");
            if (jSONObject2 != null) {
                return (String) jSONObject2;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        Object obj = jSONObject.get("id");
        if (obj != null) {
            return (String) obj;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
    }

    public final JSONObject h() throws JSONException {
        JSONObject jSONObject = this.f52435a;
        if (!jSONObject.has("metadata")) {
            return null;
        }
        d dVarB = F.b(JSONObject.class);
        if (Intrinsics.b(dVarB, F.b(String.class))) {
            Object string = jSONObject.getString("metadata");
            if (string != null) {
                return (JSONObject) string;
            }
            throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
        }
        if (Intrinsics.b(dVarB, F.b(Double.TYPE))) {
            return (JSONObject) Double.valueOf(jSONObject.getDouble("metadata"));
        }
        if (Intrinsics.b(dVarB, F.b(Integer.TYPE))) {
            return (JSONObject) Integer.valueOf(jSONObject.getInt("metadata"));
        }
        if (Intrinsics.b(dVarB, F.b(Long.TYPE))) {
            return (JSONObject) Long.valueOf(jSONObject.getLong("metadata"));
        }
        if (Intrinsics.b(dVarB, F.b(Boolean.TYPE))) {
            return (JSONObject) Boolean.valueOf(jSONObject.getBoolean("metadata"));
        }
        if (Intrinsics.b(dVarB, F.b(JSONArray.class))) {
            Object jSONArray = jSONObject.getJSONArray("metadata");
            if (jSONArray != null) {
                return (JSONObject) jSONArray;
            }
            throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
        }
        if (Intrinsics.b(dVarB, F.b(JSONObject.class))) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("metadata");
            if (jSONObject2 != null) {
                return jSONObject2;
            }
            throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
        }
        Object obj = jSONObject.get("metadata");
        if (obj != null) {
            return (JSONObject) obj;
        }
        throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
    }

    public final JSONObject i() {
        return this.f52435a;
    }

    public abstract String j();

    /* JADX WARN: Code duplicated, block: B:94:0x01a2  */
    public final boolean k() {
        JSONObject jSONObject;
        boolean zBooleanValue;
        Boolean boolValueOf;
        JSONObject jSONObjectD = d();
        if (jSONObjectD == null) {
            return false;
        }
        try {
            if (jSONObjectD.has("developer")) {
                boolean zHas = jSONObjectD.has("packagerOpts");
                Class cls = Boolean.TYPE;
                Class cls2 = Long.TYPE;
                Class cls3 = Integer.TYPE;
                Class cls4 = Double.TYPE;
                Boolean bool = null;
                if (zHas) {
                    d dVarB = F.b(JSONObject.class);
                    if (Intrinsics.b(dVarB, F.b(String.class))) {
                        Object string = jSONObjectD.getString("packagerOpts");
                        if (string == null) {
                            throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                        }
                        jSONObject = (JSONObject) string;
                    } else if (Intrinsics.b(dVarB, F.b(cls4))) {
                        jSONObject = (JSONObject) Double.valueOf(jSONObjectD.getDouble("packagerOpts"));
                    } else if (Intrinsics.b(dVarB, F.b(cls3))) {
                        jSONObject = (JSONObject) Integer.valueOf(jSONObjectD.getInt("packagerOpts"));
                    } else if (Intrinsics.b(dVarB, F.b(cls2))) {
                        jSONObject = (JSONObject) Long.valueOf(jSONObjectD.getLong("packagerOpts"));
                    } else if (Intrinsics.b(dVarB, F.b(cls))) {
                        jSONObject = (JSONObject) Boolean.valueOf(jSONObjectD.getBoolean("packagerOpts"));
                    } else if (Intrinsics.b(dVarB, F.b(JSONArray.class))) {
                        Object jSONArray = jSONObjectD.getJSONArray("packagerOpts");
                        if (jSONArray == null) {
                            throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                        }
                        jSONObject = (JSONObject) jSONArray;
                    } else if (Intrinsics.b(dVarB, F.b(JSONObject.class))) {
                        jSONObject = jSONObjectD.getJSONObject("packagerOpts");
                        if (jSONObject == null) {
                            throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                        }
                    } else {
                        Object obj = jSONObjectD.get("packagerOpts");
                        if (obj == null) {
                            throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                        }
                        jSONObject = (JSONObject) obj;
                    }
                } else {
                    jSONObject = null;
                }
                if (jSONObject == null) {
                    zBooleanValue = false;
                } else {
                    if (jSONObject.has("dev")) {
                        d dVarB2 = F.b(Boolean.class);
                        if (Intrinsics.b(dVarB2, F.b(String.class))) {
                            Object string2 = jSONObject.getString("dev");
                            if (string2 == null) {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
                            }
                            boolValueOf = (Boolean) string2;
                        } else if (Intrinsics.b(dVarB2, F.b(cls4))) {
                            boolValueOf = (Boolean) Double.valueOf(jSONObject.getDouble("dev"));
                        } else if (Intrinsics.b(dVarB2, F.b(cls3))) {
                            boolValueOf = (Boolean) Integer.valueOf(jSONObject.getInt("dev"));
                        } else if (Intrinsics.b(dVarB2, F.b(cls2))) {
                            boolValueOf = (Boolean) Long.valueOf(jSONObject.getLong("dev"));
                        } else if (Intrinsics.b(dVarB2, F.b(cls))) {
                            boolValueOf = Boolean.valueOf(jSONObject.getBoolean("dev"));
                        } else if (Intrinsics.b(dVarB2, F.b(JSONArray.class))) {
                            Object jSONArray2 = jSONObject.getJSONArray("dev");
                            if (jSONArray2 == null) {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
                            }
                            boolValueOf = (Boolean) jSONArray2;
                        } else if (Intrinsics.b(dVarB2, F.b(JSONObject.class))) {
                            Object jSONObject2 = jSONObject.getJSONObject("dev");
                            if (jSONObject2 == null) {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
                            }
                            boolValueOf = (Boolean) jSONObject2;
                        } else {
                            Object obj2 = jSONObject.get("dev");
                            if (obj2 == null) {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
                            }
                            boolValueOf = (Boolean) obj2;
                        }
                        bool = boolValueOf;
                    }
                    if (bool != null) {
                        zBooleanValue = bool.booleanValue();
                    } else {
                        zBooleanValue = false;
                    }
                }
                if (zBooleanValue) {
                    return true;
                }
            }
        } catch (JSONException unused) {
        }
        return false;
    }

    public String toString() {
        String string = i().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }
}
