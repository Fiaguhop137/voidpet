package D7;

import com.github.penfeizhou.animation.gif.io.GifReader;
import com.github.penfeizhou.animation.io.Reader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class h {

    static class a extends IOException {
        a() {
            super("Gif Format error");
        }
    }

    private static void a(GifReader gifReader) throws a {
        byte bPeek;
        if (gifReader.peek() != 71 || gifReader.peek() != 73 || gifReader.peek() != 70 || gifReader.peek() != 56 || (((bPeek = gifReader.peek()) != 55 && bPeek != 57) || gifReader.peek() != 97)) {
            throw new a();
        }
    }

    public static boolean b(Reader reader) {
        try {
            a(reader instanceof GifReader ? (GifReader) reader : new GifReader(reader));
            return true;
        } catch (IOException e10) {
            if (e10 instanceof a) {
                return false;
            }
            e10.printStackTrace();
            return false;
        }
    }

    public static List c(GifReader gifReader) throws IOException {
        b bVarB;
        a(gifReader);
        ArrayList arrayList = new ArrayList();
        k kVar = new k();
        kVar.a(gifReader);
        arrayList.add(kVar);
        if (kVar.b()) {
            c cVar = new c(kVar.c());
            cVar.a(gifReader);
            arrayList.add(cVar);
        }
        while (true) {
            try {
                byte bPeek = gifReader.peek();
                if (bPeek == 59) {
                    return arrayList;
                }
                if (bPeek != 33) {
                    bVarB = bPeek != 44 ? null : new j();
                } else {
                    bVarB = f.b(gifReader);
                }
                if (bVarB == null) {
                    throw new a();
                }
                bVarB.a(gifReader);
                arrayList.add(bVarB);
            } catch (Exception e10) {
                e10.printStackTrace();
                return arrayList;
            }
        }
    }
}
