package p081e8;

/* JADX INFO: loaded from: classes2.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f40663a = 1;

    public b a(Object obj) {
        this.f40663a = (this.f40663a * 31) + (obj == null ? 0 : obj.hashCode());
        return this;
    }

    public int b() {
        return this.f40663a;
    }

    public final b c(boolean z10) {
        this.f40663a = (this.f40663a * 31) + (z10 ? 1 : 0);
        return this;
    }
}
