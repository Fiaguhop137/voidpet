package com.stroketext;

import android.view.View;
import com.facebook.react.uimanager.C2262k0;
import com.facebook.react.uimanager.SimpleViewManager;

/* JADX INFO: loaded from: classes2.dex */
public class StrokeTextViewManager extends SimpleViewManager<View> {
    public static final String REACT_CLASS = "StrokeTextView";

    @Override // com.facebook.react.uimanager.ViewManager
    public View createViewInstance(C2262k0 c2262k0) {
        return new a(c2262k0);
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "StrokeTextView";
    }

    @Y6.a(name = "color")
    public void setColor(a aVar, String str) {
        aVar.p(str);
    }

    @Y6.a(name = "ellipsis")
    public void setEllipsis(a aVar, boolean z10) {
        aVar.h(z10);
    }

    @Y6.a(name = "fontFamily")
    public void setFontFamily(a aVar, String str) {
        aVar.i(str);
    }

    @Y6.a(name = "fontSize")
    public void setFontSize(a aVar, float f10) {
        aVar.j(f10);
    }

    @Y6.a(name = "numberOfLines")
    public void setNumberOfLines(a aVar, int i10) {
        aVar.k(i10);
    }

    @Y6.a(name = "strokeColor")
    public void setStrokeColor(a aVar, String str) {
        aVar.l(str);
    }

    @Y6.a(name = "strokeWidth")
    public void setStrokeWidth(a aVar, float f10) {
        aVar.m(f10);
    }

    @Y6.a(name = "text")
    public void setText(a aVar, String str) {
        aVar.n(str);
    }

    @Y6.a(name = "align")
    public void setTextAlignment(a aVar, String str) {
        aVar.o(str);
    }

    @Y6.a(name = "width")
    public void setWidth(a aVar, float f10) {
        aVar.g(f10);
    }
}
