package O8;

/* JADX INFO: loaded from: classes2.dex */
final class C extends G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f8461a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f8462b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f8463c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private byte f8464d;

    C() {
    }

    @Override // O8.G
    public final G a(boolean z10) {
        this.f8462b = true;
        this.f8464d = (byte) (1 | this.f8464d);
        return this;
    }

    @Override // O8.G
    public final G b(int i10) {
        this.f8463c = 1;
        this.f8464d = (byte) (this.f8464d | 2);
        return this;
    }

    @Override // O8.G
    public final H c() {
        String str;
        if (this.f8464d == 3 && (str = this.f8461a) != null) {
            return new E(str, this.f8462b, this.f8463c, null);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f8461a == null) {
            sb2.append(" libraryName");
        }
        if ((this.f8464d & 1) == 0) {
            sb2.append(" enableFirelog");
        }
        if ((this.f8464d & 2) == 0) {
            sb2.append(" firelogEventType");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }

    public final G d(String str) {
        this.f8461a = str;
        return this;
    }
}
