package com.horcrux.svg;

import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableType;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
class SVGLength {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final double f38274a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final UnitType f38275b;

    public enum UnitType {
        UNKNOWN,
        NUMBER,
        PERCENTAGE,
        EMS,
        EXS,
        PX,
        CM,
        MM,
        IN,
        PT,
        PC
    }

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f38276a;

        static {
            int[] iArr = new int[ReadableType.values().length];
            f38276a = iArr;
            try {
                iArr[ReadableType.Number.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f38276a[ReadableType.String.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f38276a[ReadableType.Array.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private SVGLength() {
        this.f38274a = 0.0d;
        this.f38275b = UnitType.UNKNOWN;
    }

    SVGLength(double d10) {
        this.f38274a = d10;
        this.f38275b = UnitType.NUMBER;
    }

    SVGLength(String str) {
        String strTrim = str.trim();
        int length = strTrim.length();
        int i10 = length - 1;
        if (length == 0 || strTrim.equals("normal")) {
            this.f38275b = UnitType.UNKNOWN;
            this.f38274a = 0.0d;
            return;
        }
        if (strTrim.codePointAt(i10) == 37) {
            this.f38275b = UnitType.PERCENTAGE;
            this.f38274a = Double.valueOf(strTrim.substring(0, i10)).doubleValue();
            return;
        }
        int i11 = length - 2;
        if (i11 <= 0) {
            this.f38275b = UnitType.NUMBER;
            this.f38274a = Double.valueOf(strTrim).doubleValue();
            return;
        }
        String strSubstring = strTrim.substring(i11);
        strSubstring.getClass();
        switch (strSubstring) {
            case "cm":
                this.f38275b = UnitType.CM;
                length = i11;
                break;
            case "em":
                this.f38275b = UnitType.EMS;
                length = i11;
                break;
            case "ex":
                this.f38275b = UnitType.EXS;
                length = i11;
                break;
            case "in":
                this.f38275b = UnitType.IN;
                length = i11;
                break;
            case "mm":
                this.f38275b = UnitType.MM;
                length = i11;
                break;
            case "pc":
                this.f38275b = UnitType.PC;
                length = i11;
                break;
            case "pt":
                this.f38275b = UnitType.PT;
                length = i11;
                break;
            case "px":
                this.f38275b = UnitType.NUMBER;
                length = i11;
                break;
            default:
                this.f38275b = UnitType.NUMBER;
                break;
        }
        this.f38274a = Double.valueOf(strTrim.substring(0, length)).doubleValue();
    }

    static ArrayList a(Dynamic dynamic) {
        int i10 = a.f38276a[dynamic.getType().ordinal()];
        if (i10 == 1) {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(new SVGLength(dynamic.asDouble()));
            return arrayList;
        }
        int i11 = 0;
        if (i10 == 2) {
            String[] strArrSplit = dynamic.asString().trim().replaceAll(",", " ").split(" ");
            ArrayList arrayList2 = new ArrayList(strArrSplit.length);
            int length = strArrSplit.length;
            while (i11 < length) {
                arrayList2.add(new SVGLength(strArrSplit[i11]));
                i11++;
            }
            return arrayList2;
        }
        if (i10 != 3) {
            return null;
        }
        ReadableArray readableArrayAsArray = dynamic.asArray();
        int size = readableArrayAsArray.size();
        ArrayList arrayList3 = new ArrayList(size);
        while (i11 < size) {
            arrayList3.add(b(readableArrayAsArray.getDynamic(i11)));
            i11++;
        }
        return arrayList3;
    }

    static SVGLength b(Dynamic dynamic) {
        int i10 = a.f38276a[dynamic.getType().ordinal()];
        if (i10 != 1) {
            return i10 != 2 ? new SVGLength() : new SVGLength(dynamic.asString());
        }
        return new SVGLength(dynamic.asDouble());
    }

    static String c(Dynamic dynamic) {
        int i10 = a.f38276a[dynamic.getType().ordinal()];
        if (i10 == 1) {
            return String.valueOf(dynamic.asDouble());
        }
        if (i10 != 2) {
            return null;
        }
        return dynamic.asString();
    }
}
