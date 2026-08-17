package p234n0;

import Ad.n;
import kotlin.collections.AbstractC3952n;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.e;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f49442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f49443b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f49444c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p234n0.a[] f49445d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f49446e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final float[] f49447f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final float[] f49448g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final float[] f49449h;

    public enum a {
        Lsq2,
        Impulse;


        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f49453d = Gd.a.a(e());
    }

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f49454a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.Impulse.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.Lsq2.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f49454a = iArr;
        }
    }

    public c(boolean z10, a aVar) {
        this.f49442a = z10;
        this.f49443b = aVar;
        if (z10 && aVar.equals(a.Lsq2)) {
            throw new IllegalStateException("Lsq2 not (yet) supported for differential axes");
        }
        int i10 = b.f49454a[aVar.ordinal()];
        int i11 = 2;
        if (i10 != 1) {
            if (i10 != 2) {
                throw new n();
            }
            i11 = 3;
        }
        this.f49444c = i11;
        this.f49445d = new p234n0.a[20];
        this.f49447f = new float[20];
        this.f49448g = new float[20];
        this.f49449h = new float[3];
    }

    public /* synthetic */ c(boolean z10, a aVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? a.Lsq2 : aVar);
    }

    private final float b(float[] fArr, float[] fArr2, int i10) {
        try {
            return e.j(fArr2, fArr, i10, 2, this.f49449h)[1];
        } catch (IllegalArgumentException unused) {
            return 0.0f;
        }
    }

    public final void a(long j10, float f10) {
        int i10 = (this.f49446e + 1) % 20;
        this.f49446e = i10;
        e.k(this.f49445d, i10, j10, f10);
    }

    public final float c() {
        float fG;
        float[] fArr = this.f49447f;
        float[] fArr2 = this.f49448g;
        int i10 = this.f49446e;
        p234n0.a aVar = this.f49445d[i10];
        if (aVar == null) {
            return 0.0f;
        }
        int i11 = 0;
        p234n0.a aVar2 = aVar;
        while (true) {
            p234n0.a aVar3 = this.f49445d[i10];
            if (aVar3 == null) {
                break;
            }
            float fB = aVar.b() - aVar3.b();
            float fAbs = Math.abs(aVar3.b() - aVar2.b());
            p234n0.a aVar4 = (this.f49443b == a.Lsq2 || this.f49442a) ? aVar3 : aVar;
            if (fB > 100.0f || fAbs > 40.0f) {
                break;
            }
            fArr[i11] = aVar3.a();
            fArr2[i11] = -fB;
            if (i10 == 0) {
                i10 = 20;
            }
            i10--;
            i11++;
            if (i11 >= 20) {
                break;
            }
            aVar2 = aVar4;
        }
        if (i11 < this.f49444c) {
            return 0.0f;
        }
        int i12 = b.f49454a[this.f49443b.ordinal()];
        if (i12 == 1) {
            fG = e.g(fArr, fArr2, i11, this.f49442a);
        } else {
            if (i12 != 2) {
                throw new n();
            }
            fG = b(fArr, fArr2, i11);
        }
        return fG * 1000;
    }

    public final float d(float f10) {
        if (!(f10 > 0.0f)) {
            p270p0.a.b("maximumVelocity should be a positive value. You specified=" + f10);
        }
        float fC = c();
        if (fC == 0.0f || Float.isNaN(fC)) {
            return 0.0f;
        }
        return fC > 0.0f ? e.h(fC, f10) : e.d(fC, -f10);
    }

    public final void e() {
        AbstractC3952n.y(this.f49445d, null, 0, 0, 6, null);
        this.f49446e = 0;
    }
}
