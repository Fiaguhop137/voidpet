package com.reactnativecommunity.slider;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;

/* JADX INFO: loaded from: classes2.dex */
public class b extends com.facebook.react.uimanager.events.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final double f38638a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f38639b;

    public b(int i10, double d10, boolean z10) {
        super(i10);
        this.f38638a = d10;
        this.f38639b = z10;
    }

    private WritableMap d() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putInt("target", getViewTag());
        writableMapCreateMap.putDouble("value", b());
        writableMapCreateMap.putBoolean("fromUser", c());
        return writableMapCreateMap;
    }

    public double b() {
        return this.f38638a;
    }

    public boolean c() {
        return this.f38639b;
    }

    @Override // com.facebook.react.uimanager.events.d
    public short getCoalescingKey() {
        return (short) 0;
    }

    @Override // com.facebook.react.uimanager.events.d
    protected WritableMap getEventData() {
        return d();
    }

    @Override // com.facebook.react.uimanager.events.d
    public String getEventName() {
        return "topChange";
    }
}
