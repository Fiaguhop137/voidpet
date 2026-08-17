package p283pd;

import Ad.j;
import android.net.Uri;
import android.util.Log;
import expo.modules.updates.d;
import expo.modules.updates.h;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.collections.N;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.k;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p318rc.b;

/* JADX INFO: loaded from: classes3.dex */
public final class i implements q {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final a f50924o = new a(null);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final String f50925p = q.class.getSimpleName();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f50926a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final UUID f50927b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f50928c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Date f50929d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f50930e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final JSONObject f50931f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final JSONArray f50932g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final JSONObject f50933h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Uri f50934i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Map f50935j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Lazy f50936k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Lazy f50937l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Lazy f50938m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Lazy f50939n;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final i a(b manifest, JSONObject jSONObject, d configuration) {
            Date date;
            Intrinsics.checkNotNullParameter(manifest, "manifest");
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            UUID uuidFromString = UUID.fromString(manifest.p());
            Intrinsics.checkNotNullExpressionValue(uuidFromString, "fromString(...)");
            String strR = configuration.r();
            try {
                date = h.f41502a.h(manifest.n());
            } catch (ParseException e10) {
                Log.e(i.f50925p, "Could not parse manifest createdAt string; falling back to current time", e10);
                date = new Date();
            }
            return new i(manifest, uuidFromString, strR, date, manifest.r(), manifest.q(), manifest.m(), jSONObject, configuration.s(), configuration.o(), null);
        }
    }

    private i(b bVar, UUID uuid, String str, Date date, String str2, JSONObject jSONObject, JSONArray jSONArray, JSONObject jSONObject2, Uri uri, Map map) {
        this.f50926a = bVar;
        this.f50927b = uuid;
        this.f50928c = str;
        this.f50929d = date;
        this.f50930e = str2;
        this.f50931f = jSONObject;
        this.f50932g = jSONArray;
        this.f50933h = jSONObject2;
        this.f50934i = uri;
        this.f50935j = map;
        this.f50936k = j.b(new e(this));
        this.f50937l = j.b(new f(this));
        this.f50938m = j.b(new g(this));
        this.f50939n = j.b(new h(this));
    }

    public /* synthetic */ i(b bVar, UUID uuid, String str, Date date, String str2, JSONObject jSONObject, JSONArray jSONArray, JSONObject jSONObject2, Uri uri, Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(bVar, uuid, str, date, str2, jSONObject, jSONArray, jSONObject2, uri, map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:102:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:108:0x0240  */
    /* JADX WARN: Code duplicated, block: B:109:0x0245 A[Catch: JSONException -> 0x03bf, TRY_LEAVE, TryCatch #5 {JSONException -> 0x03bf, blocks: (B:106:0x0206, B:109:0x0245), top: B:206:0x0206 }] */
    /* JADX WARN: Code duplicated, block: B:113:0x0255 A[Catch: JSONException -> 0x0263, TryCatch #0 {JSONException -> 0x0263, blocks: (B:149:0x02f5, B:188:0x03ac, B:152:0x0301, B:154:0x030f, B:157:0x0317, B:158:0x031c, B:159:0x031d, B:161:0x0327, B:162:0x0333, B:164:0x033d, B:165:0x0348, B:167:0x0352, B:168:0x035d, B:170:0x0367, B:171:0x0372, B:173:0x037c, B:175:0x0382, B:176:0x0385, B:177:0x038a, B:178:0x038b, B:180:0x0395, B:182:0x039b, B:183:0x039e, B:184:0x03a3, B:185:0x03a4, B:187:0x03aa, B:189:0x03b3, B:190:0x03b8, B:111:0x024b, B:113:0x0255, B:116:0x025d, B:117:0x0262, B:120:0x0266, B:122:0x0270, B:123:0x027c, B:125:0x0286, B:126:0x0291, B:128:0x029b, B:129:0x02a6, B:131:0x02b0, B:132:0x02bb, B:134:0x02c5, B:136:0x02cb, B:137:0x02ce, B:138:0x02d3, B:139:0x02d4, B:141:0x02de, B:143:0x02e4, B:144:0x02e7, B:145:0x02ec, B:146:0x02ed, B:148:0x02f3, B:191:0x03b9, B:192:0x03be), top: B:198:0x02f5 }] */
    /* JADX WARN: Code duplicated, block: B:115:0x025b  */
    /* JADX WARN: Code duplicated, block: B:120:0x0266 A[Catch: JSONException -> 0x0263, TryCatch #0 {JSONException -> 0x0263, blocks: (B:149:0x02f5, B:188:0x03ac, B:152:0x0301, B:154:0x030f, B:157:0x0317, B:158:0x031c, B:159:0x031d, B:161:0x0327, B:162:0x0333, B:164:0x033d, B:165:0x0348, B:167:0x0352, B:168:0x035d, B:170:0x0367, B:171:0x0372, B:173:0x037c, B:175:0x0382, B:176:0x0385, B:177:0x038a, B:178:0x038b, B:180:0x0395, B:182:0x039b, B:183:0x039e, B:184:0x03a3, B:185:0x03a4, B:187:0x03aa, B:189:0x03b3, B:190:0x03b8, B:111:0x024b, B:113:0x0255, B:116:0x025d, B:117:0x0262, B:120:0x0266, B:122:0x0270, B:123:0x027c, B:125:0x0286, B:126:0x0291, B:128:0x029b, B:129:0x02a6, B:131:0x02b0, B:132:0x02bb, B:134:0x02c5, B:136:0x02cb, B:137:0x02ce, B:138:0x02d3, B:139:0x02d4, B:141:0x02de, B:143:0x02e4, B:144:0x02e7, B:145:0x02ec, B:146:0x02ed, B:148:0x02f3, B:191:0x03b9, B:192:0x03be), top: B:198:0x02f5 }] */
    /* JADX WARN: Code duplicated, block: B:122:0x0270 A[Catch: JSONException -> 0x0263, TryCatch #0 {JSONException -> 0x0263, blocks: (B:149:0x02f5, B:188:0x03ac, B:152:0x0301, B:154:0x030f, B:157:0x0317, B:158:0x031c, B:159:0x031d, B:161:0x0327, B:162:0x0333, B:164:0x033d, B:165:0x0348, B:167:0x0352, B:168:0x035d, B:170:0x0367, B:171:0x0372, B:173:0x037c, B:175:0x0382, B:176:0x0385, B:177:0x038a, B:178:0x038b, B:180:0x0395, B:182:0x039b, B:183:0x039e, B:184:0x03a3, B:185:0x03a4, B:187:0x03aa, B:189:0x03b3, B:190:0x03b8, B:111:0x024b, B:113:0x0255, B:116:0x025d, B:117:0x0262, B:120:0x0266, B:122:0x0270, B:123:0x027c, B:125:0x0286, B:126:0x0291, B:128:0x029b, B:129:0x02a6, B:131:0x02b0, B:132:0x02bb, B:134:0x02c5, B:136:0x02cb, B:137:0x02ce, B:138:0x02d3, B:139:0x02d4, B:141:0x02de, B:143:0x02e4, B:144:0x02e7, B:145:0x02ec, B:146:0x02ed, B:148:0x02f3, B:191:0x03b9, B:192:0x03be), top: B:198:0x02f5 }] */
    /* JADX WARN: Code duplicated, block: B:123:0x027c A[Catch: JSONException -> 0x0263, TryCatch #0 {JSONException -> 0x0263, blocks: (B:149:0x02f5, B:188:0x03ac, B:152:0x0301, B:154:0x030f, B:157:0x0317, B:158:0x031c, B:159:0x031d, B:161:0x0327, B:162:0x0333, B:164:0x033d, B:165:0x0348, B:167:0x0352, B:168:0x035d, B:170:0x0367, B:171:0x0372, B:173:0x037c, B:175:0x0382, B:176:0x0385, B:177:0x038a, B:178:0x038b, B:180:0x0395, B:182:0x039b, B:183:0x039e, B:184:0x03a3, B:185:0x03a4, B:187:0x03aa, B:189:0x03b3, B:190:0x03b8, B:111:0x024b, B:113:0x0255, B:116:0x025d, B:117:0x0262, B:120:0x0266, B:122:0x0270, B:123:0x027c, B:125:0x0286, B:126:0x0291, B:128:0x029b, B:129:0x02a6, B:131:0x02b0, B:132:0x02bb, B:134:0x02c5, B:136:0x02cb, B:137:0x02ce, B:138:0x02d3, B:139:0x02d4, B:141:0x02de, B:143:0x02e4, B:144:0x02e7, B:145:0x02ec, B:146:0x02ed, B:148:0x02f3, B:191:0x03b9, B:192:0x03be), top: B:198:0x02f5 }] */
    /* JADX WARN: Code duplicated, block: B:125:0x0286 A[Catch: JSONException -> 0x0263, TryCatch #0 {JSONException -> 0x0263, blocks: (B:149:0x02f5, B:188:0x03ac, B:152:0x0301, B:154:0x030f, B:157:0x0317, B:158:0x031c, B:159:0x031d, B:161:0x0327, B:162:0x0333, B:164:0x033d, B:165:0x0348, B:167:0x0352, B:168:0x035d, B:170:0x0367, B:171:0x0372, B:173:0x037c, B:175:0x0382, B:176:0x0385, B:177:0x038a, B:178:0x038b, B:180:0x0395, B:182:0x039b, B:183:0x039e, B:184:0x03a3, B:185:0x03a4, B:187:0x03aa, B:189:0x03b3, B:190:0x03b8, B:111:0x024b, B:113:0x0255, B:116:0x025d, B:117:0x0262, B:120:0x0266, B:122:0x0270, B:123:0x027c, B:125:0x0286, B:126:0x0291, B:128:0x029b, B:129:0x02a6, B:131:0x02b0, B:132:0x02bb, B:134:0x02c5, B:136:0x02cb, B:137:0x02ce, B:138:0x02d3, B:139:0x02d4, B:141:0x02de, B:143:0x02e4, B:144:0x02e7, B:145:0x02ec, B:146:0x02ed, B:148:0x02f3, B:191:0x03b9, B:192:0x03be), top: B:198:0x02f5 }] */
    /* JADX WARN: Code duplicated, block: B:126:0x0291 A[Catch: JSONException -> 0x0263, TryCatch #0 {JSONException -> 0x0263, blocks: (B:149:0x02f5, B:188:0x03ac, B:152:0x0301, B:154:0x030f, B:157:0x0317, B:158:0x031c, B:159:0x031d, B:161:0x0327, B:162:0x0333, B:164:0x033d, B:165:0x0348, B:167:0x0352, B:168:0x035d, B:170:0x0367, B:171:0x0372, B:173:0x037c, B:175:0x0382, B:176:0x0385, B:177:0x038a, B:178:0x038b, B:180:0x0395, B:182:0x039b, B:183:0x039e, B:184:0x03a3, B:185:0x03a4, B:187:0x03aa, B:189:0x03b3, B:190:0x03b8, B:111:0x024b, B:113:0x0255, B:116:0x025d, B:117:0x0262, B:120:0x0266, B:122:0x0270, B:123:0x027c, B:125:0x0286, B:126:0x0291, B:128:0x029b, B:129:0x02a6, B:131:0x02b0, B:132:0x02bb, B:134:0x02c5, B:136:0x02cb, B:137:0x02ce, B:138:0x02d3, B:139:0x02d4, B:141:0x02de, B:143:0x02e4, B:144:0x02e7, B:145:0x02ec, B:146:0x02ed, B:148:0x02f3, B:191:0x03b9, B:192:0x03be), top: B:198:0x02f5 }] */
    /* JADX WARN: Code duplicated, block: B:128:0x029b A[Catch: JSONException -> 0x0263, TryCatch #0 {JSONException -> 0x0263, blocks: (B:149:0x02f5, B:188:0x03ac, B:152:0x0301, B:154:0x030f, B:157:0x0317, B:158:0x031c, B:159:0x031d, B:161:0x0327, B:162:0x0333, B:164:0x033d, B:165:0x0348, B:167:0x0352, B:168:0x035d, B:170:0x0367, B:171:0x0372, B:173:0x037c, B:175:0x0382, B:176:0x0385, B:177:0x038a, B:178:0x038b, B:180:0x0395, B:182:0x039b, B:183:0x039e, B:184:0x03a3, B:185:0x03a4, B:187:0x03aa, B:189:0x03b3, B:190:0x03b8, B:111:0x024b, B:113:0x0255, B:116:0x025d, B:117:0x0262, B:120:0x0266, B:122:0x0270, B:123:0x027c, B:125:0x0286, B:126:0x0291, B:128:0x029b, B:129:0x02a6, B:131:0x02b0, B:132:0x02bb, B:134:0x02c5, B:136:0x02cb, B:137:0x02ce, B:138:0x02d3, B:139:0x02d4, B:141:0x02de, B:143:0x02e4, B:144:0x02e7, B:145:0x02ec, B:146:0x02ed, B:148:0x02f3, B:191:0x03b9, B:192:0x03be), top: B:198:0x02f5 }] */
    /* JADX WARN: Code duplicated, block: B:129:0x02a6 A[Catch: JSONException -> 0x0263, TryCatch #0 {JSONException -> 0x0263, blocks: (B:149:0x02f5, B:188:0x03ac, B:152:0x0301, B:154:0x030f, B:157:0x0317, B:158:0x031c, B:159:0x031d, B:161:0x0327, B:162:0x0333, B:164:0x033d, B:165:0x0348, B:167:0x0352, B:168:0x035d, B:170:0x0367, B:171:0x0372, B:173:0x037c, B:175:0x0382, B:176:0x0385, B:177:0x038a, B:178:0x038b, B:180:0x0395, B:182:0x039b, B:183:0x039e, B:184:0x03a3, B:185:0x03a4, B:187:0x03aa, B:189:0x03b3, B:190:0x03b8, B:111:0x024b, B:113:0x0255, B:116:0x025d, B:117:0x0262, B:120:0x0266, B:122:0x0270, B:123:0x027c, B:125:0x0286, B:126:0x0291, B:128:0x029b, B:129:0x02a6, B:131:0x02b0, B:132:0x02bb, B:134:0x02c5, B:136:0x02cb, B:137:0x02ce, B:138:0x02d3, B:139:0x02d4, B:141:0x02de, B:143:0x02e4, B:144:0x02e7, B:145:0x02ec, B:146:0x02ed, B:148:0x02f3, B:191:0x03b9, B:192:0x03be), top: B:198:0x02f5 }] */
    /* JADX WARN: Code duplicated, block: B:131:0x02b0 A[Catch: JSONException -> 0x0263, TryCatch #0 {JSONException -> 0x0263, blocks: (B:149:0x02f5, B:188:0x03ac, B:152:0x0301, B:154:0x030f, B:157:0x0317, B:158:0x031c, B:159:0x031d, B:161:0x0327, B:162:0x0333, B:164:0x033d, B:165:0x0348, B:167:0x0352, B:168:0x035d, B:170:0x0367, B:171:0x0372, B:173:0x037c, B:175:0x0382, B:176:0x0385, B:177:0x038a, B:178:0x038b, B:180:0x0395, B:182:0x039b, B:183:0x039e, B:184:0x03a3, B:185:0x03a4, B:187:0x03aa, B:189:0x03b3, B:190:0x03b8, B:111:0x024b, B:113:0x0255, B:116:0x025d, B:117:0x0262, B:120:0x0266, B:122:0x0270, B:123:0x027c, B:125:0x0286, B:126:0x0291, B:128:0x029b, B:129:0x02a6, B:131:0x02b0, B:132:0x02bb, B:134:0x02c5, B:136:0x02cb, B:137:0x02ce, B:138:0x02d3, B:139:0x02d4, B:141:0x02de, B:143:0x02e4, B:144:0x02e7, B:145:0x02ec, B:146:0x02ed, B:148:0x02f3, B:191:0x03b9, B:192:0x03be), top: B:198:0x02f5 }] */
    /* JADX WARN: Code duplicated, block: B:132:0x02bb A[Catch: JSONException -> 0x0263, TryCatch #0 {JSONException -> 0x0263, blocks: (B:149:0x02f5, B:188:0x03ac, B:152:0x0301, B:154:0x030f, B:157:0x0317, B:158:0x031c, B:159:0x031d, B:161:0x0327, B:162:0x0333, B:164:0x033d, B:165:0x0348, B:167:0x0352, B:168:0x035d, B:170:0x0367, B:171:0x0372, B:173:0x037c, B:175:0x0382, B:176:0x0385, B:177:0x038a, B:178:0x038b, B:180:0x0395, B:182:0x039b, B:183:0x039e, B:184:0x03a3, B:185:0x03a4, B:187:0x03aa, B:189:0x03b3, B:190:0x03b8, B:111:0x024b, B:113:0x0255, B:116:0x025d, B:117:0x0262, B:120:0x0266, B:122:0x0270, B:123:0x027c, B:125:0x0286, B:126:0x0291, B:128:0x029b, B:129:0x02a6, B:131:0x02b0, B:132:0x02bb, B:134:0x02c5, B:136:0x02cb, B:137:0x02ce, B:138:0x02d3, B:139:0x02d4, B:141:0x02de, B:143:0x02e4, B:144:0x02e7, B:145:0x02ec, B:146:0x02ed, B:148:0x02f3, B:191:0x03b9, B:192:0x03be), top: B:198:0x02f5 }] */
    /* JADX WARN: Code duplicated, block: B:134:0x02c5 A[Catch: JSONException -> 0x0263, TryCatch #0 {JSONException -> 0x0263, blocks: (B:149:0x02f5, B:188:0x03ac, B:152:0x0301, B:154:0x030f, B:157:0x0317, B:158:0x031c, B:159:0x031d, B:161:0x0327, B:162:0x0333, B:164:0x033d, B:165:0x0348, B:167:0x0352, B:168:0x035d, B:170:0x0367, B:171:0x0372, B:173:0x037c, B:175:0x0382, B:176:0x0385, B:177:0x038a, B:178:0x038b, B:180:0x0395, B:182:0x039b, B:183:0x039e, B:184:0x03a3, B:185:0x03a4, B:187:0x03aa, B:189:0x03b3, B:190:0x03b8, B:111:0x024b, B:113:0x0255, B:116:0x025d, B:117:0x0262, B:120:0x0266, B:122:0x0270, B:123:0x027c, B:125:0x0286, B:126:0x0291, B:128:0x029b, B:129:0x02a6, B:131:0x02b0, B:132:0x02bb, B:134:0x02c5, B:136:0x02cb, B:137:0x02ce, B:138:0x02d3, B:139:0x02d4, B:141:0x02de, B:143:0x02e4, B:144:0x02e7, B:145:0x02ec, B:146:0x02ed, B:148:0x02f3, B:191:0x03b9, B:192:0x03be), top: B:198:0x02f5 }] */
    /* JADX WARN: Code duplicated, block: B:136:0x02cb A[Catch: JSONException -> 0x0263, TryCatch #0 {JSONException -> 0x0263, blocks: (B:149:0x02f5, B:188:0x03ac, B:152:0x0301, B:154:0x030f, B:157:0x0317, B:158:0x031c, B:159:0x031d, B:161:0x0327, B:162:0x0333, B:164:0x033d, B:165:0x0348, B:167:0x0352, B:168:0x035d, B:170:0x0367, B:171:0x0372, B:173:0x037c, B:175:0x0382, B:176:0x0385, B:177:0x038a, B:178:0x038b, B:180:0x0395, B:182:0x039b, B:183:0x039e, B:184:0x03a3, B:185:0x03a4, B:187:0x03aa, B:189:0x03b3, B:190:0x03b8, B:111:0x024b, B:113:0x0255, B:116:0x025d, B:117:0x0262, B:120:0x0266, B:122:0x0270, B:123:0x027c, B:125:0x0286, B:126:0x0291, B:128:0x029b, B:129:0x02a6, B:131:0x02b0, B:132:0x02bb, B:134:0x02c5, B:136:0x02cb, B:137:0x02ce, B:138:0x02d3, B:139:0x02d4, B:141:0x02de, B:143:0x02e4, B:144:0x02e7, B:145:0x02ec, B:146:0x02ed, B:148:0x02f3, B:191:0x03b9, B:192:0x03be), top: B:198:0x02f5 }] */
    /* JADX WARN: Code duplicated, block: B:139:0x02d4 A[Catch: JSONException -> 0x0263, TryCatch #0 {JSONException -> 0x0263, blocks: (B:149:0x02f5, B:188:0x03ac, B:152:0x0301, B:154:0x030f, B:157:0x0317, B:158:0x031c, B:159:0x031d, B:161:0x0327, B:162:0x0333, B:164:0x033d, B:165:0x0348, B:167:0x0352, B:168:0x035d, B:170:0x0367, B:171:0x0372, B:173:0x037c, B:175:0x0382, B:176:0x0385, B:177:0x038a, B:178:0x038b, B:180:0x0395, B:182:0x039b, B:183:0x039e, B:184:0x03a3, B:185:0x03a4, B:187:0x03aa, B:189:0x03b3, B:190:0x03b8, B:111:0x024b, B:113:0x0255, B:116:0x025d, B:117:0x0262, B:120:0x0266, B:122:0x0270, B:123:0x027c, B:125:0x0286, B:126:0x0291, B:128:0x029b, B:129:0x02a6, B:131:0x02b0, B:132:0x02bb, B:134:0x02c5, B:136:0x02cb, B:137:0x02ce, B:138:0x02d3, B:139:0x02d4, B:141:0x02de, B:143:0x02e4, B:144:0x02e7, B:145:0x02ec, B:146:0x02ed, B:148:0x02f3, B:191:0x03b9, B:192:0x03be), top: B:198:0x02f5 }] */
    /* JADX WARN: Code duplicated, block: B:141:0x02de A[Catch: JSONException -> 0x0263, TryCatch #0 {JSONException -> 0x0263, blocks: (B:149:0x02f5, B:188:0x03ac, B:152:0x0301, B:154:0x030f, B:157:0x0317, B:158:0x031c, B:159:0x031d, B:161:0x0327, B:162:0x0333, B:164:0x033d, B:165:0x0348, B:167:0x0352, B:168:0x035d, B:170:0x0367, B:171:0x0372, B:173:0x037c, B:175:0x0382, B:176:0x0385, B:177:0x038a, B:178:0x038b, B:180:0x0395, B:182:0x039b, B:183:0x039e, B:184:0x03a3, B:185:0x03a4, B:187:0x03aa, B:189:0x03b3, B:190:0x03b8, B:111:0x024b, B:113:0x0255, B:116:0x025d, B:117:0x0262, B:120:0x0266, B:122:0x0270, B:123:0x027c, B:125:0x0286, B:126:0x0291, B:128:0x029b, B:129:0x02a6, B:131:0x02b0, B:132:0x02bb, B:134:0x02c5, B:136:0x02cb, B:137:0x02ce, B:138:0x02d3, B:139:0x02d4, B:141:0x02de, B:143:0x02e4, B:144:0x02e7, B:145:0x02ec, B:146:0x02ed, B:148:0x02f3, B:191:0x03b9, B:192:0x03be), top: B:198:0x02f5 }] */
    /* JADX WARN: Code duplicated, block: B:143:0x02e4 A[Catch: JSONException -> 0x0263, TryCatch #0 {JSONException -> 0x0263, blocks: (B:149:0x02f5, B:188:0x03ac, B:152:0x0301, B:154:0x030f, B:157:0x0317, B:158:0x031c, B:159:0x031d, B:161:0x0327, B:162:0x0333, B:164:0x033d, B:165:0x0348, B:167:0x0352, B:168:0x035d, B:170:0x0367, B:171:0x0372, B:173:0x037c, B:175:0x0382, B:176:0x0385, B:177:0x038a, B:178:0x038b, B:180:0x0395, B:182:0x039b, B:183:0x039e, B:184:0x03a3, B:185:0x03a4, B:187:0x03aa, B:189:0x03b3, B:190:0x03b8, B:111:0x024b, B:113:0x0255, B:116:0x025d, B:117:0x0262, B:120:0x0266, B:122:0x0270, B:123:0x027c, B:125:0x0286, B:126:0x0291, B:128:0x029b, B:129:0x02a6, B:131:0x02b0, B:132:0x02bb, B:134:0x02c5, B:136:0x02cb, B:137:0x02ce, B:138:0x02d3, B:139:0x02d4, B:141:0x02de, B:143:0x02e4, B:144:0x02e7, B:145:0x02ec, B:146:0x02ed, B:148:0x02f3, B:191:0x03b9, B:192:0x03be), top: B:198:0x02f5 }] */
    /* JADX WARN: Code duplicated, block: B:146:0x02ed A[Catch: JSONException -> 0x0263, TryCatch #0 {JSONException -> 0x0263, blocks: (B:149:0x02f5, B:188:0x03ac, B:152:0x0301, B:154:0x030f, B:157:0x0317, B:158:0x031c, B:159:0x031d, B:161:0x0327, B:162:0x0333, B:164:0x033d, B:165:0x0348, B:167:0x0352, B:168:0x035d, B:170:0x0367, B:171:0x0372, B:173:0x037c, B:175:0x0382, B:176:0x0385, B:177:0x038a, B:178:0x038b, B:180:0x0395, B:182:0x039b, B:183:0x039e, B:184:0x03a3, B:185:0x03a4, B:187:0x03aa, B:189:0x03b3, B:190:0x03b8, B:111:0x024b, B:113:0x0255, B:116:0x025d, B:117:0x0262, B:120:0x0266, B:122:0x0270, B:123:0x027c, B:125:0x0286, B:126:0x0291, B:128:0x029b, B:129:0x02a6, B:131:0x02b0, B:132:0x02bb, B:134:0x02c5, B:136:0x02cb, B:137:0x02ce, B:138:0x02d3, B:139:0x02d4, B:141:0x02de, B:143:0x02e4, B:144:0x02e7, B:145:0x02ec, B:146:0x02ed, B:148:0x02f3, B:191:0x03b9, B:192:0x03be), top: B:198:0x02f5 }] */
    /* JADX WARN: Code duplicated, block: B:148:0x02f3 A[Catch: JSONException -> 0x0263, TryCatch #0 {JSONException -> 0x0263, blocks: (B:149:0x02f5, B:188:0x03ac, B:152:0x0301, B:154:0x030f, B:157:0x0317, B:158:0x031c, B:159:0x031d, B:161:0x0327, B:162:0x0333, B:164:0x033d, B:165:0x0348, B:167:0x0352, B:168:0x035d, B:170:0x0367, B:171:0x0372, B:173:0x037c, B:175:0x0382, B:176:0x0385, B:177:0x038a, B:178:0x038b, B:180:0x0395, B:182:0x039b, B:183:0x039e, B:184:0x03a3, B:185:0x03a4, B:187:0x03aa, B:189:0x03b3, B:190:0x03b8, B:111:0x024b, B:113:0x0255, B:116:0x025d, B:117:0x0262, B:120:0x0266, B:122:0x0270, B:123:0x027c, B:125:0x0286, B:126:0x0291, B:128:0x029b, B:129:0x02a6, B:131:0x02b0, B:132:0x02bb, B:134:0x02c5, B:136:0x02cb, B:137:0x02ce, B:138:0x02d3, B:139:0x02d4, B:141:0x02de, B:143:0x02e4, B:144:0x02e7, B:145:0x02ec, B:146:0x02ed, B:148:0x02f3, B:191:0x03b9, B:192:0x03be), top: B:198:0x02f5 }] */
    /* JADX WARN: Code duplicated, block: B:151:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:152:0x0301 A[Catch: JSONException -> 0x0263, TryCatch #0 {JSONException -> 0x0263, blocks: (B:149:0x02f5, B:188:0x03ac, B:152:0x0301, B:154:0x030f, B:157:0x0317, B:158:0x031c, B:159:0x031d, B:161:0x0327, B:162:0x0333, B:164:0x033d, B:165:0x0348, B:167:0x0352, B:168:0x035d, B:170:0x0367, B:171:0x0372, B:173:0x037c, B:175:0x0382, B:176:0x0385, B:177:0x038a, B:178:0x038b, B:180:0x0395, B:182:0x039b, B:183:0x039e, B:184:0x03a3, B:185:0x03a4, B:187:0x03aa, B:189:0x03b3, B:190:0x03b8, B:111:0x024b, B:113:0x0255, B:116:0x025d, B:117:0x0262, B:120:0x0266, B:122:0x0270, B:123:0x027c, B:125:0x0286, B:126:0x0291, B:128:0x029b, B:129:0x02a6, B:131:0x02b0, B:132:0x02bb, B:134:0x02c5, B:136:0x02cb, B:137:0x02ce, B:138:0x02d3, B:139:0x02d4, B:141:0x02de, B:143:0x02e4, B:144:0x02e7, B:145:0x02ec, B:146:0x02ed, B:148:0x02f3, B:191:0x03b9, B:192:0x03be), top: B:198:0x02f5 }] */
    /* JADX WARN: Code duplicated, block: B:154:0x030f A[Catch: JSONException -> 0x0263, TryCatch #0 {JSONException -> 0x0263, blocks: (B:149:0x02f5, B:188:0x03ac, B:152:0x0301, B:154:0x030f, B:157:0x0317, B:158:0x031c, B:159:0x031d, B:161:0x0327, B:162:0x0333, B:164:0x033d, B:165:0x0348, B:167:0x0352, B:168:0x035d, B:170:0x0367, B:171:0x0372, B:173:0x037c, B:175:0x0382, B:176:0x0385, B:177:0x038a, B:178:0x038b, B:180:0x0395, B:182:0x039b, B:183:0x039e, B:184:0x03a3, B:185:0x03a4, B:187:0x03aa, B:189:0x03b3, B:190:0x03b8, B:111:0x024b, B:113:0x0255, B:116:0x025d, B:117:0x0262, B:120:0x0266, B:122:0x0270, B:123:0x027c, B:125:0x0286, B:126:0x0291, B:128:0x029b, B:129:0x02a6, B:131:0x02b0, B:132:0x02bb, B:134:0x02c5, B:136:0x02cb, B:137:0x02ce, B:138:0x02d3, B:139:0x02d4, B:141:0x02de, B:143:0x02e4, B:144:0x02e7, B:145:0x02ec, B:146:0x02ed, B:148:0x02f3, B:191:0x03b9, B:192:0x03be), top: B:198:0x02f5 }] */
    /* JADX WARN: Code duplicated, block: B:156:0x0315  */
    /* JADX WARN: Code duplicated, block: B:159:0x031d A[Catch: JSONException -> 0x0263, TryCatch #0 {JSONException -> 0x0263, blocks: (B:149:0x02f5, B:188:0x03ac, B:152:0x0301, B:154:0x030f, B:157:0x0317, B:158:0x031c, B:159:0x031d, B:161:0x0327, B:162:0x0333, B:164:0x033d, B:165:0x0348, B:167:0x0352, B:168:0x035d, B:170:0x0367, B:171:0x0372, B:173:0x037c, B:175:0x0382, B:176:0x0385, B:177:0x038a, B:178:0x038b, B:180:0x0395, B:182:0x039b, B:183:0x039e, B:184:0x03a3, B:185:0x03a4, B:187:0x03aa, B:189:0x03b3, B:190:0x03b8, B:111:0x024b, B:113:0x0255, B:116:0x025d, B:117:0x0262, B:120:0x0266, B:122:0x0270, B:123:0x027c, B:125:0x0286, B:126:0x0291, B:128:0x029b, B:129:0x02a6, B:131:0x02b0, B:132:0x02bb, B:134:0x02c5, B:136:0x02cb, B:137:0x02ce, B:138:0x02d3, B:139:0x02d4, B:141:0x02de, B:143:0x02e4, B:144:0x02e7, B:145:0x02ec, B:146:0x02ed, B:148:0x02f3, B:191:0x03b9, B:192:0x03be), top: B:198:0x02f5 }] */
    /* JADX WARN: Code duplicated, block: B:161:0x0327 A[Catch: JSONException -> 0x0263, TryCatch #0 {JSONException -> 0x0263, blocks: (B:149:0x02f5, B:188:0x03ac, B:152:0x0301, B:154:0x030f, B:157:0x0317, B:158:0x031c, B:159:0x031d, B:161:0x0327, B:162:0x0333, B:164:0x033d, B:165:0x0348, B:167:0x0352, B:168:0x035d, B:170:0x0367, B:171:0x0372, B:173:0x037c, B:175:0x0382, B:176:0x0385, B:177:0x038a, B:178:0x038b, B:180:0x0395, B:182:0x039b, B:183:0x039e, B:184:0x03a3, B:185:0x03a4, B:187:0x03aa, B:189:0x03b3, B:190:0x03b8, B:111:0x024b, B:113:0x0255, B:116:0x025d, B:117:0x0262, B:120:0x0266, B:122:0x0270, B:123:0x027c, B:125:0x0286, B:126:0x0291, B:128:0x029b, B:129:0x02a6, B:131:0x02b0, B:132:0x02bb, B:134:0x02c5, B:136:0x02cb, B:137:0x02ce, B:138:0x02d3, B:139:0x02d4, B:141:0x02de, B:143:0x02e4, B:144:0x02e7, B:145:0x02ec, B:146:0x02ed, B:148:0x02f3, B:191:0x03b9, B:192:0x03be), top: B:198:0x02f5 }] */
    /* JADX WARN: Code duplicated, block: B:162:0x0333 A[Catch: JSONException -> 0x0263, TryCatch #0 {JSONException -> 0x0263, blocks: (B:149:0x02f5, B:188:0x03ac, B:152:0x0301, B:154:0x030f, B:157:0x0317, B:158:0x031c, B:159:0x031d, B:161:0x0327, B:162:0x0333, B:164:0x033d, B:165:0x0348, B:167:0x0352, B:168:0x035d, B:170:0x0367, B:171:0x0372, B:173:0x037c, B:175:0x0382, B:176:0x0385, B:177:0x038a, B:178:0x038b, B:180:0x0395, B:182:0x039b, B:183:0x039e, B:184:0x03a3, B:185:0x03a4, B:187:0x03aa, B:189:0x03b3, B:190:0x03b8, B:111:0x024b, B:113:0x0255, B:116:0x025d, B:117:0x0262, B:120:0x0266, B:122:0x0270, B:123:0x027c, B:125:0x0286, B:126:0x0291, B:128:0x029b, B:129:0x02a6, B:131:0x02b0, B:132:0x02bb, B:134:0x02c5, B:136:0x02cb, B:137:0x02ce, B:138:0x02d3, B:139:0x02d4, B:141:0x02de, B:143:0x02e4, B:144:0x02e7, B:145:0x02ec, B:146:0x02ed, B:148:0x02f3, B:191:0x03b9, B:192:0x03be), top: B:198:0x02f5 }] */
    /* JADX WARN: Code duplicated, block: B:164:0x033d A[Catch: JSONException -> 0x0263, TryCatch #0 {JSONException -> 0x0263, blocks: (B:149:0x02f5, B:188:0x03ac, B:152:0x0301, B:154:0x030f, B:157:0x0317, B:158:0x031c, B:159:0x031d, B:161:0x0327, B:162:0x0333, B:164:0x033d, B:165:0x0348, B:167:0x0352, B:168:0x035d, B:170:0x0367, B:171:0x0372, B:173:0x037c, B:175:0x0382, B:176:0x0385, B:177:0x038a, B:178:0x038b, B:180:0x0395, B:182:0x039b, B:183:0x039e, B:184:0x03a3, B:185:0x03a4, B:187:0x03aa, B:189:0x03b3, B:190:0x03b8, B:111:0x024b, B:113:0x0255, B:116:0x025d, B:117:0x0262, B:120:0x0266, B:122:0x0270, B:123:0x027c, B:125:0x0286, B:126:0x0291, B:128:0x029b, B:129:0x02a6, B:131:0x02b0, B:132:0x02bb, B:134:0x02c5, B:136:0x02cb, B:137:0x02ce, B:138:0x02d3, B:139:0x02d4, B:141:0x02de, B:143:0x02e4, B:144:0x02e7, B:145:0x02ec, B:146:0x02ed, B:148:0x02f3, B:191:0x03b9, B:192:0x03be), top: B:198:0x02f5 }] */
    /* JADX WARN: Code duplicated, block: B:165:0x0348 A[Catch: JSONException -> 0x0263, TryCatch #0 {JSONException -> 0x0263, blocks: (B:149:0x02f5, B:188:0x03ac, B:152:0x0301, B:154:0x030f, B:157:0x0317, B:158:0x031c, B:159:0x031d, B:161:0x0327, B:162:0x0333, B:164:0x033d, B:165:0x0348, B:167:0x0352, B:168:0x035d, B:170:0x0367, B:171:0x0372, B:173:0x037c, B:175:0x0382, B:176:0x0385, B:177:0x038a, B:178:0x038b, B:180:0x0395, B:182:0x039b, B:183:0x039e, B:184:0x03a3, B:185:0x03a4, B:187:0x03aa, B:189:0x03b3, B:190:0x03b8, B:111:0x024b, B:113:0x0255, B:116:0x025d, B:117:0x0262, B:120:0x0266, B:122:0x0270, B:123:0x027c, B:125:0x0286, B:126:0x0291, B:128:0x029b, B:129:0x02a6, B:131:0x02b0, B:132:0x02bb, B:134:0x02c5, B:136:0x02cb, B:137:0x02ce, B:138:0x02d3, B:139:0x02d4, B:141:0x02de, B:143:0x02e4, B:144:0x02e7, B:145:0x02ec, B:146:0x02ed, B:148:0x02f3, B:191:0x03b9, B:192:0x03be), top: B:198:0x02f5 }] */
    /* JADX WARN: Code duplicated, block: B:167:0x0352 A[Catch: JSONException -> 0x0263, TryCatch #0 {JSONException -> 0x0263, blocks: (B:149:0x02f5, B:188:0x03ac, B:152:0x0301, B:154:0x030f, B:157:0x0317, B:158:0x031c, B:159:0x031d, B:161:0x0327, B:162:0x0333, B:164:0x033d, B:165:0x0348, B:167:0x0352, B:168:0x035d, B:170:0x0367, B:171:0x0372, B:173:0x037c, B:175:0x0382, B:176:0x0385, B:177:0x038a, B:178:0x038b, B:180:0x0395, B:182:0x039b, B:183:0x039e, B:184:0x03a3, B:185:0x03a4, B:187:0x03aa, B:189:0x03b3, B:190:0x03b8, B:111:0x024b, B:113:0x0255, B:116:0x025d, B:117:0x0262, B:120:0x0266, B:122:0x0270, B:123:0x027c, B:125:0x0286, B:126:0x0291, B:128:0x029b, B:129:0x02a6, B:131:0x02b0, B:132:0x02bb, B:134:0x02c5, B:136:0x02cb, B:137:0x02ce, B:138:0x02d3, B:139:0x02d4, B:141:0x02de, B:143:0x02e4, B:144:0x02e7, B:145:0x02ec, B:146:0x02ed, B:148:0x02f3, B:191:0x03b9, B:192:0x03be), top: B:198:0x02f5 }] */
    /* JADX WARN: Code duplicated, block: B:168:0x035d A[Catch: JSONException -> 0x0263, TryCatch #0 {JSONException -> 0x0263, blocks: (B:149:0x02f5, B:188:0x03ac, B:152:0x0301, B:154:0x030f, B:157:0x0317, B:158:0x031c, B:159:0x031d, B:161:0x0327, B:162:0x0333, B:164:0x033d, B:165:0x0348, B:167:0x0352, B:168:0x035d, B:170:0x0367, B:171:0x0372, B:173:0x037c, B:175:0x0382, B:176:0x0385, B:177:0x038a, B:178:0x038b, B:180:0x0395, B:182:0x039b, B:183:0x039e, B:184:0x03a3, B:185:0x03a4, B:187:0x03aa, B:189:0x03b3, B:190:0x03b8, B:111:0x024b, B:113:0x0255, B:116:0x025d, B:117:0x0262, B:120:0x0266, B:122:0x0270, B:123:0x027c, B:125:0x0286, B:126:0x0291, B:128:0x029b, B:129:0x02a6, B:131:0x02b0, B:132:0x02bb, B:134:0x02c5, B:136:0x02cb, B:137:0x02ce, B:138:0x02d3, B:139:0x02d4, B:141:0x02de, B:143:0x02e4, B:144:0x02e7, B:145:0x02ec, B:146:0x02ed, B:148:0x02f3, B:191:0x03b9, B:192:0x03be), top: B:198:0x02f5 }] */
    /* JADX WARN: Code duplicated, block: B:170:0x0367 A[Catch: JSONException -> 0x0263, TryCatch #0 {JSONException -> 0x0263, blocks: (B:149:0x02f5, B:188:0x03ac, B:152:0x0301, B:154:0x030f, B:157:0x0317, B:158:0x031c, B:159:0x031d, B:161:0x0327, B:162:0x0333, B:164:0x033d, B:165:0x0348, B:167:0x0352, B:168:0x035d, B:170:0x0367, B:171:0x0372, B:173:0x037c, B:175:0x0382, B:176:0x0385, B:177:0x038a, B:178:0x038b, B:180:0x0395, B:182:0x039b, B:183:0x039e, B:184:0x03a3, B:185:0x03a4, B:187:0x03aa, B:189:0x03b3, B:190:0x03b8, B:111:0x024b, B:113:0x0255, B:116:0x025d, B:117:0x0262, B:120:0x0266, B:122:0x0270, B:123:0x027c, B:125:0x0286, B:126:0x0291, B:128:0x029b, B:129:0x02a6, B:131:0x02b0, B:132:0x02bb, B:134:0x02c5, B:136:0x02cb, B:137:0x02ce, B:138:0x02d3, B:139:0x02d4, B:141:0x02de, B:143:0x02e4, B:144:0x02e7, B:145:0x02ec, B:146:0x02ed, B:148:0x02f3, B:191:0x03b9, B:192:0x03be), top: B:198:0x02f5 }] */
    /* JADX WARN: Code duplicated, block: B:171:0x0372 A[Catch: JSONException -> 0x0263, TryCatch #0 {JSONException -> 0x0263, blocks: (B:149:0x02f5, B:188:0x03ac, B:152:0x0301, B:154:0x030f, B:157:0x0317, B:158:0x031c, B:159:0x031d, B:161:0x0327, B:162:0x0333, B:164:0x033d, B:165:0x0348, B:167:0x0352, B:168:0x035d, B:170:0x0367, B:171:0x0372, B:173:0x037c, B:175:0x0382, B:176:0x0385, B:177:0x038a, B:178:0x038b, B:180:0x0395, B:182:0x039b, B:183:0x039e, B:184:0x03a3, B:185:0x03a4, B:187:0x03aa, B:189:0x03b3, B:190:0x03b8, B:111:0x024b, B:113:0x0255, B:116:0x025d, B:117:0x0262, B:120:0x0266, B:122:0x0270, B:123:0x027c, B:125:0x0286, B:126:0x0291, B:128:0x029b, B:129:0x02a6, B:131:0x02b0, B:132:0x02bb, B:134:0x02c5, B:136:0x02cb, B:137:0x02ce, B:138:0x02d3, B:139:0x02d4, B:141:0x02de, B:143:0x02e4, B:144:0x02e7, B:145:0x02ec, B:146:0x02ed, B:148:0x02f3, B:191:0x03b9, B:192:0x03be), top: B:198:0x02f5 }] */
    /* JADX WARN: Code duplicated, block: B:173:0x037c A[Catch: JSONException -> 0x0263, TryCatch #0 {JSONException -> 0x0263, blocks: (B:149:0x02f5, B:188:0x03ac, B:152:0x0301, B:154:0x030f, B:157:0x0317, B:158:0x031c, B:159:0x031d, B:161:0x0327, B:162:0x0333, B:164:0x033d, B:165:0x0348, B:167:0x0352, B:168:0x035d, B:170:0x0367, B:171:0x0372, B:173:0x037c, B:175:0x0382, B:176:0x0385, B:177:0x038a, B:178:0x038b, B:180:0x0395, B:182:0x039b, B:183:0x039e, B:184:0x03a3, B:185:0x03a4, B:187:0x03aa, B:189:0x03b3, B:190:0x03b8, B:111:0x024b, B:113:0x0255, B:116:0x025d, B:117:0x0262, B:120:0x0266, B:122:0x0270, B:123:0x027c, B:125:0x0286, B:126:0x0291, B:128:0x029b, B:129:0x02a6, B:131:0x02b0, B:132:0x02bb, B:134:0x02c5, B:136:0x02cb, B:137:0x02ce, B:138:0x02d3, B:139:0x02d4, B:141:0x02de, B:143:0x02e4, B:144:0x02e7, B:145:0x02ec, B:146:0x02ed, B:148:0x02f3, B:191:0x03b9, B:192:0x03be), top: B:198:0x02f5 }] */
    /* JADX WARN: Code duplicated, block: B:175:0x0382 A[Catch: JSONException -> 0x0263, TryCatch #0 {JSONException -> 0x0263, blocks: (B:149:0x02f5, B:188:0x03ac, B:152:0x0301, B:154:0x030f, B:157:0x0317, B:158:0x031c, B:159:0x031d, B:161:0x0327, B:162:0x0333, B:164:0x033d, B:165:0x0348, B:167:0x0352, B:168:0x035d, B:170:0x0367, B:171:0x0372, B:173:0x037c, B:175:0x0382, B:176:0x0385, B:177:0x038a, B:178:0x038b, B:180:0x0395, B:182:0x039b, B:183:0x039e, B:184:0x03a3, B:185:0x03a4, B:187:0x03aa, B:189:0x03b3, B:190:0x03b8, B:111:0x024b, B:113:0x0255, B:116:0x025d, B:117:0x0262, B:120:0x0266, B:122:0x0270, B:123:0x027c, B:125:0x0286, B:126:0x0291, B:128:0x029b, B:129:0x02a6, B:131:0x02b0, B:132:0x02bb, B:134:0x02c5, B:136:0x02cb, B:137:0x02ce, B:138:0x02d3, B:139:0x02d4, B:141:0x02de, B:143:0x02e4, B:144:0x02e7, B:145:0x02ec, B:146:0x02ed, B:148:0x02f3, B:191:0x03b9, B:192:0x03be), top: B:198:0x02f5 }] */
    /* JADX WARN: Code duplicated, block: B:178:0x038b A[Catch: JSONException -> 0x0263, TryCatch #0 {JSONException -> 0x0263, blocks: (B:149:0x02f5, B:188:0x03ac, B:152:0x0301, B:154:0x030f, B:157:0x0317, B:158:0x031c, B:159:0x031d, B:161:0x0327, B:162:0x0333, B:164:0x033d, B:165:0x0348, B:167:0x0352, B:168:0x035d, B:170:0x0367, B:171:0x0372, B:173:0x037c, B:175:0x0382, B:176:0x0385, B:177:0x038a, B:178:0x038b, B:180:0x0395, B:182:0x039b, B:183:0x039e, B:184:0x03a3, B:185:0x03a4, B:187:0x03aa, B:189:0x03b3, B:190:0x03b8, B:111:0x024b, B:113:0x0255, B:116:0x025d, B:117:0x0262, B:120:0x0266, B:122:0x0270, B:123:0x027c, B:125:0x0286, B:126:0x0291, B:128:0x029b, B:129:0x02a6, B:131:0x02b0, B:132:0x02bb, B:134:0x02c5, B:136:0x02cb, B:137:0x02ce, B:138:0x02d3, B:139:0x02d4, B:141:0x02de, B:143:0x02e4, B:144:0x02e7, B:145:0x02ec, B:146:0x02ed, B:148:0x02f3, B:191:0x03b9, B:192:0x03be), top: B:198:0x02f5 }] */
    /* JADX WARN: Code duplicated, block: B:180:0x0395 A[Catch: JSONException -> 0x0263, TryCatch #0 {JSONException -> 0x0263, blocks: (B:149:0x02f5, B:188:0x03ac, B:152:0x0301, B:154:0x030f, B:157:0x0317, B:158:0x031c, B:159:0x031d, B:161:0x0327, B:162:0x0333, B:164:0x033d, B:165:0x0348, B:167:0x0352, B:168:0x035d, B:170:0x0367, B:171:0x0372, B:173:0x037c, B:175:0x0382, B:176:0x0385, B:177:0x038a, B:178:0x038b, B:180:0x0395, B:182:0x039b, B:183:0x039e, B:184:0x03a3, B:185:0x03a4, B:187:0x03aa, B:189:0x03b3, B:190:0x03b8, B:111:0x024b, B:113:0x0255, B:116:0x025d, B:117:0x0262, B:120:0x0266, B:122:0x0270, B:123:0x027c, B:125:0x0286, B:126:0x0291, B:128:0x029b, B:129:0x02a6, B:131:0x02b0, B:132:0x02bb, B:134:0x02c5, B:136:0x02cb, B:137:0x02ce, B:138:0x02d3, B:139:0x02d4, B:141:0x02de, B:143:0x02e4, B:144:0x02e7, B:145:0x02ec, B:146:0x02ed, B:148:0x02f3, B:191:0x03b9, B:192:0x03be), top: B:198:0x02f5 }] */
    /* JADX WARN: Code duplicated, block: B:182:0x039b A[Catch: JSONException -> 0x0263, TryCatch #0 {JSONException -> 0x0263, blocks: (B:149:0x02f5, B:188:0x03ac, B:152:0x0301, B:154:0x030f, B:157:0x0317, B:158:0x031c, B:159:0x031d, B:161:0x0327, B:162:0x0333, B:164:0x033d, B:165:0x0348, B:167:0x0352, B:168:0x035d, B:170:0x0367, B:171:0x0372, B:173:0x037c, B:175:0x0382, B:176:0x0385, B:177:0x038a, B:178:0x038b, B:180:0x0395, B:182:0x039b, B:183:0x039e, B:184:0x03a3, B:185:0x03a4, B:187:0x03aa, B:189:0x03b3, B:190:0x03b8, B:111:0x024b, B:113:0x0255, B:116:0x025d, B:117:0x0262, B:120:0x0266, B:122:0x0270, B:123:0x027c, B:125:0x0286, B:126:0x0291, B:128:0x029b, B:129:0x02a6, B:131:0x02b0, B:132:0x02bb, B:134:0x02c5, B:136:0x02cb, B:137:0x02ce, B:138:0x02d3, B:139:0x02d4, B:141:0x02de, B:143:0x02e4, B:144:0x02e7, B:145:0x02ec, B:146:0x02ed, B:148:0x02f3, B:191:0x03b9, B:192:0x03be), top: B:198:0x02f5 }] */
    /* JADX WARN: Code duplicated, block: B:185:0x03a4 A[Catch: JSONException -> 0x0263, TryCatch #0 {JSONException -> 0x0263, blocks: (B:149:0x02f5, B:188:0x03ac, B:152:0x0301, B:154:0x030f, B:157:0x0317, B:158:0x031c, B:159:0x031d, B:161:0x0327, B:162:0x0333, B:164:0x033d, B:165:0x0348, B:167:0x0352, B:168:0x035d, B:170:0x0367, B:171:0x0372, B:173:0x037c, B:175:0x0382, B:176:0x0385, B:177:0x038a, B:178:0x038b, B:180:0x0395, B:182:0x039b, B:183:0x039e, B:184:0x03a3, B:185:0x03a4, B:187:0x03aa, B:189:0x03b3, B:190:0x03b8, B:111:0x024b, B:113:0x0255, B:116:0x025d, B:117:0x0262, B:120:0x0266, B:122:0x0270, B:123:0x027c, B:125:0x0286, B:126:0x0291, B:128:0x029b, B:129:0x02a6, B:131:0x02b0, B:132:0x02bb, B:134:0x02c5, B:136:0x02cb, B:137:0x02ce, B:138:0x02d3, B:139:0x02d4, B:141:0x02de, B:143:0x02e4, B:144:0x02e7, B:145:0x02ec, B:146:0x02ed, B:148:0x02f3, B:191:0x03b9, B:192:0x03be), top: B:198:0x02f5 }] */
    /* JADX WARN: Code duplicated, block: B:187:0x03aa A[Catch: JSONException -> 0x0263, TryCatch #0 {JSONException -> 0x0263, blocks: (B:149:0x02f5, B:188:0x03ac, B:152:0x0301, B:154:0x030f, B:157:0x0317, B:158:0x031c, B:159:0x031d, B:161:0x0327, B:162:0x0333, B:164:0x033d, B:165:0x0348, B:167:0x0352, B:168:0x035d, B:170:0x0367, B:171:0x0372, B:173:0x037c, B:175:0x0382, B:176:0x0385, B:177:0x038a, B:178:0x038b, B:180:0x0395, B:182:0x039b, B:183:0x039e, B:184:0x03a3, B:185:0x03a4, B:187:0x03aa, B:189:0x03b3, B:190:0x03b8, B:111:0x024b, B:113:0x0255, B:116:0x025d, B:117:0x0262, B:120:0x0266, B:122:0x0270, B:123:0x027c, B:125:0x0286, B:126:0x0291, B:128:0x029b, B:129:0x02a6, B:131:0x02b0, B:132:0x02bb, B:134:0x02c5, B:136:0x02cb, B:137:0x02ce, B:138:0x02d3, B:139:0x02d4, B:141:0x02de, B:143:0x02e4, B:144:0x02e7, B:145:0x02ec, B:146:0x02ed, B:148:0x02f3, B:191:0x03b9, B:192:0x03be), top: B:198:0x02f5 }] */
    /* JADX WARN: Code duplicated, block: B:206:0x0206 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:208:0x02ce A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:209:0x02e7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:210:0x03b9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:211:0x0317 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:212:0x0385 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:213:0x039e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:214:0x03b3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:216:0x025d A[SYNTHETIC] */
    public static final List j(i iVar) {
        Class cls;
        Class cls2;
        Class cls3;
        JSONArray jSONArray;
        int length;
        int i10;
        String str;
        JSONObject jSONObject;
        kotlin.reflect.d dVarB;
        Object obj;
        String string;
        Object jSONObject2;
        Object jSONArray2;
        kotlin.reflect.d dVarB2;
        Object obj2;
        String string2;
        Object jSONObject3;
        Object jSONArray3;
        String string3;
        String string4;
        i iVar2 = iVar;
        String str2 = "url";
        Class cls4 = Boolean.TYPE;
        Class cls5 = Long.TYPE;
        Class cls6 = Integer.TYPE;
        Class cls7 = Double.TYPE;
        ArrayList arrayList = new ArrayList();
        try {
            String string5 = iVar2.f50931f.getString("key");
            cls = JSONObject.class;
            try {
                JSONObject jSONObject4 = iVar2.f50931f;
                if (jSONObject4.has("fileExtension")) {
                    cls2 = JSONArray.class;
                    try {
                        kotlin.reflect.d dVarB3 = F.b(String.class);
                        cls3 = cls4;
                        try {
                            if (Intrinsics.b(dVarB3, F.b(String.class))) {
                                string3 = jSONObject4.getString("fileExtension");
                                if (string3 == null) {
                                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                                }
                            } else if (Intrinsics.b(dVarB3, F.b(cls7))) {
                                string3 = (String) Double.valueOf(jSONObject4.getDouble("fileExtension"));
                            } else if (Intrinsics.b(dVarB3, F.b(cls6))) {
                                string3 = (String) Integer.valueOf(jSONObject4.getInt("fileExtension"));
                            } else if (Intrinsics.b(dVarB3, F.b(cls5))) {
                                string3 = (String) Long.valueOf(jSONObject4.getLong("fileExtension"));
                            } else if (Intrinsics.b(dVarB3, F.b(cls3))) {
                                string3 = (String) Boolean.valueOf(jSONObject4.getBoolean("fileExtension"));
                            } else if (Intrinsics.b(dVarB3, F.b(cls2))) {
                                Object jSONArray4 = jSONObject4.getJSONArray("fileExtension");
                                if (jSONArray4 == null) {
                                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                                }
                                string3 = (String) jSONArray4;
                            } else if (Intrinsics.b(dVarB3, F.b(cls))) {
                                Object jSONObject5 = jSONObject4.getJSONObject("fileExtension");
                                if (jSONObject5 == null) {
                                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                                }
                                string3 = (String) jSONObject5;
                            } else {
                                Object obj3 = jSONObject4.get("fileExtension");
                                if (obj3 == null) {
                                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                                }
                                string3 = (String) obj3;
                            }
                        } catch (JSONException e10) {
                            e = e10;
                            Log.e(f50925p, "Could not read launch asset from manifest", e);
                        }
                    } catch (JSONException e11) {
                        e = e11;
                        cls3 = cls4;
                        Log.e(f50925p, "Could not read launch asset from manifest", e);
                        jSONArray = iVar2.f50932g;
                        if (jSONArray != null) {
                            length = iVar2.f50932g.length();
                            i10 = 0;
                            while (i10 < length) {
                                try {
                                    jSONObject = iVar2.f50932g.getJSONObject(i10);
                                    p158id.a aVar = new p158id.a(jSONObject.getString("key"), jSONObject.getString("fileExtension"));
                                    aVar.K(Uri.parse(jSONObject.getString(str2)));
                                    aVar.x((JSONObject) iVar.l().get(jSONObject.getString("key")));
                                    Intrinsics.c(jSONObject);
                                    if (jSONObject.has("embeddedAssetFilename")) {
                                        dVarB = F.b(String.class);
                                        str = str2;
                                        if (Intrinsics.b(dVarB, F.b(String.class))) {
                                            string = jSONObject.getString("embeddedAssetFilename");
                                            if (string == null) {
                                                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                                            }
                                        } else if (Intrinsics.b(dVarB, F.b(cls7))) {
                                            string = (String) Double.valueOf(jSONObject.getDouble("embeddedAssetFilename"));
                                        } else if (Intrinsics.b(dVarB, F.b(cls6))) {
                                            string = (String) Integer.valueOf(jSONObject.getInt("embeddedAssetFilename"));
                                        } else if (Intrinsics.b(dVarB, F.b(cls5))) {
                                            string = (String) Long.valueOf(jSONObject.getLong("embeddedAssetFilename"));
                                        } else if (Intrinsics.b(dVarB, F.b(cls3))) {
                                            string = (String) Boolean.valueOf(jSONObject.getBoolean("embeddedAssetFilename"));
                                        } else if (Intrinsics.b(dVarB, F.b(cls2))) {
                                            jSONArray2 = jSONObject.getJSONArray("embeddedAssetFilename");
                                            if (jSONArray2 == null) {
                                                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                                            }
                                            string = (String) jSONArray2;
                                        } else if (Intrinsics.b(dVarB, F.b(cls))) {
                                            jSONObject2 = jSONObject.getJSONObject("embeddedAssetFilename");
                                            if (jSONObject2 == null) {
                                                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                                            }
                                            string = (String) jSONObject2;
                                        } else {
                                            obj = jSONObject.get("embeddedAssetFilename");
                                            if (obj == null) {
                                                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                                            }
                                            string = (String) obj;
                                        }
                                    } else {
                                        str = str2;
                                        string = null;
                                    }
                                    try {
                                        aVar.v(string);
                                        if (jSONObject.has("hash")) {
                                            dVarB2 = F.b(String.class);
                                            if (Intrinsics.b(dVarB2, F.b(String.class))) {
                                                string2 = jSONObject.getString("hash");
                                                if (string2 == null) {
                                                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                                                }
                                            } else if (Intrinsics.b(dVarB2, F.b(cls7))) {
                                                string2 = (String) Double.valueOf(jSONObject.getDouble("hash"));
                                            } else if (Intrinsics.b(dVarB2, F.b(cls6))) {
                                                string2 = (String) Integer.valueOf(jSONObject.getInt("hash"));
                                            } else if (Intrinsics.b(dVarB2, F.b(cls5))) {
                                                string2 = (String) Long.valueOf(jSONObject.getLong("hash"));
                                            } else if (Intrinsics.b(dVarB2, F.b(cls3))) {
                                                string2 = (String) Boolean.valueOf(jSONObject.getBoolean("hash"));
                                            } else if (Intrinsics.b(dVarB2, F.b(cls2))) {
                                                jSONArray3 = jSONObject.getJSONArray("hash");
                                                if (jSONArray3 == null) {
                                                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                                                }
                                                string2 = (String) jSONArray3;
                                            } else if (Intrinsics.b(dVarB2, F.b(cls))) {
                                                jSONObject3 = jSONObject.getJSONObject("hash");
                                                if (jSONObject3 == null) {
                                                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                                                }
                                                string2 = (String) jSONObject3;
                                            } else {
                                                obj2 = jSONObject.get("hash");
                                                if (obj2 == null) {
                                                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                                                }
                                                string2 = (String) obj2;
                                            }
                                        } else {
                                            string2 = null;
                                        }
                                        aVar.w(string2);
                                        arrayList.add(aVar);
                                    } catch (JSONException e12) {
                                        e = e12;
                                        Log.e(f50925p, "Could not read asset from manifest", e);
                                    }
                                } catch (JSONException e13) {
                                    e = e13;
                                    str = str2;
                                }
                                i10++;
                                iVar2 = iVar;
                                str2 = str;
                            }
                        }
                        return arrayList;
                    }
                } else {
                    cls2 = JSONArray.class;
                    cls3 = cls4;
                    string3 = null;
                }
                p158id.a aVar2 = new p158id.a(string5, string3);
                aVar2.K(Uri.parse(iVar2.f50931f.getString("url")));
                aVar2.x((JSONObject) iVar2.l().get(iVar2.f50931f.getString("key")));
                aVar2.C(true);
                aVar2.v("app.bundle");
                JSONObject jSONObject6 = iVar2.f50931f;
                if (jSONObject6.has("hash")) {
                    kotlin.reflect.d dVarB4 = F.b(String.class);
                    if (Intrinsics.b(dVarB4, F.b(String.class))) {
                        string4 = jSONObject6.getString("hash");
                        if (string4 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                        }
                    } else if (Intrinsics.b(dVarB4, F.b(cls7))) {
                        string4 = (String) Double.valueOf(jSONObject6.getDouble("hash"));
                    } else if (Intrinsics.b(dVarB4, F.b(cls6))) {
                        string4 = (String) Integer.valueOf(jSONObject6.getInt("hash"));
                    } else if (Intrinsics.b(dVarB4, F.b(cls5))) {
                        string4 = (String) Long.valueOf(jSONObject6.getLong("hash"));
                    } else if (Intrinsics.b(dVarB4, F.b(cls3))) {
                        string4 = (String) Boolean.valueOf(jSONObject6.getBoolean("hash"));
                    } else if (Intrinsics.b(dVarB4, F.b(cls2))) {
                        Object jSONArray5 = jSONObject6.getJSONArray("hash");
                        if (jSONArray5 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                        }
                        string4 = (String) jSONArray5;
                    } else if (Intrinsics.b(dVarB4, F.b(cls))) {
                        Object jSONObject7 = jSONObject6.getJSONObject("hash");
                        if (jSONObject7 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                        }
                        string4 = (String) jSONObject7;
                    } else {
                        Object obj4 = jSONObject6.get("hash");
                        if (obj4 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                        }
                        string4 = (String) obj4;
                    }
                } else {
                    string4 = null;
                }
                aVar2.w(string4);
                arrayList.add(aVar2);
            } catch (JSONException e14) {
                e = e14;
                cls2 = JSONArray.class;
                cls3 = cls4;
                Log.e(f50925p, "Could not read launch asset from manifest", e);
                jSONArray = iVar2.f50932g;
                if (jSONArray != null) {
                    length = iVar2.f50932g.length();
                    i10 = 0;
                    while (i10 < length) {
                        jSONObject = iVar2.f50932g.getJSONObject(i10);
                        p158id.a aVar3 = new p158id.a(jSONObject.getString("key"), jSONObject.getString("fileExtension"));
                        aVar3.K(Uri.parse(jSONObject.getString(str2)));
                        aVar3.x((JSONObject) iVar.l().get(jSONObject.getString("key")));
                        Intrinsics.c(jSONObject);
                        if (jSONObject.has("embeddedAssetFilename")) {
                            str = str2;
                            string = null;
                        } else {
                            dVarB = F.b(String.class);
                            str = str2;
                            if (Intrinsics.b(dVarB, F.b(String.class))) {
                                string = jSONObject.getString("embeddedAssetFilename");
                                if (string == null) {
                                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                                }
                            } else if (Intrinsics.b(dVarB, F.b(cls7))) {
                                string = (String) Double.valueOf(jSONObject.getDouble("embeddedAssetFilename"));
                            } else if (Intrinsics.b(dVarB, F.b(cls6))) {
                                string = (String) Integer.valueOf(jSONObject.getInt("embeddedAssetFilename"));
                            } else if (Intrinsics.b(dVarB, F.b(cls5))) {
                                string = (String) Long.valueOf(jSONObject.getLong("embeddedAssetFilename"));
                            } else if (Intrinsics.b(dVarB, F.b(cls3))) {
                                string = (String) Boolean.valueOf(jSONObject.getBoolean("embeddedAssetFilename"));
                            } else if (Intrinsics.b(dVarB, F.b(cls2))) {
                                jSONArray2 = jSONObject.getJSONArray("embeddedAssetFilename");
                                if (jSONArray2 == null) {
                                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                                }
                                string = (String) jSONArray2;
                            } else if (Intrinsics.b(dVarB, F.b(cls))) {
                                jSONObject2 = jSONObject.getJSONObject("embeddedAssetFilename");
                                if (jSONObject2 == null) {
                                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                                }
                                string = (String) jSONObject2;
                            } else {
                                obj = jSONObject.get("embeddedAssetFilename");
                                if (obj == null) {
                                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                                }
                                string = (String) obj;
                            }
                        }
                        aVar3.v(string);
                        if (jSONObject.has("hash")) {
                            string2 = null;
                        } else {
                            dVarB2 = F.b(String.class);
                            if (Intrinsics.b(dVarB2, F.b(String.class))) {
                                string2 = jSONObject.getString("hash");
                                if (string2 == null) {
                                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                                }
                            } else if (Intrinsics.b(dVarB2, F.b(cls7))) {
                                string2 = (String) Double.valueOf(jSONObject.getDouble("hash"));
                            } else if (Intrinsics.b(dVarB2, F.b(cls6))) {
                                string2 = (String) Integer.valueOf(jSONObject.getInt("hash"));
                            } else if (Intrinsics.b(dVarB2, F.b(cls5))) {
                                string2 = (String) Long.valueOf(jSONObject.getLong("hash"));
                            } else if (Intrinsics.b(dVarB2, F.b(cls3))) {
                                string2 = (String) Boolean.valueOf(jSONObject.getBoolean("hash"));
                            } else if (Intrinsics.b(dVarB2, F.b(cls2))) {
                                jSONArray3 = jSONObject.getJSONArray("hash");
                                if (jSONArray3 == null) {
                                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                                }
                                string2 = (String) jSONArray3;
                            } else if (Intrinsics.b(dVarB2, F.b(cls))) {
                                jSONObject3 = jSONObject.getJSONObject("hash");
                                if (jSONObject3 == null) {
                                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                                }
                                string2 = (String) jSONObject3;
                            } else {
                                obj2 = jSONObject.get("hash");
                                if (obj2 == null) {
                                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                                }
                                string2 = (String) obj2;
                            }
                        }
                        aVar3.w(string2);
                        arrayList.add(aVar3);
                        i10++;
                        iVar2 = iVar;
                        str2 = str;
                    }
                }
                return arrayList;
            }
        } catch (JSONException e15) {
            e = e15;
            cls = JSONObject.class;
        }
        jSONArray = iVar2.f50932g;
        if (jSONArray != null && jSONArray.length() > 0) {
            length = iVar2.f50932g.length();
            i10 = 0;
            while (i10 < length) {
                jSONObject = iVar2.f50932g.getJSONObject(i10);
                p158id.a aVar4 = new p158id.a(jSONObject.getString("key"), jSONObject.getString("fileExtension"));
                aVar4.K(Uri.parse(jSONObject.getString(str2)));
                aVar4.x((JSONObject) iVar.l().get(jSONObject.getString("key")));
                Intrinsics.c(jSONObject);
                if (jSONObject.has("embeddedAssetFilename")) {
                    str = str2;
                    string = null;
                } else {
                    dVarB = F.b(String.class);
                    str = str2;
                    if (Intrinsics.b(dVarB, F.b(String.class))) {
                        string = jSONObject.getString("embeddedAssetFilename");
                        if (string == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                        }
                    } else if (Intrinsics.b(dVarB, F.b(cls7))) {
                        string = (String) Double.valueOf(jSONObject.getDouble("embeddedAssetFilename"));
                    } else if (Intrinsics.b(dVarB, F.b(cls6))) {
                        string = (String) Integer.valueOf(jSONObject.getInt("embeddedAssetFilename"));
                    } else if (Intrinsics.b(dVarB, F.b(cls5))) {
                        string = (String) Long.valueOf(jSONObject.getLong("embeddedAssetFilename"));
                    } else if (Intrinsics.b(dVarB, F.b(cls3))) {
                        string = (String) Boolean.valueOf(jSONObject.getBoolean("embeddedAssetFilename"));
                    } else if (Intrinsics.b(dVarB, F.b(cls2))) {
                        jSONArray2 = jSONObject.getJSONArray("embeddedAssetFilename");
                        if (jSONArray2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                        }
                        string = (String) jSONArray2;
                    } else if (Intrinsics.b(dVarB, F.b(cls))) {
                        jSONObject2 = jSONObject.getJSONObject("embeddedAssetFilename");
                        if (jSONObject2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                        }
                        string = (String) jSONObject2;
                    } else {
                        obj = jSONObject.get("embeddedAssetFilename");
                        if (obj == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                        }
                        string = (String) obj;
                    }
                }
                aVar4.v(string);
                if (jSONObject.has("hash")) {
                    string2 = null;
                } else {
                    dVarB2 = F.b(String.class);
                    if (Intrinsics.b(dVarB2, F.b(String.class))) {
                        string2 = jSONObject.getString("hash");
                        if (string2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                        }
                    } else if (Intrinsics.b(dVarB2, F.b(cls7))) {
                        string2 = (String) Double.valueOf(jSONObject.getDouble("hash"));
                    } else if (Intrinsics.b(dVarB2, F.b(cls6))) {
                        string2 = (String) Integer.valueOf(jSONObject.getInt("hash"));
                    } else if (Intrinsics.b(dVarB2, F.b(cls5))) {
                        string2 = (String) Long.valueOf(jSONObject.getLong("hash"));
                    } else if (Intrinsics.b(dVarB2, F.b(cls3))) {
                        string2 = (String) Boolean.valueOf(jSONObject.getBoolean("hash"));
                    } else if (Intrinsics.b(dVarB2, F.b(cls2))) {
                        jSONArray3 = jSONObject.getJSONArray("hash");
                        if (jSONArray3 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                        }
                        string2 = (String) jSONArray3;
                    } else if (Intrinsics.b(dVarB2, F.b(cls))) {
                        jSONObject3 = jSONObject.getJSONObject("hash");
                        if (jSONObject3 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                        }
                        string2 = (String) jSONObject3;
                    } else {
                        obj2 = jSONObject.get("hash");
                        if (obj2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                        }
                        string2 = (String) obj2;
                    }
                }
                aVar4.w(string2);
                arrayList.add(aVar4);
                i10++;
                iVar2 = iVar;
                str2 = str;
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map k(i iVar) throws JSONException {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        JSONObject jSONObject3 = iVar.f50933h;
        if (jSONObject3 == null) {
            jSONObject3 = new JSONObject();
        }
        boolean zHas = jSONObject3.has("assetRequestHeaders");
        Class cls = Boolean.TYPE;
        Class cls2 = Long.TYPE;
        Class cls3 = Integer.TYPE;
        Class cls4 = Double.TYPE;
        if (zHas) {
            kotlin.reflect.d dVarB = F.b(JSONObject.class);
            if (Intrinsics.b(dVarB, F.b(String.class))) {
                Object string = jSONObject3.getString("assetRequestHeaders");
                if (string == null) {
                    throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                }
                jSONObject = (JSONObject) string;
            } else if (Intrinsics.b(dVarB, F.b(cls4))) {
                jSONObject = (JSONObject) Double.valueOf(jSONObject3.getDouble("assetRequestHeaders"));
            } else if (Intrinsics.b(dVarB, F.b(cls3))) {
                jSONObject = (JSONObject) Integer.valueOf(jSONObject3.getInt("assetRequestHeaders"));
            } else if (Intrinsics.b(dVarB, F.b(cls2))) {
                jSONObject = (JSONObject) Long.valueOf(jSONObject3.getLong("assetRequestHeaders"));
            } else if (Intrinsics.b(dVarB, F.b(cls))) {
                jSONObject = (JSONObject) Boolean.valueOf(jSONObject3.getBoolean("assetRequestHeaders"));
            } else if (Intrinsics.b(dVarB, F.b(JSONArray.class))) {
                Object jSONArray = jSONObject3.getJSONArray("assetRequestHeaders");
                if (jSONArray == null) {
                    throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                }
                jSONObject = (JSONObject) jSONArray;
            } else if (Intrinsics.b(dVarB, F.b(JSONObject.class))) {
                jSONObject = jSONObject3.getJSONObject("assetRequestHeaders");
                if (jSONObject == null) {
                    throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                }
            } else {
                Object obj = jSONObject3.get("assetRequestHeaders");
                if (obj == null) {
                    throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                }
                jSONObject = (JSONObject) obj;
            }
        } else {
            jSONObject = null;
        }
        if (jSONObject == null) {
            return N.i();
        }
        Iterator<String> itKeys = jSONObject.keys();
        Intrinsics.checkNotNullExpressionValue(itKeys, "keys(...)");
        Sequence sequenceH = k.h(itKeys);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj2 : sequenceH) {
            String str = (String) obj2;
            kotlin.reflect.d dVarB2 = F.b(JSONObject.class);
            if (Intrinsics.b(dVarB2, F.b(String.class))) {
                Object string2 = jSONObject.getString(str);
                if (string2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                }
                jSONObject2 = (JSONObject) string2;
            } else if (Intrinsics.b(dVarB2, F.b(cls4))) {
                jSONObject2 = (JSONObject) Double.valueOf(jSONObject.getDouble(str));
            } else if (Intrinsics.b(dVarB2, F.b(cls3))) {
                jSONObject2 = (JSONObject) Integer.valueOf(jSONObject.getInt(str));
            } else if (Intrinsics.b(dVarB2, F.b(cls2))) {
                jSONObject2 = (JSONObject) Long.valueOf(jSONObject.getLong(str));
            } else if (Intrinsics.b(dVarB2, F.b(cls))) {
                jSONObject2 = (JSONObject) Boolean.valueOf(jSONObject.getBoolean(str));
            } else if (Intrinsics.b(dVarB2, F.b(JSONArray.class))) {
                Object jSONArray2 = jSONObject.getJSONArray(str);
                if (jSONArray2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                }
                jSONObject2 = (JSONObject) jSONArray2;
            } else if (Intrinsics.b(dVarB2, F.b(JSONObject.class))) {
                jSONObject2 = jSONObject.getJSONObject(str);
                if (jSONObject2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                }
            } else {
                Object obj3 = jSONObject.get(str);
                if (obj3 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type org.json.JSONObject");
                }
                jSONObject2 = (JSONObject) obj3;
            }
            linkedHashMap.put(obj2, jSONObject2);
        }
        return linkedHashMap;
    }

    private final Map l() {
        return (Map) this.f50937l.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean n(i iVar) {
        return iVar.d().k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p158id.d o(i iVar) {
        p158id.d dVar = new p158id.d(iVar.f50927b, iVar.f50929d, iVar.f50930e, iVar.f50928c, iVar.d().i(), iVar.f50934i, iVar.f50935j);
        if (iVar.b()) {
            dVar.v(p175jd.b.DEVELOPMENT);
        }
        return dVar;
    }

    @Override // p283pd.q
    public List a() {
        return (List) this.f50938m.getValue();
    }

    @Override // p283pd.q
    public boolean b() {
        return ((Boolean) this.f50939n.getValue()).booleanValue();
    }

    @Override // p283pd.q
    public p158id.d c() {
        return (p158id.d) this.f50936k.getValue();
    }

    @Override // p283pd.q
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public b d() {
        return this.f50926a;
    }
}
