package com.facebook.react.uimanager.events;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements EventDispatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f30392a = new b();

    private b() {
    }

    @Override // com.facebook.react.uimanager.events.EventDispatcher
    public void a() {
    }

    @Override // com.facebook.react.uimanager.events.EventDispatcher
    public void b(i listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
    }

    @Override // com.facebook.react.uimanager.events.EventDispatcher
    public void c(i listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
    }

    @Override // com.facebook.react.uimanager.events.EventDispatcher
    public void d(d event) {
        Intrinsics.checkNotNullParameter(event, "event");
        W4.a.b("BlackHoleEventDispatcher", "Trying to emit event to JS, but the React instance isn't ready. Event: " + event.getEventName());
    }
}
