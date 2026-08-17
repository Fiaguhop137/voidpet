package com.facebook.react.uimanager;

import android.widget.ImageView;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: com.facebook.react.uimanager.q0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C2274q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2274q0 f30542a = new C2274q0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Map f30543b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Map f30544c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Map f30545d;

    static {
        Pair pairA = Ad.v.a("topChange", kotlin.collections.N.f(Ad.v.a("phasedRegistrationNames", kotlin.collections.N.l(Ad.v.a("bubbled", "onChange"), Ad.v.a("captured", "onChangeCapture")))));
        Pair pairA2 = Ad.v.a("topSelect", kotlin.collections.N.f(Ad.v.a("phasedRegistrationNames", kotlin.collections.N.l(Ad.v.a("bubbled", "onSelect"), Ad.v.a("captured", "onSelectCapture")))));
        com.facebook.react.uimanager.events.x.a aVar = com.facebook.react.uimanager.events.x.f30488b;
        f30543b = kotlin.collections.N.l(pairA, pairA2, Ad.v.a(aVar.a(com.facebook.react.uimanager.events.x.START), kotlin.collections.N.f(Ad.v.a("phasedRegistrationNames", kotlin.collections.N.l(Ad.v.a("bubbled", "onTouchStart"), Ad.v.a("captured", "onTouchStartCapture"))))), Ad.v.a(aVar.a(com.facebook.react.uimanager.events.x.MOVE), kotlin.collections.N.f(Ad.v.a("phasedRegistrationNames", kotlin.collections.N.l(Ad.v.a("bubbled", "onTouchMove"), Ad.v.a("captured", "onTouchMoveCapture"))))), Ad.v.a(aVar.a(com.facebook.react.uimanager.events.x.END), kotlin.collections.N.f(Ad.v.a("phasedRegistrationNames", kotlin.collections.N.l(Ad.v.a("bubbled", "onTouchEnd"), Ad.v.a("captured", "onTouchEndCapture"))))), Ad.v.a(aVar.a(com.facebook.react.uimanager.events.x.CANCEL), kotlin.collections.N.f(Ad.v.a("phasedRegistrationNames", kotlin.collections.N.l(Ad.v.a("bubbled", "onTouchCancel"), Ad.v.a("captured", "onTouchCancelCapture"))))));
        f30544c = kotlin.collections.N.l(Ad.v.a("topContentSizeChange", kotlin.collections.N.f(Ad.v.a("registrationName", "onContentSizeChange"))), Ad.v.a("topLayout", kotlin.collections.N.f(Ad.v.a("registrationName", "onLayout"))), Ad.v.a("topLoadingError", kotlin.collections.N.f(Ad.v.a("registrationName", "onLoadingError"))), Ad.v.a("topLoadingFinish", kotlin.collections.N.f(Ad.v.a("registrationName", "onLoadingFinish"))), Ad.v.a("topLoadingStart", kotlin.collections.N.f(Ad.v.a("registrationName", "onLoadingStart"))), Ad.v.a("topSelectionChange", kotlin.collections.N.f(Ad.v.a("registrationName", "onSelectionChange"))), Ad.v.a("topMessage", kotlin.collections.N.f(Ad.v.a("registrationName", "onMessage"))), Ad.v.a("topScrollBeginDrag", kotlin.collections.N.f(Ad.v.a("registrationName", "onScrollBeginDrag"))), Ad.v.a("topScrollEndDrag", kotlin.collections.N.f(Ad.v.a("registrationName", "onScrollEndDrag"))), Ad.v.a("topScroll", kotlin.collections.N.f(Ad.v.a("registrationName", "onScroll"))), Ad.v.a("topMomentumScrollBegin", kotlin.collections.N.f(Ad.v.a("registrationName", "onMomentumScrollBegin"))), Ad.v.a("topMomentumScrollEnd", kotlin.collections.N.f(Ad.v.a("registrationName", "onMomentumScrollEnd"))));
        f30545d = kotlin.collections.N.l(Ad.v.a("UIView", kotlin.collections.N.f(Ad.v.a("ContentMode", kotlin.collections.N.l(Ad.v.a("ScaleAspectFit", Integer.valueOf(ImageView.ScaleType.FIT_CENTER.ordinal())), Ad.v.a("ScaleAspectFill", Integer.valueOf(ImageView.ScaleType.CENTER_CROP.ordinal())), Ad.v.a("ScaleAspectCenter", Integer.valueOf(ImageView.ScaleType.CENTER_INSIDE.ordinal())))))), Ad.v.a("StyleConstants", kotlin.collections.N.f(Ad.v.a("PointerEventsValues", kotlin.collections.N.l(Ad.v.a("none", Integer.valueOf(I.NONE.ordinal())), Ad.v.a("boxNone", Integer.valueOf(I.BOX_NONE.ordinal())), Ad.v.a("boxOnly", Integer.valueOf(I.BOX_ONLY.ordinal())), Ad.v.a("unspecified", Integer.valueOf(I.AUTO.ordinal())))))), Ad.v.a("AccessibilityEventTypes", kotlin.collections.N.l(Ad.v.a("typeWindowStateChanged", 32), Ad.v.a("typeViewFocused", 8), Ad.v.a("typeViewClicked", 1))));
    }

    private C2274q0() {
    }
}
