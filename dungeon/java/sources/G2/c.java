package G2;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ByteArrayOutputStream f3855a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final DataOutputStream f3856b;

    public c() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        this.f3855a = byteArrayOutputStream;
        this.f3856b = new DataOutputStream(byteArrayOutputStream);
    }

    private static void b(DataOutputStream dataOutputStream, String str) throws IOException {
        dataOutputStream.writeBytes(str);
        dataOutputStream.writeByte(0);
    }

    public byte[] a(a aVar) {
        this.f3855a.reset();
        try {
            b(this.f3856b, aVar.f3849a);
            String str = aVar.f3850b;
            if (str == null) {
                str = "";
            }
            b(this.f3856b, str);
            this.f3856b.writeLong(aVar.f3851c);
            this.f3856b.writeLong(aVar.f3852d);
            this.f3856b.write(aVar.f3853e);
            this.f3856b.flush();
            return this.f3855a.toByteArray();
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }
}
