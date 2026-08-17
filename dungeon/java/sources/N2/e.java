package N2;

import C9.AbstractC0876t;
import R1.AbstractC1348h;
import R1.C1349i;
import R1.n;
import R1.y;
import R1.z;
import S2.s;
import S2.t;
import U1.AbstractC1459a;
import U1.AbstractC1477t;
import U1.F;
import U1.S;
import V1.h;
import android.util.Pair;
import android.util.SparseArray;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import p380v2.AbstractC4238a;
import p380v2.C;
import p380v2.C4241d;
import p380v2.C4244g;
import p380v2.I;
import p380v2.InterfaceC4253p;
import p380v2.InterfaceC4254q;
import p380v2.J;
import p380v2.O;
import p380v2.P;
import p380v2.r;
import p380v2.u;

/* JADX INFO: loaded from: classes.dex */
public class e implements InterfaceC4253p {

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final u f7178f0 = new d();

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private static final byte[] f7179g0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private static final byte[] f7180h0 = S.u0("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private static final byte[] f7181i0 = {68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private static final byte[] f7182j0 = {87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private static final UUID f7183k0 = new UUID(72057594037932032L, -9223371306706625679L);

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private static final Map f7184l0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private long f7185A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private boolean f7186B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private long f7187C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private long f7188D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private long f7189E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private U1.u f7190F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private U1.u f7191G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private boolean f7192H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private boolean f7193I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private int f7194J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private long f7195K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private long f7196L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private int f7197M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private int f7198N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private int[] f7199O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private int f7200P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private int f7201Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private int f7202R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private int f7203S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private boolean f7204T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private long f7205U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private int f7206V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private int f7207W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private int f7208X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    private boolean f7209Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private boolean f7210Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final N2.c f7211a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private boolean f7212a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g f7213b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private int f7214b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SparseArray f7215c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private byte f7216c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f7217d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private boolean f7218d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f7219e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private r f7220e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final s.a f7221f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final F f7222g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final F f7223h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final F f7224i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final F f7225j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final F f7226k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final F f7227l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final F f7228m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final F f7229n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final F f7230o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final F f7231p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private ByteBuffer f7232q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private long f7233r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f7234s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long f7235t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private long f7236u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private long f7237v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f7238w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private c f7239x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f7240y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f7241z;

    private final class b implements N2.b {
        private b() {
        }

        /* synthetic */ b(e eVar, a aVar) {
            this();
        }

        @Override // N2.b
        public void a(int i10) throws z {
            e.this.q(i10);
        }

        @Override // N2.b
        public void b(int i10, double d10) {
            e.this.t(i10, d10);
        }

        @Override // N2.b
        public void c(int i10, long j10) throws z {
            e.this.z(i10, j10);
        }

        @Override // N2.b
        public int d(int i10) {
            return e.this.w(i10);
        }

        @Override // N2.b
        public boolean e(int i10) {
            return e.this.B(i10);
        }

        @Override // N2.b
        public void f(int i10, String str) throws z {
            e.this.I(i10, str);
        }

        @Override // N2.b
        public void g(int i10, int i11, InterfaceC4254q interfaceC4254q) throws z {
            e.this.n(i10, i11, interfaceC4254q);
        }

        @Override // N2.b
        public void h(int i10, long j10, long j11) throws z {
            e.this.H(i10, j10, j11);
        }
    }

    protected static final class c {

        /* JADX INFO: renamed from: P, reason: collision with root package name */
        public byte[] f7258P;

        /* JADX INFO: renamed from: V, reason: collision with root package name */
        public P f7264V;

        /* JADX INFO: renamed from: W, reason: collision with root package name */
        public boolean f7265W;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        public O f7268Z;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f7269a;

        /* JADX INFO: renamed from: a0, reason: collision with root package name */
        public int f7270a0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f7271b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f7272c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f7273d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f7274e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f7275f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f7276g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f7277h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f7278i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public byte[] f7279j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public O.a f7280k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public byte[] f7281l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public n f7282m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f7283n = -1;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f7284o = -1;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f7285p = -1;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f7286q = -1;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f7287r = -1;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f7288s = 0;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f7289t = -1;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public float f7290u = 0.0f;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public float f7291v = 0.0f;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public float f7292w = 0.0f;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public byte[] f7293x = null;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f7294y = -1;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public boolean f7295z = false;

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        public int f7243A = -1;

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        public int f7244B = -1;

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        public int f7245C = -1;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public int f7246D = 1000;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        public int f7247E = 200;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        public float f7248F = -1.0f;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        public float f7249G = -1.0f;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        public float f7250H = -1.0f;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        public float f7251I = -1.0f;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        public float f7252J = -1.0f;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        public float f7253K = -1.0f;

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        public float f7254L = -1.0f;

        /* JADX INFO: renamed from: M, reason: collision with root package name */
        public float f7255M = -1.0f;

        /* JADX INFO: renamed from: N, reason: collision with root package name */
        public float f7256N = -1.0f;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public float f7257O = -1.0f;

        /* JADX INFO: renamed from: Q, reason: collision with root package name */
        public int f7259Q = 1;

        /* JADX INFO: renamed from: R, reason: collision with root package name */
        public int f7260R = -1;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        public int f7261S = 8000;

        /* JADX INFO: renamed from: T, reason: collision with root package name */
        public long f7262T = 0;

        /* JADX INFO: renamed from: U, reason: collision with root package name */
        public long f7263U = 0;

        /* JADX INFO: renamed from: X, reason: collision with root package name */
        public boolean f7266X = true;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        private String f7267Y = "eng";

        protected c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void f() {
            AbstractC1459a.e(this.f7268Z);
        }

        private byte[] g(String str) throws z {
            byte[] bArr = this.f7281l;
            if (bArr != null) {
                return bArr;
            }
            throw z.a("Missing CodecPrivate for codec " + str, null);
        }

        private byte[] h() {
            if (this.f7248F == -1.0f || this.f7249G == -1.0f || this.f7250H == -1.0f || this.f7251I == -1.0f || this.f7252J == -1.0f || this.f7253K == -1.0f || this.f7254L == -1.0f || this.f7255M == -1.0f || this.f7256N == -1.0f || this.f7257O == -1.0f) {
                return null;
            }
            byte[] bArr = new byte[25];
            ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
            byteBufferOrder.put((byte) 0);
            byteBufferOrder.putShort((short) ((this.f7248F * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.f7249G * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.f7250H * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.f7251I * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.f7252J * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.f7253K * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.f7254L * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.f7255M * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) (this.f7256N + 0.5f));
            byteBufferOrder.putShort((short) (this.f7257O + 0.5f));
            byteBufferOrder.putShort((short) this.f7246D);
            byteBufferOrder.putShort((short) this.f7247E);
            return bArr;
        }

        private static Pair k(F f10) throws z {
            try {
                f10.b0(16);
                long jB = f10.B();
                if (jB == 1482049860) {
                    return new Pair("video/divx", null);
                }
                if (jB == 859189832) {
                    return new Pair("video/3gpp", null);
                }
                if (jB != 826496599) {
                    AbstractC1477t.h("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                    return new Pair("video/x-unknown", null);
                }
                byte[] bArrF = f10.f();
                for (int iG = f10.g() + 20; iG < bArrF.length - 4; iG++) {
                    if (bArrF[iG] == 0 && bArrF[iG + 1] == 0 && bArrF[iG + 2] == 1 && bArrF[iG + 3] == 15) {
                        return new Pair("video/wvc1", Collections.singletonList(Arrays.copyOfRange(bArrF, iG, bArrF.length)));
                    }
                }
                throw z.a("Failed to find FourCC VC1 initialization data", null);
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw z.a("Error parsing FourCC private data", null);
            }
        }

        private static boolean l(F f10) throws z {
            try {
                int iD = f10.D();
                if (iD == 1) {
                    return true;
                }
                if (iD == 65534) {
                    f10.a0(24);
                    if (f10.E() == e.f7183k0.getMostSignificantBits() && f10.E() == e.f7183k0.getLeastSignificantBits()) {
                        return true;
                    }
                }
                return false;
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw z.a("Error parsing MS/ACM codec private", null);
            }
        }

        private static List m(byte[] bArr) throws z {
            int i10;
            int i11;
            try {
                if (bArr[0] != 2) {
                    throw z.a("Error parsing vorbis codec private", null);
                }
                int i12 = 0;
                int i13 = 1;
                while (true) {
                    i10 = bArr[i13];
                    if ((i10 & 255) != 255) {
                        break;
                    }
                    i12 += 255;
                    i13++;
                }
                int i14 = i13 + 1;
                int i15 = i12 + (i10 & 255);
                int i16 = 0;
                while (true) {
                    i11 = bArr[i14];
                    if ((i11 & 255) != 255) {
                        break;
                    }
                    i16 += 255;
                    i14++;
                }
                int i17 = i14 + 1;
                int i18 = i16 + (i11 & 255);
                if (bArr[i17] != 1) {
                    throw z.a("Error parsing vorbis codec private", null);
                }
                byte[] bArr2 = new byte[i15];
                System.arraycopy(bArr, i17, bArr2, 0, i15);
                int i19 = i17 + i15;
                if (bArr[i19] != 3) {
                    throw z.a("Error parsing vorbis codec private", null);
                }
                int i20 = i19 + i18;
                if (bArr[i20] != 5) {
                    throw z.a("Error parsing vorbis codec private", null);
                }
                byte[] bArr3 = new byte[bArr.length - i20];
                System.arraycopy(bArr, i20, bArr3, 0, bArr.length - i20);
                ArrayList arrayList = new ArrayList(2);
                arrayList.add(bArr2);
                arrayList.add(bArr3);
                return arrayList;
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw z.a("Error parsing vorbis codec private", null);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean o(boolean z10) {
            if ("A_OPUS".equals(this.f7272c)) {
                return z10;
            }
            return this.f7276g > 0;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code duplicated, block: B:225:0x0458  */
        /* JADX WARN: Code duplicated, block: B:230:0x0471  */
        /* JADX WARN: Code duplicated, block: B:231:0x0473  */
        /* JADX WARN: Code duplicated, block: B:234:0x0480  */
        /* JADX WARN: Code duplicated, block: B:235:0x0492  */
        /* JADX WARN: Code duplicated, block: B:237:0x0498  */
        /* JADX WARN: Code duplicated, block: B:239:0x049c  */
        /* JADX WARN: Code duplicated, block: B:241:0x04a1  */
        /* JADX WARN: Code duplicated, block: B:244:0x04a9  */
        /* JADX WARN: Code duplicated, block: B:246:0x04ae  */
        /* JADX WARN: Code duplicated, block: B:249:0x04b3  */
        /* JADX WARN: Code duplicated, block: B:252:0x04c1  */
        /* JADX WARN: Code duplicated, block: B:255:0x04c7  */
        /* JADX WARN: Code duplicated, block: B:258:0x04fa  */
        /* JADX WARN: Code duplicated, block: B:263:0x051a  */
        /* JADX WARN: Code duplicated, block: B:269:0x0533  */
        /* JADX WARN: Code duplicated, block: B:270:0x0535  */
        /* JADX WARN: Code duplicated, block: B:272:0x053f  */
        /* JADX WARN: Code duplicated, block: B:273:0x0542  */
        /* JADX WARN: Code duplicated, block: B:275:0x054c  */
        /* JADX WARN: Code duplicated, block: B:281:0x0564  */
        /* JADX WARN: Code duplicated, block: B:283:0x058b  */
        /* JADX WARN: Code duplicated, block: B:285:0x0591  */
        /* JADX WARN: Code duplicated, block: B:301:0x05bc  */
        /* JADX WARN: Code duplicated, block: B:306:0x05d7  */
        /* JADX WARN: Code duplicated, block: B:307:0x05da  */
        /* JADX WARN: Code duplicated, block: B:4:0x0015  */
        public void i(r rVar, int i10) throws z {
            byte b10;
            List listSingletonList;
            String str;
            int i11;
            int i12;
            List list;
            String str2;
            String str3;
            int i13;
            R1.r.b bVar;
            int i14;
            int iIntValue;
            int i15;
            float f10;
            int i16;
            int i17;
            int i18;
            String str4;
            V1.a aVarA;
            String str5 = this.f7272c;
            str5.getClass();
            switch (str5) {
                case "V_MPEG4/ISO/AP":
                    b10 = 0;
                    break;
                case "V_MPEG4/ISO/SP":
                    b10 = 1;
                    break;
                case "A_MS/ACM":
                    b10 = 2;
                    break;
                case "A_TRUEHD":
                    b10 = 3;
                    break;
                case "A_VORBIS":
                    b10 = 4;
                    break;
                case "A_MPEG/L2":
                    b10 = 5;
                    break;
                case "A_MPEG/L3":
                    b10 = 6;
                    break;
                case "V_MS/VFW/FOURCC":
                    b10 = 7;
                    break;
                case "S_DVBSUB":
                    b10 = 8;
                    break;
                case "V_MPEG4/ISO/ASP":
                    b10 = 9;
                    break;
                case "V_MPEG4/ISO/AVC":
                    b10 = 10;
                    break;
                case "S_VOBSUB":
                    b10 = 11;
                    break;
                case "A_DTS/LOSSLESS":
                    b10 = 12;
                    break;
                case "A_AAC":
                    b10 = 13;
                    break;
                case "A_AC3":
                    b10 = 14;
                    break;
                case "A_DTS":
                    b10 = 15;
                    break;
                case "V_AV1":
                    b10 = 16;
                    break;
                case "V_VP8":
                    b10 = 17;
                    break;
                case "V_VP9":
                    b10 = 18;
                    break;
                case "S_HDMV/PGS":
                    b10 = 19;
                    break;
                case "V_THEORA":
                    b10 = 20;
                    break;
                case "A_DTS/EXPRESS":
                    b10 = 21;
                    break;
                case "A_PCM/FLOAT/IEEE":
                    b10 = 22;
                    break;
                case "A_PCM/INT/BIG":
                    b10 = 23;
                    break;
                case "A_PCM/INT/LIT":
                    b10 = 24;
                    break;
                case "S_TEXT/ASS":
                    b10 = 25;
                    break;
                case "S_TEXT/SSA":
                    b10 = 26;
                    break;
                case "V_MPEGH/ISO/HEVC":
                    b10 = 27;
                    break;
                case "S_TEXT/WEBVTT":
                    b10 = 28;
                    break;
                case "S_TEXT/UTF8":
                    b10 = 29;
                    break;
                case "V_MPEG2":
                    b10 = 30;
                    break;
                case "A_EAC3":
                    b10 = 31;
                    break;
                case "A_FLAC":
                    b10 = 32;
                    break;
                case "A_OPUS":
                    b10 = 33;
                    break;
                default:
                    b10 = -1;
                    break;
            }
            String str6 = "audio/raw";
            switch (b10) {
                case 0:
                case 1:
                case 9:
                    byte[] bArr = this.f7281l;
                    listSingletonList = bArr == null ? null : Collections.singletonList(bArr);
                    str6 = "video/mp4v-es";
                    str = null;
                    i12 = -1;
                    i11 = -1;
                    if (this.f7258P != null && (aVarA = V1.a.a(new F(this.f7258P))) != null) {
                        str = aVarA.f13904c;
                        str6 = "video/dolby-vision";
                    }
                    str3 = str6;
                    boolean z10 = this.f7266X;
                    if (this.f7265W) {
                        i13 = 2;
                    } else {
                        i13 = 0;
                    }
                    int i19 = i13 | (z10 ? 1 : 0);
                    bVar = new R1.r.b();
                    if (y.o(str3)) {
                        bVar.T(this.f7259Q).z0(this.f7261S).s0(i11);
                        i14 = 1;
                    } else if (y.t(str3)) {
                        if (this.f7288s == 0) {
                            i17 = this.f7286q;
                            iIntValue = -1;
                            if (i17 == -1) {
                                i17 = this.f7283n;
                            }
                            this.f7286q = i17;
                            i18 = this.f7287r;
                            if (i18 == -1) {
                                i18 = this.f7284o;
                            }
                            this.f7287r = i18;
                        } else {
                            iIntValue = -1;
                        }
                        i15 = this.f7286q;
                        if (i15 != iIntValue || (i16 = this.f7287r) == iIntValue) {
                            f10 = -1.0f;
                        } else {
                            f10 = (this.f7284o * i15) / (this.f7283n * i16);
                        }
                        C1349i c1349iA = this.f7295z ? new C1349i.b().d(this.f7243A).c(this.f7245C).e(this.f7244B).f(h()).g(this.f7285p).b(this.f7285p).a() : null;
                        if (this.f7271b != null && e.f7184l0.containsKey(this.f7271b)) {
                            iIntValue = ((Integer) e.f7184l0.get(this.f7271b)).intValue();
                        }
                        if (this.f7289t == 0 && Float.compare(this.f7290u, 0.0f) == 0 && Float.compare(this.f7291v, 0.0f) == 0) {
                            if (Float.compare(this.f7292w, 0.0f) == 0) {
                                iIntValue = 0;
                            } else if (Float.compare(this.f7292w, 90.0f) == 0) {
                                iIntValue = 90;
                            } else if (Float.compare(this.f7292w, -180.0f) != 0 || Float.compare(this.f7292w, 180.0f) == 0) {
                                iIntValue = 180;
                            } else if (Float.compare(this.f7292w, -90.0f) == 0) {
                                iIntValue = 270;
                            }
                        }
                        bVar.F0(this.f7283n).h0(this.f7284o).u0(f10).x0(iIntValue).v0(this.f7293x).B0(this.f7294y).V(c1349iA);
                        i14 = 2;
                    } else {
                        if ("application/x-subrip".equals(str3) && !"text/x-ssa".equals(str3) && !"text/vtt".equals(str3) && !"application/vobsub".equals(str3) && !"application/pgs".equals(str3) && !"application/dvbsubs".equals(str3)) {
                            throw z.a("Unexpected MIME type.", null);
                        }
                        i14 = 3;
                    }
                    if (this.f7271b != null && !e.f7184l0.containsKey(this.f7271b)) {
                        bVar.l0(this.f7271b);
                    }
                    R1.r.b bVarI0 = bVar.i0(i10);
                    if (this.f7269a) {
                        str4 = "video/webm";
                    } else {
                        str4 = "video/x-matroska";
                    }
                    R1.r rVarP = bVarI0.W(str4).y0(str3).o0(i12).n0(this.f7267Y).A0(i19).k0(listSingletonList).U(str).c0(this.f7282m).P();
                    O oF = rVar.f(this.f7273d, i14);
                    this.f7268Z = oF;
                    oF.b(rVarP);
                    return;
                case 2:
                    if (l(new F(g(this.f7272c)))) {
                        int iI0 = S.i0(this.f7260R);
                        if (iI0 == 0) {
                            AbstractC1477t.h("MatroskaExtractor", "Unsupported PCM bit depth: " + this.f7260R + ". Setting mimeType to audio/x-unknown");
                        } else {
                            i11 = iI0;
                            listSingletonList = null;
                            str = null;
                            i12 = -1;
                        }
                        if (this.f7258P != null) {
                            str = aVarA.f13904c;
                            str6 = "video/dolby-vision";
                        }
                        str3 = str6;
                        boolean z11 = this.f7266X;
                        if (this.f7265W) {
                            i13 = 2;
                        } else {
                            i13 = 0;
                        }
                        int i110 = i13 | (z11 ? 1 : 0);
                        bVar = new R1.r.b();
                        if (y.o(str3)) {
                            if (y.t(str3)) {
                                if (this.f7288s == 0) {
                                    i17 = this.f7286q;
                                    iIntValue = -1;
                                    if (i17 == -1) {
                                        i17 = this.f7283n;
                                    }
                                    this.f7286q = i17;
                                    i18 = this.f7287r;
                                    if (i18 == -1) {
                                        i18 = this.f7284o;
                                    }
                                    this.f7287r = i18;
                                } else {
                                    iIntValue = -1;
                                }
                                i15 = this.f7286q;
                                if (i15 != iIntValue) {
                                    f10 = -1.0f;
                                } else {
                                    f10 = -1.0f;
                                }
                                if (this.f7295z) {
                                }
                                if (this.f7271b != null) {
                                    iIntValue = ((Integer) e.f7184l0.get(this.f7271b)).intValue();
                                }
                                if (this.f7289t == 0) {
                                    if (Float.compare(this.f7292w, 0.0f) == 0) {
                                        iIntValue = 0;
                                    } else if (Float.compare(this.f7292w, 90.0f) == 0) {
                                        iIntValue = 90;
                                    } else if (Float.compare(this.f7292w, -180.0f) != 0) {
                                        iIntValue = 180;
                                    } else {
                                        iIntValue = 180;
                                    }
                                }
                                bVar.F0(this.f7283n).h0(this.f7284o).u0(f10).x0(iIntValue).v0(this.f7293x).B0(this.f7294y).V(c1349iA);
                                i14 = 2;
                            } else {
                                if ("application/x-subrip".equals(str3)) {
                                }
                                i14 = 3;
                            }
                            break;
                        } else {
                            bVar.T(this.f7259Q).z0(this.f7261S).s0(i11);
                            i14 = 1;
                        }
                        if (this.f7271b != null) {
                            bVar.l0(this.f7271b);
                        }
                        R1.r.b bVarI1 = bVar.i0(i10);
                        if (this.f7269a) {
                            str4 = "video/webm";
                        } else {
                            str4 = "video/x-matroska";
                        }
                        R1.r rVarP2 = bVarI1.W(str4).y0(str3).o0(i12).n0(this.f7267Y).A0(i110).k0(listSingletonList).U(str).c0(this.f7282m).P();
                        O oF2 = rVar.f(this.f7273d, i14);
                        this.f7268Z = oF2;
                        oF2.b(rVarP2);
                        return;
                    }
                    AbstractC1477t.h("MatroskaExtractor", "Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown");
                    listSingletonList = null;
                    str = null;
                    str6 = "audio/x-unknown";
                    i12 = -1;
                    i11 = -1;
                    if (this.f7258P != null) {
                        str = aVarA.f13904c;
                        str6 = "video/dolby-vision";
                    }
                    str3 = str6;
                    boolean z12 = this.f7266X;
                    if (this.f7265W) {
                        i13 = 2;
                    } else {
                        i13 = 0;
                    }
                    int i111 = i13 | (z12 ? 1 : 0);
                    bVar = new R1.r.b();
                    if (y.o(str3)) {
                        if (y.t(str3)) {
                            if (this.f7288s == 0) {
                                i17 = this.f7286q;
                                iIntValue = -1;
                                if (i17 == -1) {
                                    i17 = this.f7283n;
                                }
                                this.f7286q = i17;
                                i18 = this.f7287r;
                                if (i18 == -1) {
                                    i18 = this.f7284o;
                                }
                                this.f7287r = i18;
                            } else {
                                iIntValue = -1;
                            }
                            i15 = this.f7286q;
                            if (i15 != iIntValue) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            if (this.f7295z) {
                            }
                            if (this.f7271b != null) {
                                iIntValue = ((Integer) e.f7184l0.get(this.f7271b)).intValue();
                            }
                            if (this.f7289t == 0) {
                                if (Float.compare(this.f7292w, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f7292w, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f7292w, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.F0(this.f7283n).h0(this.f7284o).u0(f10).x0(iIntValue).v0(this.f7293x).B0(this.f7294y).V(c1349iA);
                            i14 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i14 = 3;
                        }
                        break;
                    } else {
                        bVar.T(this.f7259Q).z0(this.f7261S).s0(i11);
                        i14 = 1;
                    }
                    if (this.f7271b != null) {
                        bVar.l0(this.f7271b);
                    }
                    R1.r.b bVarI2 = bVar.i0(i10);
                    if (this.f7269a) {
                        str4 = "video/webm";
                    } else {
                        str4 = "video/x-matroska";
                    }
                    R1.r rVarP3 = bVarI2.W(str4).y0(str3).o0(i12).n0(this.f7267Y).A0(i111).k0(listSingletonList).U(str).c0(this.f7282m).P();
                    O oF3 = rVar.f(this.f7273d, i14);
                    this.f7268Z = oF3;
                    oF3.b(rVarP3);
                    return;
                case 3:
                    this.f7264V = new P();
                    str6 = "audio/true-hd";
                    listSingletonList = null;
                    str = null;
                    i12 = -1;
                    i11 = -1;
                    if (this.f7258P != null) {
                        str = aVarA.f13904c;
                        str6 = "video/dolby-vision";
                    }
                    str3 = str6;
                    boolean z13 = this.f7266X;
                    if (this.f7265W) {
                        i13 = 2;
                    } else {
                        i13 = 0;
                    }
                    int i112 = i13 | (z13 ? 1 : 0);
                    bVar = new R1.r.b();
                    if (y.o(str3)) {
                        if (y.t(str3)) {
                            if (this.f7288s == 0) {
                                i17 = this.f7286q;
                                iIntValue = -1;
                                if (i17 == -1) {
                                    i17 = this.f7283n;
                                }
                                this.f7286q = i17;
                                i18 = this.f7287r;
                                if (i18 == -1) {
                                    i18 = this.f7284o;
                                }
                                this.f7287r = i18;
                            } else {
                                iIntValue = -1;
                            }
                            i15 = this.f7286q;
                            if (i15 != iIntValue) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            if (this.f7295z) {
                            }
                            if (this.f7271b != null) {
                                iIntValue = ((Integer) e.f7184l0.get(this.f7271b)).intValue();
                            }
                            if (this.f7289t == 0) {
                                if (Float.compare(this.f7292w, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f7292w, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f7292w, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.F0(this.f7283n).h0(this.f7284o).u0(f10).x0(iIntValue).v0(this.f7293x).B0(this.f7294y).V(c1349iA);
                            i14 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i14 = 3;
                        }
                        break;
                    } else {
                        bVar.T(this.f7259Q).z0(this.f7261S).s0(i11);
                        i14 = 1;
                    }
                    if (this.f7271b != null) {
                        bVar.l0(this.f7271b);
                    }
                    R1.r.b bVarI3 = bVar.i0(i10);
                    if (this.f7269a) {
                        str4 = "video/webm";
                    } else {
                        str4 = "video/x-matroska";
                    }
                    R1.r rVarP4 = bVarI3.W(str4).y0(str3).o0(i12).n0(this.f7267Y).A0(i112).k0(listSingletonList).U(str).c0(this.f7282m).P();
                    O oF4 = rVar.f(this.f7273d, i14);
                    this.f7268Z = oF4;
                    oF4.b(rVarP4);
                    return;
                case 4:
                    listSingletonList = m(g(this.f7272c));
                    str6 = "audio/vorbis";
                    i12 = 8192;
                    str = null;
                    i11 = -1;
                    if (this.f7258P != null) {
                        str = aVarA.f13904c;
                        str6 = "video/dolby-vision";
                    }
                    str3 = str6;
                    boolean z14 = this.f7266X;
                    if (this.f7265W) {
                        i13 = 2;
                    } else {
                        i13 = 0;
                    }
                    int i113 = i13 | (z14 ? 1 : 0);
                    bVar = new R1.r.b();
                    if (y.o(str3)) {
                        if (y.t(str3)) {
                            if (this.f7288s == 0) {
                                i17 = this.f7286q;
                                iIntValue = -1;
                                if (i17 == -1) {
                                    i17 = this.f7283n;
                                }
                                this.f7286q = i17;
                                i18 = this.f7287r;
                                if (i18 == -1) {
                                    i18 = this.f7284o;
                                }
                                this.f7287r = i18;
                            } else {
                                iIntValue = -1;
                            }
                            i15 = this.f7286q;
                            if (i15 != iIntValue) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            if (this.f7295z) {
                            }
                            if (this.f7271b != null) {
                                iIntValue = ((Integer) e.f7184l0.get(this.f7271b)).intValue();
                            }
                            if (this.f7289t == 0) {
                                if (Float.compare(this.f7292w, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f7292w, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f7292w, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.F0(this.f7283n).h0(this.f7284o).u0(f10).x0(iIntValue).v0(this.f7293x).B0(this.f7294y).V(c1349iA);
                            i14 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i14 = 3;
                        }
                        break;
                    } else {
                        bVar.T(this.f7259Q).z0(this.f7261S).s0(i11);
                        i14 = 1;
                    }
                    if (this.f7271b != null) {
                        bVar.l0(this.f7271b);
                    }
                    R1.r.b bVarI4 = bVar.i0(i10);
                    if (this.f7269a) {
                        str4 = "video/webm";
                    } else {
                        str4 = "video/x-matroska";
                    }
                    R1.r rVarP5 = bVarI4.W(str4).y0(str3).o0(i12).n0(this.f7267Y).A0(i113).k0(listSingletonList).U(str).c0(this.f7282m).P();
                    O oF5 = rVar.f(this.f7273d, i14);
                    this.f7268Z = oF5;
                    oF5.b(rVarP5);
                    return;
                case 5:
                    str6 = "audio/mpeg-L2";
                    listSingletonList = null;
                    str = null;
                    i12 = 4096;
                    i11 = -1;
                    if (this.f7258P != null) {
                        str = aVarA.f13904c;
                        str6 = "video/dolby-vision";
                    }
                    str3 = str6;
                    boolean z15 = this.f7266X;
                    if (this.f7265W) {
                        i13 = 2;
                    } else {
                        i13 = 0;
                    }
                    int i114 = i13 | (z15 ? 1 : 0);
                    bVar = new R1.r.b();
                    if (y.o(str3)) {
                        if (y.t(str3)) {
                            if (this.f7288s == 0) {
                                i17 = this.f7286q;
                                iIntValue = -1;
                                if (i17 == -1) {
                                    i17 = this.f7283n;
                                }
                                this.f7286q = i17;
                                i18 = this.f7287r;
                                if (i18 == -1) {
                                    i18 = this.f7284o;
                                }
                                this.f7287r = i18;
                            } else {
                                iIntValue = -1;
                            }
                            i15 = this.f7286q;
                            if (i15 != iIntValue) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            if (this.f7295z) {
                            }
                            if (this.f7271b != null) {
                                iIntValue = ((Integer) e.f7184l0.get(this.f7271b)).intValue();
                            }
                            if (this.f7289t == 0) {
                                if (Float.compare(this.f7292w, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f7292w, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f7292w, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.F0(this.f7283n).h0(this.f7284o).u0(f10).x0(iIntValue).v0(this.f7293x).B0(this.f7294y).V(c1349iA);
                            i14 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i14 = 3;
                        }
                        break;
                    } else {
                        bVar.T(this.f7259Q).z0(this.f7261S).s0(i11);
                        i14 = 1;
                    }
                    if (this.f7271b != null) {
                        bVar.l0(this.f7271b);
                    }
                    R1.r.b bVarI5 = bVar.i0(i10);
                    if (this.f7269a) {
                        str4 = "video/webm";
                    } else {
                        str4 = "video/x-matroska";
                    }
                    R1.r rVarP6 = bVarI5.W(str4).y0(str3).o0(i12).n0(this.f7267Y).A0(i114).k0(listSingletonList).U(str).c0(this.f7282m).P();
                    O oF6 = rVar.f(this.f7273d, i14);
                    this.f7268Z = oF6;
                    oF6.b(rVarP6);
                    return;
                case 6:
                    str6 = "audio/mpeg";
                    listSingletonList = null;
                    str = null;
                    i12 = 4096;
                    i11 = -1;
                    if (this.f7258P != null) {
                        str = aVarA.f13904c;
                        str6 = "video/dolby-vision";
                    }
                    str3 = str6;
                    boolean z16 = this.f7266X;
                    if (this.f7265W) {
                        i13 = 2;
                    } else {
                        i13 = 0;
                    }
                    int i115 = i13 | (z16 ? 1 : 0);
                    bVar = new R1.r.b();
                    if (y.o(str3)) {
                        if (y.t(str3)) {
                            if (this.f7288s == 0) {
                                i17 = this.f7286q;
                                iIntValue = -1;
                                if (i17 == -1) {
                                    i17 = this.f7283n;
                                }
                                this.f7286q = i17;
                                i18 = this.f7287r;
                                if (i18 == -1) {
                                    i18 = this.f7284o;
                                }
                                this.f7287r = i18;
                            } else {
                                iIntValue = -1;
                            }
                            i15 = this.f7286q;
                            if (i15 != iIntValue) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            if (this.f7295z) {
                            }
                            if (this.f7271b != null) {
                                iIntValue = ((Integer) e.f7184l0.get(this.f7271b)).intValue();
                            }
                            if (this.f7289t == 0) {
                                if (Float.compare(this.f7292w, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f7292w, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f7292w, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.F0(this.f7283n).h0(this.f7284o).u0(f10).x0(iIntValue).v0(this.f7293x).B0(this.f7294y).V(c1349iA);
                            i14 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i14 = 3;
                        }
                        break;
                    } else {
                        bVar.T(this.f7259Q).z0(this.f7261S).s0(i11);
                        i14 = 1;
                    }
                    if (this.f7271b != null) {
                        bVar.l0(this.f7271b);
                    }
                    R1.r.b bVarI6 = bVar.i0(i10);
                    if (this.f7269a) {
                        str4 = "video/webm";
                    } else {
                        str4 = "video/x-matroska";
                    }
                    R1.r rVarP7 = bVarI6.W(str4).y0(str3).o0(i12).n0(this.f7267Y).A0(i115).k0(listSingletonList).U(str).c0(this.f7282m).P();
                    O oF7 = rVar.f(this.f7273d, i14);
                    this.f7268Z = oF7;
                    oF7.b(rVarP7);
                    return;
                case 7:
                    Pair pairK = k(new F(g(this.f7272c)));
                    str6 = (String) pairK.first;
                    listSingletonList = (List) pairK.second;
                    str = null;
                    i12 = -1;
                    i11 = -1;
                    if (this.f7258P != null) {
                        str = aVarA.f13904c;
                        str6 = "video/dolby-vision";
                    }
                    str3 = str6;
                    boolean z17 = this.f7266X;
                    if (this.f7265W) {
                        i13 = 2;
                    } else {
                        i13 = 0;
                    }
                    int i116 = i13 | (z17 ? 1 : 0);
                    bVar = new R1.r.b();
                    if (y.o(str3)) {
                        if (y.t(str3)) {
                            if (this.f7288s == 0) {
                                i17 = this.f7286q;
                                iIntValue = -1;
                                if (i17 == -1) {
                                    i17 = this.f7283n;
                                }
                                this.f7286q = i17;
                                i18 = this.f7287r;
                                if (i18 == -1) {
                                    i18 = this.f7284o;
                                }
                                this.f7287r = i18;
                            } else {
                                iIntValue = -1;
                            }
                            i15 = this.f7286q;
                            if (i15 != iIntValue) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            if (this.f7295z) {
                            }
                            if (this.f7271b != null) {
                                iIntValue = ((Integer) e.f7184l0.get(this.f7271b)).intValue();
                            }
                            if (this.f7289t == 0) {
                                if (Float.compare(this.f7292w, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f7292w, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f7292w, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.F0(this.f7283n).h0(this.f7284o).u0(f10).x0(iIntValue).v0(this.f7293x).B0(this.f7294y).V(c1349iA);
                            i14 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i14 = 3;
                        }
                        break;
                    } else {
                        bVar.T(this.f7259Q).z0(this.f7261S).s0(i11);
                        i14 = 1;
                    }
                    if (this.f7271b != null) {
                        bVar.l0(this.f7271b);
                    }
                    R1.r.b bVarI7 = bVar.i0(i10);
                    if (this.f7269a) {
                        str4 = "video/webm";
                    } else {
                        str4 = "video/x-matroska";
                    }
                    R1.r rVarP8 = bVarI7.W(str4).y0(str3).o0(i12).n0(this.f7267Y).A0(i116).k0(listSingletonList).U(str).c0(this.f7282m).P();
                    O oF8 = rVar.f(this.f7273d, i14);
                    this.f7268Z = oF8;
                    oF8.b(rVarP8);
                    return;
                case 8:
                    byte[] bArr2 = new byte[4];
                    System.arraycopy(g(this.f7272c), 0, bArr2, 0, 4);
                    listSingletonList = AbstractC0876t.x(bArr2);
                    str = null;
                    str6 = "application/dvbsubs";
                    i12 = -1;
                    i11 = -1;
                    if (this.f7258P != null) {
                        str = aVarA.f13904c;
                        str6 = "video/dolby-vision";
                    }
                    str3 = str6;
                    boolean z18 = this.f7266X;
                    if (this.f7265W) {
                        i13 = 2;
                    } else {
                        i13 = 0;
                    }
                    int i117 = i13 | (z18 ? 1 : 0);
                    bVar = new R1.r.b();
                    if (y.o(str3)) {
                        if (y.t(str3)) {
                            if (this.f7288s == 0) {
                                i17 = this.f7286q;
                                iIntValue = -1;
                                if (i17 == -1) {
                                    i17 = this.f7283n;
                                }
                                this.f7286q = i17;
                                i18 = this.f7287r;
                                if (i18 == -1) {
                                    i18 = this.f7284o;
                                }
                                this.f7287r = i18;
                            } else {
                                iIntValue = -1;
                            }
                            i15 = this.f7286q;
                            if (i15 != iIntValue) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            if (this.f7295z) {
                            }
                            if (this.f7271b != null) {
                                iIntValue = ((Integer) e.f7184l0.get(this.f7271b)).intValue();
                            }
                            if (this.f7289t == 0) {
                                if (Float.compare(this.f7292w, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f7292w, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f7292w, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.F0(this.f7283n).h0(this.f7284o).u0(f10).x0(iIntValue).v0(this.f7293x).B0(this.f7294y).V(c1349iA);
                            i14 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i14 = 3;
                        }
                        break;
                    } else {
                        bVar.T(this.f7259Q).z0(this.f7261S).s0(i11);
                        i14 = 1;
                    }
                    if (this.f7271b != null) {
                        bVar.l0(this.f7271b);
                    }
                    R1.r.b bVarI8 = bVar.i0(i10);
                    if (this.f7269a) {
                        str4 = "video/webm";
                    } else {
                        str4 = "video/x-matroska";
                    }
                    R1.r rVarP9 = bVarI8.W(str4).y0(str3).o0(i12).n0(this.f7267Y).A0(i117).k0(listSingletonList).U(str).c0(this.f7282m).P();
                    O oF9 = rVar.f(this.f7273d, i14);
                    this.f7268Z = oF9;
                    oF9.b(rVarP9);
                    return;
                case 10:
                    C4241d c4241dB = C4241d.b(new F(g(this.f7272c)));
                    list = c4241dB.f56049a;
                    this.f7270a0 = c4241dB.f56050b;
                    str2 = c4241dB.f56060l;
                    str6 = "video/avc";
                    List list2 = list;
                    str = str2;
                    listSingletonList = list2;
                    i12 = -1;
                    i11 = -1;
                    if (this.f7258P != null) {
                        str = aVarA.f13904c;
                        str6 = "video/dolby-vision";
                    }
                    str3 = str6;
                    boolean z19 = this.f7266X;
                    if (this.f7265W) {
                        i13 = 2;
                    } else {
                        i13 = 0;
                    }
                    int i118 = i13 | (z19 ? 1 : 0);
                    bVar = new R1.r.b();
                    if (y.o(str3)) {
                        if (y.t(str3)) {
                            if (this.f7288s == 0) {
                                i17 = this.f7286q;
                                iIntValue = -1;
                                if (i17 == -1) {
                                    i17 = this.f7283n;
                                }
                                this.f7286q = i17;
                                i18 = this.f7287r;
                                if (i18 == -1) {
                                    i18 = this.f7284o;
                                }
                                this.f7287r = i18;
                            } else {
                                iIntValue = -1;
                            }
                            i15 = this.f7286q;
                            if (i15 != iIntValue) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            if (this.f7295z) {
                            }
                            if (this.f7271b != null) {
                                iIntValue = ((Integer) e.f7184l0.get(this.f7271b)).intValue();
                            }
                            if (this.f7289t == 0) {
                                if (Float.compare(this.f7292w, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f7292w, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f7292w, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.F0(this.f7283n).h0(this.f7284o).u0(f10).x0(iIntValue).v0(this.f7293x).B0(this.f7294y).V(c1349iA);
                            i14 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i14 = 3;
                        }
                        break;
                    } else {
                        bVar.T(this.f7259Q).z0(this.f7261S).s0(i11);
                        i14 = 1;
                    }
                    if (this.f7271b != null) {
                        bVar.l0(this.f7271b);
                    }
                    R1.r.b bVarI9 = bVar.i0(i10);
                    if (this.f7269a) {
                        str4 = "video/webm";
                    } else {
                        str4 = "video/x-matroska";
                    }
                    R1.r rVarP10 = bVarI9.W(str4).y0(str3).o0(i12).n0(this.f7267Y).A0(i118).k0(listSingletonList).U(str).c0(this.f7282m).P();
                    O oF10 = rVar.f(this.f7273d, i14);
                    this.f7268Z = oF10;
                    oF10.b(rVarP10);
                    return;
                case 11:
                    listSingletonList = AbstractC0876t.x(g(this.f7272c));
                    str = null;
                    str6 = "application/vobsub";
                    i12 = -1;
                    i11 = -1;
                    if (this.f7258P != null) {
                        str = aVarA.f13904c;
                        str6 = "video/dolby-vision";
                    }
                    str3 = str6;
                    boolean z110 = this.f7266X;
                    if (this.f7265W) {
                        i13 = 2;
                    } else {
                        i13 = 0;
                    }
                    int i119 = i13 | (z110 ? 1 : 0);
                    bVar = new R1.r.b();
                    if (y.o(str3)) {
                        if (y.t(str3)) {
                            if (this.f7288s == 0) {
                                i17 = this.f7286q;
                                iIntValue = -1;
                                if (i17 == -1) {
                                    i17 = this.f7283n;
                                }
                                this.f7286q = i17;
                                i18 = this.f7287r;
                                if (i18 == -1) {
                                    i18 = this.f7284o;
                                }
                                this.f7287r = i18;
                            } else {
                                iIntValue = -1;
                            }
                            i15 = this.f7286q;
                            if (i15 != iIntValue) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            if (this.f7295z) {
                            }
                            if (this.f7271b != null) {
                                iIntValue = ((Integer) e.f7184l0.get(this.f7271b)).intValue();
                            }
                            if (this.f7289t == 0) {
                                if (Float.compare(this.f7292w, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f7292w, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f7292w, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.F0(this.f7283n).h0(this.f7284o).u0(f10).x0(iIntValue).v0(this.f7293x).B0(this.f7294y).V(c1349iA);
                            i14 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i14 = 3;
                        }
                        break;
                    } else {
                        bVar.T(this.f7259Q).z0(this.f7261S).s0(i11);
                        i14 = 1;
                    }
                    if (this.f7271b != null) {
                        bVar.l0(this.f7271b);
                    }
                    R1.r.b bVarI10 = bVar.i0(i10);
                    if (this.f7269a) {
                        str4 = "video/webm";
                    } else {
                        str4 = "video/x-matroska";
                    }
                    R1.r rVarP11 = bVarI10.W(str4).y0(str3).o0(i12).n0(this.f7267Y).A0(i119).k0(listSingletonList).U(str).c0(this.f7282m).P();
                    O oF11 = rVar.f(this.f7273d, i14);
                    this.f7268Z = oF11;
                    oF11.b(rVarP11);
                    return;
                case 12:
                    str6 = "audio/vnd.dts.hd";
                    listSingletonList = null;
                    str = null;
                    i12 = -1;
                    i11 = -1;
                    if (this.f7258P != null) {
                        str = aVarA.f13904c;
                        str6 = "video/dolby-vision";
                    }
                    str3 = str6;
                    boolean z111 = this.f7266X;
                    if (this.f7265W) {
                        i13 = 2;
                    } else {
                        i13 = 0;
                    }
                    int i1110 = i13 | (z111 ? 1 : 0);
                    bVar = new R1.r.b();
                    if (y.o(str3)) {
                        if (y.t(str3)) {
                            if (this.f7288s == 0) {
                                i17 = this.f7286q;
                                iIntValue = -1;
                                if (i17 == -1) {
                                    i17 = this.f7283n;
                                }
                                this.f7286q = i17;
                                i18 = this.f7287r;
                                if (i18 == -1) {
                                    i18 = this.f7284o;
                                }
                                this.f7287r = i18;
                            } else {
                                iIntValue = -1;
                            }
                            i15 = this.f7286q;
                            if (i15 != iIntValue) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            if (this.f7295z) {
                            }
                            if (this.f7271b != null) {
                                iIntValue = ((Integer) e.f7184l0.get(this.f7271b)).intValue();
                            }
                            if (this.f7289t == 0) {
                                if (Float.compare(this.f7292w, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f7292w, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f7292w, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.F0(this.f7283n).h0(this.f7284o).u0(f10).x0(iIntValue).v0(this.f7293x).B0(this.f7294y).V(c1349iA);
                            i14 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i14 = 3;
                        }
                        break;
                    } else {
                        bVar.T(this.f7259Q).z0(this.f7261S).s0(i11);
                        i14 = 1;
                    }
                    if (this.f7271b != null) {
                        bVar.l0(this.f7271b);
                    }
                    R1.r.b bVarI11 = bVar.i0(i10);
                    if (this.f7269a) {
                        str4 = "video/webm";
                    } else {
                        str4 = "video/x-matroska";
                    }
                    R1.r rVarP12 = bVarI11.W(str4).y0(str3).o0(i12).n0(this.f7267Y).A0(i1110).k0(listSingletonList).U(str).c0(this.f7282m).P();
                    O oF12 = rVar.f(this.f7273d, i14);
                    this.f7268Z = oF12;
                    oF12.b(rVarP12);
                    return;
                case 13:
                    listSingletonList = Collections.singletonList(g(this.f7272c));
                    AbstractC4238a.b bVarF = AbstractC4238a.f(this.f7281l);
                    this.f7261S = bVarF.f56020a;
                    this.f7259Q = bVarF.f56021b;
                    str = bVarF.f56022c;
                    str6 = "audio/mp4a-latm";
                    i12 = -1;
                    i11 = -1;
                    if (this.f7258P != null) {
                        str = aVarA.f13904c;
                        str6 = "video/dolby-vision";
                    }
                    str3 = str6;
                    boolean z112 = this.f7266X;
                    if (this.f7265W) {
                        i13 = 2;
                    } else {
                        i13 = 0;
                    }
                    int i1111 = i13 | (z112 ? 1 : 0);
                    bVar = new R1.r.b();
                    if (y.o(str3)) {
                        if (y.t(str3)) {
                            if (this.f7288s == 0) {
                                i17 = this.f7286q;
                                iIntValue = -1;
                                if (i17 == -1) {
                                    i17 = this.f7283n;
                                }
                                this.f7286q = i17;
                                i18 = this.f7287r;
                                if (i18 == -1) {
                                    i18 = this.f7284o;
                                }
                                this.f7287r = i18;
                            } else {
                                iIntValue = -1;
                            }
                            i15 = this.f7286q;
                            if (i15 != iIntValue) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            if (this.f7295z) {
                            }
                            if (this.f7271b != null) {
                                iIntValue = ((Integer) e.f7184l0.get(this.f7271b)).intValue();
                            }
                            if (this.f7289t == 0) {
                                if (Float.compare(this.f7292w, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f7292w, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f7292w, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.F0(this.f7283n).h0(this.f7284o).u0(f10).x0(iIntValue).v0(this.f7293x).B0(this.f7294y).V(c1349iA);
                            i14 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i14 = 3;
                        }
                        break;
                    } else {
                        bVar.T(this.f7259Q).z0(this.f7261S).s0(i11);
                        i14 = 1;
                    }
                    if (this.f7271b != null) {
                        bVar.l0(this.f7271b);
                    }
                    R1.r.b bVarI12 = bVar.i0(i10);
                    if (this.f7269a) {
                        str4 = "video/webm";
                    } else {
                        str4 = "video/x-matroska";
                    }
                    R1.r rVarP13 = bVarI12.W(str4).y0(str3).o0(i12).n0(this.f7267Y).A0(i1111).k0(listSingletonList).U(str).c0(this.f7282m).P();
                    O oF13 = rVar.f(this.f7273d, i14);
                    this.f7268Z = oF13;
                    oF13.b(rVarP13);
                    return;
                case 14:
                    str6 = "audio/ac3";
                    listSingletonList = null;
                    str = null;
                    i12 = -1;
                    i11 = -1;
                    if (this.f7258P != null) {
                        str = aVarA.f13904c;
                        str6 = "video/dolby-vision";
                    }
                    str3 = str6;
                    boolean z113 = this.f7266X;
                    if (this.f7265W) {
                        i13 = 2;
                    } else {
                        i13 = 0;
                    }
                    int i1112 = i13 | (z113 ? 1 : 0);
                    bVar = new R1.r.b();
                    if (y.o(str3)) {
                        if (y.t(str3)) {
                            if (this.f7288s == 0) {
                                i17 = this.f7286q;
                                iIntValue = -1;
                                if (i17 == -1) {
                                    i17 = this.f7283n;
                                }
                                this.f7286q = i17;
                                i18 = this.f7287r;
                                if (i18 == -1) {
                                    i18 = this.f7284o;
                                }
                                this.f7287r = i18;
                            } else {
                                iIntValue = -1;
                            }
                            i15 = this.f7286q;
                            if (i15 != iIntValue) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            if (this.f7295z) {
                            }
                            if (this.f7271b != null) {
                                iIntValue = ((Integer) e.f7184l0.get(this.f7271b)).intValue();
                            }
                            if (this.f7289t == 0) {
                                if (Float.compare(this.f7292w, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f7292w, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f7292w, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.F0(this.f7283n).h0(this.f7284o).u0(f10).x0(iIntValue).v0(this.f7293x).B0(this.f7294y).V(c1349iA);
                            i14 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i14 = 3;
                        }
                        break;
                    } else {
                        bVar.T(this.f7259Q).z0(this.f7261S).s0(i11);
                        i14 = 1;
                    }
                    if (this.f7271b != null) {
                        bVar.l0(this.f7271b);
                    }
                    R1.r.b bVarI13 = bVar.i0(i10);
                    if (this.f7269a) {
                        str4 = "video/webm";
                    } else {
                        str4 = "video/x-matroska";
                    }
                    R1.r rVarP14 = bVarI13.W(str4).y0(str3).o0(i12).n0(this.f7267Y).A0(i1112).k0(listSingletonList).U(str).c0(this.f7282m).P();
                    O oF14 = rVar.f(this.f7273d, i14);
                    this.f7268Z = oF14;
                    oF14.b(rVarP14);
                    return;
                case 15:
                case 21:
                    str6 = "audio/vnd.dts";
                    listSingletonList = null;
                    str = null;
                    i12 = -1;
                    i11 = -1;
                    if (this.f7258P != null) {
                        str = aVarA.f13904c;
                        str6 = "video/dolby-vision";
                    }
                    str3 = str6;
                    boolean z114 = this.f7266X;
                    if (this.f7265W) {
                        i13 = 2;
                    } else {
                        i13 = 0;
                    }
                    int i1113 = i13 | (z114 ? 1 : 0);
                    bVar = new R1.r.b();
                    if (y.o(str3)) {
                        if (y.t(str3)) {
                            if (this.f7288s == 0) {
                                i17 = this.f7286q;
                                iIntValue = -1;
                                if (i17 == -1) {
                                    i17 = this.f7283n;
                                }
                                this.f7286q = i17;
                                i18 = this.f7287r;
                                if (i18 == -1) {
                                    i18 = this.f7284o;
                                }
                                this.f7287r = i18;
                            } else {
                                iIntValue = -1;
                            }
                            i15 = this.f7286q;
                            if (i15 != iIntValue) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            if (this.f7295z) {
                            }
                            if (this.f7271b != null) {
                                iIntValue = ((Integer) e.f7184l0.get(this.f7271b)).intValue();
                            }
                            if (this.f7289t == 0) {
                                if (Float.compare(this.f7292w, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f7292w, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f7292w, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.F0(this.f7283n).h0(this.f7284o).u0(f10).x0(iIntValue).v0(this.f7293x).B0(this.f7294y).V(c1349iA);
                            i14 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i14 = 3;
                        }
                        break;
                    } else {
                        bVar.T(this.f7259Q).z0(this.f7261S).s0(i11);
                        i14 = 1;
                    }
                    if (this.f7271b != null) {
                        bVar.l0(this.f7271b);
                    }
                    R1.r.b bVarI14 = bVar.i0(i10);
                    if (this.f7269a) {
                        str4 = "video/webm";
                    } else {
                        str4 = "video/x-matroska";
                    }
                    R1.r rVarP15 = bVarI14.W(str4).y0(str3).o0(i12).n0(this.f7267Y).A0(i1113).k0(listSingletonList).U(str).c0(this.f7282m).P();
                    O oF15 = rVar.f(this.f7273d, i14);
                    this.f7268Z = oF15;
                    oF15.b(rVarP15);
                    return;
                case 16:
                    byte[] bArr3 = this.f7281l;
                    listSingletonList = bArr3 == null ? null : AbstractC0876t.x(bArr3);
                    str6 = "video/av01";
                    str = null;
                    i12 = -1;
                    i11 = -1;
                    if (this.f7258P != null) {
                        str = aVarA.f13904c;
                        str6 = "video/dolby-vision";
                    }
                    str3 = str6;
                    boolean z115 = this.f7266X;
                    if (this.f7265W) {
                        i13 = 2;
                    } else {
                        i13 = 0;
                    }
                    int i1114 = i13 | (z115 ? 1 : 0);
                    bVar = new R1.r.b();
                    if (y.o(str3)) {
                        if (y.t(str3)) {
                            if (this.f7288s == 0) {
                                i17 = this.f7286q;
                                iIntValue = -1;
                                if (i17 == -1) {
                                    i17 = this.f7283n;
                                }
                                this.f7286q = i17;
                                i18 = this.f7287r;
                                if (i18 == -1) {
                                    i18 = this.f7284o;
                                }
                                this.f7287r = i18;
                            } else {
                                iIntValue = -1;
                            }
                            i15 = this.f7286q;
                            if (i15 != iIntValue) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            if (this.f7295z) {
                            }
                            if (this.f7271b != null) {
                                iIntValue = ((Integer) e.f7184l0.get(this.f7271b)).intValue();
                            }
                            if (this.f7289t == 0) {
                                if (Float.compare(this.f7292w, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f7292w, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f7292w, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.F0(this.f7283n).h0(this.f7284o).u0(f10).x0(iIntValue).v0(this.f7293x).B0(this.f7294y).V(c1349iA);
                            i14 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i14 = 3;
                        }
                        break;
                    } else {
                        bVar.T(this.f7259Q).z0(this.f7261S).s0(i11);
                        i14 = 1;
                    }
                    if (this.f7271b != null) {
                        bVar.l0(this.f7271b);
                    }
                    R1.r.b bVarI15 = bVar.i0(i10);
                    if (this.f7269a) {
                        str4 = "video/webm";
                    } else {
                        str4 = "video/x-matroska";
                    }
                    R1.r rVarP16 = bVarI15.W(str4).y0(str3).o0(i12).n0(this.f7267Y).A0(i1114).k0(listSingletonList).U(str).c0(this.f7282m).P();
                    O oF16 = rVar.f(this.f7273d, i14);
                    this.f7268Z = oF16;
                    oF16.b(rVarP16);
                    return;
                case 17:
                    str6 = "video/x-vnd.on2.vp8";
                    listSingletonList = null;
                    str = null;
                    i12 = -1;
                    i11 = -1;
                    if (this.f7258P != null) {
                        str = aVarA.f13904c;
                        str6 = "video/dolby-vision";
                    }
                    str3 = str6;
                    boolean z116 = this.f7266X;
                    if (this.f7265W) {
                        i13 = 2;
                    } else {
                        i13 = 0;
                    }
                    int i1115 = i13 | (z116 ? 1 : 0);
                    bVar = new R1.r.b();
                    if (y.o(str3)) {
                        if (y.t(str3)) {
                            if (this.f7288s == 0) {
                                i17 = this.f7286q;
                                iIntValue = -1;
                                if (i17 == -1) {
                                    i17 = this.f7283n;
                                }
                                this.f7286q = i17;
                                i18 = this.f7287r;
                                if (i18 == -1) {
                                    i18 = this.f7284o;
                                }
                                this.f7287r = i18;
                            } else {
                                iIntValue = -1;
                            }
                            i15 = this.f7286q;
                            if (i15 != iIntValue) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            if (this.f7295z) {
                            }
                            if (this.f7271b != null) {
                                iIntValue = ((Integer) e.f7184l0.get(this.f7271b)).intValue();
                            }
                            if (this.f7289t == 0) {
                                if (Float.compare(this.f7292w, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f7292w, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f7292w, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.F0(this.f7283n).h0(this.f7284o).u0(f10).x0(iIntValue).v0(this.f7293x).B0(this.f7294y).V(c1349iA);
                            i14 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i14 = 3;
                        }
                        break;
                    } else {
                        bVar.T(this.f7259Q).z0(this.f7261S).s0(i11);
                        i14 = 1;
                    }
                    if (this.f7271b != null) {
                        bVar.l0(this.f7271b);
                    }
                    R1.r.b bVarI16 = bVar.i0(i10);
                    if (this.f7269a) {
                        str4 = "video/webm";
                    } else {
                        str4 = "video/x-matroska";
                    }
                    R1.r rVarP17 = bVarI16.W(str4).y0(str3).o0(i12).n0(this.f7267Y).A0(i1115).k0(listSingletonList).U(str).c0(this.f7282m).P();
                    O oF17 = rVar.f(this.f7273d, i14);
                    this.f7268Z = oF17;
                    oF17.b(rVarP17);
                    return;
                case 18:
                    byte[] bArr4 = this.f7281l;
                    listSingletonList = bArr4 == null ? null : AbstractC0876t.x(bArr4);
                    str6 = "video/x-vnd.on2.vp9";
                    str = null;
                    i12 = -1;
                    i11 = -1;
                    if (this.f7258P != null) {
                        str = aVarA.f13904c;
                        str6 = "video/dolby-vision";
                    }
                    str3 = str6;
                    boolean z117 = this.f7266X;
                    if (this.f7265W) {
                        i13 = 2;
                    } else {
                        i13 = 0;
                    }
                    int i1116 = i13 | (z117 ? 1 : 0);
                    bVar = new R1.r.b();
                    if (y.o(str3)) {
                        if (y.t(str3)) {
                            if (this.f7288s == 0) {
                                i17 = this.f7286q;
                                iIntValue = -1;
                                if (i17 == -1) {
                                    i17 = this.f7283n;
                                }
                                this.f7286q = i17;
                                i18 = this.f7287r;
                                if (i18 == -1) {
                                    i18 = this.f7284o;
                                }
                                this.f7287r = i18;
                            } else {
                                iIntValue = -1;
                            }
                            i15 = this.f7286q;
                            if (i15 != iIntValue) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            if (this.f7295z) {
                            }
                            if (this.f7271b != null) {
                                iIntValue = ((Integer) e.f7184l0.get(this.f7271b)).intValue();
                            }
                            if (this.f7289t == 0) {
                                if (Float.compare(this.f7292w, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f7292w, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f7292w, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.F0(this.f7283n).h0(this.f7284o).u0(f10).x0(iIntValue).v0(this.f7293x).B0(this.f7294y).V(c1349iA);
                            i14 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i14 = 3;
                        }
                        break;
                    } else {
                        bVar.T(this.f7259Q).z0(this.f7261S).s0(i11);
                        i14 = 1;
                    }
                    if (this.f7271b != null) {
                        bVar.l0(this.f7271b);
                    }
                    R1.r.b bVarI17 = bVar.i0(i10);
                    if (this.f7269a) {
                        str4 = "video/webm";
                    } else {
                        str4 = "video/x-matroska";
                    }
                    R1.r rVarP18 = bVarI17.W(str4).y0(str3).o0(i12).n0(this.f7267Y).A0(i1116).k0(listSingletonList).U(str).c0(this.f7282m).P();
                    O oF18 = rVar.f(this.f7273d, i14);
                    this.f7268Z = oF18;
                    oF18.b(rVarP18);
                    return;
                case 19:
                    listSingletonList = null;
                    str = null;
                    str6 = "application/pgs";
                    i12 = -1;
                    i11 = -1;
                    if (this.f7258P != null) {
                        str = aVarA.f13904c;
                        str6 = "video/dolby-vision";
                    }
                    str3 = str6;
                    boolean z118 = this.f7266X;
                    if (this.f7265W) {
                        i13 = 2;
                    } else {
                        i13 = 0;
                    }
                    int i1117 = i13 | (z118 ? 1 : 0);
                    bVar = new R1.r.b();
                    if (y.o(str3)) {
                        if (y.t(str3)) {
                            if (this.f7288s == 0) {
                                i17 = this.f7286q;
                                iIntValue = -1;
                                if (i17 == -1) {
                                    i17 = this.f7283n;
                                }
                                this.f7286q = i17;
                                i18 = this.f7287r;
                                if (i18 == -1) {
                                    i18 = this.f7284o;
                                }
                                this.f7287r = i18;
                            } else {
                                iIntValue = -1;
                            }
                            i15 = this.f7286q;
                            if (i15 != iIntValue) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            if (this.f7295z) {
                            }
                            if (this.f7271b != null) {
                                iIntValue = ((Integer) e.f7184l0.get(this.f7271b)).intValue();
                            }
                            if (this.f7289t == 0) {
                                if (Float.compare(this.f7292w, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f7292w, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f7292w, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.F0(this.f7283n).h0(this.f7284o).u0(f10).x0(iIntValue).v0(this.f7293x).B0(this.f7294y).V(c1349iA);
                            i14 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i14 = 3;
                        }
                        break;
                    } else {
                        bVar.T(this.f7259Q).z0(this.f7261S).s0(i11);
                        i14 = 1;
                    }
                    if (this.f7271b != null) {
                        bVar.l0(this.f7271b);
                    }
                    R1.r.b bVarI18 = bVar.i0(i10);
                    if (this.f7269a) {
                        str4 = "video/webm";
                    } else {
                        str4 = "video/x-matroska";
                    }
                    R1.r rVarP19 = bVarI18.W(str4).y0(str3).o0(i12).n0(this.f7267Y).A0(i1117).k0(listSingletonList).U(str).c0(this.f7282m).P();
                    O oF19 = rVar.f(this.f7273d, i14);
                    this.f7268Z = oF19;
                    oF19.b(rVarP19);
                    return;
                case 20:
                    str6 = "video/x-unknown";
                    listSingletonList = null;
                    str = null;
                    i12 = -1;
                    i11 = -1;
                    if (this.f7258P != null) {
                        str = aVarA.f13904c;
                        str6 = "video/dolby-vision";
                    }
                    str3 = str6;
                    boolean z119 = this.f7266X;
                    if (this.f7265W) {
                        i13 = 2;
                    } else {
                        i13 = 0;
                    }
                    int i1118 = i13 | (z119 ? 1 : 0);
                    bVar = new R1.r.b();
                    if (y.o(str3)) {
                        if (y.t(str3)) {
                            if (this.f7288s == 0) {
                                i17 = this.f7286q;
                                iIntValue = -1;
                                if (i17 == -1) {
                                    i17 = this.f7283n;
                                }
                                this.f7286q = i17;
                                i18 = this.f7287r;
                                if (i18 == -1) {
                                    i18 = this.f7284o;
                                }
                                this.f7287r = i18;
                            } else {
                                iIntValue = -1;
                            }
                            i15 = this.f7286q;
                            if (i15 != iIntValue) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            if (this.f7295z) {
                            }
                            if (this.f7271b != null) {
                                iIntValue = ((Integer) e.f7184l0.get(this.f7271b)).intValue();
                            }
                            if (this.f7289t == 0) {
                                if (Float.compare(this.f7292w, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f7292w, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f7292w, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.F0(this.f7283n).h0(this.f7284o).u0(f10).x0(iIntValue).v0(this.f7293x).B0(this.f7294y).V(c1349iA);
                            i14 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i14 = 3;
                        }
                        break;
                    } else {
                        bVar.T(this.f7259Q).z0(this.f7261S).s0(i11);
                        i14 = 1;
                    }
                    if (this.f7271b != null) {
                        bVar.l0(this.f7271b);
                    }
                    R1.r.b bVarI19 = bVar.i0(i10);
                    if (this.f7269a) {
                        str4 = "video/webm";
                    } else {
                        str4 = "video/x-matroska";
                    }
                    R1.r rVarP110 = bVarI19.W(str4).y0(str3).o0(i12).n0(this.f7267Y).A0(i1118).k0(listSingletonList).U(str).c0(this.f7282m).P();
                    O oF110 = rVar.f(this.f7273d, i14);
                    this.f7268Z = oF110;
                    oF110.b(rVarP110);
                    return;
                case 22:
                    if (this.f7260R == 32) {
                        listSingletonList = null;
                        str = null;
                        i12 = -1;
                        i11 = 4;
                    } else {
                        AbstractC1477t.h("MatroskaExtractor", "Unsupported floating point PCM bit depth: " + this.f7260R + ". Setting mimeType to audio/x-unknown");
                        listSingletonList = null;
                        str = null;
                        str6 = "audio/x-unknown";
                        i12 = -1;
                        i11 = -1;
                    }
                    if (this.f7258P != null) {
                        str = aVarA.f13904c;
                        str6 = "video/dolby-vision";
                    }
                    str3 = str6;
                    boolean z1110 = this.f7266X;
                    if (this.f7265W) {
                        i13 = 2;
                    } else {
                        i13 = 0;
                    }
                    int i1119 = i13 | (z1110 ? 1 : 0);
                    bVar = new R1.r.b();
                    if (y.o(str3)) {
                        if (y.t(str3)) {
                            if (this.f7288s == 0) {
                                i17 = this.f7286q;
                                iIntValue = -1;
                                if (i17 == -1) {
                                    i17 = this.f7283n;
                                }
                                this.f7286q = i17;
                                i18 = this.f7287r;
                                if (i18 == -1) {
                                    i18 = this.f7284o;
                                }
                                this.f7287r = i18;
                            } else {
                                iIntValue = -1;
                            }
                            i15 = this.f7286q;
                            if (i15 != iIntValue) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            if (this.f7295z) {
                            }
                            if (this.f7271b != null) {
                                iIntValue = ((Integer) e.f7184l0.get(this.f7271b)).intValue();
                            }
                            if (this.f7289t == 0) {
                                if (Float.compare(this.f7292w, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f7292w, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f7292w, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.F0(this.f7283n).h0(this.f7284o).u0(f10).x0(iIntValue).v0(this.f7293x).B0(this.f7294y).V(c1349iA);
                            i14 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i14 = 3;
                        }
                        break;
                    } else {
                        bVar.T(this.f7259Q).z0(this.f7261S).s0(i11);
                        i14 = 1;
                    }
                    if (this.f7271b != null) {
                        bVar.l0(this.f7271b);
                    }
                    R1.r.b bVarI110 = bVar.i0(i10);
                    if (this.f7269a) {
                        str4 = "video/webm";
                    } else {
                        str4 = "video/x-matroska";
                    }
                    R1.r rVarP111 = bVarI110.W(str4).y0(str3).o0(i12).n0(this.f7267Y).A0(i1119).k0(listSingletonList).U(str).c0(this.f7282m).P();
                    O oF111 = rVar.f(this.f7273d, i14);
                    this.f7268Z = oF111;
                    oF111.b(rVarP111);
                    return;
                case 23:
                    int i20 = this.f7260R;
                    if (i20 == 8) {
                        listSingletonList = null;
                        str = null;
                        i11 = 3;
                    } else {
                        if (i20 == 16) {
                            i11 = 268435456;
                        } else if (i20 == 24) {
                            i11 = 1342177280;
                        } else {
                            if (i20 != 32) {
                                AbstractC1477t.h("MatroskaExtractor", "Unsupported big endian PCM bit depth: " + this.f7260R + ". Setting mimeType to audio/x-unknown");
                                listSingletonList = null;
                                str = null;
                                str6 = "audio/x-unknown";
                                i12 = -1;
                                i11 = -1;
                                if (this.f7258P != null) {
                                    str = aVarA.f13904c;
                                    str6 = "video/dolby-vision";
                                }
                                str3 = str6;
                                boolean z1111 = this.f7266X;
                                if (this.f7265W) {
                                    i13 = 2;
                                } else {
                                    i13 = 0;
                                }
                                int i11110 = i13 | (z1111 ? 1 : 0);
                                bVar = new R1.r.b();
                                if (y.o(str3)) {
                                    if (y.t(str3)) {
                                        if (this.f7288s == 0) {
                                            i17 = this.f7286q;
                                            iIntValue = -1;
                                            if (i17 == -1) {
                                                i17 = this.f7283n;
                                            }
                                            this.f7286q = i17;
                                            i18 = this.f7287r;
                                            if (i18 == -1) {
                                                i18 = this.f7284o;
                                            }
                                            this.f7287r = i18;
                                        } else {
                                            iIntValue = -1;
                                        }
                                        i15 = this.f7286q;
                                        if (i15 != iIntValue) {
                                            f10 = -1.0f;
                                        } else {
                                            f10 = -1.0f;
                                        }
                                        if (this.f7295z) {
                                        }
                                        if (this.f7271b != null) {
                                            iIntValue = ((Integer) e.f7184l0.get(this.f7271b)).intValue();
                                        }
                                        if (this.f7289t == 0) {
                                            if (Float.compare(this.f7292w, 0.0f) == 0) {
                                                iIntValue = 0;
                                            } else if (Float.compare(this.f7292w, 90.0f) == 0) {
                                                iIntValue = 90;
                                            } else if (Float.compare(this.f7292w, -180.0f) != 0) {
                                                iIntValue = 180;
                                            } else {
                                                iIntValue = 180;
                                            }
                                        }
                                        bVar.F0(this.f7283n).h0(this.f7284o).u0(f10).x0(iIntValue).v0(this.f7293x).B0(this.f7294y).V(c1349iA);
                                        i14 = 2;
                                    } else {
                                        if ("application/x-subrip".equals(str3)) {
                                        }
                                        i14 = 3;
                                    }
                                    break;
                                } else {
                                    bVar.T(this.f7259Q).z0(this.f7261S).s0(i11);
                                    i14 = 1;
                                }
                                if (this.f7271b != null) {
                                    bVar.l0(this.f7271b);
                                }
                                R1.r.b bVarI111 = bVar.i0(i10);
                                if (this.f7269a) {
                                    str4 = "video/webm";
                                } else {
                                    str4 = "video/x-matroska";
                                }
                                R1.r rVarP112 = bVarI111.W(str4).y0(str3).o0(i12).n0(this.f7267Y).A0(i11110).k0(listSingletonList).U(str).c0(this.f7282m).P();
                                O oF112 = rVar.f(this.f7273d, i14);
                                this.f7268Z = oF112;
                                oF112.b(rVarP112);
                                return;
                            }
                            i11 = 1610612736;
                        }
                        listSingletonList = null;
                        str = null;
                    }
                    i12 = -1;
                    if (this.f7258P != null) {
                        str = aVarA.f13904c;
                        str6 = "video/dolby-vision";
                    }
                    str3 = str6;
                    boolean z1112 = this.f7266X;
                    if (this.f7265W) {
                        i13 = 2;
                    } else {
                        i13 = 0;
                    }
                    int i11111 = i13 | (z1112 ? 1 : 0);
                    bVar = new R1.r.b();
                    if (y.o(str3)) {
                        if (y.t(str3)) {
                            if (this.f7288s == 0) {
                                i17 = this.f7286q;
                                iIntValue = -1;
                                if (i17 == -1) {
                                    i17 = this.f7283n;
                                }
                                this.f7286q = i17;
                                i18 = this.f7287r;
                                if (i18 == -1) {
                                    i18 = this.f7284o;
                                }
                                this.f7287r = i18;
                            } else {
                                iIntValue = -1;
                            }
                            i15 = this.f7286q;
                            if (i15 != iIntValue) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            if (this.f7295z) {
                            }
                            if (this.f7271b != null) {
                                iIntValue = ((Integer) e.f7184l0.get(this.f7271b)).intValue();
                            }
                            if (this.f7289t == 0) {
                                if (Float.compare(this.f7292w, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f7292w, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f7292w, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.F0(this.f7283n).h0(this.f7284o).u0(f10).x0(iIntValue).v0(this.f7293x).B0(this.f7294y).V(c1349iA);
                            i14 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i14 = 3;
                        }
                        break;
                    } else {
                        bVar.T(this.f7259Q).z0(this.f7261S).s0(i11);
                        i14 = 1;
                    }
                    if (this.f7271b != null) {
                        bVar.l0(this.f7271b);
                    }
                    R1.r.b bVarI112 = bVar.i0(i10);
                    if (this.f7269a) {
                        str4 = "video/webm";
                    } else {
                        str4 = "video/x-matroska";
                    }
                    R1.r rVarP113 = bVarI112.W(str4).y0(str3).o0(i12).n0(this.f7267Y).A0(i11111).k0(listSingletonList).U(str).c0(this.f7282m).P();
                    O oF113 = rVar.f(this.f7273d, i14);
                    this.f7268Z = oF113;
                    oF113.b(rVarP113);
                    return;
                case 24:
                    int iI1 = S.i0(this.f7260R);
                    if (iI1 != 0) {
                        i11 = iI1;
                        listSingletonList = null;
                        str = null;
                        i12 = -1;
                        if (this.f7258P != null) {
                            str = aVarA.f13904c;
                            str6 = "video/dolby-vision";
                        }
                        str3 = str6;
                        boolean z1113 = this.f7266X;
                        if (this.f7265W) {
                            i13 = 2;
                        } else {
                            i13 = 0;
                        }
                        int i11112 = i13 | (z1113 ? 1 : 0);
                        bVar = new R1.r.b();
                        if (y.o(str3)) {
                            if (y.t(str3)) {
                                if (this.f7288s == 0) {
                                    i17 = this.f7286q;
                                    iIntValue = -1;
                                    if (i17 == -1) {
                                        i17 = this.f7283n;
                                    }
                                    this.f7286q = i17;
                                    i18 = this.f7287r;
                                    if (i18 == -1) {
                                        i18 = this.f7284o;
                                    }
                                    this.f7287r = i18;
                                } else {
                                    iIntValue = -1;
                                }
                                i15 = this.f7286q;
                                if (i15 != iIntValue) {
                                    f10 = -1.0f;
                                } else {
                                    f10 = -1.0f;
                                }
                                if (this.f7295z) {
                                }
                                if (this.f7271b != null) {
                                    iIntValue = ((Integer) e.f7184l0.get(this.f7271b)).intValue();
                                }
                                if (this.f7289t == 0) {
                                    if (Float.compare(this.f7292w, 0.0f) == 0) {
                                        iIntValue = 0;
                                    } else if (Float.compare(this.f7292w, 90.0f) == 0) {
                                        iIntValue = 90;
                                    } else if (Float.compare(this.f7292w, -180.0f) != 0) {
                                        iIntValue = 180;
                                    } else {
                                        iIntValue = 180;
                                    }
                                }
                                bVar.F0(this.f7283n).h0(this.f7284o).u0(f10).x0(iIntValue).v0(this.f7293x).B0(this.f7294y).V(c1349iA);
                                i14 = 2;
                            } else {
                                if ("application/x-subrip".equals(str3)) {
                                }
                                i14 = 3;
                            }
                            break;
                        } else {
                            bVar.T(this.f7259Q).z0(this.f7261S).s0(i11);
                            i14 = 1;
                        }
                        if (this.f7271b != null) {
                            bVar.l0(this.f7271b);
                        }
                        R1.r.b bVarI113 = bVar.i0(i10);
                        if (this.f7269a) {
                            str4 = "video/webm";
                        } else {
                            str4 = "video/x-matroska";
                        }
                        R1.r rVarP114 = bVarI113.W(str4).y0(str3).o0(i12).n0(this.f7267Y).A0(i11112).k0(listSingletonList).U(str).c0(this.f7282m).P();
                        O oF114 = rVar.f(this.f7273d, i14);
                        this.f7268Z = oF114;
                        oF114.b(rVarP114);
                        return;
                    }
                    AbstractC1477t.h("MatroskaExtractor", "Unsupported little endian PCM bit depth: " + this.f7260R + ". Setting mimeType to audio/x-unknown");
                    listSingletonList = null;
                    str = null;
                    str6 = "audio/x-unknown";
                    i12 = -1;
                    i11 = -1;
                    if (this.f7258P != null) {
                        str = aVarA.f13904c;
                        str6 = "video/dolby-vision";
                    }
                    str3 = str6;
                    boolean z1114 = this.f7266X;
                    if (this.f7265W) {
                        i13 = 2;
                    } else {
                        i13 = 0;
                    }
                    int i11113 = i13 | (z1114 ? 1 : 0);
                    bVar = new R1.r.b();
                    if (y.o(str3)) {
                        if (y.t(str3)) {
                            if (this.f7288s == 0) {
                                i17 = this.f7286q;
                                iIntValue = -1;
                                if (i17 == -1) {
                                    i17 = this.f7283n;
                                }
                                this.f7286q = i17;
                                i18 = this.f7287r;
                                if (i18 == -1) {
                                    i18 = this.f7284o;
                                }
                                this.f7287r = i18;
                            } else {
                                iIntValue = -1;
                            }
                            i15 = this.f7286q;
                            if (i15 != iIntValue) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            if (this.f7295z) {
                            }
                            if (this.f7271b != null) {
                                iIntValue = ((Integer) e.f7184l0.get(this.f7271b)).intValue();
                            }
                            if (this.f7289t == 0) {
                                if (Float.compare(this.f7292w, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f7292w, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f7292w, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.F0(this.f7283n).h0(this.f7284o).u0(f10).x0(iIntValue).v0(this.f7293x).B0(this.f7294y).V(c1349iA);
                            i14 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i14 = 3;
                        }
                        break;
                    } else {
                        bVar.T(this.f7259Q).z0(this.f7261S).s0(i11);
                        i14 = 1;
                    }
                    if (this.f7271b != null) {
                        bVar.l0(this.f7271b);
                    }
                    R1.r.b bVarI114 = bVar.i0(i10);
                    if (this.f7269a) {
                        str4 = "video/webm";
                    } else {
                        str4 = "video/x-matroska";
                    }
                    R1.r rVarP115 = bVarI114.W(str4).y0(str3).o0(i12).n0(this.f7267Y).A0(i11113).k0(listSingletonList).U(str).c0(this.f7282m).P();
                    O oF115 = rVar.f(this.f7273d, i14);
                    this.f7268Z = oF115;
                    oF115.b(rVarP115);
                    return;
                case 25:
                case 26:
                    listSingletonList = AbstractC0876t.y(e.f7180h0, g(this.f7272c));
                    str6 = "text/x-ssa";
                    str = null;
                    i12 = -1;
                    i11 = -1;
                    if (this.f7258P != null) {
                        str = aVarA.f13904c;
                        str6 = "video/dolby-vision";
                    }
                    str3 = str6;
                    boolean z1115 = this.f7266X;
                    if (this.f7265W) {
                        i13 = 2;
                    } else {
                        i13 = 0;
                    }
                    int i11114 = i13 | (z1115 ? 1 : 0);
                    bVar = new R1.r.b();
                    if (y.o(str3)) {
                        if (y.t(str3)) {
                            if (this.f7288s == 0) {
                                i17 = this.f7286q;
                                iIntValue = -1;
                                if (i17 == -1) {
                                    i17 = this.f7283n;
                                }
                                this.f7286q = i17;
                                i18 = this.f7287r;
                                if (i18 == -1) {
                                    i18 = this.f7284o;
                                }
                                this.f7287r = i18;
                            } else {
                                iIntValue = -1;
                            }
                            i15 = this.f7286q;
                            if (i15 != iIntValue) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            if (this.f7295z) {
                            }
                            if (this.f7271b != null) {
                                iIntValue = ((Integer) e.f7184l0.get(this.f7271b)).intValue();
                            }
                            if (this.f7289t == 0) {
                                if (Float.compare(this.f7292w, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f7292w, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f7292w, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.F0(this.f7283n).h0(this.f7284o).u0(f10).x0(iIntValue).v0(this.f7293x).B0(this.f7294y).V(c1349iA);
                            i14 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i14 = 3;
                        }
                        break;
                    } else {
                        bVar.T(this.f7259Q).z0(this.f7261S).s0(i11);
                        i14 = 1;
                    }
                    if (this.f7271b != null) {
                        bVar.l0(this.f7271b);
                    }
                    R1.r.b bVarI115 = bVar.i0(i10);
                    if (this.f7269a) {
                        str4 = "video/webm";
                    } else {
                        str4 = "video/x-matroska";
                    }
                    R1.r rVarP116 = bVarI115.W(str4).y0(str3).o0(i12).n0(this.f7267Y).A0(i11114).k0(listSingletonList).U(str).c0(this.f7282m).P();
                    O oF116 = rVar.f(this.f7273d, i14);
                    this.f7268Z = oF116;
                    oF116.b(rVarP116);
                    return;
                case 27:
                    C cA = C.a(new F(g(this.f7272c)));
                    list = cA.f55934a;
                    this.f7270a0 = cA.f55935b;
                    str2 = cA.f55949p;
                    str6 = "video/hevc";
                    List list3 = list;
                    str = str2;
                    listSingletonList = list3;
                    i12 = -1;
                    i11 = -1;
                    if (this.f7258P != null) {
                        str = aVarA.f13904c;
                        str6 = "video/dolby-vision";
                    }
                    str3 = str6;
                    boolean z1116 = this.f7266X;
                    if (this.f7265W) {
                        i13 = 2;
                    } else {
                        i13 = 0;
                    }
                    int i11115 = i13 | (z1116 ? 1 : 0);
                    bVar = new R1.r.b();
                    if (y.o(str3)) {
                        if (y.t(str3)) {
                            if (this.f7288s == 0) {
                                i17 = this.f7286q;
                                iIntValue = -1;
                                if (i17 == -1) {
                                    i17 = this.f7283n;
                                }
                                this.f7286q = i17;
                                i18 = this.f7287r;
                                if (i18 == -1) {
                                    i18 = this.f7284o;
                                }
                                this.f7287r = i18;
                            } else {
                                iIntValue = -1;
                            }
                            i15 = this.f7286q;
                            if (i15 != iIntValue) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            if (this.f7295z) {
                            }
                            if (this.f7271b != null) {
                                iIntValue = ((Integer) e.f7184l0.get(this.f7271b)).intValue();
                            }
                            if (this.f7289t == 0) {
                                if (Float.compare(this.f7292w, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f7292w, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f7292w, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.F0(this.f7283n).h0(this.f7284o).u0(f10).x0(iIntValue).v0(this.f7293x).B0(this.f7294y).V(c1349iA);
                            i14 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i14 = 3;
                        }
                        break;
                    } else {
                        bVar.T(this.f7259Q).z0(this.f7261S).s0(i11);
                        i14 = 1;
                    }
                    if (this.f7271b != null) {
                        bVar.l0(this.f7271b);
                    }
                    R1.r.b bVarI116 = bVar.i0(i10);
                    if (this.f7269a) {
                        str4 = "video/webm";
                    } else {
                        str4 = "video/x-matroska";
                    }
                    R1.r rVarP117 = bVarI116.W(str4).y0(str3).o0(i12).n0(this.f7267Y).A0(i11115).k0(listSingletonList).U(str).c0(this.f7282m).P();
                    O oF117 = rVar.f(this.f7273d, i14);
                    this.f7268Z = oF117;
                    oF117.b(rVarP117);
                    return;
                case 28:
                    str6 = "text/vtt";
                    listSingletonList = null;
                    str = null;
                    i12 = -1;
                    i11 = -1;
                    if (this.f7258P != null) {
                        str = aVarA.f13904c;
                        str6 = "video/dolby-vision";
                    }
                    str3 = str6;
                    boolean z1117 = this.f7266X;
                    if (this.f7265W) {
                        i13 = 2;
                    } else {
                        i13 = 0;
                    }
                    int i11116 = i13 | (z1117 ? 1 : 0);
                    bVar = new R1.r.b();
                    if (y.o(str3)) {
                        if (y.t(str3)) {
                            if (this.f7288s == 0) {
                                i17 = this.f7286q;
                                iIntValue = -1;
                                if (i17 == -1) {
                                    i17 = this.f7283n;
                                }
                                this.f7286q = i17;
                                i18 = this.f7287r;
                                if (i18 == -1) {
                                    i18 = this.f7284o;
                                }
                                this.f7287r = i18;
                            } else {
                                iIntValue = -1;
                            }
                            i15 = this.f7286q;
                            if (i15 != iIntValue) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            if (this.f7295z) {
                            }
                            if (this.f7271b != null) {
                                iIntValue = ((Integer) e.f7184l0.get(this.f7271b)).intValue();
                            }
                            if (this.f7289t == 0) {
                                if (Float.compare(this.f7292w, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f7292w, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f7292w, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.F0(this.f7283n).h0(this.f7284o).u0(f10).x0(iIntValue).v0(this.f7293x).B0(this.f7294y).V(c1349iA);
                            i14 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i14 = 3;
                        }
                        break;
                    } else {
                        bVar.T(this.f7259Q).z0(this.f7261S).s0(i11);
                        i14 = 1;
                    }
                    if (this.f7271b != null) {
                        bVar.l0(this.f7271b);
                    }
                    R1.r.b bVarI117 = bVar.i0(i10);
                    if (this.f7269a) {
                        str4 = "video/webm";
                    } else {
                        str4 = "video/x-matroska";
                    }
                    R1.r rVarP118 = bVarI117.W(str4).y0(str3).o0(i12).n0(this.f7267Y).A0(i11116).k0(listSingletonList).U(str).c0(this.f7282m).P();
                    O oF118 = rVar.f(this.f7273d, i14);
                    this.f7268Z = oF118;
                    oF118.b(rVarP118);
                    return;
                case 29:
                    str6 = "application/x-subrip";
                    listSingletonList = null;
                    str = null;
                    i12 = -1;
                    i11 = -1;
                    if (this.f7258P != null) {
                        str = aVarA.f13904c;
                        str6 = "video/dolby-vision";
                    }
                    str3 = str6;
                    boolean z1118 = this.f7266X;
                    if (this.f7265W) {
                        i13 = 2;
                    } else {
                        i13 = 0;
                    }
                    int i11117 = i13 | (z1118 ? 1 : 0);
                    bVar = new R1.r.b();
                    if (y.o(str3)) {
                        if (y.t(str3)) {
                            if (this.f7288s == 0) {
                                i17 = this.f7286q;
                                iIntValue = -1;
                                if (i17 == -1) {
                                    i17 = this.f7283n;
                                }
                                this.f7286q = i17;
                                i18 = this.f7287r;
                                if (i18 == -1) {
                                    i18 = this.f7284o;
                                }
                                this.f7287r = i18;
                            } else {
                                iIntValue = -1;
                            }
                            i15 = this.f7286q;
                            if (i15 != iIntValue) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            if (this.f7295z) {
                            }
                            if (this.f7271b != null) {
                                iIntValue = ((Integer) e.f7184l0.get(this.f7271b)).intValue();
                            }
                            if (this.f7289t == 0) {
                                if (Float.compare(this.f7292w, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f7292w, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f7292w, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.F0(this.f7283n).h0(this.f7284o).u0(f10).x0(iIntValue).v0(this.f7293x).B0(this.f7294y).V(c1349iA);
                            i14 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i14 = 3;
                        }
                        break;
                    } else {
                        bVar.T(this.f7259Q).z0(this.f7261S).s0(i11);
                        i14 = 1;
                    }
                    if (this.f7271b != null) {
                        bVar.l0(this.f7271b);
                    }
                    R1.r.b bVarI118 = bVar.i0(i10);
                    if (this.f7269a) {
                        str4 = "video/webm";
                    } else {
                        str4 = "video/x-matroska";
                    }
                    R1.r rVarP119 = bVarI118.W(str4).y0(str3).o0(i12).n0(this.f7267Y).A0(i11117).k0(listSingletonList).U(str).c0(this.f7282m).P();
                    O oF119 = rVar.f(this.f7273d, i14);
                    this.f7268Z = oF119;
                    oF119.b(rVarP119);
                    return;
                case 30:
                    str6 = "video/mpeg2";
                    listSingletonList = null;
                    str = null;
                    i12 = -1;
                    i11 = -1;
                    if (this.f7258P != null) {
                        str = aVarA.f13904c;
                        str6 = "video/dolby-vision";
                    }
                    str3 = str6;
                    boolean z1119 = this.f7266X;
                    if (this.f7265W) {
                        i13 = 2;
                    } else {
                        i13 = 0;
                    }
                    int i11118 = i13 | (z1119 ? 1 : 0);
                    bVar = new R1.r.b();
                    if (y.o(str3)) {
                        if (y.t(str3)) {
                            if (this.f7288s == 0) {
                                i17 = this.f7286q;
                                iIntValue = -1;
                                if (i17 == -1) {
                                    i17 = this.f7283n;
                                }
                                this.f7286q = i17;
                                i18 = this.f7287r;
                                if (i18 == -1) {
                                    i18 = this.f7284o;
                                }
                                this.f7287r = i18;
                            } else {
                                iIntValue = -1;
                            }
                            i15 = this.f7286q;
                            if (i15 != iIntValue) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            if (this.f7295z) {
                            }
                            if (this.f7271b != null) {
                                iIntValue = ((Integer) e.f7184l0.get(this.f7271b)).intValue();
                            }
                            if (this.f7289t == 0) {
                                if (Float.compare(this.f7292w, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f7292w, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f7292w, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.F0(this.f7283n).h0(this.f7284o).u0(f10).x0(iIntValue).v0(this.f7293x).B0(this.f7294y).V(c1349iA);
                            i14 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i14 = 3;
                        }
                        break;
                    } else {
                        bVar.T(this.f7259Q).z0(this.f7261S).s0(i11);
                        i14 = 1;
                    }
                    if (this.f7271b != null) {
                        bVar.l0(this.f7271b);
                    }
                    R1.r.b bVarI119 = bVar.i0(i10);
                    if (this.f7269a) {
                        str4 = "video/webm";
                    } else {
                        str4 = "video/x-matroska";
                    }
                    R1.r rVarP1110 = bVarI119.W(str4).y0(str3).o0(i12).n0(this.f7267Y).A0(i11118).k0(listSingletonList).U(str).c0(this.f7282m).P();
                    O oF1110 = rVar.f(this.f7273d, i14);
                    this.f7268Z = oF1110;
                    oF1110.b(rVarP1110);
                    return;
                case 31:
                    str6 = "audio/eac3";
                    listSingletonList = null;
                    str = null;
                    i12 = -1;
                    i11 = -1;
                    if (this.f7258P != null) {
                        str = aVarA.f13904c;
                        str6 = "video/dolby-vision";
                    }
                    str3 = str6;
                    boolean z11110 = this.f7266X;
                    if (this.f7265W) {
                        i13 = 2;
                    } else {
                        i13 = 0;
                    }
                    int i11119 = i13 | (z11110 ? 1 : 0);
                    bVar = new R1.r.b();
                    if (y.o(str3)) {
                        if (y.t(str3)) {
                            if (this.f7288s == 0) {
                                i17 = this.f7286q;
                                iIntValue = -1;
                                if (i17 == -1) {
                                    i17 = this.f7283n;
                                }
                                this.f7286q = i17;
                                i18 = this.f7287r;
                                if (i18 == -1) {
                                    i18 = this.f7284o;
                                }
                                this.f7287r = i18;
                            } else {
                                iIntValue = -1;
                            }
                            i15 = this.f7286q;
                            if (i15 != iIntValue) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            if (this.f7295z) {
                            }
                            if (this.f7271b != null) {
                                iIntValue = ((Integer) e.f7184l0.get(this.f7271b)).intValue();
                            }
                            if (this.f7289t == 0) {
                                if (Float.compare(this.f7292w, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f7292w, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f7292w, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.F0(this.f7283n).h0(this.f7284o).u0(f10).x0(iIntValue).v0(this.f7293x).B0(this.f7294y).V(c1349iA);
                            i14 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i14 = 3;
                        }
                        break;
                    } else {
                        bVar.T(this.f7259Q).z0(this.f7261S).s0(i11);
                        i14 = 1;
                    }
                    if (this.f7271b != null) {
                        bVar.l0(this.f7271b);
                    }
                    R1.r.b bVarI1110 = bVar.i0(i10);
                    if (this.f7269a) {
                        str4 = "video/webm";
                    } else {
                        str4 = "video/x-matroska";
                    }
                    R1.r rVarP1111 = bVarI1110.W(str4).y0(str3).o0(i12).n0(this.f7267Y).A0(i11119).k0(listSingletonList).U(str).c0(this.f7282m).P();
                    O oF1111 = rVar.f(this.f7273d, i14);
                    this.f7268Z = oF1111;
                    oF1111.b(rVarP1111);
                    return;
                case 32:
                    listSingletonList = Collections.singletonList(g(this.f7272c));
                    str6 = "audio/flac";
                    str = null;
                    i12 = -1;
                    i11 = -1;
                    if (this.f7258P != null) {
                        str = aVarA.f13904c;
                        str6 = "video/dolby-vision";
                    }
                    str3 = str6;
                    boolean z11111 = this.f7266X;
                    if (this.f7265W) {
                        i13 = 2;
                    } else {
                        i13 = 0;
                    }
                    int i111110 = i13 | (z11111 ? 1 : 0);
                    bVar = new R1.r.b();
                    if (y.o(str3)) {
                        if (y.t(str3)) {
                            if (this.f7288s == 0) {
                                i17 = this.f7286q;
                                iIntValue = -1;
                                if (i17 == -1) {
                                    i17 = this.f7283n;
                                }
                                this.f7286q = i17;
                                i18 = this.f7287r;
                                if (i18 == -1) {
                                    i18 = this.f7284o;
                                }
                                this.f7287r = i18;
                            } else {
                                iIntValue = -1;
                            }
                            i15 = this.f7286q;
                            if (i15 != iIntValue) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            if (this.f7295z) {
                            }
                            if (this.f7271b != null) {
                                iIntValue = ((Integer) e.f7184l0.get(this.f7271b)).intValue();
                            }
                            if (this.f7289t == 0) {
                                if (Float.compare(this.f7292w, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f7292w, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f7292w, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.F0(this.f7283n).h0(this.f7284o).u0(f10).x0(iIntValue).v0(this.f7293x).B0(this.f7294y).V(c1349iA);
                            i14 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i14 = 3;
                        }
                        break;
                    } else {
                        bVar.T(this.f7259Q).z0(this.f7261S).s0(i11);
                        i14 = 1;
                    }
                    if (this.f7271b != null) {
                        bVar.l0(this.f7271b);
                    }
                    R1.r.b bVarI1111 = bVar.i0(i10);
                    if (this.f7269a) {
                        str4 = "video/webm";
                    } else {
                        str4 = "video/x-matroska";
                    }
                    R1.r rVarP1112 = bVarI1111.W(str4).y0(str3).o0(i12).n0(this.f7267Y).A0(i111110).k0(listSingletonList).U(str).c0(this.f7282m).P();
                    O oF1112 = rVar.f(this.f7273d, i14);
                    this.f7268Z = oF1112;
                    oF1112.b(rVarP1112);
                    return;
                case 33:
                    listSingletonList = new ArrayList(3);
                    listSingletonList.add(g(this.f7272c));
                    ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
                    ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                    listSingletonList.add(byteBufferAllocate.order(byteOrder).putLong(this.f7262T).array());
                    listSingletonList.add(ByteBuffer.allocate(8).order(byteOrder).putLong(this.f7263U).array());
                    str6 = "audio/opus";
                    i12 = 5760;
                    str = null;
                    i11 = -1;
                    if (this.f7258P != null) {
                        str = aVarA.f13904c;
                        str6 = "video/dolby-vision";
                    }
                    str3 = str6;
                    boolean z11112 = this.f7266X;
                    if (this.f7265W) {
                        i13 = 2;
                    } else {
                        i13 = 0;
                    }
                    int i111111 = i13 | (z11112 ? 1 : 0);
                    bVar = new R1.r.b();
                    if (y.o(str3)) {
                        if (y.t(str3)) {
                            if (this.f7288s == 0) {
                                i17 = this.f7286q;
                                iIntValue = -1;
                                if (i17 == -1) {
                                    i17 = this.f7283n;
                                }
                                this.f7286q = i17;
                                i18 = this.f7287r;
                                if (i18 == -1) {
                                    i18 = this.f7284o;
                                }
                                this.f7287r = i18;
                            } else {
                                iIntValue = -1;
                            }
                            i15 = this.f7286q;
                            if (i15 != iIntValue) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            if (this.f7295z) {
                            }
                            if (this.f7271b != null) {
                                iIntValue = ((Integer) e.f7184l0.get(this.f7271b)).intValue();
                            }
                            if (this.f7289t == 0) {
                                if (Float.compare(this.f7292w, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(this.f7292w, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(this.f7292w, -180.0f) != 0) {
                                    iIntValue = 180;
                                } else {
                                    iIntValue = 180;
                                }
                            }
                            bVar.F0(this.f7283n).h0(this.f7284o).u0(f10).x0(iIntValue).v0(this.f7293x).B0(this.f7294y).V(c1349iA);
                            i14 = 2;
                        } else {
                            if ("application/x-subrip".equals(str3)) {
                            }
                            i14 = 3;
                        }
                        break;
                    } else {
                        bVar.T(this.f7259Q).z0(this.f7261S).s0(i11);
                        i14 = 1;
                    }
                    if (this.f7271b != null) {
                        bVar.l0(this.f7271b);
                    }
                    R1.r.b bVarI1112 = bVar.i0(i10);
                    if (this.f7269a) {
                        str4 = "video/webm";
                    } else {
                        str4 = "video/x-matroska";
                    }
                    R1.r rVarP1113 = bVarI1112.W(str4).y0(str3).o0(i12).n0(this.f7267Y).A0(i111111).k0(listSingletonList).U(str).c0(this.f7282m).P();
                    O oF1113 = rVar.f(this.f7273d, i14);
                    this.f7268Z = oF1113;
                    oF1113.b(rVarP1113);
                    return;
                default:
                    throw z.a("Unrecognized codec identifier.", null);
            }
        }

        public void j() {
            P p10 = this.f7264V;
            if (p10 != null) {
                p10.a(this.f7268Z, this.f7280k);
            }
        }

        public void n() {
            P p10 = this.f7264V;
            if (p10 != null) {
                p10.b();
            }
        }
    }

    static {
        HashMap map = new HashMap();
        map.put("htc_video_rotA-000", 0);
        map.put("htc_video_rotA-090", 90);
        map.put("htc_video_rotA-180", 180);
        map.put("htc_video_rotA-270", 270);
        f7184l0 = Collections.unmodifiableMap(map);
    }

    e(N2.c cVar, int i10, s.a aVar) {
        this.f7234s = -1L;
        this.f7235t = -9223372036854775807L;
        this.f7236u = -9223372036854775807L;
        this.f7237v = -9223372036854775807L;
        this.f7187C = -1L;
        this.f7188D = -1L;
        this.f7189E = -9223372036854775807L;
        this.f7211a = cVar;
        cVar.b(new b(this, null));
        this.f7221f = aVar;
        this.f7217d = (i10 & 1) == 0;
        this.f7219e = (i10 & 2) == 0;
        this.f7213b = new g();
        this.f7215c = new SparseArray();
        this.f7224i = new F(4);
        this.f7225j = new F(ByteBuffer.allocate(4).putInt(-1).array());
        this.f7226k = new F(4);
        this.f7222g = new F(h.f13920a);
        this.f7223h = new F(4);
        this.f7227l = new F();
        this.f7228m = new F();
        this.f7229n = new F(8);
        this.f7230o = new F();
        this.f7231p = new F();
        this.f7199O = new int[1];
    }

    public e(s.a aVar, int i10) {
        this(new N2.a(), i10, aVar);
    }

    private static boolean A(String str) {
        str.getClass();
        switch (str) {
            case "V_MPEG4/ISO/AP":
            case "V_MPEG4/ISO/SP":
            case "A_MS/ACM":
            case "A_TRUEHD":
            case "A_VORBIS":
            case "A_MPEG/L2":
            case "A_MPEG/L3":
            case "V_MS/VFW/FOURCC":
            case "S_DVBSUB":
            case "V_MPEG4/ISO/ASP":
            case "V_MPEG4/ISO/AVC":
            case "S_VOBSUB":
            case "A_DTS/LOSSLESS":
            case "A_AAC":
            case "A_AC3":
            case "A_DTS":
            case "V_AV1":
            case "V_VP8":
            case "V_VP9":
            case "S_HDMV/PGS":
            case "V_THEORA":
            case "A_DTS/EXPRESS":
            case "A_PCM/FLOAT/IEEE":
            case "A_PCM/INT/BIG":
            case "A_PCM/INT/LIT":
            case "S_TEXT/ASS":
            case "S_TEXT/SSA":
            case "V_MPEGH/ISO/HEVC":
            case "S_TEXT/WEBVTT":
            case "S_TEXT/UTF8":
            case "V_MPEG2":
            case "A_EAC3":
            case "A_FLAC":
            case "A_OPUS":
                return true;
            default:
                return false;
        }
    }

    private boolean C(I i10, long j10) {
        if (this.f7186B) {
            this.f7188D = j10;
            i10.f55969a = this.f7187C;
            this.f7186B = false;
            return true;
        }
        if (this.f7240y) {
            long j11 = this.f7188D;
            if (j11 != -1) {
                i10.f55969a = j11;
                this.f7188D = -1L;
                return true;
            }
        }
        return false;
    }

    private void D(InterfaceC4254q interfaceC4254q, int i10) {
        if (this.f7224i.j() >= i10) {
            return;
        }
        if (this.f7224i.b() < i10) {
            F f10 = this.f7224i;
            f10.d(Math.max(f10.b() * 2, i10));
        }
        interfaceC4254q.readFully(this.f7224i.f(), this.f7224i.j(), i10 - this.f7224i.j());
        this.f7224i.Z(i10);
    }

    private void E() {
        this.f7206V = 0;
        this.f7207W = 0;
        this.f7208X = 0;
        this.f7209Y = false;
        this.f7210Z = false;
        this.f7212a0 = false;
        this.f7214b0 = 0;
        this.f7216c0 = (byte) 0;
        this.f7218d0 = false;
        this.f7227l.W(0);
    }

    private long F(long j10) throws z {
        long j11 = this.f7235t;
        if (j11 != -9223372036854775807L) {
            return S.a1(j10, j11, 1000L);
        }
        throw z.a("Can't scale timecode prior to timecodeScale being set.", null);
    }

    private static void G(String str, long j10, byte[] bArr) {
        byte[] bArrU;
        int i10;
        str.getClass();
        switch (str) {
            case "S_TEXT/ASS":
            case "S_TEXT/SSA":
                bArrU = u(j10, "%01d:%02d:%02d:%02d", 10000L);
                i10 = 21;
                break;
            case "S_TEXT/WEBVTT":
                bArrU = u(j10, "%02d:%02d:%02d.%03d", 1000L);
                i10 = 25;
                break;
            case "S_TEXT/UTF8":
                bArrU = u(j10, "%02d:%02d:%02d,%03d", 1000L);
                i10 = 19;
                break;
            default:
                throw new IllegalArgumentException();
        }
        System.arraycopy(bArrU, 0, bArr, i10, bArrU.length);
    }

    private int J(InterfaceC4254q interfaceC4254q, c cVar, int i10, boolean z10) throws z {
        int i11;
        if ("S_TEXT/UTF8".equals(cVar.f7272c)) {
            K(interfaceC4254q, f7179g0, i10);
            return s();
        }
        if ("S_TEXT/ASS".equals(cVar.f7272c) || "S_TEXT/SSA".equals(cVar.f7272c)) {
            K(interfaceC4254q, f7181i0, i10);
            return s();
        }
        if ("S_TEXT/WEBVTT".equals(cVar.f7272c)) {
            K(interfaceC4254q, f7182j0, i10);
            return s();
        }
        O o10 = cVar.f7268Z;
        if (!this.f7209Y) {
            if (cVar.f7278i) {
                this.f7202R &= -1073741825;
                if (!this.f7210Z) {
                    interfaceC4254q.readFully(this.f7224i.f(), 0, 1);
                    this.f7206V++;
                    if ((this.f7224i.f()[0] & 128) == 128) {
                        throw z.a("Extension bit is set in signal byte", null);
                    }
                    this.f7216c0 = this.f7224i.f()[0];
                    this.f7210Z = true;
                }
                byte b10 = this.f7216c0;
                if ((b10 & 1) == 1) {
                    boolean z11 = (b10 & 2) == 2;
                    this.f7202R |= 1073741824;
                    if (!this.f7218d0) {
                        interfaceC4254q.readFully(this.f7229n.f(), 0, 8);
                        this.f7206V += 8;
                        this.f7218d0 = true;
                        this.f7224i.f()[0] = (byte) ((z11 ? 128 : 0) | 8);
                        this.f7224i.a0(0);
                        o10.e(this.f7224i, 1, 1);
                        this.f7207W++;
                        this.f7229n.a0(0);
                        o10.e(this.f7229n, 8, 1);
                        this.f7207W += 8;
                    }
                    if (z11) {
                        if (!this.f7212a0) {
                            interfaceC4254q.readFully(this.f7224i.f(), 0, 1);
                            this.f7206V++;
                            this.f7224i.a0(0);
                            this.f7214b0 = this.f7224i.L();
                            this.f7212a0 = true;
                        }
                        int i12 = this.f7214b0 * 4;
                        this.f7224i.W(i12);
                        interfaceC4254q.readFully(this.f7224i.f(), 0, i12);
                        this.f7206V += i12;
                        short s10 = (short) ((this.f7214b0 / 2) + 1);
                        int i13 = (s10 * 6) + 2;
                        ByteBuffer byteBuffer = this.f7232q;
                        if (byteBuffer == null || byteBuffer.capacity() < i13) {
                            this.f7232q = ByteBuffer.allocate(i13);
                        }
                        this.f7232q.position(0);
                        this.f7232q.putShort(s10);
                        int i14 = 0;
                        int i15 = 0;
                        while (true) {
                            i11 = this.f7214b0;
                            if (i14 >= i11) {
                                break;
                            }
                            int iP = this.f7224i.P();
                            if (i14 % 2 == 0) {
                                this.f7232q.putShort((short) (iP - i15));
                            } else {
                                this.f7232q.putInt(iP - i15);
                            }
                            i14++;
                            i15 = iP;
                        }
                        int i16 = (i10 - this.f7206V) - i15;
                        if (i11 % 2 == 1) {
                            this.f7232q.putInt(i16);
                        } else {
                            this.f7232q.putShort((short) i16);
                            this.f7232q.putInt(0);
                        }
                        this.f7230o.Y(this.f7232q.array(), i13);
                        o10.e(this.f7230o, i13, 1);
                        this.f7207W += i13;
                    }
                }
            } else {
                byte[] bArr = cVar.f7279j;
                if (bArr != null) {
                    this.f7227l.Y(bArr, bArr.length);
                }
            }
            if (cVar.o(z10)) {
                this.f7202R |= 268435456;
                this.f7231p.W(0);
                int iJ = (this.f7227l.j() + i10) - this.f7206V;
                this.f7224i.W(4);
                this.f7224i.f()[0] = (byte) ((iJ >> 24) & 255);
                this.f7224i.f()[1] = (byte) ((iJ >> 16) & 255);
                this.f7224i.f()[2] = (byte) ((iJ >> 8) & 255);
                this.f7224i.f()[3] = (byte) (iJ & 255);
                o10.e(this.f7224i, 4, 2);
                this.f7207W += 4;
            }
            this.f7209Y = true;
        }
        int iJ2 = i10 + this.f7227l.j();
        if (!"V_MPEG4/ISO/AVC".equals(cVar.f7272c) && !"V_MPEGH/ISO/HEVC".equals(cVar.f7272c)) {
            if (cVar.f7264V != null) {
                AbstractC1459a.g(this.f7227l.j() == 0);
                cVar.f7264V.d(interfaceC4254q);
            }
            while (true) {
                int i17 = this.f7206V;
                if (i17 >= iJ2) {
                    break;
                }
                int iL = L(interfaceC4254q, o10, iJ2 - i17);
                this.f7206V += iL;
                this.f7207W += iL;
            }
        } else {
            byte[] bArrF = this.f7223h.f();
            bArrF[0] = 0;
            bArrF[1] = 0;
            bArrF[2] = 0;
            int i18 = cVar.f7270a0;
            int i19 = 4 - i18;
            while (this.f7206V < iJ2) {
                int i20 = this.f7208X;
                if (i20 == 0) {
                    M(interfaceC4254q, bArrF, i19, i18);
                    this.f7206V += i18;
                    this.f7223h.a0(0);
                    this.f7208X = this.f7223h.P();
                    this.f7222g.a0(0);
                    o10.f(this.f7222g, 4);
                    this.f7207W += 4;
                } else {
                    int iL2 = L(interfaceC4254q, o10, i20);
                    this.f7206V += iL2;
                    this.f7207W += iL2;
                    this.f7208X -= iL2;
                }
            }
        }
        if ("A_VORBIS".equals(cVar.f7272c)) {
            this.f7225j.a0(0);
            o10.f(this.f7225j, 4);
            this.f7207W += 4;
        }
        return s();
    }

    private void K(InterfaceC4254q interfaceC4254q, byte[] bArr, int i10) {
        int length = bArr.length + i10;
        if (this.f7228m.b() < length) {
            this.f7228m.X(Arrays.copyOf(bArr, length + i10));
        } else {
            System.arraycopy(bArr, 0, this.f7228m.f(), 0, bArr.length);
        }
        interfaceC4254q.readFully(this.f7228m.f(), bArr.length, i10);
        this.f7228m.a0(0);
        this.f7228m.Z(length);
    }

    private int L(InterfaceC4254q interfaceC4254q, O o10, int i10) {
        int iA = this.f7227l.a();
        if (iA <= 0) {
            return o10.a(interfaceC4254q, i10, false);
        }
        int iMin = Math.min(i10, iA);
        o10.f(this.f7227l, iMin);
        return iMin;
    }

    private void M(InterfaceC4254q interfaceC4254q, byte[] bArr, int i10, int i11) {
        int iMin = Math.min(i11, this.f7227l.a());
        interfaceC4254q.readFully(bArr, i10 + iMin, i11 - iMin);
        if (iMin > 0) {
            this.f7227l.q(bArr, i10, iMin);
        }
    }

    public static /* synthetic */ InterfaceC4253p[] c() {
        return new InterfaceC4253p[]{new e(s.a.f11528a, 2)};
    }

    private void i(int i10) throws z {
        if (this.f7190F == null || this.f7191G == null) {
            throw z.a("Element " + i10 + " must be in a Cues", null);
        }
    }

    private void l(int i10) throws z {
        if (this.f7239x != null) {
            return;
        }
        throw z.a("Element " + i10 + " must be in a TrackEntry", null);
    }

    private void m() {
        AbstractC1459a.i(this.f7220e0);
    }

    private J o(U1.u uVar, U1.u uVar2) {
        int i10;
        if (this.f7234s == -1 || this.f7237v == -9223372036854775807L || uVar == null || uVar.d() == 0 || uVar2 == null || uVar2.d() != uVar.d()) {
            return new J.b(this.f7237v);
        }
        int iD = uVar.d();
        int[] iArrCopyOf = new int[iD];
        long[] jArrCopyOf = new long[iD];
        long[] jArrCopyOf2 = new long[iD];
        long[] jArrCopyOf3 = new long[iD];
        int i11 = 0;
        for (int i12 = 0; i12 < iD; i12++) {
            jArrCopyOf3[i12] = uVar.c(i12);
            jArrCopyOf[i12] = this.f7234s + uVar2.c(i12);
        }
        while (true) {
            i10 = iD - 1;
            if (i11 >= i10) {
                break;
            }
            int i13 = i11 + 1;
            iArrCopyOf[i11] = (int) (jArrCopyOf[i13] - jArrCopyOf[i11]);
            jArrCopyOf2[i11] = jArrCopyOf3[i13] - jArrCopyOf3[i11];
            i11 = i13;
        }
        int i14 = i10;
        while (i14 > 0 && jArrCopyOf3[i14] > this.f7237v) {
            i14--;
        }
        iArrCopyOf[i14] = (int) ((this.f7234s + this.f7233r) - jArrCopyOf[i14]);
        jArrCopyOf2[i14] = this.f7237v - jArrCopyOf3[i14];
        if (i14 < i10) {
            AbstractC1477t.h("MatroskaExtractor", "Discarding trailing cue points with timestamps greater than total duration");
            int i15 = i14 + 1;
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, i15);
            jArrCopyOf = Arrays.copyOf(jArrCopyOf, i15);
            jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i15);
            jArrCopyOf3 = Arrays.copyOf(jArrCopyOf3, i15);
        }
        return new C4244g(iArrCopyOf, jArrCopyOf, jArrCopyOf2, jArrCopyOf3);
    }

    private void p(c cVar, long j10, int i10, int i11, int i12) {
        int iJ;
        P p10 = cVar.f7264V;
        if (p10 != null) {
            p10.c(cVar.f7268Z, j10, i10, i11, i12, cVar.f7280k);
        } else {
            if ("S_TEXT/UTF8".equals(cVar.f7272c) || "S_TEXT/ASS".equals(cVar.f7272c) || "S_TEXT/SSA".equals(cVar.f7272c) || "S_TEXT/WEBVTT".equals(cVar.f7272c)) {
                if (this.f7198N > 1) {
                    AbstractC1477t.h("MatroskaExtractor", "Skipping subtitle sample in laced block.");
                } else {
                    long j11 = this.f7196L;
                    if (j11 == -9223372036854775807L) {
                        AbstractC1477t.h("MatroskaExtractor", "Skipping subtitle sample with no duration.");
                    } else {
                        G(cVar.f7272c, j11, this.f7228m.f());
                        for (int iG = this.f7228m.g(); iG < this.f7228m.j(); iG++) {
                            if (this.f7228m.f()[iG] == 0) {
                                this.f7228m.Z(iG);
                                break;
                            }
                        }
                        O o10 = cVar.f7268Z;
                        F f10 = this.f7228m;
                        o10.f(f10, f10.j());
                        iJ = i11 + this.f7228m.j();
                    }
                }
                iJ = i11;
            } else {
                iJ = i11;
            }
            if ((i10 & 268435456) != 0) {
                if (this.f7198N > 1) {
                    this.f7231p.W(0);
                } else {
                    int iJ2 = this.f7231p.j();
                    cVar.f7268Z.e(this.f7231p, iJ2, 2);
                    iJ += iJ2;
                }
            }
            cVar.f7268Z.c(j10, i10, iJ, i12, cVar.f7280k);
        }
        this.f7193I = true;
    }

    private static int[] r(int[] iArr, int i10) {
        if (iArr == null) {
            return new int[i10];
        }
        return iArr.length >= i10 ? iArr : new int[Math.max(iArr.length * 2, i10)];
    }

    private int s() {
        int i10 = this.f7207W;
        E();
        return i10;
    }

    private static byte[] u(long j10, String str, long j11) {
        AbstractC1459a.a(j10 != -9223372036854775807L);
        int i10 = (int) (j10 / 3600000000L);
        long j12 = j10 - (((long) i10) * 3600000000L);
        int i11 = (int) (j12 / 60000000);
        long j13 = j12 - (((long) i11) * 60000000);
        int i12 = (int) (j13 / 1000000);
        return S.u0(String.format(Locale.US, str, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf((int) ((j13 - (((long) i12) * 1000000)) / j11))));
    }

    protected boolean B(int i10) {
        return i10 == 357149030 || i10 == 524531317 || i10 == 475249515 || i10 == 374648427;
    }

    protected void H(int i10, long j10, long j11) throws z {
        m();
        if (i10 == 160) {
            this.f7204T = false;
            this.f7205U = 0L;
            return;
        }
        if (i10 == 174) {
            c cVar = new c();
            this.f7239x = cVar;
            cVar.f7269a = this.f7238w;
            return;
        }
        if (i10 == 187) {
            this.f7192H = false;
            return;
        }
        if (i10 == 19899) {
            this.f7241z = -1;
            this.f7185A = -1L;
            return;
        }
        if (i10 == 20533) {
            v(i10).f7278i = true;
            return;
        }
        if (i10 == 21968) {
            v(i10).f7295z = true;
            return;
        }
        if (i10 == 408125543) {
            long j12 = this.f7234s;
            if (j12 != -1 && j12 != j10) {
                throw z.a("Multiple Segment elements not supported", null);
            }
            this.f7234s = j10;
            this.f7233r = j11;
            return;
        }
        if (i10 == 475249515) {
            this.f7190F = new U1.u();
            this.f7191G = new U1.u();
        } else if (i10 == 524531317 && !this.f7240y) {
            if (this.f7217d && this.f7187C != -1) {
                this.f7186B = true;
            } else {
                this.f7220e0.p(new J.b(this.f7237v));
                this.f7240y = true;
            }
        }
    }

    protected void I(int i10, String str) throws z {
        if (i10 == 134) {
            v(i10).f7272c = str;
            return;
        }
        if (i10 != 17026) {
            if (i10 == 21358) {
                v(i10).f7271b = str;
                return;
            } else {
                if (i10 != 2274716) {
                    return;
                }
                v(i10).f7267Y = str;
                return;
            }
        }
        if ("webm".equals(str) || "matroska".equals(str)) {
            this.f7238w = Objects.equals(str, "webm");
            return;
        }
        throw z.a("DocType " + str + " not supported", null);
    }

    @Override // p380v2.InterfaceC4253p
    public void a(long j10, long j11) {
        this.f7189E = -9223372036854775807L;
        this.f7194J = 0;
        this.f7211a.reset();
        this.f7213b.e();
        E();
        for (int i10 = 0; i10 < this.f7215c.size(); i10++) {
            ((c) this.f7215c.valueAt(i10)).n();
        }
    }

    @Override // p380v2.InterfaceC4253p
    public final void b(r rVar) {
        if (this.f7219e) {
            rVar = new t(rVar, this.f7221f);
        }
        this.f7220e0 = rVar;
    }

    @Override // p380v2.InterfaceC4253p
    public final boolean f(InterfaceC4254q interfaceC4254q) {
        return new f().b(interfaceC4254q);
    }

    @Override // p380v2.InterfaceC4253p
    public final int j(InterfaceC4254q interfaceC4254q, I i10) {
        this.f7193I = false;
        boolean zA = true;
        while (zA && !this.f7193I) {
            zA = this.f7211a.a(interfaceC4254q);
            if (zA && C(i10, interfaceC4254q.getPosition())) {
                return 1;
            }
        }
        if (zA) {
            return 0;
        }
        for (int i11 = 0; i11 < this.f7215c.size(); i11++) {
            c cVar = (c) this.f7215c.valueAt(i11);
            cVar.f();
            cVar.j();
        }
        return -1;
    }

    /* JADX WARN: Code duplicated, block: B:105:0x0291  */
    /* JADX WARN: Multi-variable type inference failed */
    protected void n(int i10, int i11, InterfaceC4254q interfaceC4254q) throws z {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        long j10;
        int i17;
        int i18;
        int i19;
        int i20;
        InterfaceC4254q interfaceC4254q2 = interfaceC4254q;
        int i21 = 0;
        int i22 = 1;
        if (i10 != 161 && i10 != 163) {
            if (i10 == 165) {
                if (this.f7194J != 2) {
                    return;
                }
                y((c) this.f7215c.get(this.f7200P), this.f7203S, interfaceC4254q2, i11);
                return;
            }
            if (i10 == 16877) {
                x(v(i10), interfaceC4254q2, i11);
                return;
            }
            if (i10 == 16981) {
                l(i10);
                byte[] bArr = new byte[i11];
                this.f7239x.f7279j = bArr;
                interfaceC4254q2.readFully(bArr, 0, i11);
                return;
            }
            if (i10 == 18402) {
                byte[] bArr2 = new byte[i11];
                interfaceC4254q2.readFully(bArr2, 0, i11);
                v(i10).f7280k = new O.a(1, bArr2, 0, 0);
                return;
            }
            if (i10 == 21419) {
                Arrays.fill(this.f7226k.f(), (byte) 0);
                interfaceC4254q2.readFully(this.f7226k.f(), 4 - i11, i11);
                this.f7226k.a0(0);
                this.f7241z = (int) this.f7226k.N();
                return;
            }
            if (i10 == 25506) {
                l(i10);
                byte[] bArr3 = new byte[i11];
                this.f7239x.f7281l = bArr3;
                interfaceC4254q2.readFully(bArr3, 0, i11);
                return;
            }
            if (i10 != 30322) {
                throw z.a("Unexpected id: " + i10, null);
            }
            l(i10);
            byte[] bArr4 = new byte[i11];
            this.f7239x.f7293x = bArr4;
            interfaceC4254q2.readFully(bArr4, 0, i11);
            return;
        }
        int i23 = 8;
        if (this.f7194J == 0) {
            this.f7200P = (int) this.f7213b.d(interfaceC4254q2, false, true, 8);
            this.f7201Q = this.f7213b.b();
            this.f7196L = -9223372036854775807L;
            this.f7194J = 1;
            this.f7224i.W(0);
        }
        c cVar = (c) this.f7215c.get(this.f7200P);
        if (cVar == null) {
            interfaceC4254q2.l(i11 - this.f7201Q);
            this.f7194J = 0;
            return;
        }
        cVar.f();
        if (this.f7194J == 1) {
            D(interfaceC4254q2, 3);
            int i24 = (this.f7224i.f()[2] & 6) >> 1;
            if (i24 == 0) {
                this.f7198N = 1;
                int[] iArrR = r(this.f7199O, 1);
                this.f7199O = iArrR;
                iArrR[0] = (i11 - this.f7201Q) - 3;
            } else {
                D(interfaceC4254q2, 4);
                int i25 = (this.f7224i.f()[3] & 255) + 1;
                this.f7198N = i25;
                int[] iArrR2 = r(this.f7199O, i25);
                this.f7199O = iArrR2;
                if (i24 == 2) {
                    int i26 = (i11 - this.f7201Q) - 4;
                    int i27 = this.f7198N;
                    Arrays.fill(iArrR2, 0, i27, i26 / i27);
                } else {
                    if (i24 == 1) {
                        int i28 = 0;
                        int i29 = 0;
                        int i30 = 4;
                        while (true) {
                            i17 = this.f7198N;
                            if (i28 >= i17 - 1) {
                                break;
                            }
                            this.f7199O[i28] = 0;
                            while (true) {
                                i18 = i30 + 1;
                                D(interfaceC4254q2, i18);
                                int i31 = this.f7224i.f()[i30] & 255;
                                int[] iArr = this.f7199O;
                                i19 = iArr[i28] + i31;
                                iArr[i28] = i19;
                                if (i31 != 255) {
                                    break;
                                } else {
                                    i30 = i18;
                                }
                            }
                            i29 += i19;
                            i28++;
                            i30 = i18;
                        }
                        this.f7199O[i17 - 1] = ((i11 - this.f7201Q) - i30) - i29;
                    } else {
                        if (i24 != 3) {
                            throw z.a("Unexpected lacing value: " + i24, null);
                        }
                        int i32 = 0;
                        int i33 = 0;
                        int i34 = 4;
                        while (true) {
                            int i35 = this.f7198N;
                            i12 = i22;
                            if (i32 >= i35 - 1) {
                                i13 = i21;
                                this.f7199O[i35 - 1] = ((i11 - this.f7201Q) - i34) - i33;
                                break;
                            }
                            this.f7199O[i32] = i21;
                            int i36 = i34 + 1;
                            D(interfaceC4254q2, i36);
                            if (this.f7224i.f()[i34] == 0) {
                                throw z.a("No valid varint length mask found", null);
                            }
                            int i37 = i21;
                            while (true) {
                                if (i37 >= i23) {
                                    i14 = i21;
                                    i15 = i23;
                                    i16 = i32;
                                    j10 = 0;
                                    break;
                                }
                                i15 = i23;
                                int i38 = i12 << (7 - i37);
                                i14 = i21;
                                if ((this.f7224i.f()[i34] & i38) != 0) {
                                    i36 += i37;
                                    D(interfaceC4254q2, i36);
                                    int i39 = i34 + 1;
                                    j10 = this.f7224i.f()[i34] & 255 & (~i38);
                                    while (true) {
                                        int i40 = i39;
                                        if (i40 >= i36) {
                                            break;
                                        }
                                        i39 = i40 + 1;
                                        j10 = (j10 << i15) | ((long) (this.f7224i.f()[i40] & 255));
                                        i32 = i32;
                                    }
                                    i16 = i32;
                                    if (i16 <= 0) {
                                        break;
                                    }
                                    j10 -= (1 << ((i37 * 7) + 6)) - 1;
                                    break;
                                }
                                i37++;
                                interfaceC4254q2 = interfaceC4254q;
                                i21 = i14;
                                i23 = i15;
                            }
                            i34 = i36;
                            if (j10 < -2147483648L || j10 > 2147483647L) {
                                throw z.a("EBML lacing sample size out of range.", null);
                            }
                            int i41 = (int) j10;
                            int[] iArr2 = this.f7199O;
                            if (i16 != 0) {
                                i41 += iArr2[i16 - 1];
                            }
                            iArr2[i16] = i41;
                            i33 += i41;
                            i32 = i16 + 1;
                            interfaceC4254q2 = interfaceC4254q;
                            i22 = i12;
                            i21 = i14;
                            i23 = i15;
                        }
                    }
                    this.f7195K = this.f7189E + F((this.f7224i.f()[i13] << 8) | (this.f7224i.f()[i12] & 255));
                    if (cVar.f7274e != 2 || (i10 == 163 && (this.f7224i.f()[2] & 128) == 128)) {
                        i20 = i12;
                    } else {
                        i20 = i13;
                    }
                    this.f7202R = i20;
                    this.f7194J = 2;
                    this.f7197M = i13;
                }
            }
            i13 = 0;
            i12 = 1;
            this.f7195K = this.f7189E + F((this.f7224i.f()[i13] << 8) | (this.f7224i.f()[i12] & 255));
            if (cVar.f7274e != 2) {
                i20 = i12;
            } else {
                i20 = i12;
            }
            this.f7202R = i20;
            this.f7194J = 2;
            this.f7197M = i13;
        } else {
            i12 = 1;
        }
        if (i10 == 163) {
            while (true) {
                int i42 = this.f7197M;
                if (i42 >= this.f7198N) {
                    this.f7194J = 0;
                    return;
                }
                int iJ = J(interfaceC4254q, cVar, this.f7199O[i42], false);
                c cVar2 = cVar;
                p(cVar2, this.f7195K + ((long) ((this.f7197M * cVar.f7275f) / 1000)), this.f7202R, iJ, 0);
                this.f7197M++;
                cVar = cVar2;
            }
        } else {
            while (true) {
                int i43 = this.f7197M;
                if (i43 >= this.f7198N) {
                    return;
                }
                int[] iArr3 = this.f7199O;
                boolean z10 = i12;
                iArr3[i43] = J(interfaceC4254q, cVar, iArr3[i43], z10);
                this.f7197M += z10 ? 1 : 0;
            }
        }
    }

    protected void q(int i10) throws z {
        m();
        if (i10 == 160) {
            if (this.f7194J != 2) {
                return;
            }
            c cVar = (c) this.f7215c.get(this.f7200P);
            cVar.f();
            if (this.f7205U > 0 && "A_OPUS".equals(cVar.f7272c)) {
                this.f7231p.X(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.f7205U).array());
            }
            int i11 = 0;
            for (int i12 = 0; i12 < this.f7198N; i12++) {
                i11 += this.f7199O[i12];
            }
            int i13 = 0;
            while (i13 < this.f7198N) {
                long j10 = this.f7195K + ((long) ((cVar.f7275f * i13) / 1000));
                int i14 = this.f7202R;
                if (i13 == 0 && !this.f7204T) {
                    i14 |= 1;
                }
                int i15 = this.f7199O[i13];
                int i16 = i11 - i15;
                p(cVar, j10, i14, i15, i16);
                i13++;
                i11 = i16;
            }
            this.f7194J = 0;
            return;
        }
        if (i10 == 174) {
            c cVar2 = (c) AbstractC1459a.i(this.f7239x);
            String str = cVar2.f7272c;
            if (str == null) {
                throw z.a("CodecId is missing in TrackEntry element", null);
            }
            if (A(str)) {
                cVar2.i(this.f7220e0, cVar2.f7273d);
                this.f7215c.put(cVar2.f7273d, cVar2);
            }
            this.f7239x = null;
            return;
        }
        if (i10 == 19899) {
            int i17 = this.f7241z;
            if (i17 != -1) {
                long j11 = this.f7185A;
                if (j11 != -1) {
                    if (i17 == 475249515) {
                        this.f7187C = j11;
                        return;
                    }
                    return;
                }
            }
            throw z.a("Mandatory element SeekID or SeekPosition not found", null);
        }
        if (i10 == 25152) {
            l(i10);
            c cVar3 = this.f7239x;
            if (cVar3.f7278i) {
                if (cVar3.f7280k == null) {
                    throw z.a("Encrypted Track found but ContentEncKeyID was not found", null);
                }
                cVar3.f7282m = new n(new n.b(AbstractC1348h.f10156a, "video/webm", this.f7239x.f7280k.f55987b));
                return;
            }
            return;
        }
        if (i10 == 28032) {
            l(i10);
            c cVar4 = this.f7239x;
            if (cVar4.f7278i && cVar4.f7279j != null) {
                throw z.a("Combining encryption and compression is not supported", null);
            }
            return;
        }
        if (i10 == 357149030) {
            if (this.f7235t == -9223372036854775807L) {
                this.f7235t = 1000000L;
            }
            long j12 = this.f7236u;
            if (j12 != -9223372036854775807L) {
                this.f7237v = F(j12);
                return;
            }
            return;
        }
        if (i10 == 374648427) {
            if (this.f7215c.size() == 0) {
                throw z.a("No valid tracks were found", null);
            }
            this.f7220e0.t();
        } else {
            if (i10 != 475249515) {
                return;
            }
            if (!this.f7240y) {
                this.f7220e0.p(o(this.f7190F, this.f7191G));
                this.f7240y = true;
            }
            this.f7190F = null;
            this.f7191G = null;
        }
    }

    @Override // p380v2.InterfaceC4253p
    public final void release() {
    }

    protected void t(int i10, double d10) {
        if (i10 == 181) {
            v(i10).f7261S = (int) d10;
            return;
        }
        if (i10 == 17545) {
            this.f7236u = (long) d10;
            return;
        }
        switch (i10) {
            case 21969:
                v(i10).f7248F = (float) d10;
                break;
            case 21970:
                v(i10).f7249G = (float) d10;
                break;
            case 21971:
                v(i10).f7250H = (float) d10;
                break;
            case 21972:
                v(i10).f7251I = (float) d10;
                break;
            case 21973:
                v(i10).f7252J = (float) d10;
                break;
            case 21974:
                v(i10).f7253K = (float) d10;
                break;
            case 21975:
                v(i10).f7254L = (float) d10;
                break;
            case 21976:
                v(i10).f7255M = (float) d10;
                break;
            case 21977:
                v(i10).f7256N = (float) d10;
                break;
            case 21978:
                v(i10).f7257O = (float) d10;
                break;
            default:
                switch (i10) {
                    case 30323:
                        v(i10).f7290u = (float) d10;
                        break;
                    case 30324:
                        v(i10).f7291v = (float) d10;
                        break;
                    case 30325:
                        v(i10).f7292w = (float) d10;
                        break;
                }
                break;
        }
    }

    protected c v(int i10) throws z {
        l(i10);
        return this.f7239x;
    }

    protected int w(int i10) {
        switch (i10) {
            case 131:
            case 136:
            case 155:
            case 159:
            case 176:
            case 179:
            case 186:
            case 215:
            case 231:
            case 238:
            case 241:
            case 251:
            case 16871:
            case 16980:
            case 17029:
            case 17143:
            case 18401:
            case 18408:
            case 20529:
            case 20530:
            case 21420:
            case 21432:
            case 21680:
            case 21682:
            case 21690:
            case 21930:
            case 21938:
            case 21945:
            case 21946:
            case 21947:
            case 21948:
            case 21949:
            case 21998:
            case 22186:
            case 22203:
            case 25188:
            case 30114:
            case 30321:
            case 2352003:
            case 2807729:
                return 2;
            case 134:
            case 17026:
            case 21358:
            case 2274716:
                return 3;
            case 160:
            case 166:
            case 174:
            case 183:
            case 187:
            case 224:
            case 225:
            case 16868:
            case 18407:
            case 19899:
            case 20532:
            case 20533:
            case 21936:
            case 21968:
            case 25152:
            case 28032:
            case 30113:
            case 30320:
            case 290298740:
            case 357149030:
            case 374648427:
            case 408125543:
            case 440786851:
            case 475249515:
            case 524531317:
                return 1;
            case 161:
            case 163:
            case 165:
            case 16877:
            case 16981:
            case 18402:
            case 21419:
            case 25506:
            case 30322:
                return 4;
            case 181:
            case 17545:
            case 21969:
            case 21970:
            case 21971:
            case 21972:
            case 21973:
            case 21974:
            case 21975:
            case 21976:
            case 21977:
            case 21978:
            case 30323:
            case 30324:
            case 30325:
                return 5;
            default:
                return 0;
        }
    }

    protected void x(c cVar, InterfaceC4254q interfaceC4254q, int i10) {
        if (cVar.f7277h != 1685485123 && cVar.f7277h != 1685480259) {
            interfaceC4254q.l(i10);
            return;
        }
        byte[] bArr = new byte[i10];
        cVar.f7258P = bArr;
        interfaceC4254q.readFully(bArr, 0, i10);
    }

    protected void y(c cVar, int i10, InterfaceC4254q interfaceC4254q, int i11) {
        if (i10 != 4 || !"V_VP9".equals(cVar.f7272c)) {
            interfaceC4254q.l(i11);
        } else {
            this.f7231p.W(i11);
            interfaceC4254q.readFully(this.f7231p.f(), 0, i11);
        }
    }

    protected void z(int i10, long j10) throws z {
        if (i10 == 20529) {
            if (j10 == 0) {
                return;
            }
            throw z.a("ContentEncodingOrder " + j10 + " not supported", null);
        }
        if (i10 == 20530) {
            if (j10 == 1) {
                return;
            }
            throw z.a("ContentEncodingScope " + j10 + " not supported", null);
        }
        switch (i10) {
            case 131:
                v(i10).f7274e = (int) j10;
                return;
            case 136:
                v(i10).f7266X = j10 == 1;
                return;
            case 155:
                this.f7196L = F(j10);
                return;
            case 159:
                v(i10).f7259Q = (int) j10;
                return;
            case 176:
                v(i10).f7283n = (int) j10;
                return;
            case 179:
                i(i10);
                this.f7190F.a(F(j10));
                return;
            case 186:
                v(i10).f7284o = (int) j10;
                return;
            case 215:
                v(i10).f7273d = (int) j10;
                return;
            case 231:
                this.f7189E = F(j10);
                return;
            case 238:
                this.f7203S = (int) j10;
                return;
            case 241:
                if (this.f7192H) {
                    return;
                }
                i(i10);
                this.f7191G.a(j10);
                this.f7192H = true;
                return;
            case 251:
                this.f7204T = true;
                return;
            case 16871:
                v(i10).f7277h = (int) j10;
                return;
            case 16980:
                if (j10 == 3) {
                    return;
                }
                throw z.a("ContentCompAlgo " + j10 + " not supported", null);
            case 17029:
                if (j10 < 1 || j10 > 2) {
                    throw z.a("DocTypeReadVersion " + j10 + " not supported", null);
                }
                return;
            case 17143:
                if (j10 == 1) {
                    return;
                }
                throw z.a("EBMLReadVersion " + j10 + " not supported", null);
            case 18401:
                if (j10 == 5) {
                    return;
                }
                throw z.a("ContentEncAlgo " + j10 + " not supported", null);
            case 18408:
                if (j10 == 1) {
                    return;
                }
                throw z.a("AESSettingsCipherMode " + j10 + " not supported", null);
            case 21420:
                this.f7185A = j10 + this.f7234s;
                return;
            case 21432:
                int i11 = (int) j10;
                l(i10);
                if (i11 == 0) {
                    this.f7239x.f7294y = 0;
                    return;
                }
                if (i11 == 1) {
                    this.f7239x.f7294y = 2;
                    return;
                } else if (i11 == 3) {
                    this.f7239x.f7294y = 1;
                    return;
                } else {
                    if (i11 != 15) {
                        return;
                    }
                    this.f7239x.f7294y = 3;
                    return;
                }
            case 21680:
                v(i10).f7286q = (int) j10;
                return;
            case 21682:
                v(i10).f7288s = (int) j10;
                return;
            case 21690:
                v(i10).f7287r = (int) j10;
                return;
            case 21930:
                v(i10).f7265W = j10 == 1;
                return;
            case 21938:
                l(i10);
                c cVar = this.f7239x;
                cVar.f7295z = true;
                cVar.f7285p = (int) j10;
                return;
            case 21998:
                v(i10).f7276g = (int) j10;
                return;
            case 22186:
                v(i10).f7262T = j10;
                return;
            case 22203:
                v(i10).f7263U = j10;
                return;
            case 25188:
                v(i10).f7260R = (int) j10;
                return;
            case 30114:
                this.f7205U = j10;
                return;
            case 30321:
                l(i10);
                int i12 = (int) j10;
                if (i12 == 0) {
                    this.f7239x.f7289t = 0;
                    return;
                }
                if (i12 == 1) {
                    this.f7239x.f7289t = 1;
                    return;
                } else if (i12 == 2) {
                    this.f7239x.f7289t = 2;
                    return;
                } else {
                    if (i12 != 3) {
                        return;
                    }
                    this.f7239x.f7289t = 3;
                    return;
                }
            case 2352003:
                v(i10).f7275f = (int) j10;
                return;
            case 2807729:
                this.f7235t = j10;
                return;
            default:
                switch (i10) {
                    case 21945:
                        l(i10);
                        int i13 = (int) j10;
                        if (i13 == 1) {
                            this.f7239x.f7245C = 2;
                            return;
                        } else {
                            if (i13 != 2) {
                                return;
                            }
                            this.f7239x.f7245C = 1;
                            return;
                        }
                    case 21946:
                        l(i10);
                        int iK = C1349i.k((int) j10);
                        if (iK != -1) {
                            this.f7239x.f7244B = iK;
                            return;
                        }
                        return;
                    case 21947:
                        l(i10);
                        this.f7239x.f7295z = true;
                        int iJ = C1349i.j((int) j10);
                        if (iJ != -1) {
                            this.f7239x.f7243A = iJ;
                            return;
                        }
                        return;
                    case 21948:
                        v(i10).f7246D = (int) j10;
                        return;
                    case 21949:
                        v(i10).f7247E = (int) j10;
                        return;
                    default:
                        return;
                }
        }
    }
}
