package M7;

/* JADX INFO: loaded from: classes2.dex */
public abstract class k {

    public static abstract class a {
        public abstract k a();

        public abstract a b(M7.a aVar);

        public abstract a c(b bVar);
    }

    public enum b {
        UNKNOWN(0),
        ANDROID_FIREBASE(23);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f6919a;

        b(int i10) {
            this.f6919a = i10;
        }
    }

    public static a a() {
        return new e.b();
    }

    public abstract M7.a b();

    public abstract b c();
}
