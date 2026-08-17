package K8;

/* JADX INFO: loaded from: classes2.dex */
public class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class f6057a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f6058b;

    private r(Class cls, Object obj) {
        this.f6057a = cls;
        this.f6058b = obj;
    }

    /* synthetic */ r(Class cls, Object obj, byte[] bArr) {
        this(cls, obj);
    }

    public static r a(Class cls, Object obj) {
        return new r(cls, obj);
    }

    public final Class b() {
        return this.f6057a;
    }

    public final Object c() {
        return this.f6058b;
    }
}
