package p002a1;

import X0.d;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
abstract class i {

    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int[] f19085a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final float[] f19086b;

        a(int i10, int i11) {
            this.f19085a = new int[]{i10, i11};
            this.f19086b = new float[]{0.0f, 1.0f};
        }

        a(int i10, int i11, int i12) {
            this.f19085a = new int[]{i10, i11, i12};
            this.f19086b = new float[]{0.0f, 0.5f, 1.0f};
        }

        a(List list, List list2) {
            int size = list.size();
            this.f19085a = new int[size];
            this.f19086b = new float[size];
            for (int i10 = 0; i10 < size; i10++) {
                this.f19085a[i10] = ((Integer) list.get(i10)).intValue();
                this.f19086b[i10] = ((Float) list2.get(i10)).floatValue();
            }
        }
    }

    private static a a(a aVar, int i10, int i11, boolean z10, int i12) {
        if (aVar != null) {
            return aVar;
        }
        return z10 ? new a(i10, i12, i11) : new a(i10, i11);
    }

    static Shader b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException {
        String name = xmlPullParser.getName();
        if (!name.equals("gradient")) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid gradient color tag " + name);
        }
        TypedArray typedArrayI = n.i(resources, theme, attributeSet, d.f15185F);
        float f10 = n.f(typedArrayI, xmlPullParser, "startX", d.f15194O, 0.0f);
        float f11 = n.f(typedArrayI, xmlPullParser, "startY", d.f15195P, 0.0f);
        float f12 = n.f(typedArrayI, xmlPullParser, "endX", d.f15196Q, 0.0f);
        float f13 = n.f(typedArrayI, xmlPullParser, "endY", d.f15197R, 0.0f);
        float f14 = n.f(typedArrayI, xmlPullParser, "centerX", d.f15189J, 0.0f);
        float f15 = n.f(typedArrayI, xmlPullParser, "centerY", d.f15190K, 0.0f);
        int iG = n.g(typedArrayI, xmlPullParser, "type", d.f15188I, 0);
        int iB = n.b(typedArrayI, xmlPullParser, "startColor", d.f15186G, 0);
        boolean zH = n.h(xmlPullParser, "centerColor");
        int iB2 = n.b(typedArrayI, xmlPullParser, "centerColor", d.f15193N, 0);
        int iB3 = n.b(typedArrayI, xmlPullParser, "endColor", d.f15187H, 0);
        int iG2 = n.g(typedArrayI, xmlPullParser, "tileMode", d.f15192M, 0);
        float f16 = n.f(typedArrayI, xmlPullParser, "gradientRadius", d.f15191L, 0.0f);
        typedArrayI.recycle();
        a aVarA = a(c(resources, xmlPullParser, attributeSet, theme), iB, iB3, zH, iB2);
        if (iG != 1) {
            return iG != 2 ? new LinearGradient(f10, f11, f12, f13, aVarA.f19085a, aVarA.f19086b, d(iG2)) : new SweepGradient(f14, f15, aVarA.f19085a, aVarA.f19086b);
        }
        if (f16 > 0.0f) {
            return new RadialGradient(f14, f15, f16, aVarA.f19085a, aVarA.f19086b, d(iG2));
        }
        throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
    }

    private static a c(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth;
        int depth2 = xmlPullParser.getDepth() + 1;
        ArrayList arrayList = new ArrayList(20);
        ArrayList arrayList2 = new ArrayList(20);
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1 || ((depth = xmlPullParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2 && xmlPullParser.getName().equals("item")) {
                TypedArray typedArrayI = n.i(resources, theme, attributeSet, d.f15198S);
                boolean zHasValue = typedArrayI.hasValue(d.f15199T);
                boolean zHasValue2 = typedArrayI.hasValue(d.f15200U);
                if (!zHasValue || !zHasValue2) {
                    throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
                }
                int color = typedArrayI.getColor(d.f15199T, 0);
                float f10 = typedArrayI.getFloat(d.f15200U, 0.0f);
                typedArrayI.recycle();
                arrayList2.add(Integer.valueOf(color));
                arrayList.add(Float.valueOf(f10));
            }
        }
        if (arrayList2.size() > 0) {
            return new a(arrayList2, arrayList);
        }
        return null;
    }

    private static Shader.TileMode d(int i10) {
        if (i10 != 1) {
            return i10 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR;
        }
        return Shader.TileMode.REPEAT;
    }
}
