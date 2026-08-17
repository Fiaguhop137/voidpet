package p457z7;

import A7.a;
import com.github.penfeizhou.animation.io.Reader;
import java.io.IOException;
import org.aomedia.avif.android.AvifDecoder;

/* JADX INFO: loaded from: classes2.dex */
public abstract class c {
    public static boolean a(Reader reader) {
        try {
            return AvifDecoder.isAvifImage((reader instanceof a ? (a) reader : new a(reader)).a());
        } catch (IOException unused) {
            return false;
        }
    }
}
