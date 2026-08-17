package com.reactnativecommunity.slider;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;

/* JADX INFO: loaded from: classes2.dex */
public class f extends com.facebook.react.uimanager.events.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final double f38640a;

    public f(int i10, double d10) {
        super(i10);
        this.f38640a = d10;
    }

    private WritableMap c() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putInt("target", getViewTag());
        writableMapCreateMap.putDouble("value", b());
        return writableMapCreateMap;
    }

    public double b() {
        return this.f38640a;
    }

    @Override // com.facebook.react.uimanager.events.d
    public boolean canCoalesce() {
        return false;
    }

    @Override // com.facebook.react.uimanager.events.d
    public short getCoalescingKey() {
        return (short) 0;
    }

    @Override // com.facebook.react.uimanager.events.d
    protected WritableMap getEventData() {
        return c();
    }

    @Override // com.facebook.react.uimanager.events.d
    public String getEventName() {
        return "onRNCSliderSlidingComplete";
    }
}
