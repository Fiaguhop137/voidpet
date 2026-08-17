package D7;

import com.github.penfeizhou.animation.gif.io.GifReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public class e implements b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e f2226c = new e(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f2227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f2228b;

    public e(int i10) {
        this.f2227a = i10;
    }

    public static e c(GifReader gifReader) throws IOException {
        int iPeek = gifReader.peek() & 255;
        if (iPeek == 0) {
            return f2226c;
        }
        e eVar = new e(iPeek);
        eVar.f2228b = gifReader.position();
        eVar.a(gifReader);
        return eVar;
    }

    @Override // D7.b
    public void a(GifReader gifReader) throws IOException {
        gifReader.skip(this.f2227a);
    }

    public boolean b() {
        return this == f2226c;
    }
}
