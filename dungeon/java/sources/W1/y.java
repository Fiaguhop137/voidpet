package W1;

import U1.AbstractC1459a;
import android.net.Uri;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;

/* JADX INFO: loaded from: classes.dex */
public final class y extends b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f14566e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final byte[] f14567f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final DatagramPacket f14568g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Uri f14569h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private DatagramSocket f14570i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private MulticastSocket f14571j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private InetAddress f14572k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f14573l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f14574m;

    public static final class a extends g {
        public a(Throwable th, int i10) {
            super(th, i10);
        }
    }

    public y() {
        this(2000);
    }

    public y(int i10) {
        this(i10, 8000);
    }

    public y(int i10, int i11) {
        super(true);
        this.f14566e = i11;
        byte[] bArr = new byte[i10];
        this.f14567f = bArr;
        this.f14568g = new DatagramPacket(bArr, 0, i10);
    }

    @Override // W1.f
    public void close() {
        this.f14569h = null;
        MulticastSocket multicastSocket = this.f14571j;
        if (multicastSocket != null) {
            try {
                multicastSocket.leaveGroup((InetAddress) AbstractC1459a.e(this.f14572k));
            } catch (IOException unused) {
            }
            this.f14571j = null;
        }
        DatagramSocket datagramSocket = this.f14570i;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f14570i = null;
        }
        this.f14572k = null;
        this.f14574m = 0;
        if (this.f14573l) {
            this.f14573l = false;
            q();
        }
    }

    @Override // W1.f
    public Uri e() {
        return this.f14569h;
    }

    @Override // W1.f
    public long m(j jVar) throws a {
        Uri uri = jVar.f14480a;
        this.f14569h = uri;
        String str = (String) AbstractC1459a.e(uri.getHost());
        int port = this.f14569h.getPort();
        r(jVar);
        try {
            this.f14572k = InetAddress.getByName(str);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.f14572k, port);
            if (this.f14572k.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.f14571j = multicastSocket;
                multicastSocket.joinGroup(this.f14572k);
                this.f14570i = this.f14571j;
            } else {
                this.f14570i = new DatagramSocket(inetSocketAddress);
            }
            this.f14570i.setSoTimeout(this.f14566e);
            this.f14573l = true;
            s(jVar);
            return -1L;
        } catch (IOException e10) {
            throw new a(e10, 2001);
        } catch (SecurityException e11) {
            throw new a(e11, 2006);
        }
    }

    @Override // R1.InterfaceC1350j
    public int read(byte[] bArr, int i10, int i11) throws a {
        if (i11 == 0) {
            return 0;
        }
        if (this.f14574m == 0) {
            try {
                ((DatagramSocket) AbstractC1459a.e(this.f14570i)).receive(this.f14568g);
                int length = this.f14568g.getLength();
                this.f14574m = length;
                p(length);
            } catch (SocketTimeoutException e10) {
                throw new a(e10, 2002);
            } catch (IOException e11) {
                throw new a(e11, 2001);
            }
        }
        int length2 = this.f14568g.getLength();
        int i12 = this.f14574m;
        int iMin = Math.min(i12, i11);
        System.arraycopy(this.f14567f, length2 - i12, bArr, i10, iMin);
        this.f14574m -= iMin;
        return iMin;
    }
}
