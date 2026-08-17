package com.facebook.react.uimanager;

import android.graphics.BlendMode;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.RenderEffect;
import android.graphics.Shader;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.facebook.react.uimanager.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2267n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2267n f30527a = new C2267n();

    private C2267n() {
    }

    private final ColorMatrix b(float f10) {
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setScale(f10, f10, f10, 1.0f);
        return colorMatrix;
    }

    private final RenderEffect d(ColorMatrix colorMatrix, RenderEffect renderEffect) {
        if (renderEffect == null) {
            RenderEffect renderEffectCreateColorFilterEffect = RenderEffect.createColorFilterEffect(new ColorMatrixColorFilter(colorMatrix));
            Intrinsics.c(renderEffectCreateColorFilterEffect);
            return renderEffectCreateColorFilterEffect;
        }
        RenderEffect renderEffectCreateColorFilterEffect2 = RenderEffect.createColorFilterEffect(new ColorMatrixColorFilter(colorMatrix), renderEffect);
        Intrinsics.c(renderEffectCreateColorFilterEffect2);
        return renderEffectCreateColorFilterEffect2;
    }

    private final ColorMatrix e(float f10) {
        float f11 = 255 * ((-(f10 / 2.0f)) + 0.5f);
        return new ColorMatrix(new float[]{f10, 0.0f, 0.0f, 0.0f, f11, 0.0f, f10, 0.0f, 0.0f, f11, 0.0f, 0.0f, f10, 0.0f, f11, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});
    }

    private final ColorMatrix h(float f10) {
        float f11 = 1 - f10;
        float f12 = 0.7152f - (f11 * 0.7152f);
        float f13 = 0.0722f - (f11 * 0.0722f);
        float f14 = 0.2126f - (f11 * 0.2126f);
        return new ColorMatrix(new float[]{(0.7874f * f11) + 0.2126f, f12, f13, 0.0f, 0.0f, f14, (0.2848f * f11) + 0.7152f, f13, 0.0f, 0.0f, f14, f12, (f11 * 0.9278f) + 0.0722f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});
    }

    private final ColorMatrix j(float f10) {
        double radians = Math.toRadians(f10);
        float fCos = (float) Math.cos(radians);
        float fSin = (float) Math.sin(radians);
        float f11 = 0.715f - (fCos * 0.715f);
        float f12 = fSin * 0.715f;
        float f13 = 0.072f - (fCos * 0.072f);
        float f14 = 0.213f - (fCos * 0.213f);
        return new ColorMatrix(new float[]{((fCos * 0.787f) + 0.213f) - (fSin * 0.213f), f11 - f12, (fSin * 0.928f) + f13, 0.0f, 0.0f, (0.143f * fSin) + f14, (0.285f * fCos) + 0.715f + (0.14f * fSin), f13 - (0.283f * fSin), 0.0f, 0.0f, f14 - (0.787f * fSin), f11 + f12, (fCos * 0.928f) + 0.072f + (fSin * 0.072f), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});
    }

    private final ColorMatrix l(float f10) {
        float f11 = 1 - (2 * f10);
        float f12 = f10 * 255;
        return new ColorMatrix(new float[]{f11, 0.0f, 0.0f, 0.0f, f12, 0.0f, f11, 0.0f, 0.0f, f12, 0.0f, 0.0f, f11, 0.0f, f12, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});
    }

    private final ColorMatrix p(float f10) {
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(f10);
        return colorMatrix;
    }

    private final ColorMatrix r(float f10) {
        float f11 = 1 - f10;
        return new ColorMatrix(new float[]{(0.607f * f11) + 0.393f, 0.769f - (f11 * 0.769f), 0.189f - (f11 * 0.189f), 0.0f, 0.0f, 0.349f - (f11 * 0.349f), (0.314f * f11) + 0.686f, 0.168f - (f11 * 0.168f), 0.0f, 0.0f, 0.272f - (f11 * 0.272f), 0.534f - (f11 * 0.534f), (f11 * 0.869f) + 0.131f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f});
    }

    public static final boolean t(ReadableArray readableArray) {
        if (readableArray == null || readableArray.size() == 0) {
            return false;
        }
        int size = readableArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            ReadableMap map = readableArray.getMap(i10);
            Intrinsics.c(map);
            String key = map.getEntryIterator().next().getKey();
            if (Intrinsics.b(key, "blur") || Intrinsics.b(key, "dropShadow")) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final ColorMatrixColorFilter v(ReadableArray readableArray) {
        ColorMatrix colorMatrixP;
        if (readableArray == null) {
            return null;
        }
        ColorMatrix colorMatrix = new ColorMatrix();
        int size = readableArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            ReadableMap map = readableArray.getMap(i10);
            if (map == null) {
                throw new IllegalStateException("Required value was null.");
            }
            Map.Entry<String, Object> next = map.getEntryIterator().next();
            String key = next.getKey();
            Object value = next.getValue();
            Intrinsics.d(value, "null cannot be cast to non-null type kotlin.Double");
            float fDoubleValue = (float) ((Double) value).doubleValue();
            switch (key.hashCode()) {
                case -2114203985:
                    if (!key.equals("saturate")) {
                        throw new IllegalArgumentException("Invalid color matrix filter: " + key);
                    }
                    colorMatrixP = f30527a.p(fDoubleValue);
                    colorMatrix.preConcat(colorMatrixP);
                    break;
                    break;
                case -1267206133:
                    if (!key.equals("opacity")) {
                        throw new IllegalArgumentException("Invalid color matrix filter: " + key);
                    }
                    colorMatrixP = f30527a.n(fDoubleValue);
                    colorMatrix.preConcat(colorMatrixP);
                    break;
                    break;
                case -1183703082:
                    if (!key.equals("invert")) {
                        throw new IllegalArgumentException("Invalid color matrix filter: " + key);
                    }
                    colorMatrixP = f30527a.l(fDoubleValue);
                    colorMatrix.preConcat(colorMatrixP);
                    break;
                    break;
                case -905411385:
                    if (!key.equals("grayscale")) {
                        throw new IllegalArgumentException("Invalid color matrix filter: " + key);
                    }
                    colorMatrixP = f30527a.h(fDoubleValue);
                    colorMatrix.preConcat(colorMatrixP);
                    break;
                    break;
                case -566947070:
                    if (!key.equals("contrast")) {
                        throw new IllegalArgumentException("Invalid color matrix filter: " + key);
                    }
                    colorMatrixP = f30527a.e(fDoubleValue);
                    colorMatrix.preConcat(colorMatrixP);
                    break;
                    break;
                case 109324790:
                    if (!key.equals("sepia")) {
                        throw new IllegalArgumentException("Invalid color matrix filter: " + key);
                    }
                    colorMatrixP = f30527a.r(fDoubleValue);
                    colorMatrix.preConcat(colorMatrixP);
                    break;
                    break;
                case 648162385:
                    if (!key.equals("brightness")) {
                        throw new IllegalArgumentException("Invalid color matrix filter: " + key);
                    }
                    colorMatrixP = f30527a.b(fDoubleValue);
                    colorMatrix.preConcat(colorMatrixP);
                    break;
                    break;
                case 650888307:
                    if (!key.equals("hueRotate")) {
                        throw new IllegalArgumentException("Invalid color matrix filter: " + key);
                    }
                    colorMatrixP = f30527a.j(fDoubleValue);
                    colorMatrix.preConcat(colorMatrixP);
                    break;
                    break;
                default:
                    throw new IllegalArgumentException("Invalid color matrix filter: " + key);
            }
        }
        return new ColorMatrixColorFilter(colorMatrix);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final RenderEffect w(ReadableArray readableArray) {
        RenderEffect renderEffectQ = null;
        if (readableArray == null) {
            return null;
        }
        int size = readableArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            ReadableMap map = readableArray.getMap(i10);
            if (map == null) {
                throw new IllegalStateException("Required value was null.");
            }
            Map.Entry<String, Object> next = map.getEntryIterator().next();
            String key = next.getKey();
            switch (key.hashCode()) {
                case -2114203985:
                    if (!key.equals("saturate")) {
                        throw new IllegalArgumentException("Invalid filter name: " + key);
                    }
                    C2267n c2267n = f30527a;
                    Object value = next.getValue();
                    Intrinsics.d(value, "null cannot be cast to non-null type kotlin.Double");
                    renderEffectQ = c2267n.q((float) ((Double) value).doubleValue(), renderEffectQ);
                    break;
                    break;
                case -1267206133:
                    if (!key.equals("opacity")) {
                        throw new IllegalArgumentException("Invalid filter name: " + key);
                    }
                    C2267n c2267n2 = f30527a;
                    Object value2 = next.getValue();
                    Intrinsics.d(value2, "null cannot be cast to non-null type kotlin.Double");
                    renderEffectQ = c2267n2.o((float) ((Double) value2).doubleValue(), renderEffectQ);
                    break;
                    break;
                case -1183703082:
                    if (!key.equals("invert")) {
                        throw new IllegalArgumentException("Invalid filter name: " + key);
                    }
                    C2267n c2267n3 = f30527a;
                    Object value3 = next.getValue();
                    Intrinsics.d(value3, "null cannot be cast to non-null type kotlin.Double");
                    renderEffectQ = c2267n3.m((float) ((Double) value3).doubleValue(), renderEffectQ);
                    break;
                    break;
                case -905411385:
                    if (!key.equals("grayscale")) {
                        throw new IllegalArgumentException("Invalid filter name: " + key);
                    }
                    C2267n c2267n4 = f30527a;
                    Object value4 = next.getValue();
                    Intrinsics.d(value4, "null cannot be cast to non-null type kotlin.Double");
                    renderEffectQ = c2267n4.i((float) ((Double) value4).doubleValue(), renderEffectQ);
                    break;
                    break;
                case -566947070:
                    if (!key.equals("contrast")) {
                        throw new IllegalArgumentException("Invalid filter name: " + key);
                    }
                    C2267n c2267n5 = f30527a;
                    Object value5 = next.getValue();
                    Intrinsics.d(value5, "null cannot be cast to non-null type kotlin.Double");
                    renderEffectQ = c2267n5.f((float) ((Double) value5).doubleValue(), renderEffectQ);
                    break;
                    break;
                case 3027047:
                    if (!key.equals("blur")) {
                        throw new IllegalArgumentException("Invalid filter name: " + key);
                    }
                    C2267n c2267n6 = f30527a;
                    Object value6 = next.getValue();
                    Intrinsics.d(value6, "null cannot be cast to non-null type kotlin.Double");
                    renderEffectQ = c2267n6.a((float) ((Double) value6).doubleValue(), renderEffectQ);
                    break;
                    break;
                case 109324790:
                    if (!key.equals("sepia")) {
                        throw new IllegalArgumentException("Invalid filter name: " + key);
                    }
                    C2267n c2267n7 = f30527a;
                    Object value7 = next.getValue();
                    Intrinsics.d(value7, "null cannot be cast to non-null type kotlin.Double");
                    renderEffectQ = c2267n7.s((float) ((Double) value7).doubleValue(), renderEffectQ);
                    break;
                    break;
                case 648162385:
                    if (!key.equals("brightness")) {
                        throw new IllegalArgumentException("Invalid filter name: " + key);
                    }
                    C2267n c2267n8 = f30527a;
                    Object value8 = next.getValue();
                    Intrinsics.d(value8, "null cannot be cast to non-null type kotlin.Double");
                    renderEffectQ = c2267n8.c((float) ((Double) value8).doubleValue(), renderEffectQ);
                    break;
                    break;
                case 650888307:
                    if (!key.equals("hueRotate")) {
                        throw new IllegalArgumentException("Invalid filter name: " + key);
                    }
                    C2267n c2267n9 = f30527a;
                    Object value9 = next.getValue();
                    Intrinsics.d(value9, "null cannot be cast to non-null type kotlin.Double");
                    renderEffectQ = c2267n9.k((float) ((Double) value9).doubleValue(), renderEffectQ);
                    break;
                    break;
                case 906978543:
                    if (!key.equals("dropShadow")) {
                        throw new IllegalArgumentException("Invalid filter name: " + key);
                    }
                    C2267n c2267n10 = f30527a;
                    Object value10 = next.getValue();
                    Intrinsics.d(value10, "null cannot be cast to non-null type com.facebook.react.bridge.ReadableMap");
                    renderEffectQ = c2267n10.u((ReadableMap) value10, renderEffectQ);
                    break;
                    break;
                default:
                    throw new IllegalArgumentException("Invalid filter name: " + key);
            }
        }
        return renderEffectQ;
    }

    public final RenderEffect a(float f10, RenderEffect renderEffect) {
        if (f10 <= 0.5d) {
            return null;
        }
        float fX = x(f10);
        return renderEffect == null ? RenderEffect.createBlurEffect(fX, fX, Shader.TileMode.DECAL) : RenderEffect.createBlurEffect(fX, fX, renderEffect, Shader.TileMode.DECAL);
    }

    public final RenderEffect c(float f10, RenderEffect renderEffect) {
        return d(b(f10), renderEffect);
    }

    public final RenderEffect f(float f10, RenderEffect renderEffect) {
        return d(e(f10), renderEffect);
    }

    public final RenderEffect g(float f10, float f11, float f12, int i10, RenderEffect renderEffect) {
        RenderEffect renderEffectCreateOffsetEffect;
        RenderEffect renderEffectCreateOffsetEffect2;
        if (renderEffect == null) {
            renderEffectCreateOffsetEffect2 = RenderEffect.createOffsetEffect(0.0f, 0.0f);
            Intrinsics.checkNotNullExpressionValue(renderEffectCreateOffsetEffect2, "createOffsetEffect(...)");
            renderEffectCreateOffsetEffect = RenderEffect.createOffsetEffect(f10, f11);
            Intrinsics.checkNotNullExpressionValue(renderEffectCreateOffsetEffect, "createOffsetEffect(...)");
        } else {
            RenderEffect renderEffectCreateOffsetEffect3 = RenderEffect.createOffsetEffect(0.0f, 0.0f, renderEffect);
            Intrinsics.checkNotNullExpressionValue(renderEffectCreateOffsetEffect3, "createOffsetEffect(...)");
            renderEffectCreateOffsetEffect = RenderEffect.createOffsetEffect(f10, f11, renderEffect);
            Intrinsics.checkNotNullExpressionValue(renderEffectCreateOffsetEffect, "createOffsetEffect(...)");
            renderEffectCreateOffsetEffect2 = renderEffectCreateOffsetEffect3;
        }
        AbstractC2253g.a();
        RenderEffect renderEffectCreateColorFilterEffect = RenderEffect.createColorFilterEffect(AbstractC2251f.a(i10, BlendMode.SRC_IN), renderEffectCreateOffsetEffect);
        Intrinsics.checkNotNullExpressionValue(renderEffectCreateColorFilterEffect, "createColorFilterEffect(...)");
        RenderEffect renderEffectCreateBlurEffect = RenderEffect.createBlurEffect(f12, f12, renderEffectCreateColorFilterEffect, Shader.TileMode.DECAL);
        Intrinsics.checkNotNullExpressionValue(renderEffectCreateBlurEffect, "createBlurEffect(...)");
        RenderEffect renderEffectCreateBlendModeEffect = RenderEffect.createBlendModeEffect(renderEffectCreateBlurEffect, renderEffectCreateOffsetEffect2, BlendMode.SRC_OVER);
        Intrinsics.checkNotNullExpressionValue(renderEffectCreateBlendModeEffect, "createBlendModeEffect(...)");
        return renderEffectCreateBlendModeEffect;
    }

    public final RenderEffect i(float f10, RenderEffect renderEffect) {
        return d(h(f10), renderEffect);
    }

    public final RenderEffect k(float f10, RenderEffect renderEffect) {
        return d(j(f10), renderEffect);
    }

    public final RenderEffect m(float f10, RenderEffect renderEffect) {
        return d(l(f10), renderEffect);
    }

    public final ColorMatrix n(float f10) {
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setScale(1.0f, 1.0f, 1.0f, f10);
        return colorMatrix;
    }

    public final RenderEffect o(float f10, RenderEffect renderEffect) {
        return d(n(f10), renderEffect);
    }

    public final RenderEffect q(float f10, RenderEffect renderEffect) {
        return d(p(f10), renderEffect);
    }

    public final RenderEffect s(float f10, RenderEffect renderEffect) {
        return d(r(f10), renderEffect);
    }

    public final RenderEffect u(ReadableMap filterValues, RenderEffect renderEffect) {
        Intrinsics.checkNotNullParameter(filterValues, "filterValues");
        H h10 = H.f30189a;
        return g(h10.a(filterValues.getDouble("offsetX")), h10.a(filterValues.getDouble("offsetY")), filterValues.hasKey("standardDeviation") ? x((float) filterValues.getDouble("standardDeviation")) : 0.0f, filterValues.hasKey("color") ? filterValues.getInt("color") : -16777216, renderEffect);
    }

    public final float x(float f10) {
        float fI = H.i(f10);
        if (fI > 0.5f) {
            return (fI - 0.5f) / 0.57735f;
        }
        return 0.0f;
    }
}
