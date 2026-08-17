package p389vb;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f56326a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f56327b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f56328c;

    public final void a(byte[] data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f56328c = true;
        this.f56326a.add(data);
    }

    public final byte[] b() {
        Iterator it = this.f56326a.iterator();
        int length = 0;
        while (it.hasNext()) {
            length += ((byte[]) it.next()).length;
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length);
        Iterator it2 = this.f56326a.iterator();
        while (it2.hasNext()) {
            byteBufferAllocate.put((byte[]) it2.next());
        }
        this.f56326a.clear();
        this.f56328c = true;
        this.f56327b = true;
        byte[] bArrArray = byteBufferAllocate.array();
        Intrinsics.checkNotNullExpressionValue(bArrArray, "array(...)");
        return bArrArray;
    }

    public final boolean c() {
        return this.f56328c;
    }
}
