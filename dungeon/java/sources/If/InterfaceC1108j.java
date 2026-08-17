package If;

import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: If.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC1108j extends a0, ReadableByteChannel {
    C1106h B();

    String B1();

    byte[] F1(long j10);

    long G3(C1109k c1109k);

    long H0(byte b10, long j10, long j11);

    int H3(O o10);

    short I1();

    long I2();

    long J3(Y y10);

    String K0(long j10);

    long M1();

    void U1(long j10);

    long V3();

    InputStream Y();

    String b3(Charset charset);

    C1106h g0();

    boolean h1(long j10, C1109k c1109k);

    String h2(long j10);

    C1109k k2(long j10);

    long m2(C1109k c1109k);

    void m3(C1106h c1106h, long j10);

    InterfaceC1108j peek();

    int r3();

    byte readByte();

    void readFully(byte[] bArr);

    int readInt();

    long readLong();

    short readShort();

    void skip(long j10);

    boolean u1(long j10);

    String x3();

    byte[] y2();

    boolean z2();
}
