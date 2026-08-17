package p335sb;

import android.app.Application;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static C0651a f53465b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f53464a = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f53466c = 8;

    /* JADX INFO: renamed from: sb.a$a, reason: collision with other inner class name */
    public static final class C0651a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f53467a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f53468b;

        public C0651a(String appName, String str) {
            Intrinsics.checkNotNullParameter(appName, "appName");
            this.f53467a = appName;
            this.f53468b = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0651a)) {
                return false;
            }
            C0651a c0651a = (C0651a) obj;
            return Intrinsics.b(this.f53467a, c0651a.f53467a) && Intrinsics.b(this.f53468b, c0651a.f53468b);
        }

        public int hashCode() {
            int iHashCode = this.f53467a.hashCode() * 31;
            String str = this.f53468b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "Native(appName=" + this.f53467a + ", appVersion=" + this.f53468b + ")";
        }
    }

    private a() {
    }

    private final C0651a a(Application application) throws PackageManager.NameNotFoundException {
        PackageManager packageManager = application.getPackageManager();
        String packageName = application.getPackageName();
        String str = packageManager.getPackageInfo(packageName, 0).versionName;
        ApplicationInfo applicationInfo = packageManager.getApplicationInfo(packageName, 128);
        Intrinsics.checkNotNullExpressionValue(applicationInfo, "getApplicationInfo(...)");
        return new C0651a(packageManager.getApplicationLabel(applicationInfo).toString(), str);
    }

    public final void b(Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        c(a(application));
    }

    public final void c(C0651a c0651a) {
        Intrinsics.checkNotNullParameter(c0651a, "<set-?>");
        f53465b = c0651a;
    }
}
