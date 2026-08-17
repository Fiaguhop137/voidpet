package p416x2;

import C9.AbstractC0876t;
import R1.r;
import U1.AbstractC1477t;
import U1.F;
import U1.S;

/* JADX INFO: loaded from: classes.dex */
final class g implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f57355a;

    public g(r rVar) {
        this.f57355a = rVar;
    }

    private static String a(int i10) {
        switch (i10) {
            case 808802372:
            case 877677894:
            case 1145656883:
            case 1145656920:
            case 1482049860:
            case 1684633208:
            case 2021026148:
                return "video/mp4v-es";
            case 826496577:
            case 828601953:
            case 875967048:
                return "video/avc";
            case 842289229:
                return "video/mp42";
            case 859066445:
                return "video/mp43";
            case 1196444237:
            case 1735420525:
                return "video/mjpeg";
            default:
                return null;
        }
    }

    private static String b(int i10) {
        if (i10 == 1) {
            return "audio/raw";
        }
        if (i10 == 85) {
            return "audio/mpeg";
        }
        if (i10 == 255) {
            return "audio/mp4a-latm";
        }
        if (i10 == 8192) {
            return "audio/ac3";
        }
        if (i10 != 8193) {
            return null;
        }
        return "audio/vnd.dts";
    }

    private static a c(F f10) {
        f10.b0(4);
        int iY = f10.y();
        int iY2 = f10.y();
        f10.b0(4);
        int iY3 = f10.y();
        String strA = a(iY3);
        if (strA != null) {
            r.b bVar = new r.b();
            bVar.F0(iY).h0(iY2).y0(strA);
            return new g(bVar.P());
        }
        AbstractC1477t.h("StreamFormatChunk", "Ignoring track with unsupported compression " + iY3);
        return null;
    }

    public static a d(int i10, F f10) {
        if (i10 == 2) {
            return c(f10);
        }
        if (i10 == 1) {
            return e(f10);
        }
        AbstractC1477t.h("StreamFormatChunk", "Ignoring strf box for unsupported track type: " + S.t0(i10));
        return null;
    }

    private static a e(F f10) {
        int iD = f10.D();
        String strB = b(iD);
        if (strB == null) {
            AbstractC1477t.h("StreamFormatChunk", "Ignoring track with unsupported format tag " + iD);
            return null;
        }
        int iD2 = f10.D();
        int iY = f10.y();
        f10.b0(6);
        int iI0 = S.i0(f10.D());
        int iD3 = f10.a() > 0 ? f10.D() : 0;
        r.b bVar = new r.b();
        bVar.y0(strB).T(iD2).z0(iY);
        if (strB.equals("audio/raw") && iI0 != 0) {
            bVar.s0(iI0);
        }
        if (strB.equals("audio/mp4a-latm") && iD3 > 0) {
            byte[] bArr = new byte[iD3];
            f10.q(bArr, 0, iD3);
            bVar.k0(AbstractC0876t.x(bArr));
        }
        return new g(bVar.P());
    }

    @Override // p416x2.a
    public int getType() {
        return 1718776947;
    }
}
