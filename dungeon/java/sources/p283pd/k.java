package p283pd;

import android.util.Log;
import expo.modules.updates.db.UpdatesDatabase;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.N;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.d;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p050cd.o;
import p140hd.c;

/* JADX INFO: loaded from: classes3.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k f50942a = new k();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f50943b = k.class.getSimpleName();

    private k() {
    }

    private final Map b(JSONObject jSONObject) throws JSONException {
        String string;
        Map mapC = N.c();
        Iterator<String> itKeys = jSONObject.keys();
        Intrinsics.checkNotNullExpressionValue(itKeys, "keys(...)");
        for (String str : kotlin.sequences.k.h(itKeys)) {
            Intrinsics.c(str);
            d dVarB = F.b(String.class);
            if (Intrinsics.b(dVarB, F.b(String.class))) {
                string = jSONObject.getString(str);
                if (string == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
            } else if (Intrinsics.b(dVarB, F.b(Double.TYPE))) {
                string = (String) Double.valueOf(jSONObject.getDouble(str));
            } else if (Intrinsics.b(dVarB, F.b(Integer.TYPE))) {
                string = (String) Integer.valueOf(jSONObject.getInt(str));
            } else if (Intrinsics.b(dVarB, F.b(Long.TYPE))) {
                string = (String) Long.valueOf(jSONObject.getLong(str));
            } else if (Intrinsics.b(dVarB, F.b(Boolean.TYPE))) {
                string = (String) Boolean.valueOf(jSONObject.getBoolean(str));
            } else if (Intrinsics.b(dVarB, F.b(JSONArray.class))) {
                Object jSONArray = jSONObject.getJSONArray(str);
                if (jSONArray == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
                string = (String) jSONArray;
            } else if (Intrinsics.b(dVarB, F.b(JSONObject.class))) {
                Object jSONObject2 = jSONObject.getJSONObject(str);
                if (jSONObject2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
                string = (String) jSONObject2;
            } else {
                Object obj = jSONObject.get(str);
                if (obj == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
                string = (String) obj;
            }
            mapC.put(str, string);
        }
        return N.b(mapC);
    }

    private final JSONObject e(c.a aVar, UpdatesDatabase updatesDatabase, expo.modules.updates.d dVar) {
        try {
            c cVarN = updatesDatabase.N();
            Intrinsics.c(cVarN);
            String strF = cVarN.f(aVar, dVar.r());
            if (strF != null) {
                return new JSONObject(strF);
            }
            return null;
        } catch (Exception e10) {
            Log.e(f50943b, "Error retrieving " + aVar + " from database", e10);
            return null;
        }
    }

    public static final JSONObject g(UpdatesDatabase database, expo.modules.updates.d configuration) {
        Intrinsics.checkNotNullParameter(database, "database");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        return f50942a.e(c.a.MANIFEST_SERVER_DEFINED_HEADERS, database, configuration);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String j(String str, String str2, String str3) {
        Map linkedHashMap;
        Map mapB;
        JSONObject jSONObject = str3 != null ? new JSONObject(str3) : null;
        if (jSONObject == null || (mapB = f50942a.b(jSONObject)) == null || (linkedHashMap = N.v(mapB)) == null) {
            linkedHashMap = new LinkedHashMap();
        }
        if (str != null) {
            linkedHashMap.put(str2, str);
        } else {
            linkedHashMap.remove(str2);
        }
        Map mapT = N.t(linkedHashMap);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(N.e(mapT.size()));
        for (Map.Entry entry : mapT.entrySet()) {
            linkedHashMap2.put(entry.getKey(), o.f((String) entry.getValue()));
        }
        p050cd.d.f(linkedHashMap2).e();
        String string = new JSONObject(mapT).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public final void c(UpdatesDatabase database) {
        Intrinsics.checkNotNullParameter(database, "database");
        c cVarN = database.N();
        Intrinsics.c(cVarN);
        cVarN.b(CollectionsKt.o(c.a.EXTRA_PARAMS, c.a.MANIFEST_SERVER_DEFINED_HEADERS, c.a.MANIFEST_FILTERS));
    }

    public final Map d(UpdatesDatabase database, expo.modules.updates.d configuration) {
        Intrinsics.checkNotNullParameter(database, "database");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        JSONObject jSONObjectE = e(c.a.EXTRA_PARAMS, database, configuration);
        if (jSONObjectE != null) {
            return b(jSONObjectE);
        }
        return null;
    }

    public final JSONObject f(UpdatesDatabase database, expo.modules.updates.d configuration) {
        Intrinsics.checkNotNullParameter(database, "database");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        return e(c.a.MANIFEST_FILTERS, database, configuration);
    }

    public final void h(n responseHeaderData, UpdatesDatabase database, expo.modules.updates.d configuration) {
        Intrinsics.checkNotNullParameter(responseHeaderData, "responseHeaderData");
        Intrinsics.checkNotNullParameter(database, "database");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (responseHeaderData.f() != null) {
            linkedHashMap.put(c.a.MANIFEST_SERVER_DEFINED_HEADERS, String.valueOf(responseHeaderData.f()));
        }
        if (responseHeaderData.d() != null) {
            linkedHashMap.put(c.a.MANIFEST_FILTERS, String.valueOf(responseHeaderData.d()));
        }
        if (linkedHashMap.isEmpty()) {
            return;
        }
        c cVarN = database.N();
        Intrinsics.c(cVarN);
        cVarN.h(linkedHashMap, configuration.r());
    }

    public final void i(UpdatesDatabase database, expo.modules.updates.d configuration, String key, String str) {
        Intrinsics.checkNotNullParameter(database, "database");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(key, "key");
        c cVarN = database.N();
        Intrinsics.c(cVarN);
        cVarN.i(c.a.EXTRA_PARAMS, configuration.r(), new j(str, key));
    }
}
