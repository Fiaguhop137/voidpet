package expo.modules.updates;

import Ad.j;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.collections.CollectionsKt;
import kotlin.collections.W;
import kotlin.enums.EnumEntries;
import kotlin.io.v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final b f41438t = new b(null);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final String f41439u = d.class.getSimpleName();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f41440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Uri f41441b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Uri f41442c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f41443d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f41444e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final a f41445f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f41446g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f41447h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Map f41448i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Map f41449j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final String f41450k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Map f41451l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final boolean f41452m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final boolean f41453n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final boolean f41454o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final boolean f41455p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final boolean f41456q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Map f41457r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final Lazy f41458s;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f41459a = new c("NEVER", 0);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f41460b = new b("ERROR_RECOVERY_ONLY", 1);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f41461c = new C0472d("WIFI_ONLY", 2);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final a f41462d = new C0471a("ALWAYS", 3);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ a[] f41463e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f41464f;

        /* JADX INFO: renamed from: expo.modules.updates.d$a$a, reason: collision with other inner class name */
        static final class C0471a extends a {
            C0471a(String str, int i10) {
                super(str, i10, null);
            }

            @Override // expo.modules.updates.d.a
            public String g() {
                return "ALWAYS";
            }
        }

        static final class b extends a {
            b(String str, int i10) {
                super(str, i10, null);
            }

            @Override // expo.modules.updates.d.a
            public String g() {
                return "ERROR_RECOVERY_ONLY";
            }
        }

        static final class c extends a {
            c(String str, int i10) {
                super(str, i10, null);
            }

            @Override // expo.modules.updates.d.a
            public String g() {
                return "NEVER";
            }
        }

        /* JADX INFO: renamed from: expo.modules.updates.d$a$d, reason: collision with other inner class name */
        static final class C0472d extends a {
            C0472d(String str, int i10) {
                super(str, i10, null);
            }

            @Override // expo.modules.updates.d.a
            public String g() {
                return "WIFI_ONLY";
            }
        }

        static {
            a[] aVarArrE = e();
            f41463e = aVarArrE;
            f41464f = Gd.a.a(aVarArrE);
        }

        private a(String str, int i10) {
            super(str, i10);
        }

        public /* synthetic */ a(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i10);
        }

        private static final /* synthetic */ a[] e() {
            return new a[]{f41459a, f41460b, f41461c, f41462d};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f41463e.clone();
        }

        public abstract String g();
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean j(Context context, Map map) {
            Boolean boolValueOf;
            Object obj;
            Boolean bool = null;
            if (map != null) {
                if (map.containsKey("disableAntiBrickingMeasures")) {
                    obj = map.get("disableAntiBrickingMeasures");
                    if (!(obj instanceof Boolean)) {
                        Intrinsics.c(obj);
                        throw new AssertionError("UpdatesConfiguration failed to initialize: bad value of type " + obj.getClass().getSimpleName() + " provided for key disableAntiBrickingMeasures");
                    }
                } else {
                    obj = null;
                }
                Boolean bool2 = (Boolean) obj;
                if (bool2 != null) {
                    return bool2.booleanValue();
                }
            }
            if (context != null) {
                Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
                if (bundle.containsKey("expo.modules.updates.DISABLE_ANTI_BRICKING_MEASURES")) {
                    kotlin.reflect.d dVarB = F.b(Boolean.class);
                    if (Intrinsics.b(dVarB, F.b(String.class))) {
                        boolValueOf = (Boolean) bundle.getString("expo.modules.updates.DISABLE_ANTI_BRICKING_MEASURES");
                    } else if (Intrinsics.b(dVarB, F.b(Boolean.TYPE))) {
                        boolValueOf = Boolean.valueOf(bundle.getBoolean("expo.modules.updates.DISABLE_ANTI_BRICKING_MEASURES"));
                    } else {
                        boolValueOf = Intrinsics.b(dVarB, F.b(Integer.TYPE)) ? (Boolean) Integer.valueOf(bundle.getInt("expo.modules.updates.DISABLE_ANTI_BRICKING_MEASURES")) : (Boolean) bundle.get("expo.modules.updates.DISABLE_ANTI_BRICKING_MEASURES");
                    }
                    bool = boolValueOf;
                }
            }
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean k(Context context, Map map, boolean z10, e eVar) {
            if (!z10 || eVar == null) {
                return o(context, map);
            }
            return false;
        }

        private final boolean l(Context context, Map map) {
            Boolean boolValueOf;
            Object obj;
            Boolean bool = null;
            if (map != null) {
                if (map.containsKey("enabled")) {
                    obj = map.get("enabled");
                    if (!(obj instanceof Boolean)) {
                        Intrinsics.c(obj);
                        throw new AssertionError("UpdatesConfiguration failed to initialize: bad value of type " + obj.getClass().getSimpleName() + " provided for key enabled");
                    }
                } else {
                    obj = null;
                }
                Boolean bool2 = (Boolean) obj;
                if (bool2 != null) {
                    return bool2.booleanValue();
                }
            }
            if (context != null) {
                Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
                if (bundle.containsKey("expo.modules.updates.ENABLED")) {
                    kotlin.reflect.d dVarB = F.b(Boolean.class);
                    if (Intrinsics.b(dVarB, F.b(String.class))) {
                        boolValueOf = (Boolean) bundle.getString("expo.modules.updates.ENABLED");
                    } else if (Intrinsics.b(dVarB, F.b(Boolean.TYPE))) {
                        boolValueOf = Boolean.valueOf(bundle.getBoolean("expo.modules.updates.ENABLED"));
                    } else {
                        boolValueOf = Intrinsics.b(dVarB, F.b(Integer.TYPE)) ? (Boolean) Integer.valueOf(bundle.getInt("expo.modules.updates.ENABLED")) : (Boolean) bundle.get("expo.modules.updates.ENABLED");
                    }
                    bool = boolValueOf;
                }
            }
            if (bool != null) {
                return bool.booleanValue();
            }
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:31:0x00ad  */
        public final Map m(Context context, Map map) {
            String string;
            Object obj;
            String str = null;
            if (map != null) {
                if (map.containsKey("requestHeaders")) {
                    obj = map.get("requestHeaders");
                    if (!(obj instanceof Map)) {
                        Intrinsics.c(obj);
                        throw new AssertionError("UpdatesConfiguration failed to initialize: bad value of type " + obj.getClass().getSimpleName() + " provided for key requestHeaders");
                    }
                } else {
                    obj = null;
                }
                Map map2 = (Map) obj;
                if (map2 != null) {
                    return map2;
                }
            }
            if (context != null) {
                Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
                if (bundle.containsKey("expo.modules.updates.UPDATES_CONFIGURATION_REQUEST_HEADERS_KEY")) {
                    kotlin.reflect.d dVarB = F.b(String.class);
                    if (Intrinsics.b(dVarB, F.b(String.class))) {
                        string = bundle.getString("expo.modules.updates.UPDATES_CONFIGURATION_REQUEST_HEADERS_KEY");
                    } else if (Intrinsics.b(dVarB, F.b(Boolean.TYPE))) {
                        string = (String) Boolean.valueOf(bundle.getBoolean("expo.modules.updates.UPDATES_CONFIGURATION_REQUEST_HEADERS_KEY"));
                    } else {
                        string = Intrinsics.b(dVarB, F.b(Integer.TYPE)) ? (String) Integer.valueOf(bundle.getInt("expo.modules.updates.UPDATES_CONFIGURATION_REQUEST_HEADERS_KEY")) : (String) bundle.get("expo.modules.updates.UPDATES_CONFIGURATION_REQUEST_HEADERS_KEY");
                    }
                    str = string;
                }
                if (str == null) {
                    str = "{}";
                }
            } else {
                str = "{}";
            }
            return h.f41502a.d(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Uri n(Context context, Map map) {
            String string;
            Object obj;
            if (map != null) {
                if (map.containsKey("updateUrl")) {
                    obj = map.get("updateUrl");
                    if (!(obj instanceof Uri)) {
                        Intrinsics.c(obj);
                        throw new AssertionError("UpdatesConfiguration failed to initialize: bad value of type " + obj.getClass().getSimpleName() + " provided for key updateUrl");
                    }
                } else {
                    obj = null;
                }
                Uri uri = (Uri) obj;
                if (uri != null) {
                    return uri;
                }
            }
            if (context != null) {
                Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
                if (bundle.containsKey("expo.modules.updates.EXPO_UPDATE_URL")) {
                    kotlin.reflect.d dVarB = F.b(String.class);
                    if (Intrinsics.b(dVarB, F.b(String.class))) {
                        string = bundle.getString("expo.modules.updates.EXPO_UPDATE_URL");
                    } else if (Intrinsics.b(dVarB, F.b(Boolean.TYPE))) {
                        string = (String) Boolean.valueOf(bundle.getBoolean("expo.modules.updates.EXPO_UPDATE_URL"));
                    } else {
                        string = Intrinsics.b(dVarB, F.b(Integer.TYPE)) ? (String) Integer.valueOf(bundle.getInt("expo.modules.updates.EXPO_UPDATE_URL")) : (String) bundle.get("expo.modules.updates.EXPO_UPDATE_URL");
                    }
                } else {
                    string = null;
                }
                if (string != null) {
                    return Uri.parse(string);
                }
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean o(Context context, Map map) {
            Boolean boolValueOf;
            Object obj;
            Boolean bool = null;
            if (map != null) {
                if (map.containsKey("hasEmbeddedUpdate")) {
                    obj = map.get("hasEmbeddedUpdate");
                    if (!(obj instanceof Boolean)) {
                        Intrinsics.c(obj);
                        throw new AssertionError("UpdatesConfiguration failed to initialize: bad value of type " + obj.getClass().getSimpleName() + " provided for key hasEmbeddedUpdate");
                    }
                } else {
                    obj = null;
                }
                Boolean bool2 = (Boolean) obj;
                if (bool2 != null) {
                    return bool2.booleanValue();
                }
            }
            if (context != null) {
                Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
                if (bundle.containsKey("expo.modules.updates.HAS_EMBEDDED_UPDATE")) {
                    kotlin.reflect.d dVarB = F.b(Boolean.class);
                    if (Intrinsics.b(dVarB, F.b(String.class))) {
                        boolValueOf = (Boolean) bundle.getString("expo.modules.updates.HAS_EMBEDDED_UPDATE");
                    } else if (Intrinsics.b(dVarB, F.b(Boolean.TYPE))) {
                        boolValueOf = Boolean.valueOf(bundle.getBoolean("expo.modules.updates.HAS_EMBEDDED_UPDATE"));
                    } else {
                        boolValueOf = Intrinsics.b(dVarB, F.b(Integer.TYPE)) ? (Boolean) Integer.valueOf(bundle.getInt("expo.modules.updates.HAS_EMBEDDED_UPDATE")) : (Boolean) bundle.get("expo.modules.updates.HAS_EMBEDDED_UPDATE");
                    }
                    bool = boolValueOf;
                }
            }
            if (bool != null) {
                return bool.booleanValue();
            }
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Map p(Context context, Map map, boolean z10, e eVar) {
            Map mapC;
            if (eVar != null && (mapC = eVar.c()) != null) {
                if (d.f41438t.t(context, map, mapC) || z10) {
                    return mapC;
                }
                Log.w(d.f41439u, "Invalid update requestHeaders override, falling back to embedded requestHeaders - override requestHeaders: " + mapC);
            }
            return m(context, map);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:14:0x0044 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:15:0x0046  */
        /* JADX WARN: Code duplicated, block: B:17:0x005e  */
        /* JADX WARN: Code duplicated, block: B:18:0x0060  */
        /* JADX WARN: Code duplicated, block: B:20:0x0072  */
        /* JADX WARN: Code duplicated, block: B:21:0x0077  */
        /* JADX WARN: Code duplicated, block: B:23:0x0083  */
        /* JADX WARN: Code duplicated, block: B:24:0x008c  */
        /* JADX WARN: Code duplicated, block: B:26:0x0098  */
        /* JADX WARN: Code duplicated, block: B:27:0x00a1  */
        /* JADX WARN: Code duplicated, block: B:32:0x00bb  */
        public final String q(Context context, Map map) throws IOException {
            String strF;
            Bundle bundle;
            kotlin.reflect.d dVarB;
            Object objValueOf;
            String string;
            Object obj;
            if (map != null) {
                if (map.containsKey("runtimeVersion")) {
                    obj = map.get("runtimeVersion");
                    if (!(obj instanceof String)) {
                        Intrinsics.c(obj);
                        throw new AssertionError("UpdatesConfiguration failed to initialize: bad value of type " + obj.getClass().getSimpleName() + " provided for key runtimeVersion");
                    }
                } else {
                    obj = null;
                }
                strF = (String) obj;
                if (strF == null) {
                    if (context != null) {
                        bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
                        if (bundle.containsKey("expo.modules.updates.EXPO_RUNTIME_VERSION")) {
                            dVarB = F.b(Object.class);
                            if (Intrinsics.b(dVarB, F.b(String.class))) {
                                objValueOf = bundle.getString("expo.modules.updates.EXPO_RUNTIME_VERSION");
                            } else if (Intrinsics.b(dVarB, F.b(Boolean.TYPE))) {
                                objValueOf = Boolean.valueOf(bundle.getBoolean("expo.modules.updates.EXPO_RUNTIME_VERSION"));
                            } else if (Intrinsics.b(dVarB, F.b(Integer.TYPE))) {
                                objValueOf = Integer.valueOf(bundle.getInt("expo.modules.updates.EXPO_RUNTIME_VERSION"));
                            } else {
                                objValueOf = bundle.get("expo.modules.updates.EXPO_RUNTIME_VERSION");
                            }
                        } else {
                            objValueOf = null;
                        }
                        if (objValueOf != null) {
                            strF = null;
                        } else {
                            strF = null;
                        }
                    } else {
                        strF = null;
                    }
                }
            } else if (context != null) {
                bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
                if (bundle.containsKey("expo.modules.updates.EXPO_RUNTIME_VERSION")) {
                    objValueOf = null;
                } else {
                    dVarB = F.b(Object.class);
                    if (Intrinsics.b(dVarB, F.b(String.class))) {
                        objValueOf = bundle.getString("expo.modules.updates.EXPO_RUNTIME_VERSION");
                    } else if (Intrinsics.b(dVarB, F.b(Boolean.TYPE))) {
                        objValueOf = Boolean.valueOf(bundle.getBoolean("expo.modules.updates.EXPO_RUNTIME_VERSION"));
                    } else if (Intrinsics.b(dVarB, F.b(Integer.TYPE))) {
                        objValueOf = Integer.valueOf(bundle.getInt("expo.modules.updates.EXPO_RUNTIME_VERSION"));
                    } else {
                        objValueOf = bundle.get("expo.modules.updates.EXPO_RUNTIME_VERSION");
                    }
                }
                if (objValueOf != null || (string = objValueOf.toString()) == null) {
                    strF = null;
                } else {
                    strF = new Regex("^string:").f(string, "");
                }
            } else {
                strF = null;
            }
            if (context == null || !Intrinsics.b(strF, "file:fingerprint")) {
                return strF;
            }
            InputStream inputStreamOpen = context.getAssets().open("fingerprint");
            try {
                Intrinsics.c(inputStreamOpen);
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpen, Charsets.UTF_8), 8192);
                try {
                    String strH = v.h(bufferedReader);
                    kotlin.io.c.a(bufferedReader, null);
                    kotlin.io.c.a(inputStreamOpen, null);
                    return strH;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        kotlin.io.c.a(bufferedReader, th);
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    kotlin.io.c.a(inputStreamOpen, th3);
                    throw th4;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Uri r(Context context, Map map, boolean z10, e eVar) {
            return (!z10 || eVar == null) ? n(context, map) : eVar.d();
        }

        private final boolean t(Context context, Map map, Map map2) {
            return u(m(context, map), map2);
        }

        public final d i(Context context, d config, e eVar) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(config, "config");
            Map map = config.f41457r;
            return new d(context, map, j(context, map), eVar);
        }

        public final p086ed.f s(Context context, Map map) throws IOException {
            if (!l(context, map)) {
                return p086ed.f.INVALID_NOT_ENABLED;
            }
            if (r(context, map, j(context, map), context != null ? e.f41480c.b(context) : null) == null) {
                return p086ed.f.INVALID_MISSING_URL;
            }
            String strQ = q(context, map);
            return (strQ == null || strQ.length() == 0) ? p086ed.f.INVALID_MISSING_RUNTIME_VERSION : p086ed.f.VALID;
        }

        public final boolean u(Map originalEmbeddedRequestHeaders, Map map) {
            Intrinsics.checkNotNullParameter(originalEmbeddedRequestHeaders, "originalEmbeddedRequestHeaders");
            if (map == null) {
                return true;
            }
            Set setKeySet = originalEmbeddedRequestHeaders.keySet();
            ArrayList arrayList = new ArrayList(CollectionsKt.w(setKeySet, 10));
            Iterator it = setKeySet.iterator();
            while (it.hasNext()) {
                String lowerCase = ((String) it.next()).toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                arrayList.add(StringsKt.f1(lowerCase).toString());
            }
            Set setY0 = CollectionsKt.Y0(arrayList);
            Set setC = W.c("host");
            Set setKeySet2 = map.keySet();
            ArrayList arrayList2 = new ArrayList(CollectionsKt.w(setKeySet2, 10));
            Iterator it2 = setKeySet2.iterator();
            while (it2.hasNext()) {
                String lowerCase2 = ((String) it2.next()).toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
                arrayList2.add(StringsKt.f1(lowerCase2).toString());
            }
            if (!arrayList2.isEmpty()) {
                Iterator it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    if (setC.contains((String) it3.next())) {
                        return false;
                    }
                }
            }
            if (!arrayList2.isEmpty()) {
                Iterator it4 = arrayList2.iterator();
                while (it4.hasNext()) {
                    if (!setY0.contains((String) it4.next())) {
                        return false;
                    }
                }
            }
            return true;
        }
    }

    public d(Context context, Map map) {
        this(context, map, f41438t.j(context, map), context != null ? e.f41480c.b(context) : null);
    }

    /* JADX WARN: Code duplicated, block: B:113:0x02ef  */
    /* JADX WARN: Code duplicated, block: B:126:0x033c  */
    /* JADX WARN: Code duplicated, block: B:128:0x0344  */
    /* JADX WARN: Code duplicated, block: B:129:0x0346  */
    /* JADX WARN: Code duplicated, block: B:134:0x0353  */
    /* JADX WARN: Code duplicated, block: B:135:0x0357  */
    /* JADX WARN: Code duplicated, block: B:137:0x037d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:138:0x037f  */
    /* JADX WARN: Code duplicated, block: B:140:0x0397  */
    /* JADX WARN: Code duplicated, block: B:141:0x039b  */
    /* JADX WARN: Code duplicated, block: B:143:0x03ab  */
    /* JADX WARN: Code duplicated, block: B:144:0x03b0  */
    /* JADX WARN: Code duplicated, block: B:146:0x03ba  */
    /* JADX WARN: Code duplicated, block: B:147:0x03c5  */
    /* JADX WARN: Code duplicated, block: B:149:0x03cf  */
    /* JADX WARN: Code duplicated, block: B:14:0x0053 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:150:0x03da  */
    /* JADX WARN: Code duplicated, block: B:153:0x03e3  */
    /* JADX WARN: Code duplicated, block: B:158:0x03f1  */
    /* JADX WARN: Code duplicated, block: B:15:0x0055  */
    /* JADX WARN: Code duplicated, block: B:160:0x03f9  */
    /* JADX WARN: Code duplicated, block: B:161:0x03fd  */
    /* JADX WARN: Code duplicated, block: B:165:0x040b  */
    /* JADX WARN: Code duplicated, block: B:166:0x0413  */
    /* JADX WARN: Code duplicated, block: B:168:0x0439  */
    /* JADX WARN: Code duplicated, block: B:170:0x043d  */
    /* JADX WARN: Code duplicated, block: B:173:0x0456  */
    /* JADX WARN: Code duplicated, block: B:175:0x0466  */
    /* JADX WARN: Code duplicated, block: B:176:0x046d  */
    /* JADX WARN: Code duplicated, block: B:178:0x0477  */
    /* JADX WARN: Code duplicated, block: B:179:0x0480  */
    /* JADX WARN: Code duplicated, block: B:17:0x006b  */
    /* JADX WARN: Code duplicated, block: B:181:0x048a  */
    /* JADX WARN: Code duplicated, block: B:182:0x0495  */
    /* JADX WARN: Code duplicated, block: B:183:0x049c  */
    /* JADX WARN: Code duplicated, block: B:185:0x04a1  */
    /* JADX WARN: Code duplicated, block: B:186:0x04a6  */
    /* JADX WARN: Code duplicated, block: B:188:0x04a9  */
    /* JADX WARN: Code duplicated, block: B:18:0x006d  */
    /* JADX WARN: Code duplicated, block: B:190:0x04b1  */
    /* JADX WARN: Code duplicated, block: B:191:0x04b3  */
    /* JADX WARN: Code duplicated, block: B:195:0x04bf  */
    /* JADX WARN: Code duplicated, block: B:196:0x04c7  */
    /* JADX WARN: Code duplicated, block: B:198:0x04ed A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:199:0x04ef  */
    /* JADX WARN: Code duplicated, block: B:202:0x0508  */
    /* JADX WARN: Code duplicated, block: B:204:0x0518  */
    /* JADX WARN: Code duplicated, block: B:205:0x051f  */
    /* JADX WARN: Code duplicated, block: B:207:0x0529  */
    /* JADX WARN: Code duplicated, block: B:208:0x0532  */
    /* JADX WARN: Code duplicated, block: B:20:0x007b  */
    /* JADX WARN: Code duplicated, block: B:210:0x053c  */
    /* JADX WARN: Code duplicated, block: B:211:0x0547  */
    /* JADX WARN: Code duplicated, block: B:212:0x054e  */
    /* JADX WARN: Code duplicated, block: B:214:0x0553  */
    /* JADX WARN: Code duplicated, block: B:215:0x0558  */
    /* JADX WARN: Code duplicated, block: B:217:0x055b  */
    /* JADX WARN: Code duplicated, block: B:219:0x0563  */
    /* JADX WARN: Code duplicated, block: B:220:0x0565  */
    /* JADX WARN: Code duplicated, block: B:224:0x0571  */
    /* JADX WARN: Code duplicated, block: B:225:0x0577  */
    /* JADX WARN: Code duplicated, block: B:227:0x059d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:228:0x059f  */
    /* JADX WARN: Code duplicated, block: B:22:0x0081  */
    /* JADX WARN: Code duplicated, block: B:231:0x05b8  */
    /* JADX WARN: Code duplicated, block: B:233:0x05c6  */
    /* JADX WARN: Code duplicated, block: B:234:0x05cd  */
    /* JADX WARN: Code duplicated, block: B:236:0x05d7  */
    /* JADX WARN: Code duplicated, block: B:237:0x05e0  */
    /* JADX WARN: Code duplicated, block: B:239:0x05ea  */
    /* JADX WARN: Code duplicated, block: B:240:0x05f5  */
    /* JADX WARN: Code duplicated, block: B:242:0x05fe  */
    /* JADX WARN: Code duplicated, block: B:244:0x0602  */
    /* JADX WARN: Code duplicated, block: B:245:0x0607  */
    /* JADX WARN: Code duplicated, block: B:248:0x060e  */
    /* JADX WARN: Code duplicated, block: B:24:0x008b  */
    /* JADX WARN: Code duplicated, block: B:250:0x062c  */
    /* JADX WARN: Code duplicated, block: B:25:0x0096  */
    /* JADX WARN: Code duplicated, block: B:27:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:28:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:41:0x0117 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x0119  */
    /* JADX WARN: Code duplicated, block: B:45:0x0132  */
    /* JADX WARN: Code duplicated, block: B:47:0x0144  */
    /* JADX WARN: Code duplicated, block: B:48:0x014b  */
    /* JADX WARN: Code duplicated, block: B:50:0x0155  */
    /* JADX WARN: Code duplicated, block: B:51:0x0160  */
    /* JADX WARN: Code duplicated, block: B:53:0x016a  */
    /* JADX WARN: Code duplicated, block: B:54:0x0173  */
    /* JADX WARN: Code duplicated, block: B:55:0x017a  */
    /* JADX WARN: Code duplicated, block: B:57:0x017f  */
    /* JADX WARN: Code duplicated, block: B:58:0x0184  */
    /* JADX WARN: Code duplicated, block: B:75:0x01ea A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:76:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:78:0x0204  */
    /* JADX WARN: Code duplicated, block: B:79:0x0208  */
    /* JADX WARN: Code duplicated, block: B:81:0x0218  */
    /* JADX WARN: Code duplicated, block: B:82:0x021d  */
    /* JADX WARN: Code duplicated, block: B:84:0x0227  */
    /* JADX WARN: Code duplicated, block: B:85:0x0232  */
    /* JADX WARN: Code duplicated, block: B:87:0x023c  */
    /* JADX WARN: Code duplicated, block: B:88:0x0247  */
    /* JADX WARN: Code duplicated, block: B:91:0x0250  */
    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Instruction removed from duplicated block: B:135:0x0357, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:166:0x0413, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:196:0x04c7, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:225:0x0577, please report this as an issue */
    public d(Context context, Map map, boolean z10, e eVar) throws Exception {
        String str;
        Bundle bundle;
        kotlin.reflect.d dVarB;
        String string;
        Class cls;
        Integer numValueOf;
        int iIntValue;
        Bundle bundle2;
        kotlin.reflect.d dVarB2;
        Class cls2;
        String string2;
        a aVarValueOf;
        Bundle bundle3;
        kotlin.reflect.d dVarB3;
        String string3;
        String str2;
        String string4;
        Map mapD;
        Bundle bundle4;
        kotlin.reflect.d dVarB4;
        Class<Boolean> cls3;
        Map map2;
        Boolean boolValueOf;
        boolean zBooleanValue;
        Bundle bundle5;
        kotlin.reflect.d dVarB5;
        boolean z11;
        Boolean boolValueOf2;
        boolean zBooleanValue2;
        Bundle bundle6;
        kotlin.reflect.d dVarB6;
        Boolean bool;
        boolean zBooleanValue3;
        Bundle bundle7;
        kotlin.reflect.d dVarB7;
        Boolean boolValueOf3;
        Uri uri;
        boolean z12;
        Object obj;
        Boolean bool2;
        Object obj2;
        Boolean bool3;
        Object obj3;
        Boolean bool4;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        Class cls4 = Integer.TYPE;
        Class cls5 = Boolean.TYPE;
        if (map != null) {
            if (map.containsKey("scopeKey")) {
                obj8 = map.get("scopeKey");
                if (!(obj8 instanceof String)) {
                    Intrinsics.c(obj8);
                    throw new AssertionError("UpdatesConfiguration failed to initialize: bad value of type " + obj8.getClass().getSimpleName() + " provided for key scopeKey");
                }
            } else {
                obj8 = null;
            }
            str = (String) obj8;
            if (str == null) {
                if (context != null) {
                    bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
                    if (bundle.containsKey("expo.modules.updates.EXPO_SCOPE_KEY")) {
                        dVarB = F.b(String.class);
                        if (Intrinsics.b(dVarB, F.b(String.class))) {
                            string = bundle.getString("expo.modules.updates.EXPO_SCOPE_KEY");
                        } else if (Intrinsics.b(dVarB, F.b(cls5))) {
                            string = (String) Boolean.valueOf(bundle.getBoolean("expo.modules.updates.EXPO_SCOPE_KEY"));
                        } else if (Intrinsics.b(dVarB, F.b(cls4))) {
                            string = (String) Integer.valueOf(bundle.getInt("expo.modules.updates.EXPO_SCOPE_KEY"));
                        } else {
                            string = (String) bundle.get("expo.modules.updates.EXPO_SCOPE_KEY");
                        }
                        str = string;
                    } else {
                        str = null;
                    }
                } else {
                    str = null;
                }
            }
        } else if (context != null) {
            bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
            if (bundle.containsKey("expo.modules.updates.EXPO_SCOPE_KEY")) {
                str = null;
            } else {
                dVarB = F.b(String.class);
                if (Intrinsics.b(dVarB, F.b(String.class))) {
                    string = bundle.getString("expo.modules.updates.EXPO_SCOPE_KEY");
                } else if (Intrinsics.b(dVarB, F.b(cls5))) {
                    string = (String) Boolean.valueOf(bundle.getBoolean("expo.modules.updates.EXPO_SCOPE_KEY"));
                } else if (Intrinsics.b(dVarB, F.b(cls4))) {
                    string = (String) Integer.valueOf(bundle.getInt("expo.modules.updates.EXPO_SCOPE_KEY"));
                } else {
                    string = (String) bundle.get("expo.modules.updates.EXPO_SCOPE_KEY");
                }
                str = string;
            }
        } else {
            str = null;
        }
        b bVar = f41438t;
        Uri uriR = bVar.r(context, map, z10, eVar);
        Intrinsics.c(uriR);
        String strD = p086ed.e.d(str, uriR);
        Uri uriR2 = bVar.r(context, map, z10, eVar);
        Intrinsics.c(uriR2);
        Uri uriN = bVar.n(context, map);
        Intrinsics.c(uriN);
        String strQ = bVar.q(context, map);
        if (map == null) {
            if (context != null) {
                bundle2 = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
                if (bundle2.containsKey("expo.modules.updates.EXPO_UPDATES_LAUNCH_WAIT_MS")) {
                    dVarB2 = F.b(Integer.class);
                    cls = cls4;
                    if (Intrinsics.b(dVarB2, F.b(String.class))) {
                        numValueOf = (Integer) bundle2.getString("expo.modules.updates.EXPO_UPDATES_LAUNCH_WAIT_MS");
                    } else if (Intrinsics.b(dVarB2, F.b(cls5))) {
                        numValueOf = (Integer) Boolean.valueOf(bundle2.getBoolean("expo.modules.updates.EXPO_UPDATES_LAUNCH_WAIT_MS"));
                    } else if (Intrinsics.b(dVarB2, F.b(cls))) {
                        numValueOf = Integer.valueOf(bundle2.getInt("expo.modules.updates.EXPO_UPDATES_LAUNCH_WAIT_MS"));
                    } else {
                        numValueOf = (Integer) bundle2.get("expo.modules.updates.EXPO_UPDATES_LAUNCH_WAIT_MS");
                    }
                } else {
                    cls = cls4;
                    numValueOf = null;
                }
            } else {
                cls = cls4;
                numValueOf = null;
            }
            if (numValueOf != null) {
                iIntValue = numValueOf.intValue();
            } else {
                iIntValue = 0;
            }
        } else {
            if (map.containsKey("launchWaitMs")) {
                obj7 = map.get("launchWaitMs");
                if (!(obj7 instanceof Integer)) {
                    Intrinsics.c(obj7);
                    throw new AssertionError("UpdatesConfiguration failed to initialize: bad value of type " + obj7.getClass().getSimpleName() + " provided for key launchWaitMs");
                }
            } else {
                obj7 = null;
            }
            Integer num = (Integer) obj7;
            if (num != null) {
                iIntValue = num.intValue();
                cls = cls4;
            } else {
                if (context != null) {
                    bundle2 = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
                    if (bundle2.containsKey("expo.modules.updates.EXPO_UPDATES_LAUNCH_WAIT_MS")) {
                        cls = cls4;
                        numValueOf = null;
                    } else {
                        dVarB2 = F.b(Integer.class);
                        cls = cls4;
                        if (Intrinsics.b(dVarB2, F.b(String.class))) {
                            numValueOf = (Integer) bundle2.getString("expo.modules.updates.EXPO_UPDATES_LAUNCH_WAIT_MS");
                        } else if (Intrinsics.b(dVarB2, F.b(cls5))) {
                            numValueOf = (Integer) Boolean.valueOf(bundle2.getBoolean("expo.modules.updates.EXPO_UPDATES_LAUNCH_WAIT_MS"));
                        } else if (Intrinsics.b(dVarB2, F.b(cls))) {
                            numValueOf = Integer.valueOf(bundle2.getInt("expo.modules.updates.EXPO_UPDATES_LAUNCH_WAIT_MS"));
                        } else {
                            numValueOf = (Integer) bundle2.get("expo.modules.updates.EXPO_UPDATES_LAUNCH_WAIT_MS");
                        }
                    }
                } else {
                    cls = cls4;
                    numValueOf = null;
                }
                if (numValueOf != null) {
                    iIntValue = numValueOf.intValue();
                } else {
                    iIntValue = 0;
                }
            }
        }
        if (map == null) {
            try {
                if (context != null) {
                    bundle3 = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
                    if (bundle3.containsKey("expo.modules.updates.EXPO_UPDATES_CHECK_ON_LAUNCH")) {
                        dVarB3 = F.b(String.class);
                        cls2 = cls5;
                        if (Intrinsics.b(dVarB3, F.b(String.class))) {
                            string2 = bundle3.getString("expo.modules.updates.EXPO_UPDATES_CHECK_ON_LAUNCH");
                        } else if (Intrinsics.b(dVarB3, F.b(cls2))) {
                            string2 = (String) Boolean.valueOf(bundle3.getBoolean("expo.modules.updates.EXPO_UPDATES_CHECK_ON_LAUNCH"));
                        } else if (Intrinsics.b(dVarB3, F.b(cls))) {
                            string2 = (String) Integer.valueOf(bundle3.getInt("expo.modules.updates.EXPO_UPDATES_CHECK_ON_LAUNCH"));
                        } else {
                            string2 = (String) bundle3.get("expo.modules.updates.EXPO_UPDATES_CHECK_ON_LAUNCH");
                        }
                    } else {
                        cls2 = cls5;
                        string2 = null;
                    }
                    if (string2 == null) {
                    }
                    aVarValueOf = a.valueOf(string2);
                } else {
                    cls2 = cls5;
                }
                aVarValueOf = a.valueOf(string2);
            } catch (IllegalArgumentException unused) {
                Log.e(f41439u, "Invalid value " + string2 + " for expo.modules.updates.EXPO_UPDATES_CHECK_ON_LAUNCH in AndroidManifest; defaulting to ALWAYS");
                aVarValueOf = a.f41462d;
            }
            string2 = "ALWAYS";
        } else {
            if (map.containsKey("checkOnLaunch")) {
                obj6 = map.get("checkOnLaunch");
                if (!(obj6 instanceof String)) {
                    Intrinsics.c(obj6);
                    throw new AssertionError("UpdatesConfiguration failed to initialize: bad value of type " + obj6.getClass().getSimpleName() + " provided for key checkOnLaunch");
                }
            } else {
                obj6 = null;
            }
            String str3 = (String) obj6;
            if (str3 != null) {
                try {
                    aVarValueOf = a.valueOf(str3);
                    if (aVarValueOf == null) {
                        if (context != null) {
                            bundle3 = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
                            if (bundle3.containsKey("expo.modules.updates.EXPO_UPDATES_CHECK_ON_LAUNCH")) {
                                cls2 = cls5;
                                string2 = null;
                            } else {
                                dVarB3 = F.b(String.class);
                                cls2 = cls5;
                                if (Intrinsics.b(dVarB3, F.b(String.class))) {
                                    string2 = bundle3.getString("expo.modules.updates.EXPO_UPDATES_CHECK_ON_LAUNCH");
                                } else if (Intrinsics.b(dVarB3, F.b(cls2))) {
                                    string2 = (String) Boolean.valueOf(bundle3.getBoolean("expo.modules.updates.EXPO_UPDATES_CHECK_ON_LAUNCH"));
                                } else if (Intrinsics.b(dVarB3, F.b(cls))) {
                                    string2 = (String) Integer.valueOf(bundle3.getInt("expo.modules.updates.EXPO_UPDATES_CHECK_ON_LAUNCH"));
                                } else {
                                    string2 = (String) bundle3.get("expo.modules.updates.EXPO_UPDATES_CHECK_ON_LAUNCH");
                                }
                            }
                            if (string2 == null) {
                            }
                            aVarValueOf = a.valueOf(string2);
                        } else {
                            cls2 = cls5;
                        }
                        string2 = "ALWAYS";
                        aVarValueOf = a.valueOf(string2);
                    } else {
                        cls2 = cls5;
                    }
                } catch (IllegalArgumentException unused2) {
                    throw new AssertionError("UpdatesConfiguration failed to initialize: invalid value " + str3 + " provided for checkOnLaunch");
                }
            } else {
                if (context != null) {
                    bundle3 = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
                    if (bundle3.containsKey("expo.modules.updates.EXPO_UPDATES_CHECK_ON_LAUNCH")) {
                        cls2 = cls5;
                        string2 = null;
                    } else {
                        dVarB3 = F.b(String.class);
                        cls2 = cls5;
                        if (Intrinsics.b(dVarB3, F.b(String.class))) {
                            string2 = bundle3.getString("expo.modules.updates.EXPO_UPDATES_CHECK_ON_LAUNCH");
                        } else if (Intrinsics.b(dVarB3, F.b(cls2))) {
                            string2 = (String) Boolean.valueOf(bundle3.getBoolean("expo.modules.updates.EXPO_UPDATES_CHECK_ON_LAUNCH"));
                        } else if (Intrinsics.b(dVarB3, F.b(cls))) {
                            string2 = (String) Integer.valueOf(bundle3.getInt("expo.modules.updates.EXPO_UPDATES_CHECK_ON_LAUNCH"));
                        } else {
                            string2 = (String) bundle3.get("expo.modules.updates.EXPO_UPDATES_CHECK_ON_LAUNCH");
                        }
                    }
                    if (string2 == null) {
                    }
                    aVarValueOf = a.valueOf(string2);
                } else {
                    cls2 = cls5;
                }
                string2 = "ALWAYS";
                aVarValueOf = a.valueOf(string2);
            }
        }
        b bVar2 = f41438t;
        boolean zK = bVar2.k(context, map, z10, eVar);
        boolean zO = bVar2.o(context, map);
        Map mapP = bVar2.p(context, map, z10, eVar);
        Map mapM = bVar2.m(context, map);
        if (map != null) {
            if (map.containsKey("codeSigningCertificate")) {
                obj5 = map.get("codeSigningCertificate");
                if (!(obj5 instanceof String)) {
                    Intrinsics.c(obj5);
                    throw new AssertionError("UpdatesConfiguration failed to initialize: bad value of type " + obj5.getClass().getSimpleName() + " provided for key codeSigningCertificate");
                }
            } else {
                obj5 = null;
            }
            string3 = (String) obj5;
            if (string3 == null) {
            }
            if (map == null) {
                if (context != null) {
                    bundle4 = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
                    if (bundle4.containsKey("expo.modules.updates.CODE_SIGNING_METADATA")) {
                        dVarB4 = F.b(String.class);
                        str2 = string3;
                        if (Intrinsics.b(dVarB4, F.b(String.class))) {
                            string4 = bundle4.getString("expo.modules.updates.CODE_SIGNING_METADATA");
                        } else if (Intrinsics.b(dVarB4, F.b(cls2))) {
                            string4 = (String) Boolean.valueOf(bundle4.getBoolean("expo.modules.updates.CODE_SIGNING_METADATA"));
                        } else if (Intrinsics.b(dVarB4, F.b(cls))) {
                            string4 = (String) Integer.valueOf(bundle4.getInt("expo.modules.updates.CODE_SIGNING_METADATA"));
                        } else {
                            string4 = (String) bundle4.get("expo.modules.updates.CODE_SIGNING_METADATA");
                        }
                    } else {
                        str2 = string3;
                        string4 = null;
                    }
                    if (string4 == null) {
                    }
                    mapD = h.f41502a.d(string4);
                } else {
                    str2 = string3;
                }
                string4 = "{}";
                mapD = h.f41502a.d(string4);
            } else {
                if (map.containsKey("codeSigningMetadata")) {
                    obj4 = map.get("codeSigningMetadata");
                    if (!(obj4 instanceof Map)) {
                        Intrinsics.c(obj4);
                        throw new AssertionError("UpdatesConfiguration failed to initialize: bad value of type " + obj4.getClass().getSimpleName() + " provided for key codeSigningMetadata");
                    }
                } else {
                    obj4 = null;
                }
                mapD = (Map) obj4;
                if (mapD == null) {
                    if (context != null) {
                        bundle4 = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
                        if (bundle4.containsKey("expo.modules.updates.CODE_SIGNING_METADATA")) {
                            str2 = string3;
                            string4 = null;
                        } else {
                            dVarB4 = F.b(String.class);
                            str2 = string3;
                            if (Intrinsics.b(dVarB4, F.b(String.class))) {
                                string4 = bundle4.getString("expo.modules.updates.CODE_SIGNING_METADATA");
                            } else if (Intrinsics.b(dVarB4, F.b(cls2))) {
                                string4 = (String) Boolean.valueOf(bundle4.getBoolean("expo.modules.updates.CODE_SIGNING_METADATA"));
                            } else if (Intrinsics.b(dVarB4, F.b(cls))) {
                                string4 = (String) Integer.valueOf(bundle4.getInt("expo.modules.updates.CODE_SIGNING_METADATA"));
                            } else {
                                string4 = (String) bundle4.get("expo.modules.updates.CODE_SIGNING_METADATA");
                            }
                        }
                        if (string4 == null) {
                        }
                        mapD = h.f41502a.d(string4);
                    } else {
                        str2 = string3;
                    }
                    string4 = "{}";
                    mapD = h.f41502a.d(string4);
                } else {
                    str2 = string3;
                }
            }
            cls3 = Boolean.class;
            if (map != null) {
                if (map.containsKey("codeSigningIncludeManifestResponseCertificateChain")) {
                    obj3 = map.get("codeSigningIncludeManifestResponseCertificateChain");
                    if (!(obj3 instanceof Boolean)) {
                        Intrinsics.c(obj3);
                        throw new AssertionError("UpdatesConfiguration failed to initialize: bad value of type " + obj3.getClass().getSimpleName() + " provided for key codeSigningIncludeManifestResponseCertificateChain");
                    }
                } else {
                    obj3 = null;
                }
                bool4 = (Boolean) obj3;
                if (bool4 != null) {
                    zBooleanValue = bool4.booleanValue();
                    map2 = mapD;
                }
                if (map == null) {
                    if (context != null) {
                        bundle6 = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
                        if (bundle6.containsKey("expo.modules.updates.CODE_SIGNING_ALLOW_UNSIGNED_MANIFESTS")) {
                            dVarB6 = F.b(cls3);
                            z11 = zBooleanValue;
                            if (Intrinsics.b(dVarB6, F.b(String.class))) {
                                boolValueOf2 = (Boolean) bundle6.getString("expo.modules.updates.CODE_SIGNING_ALLOW_UNSIGNED_MANIFESTS");
                            } else if (Intrinsics.b(dVarB6, F.b(cls2))) {
                                boolValueOf2 = Boolean.valueOf(bundle6.getBoolean("expo.modules.updates.CODE_SIGNING_ALLOW_UNSIGNED_MANIFESTS"));
                            } else if (Intrinsics.b(dVarB6, F.b(cls))) {
                                boolValueOf2 = (Boolean) Integer.valueOf(bundle6.getInt("expo.modules.updates.CODE_SIGNING_ALLOW_UNSIGNED_MANIFESTS"));
                            } else {
                                boolValueOf2 = (Boolean) bundle6.get("expo.modules.updates.CODE_SIGNING_ALLOW_UNSIGNED_MANIFESTS");
                            }
                        } else {
                            z11 = zBooleanValue;
                            boolValueOf2 = null;
                        }
                    } else {
                        z11 = zBooleanValue;
                        boolValueOf2 = null;
                    }
                    if (boolValueOf2 != null) {
                        zBooleanValue2 = boolValueOf2.booleanValue();
                    } else {
                        zBooleanValue2 = false;
                    }
                } else {
                    if (map.containsKey("codeSigningAllowUnsignedManifests")) {
                        obj2 = map.get("codeSigningAllowUnsignedManifests");
                        if (!(obj2 instanceof Boolean)) {
                            Intrinsics.c(obj2);
                            throw new AssertionError("UpdatesConfiguration failed to initialize: bad value of type " + obj2.getClass().getSimpleName() + " provided for key codeSigningAllowUnsignedManifests");
                        }
                    } else {
                        obj2 = null;
                    }
                    bool3 = (Boolean) obj2;
                    if (bool3 != null) {
                        zBooleanValue2 = bool3.booleanValue();
                        z11 = zBooleanValue;
                    } else {
                        if (context != null) {
                            bundle6 = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
                            if (bundle6.containsKey("expo.modules.updates.CODE_SIGNING_ALLOW_UNSIGNED_MANIFESTS")) {
                                z11 = zBooleanValue;
                                boolValueOf2 = null;
                            } else {
                                dVarB6 = F.b(cls3);
                                z11 = zBooleanValue;
                                if (Intrinsics.b(dVarB6, F.b(String.class))) {
                                    boolValueOf2 = (Boolean) bundle6.getString("expo.modules.updates.CODE_SIGNING_ALLOW_UNSIGNED_MANIFESTS");
                                } else if (Intrinsics.b(dVarB6, F.b(cls2))) {
                                    boolValueOf2 = Boolean.valueOf(bundle6.getBoolean("expo.modules.updates.CODE_SIGNING_ALLOW_UNSIGNED_MANIFESTS"));
                                } else if (Intrinsics.b(dVarB6, F.b(cls))) {
                                    boolValueOf2 = (Boolean) Integer.valueOf(bundle6.getInt("expo.modules.updates.CODE_SIGNING_ALLOW_UNSIGNED_MANIFESTS"));
                                } else {
                                    boolValueOf2 = (Boolean) bundle6.get("expo.modules.updates.CODE_SIGNING_ALLOW_UNSIGNED_MANIFESTS");
                                }
                            }
                        } else {
                            z11 = zBooleanValue;
                            boolValueOf2 = null;
                        }
                        if (boolValueOf2 != null) {
                            zBooleanValue2 = boolValueOf2.booleanValue();
                        } else {
                            zBooleanValue2 = false;
                        }
                    }
                }
                if (map == null) {
                    if (context != null) {
                        bundle7 = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
                        if (bundle7.containsKey("expo.modules.updates.ENABLE_EXPO_UPDATES_PROTOCOL_V0_COMPATIBILITY_MODE")) {
                            dVarB7 = F.b(cls3);
                            if (Intrinsics.b(dVarB7, F.b(String.class))) {
                                boolValueOf3 = (Boolean) bundle7.getString("expo.modules.updates.ENABLE_EXPO_UPDATES_PROTOCOL_V0_COMPATIBILITY_MODE");
                            } else if (Intrinsics.b(dVarB7, F.b(cls2))) {
                                boolValueOf3 = Boolean.valueOf(bundle7.getBoolean("expo.modules.updates.ENABLE_EXPO_UPDATES_PROTOCOL_V0_COMPATIBILITY_MODE"));
                            } else if (Intrinsics.b(dVarB7, F.b(cls))) {
                                boolValueOf3 = (Boolean) Integer.valueOf(bundle7.getInt("expo.modules.updates.ENABLE_EXPO_UPDATES_PROTOCOL_V0_COMPATIBILITY_MODE"));
                            } else {
                                boolValueOf3 = (Boolean) bundle7.get("expo.modules.updates.ENABLE_EXPO_UPDATES_PROTOCOL_V0_COMPATIBILITY_MODE");
                            }
                            bool = boolValueOf3;
                        } else {
                            bool = null;
                        }
                    } else {
                        bool = null;
                    }
                    if (bool != null) {
                        zBooleanValue3 = bool.booleanValue();
                    } else {
                        zBooleanValue3 = false;
                    }
                } else {
                    if (map.containsKey("enableExpoUpdatesProtocolCompatibilityMode")) {
                        obj = map.get("enableExpoUpdatesProtocolCompatibilityMode");
                        if (!(obj instanceof Boolean)) {
                            Intrinsics.c(obj);
                            throw new AssertionError("UpdatesConfiguration failed to initialize: bad value of type " + obj.getClass().getSimpleName() + " provided for key enableExpoUpdatesProtocolCompatibilityMode");
                        }
                    } else {
                        obj = null;
                    }
                    bool2 = (Boolean) obj;
                    if (bool2 != null) {
                        zBooleanValue3 = bool2.booleanValue();
                    } else {
                        if (context != null) {
                            bundle7 = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
                            if (bundle7.containsKey("expo.modules.updates.ENABLE_EXPO_UPDATES_PROTOCOL_V0_COMPATIBILITY_MODE")) {
                                bool = null;
                            } else {
                                dVarB7 = F.b(cls3);
                                if (Intrinsics.b(dVarB7, F.b(String.class))) {
                                    boolValueOf3 = (Boolean) bundle7.getString("expo.modules.updates.ENABLE_EXPO_UPDATES_PROTOCOL_V0_COMPATIBILITY_MODE");
                                } else if (Intrinsics.b(dVarB7, F.b(cls2))) {
                                    boolValueOf3 = Boolean.valueOf(bundle7.getBoolean("expo.modules.updates.ENABLE_EXPO_UPDATES_PROTOCOL_V0_COMPATIBILITY_MODE"));
                                } else if (Intrinsics.b(dVarB7, F.b(cls))) {
                                    boolValueOf3 = (Boolean) Integer.valueOf(bundle7.getInt("expo.modules.updates.ENABLE_EXPO_UPDATES_PROTOCOL_V0_COMPATIBILITY_MODE"));
                                } else {
                                    boolValueOf3 = (Boolean) bundle7.get("expo.modules.updates.ENABLE_EXPO_UPDATES_PROTOCOL_V0_COMPATIBILITY_MODE");
                                }
                                bool = boolValueOf3;
                            }
                        } else {
                            bool = null;
                        }
                        if (bool != null) {
                            zBooleanValue3 = bool.booleanValue();
                        } else {
                            zBooleanValue3 = false;
                        }
                    }
                }
                boolean zJ = bVar2.j(context, map);
                if (eVar != null) {
                    uri = uriN;
                    z12 = true;
                } else {
                    uri = uriN;
                    z12 = false;
                }
                this(strD, uriR2, uri, strQ, iIntValue, aVarValueOf, zK, zO, mapP, mapM, str2, map2, z11, zBooleanValue2, zBooleanValue3, zJ, z12, map);
            }
            cls3 = cls3;
            if (context != null) {
                bundle5 = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
                if (bundle5.containsKey("expo.modules.updates.CODE_SIGNING_INCLUDE_MANIFEST_RESPONSE_CERTIFICATE_CHAIN")) {
                    dVarB5 = F.b(cls3);
                    map2 = mapD;
                    if (Intrinsics.b(dVarB5, F.b(String.class))) {
                        boolValueOf = (Boolean) bundle5.getString("expo.modules.updates.CODE_SIGNING_INCLUDE_MANIFEST_RESPONSE_CERTIFICATE_CHAIN");
                    } else if (Intrinsics.b(dVarB5, F.b(cls2))) {
                        boolValueOf = Boolean.valueOf(bundle5.getBoolean("expo.modules.updates.CODE_SIGNING_INCLUDE_MANIFEST_RESPONSE_CERTIFICATE_CHAIN"));
                    } else if (Intrinsics.b(dVarB5, F.b(cls))) {
                        boolValueOf = (Boolean) Integer.valueOf(bundle5.getInt("expo.modules.updates.CODE_SIGNING_INCLUDE_MANIFEST_RESPONSE_CERTIFICATE_CHAIN"));
                    } else {
                        boolValueOf = (Boolean) bundle5.get("expo.modules.updates.CODE_SIGNING_INCLUDE_MANIFEST_RESPONSE_CERTIFICATE_CHAIN");
                    }
                } else {
                    map2 = mapD;
                    boolValueOf = null;
                }
            } else {
                map2 = mapD;
                boolValueOf = null;
            }
            if (boolValueOf != null) {
                zBooleanValue = boolValueOf.booleanValue();
            } else {
                zBooleanValue = false;
            }
            if (map == null) {
                if (context != null) {
                    bundle6 = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
                    if (bundle6.containsKey("expo.modules.updates.CODE_SIGNING_ALLOW_UNSIGNED_MANIFESTS")) {
                        z11 = zBooleanValue;
                        boolValueOf2 = null;
                    } else {
                        dVarB6 = F.b(cls3);
                        z11 = zBooleanValue;
                        if (Intrinsics.b(dVarB6, F.b(String.class))) {
                            boolValueOf2 = (Boolean) bundle6.getString("expo.modules.updates.CODE_SIGNING_ALLOW_UNSIGNED_MANIFESTS");
                        } else if (Intrinsics.b(dVarB6, F.b(cls2))) {
                            boolValueOf2 = Boolean.valueOf(bundle6.getBoolean("expo.modules.updates.CODE_SIGNING_ALLOW_UNSIGNED_MANIFESTS"));
                        } else if (Intrinsics.b(dVarB6, F.b(cls))) {
                            boolValueOf2 = (Boolean) Integer.valueOf(bundle6.getInt("expo.modules.updates.CODE_SIGNING_ALLOW_UNSIGNED_MANIFESTS"));
                        } else {
                            boolValueOf2 = (Boolean) bundle6.get("expo.modules.updates.CODE_SIGNING_ALLOW_UNSIGNED_MANIFESTS");
                        }
                    }
                } else {
                    z11 = zBooleanValue;
                    boolValueOf2 = null;
                }
                if (boolValueOf2 != null) {
                    zBooleanValue2 = boolValueOf2.booleanValue();
                } else {
                    zBooleanValue2 = false;
                }
            } else {
                if (map.containsKey("codeSigningAllowUnsignedManifests")) {
                    obj2 = null;
                } else {
                    obj2 = map.get("codeSigningAllowUnsignedManifests");
                    if (!(obj2 instanceof Boolean)) {
                        Intrinsics.c(obj2);
                        throw new AssertionError("UpdatesConfiguration failed to initialize: bad value of type " + obj2.getClass().getSimpleName() + " provided for key codeSigningAllowUnsignedManifests");
                    }
                }
                bool3 = (Boolean) obj2;
                if (bool3 != null) {
                    zBooleanValue2 = bool3.booleanValue();
                    z11 = zBooleanValue;
                } else {
                    if (context != null) {
                        bundle6 = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
                        if (bundle6.containsKey("expo.modules.updates.CODE_SIGNING_ALLOW_UNSIGNED_MANIFESTS")) {
                            z11 = zBooleanValue;
                            boolValueOf2 = null;
                        } else {
                            dVarB6 = F.b(cls3);
                            z11 = zBooleanValue;
                            if (Intrinsics.b(dVarB6, F.b(String.class))) {
                                boolValueOf2 = (Boolean) bundle6.getString("expo.modules.updates.CODE_SIGNING_ALLOW_UNSIGNED_MANIFESTS");
                            } else if (Intrinsics.b(dVarB6, F.b(cls2))) {
                                boolValueOf2 = Boolean.valueOf(bundle6.getBoolean("expo.modules.updates.CODE_SIGNING_ALLOW_UNSIGNED_MANIFESTS"));
                            } else if (Intrinsics.b(dVarB6, F.b(cls))) {
                                boolValueOf2 = (Boolean) Integer.valueOf(bundle6.getInt("expo.modules.updates.CODE_SIGNING_ALLOW_UNSIGNED_MANIFESTS"));
                            } else {
                                boolValueOf2 = (Boolean) bundle6.get("expo.modules.updates.CODE_SIGNING_ALLOW_UNSIGNED_MANIFESTS");
                            }
                        }
                    } else {
                        z11 = zBooleanValue;
                        boolValueOf2 = null;
                    }
                    if (boolValueOf2 != null) {
                        zBooleanValue2 = boolValueOf2.booleanValue();
                    } else {
                        zBooleanValue2 = false;
                    }
                }
            }
            if (map == null) {
                if (context != null) {
                    bundle7 = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
                    if (bundle7.containsKey("expo.modules.updates.ENABLE_EXPO_UPDATES_PROTOCOL_V0_COMPATIBILITY_MODE")) {
                        bool = null;
                    } else {
                        dVarB7 = F.b(cls3);
                        if (Intrinsics.b(dVarB7, F.b(String.class))) {
                            boolValueOf3 = (Boolean) bundle7.getString("expo.modules.updates.ENABLE_EXPO_UPDATES_PROTOCOL_V0_COMPATIBILITY_MODE");
                        } else if (Intrinsics.b(dVarB7, F.b(cls2))) {
                            boolValueOf3 = Boolean.valueOf(bundle7.getBoolean("expo.modules.updates.ENABLE_EXPO_UPDATES_PROTOCOL_V0_COMPATIBILITY_MODE"));
                        } else if (Intrinsics.b(dVarB7, F.b(cls))) {
                            boolValueOf3 = (Boolean) Integer.valueOf(bundle7.getInt("expo.modules.updates.ENABLE_EXPO_UPDATES_PROTOCOL_V0_COMPATIBILITY_MODE"));
                        } else {
                            boolValueOf3 = (Boolean) bundle7.get("expo.modules.updates.ENABLE_EXPO_UPDATES_PROTOCOL_V0_COMPATIBILITY_MODE");
                        }
                        bool = boolValueOf3;
                    }
                } else {
                    bool = null;
                }
                if (bool != null) {
                    zBooleanValue3 = bool.booleanValue();
                } else {
                    zBooleanValue3 = false;
                }
            } else {
                if (map.containsKey("enableExpoUpdatesProtocolCompatibilityMode")) {
                    obj = null;
                } else {
                    obj = map.get("enableExpoUpdatesProtocolCompatibilityMode");
                    if (!(obj instanceof Boolean)) {
                        Intrinsics.c(obj);
                        throw new AssertionError("UpdatesConfiguration failed to initialize: bad value of type " + obj.getClass().getSimpleName() + " provided for key enableExpoUpdatesProtocolCompatibilityMode");
                    }
                }
                bool2 = (Boolean) obj;
                if (bool2 != null) {
                    zBooleanValue3 = bool2.booleanValue();
                } else {
                    if (context != null) {
                        bundle7 = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
                        if (bundle7.containsKey("expo.modules.updates.ENABLE_EXPO_UPDATES_PROTOCOL_V0_COMPATIBILITY_MODE")) {
                            bool = null;
                        } else {
                            dVarB7 = F.b(cls3);
                            if (Intrinsics.b(dVarB7, F.b(String.class))) {
                                boolValueOf3 = (Boolean) bundle7.getString("expo.modules.updates.ENABLE_EXPO_UPDATES_PROTOCOL_V0_COMPATIBILITY_MODE");
                            } else if (Intrinsics.b(dVarB7, F.b(cls2))) {
                                boolValueOf3 = Boolean.valueOf(bundle7.getBoolean("expo.modules.updates.ENABLE_EXPO_UPDATES_PROTOCOL_V0_COMPATIBILITY_MODE"));
                            } else if (Intrinsics.b(dVarB7, F.b(cls))) {
                                boolValueOf3 = (Boolean) Integer.valueOf(bundle7.getInt("expo.modules.updates.ENABLE_EXPO_UPDATES_PROTOCOL_V0_COMPATIBILITY_MODE"));
                            } else {
                                boolValueOf3 = (Boolean) bundle7.get("expo.modules.updates.ENABLE_EXPO_UPDATES_PROTOCOL_V0_COMPATIBILITY_MODE");
                            }
                            bool = boolValueOf3;
                        }
                    } else {
                        bool = null;
                    }
                    if (bool != null) {
                        zBooleanValue3 = bool.booleanValue();
                    } else {
                        zBooleanValue3 = false;
                    }
                }
            }
            boolean zJ2 = bVar2.j(context, map);
            if (eVar != null) {
                uri = uriN;
                z12 = true;
            } else {
                uri = uriN;
                z12 = false;
            }
            this(strD, uriR2, uri, strQ, iIntValue, aVarValueOf, zK, zO, mapP, mapM, str2, map2, z11, zBooleanValue2, zBooleanValue3, zJ2, z12, map);
        }
        aVarValueOf = aVarValueOf;
        if (context != null) {
            Bundle bundle8 = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
            if (bundle8.containsKey("expo.modules.updates.CODE_SIGNING_CERTIFICATE")) {
                kotlin.reflect.d dVarB8 = F.b(String.class);
                string3 = Intrinsics.b(dVarB8, F.b(String.class)) ? bundle8.getString("expo.modules.updates.CODE_SIGNING_CERTIFICATE") : Intrinsics.b(dVarB8, F.b(cls2)) ? (String) Boolean.valueOf(bundle8.getBoolean("expo.modules.updates.CODE_SIGNING_CERTIFICATE")) : Intrinsics.b(dVarB8, F.b(cls)) ? (String) Integer.valueOf(bundle8.getInt("expo.modules.updates.CODE_SIGNING_CERTIFICATE")) : (String) bundle8.get("expo.modules.updates.CODE_SIGNING_CERTIFICATE");
            } else {
                string3 = null;
            }
        } else {
            string3 = null;
        }
        if (map == null) {
            if (context != null) {
                bundle4 = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
                if (bundle4.containsKey("expo.modules.updates.CODE_SIGNING_METADATA")) {
                    str2 = string3;
                    string4 = null;
                } else {
                    dVarB4 = F.b(String.class);
                    str2 = string3;
                    if (Intrinsics.b(dVarB4, F.b(String.class))) {
                        string4 = bundle4.getString("expo.modules.updates.CODE_SIGNING_METADATA");
                    } else if (Intrinsics.b(dVarB4, F.b(cls2))) {
                        string4 = (String) Boolean.valueOf(bundle4.getBoolean("expo.modules.updates.CODE_SIGNING_METADATA"));
                    } else if (Intrinsics.b(dVarB4, F.b(cls))) {
                        string4 = (String) Integer.valueOf(bundle4.getInt("expo.modules.updates.CODE_SIGNING_METADATA"));
                    } else {
                        string4 = (String) bundle4.get("expo.modules.updates.CODE_SIGNING_METADATA");
                    }
                }
                if (string4 == null) {
                }
                mapD = h.f41502a.d(string4);
            } else {
                str2 = string3;
            }
            string4 = "{}";
            mapD = h.f41502a.d(string4);
        } else {
            if (map.containsKey("codeSigningMetadata")) {
                obj4 = null;
            } else {
                obj4 = map.get("codeSigningMetadata");
                if (!(obj4 instanceof Map)) {
                    Intrinsics.c(obj4);
                    throw new AssertionError("UpdatesConfiguration failed to initialize: bad value of type " + obj4.getClass().getSimpleName() + " provided for key codeSigningMetadata");
                }
            }
            mapD = (Map) obj4;
            if (mapD == null) {
                if (context != null) {
                    bundle4 = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
                    if (bundle4.containsKey("expo.modules.updates.CODE_SIGNING_METADATA")) {
                        str2 = string3;
                        string4 = null;
                    } else {
                        dVarB4 = F.b(String.class);
                        str2 = string3;
                        if (Intrinsics.b(dVarB4, F.b(String.class))) {
                            string4 = bundle4.getString("expo.modules.updates.CODE_SIGNING_METADATA");
                        } else if (Intrinsics.b(dVarB4, F.b(cls2))) {
                            string4 = (String) Boolean.valueOf(bundle4.getBoolean("expo.modules.updates.CODE_SIGNING_METADATA"));
                        } else if (Intrinsics.b(dVarB4, F.b(cls))) {
                            string4 = (String) Integer.valueOf(bundle4.getInt("expo.modules.updates.CODE_SIGNING_METADATA"));
                        } else {
                            string4 = (String) bundle4.get("expo.modules.updates.CODE_SIGNING_METADATA");
                        }
                    }
                    if (string4 == null) {
                    }
                    mapD = h.f41502a.d(string4);
                } else {
                    str2 = string3;
                }
                string4 = "{}";
                mapD = h.f41502a.d(string4);
            } else {
                str2 = string3;
            }
        }
        cls3 = Boolean.class;
        if (map != null) {
            if (map.containsKey("codeSigningIncludeManifestResponseCertificateChain")) {
                obj3 = null;
            } else {
                obj3 = map.get("codeSigningIncludeManifestResponseCertificateChain");
                if (!(obj3 instanceof Boolean)) {
                    Intrinsics.c(obj3);
                    throw new AssertionError("UpdatesConfiguration failed to initialize: bad value of type " + obj3.getClass().getSimpleName() + " provided for key codeSigningIncludeManifestResponseCertificateChain");
                }
            }
            bool4 = (Boolean) obj3;
            if (bool4 != null) {
                zBooleanValue = bool4.booleanValue();
                map2 = mapD;
            }
            if (map == null) {
                if (context != null) {
                    bundle6 = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
                    if (bundle6.containsKey("expo.modules.updates.CODE_SIGNING_ALLOW_UNSIGNED_MANIFESTS")) {
                        z11 = zBooleanValue;
                        boolValueOf2 = null;
                    } else {
                        dVarB6 = F.b(cls3);
                        z11 = zBooleanValue;
                        if (Intrinsics.b(dVarB6, F.b(String.class))) {
                            boolValueOf2 = (Boolean) bundle6.getString("expo.modules.updates.CODE_SIGNING_ALLOW_UNSIGNED_MANIFESTS");
                        } else if (Intrinsics.b(dVarB6, F.b(cls2))) {
                            boolValueOf2 = Boolean.valueOf(bundle6.getBoolean("expo.modules.updates.CODE_SIGNING_ALLOW_UNSIGNED_MANIFESTS"));
                        } else if (Intrinsics.b(dVarB6, F.b(cls))) {
                            boolValueOf2 = (Boolean) Integer.valueOf(bundle6.getInt("expo.modules.updates.CODE_SIGNING_ALLOW_UNSIGNED_MANIFESTS"));
                        } else {
                            boolValueOf2 = (Boolean) bundle6.get("expo.modules.updates.CODE_SIGNING_ALLOW_UNSIGNED_MANIFESTS");
                        }
                    }
                } else {
                    z11 = zBooleanValue;
                    boolValueOf2 = null;
                }
                if (boolValueOf2 != null) {
                    zBooleanValue2 = boolValueOf2.booleanValue();
                } else {
                    zBooleanValue2 = false;
                }
            } else {
                if (map.containsKey("codeSigningAllowUnsignedManifests")) {
                    obj2 = null;
                } else {
                    obj2 = map.get("codeSigningAllowUnsignedManifests");
                    if (!(obj2 instanceof Boolean)) {
                        Intrinsics.c(obj2);
                        throw new AssertionError("UpdatesConfiguration failed to initialize: bad value of type " + obj2.getClass().getSimpleName() + " provided for key codeSigningAllowUnsignedManifests");
                    }
                }
                bool3 = (Boolean) obj2;
                if (bool3 != null) {
                    zBooleanValue2 = bool3.booleanValue();
                    z11 = zBooleanValue;
                } else {
                    if (context != null) {
                        bundle6 = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
                        if (bundle6.containsKey("expo.modules.updates.CODE_SIGNING_ALLOW_UNSIGNED_MANIFESTS")) {
                            z11 = zBooleanValue;
                            boolValueOf2 = null;
                        } else {
                            dVarB6 = F.b(cls3);
                            z11 = zBooleanValue;
                            if (Intrinsics.b(dVarB6, F.b(String.class))) {
                                boolValueOf2 = (Boolean) bundle6.getString("expo.modules.updates.CODE_SIGNING_ALLOW_UNSIGNED_MANIFESTS");
                            } else if (Intrinsics.b(dVarB6, F.b(cls2))) {
                                boolValueOf2 = Boolean.valueOf(bundle6.getBoolean("expo.modules.updates.CODE_SIGNING_ALLOW_UNSIGNED_MANIFESTS"));
                            } else if (Intrinsics.b(dVarB6, F.b(cls))) {
                                boolValueOf2 = (Boolean) Integer.valueOf(bundle6.getInt("expo.modules.updates.CODE_SIGNING_ALLOW_UNSIGNED_MANIFESTS"));
                            } else {
                                boolValueOf2 = (Boolean) bundle6.get("expo.modules.updates.CODE_SIGNING_ALLOW_UNSIGNED_MANIFESTS");
                            }
                        }
                    } else {
                        z11 = zBooleanValue;
                        boolValueOf2 = null;
                    }
                    if (boolValueOf2 != null) {
                        zBooleanValue2 = boolValueOf2.booleanValue();
                    } else {
                        zBooleanValue2 = false;
                    }
                }
            }
            if (map == null) {
                if (context != null) {
                    bundle7 = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
                    if (bundle7.containsKey("expo.modules.updates.ENABLE_EXPO_UPDATES_PROTOCOL_V0_COMPATIBILITY_MODE")) {
                        bool = null;
                    } else {
                        dVarB7 = F.b(cls3);
                        if (Intrinsics.b(dVarB7, F.b(String.class))) {
                            boolValueOf3 = (Boolean) bundle7.getString("expo.modules.updates.ENABLE_EXPO_UPDATES_PROTOCOL_V0_COMPATIBILITY_MODE");
                        } else if (Intrinsics.b(dVarB7, F.b(cls2))) {
                            boolValueOf3 = Boolean.valueOf(bundle7.getBoolean("expo.modules.updates.ENABLE_EXPO_UPDATES_PROTOCOL_V0_COMPATIBILITY_MODE"));
                        } else if (Intrinsics.b(dVarB7, F.b(cls))) {
                            boolValueOf3 = (Boolean) Integer.valueOf(bundle7.getInt("expo.modules.updates.ENABLE_EXPO_UPDATES_PROTOCOL_V0_COMPATIBILITY_MODE"));
                        } else {
                            boolValueOf3 = (Boolean) bundle7.get("expo.modules.updates.ENABLE_EXPO_UPDATES_PROTOCOL_V0_COMPATIBILITY_MODE");
                        }
                        bool = boolValueOf3;
                    }
                } else {
                    bool = null;
                }
                if (bool != null) {
                    zBooleanValue3 = bool.booleanValue();
                } else {
                    zBooleanValue3 = false;
                }
            } else {
                if (map.containsKey("enableExpoUpdatesProtocolCompatibilityMode")) {
                    obj = null;
                } else {
                    obj = map.get("enableExpoUpdatesProtocolCompatibilityMode");
                    if (!(obj instanceof Boolean)) {
                        Intrinsics.c(obj);
                        throw new AssertionError("UpdatesConfiguration failed to initialize: bad value of type " + obj.getClass().getSimpleName() + " provided for key enableExpoUpdatesProtocolCompatibilityMode");
                    }
                }
                bool2 = (Boolean) obj;
                if (bool2 != null) {
                    zBooleanValue3 = bool2.booleanValue();
                } else {
                    if (context != null) {
                        bundle7 = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
                        if (bundle7.containsKey("expo.modules.updates.ENABLE_EXPO_UPDATES_PROTOCOL_V0_COMPATIBILITY_MODE")) {
                            bool = null;
                        } else {
                            dVarB7 = F.b(cls3);
                            if (Intrinsics.b(dVarB7, F.b(String.class))) {
                                boolValueOf3 = (Boolean) bundle7.getString("expo.modules.updates.ENABLE_EXPO_UPDATES_PROTOCOL_V0_COMPATIBILITY_MODE");
                            } else if (Intrinsics.b(dVarB7, F.b(cls2))) {
                                boolValueOf3 = Boolean.valueOf(bundle7.getBoolean("expo.modules.updates.ENABLE_EXPO_UPDATES_PROTOCOL_V0_COMPATIBILITY_MODE"));
                            } else if (Intrinsics.b(dVarB7, F.b(cls))) {
                                boolValueOf3 = (Boolean) Integer.valueOf(bundle7.getInt("expo.modules.updates.ENABLE_EXPO_UPDATES_PROTOCOL_V0_COMPATIBILITY_MODE"));
                            } else {
                                boolValueOf3 = (Boolean) bundle7.get("expo.modules.updates.ENABLE_EXPO_UPDATES_PROTOCOL_V0_COMPATIBILITY_MODE");
                            }
                            bool = boolValueOf3;
                        }
                    } else {
                        bool = null;
                    }
                    if (bool != null) {
                        zBooleanValue3 = bool.booleanValue();
                    } else {
                        zBooleanValue3 = false;
                    }
                }
            }
            boolean zJ3 = bVar2.j(context, map);
            if (eVar != null) {
                uri = uriN;
                z12 = true;
            } else {
                uri = uriN;
                z12 = false;
            }
            this(strD, uriR2, uri, strQ, iIntValue, aVarValueOf, zK, zO, mapP, mapM, str2, map2, z11, zBooleanValue2, zBooleanValue3, zJ3, z12, map);
        }
        cls3 = cls3;
        if (context != null) {
            bundle5 = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
            if (bundle5.containsKey("expo.modules.updates.CODE_SIGNING_INCLUDE_MANIFEST_RESPONSE_CERTIFICATE_CHAIN")) {
                map2 = mapD;
                boolValueOf = null;
            } else {
                dVarB5 = F.b(cls3);
                map2 = mapD;
                if (Intrinsics.b(dVarB5, F.b(String.class))) {
                    boolValueOf = (Boolean) bundle5.getString("expo.modules.updates.CODE_SIGNING_INCLUDE_MANIFEST_RESPONSE_CERTIFICATE_CHAIN");
                } else if (Intrinsics.b(dVarB5, F.b(cls2))) {
                    boolValueOf = Boolean.valueOf(bundle5.getBoolean("expo.modules.updates.CODE_SIGNING_INCLUDE_MANIFEST_RESPONSE_CERTIFICATE_CHAIN"));
                } else if (Intrinsics.b(dVarB5, F.b(cls))) {
                    boolValueOf = (Boolean) Integer.valueOf(bundle5.getInt("expo.modules.updates.CODE_SIGNING_INCLUDE_MANIFEST_RESPONSE_CERTIFICATE_CHAIN"));
                } else {
                    boolValueOf = (Boolean) bundle5.get("expo.modules.updates.CODE_SIGNING_INCLUDE_MANIFEST_RESPONSE_CERTIFICATE_CHAIN");
                }
            }
        } else {
            map2 = mapD;
            boolValueOf = null;
        }
        if (boolValueOf != null) {
            zBooleanValue = boolValueOf.booleanValue();
        } else {
            zBooleanValue = false;
        }
        if (map == null) {
            if (context != null) {
                bundle6 = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
                if (bundle6.containsKey("expo.modules.updates.CODE_SIGNING_ALLOW_UNSIGNED_MANIFESTS")) {
                    z11 = zBooleanValue;
                    boolValueOf2 = null;
                } else {
                    dVarB6 = F.b(cls3);
                    z11 = zBooleanValue;
                    if (Intrinsics.b(dVarB6, F.b(String.class))) {
                        boolValueOf2 = (Boolean) bundle6.getString("expo.modules.updates.CODE_SIGNING_ALLOW_UNSIGNED_MANIFESTS");
                    } else if (Intrinsics.b(dVarB6, F.b(cls2))) {
                        boolValueOf2 = Boolean.valueOf(bundle6.getBoolean("expo.modules.updates.CODE_SIGNING_ALLOW_UNSIGNED_MANIFESTS"));
                    } else if (Intrinsics.b(dVarB6, F.b(cls))) {
                        boolValueOf2 = (Boolean) Integer.valueOf(bundle6.getInt("expo.modules.updates.CODE_SIGNING_ALLOW_UNSIGNED_MANIFESTS"));
                    } else {
                        boolValueOf2 = (Boolean) bundle6.get("expo.modules.updates.CODE_SIGNING_ALLOW_UNSIGNED_MANIFESTS");
                    }
                }
            } else {
                z11 = zBooleanValue;
                boolValueOf2 = null;
            }
            if (boolValueOf2 != null) {
                zBooleanValue2 = boolValueOf2.booleanValue();
            } else {
                zBooleanValue2 = false;
            }
        } else {
            if (map.containsKey("codeSigningAllowUnsignedManifests")) {
                obj2 = null;
            } else {
                obj2 = map.get("codeSigningAllowUnsignedManifests");
                if (!(obj2 instanceof Boolean)) {
                    Intrinsics.c(obj2);
                    throw new AssertionError("UpdatesConfiguration failed to initialize: bad value of type " + obj2.getClass().getSimpleName() + " provided for key codeSigningAllowUnsignedManifests");
                }
            }
            bool3 = (Boolean) obj2;
            if (bool3 != null) {
                zBooleanValue2 = bool3.booleanValue();
                z11 = zBooleanValue;
            } else {
                if (context != null) {
                    bundle6 = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
                    if (bundle6.containsKey("expo.modules.updates.CODE_SIGNING_ALLOW_UNSIGNED_MANIFESTS")) {
                        z11 = zBooleanValue;
                        boolValueOf2 = null;
                    } else {
                        dVarB6 = F.b(cls3);
                        z11 = zBooleanValue;
                        if (Intrinsics.b(dVarB6, F.b(String.class))) {
                            boolValueOf2 = (Boolean) bundle6.getString("expo.modules.updates.CODE_SIGNING_ALLOW_UNSIGNED_MANIFESTS");
                        } else if (Intrinsics.b(dVarB6, F.b(cls2))) {
                            boolValueOf2 = Boolean.valueOf(bundle6.getBoolean("expo.modules.updates.CODE_SIGNING_ALLOW_UNSIGNED_MANIFESTS"));
                        } else if (Intrinsics.b(dVarB6, F.b(cls))) {
                            boolValueOf2 = (Boolean) Integer.valueOf(bundle6.getInt("expo.modules.updates.CODE_SIGNING_ALLOW_UNSIGNED_MANIFESTS"));
                        } else {
                            boolValueOf2 = (Boolean) bundle6.get("expo.modules.updates.CODE_SIGNING_ALLOW_UNSIGNED_MANIFESTS");
                        }
                    }
                } else {
                    z11 = zBooleanValue;
                    boolValueOf2 = null;
                }
                if (boolValueOf2 != null) {
                    zBooleanValue2 = boolValueOf2.booleanValue();
                } else {
                    zBooleanValue2 = false;
                }
            }
        }
        if (map == null) {
            if (context != null) {
                bundle7 = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
                if (bundle7.containsKey("expo.modules.updates.ENABLE_EXPO_UPDATES_PROTOCOL_V0_COMPATIBILITY_MODE")) {
                    bool = null;
                } else {
                    dVarB7 = F.b(cls3);
                    if (Intrinsics.b(dVarB7, F.b(String.class))) {
                        boolValueOf3 = (Boolean) bundle7.getString("expo.modules.updates.ENABLE_EXPO_UPDATES_PROTOCOL_V0_COMPATIBILITY_MODE");
                    } else if (Intrinsics.b(dVarB7, F.b(cls2))) {
                        boolValueOf3 = Boolean.valueOf(bundle7.getBoolean("expo.modules.updates.ENABLE_EXPO_UPDATES_PROTOCOL_V0_COMPATIBILITY_MODE"));
                    } else if (Intrinsics.b(dVarB7, F.b(cls))) {
                        boolValueOf3 = (Boolean) Integer.valueOf(bundle7.getInt("expo.modules.updates.ENABLE_EXPO_UPDATES_PROTOCOL_V0_COMPATIBILITY_MODE"));
                    } else {
                        boolValueOf3 = (Boolean) bundle7.get("expo.modules.updates.ENABLE_EXPO_UPDATES_PROTOCOL_V0_COMPATIBILITY_MODE");
                    }
                    bool = boolValueOf3;
                }
            } else {
                bool = null;
            }
            if (bool != null) {
                zBooleanValue3 = bool.booleanValue();
            } else {
                zBooleanValue3 = false;
            }
        } else {
            if (map.containsKey("enableExpoUpdatesProtocolCompatibilityMode")) {
                obj = null;
            } else {
                obj = map.get("enableExpoUpdatesProtocolCompatibilityMode");
                if (!(obj instanceof Boolean)) {
                    Intrinsics.c(obj);
                    throw new AssertionError("UpdatesConfiguration failed to initialize: bad value of type " + obj.getClass().getSimpleName() + " provided for key enableExpoUpdatesProtocolCompatibilityMode");
                }
            }
            bool2 = (Boolean) obj;
            if (bool2 != null) {
                zBooleanValue3 = bool2.booleanValue();
            } else {
                if (context != null) {
                    bundle7 = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
                    if (bundle7.containsKey("expo.modules.updates.ENABLE_EXPO_UPDATES_PROTOCOL_V0_COMPATIBILITY_MODE")) {
                        bool = null;
                    } else {
                        dVarB7 = F.b(cls3);
                        if (Intrinsics.b(dVarB7, F.b(String.class))) {
                            boolValueOf3 = (Boolean) bundle7.getString("expo.modules.updates.ENABLE_EXPO_UPDATES_PROTOCOL_V0_COMPATIBILITY_MODE");
                        } else if (Intrinsics.b(dVarB7, F.b(cls2))) {
                            boolValueOf3 = Boolean.valueOf(bundle7.getBoolean("expo.modules.updates.ENABLE_EXPO_UPDATES_PROTOCOL_V0_COMPATIBILITY_MODE"));
                        } else if (Intrinsics.b(dVarB7, F.b(cls))) {
                            boolValueOf3 = (Boolean) Integer.valueOf(bundle7.getInt("expo.modules.updates.ENABLE_EXPO_UPDATES_PROTOCOL_V0_COMPATIBILITY_MODE"));
                        } else {
                            boolValueOf3 = (Boolean) bundle7.get("expo.modules.updates.ENABLE_EXPO_UPDATES_PROTOCOL_V0_COMPATIBILITY_MODE");
                        }
                        bool = boolValueOf3;
                    }
                } else {
                    bool = null;
                }
                if (bool != null) {
                    zBooleanValue3 = bool.booleanValue();
                } else {
                    zBooleanValue3 = false;
                }
            }
        }
        boolean zJ4 = bVar2.j(context, map);
        if (eVar != null) {
            uri = uriN;
            z12 = true;
        } else {
            uri = uriN;
            z12 = false;
        }
        this(strD, uriR2, uri, strQ, iIntValue, aVarValueOf, zK, zO, mapP, mapM, str2, map2, z11, zBooleanValue2, zBooleanValue3, zJ4, z12, map);
    }

    public d(String scopeKey, Uri updateUrl, Uri originalEmbeddedUpdateUrl, String str, int i10, a checkOnLaunch, boolean z10, boolean z11, Map requestHeaders, Map originalEmbeddedRequestHeaders, String str2, Map map, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, Map map2) {
        Intrinsics.checkNotNullParameter(scopeKey, "scopeKey");
        Intrinsics.checkNotNullParameter(updateUrl, "updateUrl");
        Intrinsics.checkNotNullParameter(originalEmbeddedUpdateUrl, "originalEmbeddedUpdateUrl");
        Intrinsics.checkNotNullParameter(checkOnLaunch, "checkOnLaunch");
        Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
        Intrinsics.checkNotNullParameter(originalEmbeddedRequestHeaders, "originalEmbeddedRequestHeaders");
        this.f41440a = scopeKey;
        this.f41441b = updateUrl;
        this.f41442c = originalEmbeddedUpdateUrl;
        this.f41443d = str;
        this.f41444e = i10;
        this.f41445f = checkOnLaunch;
        this.f41446g = z10;
        this.f41447h = z11;
        this.f41448i = requestHeaders;
        this.f41449j = originalEmbeddedRequestHeaders;
        this.f41450k = str2;
        this.f41451l = map;
        this.f41452m = z12;
        this.f41453n = z13;
        this.f41454o = z14;
        this.f41455p = z15;
        this.f41456q = z16;
        this.f41457r = map2;
        this.f41458s = j.b(new p086ed.d(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p104fd.f d(d dVar) {
        String str = dVar.f41450k;
        if (str != null) {
            return new p104fd.f(str, dVar.f41451l, dVar.f41452m, dVar.f41453n);
        }
        return null;
    }

    public final a e() {
        return this.f41445f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Intrinsics.b(this.f41440a, dVar.f41440a) && Intrinsics.b(this.f41441b, dVar.f41441b) && Intrinsics.b(this.f41442c, dVar.f41442c) && Intrinsics.b(this.f41443d, dVar.f41443d) && this.f41444e == dVar.f41444e && this.f41445f == dVar.f41445f && this.f41446g == dVar.f41446g && this.f41447h == dVar.f41447h && Intrinsics.b(this.f41448i, dVar.f41448i) && Intrinsics.b(this.f41449j, dVar.f41449j) && Intrinsics.b(this.f41450k, dVar.f41450k) && Intrinsics.b(this.f41451l, dVar.f41451l) && this.f41452m == dVar.f41452m && this.f41453n == dVar.f41453n && this.f41454o == dVar.f41454o && this.f41455p == dVar.f41455p && this.f41456q == dVar.f41456q && Intrinsics.b(this.f41457r, dVar.f41457r);
    }

    public final p104fd.f f() {
        return (p104fd.f) this.f41458s.getValue();
    }

    public final boolean g() {
        return this.f41455p;
    }

    public final boolean h() {
        return this.f41454o;
    }

    public int hashCode() {
        int iHashCode = ((((this.f41440a.hashCode() * 31) + this.f41441b.hashCode()) * 31) + this.f41442c.hashCode()) * 31;
        String str = this.f41443d;
        int iHashCode2 = (((((((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.f41444e)) * 31) + this.f41445f.hashCode()) * 31) + Boolean.hashCode(this.f41446g)) * 31) + Boolean.hashCode(this.f41447h)) * 31) + this.f41448i.hashCode()) * 31) + this.f41449j.hashCode()) * 31;
        String str2 = this.f41450k;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Map map = this.f41451l;
        int iHashCode4 = (((((((((((iHashCode3 + (map == null ? 0 : map.hashCode())) * 31) + Boolean.hashCode(this.f41452m)) * 31) + Boolean.hashCode(this.f41453n)) * 31) + Boolean.hashCode(this.f41454o)) * 31) + Boolean.hashCode(this.f41455p)) * 31) + Boolean.hashCode(this.f41456q)) * 31;
        Map map2 = this.f41457r;
        return iHashCode4 + (map2 != null ? map2.hashCode() : 0);
    }

    public final boolean i() {
        return this.f41446g;
    }

    public final boolean j() {
        return this.f41456q;
    }

    public final int k() {
        return this.f41444e;
    }

    public final Map l() {
        return this.f41449j;
    }

    public final Uri m() {
        return this.f41442c;
    }

    public final boolean n() {
        return this.f41447h;
    }

    public final Map o() {
        return this.f41448i;
    }

    public final String p() throws Exception {
        String str = this.f41443d;
        if (str == null || str.length() == 0) {
            throw new Exception("No runtime version provided in configuration");
        }
        return this.f41443d;
    }

    public final String q() {
        return this.f41443d;
    }

    public final String r() {
        return this.f41440a;
    }

    public final Uri s() {
        return this.f41441b;
    }

    public String toString() {
        return "UpdatesConfiguration(scopeKey=" + this.f41440a + ", updateUrl=" + this.f41441b + ", originalEmbeddedUpdateUrl=" + this.f41442c + ", runtimeVersionRaw=" + this.f41443d + ", launchWaitMs=" + this.f41444e + ", checkOnLaunch=" + this.f41445f + ", hasEmbeddedUpdate=" + this.f41446g + ", originalHasEmbeddedUpdate=" + this.f41447h + ", requestHeaders=" + this.f41448i + ", originalEmbeddedRequestHeaders=" + this.f41449j + ", codeSigningCertificate=" + this.f41450k + ", codeSigningMetadata=" + this.f41451l + ", codeSigningIncludeManifestResponseCertificateChain=" + this.f41452m + ", codeSigningAllowUnsignedManifests=" + this.f41453n + ", enableExpoUpdatesProtocolV0CompatibilityMode=" + this.f41454o + ", disableAntiBrickingMeasures=" + this.f41455p + ", hasUpdatesOverride=" + this.f41456q + ", cachedOverrideMap=" + this.f41457r + ")";
    }
}
