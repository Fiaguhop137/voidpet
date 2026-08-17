package io.sentry;

/* JADX INFO: loaded from: classes3.dex */
interface k4 {

    public static final class a implements k4 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final a f45955a = new a();

        private a() {
        }

        static k4 c() {
            return f45955a;
        }

        @Override // io.sentry.k4
        public void a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
            Thread.setDefaultUncaughtExceptionHandler(uncaughtExceptionHandler);
        }

        @Override // io.sentry.k4
        public Thread.UncaughtExceptionHandler b() {
            return Thread.getDefaultUncaughtExceptionHandler();
        }
    }

    void a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler);

    Thread.UncaughtExceptionHandler b();
}
