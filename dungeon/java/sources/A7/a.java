package A7;

import com.github.penfeizhou.animation.io.Reader;
import com.github.penfeizhou.animation.io.c;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public class a extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ByteBuffer f247a;

    public a(Reader reader) {
        super(reader);
        this.f247a = null;
    }

    public ByteBuffer a() throws IOException {
        if (this.f247a == null) {
            int iAvailable = available();
            byte[] bArr = new byte[iAvailable];
            read(bArr, 0, iAvailable);
            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(iAvailable);
            this.f247a = byteBufferAllocateDirect;
            byteBufferAllocateDirect.put(bArr);
        }
        this.f247a.flip();
        return this.f247a;
    }
}
