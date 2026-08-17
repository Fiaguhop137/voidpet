package Z3;

/* JADX INFO: loaded from: classes.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f18674a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Y3.h f18675b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Y3.d f18676c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f18677d;

    public enum a {
        MASK_MODE_ADD,
        MASK_MODE_SUBTRACT,
        MASK_MODE_INTERSECT,
        MASK_MODE_NONE
    }

    public i(a aVar, Y3.h hVar, Y3.d dVar, boolean z10) {
        this.f18674a = aVar;
        this.f18675b = hVar;
        this.f18676c = dVar;
        this.f18677d = z10;
    }

    public a a() {
        return this.f18674a;
    }

    public Y3.h b() {
        return this.f18675b;
    }

    public Y3.d c() {
        return this.f18676c;
    }

    public boolean d() {
        return this.f18677d;
    }
}
