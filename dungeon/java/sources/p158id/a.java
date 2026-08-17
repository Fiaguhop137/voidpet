package p158id;

import android.net.Uri;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f43959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f43960b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f43961c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Uri f43962d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private JSONObject f43963e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private JSONObject f43964f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private JSONObject f43965g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Date f43966h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f43967i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private byte[] f43968j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private p175jd.a f43969k = p175jd.a.SHA256;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f43970l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f43971m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f43972n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private String f43973o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private String f43974p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private String f43975q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Float f43976r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Float[] f43977s;

    public a(String str, String str2) {
        this.f43959a = str;
        this.f43960b = str2;
    }

    public final void A(JSONObject jSONObject) {
        this.f43963e = jSONObject;
    }

    public final void B(long j10) {
        this.f43961c = j10;
    }

    public final void C(boolean z10) {
        this.f43972n = z10;
    }

    public final void D(boolean z10) {
        this.f43971m = z10;
    }

    public final void E(JSONObject jSONObject) {
        this.f43965g = jSONObject;
    }

    public final void F(String str) {
        this.f43967i = str;
    }

    public final void G(String str) {
        this.f43974p = str;
    }

    public final void H(String str) {
        this.f43975q = str;
    }

    public final void I(Float f10) {
        this.f43976r = f10;
    }

    public final void J(Float[] fArr) {
        this.f43977s = fArr;
    }

    public final void K(Uri uri) {
        this.f43962d = uri;
    }

    public final Date a() {
        return this.f43966h;
    }

    public final String b() {
        return this.f43973o;
    }

    public final String c() {
        return this.f43970l;
    }

    public final JSONObject d() {
        return this.f43964f;
    }

    public final String e() {
        String str = this.f43960b;
        if (str == null) {
            return "";
        }
        if (StringsKt.O(str, ".", false, 2, null)) {
            return str;
        }
        return "." + str;
    }

    public final byte[] f() {
        return this.f43968j;
    }

    public final p175jd.a g() {
        return this.f43969k;
    }

    public final JSONObject h() {
        return this.f43963e;
    }

    public final long i() {
        return this.f43961c;
    }

    public final String j() {
        return this.f43959a;
    }

    public final boolean k() {
        return this.f43971m;
    }

    public final JSONObject l() {
        return this.f43965g;
    }

    public final String m() {
        return this.f43967i;
    }

    public final String n() {
        return this.f43974p;
    }

    public final String o() {
        return this.f43975q;
    }

    public final Float p() {
        return this.f43976r;
    }

    public final Float[] q() {
        return this.f43977s;
    }

    public final String r() {
        return this.f43960b;
    }

    public final Uri s() {
        return this.f43962d;
    }

    public final boolean t() {
        return this.f43972n;
    }

    public final void u(Date date) {
        this.f43966h = date;
    }

    public final void v(String str) {
        this.f43973o = str;
    }

    public final void w(String str) {
        this.f43970l = str;
    }

    public final void x(JSONObject jSONObject) {
        this.f43964f = jSONObject;
    }

    public final void y(byte[] bArr) {
        this.f43968j = bArr;
    }

    public final void z(p175jd.a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.f43969k = aVar;
    }
}
