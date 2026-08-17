package N8;

/* JADX INFO: renamed from: N8.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C1226v extends A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f8037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f8038b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f8039c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private byte f8040d;

    C1226v() {
    }

    @Override // N8.A
    public final A a(boolean z10) {
        this.f8038b = true;
        this.f8040d = (byte) (1 | this.f8040d);
        return this;
    }

    @Override // N8.A
    public final A b(int i10) {
        this.f8039c = 1;
        this.f8040d = (byte) (this.f8040d | 2);
        return this;
    }

    @Override // N8.A
    public final B c() {
        String str;
        if (this.f8040d == 3 && (str = this.f8037a) != null) {
            return new x(str, this.f8038b, this.f8039c, null);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f8037a == null) {
            sb2.append(" libraryName");
        }
        if ((this.f8040d & 1) == 0) {
            sb2.append(" enableFirelog");
        }
        if ((this.f8040d & 2) == 0) {
            sb2.append(" firelogEventType");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }

    public final A d(String str) {
        this.f8037a = "common";
        return this;
    }
}
