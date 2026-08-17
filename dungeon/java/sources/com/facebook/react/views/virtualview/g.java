package com.facebook.react.views.virtualview;

import android.graphics.Rect;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class g extends com.facebook.react.uimanager.events.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f31301a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f31302b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ReadableMap f31303c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ReadableMap f31304d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(int i10, int i11, f mode, Rect targetRect, Rect thresholdRect, boolean z10) {
        super(i10, i11);
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(targetRect, "targetRect");
        Intrinsics.checkNotNullParameter(thresholdRect, "thresholdRect");
        this.f31301a = mode;
        this.f31302b = z10;
        this.f31303c = h.b(targetRect);
        this.f31304d = h.b(thresholdRect);
    }

    @Override // com.facebook.react.uimanager.events.d
    protected boolean experimental_isSynchronous() {
        return this.f31302b;
    }

    @Override // com.facebook.react.uimanager.events.d
    public WritableMap getEventData() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        Intrinsics.checkNotNullExpressionValue(writableMapCreateMap, "createMap(...)");
        writableMapCreateMap.putInt("mode", this.f31301a.g());
        writableMapCreateMap.putMap("targetRect", this.f31303c);
        writableMapCreateMap.putMap("thresholdRect", this.f31304d);
        return writableMapCreateMap;
    }

    @Override // com.facebook.react.uimanager.events.d
    public String getEventName() {
        return "modeChange";
    }
}
