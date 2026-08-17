package D7;

import com.github.penfeizhou.animation.gif.io.GifReader;

/* JADX INFO: loaded from: classes2.dex */
public abstract class f implements b {
    public static f b(GifReader gifReader) {
        byte bPeek = gifReader.peek();
        if (bPeek == -7) {
            return new i();
        }
        if (bPeek == 1) {
            return new l();
        }
        if (bPeek == -2) {
            return new d();
        }
        if (bPeek == -1) {
            return new a();
        }
        throw new h.a();
    }
}
