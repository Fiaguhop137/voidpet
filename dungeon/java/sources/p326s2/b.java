package p326s2;

import U1.AbstractC1459a;
import android.os.SystemClock;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketTimeoutException;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import p308r2.m;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f53245a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f53246b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f53247c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static long f53248d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static String f53249e = "time.android.com";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f53250f = 1000;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static long f53251g = -9223372036854775807L;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static long f53252h = -9223372036854775807L;

    /* JADX INFO: renamed from: s2.b$b, reason: collision with other inner class name */
    public interface InterfaceC0646b {
        void a(IOException iOException);

        void onInitialized();
    }

    private static final class c implements m.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final InterfaceC0646b f53253a;

        public c(InterfaceC0646b interfaceC0646b) {
            this.f53253a = interfaceC0646b;
        }

        @Override // r2.m.b
        public void i(m.e eVar, long j10, long j11, boolean z10) {
        }

        @Override // r2.m.b
        public void j(m.e eVar, long j10, long j11) {
            if (this.f53253a != null) {
                if (b.m()) {
                    this.f53253a.onInitialized();
                } else {
                    this.f53253a.a(new IOException(new ConcurrentModificationException()));
                }
            }
        }

        @Override // r2.m.b
        public m.c n(m.e eVar, long j10, long j11, IOException iOException, int i10) {
            InterfaceC0646b interfaceC0646b = this.f53253a;
            if (interfaceC0646b != null) {
                interfaceC0646b.a(iOException);
            }
            return m.f52087f;
        }
    }

    private static final class d implements m.e {
        private d() {
        }

        /* synthetic */ d(a aVar) {
            this();
        }

        @Override // r2.m.e
        public void a() {
            synchronized (b.f53245a) {
                synchronized (b.f53246b) {
                    if (b.f53247c) {
                        return;
                    }
                    long jN = b.n();
                    synchronized (b.f53246b) {
                        long unused = b.f53252h = SystemClock.elapsedRealtime();
                        long unused2 = b.f53248d = jN;
                        boolean unused3 = b.f53247c = true;
                    }
                }
            }
        }

        @Override // r2.m.e
        public void c() {
        }
    }

    private static void h(byte b10, byte b11, int i10, long j10) throws IOException {
        if (b10 == 3) {
            throw new IOException("SNTP: Unsynchronized server");
        }
        if (b11 != 4 && b11 != 5) {
            throw new IOException("SNTP: Untrusted mode: " + ((int) b11));
        }
        if (i10 != 0 && i10 <= 15) {
            if (j10 == 0) {
                throw new IOException("SNTP: Zero transmitTime");
            }
        } else {
            throw new IOException("SNTP: Untrusted stratum: " + i10);
        }
    }

    public static long i() {
        long j10;
        synchronized (f53246b) {
            try {
                j10 = f53247c ? f53248d : -9223372036854775807L;
            } catch (Throwable th) {
                throw th;
            }
        }
        return j10;
    }

    public static String j() {
        String str;
        synchronized (f53246b) {
            str = f53249e;
        }
        return str;
    }

    public static int k() {
        int i10;
        synchronized (f53246b) {
            i10 = f53250f;
        }
        return i10;
    }

    public static void l(m mVar, InterfaceC0646b interfaceC0646b) {
        if (m()) {
            if (interfaceC0646b != null) {
                interfaceC0646b.onInitialized();
            }
        } else {
            if (mVar == null) {
                mVar = new m("SntpClient");
            }
            mVar.n(new d(null), new c(interfaceC0646b), 1);
        }
    }

    public static boolean m() {
        boolean z10;
        synchronized (f53246b) {
            try {
                if (f53252h != -9223372036854775807L && f53251g != -9223372036854775807L) {
                    f53247c = f53247c && SystemClock.elapsedRealtime() - f53252h < f53251g;
                }
                z10 = f53247c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long n() {
        DatagramSocket datagramSocket = new DatagramSocket();
        try {
            datagramSocket.setSoTimeout(k());
            InetAddress[] allByName = InetAddress.getAllByName(j());
            int length = allByName.length;
            SocketTimeoutException socketTimeoutException = null;
            int i10 = 0;
            int i11 = 0;
            while (i10 < length) {
                byte[] bArr = new byte[48];
                DatagramPacket datagramPacket = new DatagramPacket(bArr, 48, allByName[i10], 123);
                bArr[0] = 27;
                long jCurrentTimeMillis = System.currentTimeMillis();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                q(bArr, 40, jCurrentTimeMillis);
                datagramSocket.send(datagramPacket);
                try {
                    datagramSocket.receive(new DatagramPacket(bArr, 48));
                    long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                    long j10 = jCurrentTimeMillis + (jElapsedRealtime2 - jElapsedRealtime);
                    byte b10 = bArr[0];
                    int i12 = bArr[1] & 255;
                    long jP = p(bArr, 24);
                    long jP2 = p(bArr, 32);
                    long jP3 = p(bArr, 40);
                    h((byte) ((b10 >> 6) & 3), (byte) (b10 & 7), i12, jP3);
                    long j11 = (j10 + (((jP2 - jP) + (jP3 - j10)) / 2)) - jElapsedRealtime2;
                    datagramSocket.close();
                    return j11;
                } catch (SocketTimeoutException e10) {
                    if (socketTimeoutException == null) {
                        socketTimeoutException = e10;
                    } else {
                        socketTimeoutException.addSuppressed(e10);
                    }
                    int i13 = i11 + 1;
                    if (i11 >= 10) {
                        throw ((SocketTimeoutException) AbstractC1459a.e(socketTimeoutException));
                    }
                    i10++;
                    i11 = i13;
                }
            }
            throw ((SocketTimeoutException) AbstractC1459a.e(socketTimeoutException));
        } catch (Throwable th) {
            try {
                datagramSocket.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    private static long o(byte[] bArr, int i10) {
        int i11 = bArr[i10];
        int i12 = bArr[i10 + 1];
        int i13 = bArr[i10 + 2];
        int i14 = bArr[i10 + 3];
        if ((i11 & 128) == 128) {
            i11 = (i11 & 127) + 128;
        }
        if ((i12 & 128) == 128) {
            i12 = (i12 & 127) + 128;
        }
        if ((i13 & 128) == 128) {
            i13 = (i13 & 127) + 128;
        }
        if ((i14 & 128) == 128) {
            i14 = (i14 & 127) + 128;
        }
        return (((long) i11) << 24) + (((long) i12) << 16) + (((long) i13) << 8) + ((long) i14);
    }

    private static long p(byte[] bArr, int i10) {
        long jO = o(bArr, i10);
        long jO2 = o(bArr, i10 + 4);
        if (jO == 0 && jO2 == 0) {
            return 0L;
        }
        return ((jO - 2208988800L) * 1000) + ((jO2 * 1000) / 4294967296L);
    }

    private static void q(byte[] bArr, int i10, long j10) {
        if (j10 == 0) {
            Arrays.fill(bArr, i10, i10 + 8, (byte) 0);
            return;
        }
        long j11 = j10 / 1000;
        long j12 = j10 - (j11 * 1000);
        long j13 = j11 + 2208988800L;
        bArr[i10] = (byte) (j13 >> 24);
        bArr[i10 + 1] = (byte) (j13 >> 16);
        bArr[i10 + 2] = (byte) (j13 >> 8);
        bArr[i10 + 3] = (byte) j13;
        long j14 = (j12 * 4294967296L) / 1000;
        bArr[i10 + 4] = (byte) (j14 >> 24);
        bArr[i10 + 5] = (byte) (j14 >> 16);
        bArr[i10 + 6] = (byte) (j14 >> 8);
        bArr[i10 + 7] = (byte) (Math.random() * 255.0d);
    }
}
