package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p170j8.r;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public class GoogleSignInOptions extends p188k8.a implements h8.a.d, ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<GoogleSignInOptions> CREATOR;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final GoogleSignInOptions f31614l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final GoogleSignInOptions f31615m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Scope f31616n = new Scope("profile");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Scope f31617o = new Scope("email");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Scope f31618p = new Scope("openid");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Scope f31619q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Scope f31620r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final Comparator f31621s;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f31622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList f31623b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Account f31624c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f31625d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f31626e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f31627f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f31628g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f31629h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ArrayList f31630i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f31631j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Map f31632k;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Set f31633a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f31634b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f31635c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f31636d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f31637e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Account f31638f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private String f31639g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private Map f31640h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private String f31641i;

        public a() {
            this.f31633a = new HashSet();
            this.f31640h = new HashMap();
        }

        public a(GoogleSignInOptions googleSignInOptions) {
            this.f31633a = new HashSet();
            this.f31640h = new HashMap();
            r.l(googleSignInOptions);
            this.f31633a = new HashSet(googleSignInOptions.f31623b);
            this.f31634b = googleSignInOptions.f31626e;
            this.f31635c = googleSignInOptions.f31627f;
            this.f31636d = googleSignInOptions.f31625d;
            this.f31637e = googleSignInOptions.f31628g;
            this.f31638f = googleSignInOptions.f31624c;
            this.f31639g = googleSignInOptions.f31629h;
            this.f31640h = GoogleSignInOptions.u4(googleSignInOptions.f31630i);
            this.f31641i = googleSignInOptions.f31631j;
        }

        private final String j(String str) {
            r.f(str);
            String str2 = this.f31637e;
            boolean z10 = true;
            if (str2 != null && !str2.equals(str)) {
                z10 = false;
            }
            r.b(z10, "two different server client ids provided");
            return str;
        }

        public GoogleSignInOptions a() {
            if (this.f31633a.contains(GoogleSignInOptions.f31620r)) {
                Set set = this.f31633a;
                Scope scope = GoogleSignInOptions.f31619q;
                if (set.contains(scope)) {
                    this.f31633a.remove(scope);
                }
            }
            if (this.f31636d && (this.f31638f == null || !this.f31633a.isEmpty())) {
                b();
            }
            return new GoogleSignInOptions(3, new ArrayList(this.f31633a), this.f31638f, this.f31636d, this.f31634b, this.f31635c, this.f31637e, this.f31639g, this.f31640h, this.f31641i, null);
        }

        public a b() {
            this.f31633a.add(GoogleSignInOptions.f31618p);
            return this;
        }

        public a c(String str) {
            this.f31636d = true;
            j(str);
            this.f31637e = str;
            return this;
        }

        public a d() {
            this.f31633a.add(GoogleSignInOptions.f31616n);
            return this;
        }

        public a e(Scope scope, Scope... scopeArr) {
            this.f31633a.add(scope);
            this.f31633a.addAll(Arrays.asList(scopeArr));
            return this;
        }

        public a f(String str, boolean z10) {
            this.f31634b = true;
            j(str);
            this.f31637e = str;
            this.f31635c = z10;
            return this;
        }

        public a g(String str) {
            this.f31638f = new Account(r.f(str), "com.google");
            return this;
        }

        public a h(String str) {
            this.f31639g = r.f(str);
            return this;
        }

        public a i(String str) {
            this.f31641i = str;
            return this;
        }
    }

    static {
        Scope scope = new Scope("https://www.googleapis.com/auth/games_lite");
        f31619q = scope;
        f31620r = new Scope("https://www.googleapis.com/auth/games");
        a aVar = new a();
        aVar.b();
        aVar.d();
        f31614l = aVar.a();
        a aVar2 = new a();
        aVar2.e(scope, new Scope[0]);
        f31615m = aVar2.a();
        CREATOR = new e();
        f31621s = new d();
    }

    GoogleSignInOptions(int i10, ArrayList arrayList, Account account, boolean z10, boolean z11, boolean z12, String str, String str2, ArrayList arrayList2, String str3) {
        this(i10, arrayList, account, z10, z11, z12, str, str2, u4(arrayList2), str3);
    }

    private GoogleSignInOptions(int i10, ArrayList arrayList, Account account, boolean z10, boolean z11, boolean z12, String str, String str2, Map map, String str3) {
        this.f31622a = i10;
        this.f31623b = arrayList;
        this.f31624c = account;
        this.f31625d = z10;
        this.f31626e = z11;
        this.f31627f = z12;
        this.f31628g = str;
        this.f31629h = str2;
        this.f31630i = new ArrayList(map.values());
        this.f31632k = map;
        this.f31631j = str3;
    }

    /* synthetic */ GoogleSignInOptions(int i10, ArrayList arrayList, Account account, boolean z10, boolean z11, boolean z12, String str, String str2, Map map, String str3, p063d8.e eVar) {
        this(3, arrayList, account, z10, z11, z12, str, str2, map, str3);
    }

    public static GoogleSignInOptions j4(String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("scopes");
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            hashSet.add(new Scope(jSONArray.getString(i10)));
        }
        String strOptString = jSONObject.has("accountName") ? jSONObject.optString("accountName") : null;
        return new GoogleSignInOptions(3, new ArrayList(hashSet), !TextUtils.isEmpty(strOptString) ? new Account(strOptString, "com.google") : null, jSONObject.getBoolean("idTokenRequested"), jSONObject.getBoolean("serverAuthRequested"), jSONObject.getBoolean("forceCodeForRefreshToken"), jSONObject.has("serverClientId") ? jSONObject.optString("serverClientId") : null, jSONObject.has("hostedDomain") ? jSONObject.optString("hostedDomain") : null, new HashMap(), (String) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Map u4(List list) {
        HashMap map = new HashMap();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                p081e8.a aVar = (p081e8.a) it.next();
                map.put(Integer.valueOf(aVar.getType()), aVar);
            }
        }
        return map;
    }

    public Account a4() {
        return this.f31624c;
    }

    public ArrayList b4() {
        return this.f31630i;
    }

    public String c4() {
        return this.f31631j;
    }

    public ArrayList d4() {
        return new ArrayList(this.f31623b);
    }

    public String e4() {
        return this.f31628g;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0052 A[Catch: ClassCastException -> 0x0090, TryCatch #0 {ClassCastException -> 0x0090, blocks: (B:5:0x0004, B:7:0x000e, B:10:0x0018, B:12:0x0028, B:15:0x0035, B:17:0x0039, B:22:0x004a, B:24:0x0052, B:30:0x006a, B:32:0x0072, B:34:0x007a, B:36:0x0082, B:27:0x005d, B:20:0x0040), top: B:42:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:26:0x005c  */
    /* JADX WARN: Code duplicated, block: B:27:0x005d A[Catch: ClassCastException -> 0x0090, TryCatch #0 {ClassCastException -> 0x0090, blocks: (B:5:0x0004, B:7:0x000e, B:10:0x0018, B:12:0x0028, B:15:0x0035, B:17:0x0039, B:22:0x004a, B:24:0x0052, B:30:0x006a, B:32:0x0072, B:34:0x007a, B:36:0x0082, B:27:0x005d, B:20:0x0040), top: B:42:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:29:0x0069  */
    /* JADX WARN: Code duplicated, block: B:30:0x006a A[Catch: ClassCastException -> 0x0090, TryCatch #0 {ClassCastException -> 0x0090, blocks: (B:5:0x0004, B:7:0x000e, B:10:0x0018, B:12:0x0028, B:15:0x0035, B:17:0x0039, B:22:0x004a, B:24:0x0052, B:30:0x006a, B:32:0x0072, B:34:0x007a, B:36:0x0082, B:27:0x005d, B:20:0x0040), top: B:42:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x0072 A[Catch: ClassCastException -> 0x0090, TryCatch #0 {ClassCastException -> 0x0090, blocks: (B:5:0x0004, B:7:0x000e, B:10:0x0018, B:12:0x0028, B:15:0x0035, B:17:0x0039, B:22:0x004a, B:24:0x0052, B:30:0x006a, B:32:0x0072, B:34:0x007a, B:36:0x0082, B:27:0x005d, B:20:0x0040), top: B:42:0x0004 }] */
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            GoogleSignInOptions googleSignInOptions = (GoogleSignInOptions) obj;
            if (this.f31630i.isEmpty() && googleSignInOptions.f31630i.isEmpty() && this.f31623b.size() == googleSignInOptions.d4().size() && this.f31623b.containsAll(googleSignInOptions.d4())) {
                Account account = this.f31624c;
                if (account == null) {
                    if (googleSignInOptions.a4() == null) {
                        if (TextUtils.isEmpty(this.f31628g)) {
                            if (TextUtils.isEmpty(googleSignInOptions.e4())) {
                                if (this.f31627f != googleSignInOptions.f4() && this.f31625d == googleSignInOptions.g4() && this.f31626e == googleSignInOptions.h4() && TextUtils.equals(this.f31631j, googleSignInOptions.c4())) {
                                    return true;
                                }
                            }
                        } else if (!this.f31628g.equals(googleSignInOptions.e4())) {
                            if (this.f31627f != googleSignInOptions.f4()) {
                            }
                        }
                    }
                } else if (account.equals(googleSignInOptions.a4())) {
                    if (TextUtils.isEmpty(this.f31628g)) {
                        if (TextUtils.isEmpty(googleSignInOptions.e4())) {
                            if (this.f31627f != googleSignInOptions.f4()) {
                            }
                        }
                    } else if (!this.f31628g.equals(googleSignInOptions.e4())) {
                        if (this.f31627f != googleSignInOptions.f4()) {
                        }
                    }
                }
            }
        } catch (ClassCastException unused) {
        }
        return false;
    }

    public boolean f4() {
        return this.f31627f;
    }

    public boolean g4() {
        return this.f31625d;
    }

    public boolean h4() {
        return this.f31626e;
    }

    public int hashCode() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f31623b;
        int size = arrayList2.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(((Scope) arrayList2.get(i10)).a4());
        }
        Collections.sort(arrayList);
        p081e8.b bVar = new p081e8.b();
        bVar.a(arrayList);
        bVar.a(this.f31624c);
        bVar.a(this.f31628g);
        bVar.c(this.f31627f);
        bVar.c(this.f31625d);
        bVar.c(this.f31626e);
        bVar.a(this.f31631j);
        return bVar.b();
    }

    public final String n4() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            Collections.sort(this.f31623b, f31621s);
            Iterator it = this.f31623b.iterator();
            while (it.hasNext()) {
                jSONArray.put(((Scope) it.next()).a4());
            }
            jSONObject.put("scopes", jSONArray);
            Account account = this.f31624c;
            if (account != null) {
                jSONObject.put("accountName", account.name);
            }
            jSONObject.put("idTokenRequested", this.f31625d);
            jSONObject.put("forceCodeForRefreshToken", this.f31627f);
            jSONObject.put("serverAuthRequested", this.f31626e);
            if (!TextUtils.isEmpty(this.f31628g)) {
                jSONObject.put("serverClientId", this.f31628g);
            }
            if (!TextUtils.isEmpty(this.f31629h)) {
                jSONObject.put("hostedDomain", this.f31629h);
            }
            return jSONObject.toString();
        } catch (JSONException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f31622a;
        int iA = p188k8.c.a(parcel);
        p188k8.c.n(parcel, 1, i11);
        p188k8.c.y(parcel, 2, d4(), false);
        p188k8.c.t(parcel, 3, a4(), i10, false);
        p188k8.c.c(parcel, 4, g4());
        p188k8.c.c(parcel, 5, h4());
        p188k8.c.c(parcel, 6, f4());
        p188k8.c.u(parcel, 7, e4(), false);
        p188k8.c.u(parcel, 8, this.f31629h, false);
        p188k8.c.y(parcel, 9, b4(), false);
        p188k8.c.u(parcel, 10, c4(), false);
        p188k8.c.b(parcel, iA);
    }
}
