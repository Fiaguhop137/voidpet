package Ag;

/* JADX INFO: loaded from: classes3.dex */
public abstract class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f441b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f442c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f443d;

    protected static abstract class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f444a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f445b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f446c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f447d = 0;

        protected a(int i10) {
            this.f444a = i10;
        }

        protected abstract a e();

        protected a f(int i10) {
            this.f447d = i10;
            return e();
        }

        protected a g(int i10) {
            this.f445b = i10;
            return e();
        }

        protected a h(long j10) {
            this.f446c = j10;
            return e();
        }
    }

    protected o(a aVar) {
        this.f440a = aVar.f445b;
        this.f441b = aVar.f446c;
        this.f442c = aVar.f444a;
        this.f443d = aVar.f447d;
    }

    public final int a() {
        return this.f443d;
    }

    protected final int b() {
        return this.f440a;
    }

    protected final long c() {
        return this.f441b;
    }

    protected byte[] d() {
        byte[] bArr = new byte[32];
        Ug.f.c(this.f440a, bArr, 0);
        Ug.f.h(this.f441b, bArr, 4);
        Ug.f.c(this.f442c, bArr, 12);
        Ug.f.c(this.f443d, bArr, 28);
        return bArr;
    }
}
