package p111g2;

import P2.p;
import R1.AbstractC1348h;
import R1.n;
import R1.r;
import R1.x;
import R1.y;
import R1.z;
import U1.AbstractC1459a;
import U1.AbstractC1477t;
import U1.M;
import U1.S;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p093f2.h;
import p308r2.o;

/* JADX INFO: loaded from: classes.dex */
public final class k implements o.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f42150a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final f f42151b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Pattern f42106c = Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Pattern f42108d = Pattern.compile("VIDEO=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Pattern f42110e = Pattern.compile("AUDIO=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Pattern f42112f = Pattern.compile("SUBTITLES=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Pattern f42114g = Pattern.compile("CLOSED-CAPTIONS=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Pattern f42116h = Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Pattern f42118i = Pattern.compile("CHANNELS=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Pattern f42120j = Pattern.compile("VIDEO-RANGE=(SDR|PQ|HLG)");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Pattern f42122k = Pattern.compile("CODECS=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Pattern f42124l = Pattern.compile("SUPPLEMENTAL-CODECS=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Pattern f42126m = Pattern.compile("RESOLUTION=(\\d+x\\d+)");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Pattern f42128n = Pattern.compile("FRAME-RATE=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final Pattern f42130o = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final Pattern f42132p = Pattern.compile("DURATION=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final Pattern f42134q = Pattern.compile("[:,]DURATION=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final Pattern f42136r = Pattern.compile("PART-TARGET=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final Pattern f42138s = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final Pattern f42140t = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final Pattern f42142u = Pattern.compile("CAN-SKIP-UNTIL=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final Pattern f42144v = c("CAN-SKIP-DATERANGES");

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final Pattern f42146w = Pattern.compile("SKIPPED-SEGMENTS=(\\d+)\\b");

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final Pattern f42147x = Pattern.compile("[:|,]HOLD-BACK=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final Pattern f42148y = Pattern.compile("PART-HOLD-BACK=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final Pattern f42149z = c("CAN-BLOCK-RELOAD");

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private static final Pattern f42078A = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private static final Pattern f42079B = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private static final Pattern f42080C = Pattern.compile("#EXTINF:[\\d\\.]+\\b,(.+)");

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private static final Pattern f42081D = Pattern.compile("LAST-MSN=(\\d+)\\b");

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private static final Pattern f42082E = Pattern.compile("LAST-PART=(\\d+)\\b");

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private static final Pattern f42083F = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private static final Pattern f42084G = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private static final Pattern f42085H = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private static final Pattern f42086I = Pattern.compile("BYTERANGE-START=(\\d+)\\b");

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private static final Pattern f42087J = Pattern.compile("BYTERANGE-LENGTH=(\\d+)\\b");

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private static final Pattern f42088K = Pattern.compile("METHOD=(NONE|AES-128|SAMPLE-AES|SAMPLE-AES-CENC|SAMPLE-AES-CTR)\\s*(?:,|$)");

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private static final Pattern f42089L = Pattern.compile("KEYFORMAT=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private static final Pattern f42090M = Pattern.compile("KEYFORMATVERSIONS=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private static final Pattern f42091N = Pattern.compile("URI=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final Pattern f42092O = Pattern.compile("IV=([^,.*]+)");

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private static final Pattern f42093P = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private static final Pattern f42094Q = Pattern.compile("TYPE=(PART|MAP)");

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private static final Pattern f42095R = Pattern.compile("LANGUAGE=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private static final Pattern f42096S = Pattern.compile("NAME=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private static final Pattern f42097T = Pattern.compile("GROUP-ID=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private static final Pattern f42098U = Pattern.compile("CHARACTERISTICS=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private static final Pattern f42099V = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private static final Pattern f42100W = c("AUTOSELECT");

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private static final Pattern f42101X = c("DEFAULT");

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    private static final Pattern f42102Y = c("FORCED");

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private static final Pattern f42103Z = c("INDEPENDENT");

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private static final Pattern f42104a0 = c("GAP");

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private static final Pattern f42105b0 = c("PRECISE");

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private static final Pattern f42107c0 = Pattern.compile("VALUE=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private static final Pattern f42109d0 = Pattern.compile("IMPORT=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private static final Pattern f42111e0 = Pattern.compile("[:,]ID=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private static final Pattern f42113f0 = Pattern.compile("CLASS=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private static final Pattern f42115g0 = Pattern.compile("START-DATE=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private static final Pattern f42117h0 = Pattern.compile("CUE=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private static final Pattern f42119i0 = Pattern.compile("END-DATE=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private static final Pattern f42121j0 = Pattern.compile("PLANNED-DURATION=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private static final Pattern f42123k0 = c("END-ON-NEXT");

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private static final Pattern f42125l0 = Pattern.compile("X-ASSET-URI=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private static final Pattern f42127m0 = Pattern.compile("X-ASSET-LIST=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private static final Pattern f42129n0 = Pattern.compile("X-RESUME-OFFSET=(-?[\\d\\.]+)\\b");

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private static final Pattern f42131o0 = Pattern.compile("X-PLAYOUT-LIMIT=([\\d\\.]+)\\b");

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private static final Pattern f42133p0 = Pattern.compile("X-SNAP=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private static final Pattern f42135q0 = Pattern.compile("X-RESTRICT=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private static final Pattern f42137r0 = Pattern.compile("X-CONTENT-MAY-VARY=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private static final Pattern f42139s0 = Pattern.compile("X-TIMELINE-OCCUPIES=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private static final Pattern f42141t0 = Pattern.compile("X-TIMELINE-STYLE=\"((?:.|\f)+?)\"");

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private static final Pattern f42143u0 = Pattern.compile("\\{\\$([a-zA-Z0-9\\-_]+)\\}");

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    private static final Pattern f42145v0 = Pattern.compile("\\b(X-[A-Z0-9-]+)=");

    public static final class a extends IOException {
    }

    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final BufferedReader f42152a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Queue f42153b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f42154c;

        public b(Queue queue, BufferedReader bufferedReader) {
            this.f42153b = queue;
            this.f42152a = bufferedReader;
        }

        public boolean a() throws IOException {
            String strTrim;
            if (this.f42154c != null) {
                return true;
            }
            if (!this.f42153b.isEmpty()) {
                this.f42154c = (String) AbstractC1459a.e((String) this.f42153b.poll());
                return true;
            }
            do {
                String line = this.f42152a.readLine();
                this.f42154c = line;
                if (line == null) {
                    return false;
                }
                strTrim = line.trim();
                this.f42154c = strTrim;
            } while (strTrim.isEmpty());
            return true;
        }

        public String b() {
            if (!a()) {
                throw new NoSuchElementException();
            }
            String str = this.f42154c;
            this.f42154c = null;
            return str;
        }
    }

    public k() {
        this(i.f42054n, null);
    }

    public k(i iVar, f fVar) {
        this.f42150a = iVar;
        this.f42151b = fVar;
    }

    private static f.h A(String str) {
        double dT = t(str, f42142u, -9.223372036854776E18d);
        long j10 = dT == -9.223372036854776E18d ? -9223372036854775807L : (long) (dT * 1000000.0d);
        boolean zS = s(str, f42144v, false);
        double dT2 = t(str, f42147x, -9.223372036854776E18d);
        long j11 = dT2 == -9.223372036854776E18d ? -9223372036854775807L : (long) (dT2 * 1000000.0d);
        double dT3 = t(str, f42148y, -9.223372036854776E18d);
        return new f.h(j10, zS, j11, dT3 != -9.223372036854776E18d ? (long) (dT3 * 1000000.0d) : -9223372036854775807L, s(str, f42149z, false));
    }

    private static String B(String str, Pattern pattern, Map map) throws z {
        String strX = x(str, pattern, map);
        if (strX != null) {
            return strX;
        }
        throw z.c("Couldn't match " + pattern.pattern() + " in " + str, null);
    }

    private static long C(String str, Pattern pattern) {
        return new BigDecimal(B(str, pattern, Collections.EMPTY_MAP)).multiply(new BigDecimal(1000000L)).longValue();
    }

    private static String D(String str, Map map) {
        Matcher matcher = f42143u0.matcher(str);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            String strGroup = matcher.group(1);
            if (map.containsKey(strGroup)) {
                matcher.appendReplacement(stringBuffer, Matcher.quoteReplacement((String) map.get(strGroup)));
            }
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    private static int E(BufferedReader bufferedReader, boolean z10, int i10) throws IOException {
        while (i10 != -1 && Character.isWhitespace(i10) && (z10 || !S.F0(i10))) {
            i10 = bufferedReader.read();
        }
        return i10;
    }

    private static boolean b(BufferedReader bufferedReader) throws IOException {
        int i10 = bufferedReader.read();
        if (i10 == 239) {
            if (bufferedReader.read() != 187 || bufferedReader.read() != 191) {
                return false;
            }
            i10 = bufferedReader.read();
        }
        int iE = E(bufferedReader, true, i10);
        for (int i11 = 0; i11 < 7; i11++) {
            if (iE != "#EXTM3U".charAt(i11)) {
                return false;
            }
            iE = bufferedReader.read();
        }
        return S.F0(E(bufferedReader, false, iE));
    }

    private static Pattern c(String str) {
        return Pattern.compile(str + "=(NO|YES)");
    }

    private static n d(String str, n.b[] bVarArr) {
        n.b[] bVarArr2 = new n.b[bVarArr.length];
        for (int i10 = 0; i10 < bVarArr.length; i10++) {
            bVarArr2[i10] = bVarArr[i10].j(null);
        }
        return new n(str, bVarArr2);
    }

    private static String e(long j10, String str, String str2) {
        if (str == null) {
            return null;
        }
        return str2 != null ? str2 : Long.toHexString(j10);
    }

    private static i.b f(ArrayList arrayList, String str) {
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            i.b bVar = (i.b) arrayList.get(i10);
            if (str.equals(bVar.f42072d)) {
                return bVar;
            }
        }
        return null;
    }

    private static i.b g(ArrayList arrayList, String str) {
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            i.b bVar = (i.b) arrayList.get(i10);
            if (str.equals(bVar.f42073e)) {
                return bVar;
            }
        }
        return null;
    }

    private static i.b h(ArrayList arrayList, String str) {
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            i.b bVar = (i.b) arrayList.get(i10);
            if (str.equals(bVar.f42071c)) {
                return bVar;
            }
        }
        return null;
    }

    private static boolean i(String str, String str2, String str3, String str4) {
        if (!y.p(str2, str3)) {
            return false;
        }
        if (str3 == null) {
            return true;
        }
        if (str == null || str4 == null) {
            return false;
        }
        return (!str.equals("PQ") || str4.equals("db1p")) && (!str.equals("SDR") || str4.equals("db2g")) && (!str.equals("HLG") || str4.startsWith("db4"));
    }

    private static f.b k(String str, String str2, Map map) {
        String str3 = str2 + "=";
        int iIndexOf = str.indexOf(str3) + str3.length();
        String strSubstring = str.substring(iIndexOf, (str.length() == iIndexOf + 1 ? 1 : 2) + iIndexOf);
        if (strSubstring.startsWith("\"")) {
            return new f.b(str2, B(str, Pattern.compile(str2 + "=\"((?:.|\f)+?)\""), map), 0);
        }
        if (strSubstring.equals("0x") || strSubstring.equals("0X")) {
            return new f.b(str2, B(str, Pattern.compile(str2 + "=(0[xX][A-F0-9]+)"), map), 1);
        }
        return new f.b(str2, l(str, Pattern.compile(str2 + "=([\\d\\.]+)\\b")));
    }

    private static double l(String str, Pattern pattern) {
        return Double.parseDouble(B(str, pattern, Collections.EMPTY_MAP));
    }

    private static n.b m(String str, String str2, Map map) throws z {
        String strW = w(str, f42090M, "1", map);
        if ("urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed".equals(str2)) {
            String strB = B(str, f42091N, map);
            return new n.b(AbstractC1348h.f10159d, "video/mp4", Base64.decode(strB.substring(strB.indexOf(44)), 0));
        }
        if ("com.widevine".equals(str2)) {
            return new n.b(AbstractC1348h.f10159d, "hls", S.u0(str));
        }
        if (!"com.microsoft.playready".equals(str2) || !"1".equals(strW)) {
            return null;
        }
        String strB2 = B(str, f42091N, map);
        byte[] bArrDecode = Base64.decode(strB2.substring(strB2.indexOf(44)), 0);
        UUID uuid = AbstractC1348h.f10160e;
        return new n.b(uuid, "video/mp4", p.a(uuid, bArrDecode));
    }

    private static String n(String str) {
        return ("SAMPLE-AES-CENC".equals(str) || "SAMPLE-AES-CTR".equals(str)) ? "cenc" : "cbcs";
    }

    private static int o(String str, Pattern pattern) {
        return Integer.parseInt(B(str, pattern, Collections.EMPTY_MAP));
    }

    private static long p(String str, Pattern pattern) {
        return Long.parseLong(B(str, pattern, Collections.EMPTY_MAP));
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 29541. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    private static p111g2.f q(p111g2.i r91, p111g2.f r92, g2.k.b r93, java.lang.String r94) {
        /*
            Method dump skipped, instruction units count: 2954
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p111g2.k.q(g2.i, g2.f, g2.k$b, java.lang.String):g2.f");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:168:0x0256 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x0152 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:44:0x0155  */
    /* JADX WARN: Code duplicated, block: B:47:0x015c  */
    /* JADX WARN: Code duplicated, block: B:48:0x0170  */
    /* JADX WARN: Code duplicated, block: B:51:0x0179  */
    /* JADX WARN: Code duplicated, block: B:56:0x0195  */
    /* JADX WARN: Code duplicated, block: B:58:0x019c  */
    /* JADX WARN: Code duplicated, block: B:61:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:62:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:65:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:67:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:69:0x01da  */
    /* JADX WARN: Code duplicated, block: B:72:0x022c  */
    /* JADX WARN: Code duplicated, block: B:98:0x0366  */
    /* JADX WARN: Instruction removed from duplicated block: B:47:0x015c, please report this as an issue */
    private static i r(b bVar, String str) throws z {
        ArrayList arrayList;
        String strG;
        ArrayList arrayList2;
        int i10;
        String str2;
        String strG2;
        int i11;
        String str3;
        String str4;
        String strT;
        String strX;
        int i12;
        int i13;
        String strX2;
        float f10;
        Uri uriG;
        Uri uri;
        ArrayList arrayList3;
        int i14;
        int i15;
        int i16;
        String strU;
        String str5 = str;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        ArrayList arrayList8 = new ArrayList();
        ArrayList arrayList9 = new ArrayList();
        ArrayList arrayList10 = new ArrayList();
        ArrayList arrayList11 = new ArrayList();
        boolean z10 = false;
        boolean z11 = false;
        while (true) {
            ArrayList arrayList12 = arrayList8;
            if (!bVar.a()) {
                ArrayList arrayList13 = arrayList9;
                ArrayList arrayList14 = arrayList5;
                ArrayList arrayList15 = arrayList6;
                ArrayList arrayList16 = arrayList7;
                ArrayList arrayList17 = arrayList11;
                ArrayList arrayList18 = arrayList10;
                boolean z12 = z11;
                ArrayList arrayList19 = new ArrayList();
                HashSet hashSet = new HashSet();
                for (int i17 = 0; i17 < arrayList4.size(); i17++) {
                    i.b bVar2 = (i.b) arrayList4.get(i17);
                    if (hashSet.add(bVar2.f42069a)) {
                        AbstractC1459a.g(bVar2.f42070b.f10274l == null);
                        arrayList19.add(bVar2.a(bVar2.f42070b.b().r0(new x(new h(null, null, (List) AbstractC1459a.e((ArrayList) map.get(bVar2.f42069a))))).P()));
                    }
                }
                ArrayList arrayList20 = null;
                r rVarP = null;
                int i18 = 0;
                while (i18 < arrayList13.size()) {
                    ArrayList arrayList21 = arrayList13;
                    String str6 = (String) arrayList21.get(i18);
                    String strB = B(str6, f42097T, map2);
                    String strB2 = B(str6, f42096S, map2);
                    r.b bVar3 = new r.b();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(strB);
                    ArrayList arrayList22 = arrayList20;
                    sb2.append(":");
                    sb2.append(strB2);
                    r.b bVarN0 = bVar3.j0(sb2.toString()).l0(strB2).W("application/x-mpegURL").A0(z(str6)).w0(y(str6, map2)).n0(x(str6, f42095R, map2));
                    String strX3 = x(str6, f42091N, map2);
                    Uri uriG2 = strX3 == null ? null : M.g(str5, strX3);
                    ArrayList arrayList23 = arrayList19;
                    x xVar = new x(new h(strB, strB2, Collections.EMPTY_LIST));
                    String strB3 = B(str6, f42093P, map2);
                    strB3.getClass();
                    switch (strB3) {
                        case "SUBTITLES":
                            arrayList = arrayList15;
                            i.b bVarG = g(arrayList4, strB);
                            if (bVarG != null) {
                                String strT2 = S.T(bVarG.f42070b.f10273k, 3);
                                bVarN0.U(strT2);
                                strG = y.g(strT2);
                            } else {
                                strG = null;
                            }
                            if (strG == null) {
                                strG = "text/vtt";
                            }
                            bVarN0.y0(strG).r0(xVar);
                            if (uriG2 != null) {
                                arrayList2 = arrayList16;
                                arrayList2.add(new i.a(uriG2, bVarN0.P(), strB, strB2));
                            } else {
                                arrayList2 = arrayList16;
                                AbstractC1477t.h("HlsPlaylistParser", "EXT-X-MEDIA tag with missing mandatory URI attribute: skipping");
                            }
                            arrayList20 = arrayList22;
                            break;
                        case "CLOSED-CAPTIONS":
                            arrayList = arrayList15;
                            String strB4 = B(str6, f42099V, map2);
                            if (strB4.startsWith("CC")) {
                                i10 = Integer.parseInt(strB4.substring(2));
                                str2 = "application/cea-608";
                            } else {
                                i10 = Integer.parseInt(strB4.substring(7));
                                str2 = "application/cea-708";
                            }
                            ArrayList arrayList24 = arrayList22 == null ? new ArrayList() : arrayList22;
                            bVarN0.y0(str2).Q(i10);
                            arrayList24.add(bVarN0.P());
                            arrayList20 = arrayList24;
                            arrayList2 = arrayList16;
                            break;
                        case "AUDIO":
                            arrayList14 = arrayList14;
                            i.b bVarF = f(arrayList4, strB);
                            if (bVarF != null) {
                                String strT3 = S.T(bVarF.f42070b.f10273k, 1);
                                bVarN0.U(strT3);
                                strG2 = y.g(strT3);
                            } else {
                                strG2 = null;
                            }
                            String strX4 = x(str6, f42118i, map2);
                            if (strX4 != null) {
                                bVarN0.T(Integer.parseInt(S.i1(strX4, "/")[0]));
                                if ("audio/eac3".equals(strG2) && strX4.endsWith("/JOC")) {
                                    bVarN0.U("ec+3");
                                    strG2 = "audio/eac3-joc";
                                }
                            }
                            bVarN0.y0(strG2);
                            if (uriG2 != null) {
                                bVarN0.r0(xVar);
                                arrayList = arrayList15;
                                arrayList.add(new i.a(uriG2, bVarN0.P(), strB, strB2));
                            } else {
                                arrayList = arrayList15;
                                if (bVarF != null) {
                                    rVarP = bVarN0.P();
                                }
                            }
                            arrayList2 = arrayList16;
                            arrayList20 = arrayList22;
                            break;
                        case "VIDEO":
                            i.b bVarH = h(arrayList4, strB);
                            if (bVarH != null) {
                                r rVar = bVarH.f42070b;
                                String strT4 = S.T(rVar.f10273k, 2);
                                bVarN0.U(strT4).y0(y.g(strT4)).F0(rVar.f10284v).h0(rVar.f10285w).f0(rVar.f10288z);
                            }
                            if (uriG2 != null) {
                                bVarN0.r0(xVar);
                                arrayList14.add(new i.a(uriG2, bVarN0.P(), strB, strB2));
                                break;
                            }
                        default:
                            arrayList2 = arrayList16;
                            arrayList = arrayList15;
                            arrayList20 = arrayList22;
                            break;
                    }
                    i18++;
                    str5 = str;
                    arrayList15 = arrayList;
                    arrayList13 = arrayList21;
                    arrayList16 = arrayList2;
                    arrayList19 = arrayList23;
                }
                return new i(str, arrayList17, arrayList19, arrayList14, arrayList15, arrayList16, arrayList12, rVarP, z10 ? Collections.EMPTY_LIST : arrayList20, z12, map2, arrayList18);
            }
            String strB5 = bVar.b();
            if (strB5.startsWith("#EXT")) {
                arrayList11.add(strB5);
            }
            boolean zStartsWith = strB5.startsWith("#EXT-X-I-FRAME-STREAM-INF");
            if (strB5.startsWith("#EXT-X-DEFINE")) {
                map2.put(B(strB5, f42096S, map2), B(strB5, f42107c0, map2));
            } else {
                if (strB5.equals("#EXT-X-INDEPENDENT-SEGMENTS")) {
                    arrayList9 = arrayList9;
                    arrayList5 = arrayList5;
                    z11 = true;
                } else if (strB5.startsWith("#EXT-X-MEDIA")) {
                    arrayList9.add(strB5);
                } else if (strB5.startsWith("#EXT-X-SESSION-KEY")) {
                    n.b bVarM = m(strB5, w(strB5, f42089L, "identity", map2), map2);
                    if (bVarM != null) {
                        arrayList10.add(new n(n(B(strB5, f42088K, map2)), bVarM));
                    }
                } else if (strB5.startsWith("#EXT-X-STREAM-INF") || zStartsWith) {
                    boolean zContains = z10 | strB5.contains("CLOSED-CAPTIONS=NONE");
                    int i19 = zStartsWith ? 16384 : 0;
                    int iO = o(strB5, f42116h);
                    int iU = u(strB5, f42106c, -1);
                    String strX5 = x(strB5, f42120j, map2);
                    boolean z13 = z11;
                    String strX6 = x(strB5, f42122k, map2);
                    String strX7 = x(strB5, f42124l, map2);
                    if (strX7 != null) {
                        String[] strArrH1 = S.h1(S.i1(strX7, ",")[0], "/");
                        String str7 = strArrH1[0];
                        if (strArrH1.length > 1) {
                            str4 = strArrH1[1];
                            arrayList9 = arrayList9;
                            arrayList5 = arrayList5;
                            str3 = str7;
                            i11 = 2;
                        } else {
                            str3 = str7;
                            i11 = 2;
                        }
                        strT = S.T(strX6, i11);
                        if (i(strX5, strT, str3, str4)) {
                            if (str3 == null) {
                                str3 = strT;
                            }
                            strU = S.U(strX6, i11);
                            if (strU != null) {
                                strX6 = str3 + "," + strU;
                            } else {
                                strX6 = str3;
                            }
                        }
                        strX = x(strB5, f42126m, map2);
                        if (strX != null) {
                            String[] strArrH2 = S.h1(strX, "x");
                            i14 = Integer.parseInt(strArrH2[0]);
                            i15 = Integer.parseInt(strArrH2[1]);
                            if (i14 > 0 || i15 <= 0) {
                                i15 = -1;
                                i16 = -1;
                            } else {
                                i16 = i14;
                            }
                            i13 = i15;
                            i12 = i16;
                        } else {
                            i12 = -1;
                            i13 = -1;
                        }
                        strX2 = x(strB5, f42128n, map2);
                        if (strX2 != null) {
                            f10 = Float.parseFloat(strX2);
                        } else {
                            f10 = -1.0f;
                        }
                        String strX8 = x(strB5, f42108d, map2);
                        String strX9 = x(strB5, f42110e, map2);
                        String strX10 = x(strB5, f42112f, map2);
                        String strX11 = x(strB5, f42114g, map2);
                        if (zStartsWith) {
                            uriG = M.g(str5, B(strB5, f42091N, map2));
                        } else {
                            if (bVar.a()) {
                                throw z.c("#EXT-X-STREAM-INF must be followed by another line", null);
                            }
                            uriG = M.g(str5, D(bVar.b(), map2));
                        }
                        uri = uriG;
                        arrayList4.add(new i.b(uri, new r.b().i0(arrayList4.size()).W("application/x-mpegURL").U(strX6).S(iU).t0(iO).F0(i12).h0(i13).f0(f10).w0(i19).P(), strX8, strX9, strX10, strX11));
                        arrayList3 = (ArrayList) map.get(uri);
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList();
                            map.put(uri, arrayList3);
                        }
                        arrayList3.add(new h.a(iU, iO, strX8, strX9, strX10, strX11));
                        z10 = zContains;
                        z11 = z13;
                    } else {
                        i11 = 2;
                        str3 = null;
                    }
                    str4 = null;
                    strT = S.T(strX6, i11);
                    if (i(strX5, strT, str3, str4)) {
                        if (str3 == null) {
                            str3 = strT;
                        }
                        strU = S.U(strX6, i11);
                        if (strU != null) {
                            strX6 = str3 + "," + strU;
                        } else {
                            strX6 = str3;
                        }
                    }
                    strX = x(strB5, f42126m, map2);
                    if (strX != null) {
                        String[] strArrH3 = S.h1(strX, "x");
                        i14 = Integer.parseInt(strArrH3[0]);
                        i15 = Integer.parseInt(strArrH3[1]);
                        if (i14 > 0) {
                            i15 = -1;
                            i16 = -1;
                        } else {
                            i15 = -1;
                            i16 = -1;
                        }
                        i13 = i15;
                        i12 = i16;
                    } else {
                        i12 = -1;
                        i13 = -1;
                    }
                    strX2 = x(strB5, f42128n, map2);
                    if (strX2 != null) {
                        f10 = Float.parseFloat(strX2);
                    } else {
                        f10 = -1.0f;
                    }
                    String strX12 = x(strB5, f42108d, map2);
                    String strX13 = x(strB5, f42110e, map2);
                    String strX14 = x(strB5, f42112f, map2);
                    String strX15 = x(strB5, f42114g, map2);
                    if (zStartsWith) {
                        uriG = M.g(str5, B(strB5, f42091N, map2));
                    } else {
                        if (bVar.a()) {
                            throw z.c("#EXT-X-STREAM-INF must be followed by another line", null);
                        }
                        uriG = M.g(str5, D(bVar.b(), map2));
                    }
                    uri = uriG;
                    arrayList4.add(new i.b(uri, new r.b().i0(arrayList4.size()).W("application/x-mpegURL").U(strX6).S(iU).t0(iO).F0(i12).h0(i13).f0(f10).w0(i19).P(), strX12, strX13, strX14, strX15));
                    arrayList3 = (ArrayList) map.get(uri);
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList();
                        map.put(uri, arrayList3);
                    }
                    arrayList3.add(new h.a(iU, iO, strX12, strX13, strX14, strX15));
                    z10 = zContains;
                    z11 = z13;
                }
                arrayList8 = arrayList12;
                arrayList11 = arrayList11;
                arrayList10 = arrayList10;
                arrayList7 = arrayList7;
                arrayList6 = arrayList6;
                arrayList5 = arrayList5;
                arrayList9 = arrayList9;
            }
            arrayList9 = arrayList9;
            arrayList5 = arrayList5;
            arrayList8 = arrayList12;
            arrayList11 = arrayList11;
            arrayList10 = arrayList10;
            arrayList7 = arrayList7;
            arrayList6 = arrayList6;
            arrayList5 = arrayList5;
            arrayList9 = arrayList9;
        }
    }

    private static boolean s(String str, Pattern pattern, boolean z10) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? "YES".equals(matcher.group(1)) : z10;
    }

    private static double t(String str, Pattern pattern, double d10) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? Double.parseDouble((String) AbstractC1459a.e(matcher.group(1))) : d10;
    }

    private static int u(String str, Pattern pattern, int i10) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? Integer.parseInt((String) AbstractC1459a.e(matcher.group(1))) : i10;
    }

    private static long v(String str, Pattern pattern, long j10) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? Long.parseLong((String) AbstractC1459a.e(matcher.group(1))) : j10;
    }

    private static String w(String str, Pattern pattern, String str2, Map map) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            str2 = (String) AbstractC1459a.e(matcher.group(1));
        }
        return (map.isEmpty() || str2 == null) ? str2 : D(str2, map);
    }

    private static String x(String str, Pattern pattern, Map map) {
        return w(str, pattern, null, map);
    }

    private static int y(String str, Map map) {
        String strX = x(str, f42098U, map);
        if (TextUtils.isEmpty(strX)) {
            return 0;
        }
        String[] strArrH1 = S.h1(strX, ",");
        int i10 = S.r(strArrH1, "public.accessibility.describes-video") ? 512 : 0;
        if (S.r(strArrH1, "public.accessibility.transcribes-spoken-dialog")) {
            i10 |= 4096;
        }
        if (S.r(strArrH1, "public.accessibility.describes-music-and-sound")) {
            i10 |= 1024;
        }
        return S.r(strArrH1, "public.easy-to-read") ? i10 | 8192 : i10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    private static int z(String str) {
        boolean zS = s(str, f42101X, false);
        ?? r10 = zS;
        if (s(str, f42102Y, false)) {
            r10 = (zS ? 1 : 0) | 2;
        }
        return s(str, f42100W, false) ? r10 | 4 : r10;
    }

    @Override // r2.o.a
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public j a(Uri uri, InputStream inputStream) throws z {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        ArrayDeque arrayDeque = new ArrayDeque();
        try {
            if (!b(bufferedReader)) {
                throw z.c("Input does not start with the #EXTM3U header.", null);
            }
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    S.m(bufferedReader);
                    throw z.c("Failed to parse the playlist, could not identify any tags.", null);
                }
                String strTrim = line.trim();
                if (!strTrim.isEmpty()) {
                    if (strTrim.startsWith("#EXT-X-STREAM-INF")) {
                        arrayDeque.add(strTrim);
                        i iVarR = r(new b(arrayDeque, bufferedReader), uri.toString());
                        S.m(bufferedReader);
                        return iVarR;
                    }
                    if (!strTrim.startsWith("#EXT-X-TARGETDURATION") && !strTrim.startsWith("#EXT-X-MEDIA-SEQUENCE") && !strTrim.startsWith("#EXTINF") && !strTrim.startsWith("#EXT-X-KEY") && !strTrim.startsWith("#EXT-X-BYTERANGE") && !strTrim.equals("#EXT-X-DISCONTINUITY") && !strTrim.equals("#EXT-X-DISCONTINUITY-SEQUENCE") && !strTrim.equals("#EXT-X-ENDLIST")) {
                        arrayDeque.add(strTrim);
                    }
                    arrayDeque.add(strTrim);
                    f fVarQ = q(this.f42150a, this.f42151b, new b(arrayDeque, bufferedReader), uri.toString());
                    S.m(bufferedReader);
                    return fVarQ;
                }
            }
        } catch (Throwable th) {
            S.m(bufferedReader);
            throw th;
        }
    }
}
