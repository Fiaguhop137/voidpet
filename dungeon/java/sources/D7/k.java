package D7;

import com.github.penfeizhou.animation.gif.io.GifReader;

/* JADX INFO: loaded from: classes2.dex */
public class k implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2248b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    byte f2249c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte f2250d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    byte f2251e;

    @Override // D7.b
    public void a(GifReader gifReader) {
        this.f2247a = gifReader.readUInt16();
        this.f2248b = gifReader.readUInt16();
        this.f2249c = gifReader.peek();
        this.f2250d = gifReader.peek();
        this.f2251e = gifReader.peek();
    }

    public boolean b() {
        return (this.f2249c & 128) == 128;
    }

    public int c() {
        return 2 << (this.f2249c & 7);
    }
}
