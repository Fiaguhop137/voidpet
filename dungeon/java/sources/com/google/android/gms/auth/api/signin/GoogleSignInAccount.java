package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.util.h;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p170j8.r;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public class GoogleSignInAccount extends p188k8.a implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new c();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final com.google.android.gms.common.util.e f31600n = h.d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f31601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f31602b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f31603c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f31604d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f31605e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Uri f31606f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f31607g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final long f31608h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f31609i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final List f31610j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final String f31611k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final String f31612l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Set f31613m = new HashSet();

    GoogleSignInAccount(int i10, String str, String str2, String str3, String str4, Uri uri, String str5, long j10, String str6, List list, String str7, String str8) {
        this.f31601a = i10;
        this.f31602b = str;
        this.f31603c = str2;
        this.f31604d = str3;
        this.f31605e = str4;
        this.f31606f = uri;
        this.f31607g = str5;
        this.f31608h = j10;
        this.f31609i = str6;
        this.f31610j = list;
        this.f31611k = str7;
        this.f31612l = str8;
    }

    public static GoogleSignInAccount k4(String str, String str2, String str3, String str4, String str5, String str6, Uri uri, Long l10, String str7, Set set) {
        return new GoogleSignInAccount(3, str, str2, str3, str4, uri, null, l10.longValue(), r.f(str7), new ArrayList((Collection) r.l(set)), str5, str6);
    }

    public static GoogleSignInAccount l4(String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String strOptString = jSONObject.optString("photoUrl");
        Uri uri = !TextUtils.isEmpty(strOptString) ? Uri.parse(strOptString) : null;
        long j10 = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            hashSet.add(new Scope(jSONArray.getString(i10)));
        }
        GoogleSignInAccount googleSignInAccountK4 = k4(jSONObject.optString("id"), jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null, jSONObject.has("email") ? jSONObject.optString("email") : null, jSONObject.has("displayName") ? jSONObject.optString("displayName") : null, jSONObject.has("givenName") ? jSONObject.optString("givenName") : null, jSONObject.has("familyName") ? jSONObject.optString("familyName") : null, uri, Long.valueOf(j10), jSONObject.getString("obfuscatedIdentifier"), hashSet);
        googleSignInAccountK4.f31607g = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
        return googleSignInAccountK4;
    }

    public String a4() {
        return this.f31604d;
    }

    public String b4() {
        return this.f31612l;
    }

    public String c4() {
        return this.f31611k;
    }

    public Set d4() {
        return new HashSet(this.f31610j);
    }

    public String e4() {
        return this.f31602b;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        return googleSignInAccount.f31609i.equals(this.f31609i) && googleSignInAccount.h4().equals(h4());
    }

    public String f4() {
        return this.f31603c;
    }

    public Uri g4() {
        return this.f31606f;
    }

    public Set h4() {
        HashSet hashSet = new HashSet(this.f31610j);
        hashSet.addAll(this.f31613m);
        return hashSet;
    }

    public int hashCode() {
        return ((this.f31609i.hashCode() + 527) * 31) + h4().hashCode();
    }

    public String i4() {
        return this.f31607g;
    }

    public boolean j4() {
        return f31600n.a() / 1000 >= this.f31608h + (-300);
    }

    public final String m4() {
        return this.f31609i;
    }

    public final String n4() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (e4() != null) {
                jSONObject.put("id", e4());
            }
            if (f4() != null) {
                jSONObject.put("tokenId", f4());
            }
            if (a4() != null) {
                jSONObject.put("email", a4());
            }
            if (s() != null) {
                jSONObject.put("displayName", s());
            }
            if (c4() != null) {
                jSONObject.put("givenName", c4());
            }
            if (b4() != null) {
                jSONObject.put("familyName", b4());
            }
            Uri uriG4 = g4();
            if (uriG4 != null) {
                jSONObject.put("photoUrl", uriG4.toString());
            }
            if (i4() != null) {
                jSONObject.put("serverAuthCode", i4());
            }
            jSONObject.put("expirationTime", this.f31608h);
            jSONObject.put("obfuscatedIdentifier", this.f31609i);
            JSONArray jSONArray = new JSONArray();
            List list = this.f31610j;
            Scope[] scopeArr = (Scope[]) list.toArray(new Scope[list.size()]);
            Arrays.sort(scopeArr, p063d8.d.f39876a);
            for (Scope scope : scopeArr) {
                jSONArray.put(scope.a4());
            }
            jSONObject.put("grantedScopes", jSONArray);
            jSONObject.remove("serverAuthCode");
            return jSONObject.toString();
        } catch (JSONException e10) {
            throw new RuntimeException(e10);
        }
    }

    public String s() {
        return this.f31605e;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = p188k8.c.a(parcel);
        p188k8.c.n(parcel, 1, this.f31601a);
        p188k8.c.u(parcel, 2, e4(), false);
        p188k8.c.u(parcel, 3, f4(), false);
        p188k8.c.u(parcel, 4, a4(), false);
        p188k8.c.u(parcel, 5, s(), false);
        p188k8.c.t(parcel, 6, g4(), i10, false);
        p188k8.c.u(parcel, 7, i4(), false);
        p188k8.c.r(parcel, 8, this.f31608h);
        p188k8.c.u(parcel, 9, this.f31609i, false);
        p188k8.c.y(parcel, 10, this.f31610j, false);
        p188k8.c.u(parcel, 11, c4(), false);
        p188k8.c.u(parcel, 12, b4(), false);
        p188k8.c.b(parcel, iA);
    }
}
