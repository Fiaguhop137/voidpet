package p023b4;

/* JADX INFO: loaded from: classes.dex */
public enum c {
    JSON(".json"),
    ZIP(".zip"),
    GZIP(".gz");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26273a;

    c(String str) {
        this.f26273a = str;
    }

    public String g() {
        return ".temp" + this.f26273a;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f26273a;
    }
}
