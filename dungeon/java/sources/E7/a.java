package E7;

import com.github.penfeizhou.animation.io.e;
import java.nio.IntBuffer;

/* JADX INFO: loaded from: classes2.dex */
public class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected IntBuffer f2725a;

    public a() {
        c(10240);
    }

    public IntBuffer a() {
        return this.f2725a;
    }

    public int[] b() {
        return this.f2725a.array();
    }

    public void c(int i10) {
        IntBuffer intBuffer = this.f2725a;
        if (intBuffer == null || i10 > intBuffer.capacity()) {
            this.f2725a = IntBuffer.allocate(i10);
        }
        this.f2725a.clear();
        this.f2725a.limit(i10);
        this.f2725a.position(0);
    }

    @Override // com.github.penfeizhou.animation.io.e
    public void close() {
    }
}
