package p027b8;

/* JADX INFO: loaded from: classes2.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected Boolean f26443a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected String f26444b;

    public f() {
        this.f26443a = Boolean.FALSE;
    }

    public f(g gVar) {
        this.f26443a = Boolean.FALSE;
        this.f26443a = Boolean.valueOf(gVar.b());
        this.f26444b = gVar.c();
    }

    public final f a(String str) {
        this.f26444b = str;
        return this;
    }
}
