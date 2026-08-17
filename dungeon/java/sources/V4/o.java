package V4;

/* JADX INFO: loaded from: classes.dex */
public abstract class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n f14062a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n f14063b = new c();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final n f14064c = new d();

    class a implements n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object f14065a;

        a(Object obj) {
            this.f14065a = obj;
        }

        @Override // V4.n
        public Object get() {
            return this.f14065a;
        }
    }

    class b implements n {
        b() {
        }

        @Override // V4.n
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean get() {
            return Boolean.TRUE;
        }
    }

    class c implements n {
        c() {
        }

        @Override // V4.n
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean get() {
            return Boolean.FALSE;
        }
    }

    class d implements n {
        d() {
        }

        @Override // V4.n
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String get() {
            return "";
        }
    }

    public static n a(Object obj) {
        return new a(obj);
    }
}
