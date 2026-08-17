package D7;

import com.github.penfeizhou.animation.gif.io.GifReader;

/* JADX INFO: loaded from: classes2.dex */
public class i extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f2235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private byte f2236b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f2237c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f2238d;

    @Override // D7.b
    public void a(GifReader gifReader) throws h.a {
        this.f2235a = gifReader.peek() & 255;
        this.f2236b = gifReader.peek();
        this.f2237c = gifReader.readUInt16();
        this.f2238d = gifReader.peek() & 255;
        if (gifReader.peek() != 0) {
            throw new h.a();
        }
    }

    public int c() {
        return (this.f2236b >> 2) & 7;
    }

    public boolean d() {
        return (this.f2236b & 1) == 1;
    }
}
