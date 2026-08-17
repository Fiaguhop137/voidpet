package Ke;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c {

    public static final class a extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f6183a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final int f6184b;

        static {
            d.a aVar = d.f6186c;
            f6184b = (~(aVar.i() | aVar.d())) & aVar.b();
        }

        private a() {
        }

        @Override // Ke.c
        public int a() {
            return f6184b;
        }
    }

    public static final class b extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f6185a = new b();

        private b() {
        }

        @Override // Ke.c
        public int a() {
            return 0;
        }
    }

    public abstract int a();

    public String toString() {
        return getClass().getSimpleName();
    }
}
