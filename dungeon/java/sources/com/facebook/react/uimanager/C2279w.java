package com.facebook.react.uimanager;

import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableType;

/* JADX INFO: renamed from: com.facebook.react.uimanager.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C2279w extends W {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final b f30665y = new b(null);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    boolean f30666z;

    /* JADX INFO: renamed from: com.facebook.react.uimanager.w$a */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f30667a;

        static {
            int[] iArr = new int[com.facebook.yoga.w.values().length];
            f30667a = iArr;
            try {
                iArr[com.facebook.yoga.w.POINT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f30667a[com.facebook.yoga.w.UNDEFINED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f30667a[com.facebook.yoga.w.AUTO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f30667a[com.facebook.yoga.w.PERCENT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: renamed from: com.facebook.react.uimanager.w$b */
    private static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        float f30668a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        com.facebook.yoga.w f30669b;

        private b() {
        }

        /* synthetic */ b(AbstractC2280x abstractC2280x) {
            this();
        }

        void a(Dynamic dynamic) {
            if (dynamic.isNull()) {
                this.f30669b = com.facebook.yoga.w.UNDEFINED;
                this.f30668a = Float.NaN;
                return;
            }
            if (dynamic.getType() != ReadableType.String) {
                if (dynamic.getType() == ReadableType.Number) {
                    this.f30669b = com.facebook.yoga.w.POINT;
                    this.f30668a = H.h(dynamic.asDouble());
                    return;
                } else {
                    this.f30669b = com.facebook.yoga.w.UNDEFINED;
                    this.f30668a = Float.NaN;
                    return;
                }
            }
            String strAsString = dynamic.asString();
            if (strAsString.equals("auto")) {
                this.f30669b = com.facebook.yoga.w.AUTO;
                this.f30668a = Float.NaN;
            } else {
                if (strAsString.endsWith("%")) {
                    this.f30669b = com.facebook.yoga.w.PERCENT;
                    this.f30668a = Float.parseFloat(strAsString.substring(0, strAsString.length() - 1));
                    return;
                }
                W4.a.I("ReactNative", "Unknown value: " + strAsString);
                this.f30669b = com.facebook.yoga.w.UNDEFINED;
                this.f30668a = Float.NaN;
            }
        }
    }

    static {
        p348t6.b.a("LayoutShadowNode", p348t6.a.ERROR);
    }

    private int u1(int i10) {
        if (com.facebook.react.modules.i18nmanager.a.f().d(S())) {
            if (i10 == 0) {
                return 4;
            }
            if (i10 == 2) {
                return 5;
            }
        }
        return i10;
    }

    @Y6.a(name = "alignContent")
    public void setAlignContent(String str) {
        if (P()) {
        }
        if (str == null) {
            C0(com.facebook.yoga.a.FLEX_START);
            return;
        }
        switch (str) {
            case "stretch":
                C0(com.facebook.yoga.a.STRETCH);
                break;
            case "baseline":
                C0(com.facebook.yoga.a.BASELINE);
                break;
            case "center":
                C0(com.facebook.yoga.a.CENTER);
                break;
            case "flex-start":
                C0(com.facebook.yoga.a.FLEX_START);
                break;
            case "auto":
                C0(com.facebook.yoga.a.AUTO);
                break;
            case "space-between":
                C0(com.facebook.yoga.a.SPACE_BETWEEN);
                break;
            case "flex-end":
                C0(com.facebook.yoga.a.FLEX_END);
                break;
            case "space-around":
                C0(com.facebook.yoga.a.SPACE_AROUND);
                break;
            case "space-evenly":
                C0(com.facebook.yoga.a.SPACE_EVENLY);
                break;
            default:
                W4.a.I("ReactNative", "invalid value for alignContent: " + str);
                C0(com.facebook.yoga.a.FLEX_START);
                break;
        }
    }

    @Y6.a(name = "alignItems")
    public void setAlignItems(String str) {
        if (P()) {
        }
        if (str == null) {
            D0(com.facebook.yoga.a.STRETCH);
            return;
        }
        switch (str) {
            case "stretch":
                D0(com.facebook.yoga.a.STRETCH);
                break;
            case "baseline":
                D0(com.facebook.yoga.a.BASELINE);
                break;
            case "center":
                D0(com.facebook.yoga.a.CENTER);
                break;
            case "flex-start":
                D0(com.facebook.yoga.a.FLEX_START);
                break;
            case "auto":
                D0(com.facebook.yoga.a.AUTO);
                break;
            case "space-between":
                D0(com.facebook.yoga.a.SPACE_BETWEEN);
                break;
            case "flex-end":
                D0(com.facebook.yoga.a.FLEX_END);
                break;
            case "space-around":
                D0(com.facebook.yoga.a.SPACE_AROUND);
                break;
            default:
                W4.a.I("ReactNative", "invalid value for alignItems: " + str);
                D0(com.facebook.yoga.a.STRETCH);
                break;
        }
    }

    @Y6.a(name = "alignSelf")
    public void setAlignSelf(String str) {
        if (P()) {
        }
        if (str == null) {
            E0(com.facebook.yoga.a.AUTO);
            return;
        }
        switch (str) {
            case "stretch":
                E0(com.facebook.yoga.a.STRETCH);
                break;
            case "baseline":
                E0(com.facebook.yoga.a.BASELINE);
                break;
            case "center":
                E0(com.facebook.yoga.a.CENTER);
                break;
            case "flex-start":
                E0(com.facebook.yoga.a.FLEX_START);
                break;
            case "auto":
                E0(com.facebook.yoga.a.AUTO);
                break;
            case "space-between":
                E0(com.facebook.yoga.a.SPACE_BETWEEN);
                break;
            case "flex-end":
                E0(com.facebook.yoga.a.FLEX_END);
                break;
            case "space-around":
                E0(com.facebook.yoga.a.SPACE_AROUND);
                break;
            default:
                W4.a.I("ReactNative", "invalid value for alignSelf: " + str);
                E0(com.facebook.yoga.a.AUTO);
                break;
        }
    }

    @Y6.a(defaultFloat = Float.NaN, name = "aspectRatio")
    public void setAspectRatio(float f10) {
        f1(f10);
    }

    @Y6.b(defaultFloat = Float.NaN, names = {"borderWidth", "borderStartWidth", "borderEndWidth", "borderTopWidth", "borderBottomWidth", "borderLeftWidth", "borderRightWidth"})
    public void setBorderWidths(int i10, float f10) {
        if (P()) {
            return;
        }
        G0(u1(O0.f30340b[i10]), H.i(f10));
    }

    @Y6.a(name = "collapsable")
    public void setCollapsable(boolean z10) {
        this.f30666z = z10;
    }

    @Y6.a(name = "collapsableChildren")
    public void setCollapsableChildren(boolean z10) {
    }

    @Y6.a(name = "columnGap")
    public void setColumnGap(Dynamic dynamic) {
        if (P()) {
            return;
        }
        this.f30665y.a(dynamic);
        int i10 = a.f30667a[this.f30665y.f30669b.ordinal()];
        if (i10 == 1 || i10 == 2 || i10 == 3) {
            H0(this.f30665y.f30668a);
        } else if (i10 == 4) {
            I0(this.f30665y.f30668a);
        }
        dynamic.recycle();
    }

    @Y6.a(name = "display")
    public void setDisplay(String str) {
        if (P()) {
            return;
        }
        if (str == null) {
            K0(com.facebook.yoga.i.FLEX);
            return;
        }
        if (str.equals("flex")) {
            K0(com.facebook.yoga.i.FLEX);
            return;
        }
        if (str.equals("none")) {
            K0(com.facebook.yoga.i.NONE);
            return;
        }
        W4.a.I("ReactNative", "invalid value for display: " + str);
        K0(com.facebook.yoga.i.FLEX);
    }

    @Override // com.facebook.react.uimanager.W
    @Y6.a(defaultFloat = 0.0f, name = "flex")
    public void setFlex(float f10) {
        if (P()) {
            return;
        }
        super.setFlex(f10);
    }

    @Y6.a(name = "flexBasis")
    public void setFlexBasis(Dynamic dynamic) {
        if (P()) {
            return;
        }
        this.f30665y.a(dynamic);
        int i10 = a.f30667a[this.f30665y.f30669b.ordinal()];
        if (i10 == 1 || i10 == 2) {
            L0(this.f30665y.f30668a);
        } else if (i10 == 3) {
            M0();
        } else if (i10 == 4) {
            N0(this.f30665y.f30668a);
        }
        dynamic.recycle();
    }

    @Y6.a(name = "flexDirection")
    public void setFlexDirection(String str) {
        if (P()) {
        }
        if (str == null) {
            O0(com.facebook.yoga.l.COLUMN);
            return;
        }
        switch (str) {
            case "row-reverse":
                O0(com.facebook.yoga.l.ROW_REVERSE);
                break;
            case "column":
                O0(com.facebook.yoga.l.COLUMN);
                break;
            case "row":
                O0(com.facebook.yoga.l.ROW);
                break;
            case "column-reverse":
                O0(com.facebook.yoga.l.COLUMN_REVERSE);
                break;
            default:
                W4.a.I("ReactNative", "invalid value for flexDirection: " + str);
                O0(com.facebook.yoga.l.COLUMN);
                break;
        }
    }

    @Override // com.facebook.react.uimanager.W
    @Y6.a(defaultFloat = 0.0f, name = "flexGrow")
    public void setFlexGrow(float f10) {
        if (P()) {
            return;
        }
        super.setFlexGrow(f10);
    }

    @Override // com.facebook.react.uimanager.W
    @Y6.a(defaultFloat = 0.0f, name = "flexShrink")
    public void setFlexShrink(float f10) {
        if (P()) {
            return;
        }
        super.setFlexShrink(f10);
    }

    @Y6.a(name = "flexWrap")
    public void setFlexWrap(String str) {
        if (P()) {
        }
        if (str == null) {
            P0(com.facebook.yoga.x.NO_WRAP);
            return;
        }
        switch (str) {
            case "nowrap":
                P0(com.facebook.yoga.x.NO_WRAP);
                break;
            case "wrap-reverse":
                P0(com.facebook.yoga.x.WRAP_REVERSE);
                break;
            case "wrap":
                P0(com.facebook.yoga.x.WRAP);
                break;
            default:
                W4.a.I("ReactNative", "invalid value for flexWrap: " + str);
                P0(com.facebook.yoga.x.NO_WRAP);
                break;
        }
    }

    @Y6.a(name = "gap")
    public void setGap(Dynamic dynamic) {
        if (P()) {
            return;
        }
        this.f30665y.a(dynamic);
        int i10 = a.f30667a[this.f30665y.f30669b.ordinal()];
        if (i10 == 1 || i10 == 2 || i10 == 3) {
            Q0(this.f30665y.f30668a);
        } else if (i10 == 4) {
            R0(this.f30665y.f30668a);
        }
        dynamic.recycle();
    }

    @Y6.a(name = "height")
    public void setHeight(Dynamic dynamic) {
        if (P()) {
            return;
        }
        this.f30665y.a(dynamic);
        int i10 = a.f30667a[this.f30665y.f30669b.ordinal()];
        if (i10 == 1 || i10 == 2) {
            d(this.f30665y.f30668a);
        } else if (i10 == 3) {
            g1();
        } else if (i10 == 4) {
            h1(this.f30665y.f30668a);
        }
        dynamic.recycle();
    }

    @Y6.a(name = "inset")
    public void setInset(Dynamic dynamic) {
    }

    @Y6.b(names = {"insetBlock", "insetBlockEnd", "insetBlockStart"})
    public void setInsetBlock(int i10, Dynamic dynamic) {
    }

    @Y6.b(names = {"insetInline", "insetInlineEnd", "insetInlineStart"})
    public void setInsetInline(int i10, Dynamic dynamic) {
    }

    @Y6.a(name = "justifyContent")
    public void setJustifyContent(String str) {
        if (P()) {
        }
        if (str == null) {
            S0(com.facebook.yoga.n.FLEX_START);
            return;
        }
        switch (str) {
            case "center":
                S0(com.facebook.yoga.n.CENTER);
                break;
            case "flex-start":
                S0(com.facebook.yoga.n.FLEX_START);
                break;
            case "space-between":
                S0(com.facebook.yoga.n.SPACE_BETWEEN);
                break;
            case "flex-end":
                S0(com.facebook.yoga.n.FLEX_END);
                break;
            case "space-around":
                S0(com.facebook.yoga.n.SPACE_AROUND);
                break;
            case "space-evenly":
                S0(com.facebook.yoga.n.SPACE_EVENLY);
                break;
            default:
                W4.a.I("ReactNative", "invalid value for justifyContent: " + str);
                S0(com.facebook.yoga.n.FLEX_START);
                break;
        }
    }

    @Y6.b(names = {"marginBlock", "marginBlockEnd", "marginBlockStart"})
    public void setMarginBlock(int i10, Dynamic dynamic) {
    }

    @Y6.b(names = {"marginInline", "marginInlineEnd", "marginInlineStart"})
    public void setMarginInline(int i10, Dynamic dynamic) {
    }

    @Y6.b(names = {"margin", "marginVertical", "marginHorizontal", "marginStart", "marginEnd", "marginTop", "marginBottom", "marginLeft", "marginRight"})
    public void setMargins(int i10, Dynamic dynamic) {
        if (P()) {
            return;
        }
        int iU1 = u1(O0.f30341c[i10]);
        this.f30665y.a(dynamic);
        int i11 = a.f30667a[this.f30665y.f30669b.ordinal()];
        if (i11 == 1 || i11 == 2) {
            U0(iU1, this.f30665y.f30668a);
        } else if (i11 == 3) {
            V0(iU1);
        } else if (i11 == 4) {
            W0(iU1, this.f30665y.f30668a);
        }
        dynamic.recycle();
    }

    @Y6.a(name = "maxHeight")
    public void setMaxHeight(Dynamic dynamic) {
        if (P()) {
            return;
        }
        this.f30665y.a(dynamic);
        int i10 = a.f30667a[this.f30665y.f30669b.ordinal()];
        if (i10 == 1 || i10 == 2) {
            i1(this.f30665y.f30668a);
        } else if (i10 == 4) {
            j1(this.f30665y.f30668a);
        }
        dynamic.recycle();
    }

    @Y6.a(name = "maxWidth")
    public void setMaxWidth(Dynamic dynamic) {
        if (P()) {
            return;
        }
        this.f30665y.a(dynamic);
        int i10 = a.f30667a[this.f30665y.f30669b.ordinal()];
        if (i10 == 1 || i10 == 2) {
            k1(this.f30665y.f30668a);
        } else if (i10 == 4) {
            l1(this.f30665y.f30668a);
        }
        dynamic.recycle();
    }

    @Y6.a(name = "minHeight")
    public void setMinHeight(Dynamic dynamic) {
        if (P()) {
            return;
        }
        this.f30665y.a(dynamic);
        int i10 = a.f30667a[this.f30665y.f30669b.ordinal()];
        if (i10 == 1 || i10 == 2) {
            m1(this.f30665y.f30668a);
        } else if (i10 == 4) {
            n1(this.f30665y.f30668a);
        }
        dynamic.recycle();
    }

    @Y6.a(name = "minWidth")
    public void setMinWidth(Dynamic dynamic) {
        if (P()) {
            return;
        }
        this.f30665y.a(dynamic);
        int i10 = a.f30667a[this.f30665y.f30669b.ordinal()];
        if (i10 == 1 || i10 == 2) {
            o1(this.f30665y.f30668a);
        } else if (i10 == 4) {
            p1(this.f30665y.f30668a);
        }
        dynamic.recycle();
    }

    @Y6.a(name = "overflow")
    public void setOverflow(String str) {
        if (P()) {
        }
        if (str == null) {
            Y0(com.facebook.yoga.u.VISIBLE);
            return;
        }
        switch (str) {
            case "hidden":
                Y0(com.facebook.yoga.u.HIDDEN);
                break;
            case "scroll":
                Y0(com.facebook.yoga.u.SCROLL);
                break;
            case "visible":
                Y0(com.facebook.yoga.u.VISIBLE);
                break;
            default:
                W4.a.I("ReactNative", "invalid value for overflow: " + str);
                Y0(com.facebook.yoga.u.VISIBLE);
                break;
        }
    }

    @Y6.b(names = {"paddingBlock", "paddingBlockEnd", "paddingBlockStart"})
    public void setPaddingBlock(int i10, Dynamic dynamic) {
    }

    @Y6.b(names = {"paddingInline", "paddingInlineEnd", "paddingInlineStart"})
    public void setPaddingInline(int i10, Dynamic dynamic) {
    }

    @Y6.b(names = {"padding", "paddingVertical", "paddingHorizontal", "paddingStart", "paddingEnd", "paddingTop", "paddingBottom", "paddingLeft", "paddingRight"})
    public void setPaddings(int i10, Dynamic dynamic) {
        if (P()) {
            return;
        }
        int iU1 = u1(O0.f30341c[i10]);
        this.f30665y.a(dynamic);
        int i11 = a.f30667a[this.f30665y.f30669b.ordinal()];
        if (i11 == 1 || i11 == 2) {
            k(iU1, this.f30665y.f30668a);
        } else if (i11 == 4) {
            Z0(iU1, this.f30665y.f30668a);
        }
        dynamic.recycle();
    }

    @Y6.a(name = "position")
    public void setPosition(String str) {
        if (P()) {
            return;
        }
        if (str == null) {
            c1(com.facebook.yoga.v.RELATIVE);
            return;
        }
        if (str.equals("relative")) {
            c1(com.facebook.yoga.v.RELATIVE);
            return;
        }
        if (str.equals("absolute")) {
            c1(com.facebook.yoga.v.ABSOLUTE);
            return;
        }
        W4.a.I("ReactNative", "invalid value for position: " + str);
        c1(com.facebook.yoga.v.RELATIVE);
    }

    @Y6.b(names = {"start", "end", "left", "right", "top", "bottom"})
    public void setPositionValues(int i10, Dynamic dynamic) {
        if (P()) {
            return;
        }
        int iU1 = u1(new int[]{4, 5, 0, 2, 1, 3}[i10]);
        this.f30665y.a(dynamic);
        int i11 = a.f30667a[this.f30665y.f30669b.ordinal()];
        if (i11 == 1 || i11 == 2) {
            a1(iU1, this.f30665y.f30668a);
        } else if (i11 == 4) {
            b1(iU1, this.f30665y.f30668a);
        }
        dynamic.recycle();
    }

    @Y6.a(name = "rowGap")
    public void setRowGap(Dynamic dynamic) {
        if (P()) {
            return;
        }
        this.f30665y.a(dynamic);
        int i10 = a.f30667a[this.f30665y.f30669b.ordinal()];
        if (i10 == 1 || i10 == 2 || i10 == 3) {
            d1(this.f30665y.f30668a);
        } else if (i10 == 4) {
            e1(this.f30665y.f30668a);
        }
        dynamic.recycle();
    }

    @Override // com.facebook.react.uimanager.W
    @Y6.a(name = "onLayout")
    public void setShouldNotifyOnLayout(boolean z10) {
        super.setShouldNotifyOnLayout(z10);
    }

    @Y6.a(name = "onPointerEnter")
    public void setShouldNotifyPointerEnter(boolean z10) {
    }

    @Y6.a(name = "onPointerLeave")
    public void setShouldNotifyPointerLeave(boolean z10) {
    }

    @Y6.a(name = "onPointerMove")
    public void setShouldNotifyPointerMove(boolean z10) {
    }

    @Y6.a(name = "width")
    public void setWidth(Dynamic dynamic) {
        if (P()) {
            return;
        }
        this.f30665y.a(dynamic);
        int i10 = a.f30667a[this.f30665y.f30669b.ordinal()];
        if (i10 == 1 || i10 == 2) {
            Q(this.f30665y.f30668a);
        } else if (i10 == 3) {
            q1();
        } else if (i10 == 4) {
            r1(this.f30665y.f30668a);
        }
        dynamic.recycle();
    }
}
