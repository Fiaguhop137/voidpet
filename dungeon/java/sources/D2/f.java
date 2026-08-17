package D2;

import C9.AbstractC0876t;
import R1.z;
import U1.AbstractC1477t;
import U1.T;
import java.io.IOException;
import java.io.StringReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: loaded from: classes.dex */
abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String[] f2134a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String[] f2135b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String[] f2136c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    public static c a(String str) {
        try {
            return b(str);
        } catch (z | NumberFormatException | XmlPullParserException unused) {
            AbstractC1477t.h("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
            return null;
        }
    }

    private static c b(String str) throws XmlPullParserException, IOException {
        XmlPullParser xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
        xmlPullParserNewPullParser.setInput(new StringReader(str));
        xmlPullParserNewPullParser.next();
        if (!T.f(xmlPullParserNewPullParser, "x:xmpmeta")) {
            throw z.a("Couldn't find xmp metadata", null);
        }
        AbstractC0876t abstractC0876tW = AbstractC0876t.w();
        long jE = -9223372036854775807L;
        do {
            xmlPullParserNewPullParser.next();
            if (T.f(xmlPullParserNewPullParser, "rdf:Description")) {
                if (!d(xmlPullParserNewPullParser)) {
                    return null;
                }
                jE = e(xmlPullParserNewPullParser);
                abstractC0876tW = c(xmlPullParserNewPullParser);
            } else if (T.f(xmlPullParserNewPullParser, "Container:Directory")) {
                abstractC0876tW = f(xmlPullParserNewPullParser, "Container", "Item");
            } else if (T.f(xmlPullParserNewPullParser, "GContainer:Directory")) {
                abstractC0876tW = f(xmlPullParserNewPullParser, "GContainer", "GContainerItem");
            }
        } while (!T.d(xmlPullParserNewPullParser, "x:xmpmeta"));
        if (abstractC0876tW.isEmpty()) {
            return null;
        }
        return new c(jE, abstractC0876tW);
    }

    private static AbstractC0876t c(XmlPullParser xmlPullParser) {
        for (String str : f2136c) {
            String strA = T.a(xmlPullParser, str);
            if (strA != null) {
                return AbstractC0876t.y(new c.a("image/jpeg", "Primary", 0L, 0L), new c.a("video/mp4", "MotionPhoto", Long.parseLong(strA), 0L));
            }
        }
        return AbstractC0876t.w();
    }

    private static boolean d(XmlPullParser xmlPullParser) {
        for (String str : f2134a) {
            String strA = T.a(xmlPullParser, str);
            if (strA != null) {
                return Integer.parseInt(strA) == 1;
            }
        }
        return false;
    }

    private static long e(XmlPullParser xmlPullParser) {
        for (String str : f2135b) {
            String strA = T.a(xmlPullParser, str);
            if (strA != null) {
                long j10 = Long.parseLong(strA);
                if (j10 == -1) {
                    return -9223372036854775807L;
                }
                return j10;
            }
        }
        return -9223372036854775807L;
    }

    private static AbstractC0876t f(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        AbstractC0876t.a aVarL = AbstractC0876t.l();
        String str3 = str + ":Item";
        String str4 = str + ":Directory";
        do {
            xmlPullParser.next();
            if (T.f(xmlPullParser, str3)) {
                String strA = T.a(xmlPullParser, str2 + ":Mime");
                String strA2 = T.a(xmlPullParser, str2 + ":Semantic");
                String strA3 = T.a(xmlPullParser, str2 + ":Length");
                String strA4 = T.a(xmlPullParser, str2 + ":Padding");
                if (strA == null || strA2 == null) {
                    return AbstractC0876t.w();
                }
                aVarL.a(new c.a(strA, strA2, strA3 != null ? Long.parseLong(strA3) : 0L, strA4 != null ? Long.parseLong(strA4) : 0L));
            }
        } while (!T.d(xmlPullParser, str4));
        return aVarL.k();
    }
}
