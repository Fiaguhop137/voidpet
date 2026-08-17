package p147i2;

import R1.C1349i;
import R1.r;
import R1.y;
import U1.AbstractC1459a;
import U1.AbstractC1477t;
import U1.S;
import Z1.C1697k;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.os.Build;
import android.util.Pair;
import android.util.Range;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f43724a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f43725b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f43726c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final MediaCodecInfo.CodecCapabilities f43727d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f43728e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f43729f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f43730g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f43731h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f43732i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f43733j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f43734k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f43735l;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float f43738o = -3.4028235E38f;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f43736m = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f43737n = -1;

    t(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16) {
        this.f43724a = (String) AbstractC1459a.e(str);
        this.f43725b = str2;
        this.f43726c = str3;
        this.f43727d = codecCapabilities;
        this.f43731h = z10;
        this.f43732i = z11;
        this.f43733j = z12;
        this.f43728e = z13;
        this.f43729f = z14;
        this.f43730g = z15;
        this.f43734k = z16;
        this.f43735l = y.t(str2);
    }

    private static boolean A() {
        String str = Build.MANUFACTURER;
        return str.equals("Xiaomi") || str.equals("OPPO") || str.equals("realme") || str.equals("motorola") || str.equals("LENOVO");
    }

    private static boolean B(String str) {
        return false;
    }

    private static boolean C(String str, int i10) {
        if (!"video/hevc".equals(str) || 2 != i10) {
            return false;
        }
        String str2 = Build.DEVICE;
        return "sailfish".equals(str2) || "marlin".equals(str2);
    }

    private static boolean D(String str) {
        return ("OMX.MTK.VIDEO.DECODER.HEVC".equals(str) && "mcv5a".equals(Build.DEVICE)) ? false : true;
    }

    public static t E(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        return new t(str, str2, str3, codecCapabilities, z10, z11, z12, (z13 || codecCapabilities == null || !i(codecCapabilities) || B(str)) ? false : true, codecCapabilities != null && u(codecCapabilities), z14 || (codecCapabilities != null && t(codecCapabilities)), n(codecCapabilities));
    }

    private static int a(String str, String str2, int i10) {
        int i11;
        if (i10 > 1 || ((Build.VERSION.SDK_INT >= 26 && i10 > 0) || "audio/mpeg".equals(str2) || "audio/3gpp".equals(str2) || "audio/amr-wb".equals(str2) || "audio/mp4a-latm".equals(str2) || "audio/vorbis".equals(str2) || "audio/opus".equals(str2) || "audio/raw".equals(str2) || "audio/flac".equals(str2) || "audio/g711-alaw".equals(str2) || "audio/g711-mlaw".equals(str2) || "audio/gsm".equals(str2))) {
            return i10;
        }
        if ("audio/ac3".equals(str2)) {
            i11 = 6;
        } else {
            i11 = "audio/eac3".equals(str2) ? 16 : 30;
        }
        AbstractC1477t.h("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + str + ", [" + i10 + " to " + i11 + "]");
        return i11;
    }

    private static Point b(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        return new Point(S.k(i10, widthAlignment) * widthAlignment, S.k(i11, heightAlignment) * heightAlignment);
    }

    private static boolean d(MediaCodecInfo.VideoCapabilities videoCapabilities, int i10, int i11, double d10) {
        Point pointB = b(videoCapabilities, i10, i11);
        int i12 = pointB.x;
        int i13 = pointB.y;
        if (d10 == -1.0d || d10 < 1.0d) {
            return videoCapabilities.isSizeSupported(i12, i13);
        }
        double dFloor = Math.floor(d10);
        if (!videoCapabilities.areSizeAndRateSupported(i12, i13, dFloor)) {
            return false;
        }
        Range<Double> achievableFrameRatesFor = videoCapabilities.getAchievableFrameRatesFor(i12, i13);
        return achievableFrameRatesFor == null || dFloor <= ((Double) achievableFrameRatesFor.getUpper()).doubleValue();
    }

    private float f(int i10, int i11) {
        float f10 = 1024.0f;
        if (v(i10, i11, 1024.0f)) {
            return 1024.0f;
        }
        float f11 = 0.0f;
        while (true) {
            float f12 = f10 - f11;
            if (Math.abs(f12) <= 5.0f) {
                return f11;
            }
            float f13 = (f12 / 2.0f) + f11;
            if (v(i10, i11, f13)) {
                f11 = f13;
            } else {
                f10 = f13;
            }
        }
    }

    private static boolean i(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("adaptive-playback");
    }

    private boolean l(r rVar, boolean z10) {
        Pair pairI = N.i(rVar);
        String str = rVar.f10277o;
        if (str != null && str.equals("video/mv-hevc")) {
            String strU = y.u(this.f43726c);
            if (strU.equals("video/mv-hevc")) {
                return true;
            }
            if (strU.equals("video/hevc")) {
                pairI = N.q(rVar);
            }
        }
        if (pairI == null) {
            return true;
        }
        int iIntValue = ((Integer) pairI.first).intValue();
        int iIntValue2 = ((Integer) pairI.second).intValue();
        if ("video/dolby-vision".equals(rVar.f10277o)) {
            String str2 = this.f43725b;
            str2.getClass();
            switch (str2) {
                case "video/av01":
                case "video/hevc":
                    iIntValue2 = 0;
                    iIntValue = 2;
                    break;
                case "video/avc":
                    iIntValue = 8;
                    iIntValue2 = 0;
                    break;
            }
        }
        if (!this.f43735l && iIntValue != 42) {
            return true;
        }
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : h()) {
            if (codecProfileLevel.profile == iIntValue && ((codecProfileLevel.level >= iIntValue2 || !z10) && !C(this.f43725b, iIntValue))) {
                return true;
            }
        }
        x("codec.profileLevel, " + rVar.f10273k + ", " + this.f43726c);
        return false;
    }

    private boolean m(r rVar) {
        return (Objects.equals(rVar.f10277o, "audio/flac") && rVar.f10254I == 22 && Build.VERSION.SDK_INT < 34 && this.f43724a.equals("c2.android.flac.decoder")) ? false : true;
    }

    private static boolean n(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return Build.VERSION.SDK_INT >= 35 && codecCapabilities != null && codecCapabilities.isFeatureSupported("detached-surface") && !A();
    }

    private boolean r(r rVar) {
        return this.f43725b.equals(rVar.f10277o) || this.f43725b.equals(N.f(rVar));
    }

    private static boolean t(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("secure-playback");
    }

    private static boolean u(MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("tunneled-playback");
    }

    private void w(String str) {
        AbstractC1477t.b("MediaCodecInfo", "AssumedSupport [" + str + "] [" + this.f43724a + ", " + this.f43725b + "] [" + S.f12880e + "]");
    }

    private void x(String str) {
        AbstractC1477t.b("MediaCodecInfo", "NoSupport [" + str + "] [" + this.f43724a + ", " + this.f43725b + "] [" + S.f12880e + "]");
    }

    private static boolean y(String str) {
        return "audio/opus".equals(str);
    }

    private static boolean z(String str) {
        return Build.MODEL.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(str);
    }

    public Point c(int i10, int i11) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f43727d;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return null;
        }
        return b(videoCapabilities, i10, i11);
    }

    public C1697k e(r rVar, r rVar2) {
        r rVar3;
        r rVar4;
        int i10;
        int i11 = !Objects.equals(rVar.f10277o, rVar2.f10277o) ? 8 : 0;
        if (this.f43735l) {
            if (rVar.f10246A != rVar2.f10246A) {
                i11 |= 1024;
            }
            boolean z10 = (rVar.f10284v == rVar2.f10284v && rVar.f10285w == rVar2.f10285w) ? false : true;
            if (!this.f43728e && z10) {
                i11 |= 512;
            }
            if ((!C1349i.h(rVar.f10250E) || !C1349i.h(rVar2.f10250E)) && !Objects.equals(rVar.f10250E, rVar2.f10250E)) {
                i11 |= 2048;
            }
            if (z(this.f43724a) && !rVar.f(rVar2)) {
                i11 |= 2;
            }
            int i12 = rVar.f10286x;
            if (i12 != -1 && (i10 = rVar.f10287y) != -1 && i12 == rVar2.f10286x && i10 == rVar2.f10287y && z10) {
                i11 |= 2;
            }
            if (i11 == 0) {
                return new C1697k(this.f43724a, rVar, rVar2, rVar.f(rVar2) ? 3 : 2, 0);
            }
            rVar3 = rVar;
            rVar4 = rVar2;
        } else {
            rVar3 = rVar;
            rVar4 = rVar2;
            if (rVar3.f10252G != rVar4.f10252G) {
                i11 |= 4096;
            }
            if (rVar3.f10253H != rVar4.f10253H) {
                i11 |= 8192;
            }
            if (rVar3.f10254I != rVar4.f10254I) {
                i11 |= 16384;
            }
            if (i11 == 0 && "audio/mp4a-latm".equals(this.f43725b)) {
                Pair pairI = N.i(rVar3);
                Pair pairI2 = N.i(rVar4);
                if (pairI != null && pairI2 != null) {
                    int iIntValue = ((Integer) pairI.first).intValue();
                    int iIntValue2 = ((Integer) pairI2.first).intValue();
                    if (iIntValue == 42 && iIntValue2 == 42) {
                        return new C1697k(this.f43724a, rVar3, rVar4, 3, 0);
                    }
                }
            }
            if (!rVar3.f(rVar4)) {
                i11 |= 32;
            }
            if (y(this.f43725b)) {
                i11 |= 2;
            }
            if (i11 == 0) {
                return new C1697k(this.f43724a, rVar3, rVar4, 1, 0);
            }
        }
        return new C1697k(this.f43724a, rVar3, rVar4, 0, i11);
    }

    public float g(int i10, int i11) {
        if (!this.f43735l) {
            return -3.4028235E38f;
        }
        float f10 = this.f43738o;
        if (f10 != -3.4028235E38f && this.f43736m == i10 && this.f43737n == i11) {
            return f10;
        }
        float f11 = f(i10, i11);
        this.f43738o = f11;
        this.f43736m = i10;
        this.f43737n = i11;
        return f11;
    }

    public MediaCodecInfo.CodecProfileLevel[] h() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f43727d;
        return (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) ? new MediaCodecInfo.CodecProfileLevel[0] : codecProfileLevelArr;
    }

    public boolean j(int i10) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f43727d;
        if (codecCapabilities == null) {
            x("channelCount.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            x("channelCount.aCaps");
            return false;
        }
        if (a(this.f43724a, this.f43725b, audioCapabilities.getMaxInputChannelCount()) >= i10) {
            return true;
        }
        x("channelCount.support, " + i10);
        return false;
    }

    public boolean k(int i10) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f43727d;
        if (codecCapabilities == null) {
            x("sampleRate.caps");
            return false;
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities == null) {
            x("sampleRate.aCaps");
            return false;
        }
        if (audioCapabilities.isSampleRateSupported(i10)) {
            return true;
        }
        x("sampleRate.support, " + i10);
        return false;
    }

    public boolean o(r rVar) {
        return r(rVar) && l(rVar, false) && m(rVar);
    }

    public boolean p(r rVar) {
        int i10;
        int i11;
        if (!r(rVar) || !l(rVar, true) || !m(rVar)) {
            return false;
        }
        if (!this.f43735l) {
            int i12 = rVar.f10253H;
            return (i12 == -1 || k(i12)) && ((i10 = rVar.f10252G) == -1 || j(i10));
        }
        int i13 = rVar.f10284v;
        if (i13 <= 0 || (i11 = rVar.f10285w) <= 0) {
            return true;
        }
        return v(i13, i11, rVar.f10288z);
    }

    public boolean q() {
        if (Build.VERSION.SDK_INT >= 29 && "video/x-vnd.on2.vp9".equals(this.f43725b)) {
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : h()) {
                if (codecProfileLevel.profile == 16384) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean s(r rVar) {
        if (this.f43735l) {
            return this.f43728e;
        }
        Pair pairI = N.i(rVar);
        return pairI != null && ((Integer) pairI.first).intValue() == 42;
    }

    public String toString() {
        return this.f43724a;
    }

    public boolean v(int i10, int i11, double d10) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f43727d;
        if (codecCapabilities == null) {
            x("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            x("sizeAndRate.vCaps");
            return false;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            int iC = z.c(videoCapabilities, i10, i11, d10);
            if (iC == 2) {
                return true;
            }
            if (iC == 1) {
                x("sizeAndRate.cover, " + i10 + "x" + i11 + "@" + d10);
                return false;
            }
        }
        if (!d(videoCapabilities, i10, i11, d10)) {
            if (i10 >= i11 || !D(this.f43724a) || !d(videoCapabilities, i11, i10, d10)) {
                x("sizeAndRate.support, " + i10 + "x" + i11 + "@" + d10);
                return false;
            }
            w("sizeAndRate.rotated, " + i10 + "x" + i11 + "@" + d10);
        }
        return true;
    }
}
