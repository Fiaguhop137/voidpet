package I7;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public class k extends e {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final int f5073g = e.a("VP8X");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    byte f5074d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f5075e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f5076f;

    @Override // I7.e
    void b(J7.a aVar) throws IOException {
        this.f5074d = aVar.peek();
        aVar.skip(3L);
        this.f5075e = aVar.a();
        this.f5076f = aVar.a();
    }

    boolean d() {
        return (this.f5074d & 16) == 16;
    }

    boolean e() {
        return (this.f5074d & 2) == 2;
    }
}
