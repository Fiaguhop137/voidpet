package com.facebook.react.fabric.events;

import android.annotation.SuppressLint;
import com.facebook.jni.HybridClassBase;
import com.facebook.react.fabric.FabricSoLoader;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import p276p6.a;

/* JADX INFO: loaded from: classes2.dex */
@a
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \t2\u00020\u00012\u00020\u0002:\u0001\tB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005H\u0082 ¢\u0006\u0004\b\u0006\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\u0005H\u0082 ¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\u0004¨\u0006\n"}, d2 = {"Lcom/facebook/react/fabric/events/EventBeatManager;", "Lcom/facebook/jni/HybridClassBase;", "Lcom/facebook/react/uimanager/events/a;", "<init>", "()V", "", "initHybrid", "tick", "onBatchEventDispatched", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SuppressLint({"MissingNativeLoadLibrary"})
public final class EventBeatManager extends HybridClassBase implements com.facebook.react.uimanager.events.a {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/facebook/react/fabric/events/EventBeatManager$Companion;", "", "<init>", "()V", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        FabricSoLoader.staticInit();
    }

    public EventBeatManager() {
        initHybrid();
    }

    private final native void initHybrid();

    private final native void tick();

    @Override // com.facebook.react.uimanager.events.a
    public void onBatchEventDispatched() {
        tick();
    }
}
