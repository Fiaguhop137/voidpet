package com.facebook.react.uimanager.events;

import Ad.InterfaceC0791a;
import com.facebook.react.bridge.WritableMap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public abstract class d {

    @NotNull
    private static final a Companion = new a(null);
    private static int uniqueIdCounter;

    @Nullable
    private b eventAnimationDriverMatchSpecCached;
    private boolean isInitialized;
    private int surfaceId;
    private long timestampMs;
    private final int uniqueID;
    private int viewTag;

    private static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public interface b {
        boolean a(int i10, String str);
    }

    public static final class c implements b {
        c() {
        }

        @Override // com.facebook.react.uimanager.events.d.b
        public boolean a(int i10, String eventNameRhs) {
            Intrinsics.checkNotNullParameter(eventNameRhs, "eventNameRhs");
            return d.this.getViewTag() == i10 && Intrinsics.b(d.this.internal_getEventNameCompat(), eventNameRhs);
        }
    }

    protected d() {
        int i10 = uniqueIdCounter;
        uniqueIdCounter = i10 + 1;
        this.uniqueID = i10;
    }

    protected d(int i10) {
        int i11 = uniqueIdCounter;
        uniqueIdCounter = i11 + 1;
        this.uniqueID = i11;
        init(i10);
    }

    protected d(int i10, int i11) {
        int i12 = uniqueIdCounter;
        uniqueIdCounter = i12 + 1;
        this.uniqueID = i12;
        init(i10, i11);
    }

    public boolean canCoalesce() {
        return true;
    }

    @Nullable
    public d coalesce(@Nullable d dVar) {
        return this.timestampMs >= (dVar != null ? dVar.timestampMs : 0L) ? this : dVar;
    }

    public void dispatch(RCTEventEmitter rctEventEmitter) {
        Intrinsics.checkNotNullParameter(rctEventEmitter, "rctEventEmitter");
        rctEventEmitter.receiveEvent(this.viewTag, internal_getEventNameCompat(), getEventData());
    }

    public void dispatchModern(@NotNull RCTModernEventEmitter rctEventEmitter) {
        Intrinsics.checkNotNullParameter(rctEventEmitter, "rctEventEmitter");
        int i10 = this.surfaceId;
        if (i10 != -1) {
            rctEventEmitter.receiveEvent(i10, this.viewTag, internal_getEventNameCompat(), canCoalesce(), getCoalescingKey(), getEventData(), getEventCategory());
        } else {
            dispatch(rctEventEmitter);
        }
    }

    public final void dispose() {
        this.isInitialized = false;
        onDispose();
    }

    protected boolean experimental_isSynchronous() {
        return false;
    }

    public short getCoalescingKey() {
        return (short) 0;
    }

    @Nullable
    public b getEventAnimationDriverMatchSpec() {
        if (this.eventAnimationDriverMatchSpecCached == null) {
            this.eventAnimationDriverMatchSpecCached = new c();
        }
        return this.eventAnimationDriverMatchSpecCached;
    }

    protected int getEventCategory() {
        return 2;
    }

    protected WritableMap getEventData() {
        return null;
    }

    public abstract String getEventName();

    public final int getSurfaceId() {
        return this.surfaceId;
    }

    public final long getTimestampMs() {
        return this.timestampMs;
    }

    public final int getUniqueID() {
        return this.uniqueID;
    }

    public final int getViewTag() {
        return this.viewTag;
    }

    @InterfaceC0791a
    protected final void init(int i10) {
        init(-1, i10);
    }

    protected final void init(int i10, int i11) {
        init(i10, i11, p312r6.j.c());
    }

    protected final void init(int i10, int i11, long j10) {
        this.surfaceId = i10;
        this.viewTag = i11;
        this.timestampMs = j10;
        this.isInitialized = true;
    }

    public final boolean internal_experimental_isSynchronous$ReactAndroid_release() {
        return experimental_isSynchronous();
    }

    public final int internal_getEventCategory$ReactAndroid_release() {
        return getEventCategory();
    }

    @Nullable
    public final WritableMap internal_getEventData$ReactAndroid_release() {
        return getEventData();
    }

    @NotNull
    public final String internal_getEventNameCompat() {
        return getEventName();
    }

    public final boolean isInitialized() {
        return this.isInitialized;
    }

    public void onDispose() {
    }
}
