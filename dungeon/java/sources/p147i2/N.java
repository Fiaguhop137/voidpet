package p147i2;

import C9.AbstractC0876t;
import R1.r;
import R1.y;
import U1.AbstractC1467i;
import U1.AbstractC1477t;
import U1.S;
import V1.h;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class N {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final HashMap f43645a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f43646b = -1;

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f43647a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f43648b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f43649c;

        public b(String str, boolean z10, boolean z11) {
            this.f43647a = str;
            this.f43648b = z10;
            this.f43649c = z11;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && obj.getClass() == b.class) {
                b bVar = (b) obj;
                if (TextUtils.equals(this.f43647a, bVar.f43647a) && this.f43648b == bVar.f43648b && this.f43649c == bVar.f43649c) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return ((((this.f43647a.hashCode() + 31) * 31) + (this.f43648b ? 1231 : 1237)) * 31) + (this.f43649c ? 1231 : 1237);
        }
    }

    public static class c extends Exception {
        private c(Throwable th) {
            super("Failed to query underlying media codecs", th);
        }

        /* synthetic */ c(Throwable th, a aVar) {
            this(th);
        }
    }

    private interface d {
        MediaCodecInfo a(int i10);

        boolean b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities);

        boolean c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities);

        int d();

        boolean e();
    }

    private static final class e implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f43650a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private MediaCodecInfo[] f43651b;

        public e(boolean z10, boolean z11, boolean z12) {
            this.f43650a = (z10 || z11 || z12) ? 1 : 0;
        }

        private void f() {
            if (this.f43651b == null) {
                this.f43651b = new MediaCodecList(this.f43650a).getCodecInfos();
            }
        }

        @Override // i2.N.d
        public MediaCodecInfo a(int i10) {
            f();
            return this.f43651b[i10];
        }

        @Override // i2.N.d
        public boolean b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureSupported(str);
        }

        @Override // i2.N.d
        public boolean c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureRequired(str);
        }

        @Override // i2.N.d
        public int d() {
            f();
            return this.f43651b.length;
        }

        @Override // i2.N.d
        public boolean e() {
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    interface f {
        int a(Object obj);
    }

    private static void A(List list, f fVar) {
        Collections.sort(list, new M(fVar));
    }

    public static /* synthetic */ int a(f fVar, Object obj, Object obj2) {
        return fVar.a(obj2) - fVar.a(obj);
    }

    public static /* synthetic */ int b(t tVar) {
        return (tVar.f43732i ? 2 : 0) + (!tVar.f43733j ? 1 : 0);
    }

    public static /* synthetic */ int c(r rVar, t tVar) {
        return tVar.o(rVar) ? 1 : 0;
    }

    public static /* synthetic */ int d(t tVar) {
        String str = tVar.f43724a;
        if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
            return 1;
        }
        return (Build.VERSION.SDK_INT >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
    }

    private static void e(String str, List list) {
        if ("audio/raw".equals(str)) {
            if (Build.VERSION.SDK_INT < 26 && Build.DEVICE.equals("R9") && list.size() == 1 && ((t) list.get(0)).f43724a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                list.add(t.E("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false, false));
            }
            A(list, new J());
        }
        if (Build.VERSION.SDK_INT >= 32 || list.size() <= 1 || !"OMX.qti.audio.decoder.flac".equals(((t) list.get(0)).f43724a)) {
            return;
        }
        list.add((t) list.remove(0));
    }

    public static String f(r rVar) {
        Pair pairI;
        if ("audio/eac3-joc".equals(rVar.f10277o)) {
            return "audio/eac3";
        }
        if ("video/dolby-vision".equals(rVar.f10277o) && (pairI = i(rVar)) != null) {
            int iIntValue = ((Integer) pairI.first).intValue();
            if (iIntValue == 16 || iIntValue == 256) {
                return "video/hevc";
            }
            if (iIntValue == 512) {
                return "video/avc";
            }
            if (iIntValue == 1024) {
                return "video/av01";
            }
        }
        if ("video/mv-hevc".equals(rVar.f10277o)) {
            return "video/hevc";
        }
        return null;
    }

    public static List g(E e10, r rVar, boolean z10, boolean z11) {
        String strF = f(rVar);
        return strF == null ? AbstractC0876t.w() : e10.b(strF, z10, z11);
    }

    private static String h(MediaCodecInfo mediaCodecInfo, String str, String str2) {
        for (String str3 : mediaCodecInfo.getSupportedTypes()) {
            if (str3.equalsIgnoreCase(str2)) {
                return str3;
            }
        }
        if (str2.equals("video/dolby-vision")) {
            if ("OMX.MS.HEVCDV.Decoder".equals(str)) {
                return "video/hevcdv";
            }
            if ("OMX.RTK.video.decoder".equals(str) || "OMX.realtek.video.decoder.tunneled".equals(str)) {
                return "video/dv_hevc";
            }
            return null;
        }
        if (str2.equals("video/mv-hevc")) {
            if ("c2.qti.mvhevc.decoder".equals(str) || "c2.qti.mvhevc.decoder.secure".equals(str)) {
                return "video/x-mvhevc";
            }
            return null;
        }
        if (str2.equals("audio/alac") && "OMX.lge.alac.decoder".equals(str)) {
            return "audio/x-lg-alac";
        }
        if (str2.equals("audio/flac") && "OMX.lge.flac.decoder".equals(str)) {
            return "audio/x-lg-flac";
        }
        if (str2.equals("audio/ac3") && "OMX.lge.ac3.decoder".equals(str)) {
            return "audio/lg-ac3";
        }
        return null;
    }

    public static Pair i(r rVar) {
        return AbstractC1467i.s(rVar);
    }

    public static t j(String str, boolean z10, boolean z11) {
        List listK = k(str, z10, z11);
        if (listK.isEmpty()) {
            return null;
        }
        return (t) listK.get(0);
    }

    public static synchronized List k(String str, boolean z10, boolean z11) {
        try {
            b bVar = new b(str, z10, z11);
            HashMap map = f43645a;
            List list = (List) map.get(bVar);
            if (list != null) {
                return list;
            }
            ArrayList arrayListL = l(bVar, new e(z10, z11, str.equals("video/mv-hevc")));
            if (z10) {
                arrayListL.isEmpty();
            }
            e(str, arrayListL);
            AbstractC0876t abstractC0876tP = AbstractC0876t.p(arrayListL);
            map.put(bVar, abstractC0876tP);
            return abstractC0876tP;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0053  */
    private static ArrayList l(b bVar, d dVar) throws c {
        String strH;
        String str;
        int i10;
        d dVar2 = dVar;
        try {
            ArrayList arrayList = new ArrayList();
            String str2 = bVar.f43647a;
            int iD = dVar2.d();
            boolean zE = dVar2.e();
            int i11 = 0;
            while (i11 < iD) {
                MediaCodecInfo mediaCodecInfoA = dVar2.a(i11);
                if (r(mediaCodecInfoA)) {
                    i10 = i11;
                } else {
                    int i12 = i11;
                    String name = mediaCodecInfoA.getName();
                    if (t(mediaCodecInfoA, name, zE, str2) && (strH = h(mediaCodecInfoA, name, str2)) != null) {
                        try {
                            MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfoA.getCapabilitiesForType(strH);
                            boolean zB = dVar2.b("tunneled-playback", strH, capabilitiesForType);
                            boolean zC = dVar2.c("tunneled-playback", strH, capabilitiesForType);
                            boolean z10 = bVar.f43649c;
                            if ((z10 || !zC) && (!z10 || zB)) {
                                boolean zB2 = dVar2.b("secure-playback", strH, capabilitiesForType);
                                boolean zC2 = dVar2.c("secure-playback", strH, capabilitiesForType);
                                boolean z11 = bVar.f43648b;
                                if ((z11 || !zC2) && (!z11 || zB2)) {
                                    try {
                                        boolean zU = u(mediaCodecInfoA, str2);
                                        boolean zW = w(mediaCodecInfoA, str2);
                                        boolean zY = y(mediaCodecInfoA);
                                        try {
                                            if (zE) {
                                                if (bVar.f43648b != zB2) {
                                                }
                                                str = strH;
                                                i10 = i12;
                                                arrayList.add(t.E(name, str2, str, capabilitiesForType, zU, zW, zY, false, false));
                                            }
                                            arrayList.add(t.E(name, str2, str, capabilitiesForType, zU, zW, zY, false, false));
                                        } catch (Exception e10) {
                                            e = e10;
                                            AbstractC1477t.c("MediaCodecUtil", "Failed to query codec " + name + " (" + str + ")");
                                            throw e;
                                        }
                                        if (zE || bVar.f43648b) {
                                            str = strH;
                                            i10 = i12;
                                            if (!zE && zB2) {
                                                try {
                                                    try {
                                                        arrayList.add(t.E(name + ".secure", str2, str, capabilitiesForType, zU, zW, zY, false, true));
                                                        return arrayList;
                                                    } catch (Exception e11) {
                                                        e = e11;
                                                        name = name;
                                                        AbstractC1477t.c("MediaCodecUtil", "Failed to query codec " + name + " (" + str + ")");
                                                        throw e;
                                                    }
                                                } catch (Exception e12) {
                                                    e = e12;
                                                }
                                            }
                                        }
                                        str = strH;
                                        i10 = i12;
                                    } catch (Exception e13) {
                                        e = e13;
                                        str = strH;
                                    }
                                } else {
                                    i10 = i12;
                                }
                            } else {
                                i10 = i12;
                            }
                        } catch (Exception e14) {
                            e = e14;
                            str = strH;
                        }
                    } else {
                        i10 = i12;
                    }
                }
                i11 = i10 + 1;
                dVar2 = dVar;
            }
            return arrayList;
        } catch (Exception e15) {
            throw new c(e15, null);
        }
    }

    public static List m(E e10, r rVar, boolean z10, boolean z11) {
        List listB = e10.b(rVar.f10277o, z10, z11);
        return AbstractC0876t.l().j(listB).j(g(e10, rVar, z10, z11)).k();
    }

    public static List n(List list, r rVar) {
        ArrayList arrayList = new ArrayList(list);
        A(arrayList, new K(rVar));
        return arrayList;
    }

    public static List o(List list) {
        ArrayList arrayList = new ArrayList(list);
        A(arrayList, new L());
        return AbstractC0876t.p(arrayList);
    }

    public static t p() {
        return j("audio/raw", false, false);
    }

    public static Pair q(r rVar) {
        String strH = h.h(rVar.f10280r);
        if (strH == null) {
            return null;
        }
        return AbstractC1467i.v(strH, S.h1(strH.trim(), "\\."), rVar.f10250E);
    }

    private static boolean r(MediaCodecInfo mediaCodecInfo) {
        return Build.VERSION.SDK_INT >= 29 && s(mediaCodecInfo);
    }

    private static boolean s(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isAlias();
    }

    private static boolean t(MediaCodecInfo mediaCodecInfo, String str, boolean z10, String str2) {
        if (mediaCodecInfo.isEncoder()) {
            return false;
        }
        return z10 || !str.endsWith(".secure");
    }

    private static boolean u(MediaCodecInfo mediaCodecInfo, String str) {
        return Build.VERSION.SDK_INT >= 29 ? v(mediaCodecInfo) : !w(mediaCodecInfo, str);
    }

    private static boolean v(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isHardwareAccelerated();
    }

    private static boolean w(MediaCodecInfo mediaCodecInfo, String str) {
        if (Build.VERSION.SDK_INT >= 29) {
            return x(mediaCodecInfo);
        }
        if (y.o(str)) {
            return true;
        }
        String strE = B9.c.e(mediaCodecInfo.getName());
        if (strE.startsWith("arc.")) {
            return false;
        }
        return strE.startsWith("omx.google.") || strE.startsWith("omx.ffmpeg.") || (strE.startsWith("omx.sec.") && strE.contains(".sw.")) || strE.equals("omx.qcom.video.decoder.hevcswvdec") || strE.startsWith("c2.android.") || strE.startsWith("c2.google.") || !(strE.startsWith("omx.") || strE.startsWith("c2."));
    }

    private static boolean x(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isSoftwareOnly();
    }

    private static boolean y(MediaCodecInfo mediaCodecInfo) {
        if (Build.VERSION.SDK_INT >= 29) {
            return z(mediaCodecInfo);
        }
        String strE = B9.c.e(mediaCodecInfo.getName());
        return (strE.startsWith("omx.google.") || strE.startsWith("c2.android.") || strE.startsWith("c2.google.")) ? false : true;
    }

    private static boolean z(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isVendor();
    }
}
