package p355td;

import Ad.j;
import Ad.v;
import android.os.Bundle;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.collections.N;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final a f54625p = new a(null);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final Lazy f54626q = j.b(new p355td.a());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f54627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f54628b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f54629c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f54630d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f54631e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f54632f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f54633g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final JSONObject f54634h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final JSONObject f54635i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final c f54636j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final d f54637k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final d f54638l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final double f54639m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Date f54640n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final int f54641o;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final SimpleDateFormat a() {
            return (SimpleDateFormat) b.f54626q.getValue();
        }
    }

    public b(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, int i10, JSONObject jSONObject, JSONObject jSONObject2, c cVar, d dVar, d dVar2, double d10, Date date) {
        this(z10, z11, z12, z13, z14, z15, i10, jSONObject, jSONObject2, cVar, dVar, dVar2, d10, date, 0);
    }

    private b(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, int i10, JSONObject jSONObject, JSONObject jSONObject2, c cVar, d dVar, d dVar2, double d10, Date date, int i11) {
        this.f54627a = z10;
        this.f54628b = z11;
        this.f54629c = z12;
        this.f54630d = z13;
        this.f54631e = z14;
        this.f54632f = z15;
        this.f54633g = i10;
        this.f54634h = jSONObject;
        this.f54635i = jSONObject2;
        this.f54636j = cVar;
        this.f54637k = dVar;
        this.f54638l = dVar2;
        this.f54639m = d10;
        this.f54640n = date;
        this.f54641o = i11;
    }

    /* synthetic */ b(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, int i10, JSONObject jSONObject, JSONObject jSONObject2, c cVar, d dVar, d dVar2, double d10, Date date, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? false : z10, (i12 & 2) != 0 ? false : z11, (i12 & 4) != 0 ? false : z12, (i12 & 8) != 0 ? false : z13, (i12 & 16) != 0 ? false : z14, (i12 & 32) != 0 ? false : z15, (i12 & 64) != 0 ? 0 : i10, (i12 & 128) != 0 ? null : jSONObject, (i12 & 256) != 0 ? null : jSONObject2, (i12 & 512) != 0 ? null : cVar, (i12 & 1024) != 0 ? null : dVar, (i12 & 2048) != 0 ? null : dVar2, (i12 & 4096) != 0 ? 0.0d : d10, (i12 & 8192) != 0 ? null : date, i11);
    }

    public /* synthetic */ b(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, int i10, JSONObject jSONObject, JSONObject jSONObject2, c cVar, d dVar, d dVar2, double d10, Date date, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? false : z10, (i11 & 2) != 0 ? false : z11, (i11 & 4) != 0 ? false : z12, (i11 & 8) != 0 ? false : z13, (i11 & 16) != 0 ? false : z14, (i11 & 32) != 0 ? false : z15, (i11 & 64) == 0 ? i10 : 0, (i11 & 128) != 0 ? null : jSONObject, (i11 & 256) != 0 ? null : jSONObject2, (i11 & 512) != 0 ? null : cVar, (i11 & 1024) != 0 ? null : dVar, (i11 & 2048) != 0 ? null : dVar2, (i11 & 4096) != 0 ? 0.0d : d10, (i11 & 8192) != 0 ? null : date);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SimpleDateFormat b() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        return simpleDateFormat;
    }

    public final b d(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, double d10, boolean z15, int i10, JSONObject jSONObject, JSONObject jSONObject2, c cVar, d dVar, d dVar2, Date date) {
        return new b(z10, z11, z12, z13, z14, z15, i10, jSONObject, jSONObject2, cVar, dVar, dVar2, d10, date, this.f54641o + 1);
    }

    public final Bundle f() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("isStartupProcedureRunning", this.f54627a);
        bundle.putBoolean("isUpdateAvailable", this.f54628b);
        bundle.putBoolean("isUpdatePending", this.f54629c);
        bundle.putBoolean("isChecking", this.f54630d);
        bundle.putBoolean("isDownloading", this.f54631e);
        bundle.putBoolean("isRestarting", this.f54632f);
        bundle.putInt("restartCount", this.f54633g);
        bundle.putInt("sequenceNumber", this.f54641o);
        bundle.putDouble("downloadProgress", this.f54639m);
        JSONObject jSONObject = this.f54634h;
        if (jSONObject != null) {
            bundle.putString("latestManifestString", jSONObject.toString());
        }
        JSONObject jSONObject2 = this.f54635i;
        if (jSONObject2 != null) {
            bundle.putString("downloadedManifestString", jSONObject2.toString());
        }
        if (this.f54636j != null) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("commitTime", this.f54636j.a());
            Unit unit = Unit.f48228a;
            bundle.putBundle("rollback", bundle2);
        }
        if (this.f54637k != null) {
            Bundle bundle3 = new Bundle();
            bundle3.putString("message", this.f54637k.b());
            bundle.putBundle("checkError", bundle3);
        }
        if (this.f54638l != null) {
            Bundle bundle4 = new Bundle();
            bundle4.putString("message", this.f54638l.b());
            bundle.putBundle("downloadError", bundle4);
        }
        if (this.f54640n != null) {
            bundle.putString("lastCheckForUpdateTimeString", f54625p.a().format(this.f54640n));
        }
        return bundle;
    }

    public final Map g() {
        Map mapM = N.m(v.a("isStartupProcedureRunning", Boolean.valueOf(this.f54627a)), v.a("isUpdateAvailable", Boolean.valueOf(this.f54628b)), v.a("isUpdatePending", Boolean.valueOf(this.f54629c)), v.a("isChecking", Boolean.valueOf(this.f54630d)), v.a("isDownloading", Boolean.valueOf(this.f54631e)), v.a("isRestarting", Boolean.valueOf(this.f54632f)), v.a("restartCount", Integer.valueOf(this.f54633g)), v.a("downloadProgress", Double.valueOf(this.f54639m)), v.a("sequenceNumber", Integer.valueOf(this.f54641o)));
        JSONObject jSONObject = this.f54634h;
        if (jSONObject != null) {
            mapM.put("latestManifest", jSONObject);
        }
        JSONObject jSONObject2 = this.f54635i;
        if (jSONObject2 != null) {
            mapM.put("downloadedManifest", jSONObject2);
        }
        c cVar = this.f54636j;
        if (cVar != null) {
            mapM.put("rollback", cVar.b());
        }
        d dVar = this.f54637k;
        if (dVar != null) {
            mapM.put("checkError", dVar.a());
        }
        d dVar2 = this.f54638l;
        if (dVar2 != null) {
            mapM.put("downloadError", dVar2.a());
        }
        Date date = this.f54640n;
        if (date != null) {
            mapM.put("lastCheckForUpdateTime", date);
        }
        return mapM;
    }

    public final b h() {
        return new b(false, false, false, false, false, false, this.f54633g + 1, null, null, null, null, null, 0.0d, null, this.f54641o + 1, 16319, null);
    }
}
