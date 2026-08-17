package B9;

/* JADX INFO: loaded from: classes2.dex */
abstract class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final l f616a = b();

    private static final class b implements l {
        private b() {
        }

        /* synthetic */ b(a aVar) {
            this();
        }
    }

    static String a(String str) {
        if (d(str)) {
            return null;
        }
        return str;
    }

    private static l b() {
        return new b(null);
    }

    static String c(String str) {
        return str == null ? "" : str;
    }

    static boolean d(String str) {
        return str == null || str.isEmpty();
    }
}
