package p158id;

import Ad.v;
import android.net.Uri;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import kotlin.collections.N;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import p175jd.b;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private UUID f43985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Date f43986b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f43987c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f43988d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private JSONObject f43989e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Uri f43990f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Map f43991g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Long f43992h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private b f43993i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f43994j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Date f43995k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f43996l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f43997m;

    public d(UUID id2, Date commitTime, String runtimeVersion, String scopeKey, JSONObject manifest, Uri uri, Map map) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(commitTime, "commitTime");
        Intrinsics.checkNotNullParameter(runtimeVersion, "runtimeVersion");
        Intrinsics.checkNotNullParameter(scopeKey, "scopeKey");
        Intrinsics.checkNotNullParameter(manifest, "manifest");
        this.f43985a = id2;
        this.f43986b = commitTime;
        this.f43987c = runtimeVersion;
        this.f43988d = scopeKey;
        this.f43989e = manifest;
        this.f43990f = uri;
        this.f43991g = map;
        this.f43993i = b.PENDING;
        this.f43995k = new Date();
    }

    public final String a() {
        String string = new JSONObject(N.l(v.a("id", this.f43985a.toString()), v.a("status", this.f43993i.name()))).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public final Date b() {
        return this.f43986b;
    }

    public final int c() {
        return this.f43997m;
    }

    public final UUID d() {
        return this.f43985a;
    }

    public final boolean e() {
        return this.f43994j;
    }

    public final Date f() {
        return this.f43995k;
    }

    public final Long g() {
        return this.f43992h;
    }

    public final String h() {
        String string = this.f43985a.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        String lowerCase = string.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    public final JSONObject i() {
        return this.f43989e;
    }

    public final Map j() {
        return this.f43991g;
    }

    public final String k() {
        return this.f43987c;
    }

    public final String l() {
        return this.f43988d;
    }

    public final b m() {
        return this.f43993i;
    }

    public final int n() {
        return this.f43996l;
    }

    public final Uri o() {
        return this.f43990f;
    }

    public final void p(Date date) {
        Intrinsics.checkNotNullParameter(date, "<set-?>");
        this.f43986b = date;
    }

    public final void q(int i10) {
        this.f43997m = i10;
    }

    public final void r(boolean z10) {
        this.f43994j = z10;
    }

    public final void s(Date date) {
        Intrinsics.checkNotNullParameter(date, "<set-?>");
        this.f43995k = date;
    }

    public final void t(Long l10) {
        this.f43992h = l10;
    }

    public final void u(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.f43988d = str;
    }

    public final void v(b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<set-?>");
        this.f43993i = bVar;
    }

    public final void w(int i10) {
        this.f43996l = i10;
    }
}
