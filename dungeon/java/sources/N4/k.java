package N4;

import android.graphics.Matrix;
import android.util.Log;
import android.util.Xml;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPInputStream;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.ext.DefaultHandler2;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
class k {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f7704d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private N4.g f7701a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private N4.g.J f7702b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f7703c = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f7705e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private h f7706f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private StringBuilder f7707g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f7708h = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private StringBuilder f7709i = null;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f7710a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f7711b;

        static {
            int[] iArr = new int[g.values().length];
            f7711b = iArr;
            try {
                iArr[g.x.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7711b[g.y.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7711b[g.width.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7711b[g.height.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f7711b[g.version.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f7711b[g.href.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f7711b[g.preserveAspectRatio.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f7711b[g.d.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f7711b[g.pathLength.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f7711b[g.rx.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f7711b[g.ry.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f7711b[g.cx.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f7711b[g.cy.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f7711b[g.r.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f7711b[g.x1.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f7711b[g.y1.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f7711b[g.x2.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f7711b[g.y2.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f7711b[g.dx.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f7711b[g.dy.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f7711b[g.requiredFeatures.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f7711b[g.requiredExtensions.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f7711b[g.systemLanguage.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f7711b[g.requiredFormats.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f7711b[g.requiredFonts.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f7711b[g.refX.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f7711b[g.refY.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                f7711b[g.markerWidth.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                f7711b[g.markerHeight.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                f7711b[g.markerUnits.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                f7711b[g.orient.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                f7711b[g.gradientUnits.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                f7711b[g.gradientTransform.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                f7711b[g.spreadMethod.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                f7711b[g.fx.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                f7711b[g.fy.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                f7711b[g.offset.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                f7711b[g.clipPathUnits.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                f7711b[g.startOffset.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                f7711b[g.patternUnits.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                f7711b[g.patternContentUnits.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                f7711b[g.patternTransform.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                f7711b[g.maskUnits.ordinal()] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                f7711b[g.maskContentUnits.ordinal()] = 44;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                f7711b[g.style.ordinal()] = 45;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                f7711b[g.CLASS.ordinal()] = 46;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                f7711b[g.fill.ordinal()] = 47;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                f7711b[g.fill_rule.ordinal()] = 48;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                f7711b[g.fill_opacity.ordinal()] = 49;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                f7711b[g.stroke.ordinal()] = 50;
            } catch (NoSuchFieldError unused50) {
            }
            try {
                f7711b[g.stroke_opacity.ordinal()] = 51;
            } catch (NoSuchFieldError unused51) {
            }
            try {
                f7711b[g.stroke_width.ordinal()] = 52;
            } catch (NoSuchFieldError unused52) {
            }
            try {
                f7711b[g.stroke_linecap.ordinal()] = 53;
            } catch (NoSuchFieldError unused53) {
            }
            try {
                f7711b[g.stroke_linejoin.ordinal()] = 54;
            } catch (NoSuchFieldError unused54) {
            }
            try {
                f7711b[g.stroke_miterlimit.ordinal()] = 55;
            } catch (NoSuchFieldError unused55) {
            }
            try {
                f7711b[g.stroke_dasharray.ordinal()] = 56;
            } catch (NoSuchFieldError unused56) {
            }
            try {
                f7711b[g.stroke_dashoffset.ordinal()] = 57;
            } catch (NoSuchFieldError unused57) {
            }
            try {
                f7711b[g.opacity.ordinal()] = 58;
            } catch (NoSuchFieldError unused58) {
            }
            try {
                f7711b[g.color.ordinal()] = 59;
            } catch (NoSuchFieldError unused59) {
            }
            try {
                f7711b[g.font.ordinal()] = 60;
            } catch (NoSuchFieldError unused60) {
            }
            try {
                f7711b[g.font_family.ordinal()] = 61;
            } catch (NoSuchFieldError unused61) {
            }
            try {
                f7711b[g.font_size.ordinal()] = 62;
            } catch (NoSuchFieldError unused62) {
            }
            try {
                f7711b[g.font_weight.ordinal()] = 63;
            } catch (NoSuchFieldError unused63) {
            }
            try {
                f7711b[g.font_style.ordinal()] = 64;
            } catch (NoSuchFieldError unused64) {
            }
            try {
                f7711b[g.text_decoration.ordinal()] = 65;
            } catch (NoSuchFieldError unused65) {
            }
            try {
                f7711b[g.direction.ordinal()] = 66;
            } catch (NoSuchFieldError unused66) {
            }
            try {
                f7711b[g.text_anchor.ordinal()] = 67;
            } catch (NoSuchFieldError unused67) {
            }
            try {
                f7711b[g.overflow.ordinal()] = 68;
            } catch (NoSuchFieldError unused68) {
            }
            try {
                f7711b[g.marker.ordinal()] = 69;
            } catch (NoSuchFieldError unused69) {
            }
            try {
                f7711b[g.marker_start.ordinal()] = 70;
            } catch (NoSuchFieldError unused70) {
            }
            try {
                f7711b[g.marker_mid.ordinal()] = 71;
            } catch (NoSuchFieldError unused71) {
            }
            try {
                f7711b[g.marker_end.ordinal()] = 72;
            } catch (NoSuchFieldError unused72) {
            }
            try {
                f7711b[g.display.ordinal()] = 73;
            } catch (NoSuchFieldError unused73) {
            }
            try {
                f7711b[g.visibility.ordinal()] = 74;
            } catch (NoSuchFieldError unused74) {
            }
            try {
                f7711b[g.stop_color.ordinal()] = 75;
            } catch (NoSuchFieldError unused75) {
            }
            try {
                f7711b[g.stop_opacity.ordinal()] = 76;
            } catch (NoSuchFieldError unused76) {
            }
            try {
                f7711b[g.clip.ordinal()] = 77;
            } catch (NoSuchFieldError unused77) {
            }
            try {
                f7711b[g.clip_path.ordinal()] = 78;
            } catch (NoSuchFieldError unused78) {
            }
            try {
                f7711b[g.clip_rule.ordinal()] = 79;
            } catch (NoSuchFieldError unused79) {
            }
            try {
                f7711b[g.mask.ordinal()] = 80;
            } catch (NoSuchFieldError unused80) {
            }
            try {
                f7711b[g.solid_color.ordinal()] = 81;
            } catch (NoSuchFieldError unused81) {
            }
            try {
                f7711b[g.solid_opacity.ordinal()] = 82;
            } catch (NoSuchFieldError unused82) {
            }
            try {
                f7711b[g.viewport_fill.ordinal()] = 83;
            } catch (NoSuchFieldError unused83) {
            }
            try {
                f7711b[g.viewport_fill_opacity.ordinal()] = 84;
            } catch (NoSuchFieldError unused84) {
            }
            try {
                f7711b[g.vector_effect.ordinal()] = 85;
            } catch (NoSuchFieldError unused85) {
            }
            try {
                f7711b[g.image_rendering.ordinal()] = 86;
            } catch (NoSuchFieldError unused86) {
            }
            try {
                f7711b[g.viewBox.ordinal()] = 87;
            } catch (NoSuchFieldError unused87) {
            }
            try {
                f7711b[g.type.ordinal()] = 88;
            } catch (NoSuchFieldError unused88) {
            }
            try {
                f7711b[g.media.ordinal()] = 89;
            } catch (NoSuchFieldError unused89) {
            }
            int[] iArr2 = new int[h.values().length];
            f7710a = iArr2;
            try {
                iArr2[h.svg.ordinal()] = 1;
            } catch (NoSuchFieldError unused90) {
            }
            try {
                f7710a[h.g.ordinal()] = 2;
            } catch (NoSuchFieldError unused91) {
            }
            try {
                f7710a[h.a.ordinal()] = 3;
            } catch (NoSuchFieldError unused92) {
            }
            try {
                f7710a[h.defs.ordinal()] = 4;
            } catch (NoSuchFieldError unused93) {
            }
            try {
                f7710a[h.use.ordinal()] = 5;
            } catch (NoSuchFieldError unused94) {
            }
            try {
                f7710a[h.path.ordinal()] = 6;
            } catch (NoSuchFieldError unused95) {
            }
            try {
                f7710a[h.rect.ordinal()] = 7;
            } catch (NoSuchFieldError unused96) {
            }
            try {
                f7710a[h.circle.ordinal()] = 8;
            } catch (NoSuchFieldError unused97) {
            }
            try {
                f7710a[h.ellipse.ordinal()] = 9;
            } catch (NoSuchFieldError unused98) {
            }
            try {
                f7710a[h.line.ordinal()] = 10;
            } catch (NoSuchFieldError unused99) {
            }
            try {
                f7710a[h.polyline.ordinal()] = 11;
            } catch (NoSuchFieldError unused100) {
            }
            try {
                f7710a[h.polygon.ordinal()] = 12;
            } catch (NoSuchFieldError unused101) {
            }
            try {
                f7710a[h.text.ordinal()] = 13;
            } catch (NoSuchFieldError unused102) {
            }
            try {
                f7710a[h.tspan.ordinal()] = 14;
            } catch (NoSuchFieldError unused103) {
            }
            try {
                f7710a[h.tref.ordinal()] = 15;
            } catch (NoSuchFieldError unused104) {
            }
            try {
                f7710a[h.SWITCH.ordinal()] = 16;
            } catch (NoSuchFieldError unused105) {
            }
            try {
                f7710a[h.symbol.ordinal()] = 17;
            } catch (NoSuchFieldError unused106) {
            }
            try {
                f7710a[h.marker.ordinal()] = 18;
            } catch (NoSuchFieldError unused107) {
            }
            try {
                f7710a[h.linearGradient.ordinal()] = 19;
            } catch (NoSuchFieldError unused108) {
            }
            try {
                f7710a[h.radialGradient.ordinal()] = 20;
            } catch (NoSuchFieldError unused109) {
            }
            try {
                f7710a[h.stop.ordinal()] = 21;
            } catch (NoSuchFieldError unused110) {
            }
            try {
                f7710a[h.title.ordinal()] = 22;
            } catch (NoSuchFieldError unused111) {
            }
            try {
                f7710a[h.desc.ordinal()] = 23;
            } catch (NoSuchFieldError unused112) {
            }
            try {
                f7710a[h.clipPath.ordinal()] = 24;
            } catch (NoSuchFieldError unused113) {
            }
            try {
                f7710a[h.textPath.ordinal()] = 25;
            } catch (NoSuchFieldError unused114) {
            }
            try {
                f7710a[h.pattern.ordinal()] = 26;
            } catch (NoSuchFieldError unused115) {
            }
            try {
                f7710a[h.image.ordinal()] = 27;
            } catch (NoSuchFieldError unused116) {
            }
            try {
                f7710a[h.view.ordinal()] = 28;
            } catch (NoSuchFieldError unused117) {
            }
            try {
                f7710a[h.mask.ordinal()] = 29;
            } catch (NoSuchFieldError unused118) {
            }
            try {
                f7710a[h.style.ordinal()] = 30;
            } catch (NoSuchFieldError unused119) {
            }
            try {
                f7710a[h.solidColor.ordinal()] = 31;
            } catch (NoSuchFieldError unused120) {
            }
        }
    }

    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final Map f7712a;

        static {
            HashMap map = new HashMap(10);
            f7712a = map;
            map.put("none", N4.e.a.none);
            map.put("xMinYMin", N4.e.a.xMinYMin);
            map.put("xMidYMin", N4.e.a.xMidYMin);
            map.put("xMaxYMin", N4.e.a.xMaxYMin);
            map.put("xMinYMid", N4.e.a.xMinYMid);
            map.put("xMidYMid", N4.e.a.xMidYMid);
            map.put("xMaxYMid", N4.e.a.xMaxYMid);
            map.put("xMinYMax", N4.e.a.xMinYMax);
            map.put("xMidYMax", N4.e.a.xMidYMax);
            map.put("xMaxYMax", N4.e.a.xMaxYMax);
        }

        static N4.e.a a(String str) {
            return (N4.e.a) f7712a.get(str);
        }
    }

    private static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final Map f7713a;

        static {
            HashMap map = new HashMap(47);
            f7713a = map;
            map.put("aliceblue", -984833);
            map.put("antiquewhite", -332841);
            map.put("aqua", -16711681);
            map.put("aquamarine", -8388652);
            map.put("azure", -983041);
            map.put("beige", -657956);
            map.put("bisque", -6972);
            map.put("black", -16777216);
            map.put("blanchedalmond", -5171);
            map.put("blue", -16776961);
            map.put("blueviolet", -7722014);
            map.put("brown", -5952982);
            map.put("burlywood", -2180985);
            map.put("cadetblue", -10510688);
            map.put("chartreuse", -8388864);
            map.put("chocolate", -2987746);
            map.put("coral", -32944);
            map.put("cornflowerblue", -10185235);
            map.put("cornsilk", -1828);
            map.put("crimson", -2354116);
            map.put("cyan", -16711681);
            map.put("darkblue", -16777077);
            map.put("darkcyan", -16741493);
            map.put("darkgoldenrod", -4684277);
            map.put("darkgray", -5658199);
            map.put("darkgreen", -16751616);
            map.put("darkgrey", -5658199);
            map.put("darkkhaki", -4343957);
            map.put("darkmagenta", -7667573);
            map.put("darkolivegreen", -11179217);
            map.put("darkorange", -29696);
            map.put("darkorchid", -6737204);
            map.put("darkred", -7667712);
            map.put("darksalmon", -1468806);
            map.put("darkseagreen", -7357297);
            map.put("darkslateblue", -12042869);
            map.put("darkslategray", -13676721);
            map.put("darkslategrey", -13676721);
            map.put("darkturquoise", -16724271);
            map.put("darkviolet", -7077677);
            map.put("deeppink", -60269);
            map.put("deepskyblue", -16728065);
            map.put("dimgray", -9868951);
            map.put("dimgrey", -9868951);
            map.put("dodgerblue", -14774017);
            map.put("firebrick", -5103070);
            map.put("floralwhite", -1296);
            map.put("forestgreen", -14513374);
            map.put("fuchsia", -65281);
            map.put("gainsboro", -2302756);
            map.put("ghostwhite", -460545);
            map.put("gold", -10496);
            map.put("goldenrod", -2448096);
            map.put("gray", -8355712);
            map.put("green", -16744448);
            map.put("greenyellow", -5374161);
            map.put("grey", -8355712);
            map.put("honeydew", -983056);
            map.put("hotpink", -38476);
            map.put("indianred", -3318692);
            map.put("indigo", -11861886);
            map.put("ivory", -16);
            map.put("khaki", -989556);
            map.put("lavender", -1644806);
            map.put("lavenderblush", -3851);
            map.put("lawngreen", -8586240);
            map.put("lemonchiffon", -1331);
            map.put("lightblue", -5383962);
            map.put("lightcoral", -1015680);
            map.put("lightcyan", -2031617);
            map.put("lightgoldenrodyellow", -329006);
            map.put("lightgray", -2894893);
            map.put("lightgreen", -7278960);
            map.put("lightgrey", -2894893);
            map.put("lightpink", -18751);
            map.put("lightsalmon", -24454);
            map.put("lightseagreen", -14634326);
            map.put("lightskyblue", -7876870);
            map.put("lightslategray", -8943463);
            map.put("lightslategrey", -8943463);
            map.put("lightsteelblue", -5192482);
            map.put("lightyellow", -32);
            map.put("lime", -16711936);
            map.put("limegreen", -13447886);
            map.put("linen", -331546);
            map.put("magenta", -65281);
            map.put("maroon", -8388608);
            map.put("mediumaquamarine", -10039894);
            map.put("mediumblue", -16777011);
            map.put("mediumorchid", -4565549);
            map.put("mediumpurple", -7114533);
            map.put("mediumseagreen", -12799119);
            map.put("mediumslateblue", -8689426);
            map.put("mediumspringgreen", -16713062);
            map.put("mediumturquoise", -12004916);
            map.put("mediumvioletred", -3730043);
            map.put("midnightblue", -15132304);
            map.put("mintcream", -655366);
            map.put("mistyrose", -6943);
            map.put("moccasin", -6987);
            map.put("navajowhite", -8531);
            map.put("navy", -16777088);
            map.put("oldlace", -133658);
            map.put("olive", -8355840);
            map.put("olivedrab", -9728477);
            map.put("orange", -23296);
            map.put("orangered", -47872);
            map.put("orchid", -2461482);
            map.put("palegoldenrod", -1120086);
            map.put("palegreen", -6751336);
            map.put("paleturquoise", -5247250);
            map.put("palevioletred", -2396013);
            map.put("papayawhip", -4139);
            map.put("peachpuff", -9543);
            map.put("peru", -3308225);
            map.put("pink", -16181);
            map.put("plum", -2252579);
            map.put("powderblue", -5185306);
            map.put("purple", -8388480);
            map.put("rebeccapurple", -10079335);
            map.put("red", -65536);
            map.put("rosybrown", -4419697);
            map.put("royalblue", -12490271);
            map.put("saddlebrown", -7650029);
            map.put("salmon", -360334);
            map.put("sandybrown", -744352);
            map.put("seagreen", -13726889);
            map.put("seashell", -2578);
            map.put("sienna", -6270419);
            map.put("silver", -4144960);
            map.put("skyblue", -7876885);
            map.put("slateblue", -9807155);
            map.put("slategray", -9404272);
            map.put("slategrey", -9404272);
            map.put("snow", -1286);
            map.put("springgreen", -16711809);
            map.put("steelblue", -12156236);
            map.put("tan", -2968436);
            map.put("teal", -16744320);
            map.put("thistle", -2572328);
            map.put("tomato", -40121);
            map.put("turquoise", -12525360);
            map.put("violet", -1146130);
            map.put("wheat", -663885);
            map.put("white", -1);
            map.put("whitesmoke", -657931);
            map.put("yellow", -256);
            map.put("yellowgreen", -6632142);
            map.put("transparent", 0);
        }

        static Integer a(String str) {
            return (Integer) f7713a.get(str);
        }
    }

    private static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final Map f7714a;

        static {
            HashMap map = new HashMap(9);
            f7714a = map;
            N4.g.d0 d0Var = N4.g.d0.pt;
            map.put("xx-small", new N4.g.C1195p(0.694f, d0Var));
            map.put("x-small", new N4.g.C1195p(0.833f, d0Var));
            map.put("small", new N4.g.C1195p(10.0f, d0Var));
            map.put("medium", new N4.g.C1195p(12.0f, d0Var));
            map.put("large", new N4.g.C1195p(14.4f, d0Var));
            map.put("x-large", new N4.g.C1195p(17.3f, d0Var));
            map.put("xx-large", new N4.g.C1195p(20.7f, d0Var));
            N4.g.d0 d0Var2 = N4.g.d0.percent;
            map.put("smaller", new N4.g.C1195p(83.33f, d0Var2));
            map.put("larger", new N4.g.C1195p(120.0f, d0Var2));
        }

        static N4.g.C1195p a(String str) {
            return (N4.g.C1195p) f7714a.get(str);
        }
    }

    private static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final Map f7715a;

        static {
            HashMap map = new HashMap(13);
            f7715a = map;
            map.put("normal", 400);
            map.put("bold", 700);
            map.put("bolder", 1);
            map.put("lighter", -1);
            map.put("100", 100);
            map.put("200", 200);
            map.put("300", 300);
            map.put("400", 400);
            map.put("500", 500);
            map.put("600", 600);
            map.put("700", 700);
            map.put("800", 800);
            map.put("900", 900);
        }

        static Integer a(String str) {
            return (Integer) f7715a.get(str);
        }
    }

    private class f extends DefaultHandler2 {
        private f() {
        }

        /* synthetic */ f(k kVar, a aVar) {
            this();
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void characters(char[] cArr, int i10, int i11) {
            k.this.c1(new String(cArr, i10, i11));
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void endDocument() {
            k.this.o();
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void endElement(String str, String str2, String str3) {
            k.this.p(str, str2, str3);
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void processingInstruction(String str, String str2) {
            k.this.r(str, k.this.x0(new i(str2)));
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void startDocument() {
            k.this.W0();
        }

        @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
        public void startElement(String str, String str2, String str3, Attributes attributes) throws N4.j {
            k.this.X0(str, str2, str3, attributes);
        }
    }

    private enum g {
        CLASS,
        clip,
        clip_path,
        clipPathUnits,
        clip_rule,
        color,
        cx,
        cy,
        direction,
        dx,
        dy,
        fx,
        fy,
        d,
        display,
        fill,
        fill_rule,
        fill_opacity,
        font,
        font_family,
        font_size,
        font_weight,
        font_style,
        gradientTransform,
        gradientUnits,
        height,
        href,
        image_rendering,
        marker,
        marker_start,
        marker_mid,
        marker_end,
        markerHeight,
        markerUnits,
        markerWidth,
        mask,
        maskContentUnits,
        maskUnits,
        media,
        offset,
        opacity,
        orient,
        overflow,
        pathLength,
        patternContentUnits,
        patternTransform,
        patternUnits,
        points,
        preserveAspectRatio,
        r,
        refX,
        refY,
        requiredFeatures,
        requiredExtensions,
        requiredFormats,
        requiredFonts,
        rx,
        ry,
        solid_color,
        solid_opacity,
        spreadMethod,
        startOffset,
        stop_color,
        stop_opacity,
        stroke,
        stroke_dasharray,
        stroke_dashoffset,
        stroke_linecap,
        stroke_linejoin,
        stroke_miterlimit,
        stroke_opacity,
        stroke_width,
        style,
        systemLanguage,
        text_anchor,
        text_decoration,
        transform,
        type,
        vector_effect,
        version,
        viewBox,
        width,
        x,
        y,
        x1,
        y1,
        x2,
        y2,
        viewport_fill,
        viewport_fill_opacity,
        visibility,
        UNSUPPORTED;


        /* JADX INFO: renamed from: O0, reason: collision with root package name */
        private static final Map f7746O0 = new HashMap();

        static {
            for (g gVar : values()) {
                if (gVar == CLASS) {
                    f7746O0.put("class", gVar);
                } else if (gVar != UNSUPPORTED) {
                    f7746O0.put(gVar.name().replace('_', '-'), gVar);
                }
            }
        }

        public static g e(String str) {
            g gVar = (g) f7746O0.get(str);
            return gVar != null ? gVar : UNSUPPORTED;
        }
    }

    private enum h {
        svg,
        a,
        circle,
        clipPath,
        defs,
        desc,
        ellipse,
        g,
        image,
        line,
        linearGradient,
        marker,
        mask,
        path,
        pattern,
        polygon,
        polyline,
        radialGradient,
        rect,
        solidColor,
        stop,
        style,
        SWITCH,
        symbol,
        text,
        textPath,
        title,
        tref,
        tspan,
        use,
        view,
        UNSUPPORTED;


        /* JADX INFO: renamed from: G, reason: collision with root package name */
        private static final Map f7817G = new HashMap();

        static {
            for (h hVar : values()) {
                if (hVar == SWITCH) {
                    f7817G.put("switch", hVar);
                } else if (hVar != UNSUPPORTED) {
                    f7817G.put(hVar.name(), hVar);
                }
            }
        }

        public static h e(String str) {
            h hVar = (h) f7817G.get(str);
            return hVar != null ? hVar : UNSUPPORTED;
        }
    }

    static class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f7845a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f7847c;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f7846b = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private N4.d f7848d = new N4.d();

        i(String str) {
            this.f7847c = 0;
            String strTrim = str.trim();
            this.f7845a = strTrim;
            this.f7847c = strTrim.length();
        }

        void A() {
            while (true) {
                int i10 = this.f7846b;
                if (i10 >= this.f7847c || !k(this.f7845a.charAt(i10))) {
                    return;
                } else {
                    this.f7846b++;
                }
            }
        }

        int a() {
            int i10 = this.f7846b;
            int i11 = this.f7847c;
            if (i10 == i11) {
                return -1;
            }
            int i12 = i10 + 1;
            this.f7846b = i12;
            if (i12 < i11) {
                return this.f7845a.charAt(i12);
            }
            return -1;
        }

        String b() {
            int i10 = this.f7846b;
            while (!h() && !k(this.f7845a.charAt(this.f7846b))) {
                this.f7846b++;
            }
            String strSubstring = this.f7845a.substring(i10, this.f7846b);
            this.f7846b = i10;
            return strSubstring;
        }

        Boolean c(Object obj) {
            if (obj == null) {
                return null;
            }
            z();
            return m();
        }

        float d(float f10) {
            if (Float.isNaN(f10)) {
                return Float.NaN;
            }
            z();
            return n();
        }

        float e(Boolean bool) {
            if (bool == null) {
                return Float.NaN;
            }
            z();
            return n();
        }

        boolean f(char c10) {
            int i10 = this.f7846b;
            boolean z10 = i10 < this.f7847c && this.f7845a.charAt(i10) == c10;
            if (z10) {
                this.f7846b++;
            }
            return z10;
        }

        boolean g(String str) {
            int length = str.length();
            int i10 = this.f7846b;
            boolean z10 = i10 <= this.f7847c - length && this.f7845a.substring(i10, i10 + length).equals(str);
            if (z10) {
                this.f7846b += length;
            }
            return z10;
        }

        boolean h() {
            return this.f7846b == this.f7847c;
        }

        boolean i() {
            int i10 = this.f7846b;
            if (i10 == this.f7847c) {
                return false;
            }
            char cCharAt = this.f7845a.charAt(i10);
            if (cCharAt < 'a' || cCharAt > 'z') {
                return cCharAt >= 'A' && cCharAt <= 'Z';
            }
            return true;
        }

        boolean j(int i10) {
            return i10 == 10 || i10 == 13;
        }

        boolean k(int i10) {
            return i10 == 32 || i10 == 10 || i10 == 13 || i10 == 9;
        }

        Integer l() {
            int i10 = this.f7846b;
            if (i10 == this.f7847c) {
                return null;
            }
            String str = this.f7845a;
            this.f7846b = i10 + 1;
            return Integer.valueOf(str.charAt(i10));
        }

        Boolean m() {
            int i10 = this.f7846b;
            if (i10 == this.f7847c) {
                return null;
            }
            char cCharAt = this.f7845a.charAt(i10);
            if (cCharAt != '0' && cCharAt != '1') {
                return null;
            }
            this.f7846b++;
            return Boolean.valueOf(cCharAt == '1');
        }

        float n() {
            float fB = this.f7848d.b(this.f7845a, this.f7846b, this.f7847c);
            if (!Float.isNaN(fB)) {
                this.f7846b = this.f7848d.a();
            }
            return fB;
        }

        String o() {
            if (h()) {
                return null;
            }
            int i10 = this.f7846b;
            int iCharAt = this.f7845a.charAt(i10);
            while (true) {
                if ((iCharAt < 97 || iCharAt > 122) && (iCharAt < 65 || iCharAt > 90)) {
                    break;
                }
                iCharAt = a();
            }
            int i11 = this.f7846b;
            while (k(iCharAt)) {
                iCharAt = a();
            }
            if (iCharAt == 40) {
                this.f7846b++;
                return this.f7845a.substring(i10, i11);
            }
            this.f7846b = i10;
            return null;
        }

        N4.g.C1195p p() {
            float fN = n();
            if (Float.isNaN(fN)) {
                return null;
            }
            N4.g.d0 d0VarV = v();
            return d0VarV == null ? new N4.g.C1195p(fN, N4.g.d0.px) : new N4.g.C1195p(fN, d0VarV);
        }

        String q() {
            if (h()) {
                return null;
            }
            int i10 = this.f7846b;
            char cCharAt = this.f7845a.charAt(i10);
            if (cCharAt != '\'' && cCharAt != '\"') {
                return null;
            }
            int iA = a();
            while (iA != -1 && iA != cCharAt) {
                iA = a();
            }
            if (iA == -1) {
                this.f7846b = i10;
                return null;
            }
            int i11 = this.f7846b;
            this.f7846b = i11 + 1;
            return this.f7845a.substring(i10 + 1, i11);
        }

        String r() {
            return t(' ', false);
        }

        String s(char c10) {
            return t(c10, false);
        }

        String t(char c10, boolean z10) {
            if (h()) {
                return null;
            }
            char cCharAt = this.f7845a.charAt(this.f7846b);
            if ((!z10 && k(cCharAt)) || cCharAt == c10) {
                return null;
            }
            int i10 = this.f7846b;
            int iA = a();
            while (iA != -1 && iA != c10 && (z10 || !k(iA))) {
                iA = a();
            }
            return this.f7845a.substring(i10, this.f7846b);
        }

        String u(char c10) {
            return t(c10, true);
        }

        N4.g.d0 v() {
            if (h()) {
                return null;
            }
            if (this.f7845a.charAt(this.f7846b) == '%') {
                this.f7846b++;
                return N4.g.d0.percent;
            }
            int i10 = this.f7846b;
            if (i10 > this.f7847c - 2) {
                return null;
            }
            try {
                N4.g.d0 d0VarValueOf = N4.g.d0.valueOf(this.f7845a.substring(i10, i10 + 2).toLowerCase(Locale.US));
                this.f7846b += 2;
                return d0VarValueOf;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        String w() {
            if (h()) {
                return null;
            }
            int i10 = this.f7846b;
            char cCharAt = this.f7845a.charAt(i10);
            if ((cCharAt < 'A' || cCharAt > 'Z') && (cCharAt < 'a' || cCharAt > 'z')) {
                this.f7846b = i10;
                return null;
            }
            int iA = a();
            while (true) {
                if ((iA < 65 || iA > 90) && (iA < 97 || iA > 122)) {
                    break;
                }
                iA = a();
            }
            return this.f7845a.substring(i10, this.f7846b);
        }

        float x() {
            z();
            float fB = this.f7848d.b(this.f7845a, this.f7846b, this.f7847c);
            if (!Float.isNaN(fB)) {
                this.f7846b = this.f7848d.a();
            }
            return fB;
        }

        String y() {
            if (h()) {
                return null;
            }
            int i10 = this.f7846b;
            this.f7846b = this.f7847c;
            return this.f7845a.substring(i10);
        }

        boolean z() {
            A();
            int i10 = this.f7846b;
            if (i10 == this.f7847c || this.f7845a.charAt(i10) != ',') {
                return false;
            }
            this.f7846b++;
            A();
            return true;
        }
    }

    private class j implements Attributes {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private XmlPullParser f7849a;

        public j(XmlPullParser xmlPullParser) {
            this.f7849a = xmlPullParser;
        }

        @Override // org.xml.sax.Attributes
        public int getIndex(String str) {
            return -1;
        }

        @Override // org.xml.sax.Attributes
        public int getIndex(String str, String str2) {
            return -1;
        }

        @Override // org.xml.sax.Attributes
        public int getLength() {
            return this.f7849a.getAttributeCount();
        }

        @Override // org.xml.sax.Attributes
        public String getLocalName(int i10) {
            return this.f7849a.getAttributeName(i10);
        }

        @Override // org.xml.sax.Attributes
        public String getQName(int i10) {
            String attributeName = this.f7849a.getAttributeName(i10);
            if (this.f7849a.getAttributePrefix(i10) == null) {
                return attributeName;
            }
            return this.f7849a.getAttributePrefix(i10) + ':' + attributeName;
        }

        @Override // org.xml.sax.Attributes
        public String getType(int i10) {
            return null;
        }

        @Override // org.xml.sax.Attributes
        public String getType(String str) {
            return null;
        }

        @Override // org.xml.sax.Attributes
        public String getType(String str, String str2) {
            return null;
        }

        @Override // org.xml.sax.Attributes
        public String getURI(int i10) {
            return this.f7849a.getAttributeNamespace(i10);
        }

        @Override // org.xml.sax.Attributes
        public String getValue(int i10) {
            return this.f7849a.getAttributeValue(i10);
        }

        @Override // org.xml.sax.Attributes
        public String getValue(String str) {
            return null;
        }

        @Override // org.xml.sax.Attributes
        public String getValue(String str, String str2) {
            return null;
        }
    }

    k() {
    }

    private void A(N4.g.C1184d c1184d, Attributes attributes) throws N4.j {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            switch (a.f7711b[g.e(attributes.getLocalName(i10)).ordinal()]) {
                case 12:
                    c1184d.f7566o = o0(strTrim);
                    break;
                case 13:
                    c1184d.f7567p = o0(strTrim);
                    break;
                case 14:
                    N4.g.C1195p c1195pO0 = o0(strTrim);
                    c1184d.f7568q = c1195pO0;
                    if (c1195pO0.h()) {
                        throw new N4.j("Invalid <circle> element. r cannot be negative");
                    }
                    break;
                    break;
            }
        }
    }

    private static Set A0(String str) {
        i iVar = new i(str);
        HashSet hashSet = new HashSet();
        while (!iVar.h()) {
            hashSet.add(iVar.r());
            iVar.A();
        }
        return hashSet;
    }

    private void B(N4.g.C1185e c1185e, Attributes attributes) throws N4.j {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            if (a.f7711b[g.e(attributes.getLocalName(i10)).ordinal()] == 38) {
                if ("objectBoundingBox".equals(strTrim)) {
                    c1185e.f7579p = Boolean.FALSE;
                } else {
                    if (!"userSpaceOnUse".equals(strTrim)) {
                        throw new N4.j("Invalid value for attribute clipPathUnits");
                    }
                    c1185e.f7579p = Boolean.TRUE;
                }
            }
        }
    }

    private static N4.g.C1195p[] B0(String str) {
        N4.g.C1195p c1195pP;
        i iVar = new i(str);
        iVar.A();
        if (iVar.h() || (c1195pP = iVar.p()) == null || c1195pP.h()) {
            return null;
        }
        float fB = c1195pP.b();
        ArrayList arrayList = new ArrayList();
        arrayList.add(c1195pP);
        while (!iVar.h()) {
            iVar.z();
            N4.g.C1195p c1195pP2 = iVar.p();
            if (c1195pP2 == null || c1195pP2.h()) {
                return null;
            }
            arrayList.add(c1195pP2);
            fB += c1195pP2.b();
        }
        if (fB == 0.0f) {
            return null;
        }
        return (N4.g.C1195p[]) arrayList.toArray(new N4.g.C1195p[arrayList.size()]);
    }

    private void C(N4.g.G g10, Attributes attributes) {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            switch (a.f7711b[g.e(attributes.getLocalName(i10)).ordinal()]) {
                case 21:
                    g10.f(z0(strTrim));
                    break;
                case 22:
                    g10.k(strTrim);
                    break;
                case 23:
                    g10.h(F0(strTrim));
                    break;
                case 24:
                    g10.j(A0(strTrim));
                    break;
                case 25:
                    List listI0 = i0(strTrim);
                    g10.d(listI0 != null ? new HashSet(listI0) : new HashSet(0));
                    break;
            }
        }
    }

    private static N4.g.E.c C0(String str) {
        if ("butt".equals(str)) {
            return N4.g.E.c.Butt;
        }
        if ("round".equals(str)) {
            return N4.g.E.c.Round;
        }
        if ("square".equals(str)) {
            return N4.g.E.c.Square;
        }
        return null;
    }

    private void D(N4.g.L l10, Attributes attributes) throws N4.j {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String qName = attributes.getQName(i10);
            if (qName.equals("id") || qName.equals("xml:id")) {
                l10.f7526c = attributes.getValue(i10).trim();
                return;
            }
            if (qName.equals("xml:space")) {
                String strTrim = attributes.getValue(i10).trim();
                if ("default".equals(strTrim)) {
                    l10.f7527d = Boolean.FALSE;
                    return;
                } else {
                    if ("preserve".equals(strTrim)) {
                        l10.f7527d = Boolean.TRUE;
                        return;
                    }
                    throw new N4.j("Invalid value for \"xml:space\" attribute: " + strTrim);
                }
            }
        }
    }

    private static N4.g.E.d D0(String str) {
        if ("miter".equals(str)) {
            return N4.g.E.d.Miter;
        }
        if ("round".equals(str)) {
            return N4.g.E.d.Round;
        }
        if ("bevel".equals(str)) {
            return N4.g.E.d.Bevel;
        }
        return null;
    }

    private void E(N4.g.C1188i c1188i, Attributes attributes) throws N4.j {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            switch (a.f7711b[g.e(attributes.getLocalName(i10)).ordinal()]) {
                case 10:
                    N4.g.C1195p c1195pO0 = o0(strTrim);
                    c1188i.f7591q = c1195pO0;
                    if (c1195pO0.h()) {
                        throw new N4.j("Invalid <ellipse> element. rx cannot be negative");
                    }
                    break;
                    break;
                case 11:
                    N4.g.C1195p c1195pO1 = o0(strTrim);
                    c1188i.f7592r = c1195pO1;
                    if (c1195pO1.h()) {
                        throw new N4.j("Invalid <ellipse> element. ry cannot be negative");
                    }
                    break;
                    break;
                case 12:
                    c1188i.f7589o = o0(strTrim);
                    break;
                case 13:
                    c1188i.f7590p = o0(strTrim);
                    break;
            }
        }
    }

    private static void E0(N4.g.L l10, String str) {
        i iVar = new i(str.replaceAll("/\\*.*?\\*/", ""));
        while (true) {
            String strS = iVar.s(':');
            iVar.A();
            if (!iVar.f(':')) {
                return;
            }
            iVar.A();
            String strU = iVar.u(';');
            if (strU == null) {
                return;
            }
            iVar.A();
            if (iVar.h() || iVar.f(';')) {
                if (l10.f7529f == null) {
                    l10.f7529f = new N4.g.E();
                }
                S0(l10.f7529f, strS, strU);
                iVar.A();
            }
        }
    }

    private void F(N4.g.AbstractC1189j abstractC1189j, Attributes attributes) throws N4.j {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            int i11 = a.f7711b[g.e(attributes.getLocalName(i10)).ordinal()];
            if (i11 != 6) {
                switch (i11) {
                    case 32:
                        if (!"objectBoundingBox".equals(strTrim)) {
                            if (!"userSpaceOnUse".equals(strTrim)) {
                                throw new N4.j("Invalid value for attribute gradientUnits");
                            }
                            abstractC1189j.f7594i = Boolean.TRUE;
                        } else {
                            abstractC1189j.f7594i = Boolean.FALSE;
                        }
                        break;
                    case 33:
                        abstractC1189j.f7595j = J0(strTrim);
                        break;
                    case 34:
                        try {
                            abstractC1189j.f7596k = N4.g.EnumC1190k.valueOf(strTrim);
                        } catch (IllegalArgumentException unused) {
                            throw new N4.j("Invalid spreadMethod attribute. \"" + strTrim + "\" is not a valid value.");
                        }
                        break;
                }
            } else if ("".equals(attributes.getURI(i10)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i10))) {
                abstractC1189j.f7597l = strTrim;
            }
        }
    }

    private static Set F0(String str) {
        i iVar = new i(str);
        HashSet hashSet = new HashSet();
        while (!iVar.h()) {
            String strR = iVar.r();
            int iIndexOf = strR.indexOf(45);
            if (iIndexOf != -1) {
                strR = strR.substring(0, iIndexOf);
            }
            hashSet.add(new Locale(strR, "", "").getLanguage());
            iVar.A();
        }
        return hashSet;
    }

    private void G(N4.g.C1194o c1194o, Attributes attributes) throws N4.j {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            int i11 = a.f7711b[g.e(attributes.getLocalName(i10)).ordinal()];
            if (i11 == 1) {
                c1194o.f7605q = o0(strTrim);
            } else if (i11 == 2) {
                c1194o.f7606r = o0(strTrim);
            } else if (i11 == 3) {
                N4.g.C1195p c1195pO0 = o0(strTrim);
                c1194o.f7607s = c1195pO0;
                if (c1195pO0.h()) {
                    throw new N4.j("Invalid <use> element. width cannot be negative");
                }
            } else if (i11 == 4) {
                N4.g.C1195p c1195pO1 = o0(strTrim);
                c1194o.f7608t = c1195pO1;
                if (c1195pO1.h()) {
                    throw new N4.j("Invalid <use> element. height cannot be negative");
                }
            } else if (i11 != 6) {
                if (i11 == 7) {
                    w0(c1194o, strTrim);
                }
            } else if ("".equals(attributes.getURI(i10)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i10))) {
                c1194o.f7604p = strTrim;
            }
        }
    }

    private static N4.g.E.f G0(String str) {
        str.getClass();
        switch (str) {
            case "middle":
                return N4.g.E.f.Middle;
            case "end":
                return N4.g.E.f.End;
            case "start":
                return N4.g.E.f.Start;
            default:
                return null;
        }
    }

    private void H(N4.g.C1196q c1196q, Attributes attributes) {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            switch (a.f7711b[g.e(attributes.getLocalName(i10)).ordinal()]) {
                case 15:
                    c1196q.f7612o = o0(strTrim);
                    break;
                case 16:
                    c1196q.f7613p = o0(strTrim);
                    break;
                case 17:
                    c1196q.f7614q = o0(strTrim);
                    break;
                case 18:
                    c1196q.f7615r = o0(strTrim);
                    break;
            }
        }
    }

    private static N4.g.E.EnumC0131g H0(String str) {
        str.getClass();
        switch (str) {
            case "line-through":
                return N4.g.E.EnumC0131g.LineThrough;
            case "underline":
                return N4.g.E.EnumC0131g.Underline;
            case "none":
                return N4.g.E.EnumC0131g.None;
            case "blink":
                return N4.g.E.EnumC0131g.Blink;
            case "overline":
                return N4.g.E.EnumC0131g.Overline;
            default:
                return null;
        }
    }

    private void I(N4.g.M m10, Attributes attributes) {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            switch (a.f7711b[g.e(attributes.getLocalName(i10)).ordinal()]) {
                case 15:
                    m10.f7531m = o0(strTrim);
                    break;
                case 16:
                    m10.f7532n = o0(strTrim);
                    break;
                case 17:
                    m10.f7533o = o0(strTrim);
                    break;
                case 18:
                    m10.f7534p = o0(strTrim);
                    break;
            }
        }
    }

    private static N4.g.E.h I0(String str) {
        str.getClass();
        if (str.equals("ltr")) {
            return N4.g.E.h.LTR;
        }
        if (str.equals("rtl")) {
            return N4.g.E.h.RTL;
        }
        return null;
    }

    private void J(N4.g.C1197r c1197r, Attributes attributes) throws N4.j {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            switch (a.f7711b[g.e(attributes.getLocalName(i10)).ordinal()]) {
                case 26:
                    c1197r.f7617r = o0(strTrim);
                    break;
                case 27:
                    c1197r.f7618s = o0(strTrim);
                    break;
                case 28:
                    N4.g.C1195p c1195pO0 = o0(strTrim);
                    c1197r.f7619t = c1195pO0;
                    if (c1195pO0.h()) {
                        throw new N4.j("Invalid <marker> element. markerWidth cannot be negative");
                    }
                    break;
                    break;
                case 29:
                    N4.g.C1195p c1195pO1 = o0(strTrim);
                    c1197r.f7620u = c1195pO1;
                    if (c1195pO1.h()) {
                        throw new N4.j("Invalid <marker> element. markerHeight cannot be negative");
                    }
                    break;
                    break;
                case 30:
                    if (!"strokeWidth".equals(strTrim)) {
                        if (!"userSpaceOnUse".equals(strTrim)) {
                            throw new N4.j("Invalid value for attribute markerUnits");
                        }
                        c1197r.f7616q = true;
                    } else {
                        c1197r.f7616q = false;
                    }
                    break;
                case 31:
                    if ("auto".equals(strTrim)) {
                        c1197r.f7621v = Float.valueOf(Float.NaN);
                    } else {
                        c1197r.f7621v = Float.valueOf(f0(strTrim));
                    }
                    break;
            }
        }
    }

    private Matrix J0(String str) throws N4.j {
        Matrix matrix = new Matrix();
        i iVar = new i(str);
        iVar.A();
        while (!iVar.h()) {
            String strO = iVar.o();
            if (strO == null) {
                throw new N4.j("Bad transform function encountered in transform list: " + str);
            }
            switch (strO) {
                case "matrix":
                    iVar.A();
                    float fN = iVar.n();
                    iVar.z();
                    float fN2 = iVar.n();
                    iVar.z();
                    float fN3 = iVar.n();
                    iVar.z();
                    float fN4 = iVar.n();
                    iVar.z();
                    float fN5 = iVar.n();
                    iVar.z();
                    float fN6 = iVar.n();
                    iVar.A();
                    if (Float.isNaN(fN6) || !iVar.f(')')) {
                        throw new N4.j("Invalid transform list: " + str);
                    }
                    Matrix matrix2 = new Matrix();
                    matrix2.setValues(new float[]{fN, fN3, fN5, fN2, fN4, fN6, 0.0f, 0.0f, 1.0f});
                    matrix.preConcat(matrix2);
                    break;
                    break;
                case "rotate":
                    iVar.A();
                    float fN7 = iVar.n();
                    float fX = iVar.x();
                    float fX2 = iVar.x();
                    iVar.A();
                    if (Float.isNaN(fN7) || !iVar.f(')')) {
                        throw new N4.j("Invalid transform list: " + str);
                    }
                    if (Float.isNaN(fX)) {
                        matrix.preRotate(fN7);
                    } else {
                        if (Float.isNaN(fX2)) {
                            throw new N4.j("Invalid transform list: " + str);
                        }
                        matrix.preRotate(fN7, fX, fX2);
                    }
                    break;
                    break;
                case "scale":
                    iVar.A();
                    float fN8 = iVar.n();
                    float fX3 = iVar.x();
                    iVar.A();
                    if (Float.isNaN(fN8) || !iVar.f(')')) {
                        throw new N4.j("Invalid transform list: " + str);
                    }
                    if (!Float.isNaN(fX3)) {
                        matrix.preScale(fN8, fX3);
                    } else {
                        matrix.preScale(fN8, fN8);
                    }
                    break;
                    break;
                case "skewX":
                    iVar.A();
                    float fN9 = iVar.n();
                    iVar.A();
                    if (Float.isNaN(fN9) || !iVar.f(')')) {
                        throw new N4.j("Invalid transform list: " + str);
                    }
                    matrix.preSkew((float) Math.tan(Math.toRadians(fN9)), 0.0f);
                    break;
                    break;
                case "skewY":
                    iVar.A();
                    float fN10 = iVar.n();
                    iVar.A();
                    if (Float.isNaN(fN10) || !iVar.f(')')) {
                        throw new N4.j("Invalid transform list: " + str);
                    }
                    matrix.preSkew(0.0f, (float) Math.tan(Math.toRadians(fN10)));
                    break;
                    break;
                case "translate":
                    iVar.A();
                    float fN11 = iVar.n();
                    float fX4 = iVar.x();
                    iVar.A();
                    if (Float.isNaN(fN11) || !iVar.f(')')) {
                        throw new N4.j("Invalid transform list: " + str);
                    }
                    if (!Float.isNaN(fX4)) {
                        matrix.preTranslate(fN11, fX4);
                    } else {
                        matrix.preTranslate(fN11, 0.0f);
                    }
                    break;
                    break;
                default:
                    throw new N4.j("Invalid transform list fn: " + strO + ")");
            }
            if (iVar.h()) {
                return matrix;
            }
            iVar.z();
        }
        return matrix;
    }

    private void K(N4.g.C1198s c1198s, Attributes attributes) throws N4.j {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            int i11 = a.f7711b[g.e(attributes.getLocalName(i10)).ordinal()];
            if (i11 == 1) {
                c1198s.f7624q = o0(strTrim);
            } else if (i11 == 2) {
                c1198s.f7625r = o0(strTrim);
            } else if (i11 == 3) {
                N4.g.C1195p c1195pO0 = o0(strTrim);
                c1198s.f7626s = c1195pO0;
                if (c1195pO0.h()) {
                    throw new N4.j("Invalid <mask> element. width cannot be negative");
                }
            } else if (i11 == 4) {
                N4.g.C1195p c1195pO1 = o0(strTrim);
                c1198s.f7627t = c1195pO1;
                if (c1195pO1.h()) {
                    throw new N4.j("Invalid <mask> element. height cannot be negative");
                }
            } else if (i11 != 43) {
                if (i11 != 44) {
                    continue;
                } else if ("objectBoundingBox".equals(strTrim)) {
                    c1198s.f7623p = Boolean.FALSE;
                } else {
                    if (!"userSpaceOnUse".equals(strTrim)) {
                        throw new N4.j("Invalid value for attribute maskContentUnits");
                    }
                    c1198s.f7623p = Boolean.TRUE;
                }
            } else if ("objectBoundingBox".equals(strTrim)) {
                c1198s.f7622o = Boolean.FALSE;
            } else {
                if (!"userSpaceOnUse".equals(strTrim)) {
                    throw new N4.j("Invalid value for attribute maskUnits");
                }
                c1198s.f7622o = Boolean.TRUE;
            }
        }
    }

    private void K0(InputStream inputStream) throws N4.j {
        Log.d("SVGParser", "Falling back to SAX parser");
        try {
            SAXParserFactory sAXParserFactoryNewInstance = SAXParserFactory.newInstance();
            sAXParserFactoryNewInstance.setFeature("http://xml.org/sax/features/external-general-entities", false);
            sAXParserFactoryNewInstance.setFeature("http://xml.org/sax/features/external-parameter-entities", false);
            XMLReader xMLReader = sAXParserFactoryNewInstance.newSAXParser().getXMLReader();
            f fVar = new f(this, null);
            xMLReader.setContentHandler(fVar);
            xMLReader.setProperty("http://xml.org/sax/properties/lexical-handler", fVar);
            xMLReader.parse(new InputSource(inputStream));
        } catch (IOException e10) {
            throw new N4.j("Stream error", e10);
        } catch (ParserConfigurationException e11) {
            throw new N4.j("XML parser problem", e11);
        } catch (SAXException e12) {
            throw new N4.j("SVG parse error", e12);
        }
    }

    private void L(N4.g.C1201v c1201v, Attributes attributes) throws N4.j {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            int i11 = a.f7711b[g.e(attributes.getLocalName(i10)).ordinal()];
            if (i11 == 8) {
                c1201v.f7630o = u0(strTrim);
            } else if (i11 != 9) {
                continue;
            } else {
                Float fValueOf = Float.valueOf(f0(strTrim));
                c1201v.f7631p = fValueOf;
                if (fValueOf.floatValue() < 0.0f) {
                    throw new N4.j("Invalid <path> element. pathLength cannot be negative");
                }
            }
        }
    }

    private void L0(InputStream inputStream, boolean z10) throws N4.j {
        try {
            try {
                XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
                j jVar = new j(xmlPullParserNewPullParser);
                xmlPullParserNewPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-docdecl", false);
                xmlPullParserNewPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", true);
                xmlPullParserNewPullParser.setInput(inputStream, null);
                for (int eventType = xmlPullParserNewPullParser.getEventType(); eventType != 1; eventType = xmlPullParserNewPullParser.nextToken()) {
                    if (eventType == 0) {
                        W0();
                    } else if (eventType == 8) {
                        Log.d("SVGParser", "PROC INSTR: " + xmlPullParserNewPullParser.getText());
                        i iVar = new i(xmlPullParserNewPullParser.getText());
                        r(iVar.r(), x0(iVar));
                    } else if (eventType == 10) {
                        if (z10 && this.f7701a.m() == null && xmlPullParserNewPullParser.getText().contains("<!ENTITY ")) {
                            try {
                                Log.d("SVGParser", "Switching to SAX parser to process entities");
                                inputStream.reset();
                                K0(inputStream);
                                return;
                            } catch (IOException unused) {
                                Log.w("SVGParser", "Detected internal entity definitions, but could not parse them.");
                                return;
                            }
                        }
                    } else if (eventType == 2) {
                        String name = xmlPullParserNewPullParser.getName();
                        if (xmlPullParserNewPullParser.getPrefix() != null) {
                            name = xmlPullParserNewPullParser.getPrefix() + ':' + name;
                        }
                        X0(xmlPullParserNewPullParser.getNamespace(), xmlPullParserNewPullParser.getName(), name, jVar);
                    } else if (eventType == 3) {
                        String name2 = xmlPullParserNewPullParser.getName();
                        if (xmlPullParserNewPullParser.getPrefix() != null) {
                            name2 = xmlPullParserNewPullParser.getPrefix() + ':' + name2;
                        }
                        p(xmlPullParserNewPullParser.getNamespace(), xmlPullParserNewPullParser.getName(), name2);
                    } else if (eventType == 4) {
                        int[] iArr = new int[2];
                        e1(xmlPullParserNewPullParser.getTextCharacters(iArr), iArr[0], iArr[1]);
                    } else if (eventType == 5) {
                        c1(xmlPullParserNewPullParser.getText());
                    }
                }
                o();
            } catch (IOException e10) {
                throw new N4.j("Stream error", e10);
            }
        } catch (XmlPullParserException e11) {
            throw new N4.j("XML parser problem", e11);
        }
    }

    private void M(N4.g.C1204y c1204y, Attributes attributes) throws N4.j {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            int i11 = a.f7711b[g.e(attributes.getLocalName(i10)).ordinal()];
            if (i11 == 1) {
                c1204y.f7639t = o0(strTrim);
            } else if (i11 == 2) {
                c1204y.f7640u = o0(strTrim);
            } else if (i11 == 3) {
                N4.g.C1195p c1195pO0 = o0(strTrim);
                c1204y.f7641v = c1195pO0;
                if (c1195pO0.h()) {
                    throw new N4.j("Invalid <pattern> element. width cannot be negative");
                }
            } else if (i11 == 4) {
                N4.g.C1195p c1195pO1 = o0(strTrim);
                c1204y.f7642w = c1195pO1;
                if (c1195pO1.h()) {
                    throw new N4.j("Invalid <pattern> element. height cannot be negative");
                }
            } else if (i11 != 6) {
                switch (i11) {
                    case 40:
                        if (!"objectBoundingBox".equals(strTrim)) {
                            if (!"userSpaceOnUse".equals(strTrim)) {
                                throw new N4.j("Invalid value for attribute patternUnits");
                            }
                            c1204y.f7636q = Boolean.TRUE;
                        } else {
                            c1204y.f7636q = Boolean.FALSE;
                        }
                        break;
                    case 41:
                        if (!"objectBoundingBox".equals(strTrim)) {
                            if (!"userSpaceOnUse".equals(strTrim)) {
                                throw new N4.j("Invalid value for attribute patternContentUnits");
                            }
                            c1204y.f7637r = Boolean.TRUE;
                        } else {
                            c1204y.f7637r = Boolean.FALSE;
                        }
                        break;
                    case 42:
                        c1204y.f7638s = J0(strTrim);
                        break;
                }
            } else if ("".equals(attributes.getURI(i10)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i10))) {
                c1204y.f7643x = strTrim;
            }
        }
    }

    private static N4.g.E.i M0(String str) {
        str.getClass();
        if (str.equals("none")) {
            return N4.g.E.i.None;
        }
        if (str.equals("non-scaling-stroke")) {
            return N4.g.E.i.NonScalingStroke;
        }
        return null;
    }

    private void N(N4.g.C1205z c1205z, Attributes attributes, String str) throws N4.j {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            if (g.e(attributes.getLocalName(i10)) == g.points) {
                i iVar = new i(attributes.getValue(i10));
                ArrayList arrayList = new ArrayList();
                iVar.A();
                while (!iVar.h()) {
                    float fN = iVar.n();
                    if (Float.isNaN(fN)) {
                        throw new N4.j("Invalid <" + str + "> points attribute. Non-coordinate content found in list.");
                    }
                    iVar.z();
                    float fN2 = iVar.n();
                    if (Float.isNaN(fN2)) {
                        throw new N4.j("Invalid <" + str + "> points attribute. There should be an even number of coordinates.");
                    }
                    iVar.z();
                    arrayList.add(Float.valueOf(fN));
                    arrayList.add(Float.valueOf(fN2));
                }
                c1205z.f7644o = new float[arrayList.size()];
                Iterator it = arrayList.iterator();
                int i11 = 0;
                while (it.hasNext()) {
                    c1205z.f7644o[i11] = ((Float) it.next()).floatValue();
                    i11++;
                }
            }
        }
    }

    private static N4.g.C1182b N0(String str) throws N4.j {
        i iVar = new i(str);
        iVar.A();
        float fN = iVar.n();
        iVar.z();
        float fN2 = iVar.n();
        iVar.z();
        float fN3 = iVar.n();
        iVar.z();
        float fN4 = iVar.n();
        if (Float.isNaN(fN) || Float.isNaN(fN2) || Float.isNaN(fN3) || Float.isNaN(fN4)) {
            throw new N4.j("Invalid viewBox definition - should have four numbers");
        }
        if (fN3 < 0.0f) {
            throw new N4.j("Invalid viewBox. width cannot be negative");
        }
        if (fN4 >= 0.0f) {
            return new N4.g.C1182b(fN, fN2, fN3, fN4);
        }
        throw new N4.j("Invalid viewBox. height cannot be negative");
    }

    private void O(N4.g.Q q10, Attributes attributes) throws N4.j {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            int i11 = a.f7711b[g.e(attributes.getLocalName(i10)).ordinal()];
            if (i11 == 35) {
                q10.f7541p = o0(strTrim);
            } else if (i11 != 36) {
                switch (i11) {
                    case 12:
                        q10.f7538m = o0(strTrim);
                        break;
                    case 13:
                        q10.f7539n = o0(strTrim);
                        break;
                    case 14:
                        N4.g.C1195p c1195pO0 = o0(strTrim);
                        q10.f7540o = c1195pO0;
                        if (c1195pO0.h()) {
                            throw new N4.j("Invalid <radialGradient> element. r cannot be negative");
                        }
                        break;
                        break;
                }
            } else {
                q10.f7542q = o0(strTrim);
            }
        }
    }

    private void O0(Attributes attributes) throws N4.j {
        l("<path>", new Object[0]);
        if (this.f7702b == null) {
            throw new N4.j("Invalid document. Root element must be <svg>");
        }
        N4.g.C1201v c1201v = new N4.g.C1201v();
        c1201v.f7535a = this.f7701a;
        c1201v.f7536b = this.f7702b;
        D(c1201v, attributes);
        S(c1201v, attributes);
        W(c1201v, attributes);
        C(c1201v, attributes);
        L(c1201v, attributes);
        this.f7702b.i(c1201v);
    }

    private void P(N4.g.B b10, Attributes attributes) throws N4.j {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            int i11 = a.f7711b[g.e(attributes.getLocalName(i10)).ordinal()];
            if (i11 == 1) {
                b10.f7428o = o0(strTrim);
            } else if (i11 == 2) {
                b10.f7429p = o0(strTrim);
            } else if (i11 == 3) {
                N4.g.C1195p c1195pO0 = o0(strTrim);
                b10.f7430q = c1195pO0;
                if (c1195pO0.h()) {
                    throw new N4.j("Invalid <rect> element. width cannot be negative");
                }
            } else if (i11 == 4) {
                N4.g.C1195p c1195pO1 = o0(strTrim);
                b10.f7431r = c1195pO1;
                if (c1195pO1.h()) {
                    throw new N4.j("Invalid <rect> element. height cannot be negative");
                }
            } else if (i11 == 10) {
                N4.g.C1195p c1195pO2 = o0(strTrim);
                b10.f7432s = c1195pO2;
                if (c1195pO2.h()) {
                    throw new N4.j("Invalid <rect> element. rx cannot be negative");
                }
            } else if (i11 != 11) {
                continue;
            } else {
                N4.g.C1195p c1195pO3 = o0(strTrim);
                b10.f7433t = c1195pO3;
                if (c1195pO3.h()) {
                    throw new N4.j("Invalid <rect> element. ry cannot be negative");
                }
            }
        }
    }

    private void P0(Attributes attributes) throws N4.j {
        l("<pattern>", new Object[0]);
        if (this.f7702b == null) {
            throw new N4.j("Invalid document. Root element must be <svg>");
        }
        N4.g.C1204y c1204y = new N4.g.C1204y();
        c1204y.f7535a = this.f7701a;
        c1204y.f7536b = this.f7702b;
        D(c1204y, attributes);
        S(c1204y, attributes);
        C(c1204y, attributes);
        Y(c1204y, attributes);
        M(c1204y, attributes);
        this.f7702b.i(c1204y);
        this.f7702b = c1204y;
    }

    private void Q(N4.g.F f10, Attributes attributes) throws N4.j {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            int i11 = a.f7711b[g.e(attributes.getLocalName(i10)).ordinal()];
            if (i11 == 1) {
                f10.f7509q = o0(strTrim);
            } else if (i11 == 2) {
                f10.f7510r = o0(strTrim);
            } else if (i11 == 3) {
                N4.g.C1195p c1195pO0 = o0(strTrim);
                f10.f7511s = c1195pO0;
                if (c1195pO0.h()) {
                    throw new N4.j("Invalid <svg> element. width cannot be negative");
                }
            } else if (i11 == 4) {
                N4.g.C1195p c1195pO1 = o0(strTrim);
                f10.f7512t = c1195pO1;
                if (c1195pO1.h()) {
                    throw new N4.j("Invalid <svg> element. height cannot be negative");
                }
            } else if (i11 == 5) {
                f10.f7513u = strTrim;
            }
        }
    }

    private void Q0(Attributes attributes) throws N4.j {
        l("<polygon>", new Object[0]);
        if (this.f7702b == null) {
            throw new N4.j("Invalid document. Root element must be <svg>");
        }
        N4.g.C1205z a10 = new N4.g.A();
        a10.f7535a = this.f7701a;
        a10.f7536b = this.f7702b;
        D(a10, attributes);
        S(a10, attributes);
        W(a10, attributes);
        C(a10, attributes);
        N(a10, attributes, "polygon");
        this.f7702b.i(a10);
    }

    private void R(N4.g.D d10, Attributes attributes) {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            if (a.f7711b[g.e(attributes.getLocalName(i10)).ordinal()] == 37) {
                d10.f7434h = n0(strTrim);
            }
        }
    }

    private void R0(Attributes attributes) throws N4.j {
        l("<polyline>", new Object[0]);
        if (this.f7702b == null) {
            throw new N4.j("Invalid document. Root element must be <svg>");
        }
        N4.g.C1205z c1205z = new N4.g.C1205z();
        c1205z.f7535a = this.f7701a;
        c1205z.f7536b = this.f7702b;
        D(c1205z, attributes);
        S(c1205z, attributes);
        W(c1205z, attributes);
        C(c1205z, attributes);
        N(c1205z, attributes, "polyline");
        this.f7702b.i(c1205z);
    }

    private void S(N4.g.L l10, Attributes attributes) {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            if (strTrim.length() != 0) {
                int i11 = a.f7711b[g.e(attributes.getLocalName(i10)).ordinal()];
                if (i11 == 45) {
                    E0(l10, strTrim);
                } else if (i11 != 46) {
                    if (l10.f7528e == null) {
                        l10.f7528e = new N4.g.E();
                    }
                    S0(l10.f7528e, attributes.getLocalName(i10), attributes.getValue(i10).trim());
                } else {
                    l10.f7530g = N4.b.f(strTrim);
                }
            }
        }
    }

    static void S0(N4.g.E e10, String str, String str2) {
        if (str2.length() == 0 || str2.equals("inherit")) {
            return;
        }
        try {
            switch (a.f7711b[g.e(str).ordinal()]) {
                case 47:
                    N4.g.O oT0 = t0(str2);
                    e10.f7449b = oT0;
                    if (oT0 != null) {
                        e10.f7448a |= 1;
                    }
                    break;
                case 48:
                    N4.g.E.a aVarE0 = e0(str2);
                    e10.f7450c = aVarE0;
                    if (aVarE0 != null) {
                        e10.f7448a |= 2;
                    }
                    break;
                case 49:
                    Float fR0 = r0(str2);
                    e10.f7451d = fR0;
                    if (fR0 != null) {
                        e10.f7448a |= 4;
                    }
                    break;
                case 50:
                    N4.g.O oT1 = t0(str2);
                    e10.f7452e = oT1;
                    if (oT1 != null) {
                        e10.f7448a |= 8;
                    }
                    break;
                case 51:
                    Float fR1 = r0(str2);
                    e10.f7453f = fR1;
                    if (fR1 != null) {
                        e10.f7448a |= 16;
                    }
                    break;
                case 52:
                    e10.f7454g = o0(str2);
                    e10.f7448a |= 32;
                    break;
                case 53:
                    N4.g.E.c cVarC0 = C0(str2);
                    e10.f7455h = cVarC0;
                    if (cVarC0 != null) {
                        e10.f7448a |= 64;
                    }
                    break;
                case 54:
                    N4.g.E.d dVarD0 = D0(str2);
                    e10.f7456i = dVarD0;
                    if (dVarD0 != null) {
                        e10.f7448a |= 128;
                    }
                    break;
                case 55:
                    e10.f7457j = Float.valueOf(f0(str2));
                    e10.f7448a |= 256;
                    break;
                case 56:
                    if (!"none".equals(str2)) {
                        N4.g.C1195p[] c1195pArrB0 = B0(str2);
                        e10.f7458k = c1195pArrB0;
                        if (c1195pArrB0 != null) {
                            e10.f7448a |= 512;
                        }
                    } else {
                        e10.f7458k = null;
                        e10.f7448a |= 512;
                    }
                    break;
                case 57:
                    e10.f7459l = o0(str2);
                    e10.f7448a |= 1024;
                    break;
                case 58:
                    e10.f7460m = r0(str2);
                    e10.f7448a |= 2048;
                    break;
                case 59:
                    e10.f7461n = b0(str2);
                    e10.f7448a |= 4096;
                    break;
                case 60:
                    h0(e10, str2);
                    break;
                case 61:
                    List listI0 = i0(str2);
                    e10.f7462o = listI0;
                    if (listI0 != null) {
                        e10.f7448a |= 8192;
                    }
                    break;
                case 62:
                    N4.g.C1195p c1195pJ0 = j0(str2);
                    e10.f7463p = c1195pJ0;
                    if (c1195pJ0 != null) {
                        e10.f7448a |= 16384;
                    }
                    break;
                case 63:
                    Integer numL0 = l0(str2);
                    e10.f7464q = numL0;
                    if (numL0 != null) {
                        e10.f7448a |= 32768;
                    }
                    break;
                case 64:
                    N4.g.E.b bVarK0 = k0(str2);
                    e10.f7465r = bVarK0;
                    if (bVarK0 != null) {
                        e10.f7448a |= 65536;
                    }
                    break;
                case 65:
                    N4.g.E.EnumC0131g enumC0131gH0 = H0(str2);
                    e10.f7466s = enumC0131gH0;
                    if (enumC0131gH0 != null) {
                        e10.f7448a |= 131072;
                    }
                    break;
                case 66:
                    N4.g.E.h hVarI0 = I0(str2);
                    e10.f7467t = hVarI0;
                    if (hVarI0 != null) {
                        e10.f7448a |= 68719476736L;
                    }
                    break;
                case 67:
                    N4.g.E.f fVarG0 = G0(str2);
                    e10.f7468u = fVarG0;
                    if (fVarG0 != null) {
                        e10.f7448a |= 262144;
                    }
                    break;
                case 68:
                    Boolean boolS0 = s0(str2);
                    e10.f7469v = boolS0;
                    if (boolS0 != null) {
                        e10.f7448a |= 524288;
                    }
                    break;
                case 69:
                    String strM0 = m0(str2, str);
                    e10.f7471x = strM0;
                    e10.f7472y = strM0;
                    e10.f7473z = strM0;
                    e10.f7448a |= 14680064;
                    break;
                case 70:
                    e10.f7471x = m0(str2, str);
                    e10.f7448a |= 2097152;
                    break;
                case 71:
                    e10.f7472y = m0(str2, str);
                    e10.f7448a |= 4194304;
                    break;
                case 72:
                    e10.f7473z = m0(str2, str);
                    e10.f7448a |= 8388608;
                    break;
                case 73:
                    if (str2.indexOf(124) < 0) {
                        if ("|inline|block|list-item|run-in|compact|marker|table|inline-table|table-row-group|table-header-group|table-footer-group|table-row|table-column-group|table-column|table-cell|table-caption|none|".contains('|' + str2 + '|')) {
                            e10.f7435A = Boolean.valueOf(!str2.equals("none"));
                            e10.f7448a |= 16777216;
                            break;
                        }
                    }
                    break;
                case 74:
                    if (str2.indexOf(124) < 0) {
                        if ("|visible|hidden|collapse|".contains('|' + str2 + '|')) {
                            e10.f7436B = Boolean.valueOf(str2.equals("visible"));
                            e10.f7448a |= 33554432;
                            break;
                        }
                    }
                    break;
                case 75:
                    if (str2.equals("currentColor")) {
                        e10.f7437C = N4.g.C0132g.b();
                    } else {
                        try {
                            e10.f7437C = b0(str2);
                        } catch (N4.j e11) {
                            Log.w("SVGParser", e11.getMessage());
                            return;
                        }
                    }
                    e10.f7448a |= 67108864;
                    break;
                case 76:
                    e10.f7438D = r0(str2);
                    e10.f7448a |= 134217728;
                    break;
                case 77:
                    N4.g.C1183c c1183cA0 = a0(str2);
                    e10.f7470w = c1183cA0;
                    if (c1183cA0 != null) {
                        e10.f7448a |= 1048576;
                    }
                    break;
                case 78:
                    e10.f7439E = m0(str2, str);
                    e10.f7448a |= 268435456;
                    break;
                case 79:
                    e10.f7440F = e0(str2);
                    e10.f7448a |= 536870912;
                    break;
                case 80:
                    e10.f7441G = m0(str2, str);
                    e10.f7448a |= 1073741824;
                    break;
                case 81:
                    if (str2.equals("currentColor")) {
                        e10.f7442H = N4.g.C0132g.b();
                    } else {
                        try {
                            e10.f7442H = b0(str2);
                        } catch (N4.j e12) {
                            Log.w("SVGParser", e12.getMessage());
                            return;
                        }
                    }
                    e10.f7448a |= 2147483648L;
                    break;
                case 82:
                    e10.f7443I = r0(str2);
                    e10.f7448a |= 4294967296L;
                    break;
                case 83:
                    if (str2.equals("currentColor")) {
                        e10.f7444J = N4.g.C0132g.b();
                    } else {
                        try {
                            e10.f7444J = b0(str2);
                        } catch (N4.j e13) {
                            Log.w("SVGParser", e13.getMessage());
                            return;
                        }
                    }
                    e10.f7448a |= 8589934592L;
                    break;
                case 84:
                    e10.f7445K = r0(str2);
                    e10.f7448a |= 17179869184L;
                    break;
                case 85:
                    N4.g.E.i iVarM0 = M0(str2);
                    e10.f7446L = iVarM0;
                    if (iVarM0 != null) {
                        e10.f7448a |= 34359738368L;
                    }
                    break;
                case 86:
                    N4.g.E.e eVarY0 = y0(str2);
                    e10.f7447M = eVarY0;
                    if (eVarY0 != null) {
                        e10.f7448a |= 137438953472L;
                    }
                    break;
            }
        } catch (N4.j unused) {
        }
    }

    private void T(N4.g.U u10, Attributes attributes) {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            if (a.f7711b[g.e(attributes.getLocalName(i10)).ordinal()] == 6 && ("".equals(attributes.getURI(i10)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i10)))) {
                u10.f7544o = strTrim;
            }
        }
    }

    private void T0(Attributes attributes) throws N4.j {
        l("<radialGradient>", new Object[0]);
        if (this.f7702b == null) {
            throw new N4.j("Invalid document. Root element must be <svg>");
        }
        N4.g.Q q10 = new N4.g.Q();
        q10.f7535a = this.f7701a;
        q10.f7536b = this.f7702b;
        D(q10, attributes);
        S(q10, attributes);
        F(q10, attributes);
        O(q10, attributes);
        this.f7702b.i(q10);
        this.f7702b = q10;
    }

    private void U(N4.g.Z z10, Attributes attributes) {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            int i11 = a.f7711b[g.e(attributes.getLocalName(i10)).ordinal()];
            if (i11 != 6) {
                if (i11 == 39) {
                    z10.f7549p = o0(strTrim);
                }
            } else if ("".equals(attributes.getURI(i10)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i10))) {
                z10.f7548o = strTrim;
            }
        }
    }

    private void U0(Attributes attributes) throws N4.j {
        l("<rect>", new Object[0]);
        if (this.f7702b == null) {
            throw new N4.j("Invalid document. Root element must be <svg>");
        }
        N4.g.B b10 = new N4.g.B();
        b10.f7535a = this.f7701a;
        b10.f7536b = this.f7702b;
        D(b10, attributes);
        S(b10, attributes);
        W(b10, attributes);
        C(b10, attributes);
        P(b10, attributes);
        this.f7702b.i(b10);
    }

    private void V(N4.g.a0 a0Var, Attributes attributes) {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            int i11 = a.f7711b[g.e(attributes.getLocalName(i10)).ordinal()];
            if (i11 == 1) {
                a0Var.f7552o = p0(strTrim);
            } else if (i11 == 2) {
                a0Var.f7553p = p0(strTrim);
            } else if (i11 == 19) {
                a0Var.f7554q = p0(strTrim);
            } else if (i11 == 20) {
                a0Var.f7555r = p0(strTrim);
            }
        }
    }

    private void V0(Attributes attributes) throws N4.j {
        l("<solidColor>", new Object[0]);
        if (this.f7702b == null) {
            throw new N4.j("Invalid document. Root element must be <svg>");
        }
        N4.g.C c10 = new N4.g.C();
        c10.f7535a = this.f7701a;
        c10.f7536b = this.f7702b;
        D(c10, attributes);
        S(c10, attributes);
        this.f7702b.i(c10);
        this.f7702b = c10;
    }

    private void W(N4.g.InterfaceC1193n interfaceC1193n, Attributes attributes) {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            if (g.e(attributes.getLocalName(i10)) == g.transform) {
                interfaceC1193n.l(J0(attributes.getValue(i10)));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void W0() {
        this.f7701a = new N4.g();
    }

    private void X(N4.g.e0 e0Var, Attributes attributes) throws N4.j {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            int i11 = a.f7711b[g.e(attributes.getLocalName(i10)).ordinal()];
            if (i11 == 1) {
                e0Var.f7581q = o0(strTrim);
            } else if (i11 == 2) {
                e0Var.f7582r = o0(strTrim);
            } else if (i11 == 3) {
                N4.g.C1195p c1195pO0 = o0(strTrim);
                e0Var.f7583s = c1195pO0;
                if (c1195pO0.h()) {
                    throw new N4.j("Invalid <use> element. width cannot be negative");
                }
            } else if (i11 == 4) {
                N4.g.C1195p c1195pO1 = o0(strTrim);
                e0Var.f7584t = c1195pO1;
                if (c1195pO1.h()) {
                    throw new N4.j("Invalid <use> element. height cannot be negative");
                }
            } else if (i11 == 6 && ("".equals(attributes.getURI(i10)) || "http://www.w3.org/1999/xlink".equals(attributes.getURI(i10)))) {
                e0Var.f7580p = strTrim;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void X0(String str, String str2, String str3, Attributes attributes) throws N4.j {
        if (this.f7703c) {
            this.f7704d++;
        }
        if ("http://www.w3.org/2000/svg".equals(str) || "".equals(str)) {
            if (str2.length() <= 0) {
                str2 = str3;
            }
            h hVarE = h.e(str2);
            switch (a.f7710a[hVarE.ordinal()]) {
                case 1:
                    a1(attributes);
                    break;
                case 2:
                case 3:
                    q(attributes);
                    break;
                case 4:
                    m(attributes);
                    break;
                case 5:
                    i1(attributes);
                    break;
                case 6:
                    O0(attributes);
                    break;
                case 7:
                    U0(attributes);
                    break;
                case 8:
                    i(attributes);
                    break;
                case 9:
                    n(attributes);
                    break;
                case 10:
                    v(attributes);
                    break;
                case 11:
                    R0(attributes);
                    break;
                case 12:
                    Q0(attributes);
                    break;
                case 13:
                    d1(attributes);
                    break;
                case 14:
                    h1(attributes);
                    break;
                case 15:
                    g1(attributes);
                    break;
                case 16:
                    k1(attributes);
                    break;
                case 17:
                    b1(attributes);
                    break;
                case 18:
                    x(attributes);
                    break;
                case 19:
                    w(attributes);
                    break;
                case 20:
                    T0(attributes);
                    break;
                case 21:
                    Y0(attributes);
                    break;
                case 22:
                case 23:
                    this.f7705e = true;
                    this.f7706f = hVarE;
                    break;
                case 24:
                    k(attributes);
                    break;
                case 25:
                    f1(attributes);
                    break;
                case 26:
                    P0(attributes);
                    break;
                case 27:
                    u(attributes);
                    break;
                case 28:
                    j1(attributes);
                    break;
                case 29:
                    y(attributes);
                    break;
                case 30:
                    Z0(attributes);
                    break;
                case 31:
                    V0(attributes);
                    break;
                default:
                    this.f7703c = true;
                    this.f7704d = 1;
                    break;
            }
        }
    }

    private void Y(N4.g.R r10, Attributes attributes) {
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            int i11 = a.f7711b[g.e(attributes.getLocalName(i10)).ordinal()];
            if (i11 == 7) {
                w0(r10, strTrim);
            } else if (i11 == 87) {
                r10.f7543p = N0(strTrim);
            }
        }
    }

    private void Y0(Attributes attributes) throws N4.j {
        l("<stop>", new Object[0]);
        N4.g.J j10 = this.f7702b;
        if (j10 == null) {
            throw new N4.j("Invalid document. Root element must be <svg>");
        }
        if (!(j10 instanceof N4.g.AbstractC1189j)) {
            throw new N4.j("Invalid document. <stop> elements are only valid inside <linearGradient> or <radialGradient> elements.");
        }
        N4.g.D d10 = new N4.g.D();
        d10.f7535a = this.f7701a;
        d10.f7536b = this.f7702b;
        D(d10, attributes);
        S(d10, attributes);
        R(d10, attributes);
        this.f7702b.i(d10);
        this.f7702b = d10;
    }

    private void Z(String str) {
        this.f7701a.a(new N4.b(N4.b.f.screen, N4.b.u.Document).d(str));
    }

    private void Z0(Attributes attributes) throws N4.j {
        l("<style>", new Object[0]);
        if (this.f7702b == null) {
            throw new N4.j("Invalid document. Root element must be <svg>");
        }
        String str = "all";
        boolean zEquals = true;
        for (int i10 = 0; i10 < attributes.getLength(); i10++) {
            String strTrim = attributes.getValue(i10).trim();
            int i11 = a.f7711b[g.e(attributes.getLocalName(i10)).ordinal()];
            if (i11 == 88) {
                zEquals = strTrim.equals("text/css");
            } else if (i11 == 89) {
                str = strTrim;
            }
        }
        if (zEquals && N4.b.b(str, N4.b.f.screen)) {
            this.f7708h = true;
        } else {
            this.f7703c = true;
            this.f7704d = 1;
        }
    }

    private static N4.g.C1183c a0(String str) {
        if ("auto".equals(str) || !str.startsWith("rect(")) {
            return null;
        }
        i iVar = new i(str.substring(5));
        iVar.A();
        N4.g.C1195p c1195pQ0 = q0(iVar);
        iVar.z();
        N4.g.C1195p c1195pQ1 = q0(iVar);
        iVar.z();
        N4.g.C1195p c1195pQ2 = q0(iVar);
        iVar.z();
        N4.g.C1195p c1195pQ3 = q0(iVar);
        iVar.A();
        if (iVar.f(')') || iVar.h()) {
            return new N4.g.C1183c(c1195pQ0, c1195pQ1, c1195pQ2, c1195pQ3);
        }
        return null;
    }

    private void a1(Attributes attributes) throws N4.j {
        l("<svg>", new Object[0]);
        N4.g.F f10 = new N4.g.F();
        f10.f7535a = this.f7701a;
        f10.f7536b = this.f7702b;
        D(f10, attributes);
        S(f10, attributes);
        C(f10, attributes);
        Y(f10, attributes);
        Q(f10, attributes);
        N4.g.J j10 = this.f7702b;
        if (j10 == null) {
            this.f7701a.z(f10);
        } else {
            j10.i(f10);
        }
        this.f7702b = f10;
    }

    private static N4.g.C1186f b0(String str) throws N4.j {
        if (str.charAt(0) == '#') {
            N4.c cVarB = N4.c.b(str, 1, str.length());
            if (cVarB == null) {
                throw new N4.j("Bad hex colour value: " + str);
            }
            int iA = cVarB.a();
            if (iA == 4) {
                int iD = cVarB.d();
                int i10 = iD & 3840;
                int i11 = iD & 240;
                int i12 = iD & 15;
                return new N4.g.C1186f(i12 | (i10 << 8) | (-16777216) | (i10 << 12) | (i11 << 8) | (i11 << 4) | (i12 << 4));
            }
            if (iA == 5) {
                int iD2 = cVarB.d();
                int i13 = 61440 & iD2;
                int i14 = iD2 & 3840;
                int i15 = iD2 & 240;
                int i16 = iD2 & 15;
                return new N4.g.C1186f((i16 << 24) | (i16 << 28) | (i13 << 8) | (i13 << 4) | (i14 << 4) | i14 | i15 | (i15 >> 4));
            }
            if (iA == 7) {
                return new N4.g.C1186f(cVarB.d() | (-16777216));
            }
            if (iA == 9) {
                return new N4.g.C1186f((cVarB.d() >>> 8) | (cVarB.d() << 24));
            }
            throw new N4.j("Bad hex colour value: " + str);
        }
        String lowerCase = str.toLowerCase(Locale.US);
        boolean zStartsWith = lowerCase.startsWith("rgba(");
        if (!zStartsWith && !lowerCase.startsWith("rgb(")) {
            boolean zStartsWith2 = lowerCase.startsWith("hsla(");
            if (!zStartsWith2 && !lowerCase.startsWith("hsl(")) {
                return c0(lowerCase);
            }
            i iVar = new i(str.substring(zStartsWith2 ? 5 : 4));
            iVar.A();
            float fN = iVar.n();
            float fD = iVar.d(fN);
            if (!Float.isNaN(fD)) {
                iVar.f('%');
            }
            float fD2 = iVar.d(fD);
            if (!Float.isNaN(fD2)) {
                iVar.f('%');
            }
            if (!zStartsWith2) {
                iVar.A();
                if (!Float.isNaN(fD2) && iVar.f(')')) {
                    return new N4.g.C1186f(s(fN, fD, fD2) | (-16777216));
                }
                throw new N4.j("Bad hsl() colour value: " + str);
            }
            float fD3 = iVar.d(fD2);
            iVar.A();
            if (!Float.isNaN(fD3) && iVar.f(')')) {
                return new N4.g.C1186f((j(fD3 * 256.0f) << 24) | s(fN, fD, fD2));
            }
            throw new N4.j("Bad hsla() colour value: " + str);
        }
        i iVar2 = new i(str.substring(zStartsWith ? 5 : 4));
        iVar2.A();
        float fN2 = iVar2.n();
        if (!Float.isNaN(fN2) && iVar2.f('%')) {
            fN2 = (fN2 * 256.0f) / 100.0f;
        }
        float fD4 = iVar2.d(fN2);
        if (!Float.isNaN(fD4) && iVar2.f('%')) {
            fD4 = (fD4 * 256.0f) / 100.0f;
        }
        float fD5 = iVar2.d(fD4);
        if (!Float.isNaN(fD5) && iVar2.f('%')) {
            fD5 = (fD5 * 256.0f) / 100.0f;
        }
        if (!zStartsWith) {
            iVar2.A();
            if (!Float.isNaN(fD5) && iVar2.f(')')) {
                return new N4.g.C1186f((j(fN2) << 16) | (-16777216) | (j(fD4) << 8) | j(fD5));
            }
            throw new N4.j("Bad rgb() colour value: " + str);
        }
        float fD6 = iVar2.d(fD5);
        iVar2.A();
        if (!Float.isNaN(fD6) && iVar2.f(')')) {
            return new N4.g.C1186f((j(fD6 * 256.0f) << 24) | (j(fN2) << 16) | (j(fD4) << 8) | j(fD5));
        }
        throw new N4.j("Bad rgba() colour value: " + str);
    }

    private void b1(Attributes attributes) throws N4.j {
        l("<symbol>", new Object[0]);
        if (this.f7702b == null) {
            throw new N4.j("Invalid document. Root element must be <svg>");
        }
        N4.g.R t10 = new N4.g.T();
        t10.f7535a = this.f7701a;
        t10.f7536b = this.f7702b;
        D(t10, attributes);
        S(t10, attributes);
        C(t10, attributes);
        Y(t10, attributes);
        this.f7702b.i(t10);
        this.f7702b = t10;
    }

    private static N4.g.C1186f c0(String str) throws N4.j {
        Integer numA = c.a(str);
        if (numA != null) {
            return new N4.g.C1186f(numA.intValue());
        }
        throw new N4.j("Invalid colour keyword: " + str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c1(String str) {
        if (this.f7703c) {
            return;
        }
        if (this.f7705e) {
            if (this.f7707g == null) {
                this.f7707g = new StringBuilder(str.length());
            }
            this.f7707g.append(str);
        } else if (this.f7708h) {
            if (this.f7709i == null) {
                this.f7709i = new StringBuilder(str.length());
            }
            this.f7709i.append(str);
        } else if (this.f7702b instanceof N4.g.Y) {
            h(str);
        }
    }

    private static N4.g.O d0(String str) {
        str.getClass();
        if (str.equals("none")) {
            return N4.g.C1186f.f7586c;
        }
        if (str.equals("currentColor")) {
            return N4.g.C0132g.b();
        }
        try {
            return b0(str);
        } catch (N4.j unused) {
            return null;
        }
    }

    private void d1(Attributes attributes) throws N4.j {
        l("<text>", new Object[0]);
        if (this.f7702b == null) {
            throw new N4.j("Invalid document. Root element must be <svg>");
        }
        N4.g.W w10 = new N4.g.W();
        w10.f7535a = this.f7701a;
        w10.f7536b = this.f7702b;
        D(w10, attributes);
        S(w10, attributes);
        W(w10, attributes);
        C(w10, attributes);
        V(w10, attributes);
        this.f7702b.i(w10);
        this.f7702b = w10;
    }

    private static N4.g.E.a e0(String str) {
        if ("nonzero".equals(str)) {
            return N4.g.E.a.NonZero;
        }
        if ("evenodd".equals(str)) {
            return N4.g.E.a.EvenOdd;
        }
        return null;
    }

    private void e1(char[] cArr, int i10, int i11) {
        if (this.f7703c) {
            return;
        }
        if (this.f7705e) {
            if (this.f7707g == null) {
                this.f7707g = new StringBuilder(i11);
            }
            this.f7707g.append(cArr, i10, i11);
        } else if (this.f7708h) {
            if (this.f7709i == null) {
                this.f7709i = new StringBuilder(i11);
            }
            this.f7709i.append(cArr, i10, i11);
        } else if (this.f7702b instanceof N4.g.Y) {
            h(new String(cArr, i10, i11));
        }
    }

    private static float f0(String str) throws N4.j {
        int length = str.length();
        if (length != 0) {
            return g0(str, 0, length);
        }
        throw new N4.j("Invalid float value (empty string)");
    }

    private void f1(Attributes attributes) throws N4.j {
        l("<textPath>", new Object[0]);
        if (this.f7702b == null) {
            throw new N4.j("Invalid document. Root element must be <svg>");
        }
        N4.g.Z z10 = new N4.g.Z();
        z10.f7535a = this.f7701a;
        z10.f7536b = this.f7702b;
        D(z10, attributes);
        S(z10, attributes);
        C(z10, attributes);
        U(z10, attributes);
        this.f7702b.i(z10);
        this.f7702b = z10;
        N4.g.J j10 = z10.f7536b;
        if (j10 instanceof N4.g.b0) {
            z10.p((N4.g.b0) j10);
        } else {
            z10.p(((N4.g.X) j10).e());
        }
    }

    private static float g0(String str, int i10, int i11) throws N4.j {
        float fB = new N4.d().b(str, i10, i11);
        if (!Float.isNaN(fB)) {
            return fB;
        }
        throw new N4.j("Invalid float value: " + str);
    }

    private void g1(Attributes attributes) throws N4.j {
        l("<tref>", new Object[0]);
        N4.g.J j10 = this.f7702b;
        if (j10 == null) {
            throw new N4.j("Invalid document. Root element must be <svg>");
        }
        if (!(j10 instanceof N4.g.Y)) {
            throw new N4.j("Invalid document. <tref> elements are only valid inside <text> or <tspan> elements.");
        }
        N4.g.U u10 = new N4.g.U();
        u10.f7535a = this.f7701a;
        u10.f7536b = this.f7702b;
        D(u10, attributes);
        S(u10, attributes);
        C(u10, attributes);
        T(u10, attributes);
        this.f7702b.i(u10);
        N4.g.J j11 = u10.f7536b;
        if (j11 instanceof N4.g.b0) {
            u10.p((N4.g.b0) j11);
        } else {
            u10.p(((N4.g.X) j11).e());
        }
    }

    private void h(String str) {
        N4.g.H h10 = (N4.g.H) this.f7702b;
        int size = h10.f7514i.size();
        N4.g.N n10 = size == 0 ? null : (N4.g.N) h10.f7514i.get(size - 1);
        if (!(n10 instanceof N4.g.c0)) {
            this.f7702b.i(new N4.g.c0(str));
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        N4.g.c0 c0Var = (N4.g.c0) n10;
        sb2.append(c0Var.f7564c);
        sb2.append(str);
        c0Var.f7564c = sb2.toString();
    }

    private static void h0(N4.g.E e10, String str) {
        String strS;
        if ("|caption|icon|menu|message-box|small-caption|status-bar|".contains('|' + str + '|')) {
            i iVar = new i(str);
            Integer numA = null;
            N4.g.E.b bVarK0 = null;
            String str2 = null;
            while (true) {
                strS = iVar.s('/');
                iVar.A();
                if (strS != null) {
                    if (numA != null && bVarK0 != null) {
                        break;
                    }
                    if (!strS.equals("normal") && (numA != null || (numA = e.a(strS)) == null)) {
                        if (bVarK0 != null || (bVarK0 = k0(strS)) == null) {
                            if (str2 != null || !strS.equals("small-caps")) {
                                break;
                            } else {
                                str2 = strS;
                            }
                        }
                    }
                } else {
                    return;
                }
            }
            N4.g.C1195p c1195pJ0 = j0(strS);
            if (iVar.f('/')) {
                iVar.A();
                String strR = iVar.r();
                if (strR != null) {
                    try {
                        o0(strR);
                    } catch (N4.j unused) {
                        return;
                    }
                }
                iVar.A();
            }
            e10.f7462o = i0(iVar.y());
            e10.f7463p = c1195pJ0;
            e10.f7464q = Integer.valueOf(numA == null ? 400 : numA.intValue());
            if (bVarK0 == null) {
                bVarK0 = N4.g.E.b.Normal;
            }
            e10.f7465r = bVarK0;
            e10.f7448a |= 122880;
        }
    }

    private void h1(Attributes attributes) throws N4.j {
        l("<tspan>", new Object[0]);
        N4.g.J j10 = this.f7702b;
        if (j10 == null) {
            throw new N4.j("Invalid document. Root element must be <svg>");
        }
        if (!(j10 instanceof N4.g.Y)) {
            throw new N4.j("Invalid document. <tspan> elements are only valid inside <text> or other <tspan> elements.");
        }
        N4.g.V v10 = new N4.g.V();
        v10.f7535a = this.f7701a;
        v10.f7536b = this.f7702b;
        D(v10, attributes);
        S(v10, attributes);
        C(v10, attributes);
        V(v10, attributes);
        this.f7702b.i(v10);
        this.f7702b = v10;
        N4.g.J j11 = v10.f7536b;
        if (j11 instanceof N4.g.b0) {
            v10.p((N4.g.b0) j11);
        } else {
            v10.p(((N4.g.X) j11).e());
        }
    }

    private void i(Attributes attributes) throws N4.j {
        l("<circle>", new Object[0]);
        if (this.f7702b == null) {
            throw new N4.j("Invalid document. Root element must be <svg>");
        }
        N4.g.C1184d c1184d = new N4.g.C1184d();
        c1184d.f7535a = this.f7701a;
        c1184d.f7536b = this.f7702b;
        D(c1184d, attributes);
        S(c1184d, attributes);
        W(c1184d, attributes);
        C(c1184d, attributes);
        A(c1184d, attributes);
        this.f7702b.i(c1184d);
    }

    private static List i0(String str) {
        i iVar = new i(str);
        ArrayList arrayList = null;
        do {
            String strQ = iVar.q();
            if (strQ == null) {
                strQ = iVar.u(',');
            }
            if (strQ == null) {
                return arrayList;
            }
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            arrayList.add(strQ);
            iVar.z();
        } while (!iVar.h());
        return arrayList;
    }

    private void i1(Attributes attributes) throws N4.j {
        l("<use>", new Object[0]);
        if (this.f7702b == null) {
            throw new N4.j("Invalid document. Root element must be <svg>");
        }
        N4.g.e0 e0Var = new N4.g.e0();
        e0Var.f7535a = this.f7701a;
        e0Var.f7536b = this.f7702b;
        D(e0Var, attributes);
        S(e0Var, attributes);
        W(e0Var, attributes);
        C(e0Var, attributes);
        X(e0Var, attributes);
        this.f7702b.i(e0Var);
        this.f7702b = e0Var;
    }

    private static int j(float f10) {
        if (f10 < 0.0f) {
            return 0;
        }
        if (f10 > 255.0f) {
            return 255;
        }
        return Math.round(f10);
    }

    private static N4.g.C1195p j0(String str) {
        try {
            N4.g.C1195p c1195pA = d.a(str);
            return c1195pA == null ? o0(str) : c1195pA;
        } catch (N4.j unused) {
            return null;
        }
    }

    private void j1(Attributes attributes) throws N4.j {
        l("<view>", new Object[0]);
        if (this.f7702b == null) {
            throw new N4.j("Invalid document. Root element must be <svg>");
        }
        N4.g.R f0Var = new N4.g.f0();
        f0Var.f7535a = this.f7701a;
        f0Var.f7536b = this.f7702b;
        D(f0Var, attributes);
        C(f0Var, attributes);
        Y(f0Var, attributes);
        this.f7702b.i(f0Var);
        this.f7702b = f0Var;
    }

    private void k(Attributes attributes) throws N4.j {
        l("<clipPath>", new Object[0]);
        if (this.f7702b == null) {
            throw new N4.j("Invalid document. Root element must be <svg>");
        }
        N4.g.C1185e c1185e = new N4.g.C1185e();
        c1185e.f7535a = this.f7701a;
        c1185e.f7536b = this.f7702b;
        D(c1185e, attributes);
        S(c1185e, attributes);
        W(c1185e, attributes);
        C(c1185e, attributes);
        B(c1185e, attributes);
        this.f7702b.i(c1185e);
        this.f7702b = c1185e;
    }

    private static N4.g.E.b k0(String str) {
        str.getClass();
        switch (str) {
            case "oblique":
                return N4.g.E.b.Oblique;
            case "italic":
                return N4.g.E.b.Italic;
            case "normal":
                return N4.g.E.b.Normal;
            default:
                return null;
        }
    }

    private void k1(Attributes attributes) throws N4.j {
        l("<switch>", new Object[0]);
        if (this.f7702b == null) {
            throw new N4.j("Invalid document. Root element must be <svg>");
        }
        N4.g.S s10 = new N4.g.S();
        s10.f7535a = this.f7701a;
        s10.f7536b = this.f7702b;
        D(s10, attributes);
        S(s10, attributes);
        W(s10, attributes);
        C(s10, attributes);
        this.f7702b.i(s10);
        this.f7702b = s10;
    }

    private void l(String str, Object... objArr) {
    }

    private static Integer l0(String str) {
        return e.a(str);
    }

    private void m(Attributes attributes) throws N4.j {
        l("<defs>", new Object[0]);
        if (this.f7702b == null) {
            throw new N4.j("Invalid document. Root element must be <svg>");
        }
        N4.g.C1187h c1187h = new N4.g.C1187h();
        c1187h.f7535a = this.f7701a;
        c1187h.f7536b = this.f7702b;
        D(c1187h, attributes);
        S(c1187h, attributes);
        W(c1187h, attributes);
        this.f7702b.i(c1187h);
        this.f7702b = c1187h;
    }

    private static String m0(String str, String str2) {
        if (!str.equals("none") && str.startsWith("url(")) {
            return str.endsWith(")") ? str.substring(4, str.length() - 1).trim() : str.substring(4).trim();
        }
        return null;
    }

    private void n(Attributes attributes) throws N4.j {
        l("<ellipse>", new Object[0]);
        if (this.f7702b == null) {
            throw new N4.j("Invalid document. Root element must be <svg>");
        }
        N4.g.C1188i c1188i = new N4.g.C1188i();
        c1188i.f7535a = this.f7701a;
        c1188i.f7536b = this.f7702b;
        D(c1188i, attributes);
        S(c1188i, attributes);
        W(c1188i, attributes);
        C(c1188i, attributes);
        E(c1188i, attributes);
        this.f7702b.i(c1188i);
    }

    private Float n0(String str) throws N4.j {
        if (str.length() == 0) {
            throw new N4.j("Invalid offset value in <stop> (empty string)");
        }
        int length = str.length();
        boolean z10 = true;
        if (str.charAt(str.length() - 1) == '%') {
            length--;
        } else {
            z10 = false;
        }
        try {
            float fG0 = g0(str, 0, length);
            float f10 = 100.0f;
            if (z10) {
                fG0 /= 100.0f;
            }
            if (fG0 < 0.0f) {
                f10 = 0.0f;
            } else if (fG0 <= 100.0f) {
                f10 = fG0;
            }
            return Float.valueOf(f10);
        } catch (NumberFormatException e10) {
            throw new N4.j("Invalid offset value in <stop>: " + str, e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
    }

    static N4.g.C1195p o0(String str) throws N4.j {
        if (str.length() == 0) {
            throw new N4.j("Invalid length value (empty string)");
        }
        int length = str.length();
        N4.g.d0 d0VarValueOf = N4.g.d0.px;
        char cCharAt = str.charAt(length - 1);
        if (cCharAt == '%') {
            length--;
            d0VarValueOf = N4.g.d0.percent;
        } else if (length > 2 && Character.isLetter(cCharAt) && Character.isLetter(str.charAt(length - 2))) {
            length -= 2;
            try {
                d0VarValueOf = N4.g.d0.valueOf(str.substring(length).toLowerCase(Locale.US));
            } catch (IllegalArgumentException unused) {
                throw new N4.j("Invalid length unit specifier: " + str);
            }
        }
        try {
            return new N4.g.C1195p(g0(str, 0, length), d0VarValueOf);
        } catch (NumberFormatException e10) {
            throw new N4.j("Invalid length value: " + str, e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p(String str, String str2, String str3) {
        if (this.f7703c) {
            int i10 = this.f7704d - 1;
            this.f7704d = i10;
            if (i10 == 0) {
                this.f7703c = false;
                return;
            }
        }
        if ("http://www.w3.org/2000/svg".equals(str) || "".equals(str)) {
            if (str2.length() <= 0) {
                str2 = str3;
            }
            int i11 = a.f7710a[h.e(str2).ordinal()];
            if (i11 != 1 && i11 != 2 && i11 != 4 && i11 != 5 && i11 != 13 && i11 != 14) {
                switch (i11) {
                    case 22:
                    case 23:
                        this.f7705e = false;
                        StringBuilder sb2 = this.f7707g;
                        if (sb2 != null) {
                            h hVar = this.f7706f;
                            if (hVar == h.title) {
                                this.f7701a.A(sb2.toString());
                            } else if (hVar == h.desc) {
                                this.f7701a.t(sb2.toString());
                            }
                            this.f7707g.setLength(0);
                        }
                        break;
                    case 30:
                        StringBuilder sb3 = this.f7709i;
                        if (sb3 != null) {
                            this.f7708h = false;
                            Z(sb3.toString());
                            this.f7709i.setLength(0);
                        }
                        break;
                }
                return;
            }
            this.f7702b = ((N4.g.N) this.f7702b).f7536b;
        }
    }

    private static List p0(String str) throws N4.j {
        if (str.length() == 0) {
            throw new N4.j("Invalid length list (empty string)");
        }
        ArrayList arrayList = new ArrayList(1);
        i iVar = new i(str);
        iVar.A();
        while (!iVar.h()) {
            float fN = iVar.n();
            if (Float.isNaN(fN)) {
                throw new N4.j("Invalid length list value: " + iVar.b());
            }
            N4.g.d0 d0VarV = iVar.v();
            if (d0VarV == null) {
                d0VarV = N4.g.d0.px;
            }
            arrayList.add(new N4.g.C1195p(fN, d0VarV));
            iVar.z();
        }
        return arrayList;
    }

    private void q(Attributes attributes) throws N4.j {
        l("<g>", new Object[0]);
        if (this.f7702b == null) {
            throw new N4.j("Invalid document. Root element must be <svg>");
        }
        N4.g.C1192m c1192m = new N4.g.C1192m();
        c1192m.f7535a = this.f7701a;
        c1192m.f7536b = this.f7702b;
        D(c1192m, attributes);
        S(c1192m, attributes);
        W(c1192m, attributes);
        C(c1192m, attributes);
        this.f7702b.i(c1192m);
        this.f7702b = c1192m;
    }

    private static N4.g.C1195p q0(i iVar) {
        return iVar.g("auto") ? new N4.g.C1195p(0.0f) : iVar.p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r(String str, Map map) {
        if (str.equals("xml-stylesheet")) {
            N4.g.k();
        }
    }

    private static Float r0(String str) {
        try {
            float fF0 = f0(str);
            float f10 = 0.0f;
            if (fF0 < 0.0f) {
                fF0 = f10;
            } else {
                f10 = 1.0f;
                if (fF0 > 1.0f) {
                    fF0 = f10;
                }
            }
            return Float.valueOf(fF0);
        } catch (N4.j unused) {
            return null;
        }
    }

    private static int s(float f10, float f11, float f12) {
        float f13 = 0.0f;
        float f14 = f10 % 360.0f;
        if (f10 < 0.0f) {
            f14 += 360.0f;
        }
        float f15 = f14 / 60.0f;
        float f16 = f11 / 100.0f;
        float f17 = f12 / 100.0f;
        if (f16 < 0.0f) {
            f16 = 0.0f;
        } else if (f16 > 1.0f) {
            f16 = 1.0f;
        }
        if (f17 >= 0.0f) {
            f13 = f17 > 1.0f ? 1.0f : f17;
        }
        float f18 = f13 <= 0.5f ? (f16 + 1.0f) * f13 : (f13 + f16) - (f16 * f13);
        float f19 = (f13 * 2.0f) - f18;
        return j(t(f19, f18, f15 - 2.0f) * 256.0f) | (j(t(f19, f18, f15 + 2.0f) * 256.0f) << 16) | (j(t(f19, f18, f15) * 256.0f) << 8);
    }

    private static Boolean s0(String str) {
        str.getClass();
        switch (str) {
            case "hidden":
            case "scroll":
                return Boolean.FALSE;
            case "auto":
            case "visible":
                return Boolean.TRUE;
            default:
                return null;
        }
    }

    private static float t(float f10, float f11, float f12) {
        float f13;
        if (f12 < 0.0f) {
            f12 += 6.0f;
        }
        if (f12 >= 6.0f) {
            f12 -= 6.0f;
        }
        if (f12 < 1.0f) {
            f13 = (f11 - f10) * f12;
        } else {
            if (f12 < 3.0f) {
                return f11;
            }
            if (f12 >= 4.0f) {
                return f10;
            }
            f13 = (f11 - f10) * (4.0f - f12);
        }
        return f13 + f10;
    }

    private static N4.g.O t0(String str) {
        if (!str.startsWith("url(")) {
            return d0(str);
        }
        int iIndexOf = str.indexOf(")");
        if (iIndexOf == -1) {
            return new N4.g.C1200u(str.substring(4).trim(), null);
        }
        String strTrim = str.substring(4, iIndexOf).trim();
        String strTrim2 = str.substring(iIndexOf + 1).trim();
        return new N4.g.C1200u(strTrim, strTrim2.length() > 0 ? d0(strTrim2) : null);
    }

    private void u(Attributes attributes) throws N4.j {
        l("<image>", new Object[0]);
        if (this.f7702b == null) {
            throw new N4.j("Invalid document. Root element must be <svg>");
        }
        N4.g.C1194o c1194o = new N4.g.C1194o();
        c1194o.f7535a = this.f7701a;
        c1194o.f7536b = this.f7702b;
        D(c1194o, attributes);
        S(c1194o, attributes);
        W(c1194o, attributes);
        C(c1194o, attributes);
        G(c1194o, attributes);
        this.f7702b.i(c1194o);
        this.f7702b = c1194o;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0281  */
    /* JADX WARN: Code duplicated, block: B:102:0x0287  */
    /* JADX WARN: Code duplicated, block: B:118:0x0280 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:120:0x028f A[SYNTHETIC] */
    private static N4.g.C1202w u0(String str) {
        float f10;
        float f11;
        float f12;
        i iVar = new i(str);
        N4.g.C1202w c1202w = new N4.g.C1202w();
        if (!iVar.h()) {
            int iIntValue = iVar.l().intValue();
            int i10 = 109;
            if (iIntValue == 77 || iIntValue == 109) {
                int iIntValue2 = iIntValue;
                float f13 = 0.0f;
                float fN = 0.0f;
                float f14 = 0.0f;
                float fD = 0.0f;
                float f15 = 0.0f;
                float f16 = 0.0f;
                while (true) {
                    iVar.A();
                    switch (iIntValue2) {
                        case 65:
                        case 97:
                            float f17 = f13;
                            float fN2 = iVar.n();
                            float fD2 = iVar.d(fN2);
                            float f18 = f14;
                            float fD3 = iVar.d(fD2);
                            Boolean boolC = iVar.c(Float.valueOf(fD3));
                            Boolean boolC2 = iVar.c(boolC);
                            float fE = iVar.e(boolC2);
                            float fD4 = iVar.d(fE);
                            if (!Float.isNaN(fD4) && fN2 >= 0.0f && fD2 >= 0.0f) {
                                if (iIntValue2 == 97) {
                                    fE += f17;
                                    fD4 += f18;
                                }
                                float f19 = fD4;
                                boolean zBooleanValue = boolC.booleanValue();
                                boolean zBooleanValue2 = boolC2.booleanValue();
                                float f20 = fE;
                                c1202w.d(fN2, fD2, fD3, zBooleanValue, zBooleanValue2, f20, f19);
                                f13 = f20;
                                fN = f13;
                                f14 = f19;
                                fD = f14;
                                iVar.z();
                                if (iVar.h()) {
                                    if (iVar.i()) {
                                        iIntValue2 = iVar.l().intValue();
                                    }
                                    i10 = 109;
                                }
                            } else {
                                Log.e("SVGParser", "Bad path coords for " + ((char) iIntValue2) + " path segment");
                            }
                            break;
                        case 67:
                        case 99:
                            float fN3 = iVar.n();
                            float fD5 = iVar.d(fN3);
                            float fD6 = iVar.d(fD5);
                            float fD7 = iVar.d(fD6);
                            float fD8 = iVar.d(fD7);
                            float fD9 = iVar.d(fD8);
                            if (!Float.isNaN(fD9)) {
                                if (iIntValue2 == 99) {
                                    fD8 += f13;
                                    fD9 += f14;
                                    fN3 += f13;
                                    fD5 += f14;
                                    fD6 += f13;
                                    fD7 += f14;
                                }
                                float f21 = fN3;
                                float f22 = fD5;
                                f10 = fD6;
                                fD = fD7;
                                f11 = fD8;
                                f12 = fD9;
                                c1202w.c(f21, f22, f10, fD, f11, f12);
                                fN = f10;
                                f13 = f11;
                                f14 = f12;
                                iVar.z();
                                if (iVar.h()) {
                                    if (iVar.i()) {
                                        iIntValue2 = iVar.l().intValue();
                                    }
                                    i10 = 109;
                                }
                            } else {
                                Log.e("SVGParser", "Bad path coords for " + ((char) iIntValue2) + " path segment");
                            }
                            break;
                        case 72:
                        case 104:
                            float fN4 = iVar.n();
                            if (!Float.isNaN(fN4)) {
                                if (iIntValue2 == 104) {
                                    fN4 += f13;
                                }
                                f13 = fN4;
                                c1202w.e(f13, f14);
                                fN = f13;
                                iVar.z();
                                if (iVar.h()) {
                                    if (iVar.i()) {
                                        iIntValue2 = iVar.l().intValue();
                                    }
                                    i10 = 109;
                                }
                            } else {
                                Log.e("SVGParser", "Bad path coords for " + ((char) iIntValue2) + " path segment");
                            }
                            break;
                        case 76:
                        case 108:
                            float fN5 = iVar.n();
                            float fD10 = iVar.d(fN5);
                            if (!Float.isNaN(fD10)) {
                                if (iIntValue2 == 108) {
                                    fN5 += f13;
                                    fD10 += f14;
                                }
                                f13 = fN5;
                                f14 = fD10;
                                c1202w.e(f13, f14);
                                fN = f13;
                                fD = f14;
                                iVar.z();
                                if (iVar.h()) {
                                    if (iVar.i()) {
                                        iIntValue2 = iVar.l().intValue();
                                    }
                                    i10 = 109;
                                }
                            } else {
                                Log.e("SVGParser", "Bad path coords for " + ((char) iIntValue2) + " path segment");
                            }
                            break;
                        case 77:
                        case 109:
                            float fN6 = iVar.n();
                            float fD11 = iVar.d(fN6);
                            if (!Float.isNaN(fD11)) {
                                if (iIntValue2 == i10 && !c1202w.i()) {
                                    fN6 += f13;
                                    fD11 += f14;
                                }
                                f13 = fN6;
                                f14 = fD11;
                                c1202w.b(f13, f14);
                                fN = f13;
                                f15 = fN;
                                fD = f14;
                                f16 = fD;
                                iIntValue2 = iIntValue2 != i10 ? 76 : 108;
                                iVar.z();
                                if (iVar.h()) {
                                    if (iVar.i()) {
                                        iIntValue2 = iVar.l().intValue();
                                    }
                                    i10 = 109;
                                }
                            } else {
                                Log.e("SVGParser", "Bad path coords for " + ((char) iIntValue2) + " path segment");
                            }
                            break;
                        case 81:
                        case 113:
                            fN = iVar.n();
                            fD = iVar.d(fN);
                            float fD12 = iVar.d(fD);
                            float fD13 = iVar.d(fD12);
                            if (!Float.isNaN(fD13)) {
                                if (iIntValue2 == 113) {
                                    fD12 += f13;
                                    fD13 += f14;
                                    fN += f13;
                                    fD += f14;
                                }
                                f13 = fD12;
                                f14 = fD13;
                                c1202w.a(fN, fD, f13, f14);
                                iVar.z();
                                if (iVar.h()) {
                                    if (iVar.i()) {
                                        iIntValue2 = iVar.l().intValue();
                                    }
                                    i10 = 109;
                                }
                            } else {
                                Log.e("SVGParser", "Bad path coords for " + ((char) iIntValue2) + " path segment");
                            }
                            break;
                        case 83:
                        case 115:
                            float f23 = (f13 * 2.0f) - fN;
                            float f24 = (2.0f * f14) - fD;
                            float fN7 = iVar.n();
                            float fD14 = iVar.d(fN7);
                            float fD15 = iVar.d(fD14);
                            float fD16 = iVar.d(fD15);
                            if (!Float.isNaN(fD16)) {
                                if (iIntValue2 == 115) {
                                    fD15 += f13;
                                    fD16 += f14;
                                    fN7 += f13;
                                    fD14 += f14;
                                }
                                f10 = fN7;
                                fD = fD14;
                                f11 = fD15;
                                f12 = fD16;
                                c1202w.c(f23, f24, f10, fD, f11, f12);
                                fN = f10;
                                f13 = f11;
                                f14 = f12;
                                iVar.z();
                                if (iVar.h()) {
                                    if (iVar.i()) {
                                        iIntValue2 = iVar.l().intValue();
                                    }
                                    i10 = 109;
                                }
                            } else {
                                Log.e("SVGParser", "Bad path coords for " + ((char) iIntValue2) + " path segment");
                            }
                            break;
                        case 84:
                        case 116:
                            fN = (f13 * 2.0f) - fN;
                            fD = (2.0f * f14) - fD;
                            float fN8 = iVar.n();
                            float fD17 = iVar.d(fN8);
                            if (!Float.isNaN(fD17)) {
                                if (iIntValue2 == 116) {
                                    fN8 += f13;
                                    fD17 += f14;
                                }
                                f13 = fN8;
                                f14 = fD17;
                                c1202w.a(fN, fD, f13, f14);
                                iVar.z();
                                if (iVar.h()) {
                                    if (iVar.i()) {
                                        iIntValue2 = iVar.l().intValue();
                                    }
                                    i10 = 109;
                                }
                            } else {
                                Log.e("SVGParser", "Bad path coords for " + ((char) iIntValue2) + " path segment");
                            }
                            break;
                        case 86:
                        case 118:
                            float fN9 = iVar.n();
                            if (!Float.isNaN(fN9)) {
                                if (iIntValue2 == 118) {
                                    fN9 += f14;
                                }
                                f14 = fN9;
                                c1202w.e(f13, f14);
                                fD = f14;
                                iVar.z();
                                if (iVar.h()) {
                                    if (iVar.i()) {
                                        iIntValue2 = iVar.l().intValue();
                                    }
                                    i10 = 109;
                                }
                            } else {
                                Log.e("SVGParser", "Bad path coords for " + ((char) iIntValue2) + " path segment");
                            }
                            break;
                        case 90:
                        case 122:
                            c1202w.close();
                            f13 = f15;
                            fN = f13;
                            f14 = f16;
                            fD = f14;
                            iVar.z();
                            if (iVar.h()) {
                                if (iVar.i()) {
                                    iIntValue2 = iVar.l().intValue();
                                }
                                i10 = 109;
                            }
                            break;
                        default:
                            break;
                    }
                    return c1202w;
                }
            }
        }
        return c1202w;
    }

    private void v(Attributes attributes) throws N4.j {
        l("<line>", new Object[0]);
        if (this.f7702b == null) {
            throw new N4.j("Invalid document. Root element must be <svg>");
        }
        N4.g.C1196q c1196q = new N4.g.C1196q();
        c1196q.f7535a = this.f7701a;
        c1196q.f7536b = this.f7702b;
        D(c1196q, attributes);
        S(c1196q, attributes);
        W(c1196q, attributes);
        C(c1196q, attributes);
        H(c1196q, attributes);
        this.f7702b.i(c1196q);
    }

    static N4.e v0(String str) throws N4.j {
        N4.e.b bVar;
        i iVar = new i(str);
        iVar.A();
        String strR = iVar.r();
        if ("defer".equals(strR)) {
            iVar.A();
            strR = iVar.r();
        }
        N4.e.a aVarA = b.a(strR);
        iVar.A();
        if (iVar.h()) {
            bVar = null;
        } else {
            String strR2 = iVar.r();
            strR2.getClass();
            if (strR2.equals("meet")) {
                bVar = N4.e.b.meet;
            } else {
                if (!strR2.equals("slice")) {
                    throw new N4.j("Invalid preserveAspectRatio definition: " + str);
                }
                bVar = N4.e.b.slice;
            }
        }
        return new N4.e(aVarA, bVar);
    }

    private void w(Attributes attributes) throws N4.j {
        l("<linearGradient>", new Object[0]);
        if (this.f7702b == null) {
            throw new N4.j("Invalid document. Root element must be <svg>");
        }
        N4.g.M m10 = new N4.g.M();
        m10.f7535a = this.f7701a;
        m10.f7536b = this.f7702b;
        D(m10, attributes);
        S(m10, attributes);
        F(m10, attributes);
        I(m10, attributes);
        this.f7702b.i(m10);
        this.f7702b = m10;
    }

    private static void w0(N4.g.P p10, String str) {
        p10.f7537o = v0(str);
    }

    private void x(Attributes attributes) throws N4.j {
        l("<marker>", new Object[0]);
        if (this.f7702b == null) {
            throw new N4.j("Invalid document. Root element must be <svg>");
        }
        N4.g.C1197r c1197r = new N4.g.C1197r();
        c1197r.f7535a = this.f7701a;
        c1197r.f7536b = this.f7702b;
        D(c1197r, attributes);
        S(c1197r, attributes);
        C(c1197r, attributes);
        Y(c1197r, attributes);
        J(c1197r, attributes);
        this.f7702b.i(c1197r);
        this.f7702b = c1197r;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map x0(i iVar) {
        HashMap map = new HashMap();
        iVar.A();
        String strS = iVar.s('=');
        while (strS != null) {
            iVar.f('=');
            map.put(strS, iVar.q());
            iVar.A();
            strS = iVar.s('=');
        }
        return map;
    }

    private void y(Attributes attributes) throws N4.j {
        l("<mask>", new Object[0]);
        if (this.f7702b == null) {
            throw new N4.j("Invalid document. Root element must be <svg>");
        }
        N4.g.C1198s c1198s = new N4.g.C1198s();
        c1198s.f7535a = this.f7701a;
        c1198s.f7536b = this.f7702b;
        D(c1198s, attributes);
        S(c1198s, attributes);
        C(c1198s, attributes);
        K(c1198s, attributes);
        this.f7702b.i(c1198s);
        this.f7702b = c1198s;
    }

    private static N4.g.E.e y0(String str) {
        str.getClass();
        switch (str) {
            case "optimizeQuality":
                return N4.g.E.e.optimizeQuality;
            case "auto":
                return N4.g.E.e.auto;
            case "optimizeSpeed":
                return N4.g.E.e.optimizeSpeed;
            default:
                return null;
        }
    }

    private static Set z0(String str) {
        i iVar = new i(str);
        HashSet hashSet = new HashSet();
        while (!iVar.h()) {
            String strR = iVar.r();
            if (strR.startsWith("http://www.w3.org/TR/SVG11/feature#")) {
                hashSet.add(strR.substring(35));
            } else {
                hashSet.add("UNSUPPORTED");
            }
            iVar.A();
        }
        return hashSet;
    }

    N4.g z(InputStream inputStream, boolean z10) {
        if (!inputStream.markSupported()) {
            inputStream = new BufferedInputStream(inputStream);
        }
        try {
            inputStream.mark(3);
            int i10 = inputStream.read() + (inputStream.read() << 8);
            inputStream.reset();
            if (i10 == 35615) {
                inputStream = new BufferedInputStream(new GZIPInputStream(inputStream));
            }
        } catch (IOException unused) {
        }
        try {
            inputStream.mark(4096);
            L0(inputStream, z10);
            return this.f7701a;
        } finally {
            try {
                inputStream.close();
            } catch (IOException unused2) {
                Log.e("SVGParser", "Exception thrown closing input stream");
            }
        }
    }
}
