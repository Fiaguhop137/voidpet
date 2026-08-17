package p094f3;

import android.os.Build;
import android.os.ext.SdkExtensions;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f41708a = new b();

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f41709a = new a();

        private a() {
        }

        public final int a() {
            return SdkExtensions.getExtensionVersion(31);
        }
    }

    /* JADX INFO: renamed from: f3.b$b, reason: collision with other inner class name */
    private static final class C0475b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0475b f41710a = new C0475b();

        private C0475b() {
        }

        public final int a() {
            return SdkExtensions.getExtensionVersion(1000000);
        }
    }

    private b() {
    }

    public final int a() {
        if (Build.VERSION.SDK_INT >= 33) {
            return C0475b.f41710a.a();
        }
        return 0;
    }

    public final int b() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 == 31 || i10 == 32) {
            return a.f41709a.a();
        }
        return 0;
    }
}
