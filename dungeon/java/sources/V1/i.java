package V1;

import U1.AbstractC1459a;
import U1.E;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class i {

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f14002a;

        private b(e eVar, d dVar) throws c {
            int i10 = dVar.f14003a;
            AbstractC1459a.a(i10 == 6 || i10 == 3);
            byte[] bArr = new byte[Math.min(4, dVar.f14004b.remaining())];
            dVar.f14004b.asReadOnlyBuffer().get(bArr);
            E e10 = new E(bArr);
            i.f(eVar.f14005a);
            if (e10.g()) {
                this.f14002a = false;
                return;
            }
            int iH = e10.h(2);
            boolean zG = e10.g();
            i.f(eVar.f14006b);
            if (!zG) {
                this.f14002a = true;
                return;
            }
            boolean zG2 = (iH == 3 || iH == 0) ? true : e10.g();
            e10.q();
            i.f(!eVar.f14008d);
            if (e10.g()) {
                i.f(!eVar.f14009e);
                e10.q();
            }
            i.f(eVar.f14007c);
            if (iH != 3) {
                e10.q();
            }
            e10.r(eVar.f14010f);
            if (iH != 2 && iH != 0 && !zG2) {
                e10.r(3);
            }
            this.f14002a = ((iH == 3 || iH == 0) ? 255 : e10.h(8)) != 0;
        }

        public static b b(e eVar, d dVar) {
            try {
                return new b(eVar, dVar);
            } catch (c unused) {
                return null;
            }
        }

        public boolean a() {
            return this.f14002a;
        }
    }

    private static class c extends Exception {
        private c() {
        }

        /* synthetic */ c(a aVar) {
            this();
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f14003a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ByteBuffer f14004b;

        private d(int i10, ByteBuffer byteBuffer) {
            this.f14003a = i10;
            this.f14004b = byteBuffer;
        }

        /* synthetic */ d(int i10, ByteBuffer byteBuffer, a aVar) {
            this(i10, byteBuffer);
        }
    }

    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f14005a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f14006b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f14007c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f14008d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f14009e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f14010f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f14011g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f14012h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final int f14013i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final boolean f14014j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final int f14015k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final boolean f14016l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final boolean f14017m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final boolean f14018n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final boolean f14019o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final boolean f14020p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final int f14021q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public final byte f14022r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final byte f14023s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final byte f14024t;

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r8v4, types: [int] */
        /* JADX WARN: Type inference failed for: r8v5 */
        /* JADX WARN: Type inference failed for: r8v6 */
        private e(d dVar) {
            int iH;
            int iH2;
            boolean zG;
            ?? r10;
            AbstractC1459a.a(dVar.f14003a == 1);
            byte[] bArr = new byte[dVar.f14004b.remaining()];
            dVar.f14004b.asReadOnlyBuffer().get(bArr);
            E e10 = new E(bArr);
            this.f14011g = e10.h(3);
            e10.q();
            boolean zG2 = e10.g();
            this.f14005a = zG2;
            if (zG2) {
                iH2 = e10.h(5);
                this.f14006b = false;
                this.f14014j = false;
                r10 = 0;
                iH = 0;
            } else {
                if (e10.g()) {
                    b(e10);
                    boolean zG3 = e10.g();
                    this.f14006b = zG3;
                    if (zG3) {
                        e10.r(47);
                    }
                } else {
                    this.f14006b = false;
                }
                this.f14014j = e10.g();
                int iH3 = e10.h(5);
                int iH4 = 0;
                int i10 = 0;
                boolean z10 = false;
                iH = 0;
                while (i10 <= iH3) {
                    e10.r(12);
                    if (i10 == 0) {
                        iH4 = e10.h(5);
                        if (iH4 > 7) {
                            zG = z10;
                            zG = e10.g();
                        }
                    } else if (e10.h(5) > 7) {
                        zG = z10;
                        e10.q();
                        zG = z10;
                    }
                    zG = z10;
                    zG = z10;
                    if (this.f14006b) {
                        e10.q();
                    }
                    if (this.f14014j && e10.g()) {
                        if (i10 == 0) {
                            iH = e10.h(4);
                        } else {
                            e10.r(4);
                        }
                    }
                    i10++;
                    z10 = zG;
                }
                iH2 = iH4;
                r10 = z10;
            }
            int iH5 = e10.h(4);
            int iH6 = e10.h(4);
            e10.r(iH5 + 1);
            e10.r(iH6 + 1);
            if (this.f14005a) {
                this.f14007c = false;
            } else {
                this.f14007c = e10.g();
            }
            if (this.f14007c) {
                e10.r(4);
                e10.r(3);
            }
            e10.r(3);
            if (this.f14005a) {
                this.f14009e = true;
                this.f14008d = true;
                this.f14010f = 0;
            } else {
                e10.r(4);
                boolean zG4 = e10.g();
                if (zG4) {
                    e10.r(2);
                }
                if (e10.g()) {
                    this.f14008d = true;
                } else {
                    this.f14008d = e10.g();
                }
                if (!this.f14008d || e10.g()) {
                    this.f14009e = true;
                } else {
                    this.f14009e = e10.g();
                }
                if (zG4) {
                    this.f14010f = e10.h(3) + 1;
                } else {
                    this.f14010f = 0;
                }
            }
            this.f14012h = iH2;
            this.f14013i = r10;
            this.f14015k = iH;
            e10.r(3);
            boolean zG5 = e10.g();
            this.f14016l = zG5;
            if (this.f14011g == 2 && zG5) {
                this.f14017m = e10.g();
            } else {
                this.f14017m = false;
            }
            if (this.f14011g != 1) {
                this.f14018n = e10.g();
            } else {
                this.f14018n = false;
            }
            if (e10.g()) {
                this.f14022r = (byte) e10.h(8);
                this.f14023s = (byte) e10.h(8);
                this.f14024t = (byte) e10.h(8);
            } else {
                this.f14022r = (byte) 0;
                this.f14023s = (byte) 0;
                this.f14024t = (byte) 0;
            }
            if (this.f14018n) {
                e10.q();
                this.f14019o = false;
                this.f14020p = false;
                this.f14021q = 0;
            } else if (this.f14022r == 1 && this.f14023s == 13 && this.f14024t == 0) {
                this.f14019o = false;
                this.f14020p = false;
                this.f14021q = 0;
            } else {
                e10.q();
                int i11 = this.f14011g;
                if (i11 == 0) {
                    this.f14019o = true;
                    this.f14020p = true;
                } else if (i11 == 1) {
                    this.f14019o = false;
                    this.f14020p = false;
                } else if (this.f14017m) {
                    boolean zG6 = e10.g();
                    this.f14019o = zG6;
                    if (zG6) {
                        this.f14020p = e10.g();
                    } else {
                        this.f14020p = false;
                    }
                } else {
                    this.f14019o = true;
                    this.f14020p = false;
                }
                if (this.f14019o && this.f14020p) {
                    this.f14021q = e10.h(2);
                } else {
                    this.f14021q = 0;
                }
            }
            e10.q();
        }

        public static e a(d dVar) {
            try {
                return new e(dVar);
            } catch (c unused) {
                return null;
            }
        }

        private static void b(E e10) {
            e10.r(64);
            if (e10.g()) {
                i.d(e10);
            }
        }
    }

    private static int c(ByteBuffer byteBuffer) {
        int i10 = 0;
        for (int i11 = 0; i11 < 8; i11++) {
            byte b10 = byteBuffer.get();
            i10 |= (b10 & 127) << (i11 * 7);
            if ((b10 & 128) == 0) {
                return i10;
            }
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(E e10) {
        int i10 = 0;
        while (!e10.g()) {
            i10++;
        }
        if (i10 < 32) {
            e10.r(i10);
        }
    }

    public static List e(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        ArrayList arrayList = new ArrayList();
        while (byteBufferAsReadOnlyBuffer.hasRemaining()) {
            byte b10 = byteBufferAsReadOnlyBuffer.get();
            int i10 = (b10 >> 3) & 15;
            if (((b10 >> 2) & 1) != 0) {
                byteBufferAsReadOnlyBuffer.get();
            }
            int iC = ((b10 >> 1) & 1) != 0 ? c(byteBufferAsReadOnlyBuffer) : byteBufferAsReadOnlyBuffer.remaining();
            ByteBuffer byteBufferDuplicate = byteBufferAsReadOnlyBuffer.duplicate();
            byteBufferDuplicate.limit(byteBufferAsReadOnlyBuffer.position() + iC);
            arrayList.add(new d(i10, byteBufferDuplicate, null));
            byteBufferAsReadOnlyBuffer.position(byteBufferAsReadOnlyBuffer.position() + iC);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void f(boolean z10) throws c {
        if (z10) {
            throw new c(null);
        }
    }
}
