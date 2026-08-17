package N7;

/* JADX INFO: loaded from: classes2.dex */
abstract class n {

    public static abstract class a {
        public abstract n a();

        abstract a b(L7.c cVar);

        abstract a c(L7.d dVar);

        abstract a d(L7.g gVar);

        public abstract a e(o oVar);

        public abstract a f(String str);
    }

    n() {
    }

    public static a a() {
        return new c.b();
    }

    public abstract L7.c b();

    abstract L7.d c();

    public byte[] d() {
        return (byte[]) e().apply(c().b());
    }

    abstract L7.g e();

    public abstract o f();

    public abstract String g();
}
