package com.swmansion.reanimated;

import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;

/* JADX INFO: loaded from: classes2.dex */
public class CopiedEvent {
    private String eventName;
    private WritableMap payload;
    private int targetTag;

    /* JADX INFO: renamed from: com.swmansion.reanimated.CopiedEvent$1, reason: invalid class name */
    class AnonymousClass1 implements RCTEventEmitter {
        AnonymousClass1() {
        }

        @Override // com.facebook.react.uimanager.events.RCTEventEmitter
        public void receiveEvent(int i10, String str, WritableMap writableMap) {
            CopiedEvent.this.targetTag = i10;
            CopiedEvent.this.eventName = str;
            CopiedEvent.this.payload = writableMap.copy();
        }

        @Override // com.facebook.react.uimanager.events.RCTEventEmitter
        public void receiveTouches(String str, WritableArray writableArray, WritableArray writableArray2) {
        }
    }

    CopiedEvent(com.facebook.react.uimanager.events.d dVar) {
        dVar.dispatch(new AnonymousClass1());
    }

    public String getEventName() {
        return this.eventName;
    }

    public WritableMap getPayload() {
        return this.payload;
    }

    public int getTargetTag() {
        return this.targetTag;
    }
}
