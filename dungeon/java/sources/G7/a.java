package G7;

import com.github.penfeizhou.animation.io.Reader;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a implements b {
    @Override // G7.b
    public Reader a() {
        return new com.github.penfeizhou.animation.io.a(b());
    }

    public abstract ByteBuffer b();
}
