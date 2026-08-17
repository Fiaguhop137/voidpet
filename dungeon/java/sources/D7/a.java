package D7;

import com.github.penfeizhou.animation.gif.io.GifReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public class a extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2222a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f2223b;

    @Override // D7.b
    public void a(GifReader gifReader) throws IOException {
        byte bPeek = gifReader.peek();
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < bPeek; i10++) {
            sb2.append((char) gifReader.peek());
        }
        String string = sb2.toString();
        this.f2223b = string;
        if (!"NETSCAPE2.0".equals(string)) {
            while (!e.c(gifReader).b()) {
            }
            return;
        }
        if ((gifReader.peek() & 255) == 3 && (gifReader.peek() & 255) == 1) {
            this.f2222a = gifReader.readUInt16();
        }
        while (!e.c(gifReader).b()) {
        }
    }
}
