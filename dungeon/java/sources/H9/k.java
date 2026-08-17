package H9;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.util.q;
import p170j8.AbstractC3851p;
import p170j8.C3855u;
import p170j8.r;

/* JADX INFO: loaded from: classes2.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f4263a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f4264b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f4265c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f4266d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f4267e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f4268f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f4269g;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f4270a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f4271b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f4272c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f4273d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f4274e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private String f4275f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private String f4276g;

        public k a() {
            return new k(this.f4271b, this.f4270a, this.f4272c, this.f4273d, this.f4274e, this.f4275f, this.f4276g, null);
        }

        public b b(String str) {
            this.f4270a = r.g(str, "ApiKey must be set.");
            return this;
        }

        public b c(String str) {
            this.f4271b = r.g(str, "ApplicationId must be set.");
            return this;
        }

        public b d(String str) {
            this.f4272c = str;
            return this;
        }

        public b e(String str) {
            this.f4273d = str;
            return this;
        }

        public b f(String str) {
            this.f4274e = str;
            return this;
        }

        public b g(String str) {
            this.f4276g = str;
            return this;
        }

        public b h(String str) {
            this.f4275f = str;
            return this;
        }
    }

    private k(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        r.p(!q.a(str), "ApplicationId must be set.");
        this.f4264b = str;
        this.f4263a = str2;
        this.f4265c = str3;
        this.f4266d = str4;
        this.f4267e = str5;
        this.f4268f = str6;
        this.f4269g = str7;
    }

    /* synthetic */ k(String str, String str2, String str3, String str4, String str5, String str6, String str7, a aVar) {
        this(str, str2, str3, str4, str5, str6, str7);
    }

    public static k a(Context context) {
        C3855u c3855u = new C3855u(context);
        String strA = c3855u.a("google_app_id");
        if (TextUtils.isEmpty(strA)) {
            return null;
        }
        return new k(strA, c3855u.a("google_api_key"), c3855u.a("firebase_database_url"), c3855u.a("ga_trackingId"), c3855u.a("gcm_defaultSenderId"), c3855u.a("google_storage_bucket"), c3855u.a("project_id"));
    }

    public String b() {
        return this.f4263a;
    }

    public String c() {
        return this.f4264b;
    }

    public String d() {
        return this.f4265c;
    }

    public String e() {
        return this.f4266d;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return AbstractC3851p.a(this.f4264b, kVar.f4264b) && AbstractC3851p.a(this.f4263a, kVar.f4263a) && AbstractC3851p.a(this.f4265c, kVar.f4265c) && AbstractC3851p.a(this.f4266d, kVar.f4266d) && AbstractC3851p.a(this.f4267e, kVar.f4267e) && AbstractC3851p.a(this.f4268f, kVar.f4268f) && AbstractC3851p.a(this.f4269g, kVar.f4269g);
    }

    public String f() {
        return this.f4267e;
    }

    public String g() {
        return this.f4269g;
    }

    public String h() {
        return this.f4268f;
    }

    public int hashCode() {
        return AbstractC3851p.b(this.f4264b, this.f4263a, this.f4265c, this.f4266d, this.f4267e, this.f4268f, this.f4269g);
    }

    public String toString() {
        return AbstractC3851p.c(this).a("applicationId", this.f4264b).a("apiKey", this.f4263a).a("databaseUrl", this.f4265c).a("gcmSenderId", this.f4267e).a("storageBucket", this.f4268f).a("projectId", this.f4269g).toString();
    }
}
