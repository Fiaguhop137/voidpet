package D7;

import com.github.penfeizhou.animation.gif.io.GifReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public class c implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int[] f2224a;

    public c(int i10) {
        this.f2224a = new int[i10];
    }

    @Override // D7.b
    public void a(GifReader gifReader) throws IOException {
        for (int i10 = 0; i10 < this.f2224a.length; i10++) {
            byte bPeek = gifReader.peek();
            byte bPeek2 = gifReader.peek();
            int i11 = (bPeek2 & 255) << 8;
            int i12 = bPeek & 255;
            this.f2224a[i10] = i12 | i11 | ((gifReader.peek() & 255) << 16) | (-16777216);
        }
    }

    public int[] b() {
        return this.f2224a;
    }
}
