package D7;

import com.github.penfeizhou.animation.gif.io.GifReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public class j implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2239a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2240b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f2241c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f2242d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private byte f2243e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c f2244f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f2245g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f2246h;

    @Override // D7.b
    public void a(GifReader gifReader) throws IOException {
        this.f2239a = gifReader.readUInt16();
        this.f2240b = gifReader.readUInt16();
        this.f2241c = gifReader.readUInt16();
        this.f2242d = gifReader.readUInt16();
        this.f2243e = gifReader.peek();
        if (c()) {
            c cVar = new c(d());
            this.f2244f = cVar;
            cVar.a(gifReader);
        }
        this.f2245g = gifReader.peek() & 255;
        this.f2246h = gifReader.position();
        while (true) {
            byte bPeek = gifReader.peek();
            if (bPeek == 0) {
                return;
            } else {
                gifReader.skip(bPeek & 255);
            }
        }
    }

    public boolean b() {
        return (this.f2243e & 64) == 64;
    }

    public boolean c() {
        return (this.f2243e & 128) == 128;
    }

    public int d() {
        return 2 << (this.f2243e & 15);
    }
}
