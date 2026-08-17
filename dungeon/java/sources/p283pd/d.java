package p283pd;

import Ad.j;
import android.net.Uri;
import android.util.Log;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p175jd.b;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements q {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final a f50907l = new a(null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f50908m = d.class.getSimpleName();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p318rc.a f50909a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final UUID f50910b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f50911c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Date f50912d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f50913e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final JSONArray f50914f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Uri f50915g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Map f50916h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Lazy f50917i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Lazy f50918j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f50919k;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final d a(p318rc.a manifest, expo.modules.updates.d configuration) {
            Intrinsics.checkNotNullParameter(manifest, "manifest");
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            UUID uuidFromString = UUID.fromString(manifest.o());
            Intrinsics.checkNotNullExpressionValue(uuidFromString, "fromString(...)");
            return new d(manifest, uuidFromString, configuration.r(), new Date(manifest.n()), configuration.p(), manifest.m(), configuration.m(), configuration.l(), null);
        }
    }

    private d(p318rc.a aVar, UUID uuid, String str, Date date, String str2, JSONArray jSONArray, Uri uri, Map map) {
        this.f50909a = aVar;
        this.f50910b = uuid;
        this.f50911c = str;
        this.f50912d = date;
        this.f50913e = str2;
        this.f50914f = jSONArray;
        this.f50915g = uri;
        this.f50916h = map;
        this.f50917i = j.b(new b(this));
        this.f50918j = j.b(new c(this));
    }

    public /* synthetic */ d(p318rc.a aVar, UUID uuid, String str, Date date, String str2, JSONArray jSONArray, Uri uri, Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, uuid, str, date, str2, jSONArray, uri, map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List g(d dVar) {
        String string;
        String string2;
        JSONArray jSONArray;
        JSONArray jSONArray2;
        ArrayList arrayList = new ArrayList();
        p158id.a aVar = new p158id.a("bundle-" + dVar.f50910b, "js");
        aVar.C(true);
        aVar.v("index.android.bundle");
        arrayList.add(aVar);
        JSONArray jSONArray3 = dVar.f50914f;
        if (jSONArray3 != null && jSONArray3.length() > 0) {
            int length = dVar.f50914f.length();
            for (int i10 = 0; i10 < length; i10++) {
                try {
                    JSONObject jSONObject = dVar.f50914f.getJSONObject(i10);
                    p158id.a aVar2 = new p158id.a(jSONObject.getString("packagerHash"), jSONObject.getString("type"));
                    Intrinsics.c(jSONObject);
                    boolean zHas = jSONObject.has("resourcesFilename");
                    Class cls = Boolean.TYPE;
                    Class cls2 = Long.TYPE;
                    Class cls3 = Integer.TYPE;
                    Class cls4 = Double.TYPE;
                    if (zHas) {
                        kotlin.reflect.d dVarB = F.b(String.class);
                        if (Intrinsics.b(dVarB, F.b(String.class))) {
                            string = jSONObject.getString("resourcesFilename");
                            if (string == null) {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                            }
                        } else if (Intrinsics.b(dVarB, F.b(cls4))) {
                            string = (String) Double.valueOf(jSONObject.getDouble("resourcesFilename"));
                        } else if (Intrinsics.b(dVarB, F.b(cls3))) {
                            string = (String) Integer.valueOf(jSONObject.getInt("resourcesFilename"));
                        } else if (Intrinsics.b(dVarB, F.b(cls2))) {
                            string = (String) Long.valueOf(jSONObject.getLong("resourcesFilename"));
                        } else if (Intrinsics.b(dVarB, F.b(cls))) {
                            string = (String) Boolean.valueOf(jSONObject.getBoolean("resourcesFilename"));
                        } else if (Intrinsics.b(dVarB, F.b(JSONArray.class))) {
                            Object jSONArray4 = jSONObject.getJSONArray("resourcesFilename");
                            if (jSONArray4 == null) {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                            }
                            string = (String) jSONArray4;
                        } else if (Intrinsics.b(dVarB, F.b(JSONObject.class))) {
                            Object jSONObject2 = jSONObject.getJSONObject("resourcesFilename");
                            if (jSONObject2 == null) {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                            }
                            string = (String) jSONObject2;
                        } else {
                            Object obj = jSONObject.get("resourcesFilename");
                            if (obj == null) {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                            }
                            string = (String) obj;
                        }
                    } else {
                        string = null;
                    }
                    aVar2.G(string);
                    if (jSONObject.has("resourcesFolder")) {
                        kotlin.reflect.d dVarB2 = F.b(String.class);
                        if (Intrinsics.b(dVarB2, F.b(String.class))) {
                            string2 = jSONObject.getString("resourcesFolder");
                            if (string2 == null) {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                            }
                        } else if (Intrinsics.b(dVarB2, F.b(cls4))) {
                            string2 = (String) Double.valueOf(jSONObject.getDouble("resourcesFolder"));
                        } else if (Intrinsics.b(dVarB2, F.b(cls3))) {
                            string2 = (String) Integer.valueOf(jSONObject.getInt("resourcesFolder"));
                        } else if (Intrinsics.b(dVarB2, F.b(cls2))) {
                            string2 = (String) Long.valueOf(jSONObject.getLong("resourcesFolder"));
                        } else if (Intrinsics.b(dVarB2, F.b(cls))) {
                            string2 = (String) Boolean.valueOf(jSONObject.getBoolean("resourcesFolder"));
                        } else if (Intrinsics.b(dVarB2, F.b(JSONArray.class))) {
                            Object jSONArray5 = jSONObject.getJSONArray("resourcesFolder");
                            if (jSONArray5 == null) {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                            }
                            string2 = (String) jSONArray5;
                        } else if (Intrinsics.b(dVarB2, F.b(JSONObject.class))) {
                            Object jSONObject3 = jSONObject.getJSONObject("resourcesFolder");
                            if (jSONObject3 == null) {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                            }
                            string2 = (String) jSONObject3;
                        } else {
                            Object obj2 = jSONObject.get("resourcesFolder");
                            if (obj2 == null) {
                                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                            }
                            string2 = (String) obj2;
                        }
                    } else {
                        string2 = null;
                    }
                    aVar2.H(string2);
                    if (jSONObject.has("scales")) {
                        kotlin.reflect.d dVarB3 = F.b(JSONArray.class);
                        if (Intrinsics.b(dVarB3, F.b(String.class))) {
                            Object string3 = jSONObject.getString("scales");
                            if (string3 == null) {
                                throw new NullPointerException("null cannot be cast to non-null type org.json.JSONArray");
                            }
                            jSONArray = (JSONArray) string3;
                        } else if (Intrinsics.b(dVarB3, F.b(cls4))) {
                            jSONArray = (JSONArray) Double.valueOf(jSONObject.getDouble("scales"));
                        } else if (Intrinsics.b(dVarB3, F.b(cls3))) {
                            jSONArray = (JSONArray) Integer.valueOf(jSONObject.getInt("scales"));
                        } else if (Intrinsics.b(dVarB3, F.b(cls2))) {
                            jSONArray = (JSONArray) Long.valueOf(jSONObject.getLong("scales"));
                        } else if (Intrinsics.b(dVarB3, F.b(cls))) {
                            jSONArray = (JSONArray) Boolean.valueOf(jSONObject.getBoolean("scales"));
                        } else if (Intrinsics.b(dVarB3, F.b(JSONArray.class))) {
                            jSONArray = jSONObject.getJSONArray("scales");
                            if (jSONArray == null) {
                                throw new NullPointerException("null cannot be cast to non-null type org.json.JSONArray");
                            }
                        } else if (Intrinsics.b(dVarB3, F.b(JSONObject.class))) {
                            Object jSONObject4 = jSONObject.getJSONObject("scales");
                            if (jSONObject4 == null) {
                                throw new NullPointerException("null cannot be cast to non-null type org.json.JSONArray");
                            }
                            jSONArray = (JSONArray) jSONObject4;
                        } else {
                            Object obj3 = jSONObject.get("scales");
                            if (obj3 == null) {
                                throw new NullPointerException("null cannot be cast to non-null type org.json.JSONArray");
                            }
                            jSONArray = (JSONArray) obj3;
                        }
                        jSONArray2 = jSONArray;
                    } else {
                        jSONArray2 = null;
                    }
                    if (jSONArray2 != null && jSONArray2.length() > 1) {
                        aVar2.I(Float.valueOf((float) jSONObject.optDouble("scale")));
                        int length2 = jSONArray2.length();
                        Float[] fArr = new Float[length2];
                        for (int i11 = 0; i11 < length2; i11++) {
                            fArr[i11] = Float.valueOf(0.0f);
                        }
                        int length3 = jSONArray2.length();
                        for (int i12 = 0; i12 < length3; i12++) {
                            fArr[i12] = Float.valueOf((float) jSONArray2.getDouble(i12));
                        }
                        aVar2.J(fArr);
                    }
                    arrayList.add(aVar2);
                } catch (JSONException e10) {
                    Log.e(f50908m, "Could not read asset from manifest", e10);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p158id.d i(d dVar) {
        p158id.d dVar2 = new p158id.d(dVar.f50910b, dVar.f50912d, dVar.f50913e, dVar.f50911c, dVar.d().i(), dVar.f50915g, dVar.f50916h);
        dVar2.v(b.EMBEDDED);
        return dVar2;
    }

    @Override // p283pd.q
    public List a() {
        return (List) this.f50918j.getValue();
    }

    @Override // p283pd.q
    public boolean b() {
        return this.f50919k;
    }

    @Override // p283pd.q
    public p158id.d c() {
        return (p158id.d) this.f50917i.getValue();
    }

    @Override // p283pd.q
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public p318rc.a d() {
        return this.f50909a;
    }
}
