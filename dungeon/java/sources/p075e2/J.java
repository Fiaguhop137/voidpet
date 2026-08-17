package p075e2;

import P2.p;
import R1.AbstractC1348h;
import R1.n;
import U1.AbstractC1459a;
import U1.AbstractC1477t;
import U1.F;
import android.media.DeniedByServerException;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaDrm;
import android.media.NotProvisionedException;
import android.media.UnsupportedSchemeException;
import android.media.metrics.LogSessionId;
import android.os.Build;
import android.text.TextUtils;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import p003a2.D1;

/* JADX INFO: loaded from: classes.dex */
public final class J implements A {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final A.c f40234d = new D();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final UUID f40235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final MediaDrm f40236b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f40237c;

    private static class a {
        public static boolean a(MediaDrm mediaDrm, String str, int i10) {
            return mediaDrm.requiresSecureDecoder(str, i10);
        }

        public static void b(MediaDrm mediaDrm, byte[] bArr, D1 d10) {
            LogSessionId logSessionIdA = d10.a();
            if (logSessionIdA.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                return;
            }
            G.a(AbstractC1459a.e(mediaDrm.getPlaybackComponent(bArr))).setLogSessionId(logSessionIdA);
        }
    }

    private J(UUID uuid) {
        AbstractC1459a.e(uuid);
        AbstractC1459a.b(!AbstractC1348h.f10157b.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.f40235a = uuid;
        MediaDrm mediaDrm = new MediaDrm(u(uuid));
        this.f40236b = mediaDrm;
        this.f40237c = 1;
        if (AbstractC1348h.f10159d.equals(uuid) && B()) {
            x(mediaDrm);
        }
    }

    private boolean A() {
        if (!this.f40235a.equals(AbstractC1348h.f10159d)) {
            return this.f40235a.equals(AbstractC1348h.f10158c);
        }
        String strY = y("version");
        return (strY.startsWith("v5.") || strY.startsWith("14.") || strY.startsWith("15.") || strY.startsWith("16.0")) ? false : true;
    }

    private static boolean B() {
        return "ASUS_Z00AD".equals(Build.MODEL);
    }

    public static J C(UUID uuid) throws O {
        try {
            return new J(uuid);
        } catch (UnsupportedSchemeException e10) {
            throw new O(1, e10);
        } catch (Exception e11) {
            throw new O(2, e11);
        }
    }

    public static /* synthetic */ A n(UUID uuid) {
        try {
            return C(uuid);
        } catch (O unused) {
            AbstractC1477t.c("FrameworkMediaDrm", "Failed to instantiate a FrameworkMediaDrm for uuid: " + uuid + ".");
            return new y();
        }
    }

    public static /* synthetic */ void o(J j10, A.b bVar, MediaDrm mediaDrm, byte[] bArr, int i10, int i11, byte[] bArr2) {
        j10.getClass();
        bVar.a(j10, bArr, i10, i11, bArr2);
    }

    private static byte[] p(byte[] bArr) {
        F f10 = new F(bArr);
        int iY = f10.y();
        short sA = f10.A();
        short sA2 = f10.A();
        if (sA != 1 || sA2 != 1) {
            AbstractC1477t.f("FrameworkMediaDrm", "Unexpected record count or type. Skipping LA_URL workaround.");
            return bArr;
        }
        short sA3 = f10.A();
        Charset charset = StandardCharsets.UTF_16LE;
        String strJ = f10.J(sA3, charset);
        if (strJ.contains("<LA_URL>")) {
            return bArr;
        }
        int iIndexOf = strJ.indexOf("</DATA>");
        if (iIndexOf == -1) {
            AbstractC1477t.h("FrameworkMediaDrm", "Could not find the </DATA> tag. Skipping LA_URL workaround.");
        }
        String str = strJ.substring(0, iIndexOf) + "<LA_URL>https://x</LA_URL>" + strJ.substring(iIndexOf);
        int i10 = iY + 52;
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i10);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        byteBufferAllocate.putInt(i10);
        byteBufferAllocate.putShort(sA);
        byteBufferAllocate.putShort(sA2);
        byteBufferAllocate.putShort((short) (str.length() * 2));
        byteBufferAllocate.put(str.getBytes(charset));
        return byteBufferAllocate.array();
    }

    private String q(String str) {
        if ("<LA_URL>https://x</LA_URL>".equals(str)) {
            return "";
        }
        if (Build.VERSION.SDK_INT >= 33 && "https://default.url".equals(str)) {
            String strY = y("version");
            if (Objects.equals(strY, "1.2") || Objects.equals(strY, "aidl-1")) {
                return "";
            }
        }
        return str;
    }

    private static byte[] r(UUID uuid, byte[] bArr) {
        return AbstractC1348h.f10158c.equals(uuid) ? AbstractC3251a.a(bArr) : bArr;
    }

    private static byte[] s(UUID uuid, byte[] bArr) {
        byte[] bArrE;
        p.a aVarD;
        UUID uuid2 = AbstractC1348h.f10160e;
        if (uuid2.equals(uuid)) {
            byte[] bArrE2 = p.e(bArr, uuid);
            if (bArrE2 != null) {
                bArr = bArrE2;
            }
            bArr = p.a(uuid2, p(bArr));
        }
        if (v(uuid) && (aVarD = p.d(bArr)) != null) {
            bArr = p.b(AbstractC1348h.f10157b, aVarD.f8750d, aVarD.f8749c);
        }
        if (uuid2.equals(uuid) && "Amazon".equals(Build.MANUFACTURER)) {
            String str = Build.MODEL;
            if (("AFTB".equals(str) || "AFTS".equals(str) || "AFTM".equals(str) || "AFTT".equals(str)) && (bArrE = p.e(bArr, uuid)) != null) {
                return bArrE;
            }
        }
        return bArr;
    }

    private static String t(UUID uuid, String str) {
        return (Build.VERSION.SDK_INT < 26 && AbstractC1348h.f10158c.equals(uuid) && ("video/mp4".equals(str) || "audio/mp4".equals(str))) ? "cenc" : str;
    }

    private static UUID u(UUID uuid) {
        return v(uuid) ? AbstractC1348h.f10157b : uuid;
    }

    private static boolean v(UUID uuid) {
        return Build.VERSION.SDK_INT < 27 && Objects.equals(uuid, AbstractC1348h.f10158c);
    }

    private static void x(MediaDrm mediaDrm) {
        mediaDrm.setPropertyString("securityLevel", "L3");
    }

    private static n.b z(UUID uuid, List list) {
        if (!AbstractC1348h.f10159d.equals(uuid)) {
            return (n.b) list.get(0);
        }
        if (Build.VERSION.SDK_INT >= 28 && list.size() > 1) {
            n.b bVar = (n.b) list.get(0);
            int i10 = 0;
            int length = 0;
            while (true) {
                if (i10 >= list.size()) {
                    byte[] bArr = new byte[length];
                    int i11 = 0;
                    for (int i12 = 0; i12 < list.size(); i12++) {
                        byte[] bArr2 = (byte[]) AbstractC1459a.e(((n.b) list.get(i12)).f10204e);
                        int length2 = bArr2.length;
                        System.arraycopy(bArr2, 0, bArr, i11, length2);
                        i11 += length2;
                    }
                    return bVar.j(bArr);
                }
                n.b bVar2 = (n.b) list.get(i10);
                byte[] bArr3 = (byte[]) AbstractC1459a.e(bVar2.f10204e);
                if (!Objects.equals(bVar2.f10203d, bVar.f10203d) || !Objects.equals(bVar2.f10202c, bVar.f10202c) || !p.c(bArr3)) {
                    break;
                }
                length += bArr3.length;
                i10++;
            }
        }
        for (int i13 = 0; i13 < list.size(); i13++) {
            n.b bVar3 = (n.b) list.get(i13);
            if (p.g((byte[]) AbstractC1459a.e(bVar3.f10204e)) == 1) {
                return bVar3;
            }
        }
        return (n.b) list.get(0);
    }

    @Override // p075e2.A
    public Map a(byte[] bArr) {
        return this.f40236b.queryKeyStatus(bArr);
    }

    @Override // p075e2.A
    public A.d b() {
        MediaDrm.ProvisionRequest provisionRequest = this.f40236b.getProvisionRequest();
        return new A.d(provisionRequest.getData(), provisionRequest.getDefaultUrl());
    }

    @Override // p075e2.A
    public void c(byte[] bArr, D1 d10) {
        if (Build.VERSION.SDK_INT >= 31) {
            try {
                a.b(this.f40236b, bArr, d10);
            } catch (UnsupportedOperationException unused) {
                AbstractC1477t.h("FrameworkMediaDrm", "setLogSessionId failed.");
            }
        }
    }

    @Override // p075e2.A
    public byte[] d() {
        return this.f40236b.openSession();
    }

    @Override // p075e2.A
    public void e(byte[] bArr, byte[] bArr2) {
        this.f40236b.restoreKeys(bArr, bArr2);
    }

    @Override // p075e2.A
    public void f(A.b bVar) {
        this.f40236b.setOnEventListener(bVar == null ? null : new E(this, bVar));
    }

    @Override // p075e2.A
    public void g(byte[] bArr) throws DeniedByServerException {
        this.f40236b.provideProvisionResponse(bArr);
    }

    @Override // p075e2.A
    public int h() {
        return 2;
    }

    @Override // p075e2.A
    public boolean j(byte[] bArr, String str) throws Throwable {
        if (Build.VERSION.SDK_INT >= 31 && A()) {
            MediaDrm mediaDrm = this.f40236b;
            return a.a(mediaDrm, str, mediaDrm.getSecurityLevel(bArr));
        }
        MediaCrypto mediaCrypto = null;
        try {
            try {
                MediaCrypto mediaCrypto2 = new MediaCrypto(u(this.f40235a), bArr);
                try {
                    boolean zRequiresSecureDecoderComponent = mediaCrypto2.requiresSecureDecoderComponent(str);
                    mediaCrypto2.release();
                    return zRequiresSecureDecoderComponent;
                } catch (MediaCryptoException unused) {
                    mediaCrypto = mediaCrypto2;
                    boolean z10 = !this.f40235a.equals(AbstractC1348h.f10158c);
                    if (mediaCrypto != null) {
                        mediaCrypto.release();
                    }
                    return z10;
                } catch (Throwable th) {
                    th = th;
                    mediaCrypto = mediaCrypto2;
                    if (mediaCrypto != null) {
                        mediaCrypto.release();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (MediaCryptoException unused2) {
        }
    }

    @Override // p075e2.A
    public void k(byte[] bArr) {
        this.f40236b.closeSession(bArr);
    }

    @Override // p075e2.A
    public byte[] l(byte[] bArr, byte[] bArr2) {
        if (AbstractC1348h.f10158c.equals(this.f40235a)) {
            bArr2 = AbstractC3251a.b(bArr2);
        }
        return this.f40236b.provideKeyResponse(bArr, bArr2);
    }

    @Override // p075e2.A
    public A.a m(byte[] bArr, List list, int i10, HashMap map) throws NotProvisionedException {
        n.b bVarZ;
        byte[] bArrS;
        String strT;
        if (list != null) {
            bVarZ = z(this.f40235a, list);
            bArrS = s(this.f40235a, (byte[]) AbstractC1459a.e(bVarZ.f10204e));
            strT = t(this.f40235a, bVarZ.f10203d);
        } else {
            bVarZ = null;
            bArrS = null;
            strT = null;
        }
        MediaDrm.KeyRequest keyRequest = this.f40236b.getKeyRequest(bArr, bArrS, strT, i10, map);
        byte[] bArrR = r(this.f40235a, keyRequest.getData());
        String strQ = q(keyRequest.getDefaultUrl());
        if (TextUtils.isEmpty(strQ) && bVarZ != null && !TextUtils.isEmpty(bVarZ.f10202c)) {
            strQ = bVarZ.f10202c;
        }
        return new A.a(bArrR, strQ, keyRequest.getRequestType());
    }

    @Override // p075e2.A
    public synchronized void release() {
        int i10 = this.f40237c - 1;
        this.f40237c = i10;
        if (i10 == 0) {
            this.f40236b.release();
        }
    }

    @Override // p075e2.A
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public B i(byte[] bArr) {
        return new B(u(this.f40235a), bArr);
    }

    public String y(String str) {
        return this.f40236b.getPropertyString(str);
    }
}
