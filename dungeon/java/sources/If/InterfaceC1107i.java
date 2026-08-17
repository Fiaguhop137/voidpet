package If;

import java.io.OutputStream;
import java.nio.channels.WritableByteChannel;

/* JADX INFO: renamed from: If.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC1107i extends Y, WritableByteChannel {
    C1106h B();

    InterfaceC1107i C2(C1109k c1109k);

    InterfaceC1107i I0();

    long U0(a0 a0Var);

    OutputStream X();

    InterfaceC1107i Y1(long j10);

    InterfaceC1107i Z0(String str);

    @Override // If.Y, java.io.Flushable
    void flush();

    InterfaceC1107i h3(long j10);

    InterfaceC1107i j0();

    InterfaceC1107i n1(String str, int i10, int i11);

    InterfaceC1107i write(byte[] bArr);

    InterfaceC1107i write(byte[] bArr, int i10, int i11);

    InterfaceC1107i writeByte(int i10);

    InterfaceC1107i writeInt(int i10);

    InterfaceC1107i writeShort(int i10);
}
