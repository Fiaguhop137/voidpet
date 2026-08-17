package com.facebook.react.animated;

import com.facebook.fbreact.specs.NativeAnimatedModuleSpec;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableArrayBuilder;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapBuilder;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.bridge.UIManagerListener;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.b;
import com.facebook.react.uimanager.AbstractChoreographerFrameCallbackC2271p;
import com.facebook.react.uimanager.C2270o0;
import com.facebook.react.uimanager.D;
import com.facebook.react.uimanager.UIManagerModule;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p359u.G;

/* JADX INFO: loaded from: classes2.dex */
@G6.a(name = "NativeAnimatedModule")
@Metadata(d1 = {"\u0000\u008f\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\b\u000e*\u0001v\b\u0007\u0018\u0000 ~2\u00020\u00012\u00020\u00022\u00020\u0003:\u0007\u007f\u0080\u0001\u0081\u0001\u0082\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\u000b\u001a\u00020\n2\n\u0010\t\u001a\u00060\bR\u00020\u0000H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\r\u001a\u00020\n2\n\u0010\t\u001a\u00060\bR\u00020\u0000H\u0002¢\u0006\u0004\b\r\u0010\fJ\u001b\u0010\u000e\u001a\u00020\n2\n\u0010\t\u001a\u00060\bR\u00020\u0000H\u0002¢\u0006\u0004\b\u000e\u0010\fJ\u000f\u0010\u000f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0016\u0010\u0015J\u0015\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0017\u0010\u0015J\u000f\u0010\u0018\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0018\u0010\u0010J\u000f\u0010\u0019\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0019\u0010\u0010J\u0017\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001e\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001f\u0010\u001dJ\u0017\u0010 \u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001aH\u0017¢\u0006\u0004\b \u0010\u001dJ\u0017\u0010!\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001aH\u0017¢\u0006\u0004\b!\u0010\u001dJ\u000f\u0010\"\u001a\u00020\nH\u0016¢\u0006\u0004\b\"\u0010\u0010J\u000f\u0010#\u001a\u00020\nH\u0016¢\u0006\u0004\b#\u0010\u0010J\u000f\u0010$\u001a\u00020\nH\u0016¢\u0006\u0004\b$\u0010\u0010J\u000f\u0010%\u001a\u00020\nH\u0016¢\u0006\u0004\b%\u0010\u0010J\u001f\u0010*\u001a\u00020\n2\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b*\u0010+J\u001f\u0010,\u001a\u00020\n2\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b,\u0010+J\u0017\u0010-\u001a\u00020\n2\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b-\u0010.J\u0017\u0010/\u001a\u00020\n2\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b/\u0010.J\u0017\u00100\u001a\u00020\n2\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b0\u0010.J\u001f\u00102\u001a\u00020\n2\u0006\u0010'\u001a\u00020&2\u0006\u00101\u001a\u00020&H\u0016¢\u0006\u0004\b2\u00103J\u001f\u00104\u001a\u00020\n2\u0006\u0010'\u001a\u00020&2\u0006\u00101\u001a\u00020&H\u0016¢\u0006\u0004\b4\u00103J\u0017\u00105\u001a\u00020\n2\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b5\u0010.J\u0017\u00106\u001a\u00020\n2\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b6\u0010.J/\u0010<\u001a\u00020\n2\u0006\u00107\u001a\u00020&2\u0006\u00108\u001a\u00020&2\u0006\u00109\u001a\u00020(2\u0006\u0010;\u001a\u00020:H\u0016¢\u0006\u0004\b<\u0010=J\u0017\u0010>\u001a\u00020\n2\u0006\u00107\u001a\u00020&H\u0016¢\u0006\u0004\b>\u0010.J\u001f\u0010A\u001a\u00020\n2\u0006\u0010?\u001a\u00020&2\u0006\u0010@\u001a\u00020&H\u0016¢\u0006\u0004\bA\u00103J\u001f\u0010B\u001a\u00020\n2\u0006\u0010?\u001a\u00020&2\u0006\u0010@\u001a\u00020&H\u0016¢\u0006\u0004\bB\u00103J\u001f\u0010D\u001a\u00020\n2\u0006\u00108\u001a\u00020&2\u0006\u0010C\u001a\u00020&H\u0016¢\u0006\u0004\bD\u00103J\u001f\u0010E\u001a\u00020\n2\u0006\u00108\u001a\u00020&2\u0006\u0010C\u001a\u00020&H\u0016¢\u0006\u0004\bE\u00103J\u0017\u0010F\u001a\u00020\n2\u0006\u00108\u001a\u00020&H\u0016¢\u0006\u0004\bF\u0010.J'\u0010J\u001a\u00020\n2\u0006\u0010C\u001a\u00020&2\u0006\u0010H\u001a\u00020G2\u0006\u0010I\u001a\u00020(H\u0016¢\u0006\u0004\bJ\u0010KJ'\u0010M\u001a\u00020\n2\u0006\u0010C\u001a\u00020&2\u0006\u0010H\u001a\u00020G2\u0006\u0010L\u001a\u00020&H\u0016¢\u0006\u0004\bM\u0010NJ\u0017\u0010O\u001a\u00020\n2\u0006\u0010H\u001a\u00020GH\u0016¢\u0006\u0004\bO\u0010PJ\u0017\u0010R\u001a\u00020\n2\u0006\u0010Q\u001a\u00020&H\u0016¢\u0006\u0004\bR\u0010.J\u001f\u0010U\u001a\u00020\n2\u0006\u0010S\u001a\u00020&2\u0006\u0010T\u001a\u00020:H\u0016¢\u0006\u0004\bU\u0010VJ\u000f\u0010W\u001a\u00020\nH\u0016¢\u0006\u0004\bW\u0010\u0010J\u0017\u0010Z\u001a\u00020\n2\u0006\u0010Y\u001a\u00020XH\u0016¢\u0006\u0004\bZ\u0010[R\u0014\u0010]\u001a\u00020\\8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010^R\u0018\u0010`\u001a\u00060_R\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010aR\u0018\u0010b\u001a\u00060_R\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010aR\u001c\u0010e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010d0c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010fR\u0016\u0010h\u001a\u00020g8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u0010iR\u0016\u0010k\u001a\u00020j8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bk\u0010lR\u0016\u0010m\u001a\u00020j8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bm\u0010lR\u0016\u0010n\u001a\u00020g8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bn\u0010iR\u0016\u0010o\u001a\u00020g8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bo\u0010iR\u001c\u0010p\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\bp\u0010q\u0012\u0004\br\u0010\u0010R\u0016\u0010s\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bs\u0010qR\u0016\u0010t\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bt\u0010qR\u0016\u0010u\u001a\u00020g8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bu\u0010iR\u0014\u0010w\u001a\u00020v8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bw\u0010xR(\u0010y\u001a\u0004\u0018\u00010d2\b\u0010y\u001a\u0004\u0018\u00010d8F@GX\u0086\u000e¢\u0006\f\u001a\u0004\bz\u0010{\"\u0004\b|\u0010}¨\u0006\u0083\u0001"}, d2 = {"Lcom/facebook/react/animated/NativeAnimatedModule;", "Lcom/facebook/fbreact/specs/NativeAnimatedModuleSpec;", "Lcom/facebook/react/bridge/LifecycleEventListener;", "Lcom/facebook/react/bridge/UIManagerListener;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "Lcom/facebook/react/animated/NativeAnimatedModule$d;", "operation", "", "addOperation", "(Lcom/facebook/react/animated/NativeAnimatedModule$d;)V", "addUnbatchedOperation", "addPreOperation", "clearFrameCallback", "()V", "enqueueFrameCallback", "", "viewTag", "initializeLifecycleEventListenersForViewTag", "(I)V", "decrementInFlightAnimationsForViewTag", "userDrivenScrollEnded", "initialize", "onHostResume", "Lcom/facebook/react/bridge/UIManager;", "uiManager", "didScheduleMountItems", "(Lcom/facebook/react/bridge/UIManager;)V", "willMountItems", "didMountItems", "didDispatchMountItems", "willDispatchViewUpdates", "onHostPause", "onHostDestroy", "startOperationBatch", "finishOperationBatch", "", "tagDouble", "Lcom/facebook/react/bridge/ReadableMap;", "config", "createAnimatedNode", "(DLcom/facebook/react/bridge/ReadableMap;)V", "updateAnimatedNodeConfig", "startListeningToAnimatedNodeValue", "(D)V", "stopListeningToAnimatedNodeValue", "dropAnimatedNode", "value", "setAnimatedNodeValue", "(DD)V", "setAnimatedNodeOffset", "flattenAnimatedNodeOffset", "extractAnimatedNodeOffset", "animationIdDouble", "animatedNodeTagDouble", "animationConfig", "Lcom/facebook/react/bridge/Callback;", "endCallback", "startAnimatingNode", "(DDLcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Callback;)V", "stopAnimation", "parentNodeTagDouble", "childNodeTagDouble", "connectAnimatedNodes", "disconnectAnimatedNodes", "viewTagDouble", "connectAnimatedNodeToView", "disconnectAnimatedNodeFromView", "restoreDefaultValues", "", "eventName", "eventMapping", "addAnimatedEventToView", "(DLjava/lang/String;Lcom/facebook/react/bridge/ReadableMap;)V", "animatedValueTagDouble", "removeAnimatedEventFromView", "(DLjava/lang/String;D)V", "addListener", "(Ljava/lang/String;)V", "count", "removeListeners", "animatedValueNodeTagDouble", "callback", "getValue", "(DLcom/facebook/react/bridge/Callback;)V", "invalidate", "Lcom/facebook/react/bridge/ReadableArray;", "opsAndArgs", "queueAndExecuteBatchedOperations", "(Lcom/facebook/react/bridge/ReadableArray;)V", "Lcom/facebook/react/modules/core/b;", "reactChoreographer", "Lcom/facebook/react/modules/core/b;", "Lcom/facebook/react/animated/NativeAnimatedModule$c;", "operations", "Lcom/facebook/react/animated/NativeAnimatedModule$c;", "preOperations", "Ljava/util/concurrent/atomic/AtomicReference;", "Lq6/t;", "nodesManagerRef", "Ljava/util/concurrent/atomic/AtomicReference;", "", "batchingControlledByJS", "Z", "", "currentFrameNumber", "J", "currentBatchNumber", "initializedForFabric", "initializedForNonFabric", "uiManagerType", "I", "getUiManagerType$annotations", "numFabricAnimations", "numNonFabricAnimations", "enqueuedAnimationOnFrame", "com/facebook/react/animated/NativeAnimatedModule$g", "animatedFrameCallback", "Lcom/facebook/react/animated/NativeAnimatedModule$g;", "nodesManager", "getNodesManager", "()Lq6/t;", "setNodesManager", "(Lq6/t;)V", "Companion", "a", "d", "c", "b", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class NativeAnimatedModule extends NativeAnimatedModuleSpec implements LifecycleEventListener, UIManagerListener {
    public static final boolean ANIMATED_MODULE_DEBUG = false;

    @NotNull
    public static final String NAME = "NativeAnimatedModule";

    @NotNull
    private final g animatedFrameCallback;
    private boolean batchingControlledByJS;
    private volatile long currentBatchNumber;
    private volatile long currentFrameNumber;
    private boolean enqueuedAnimationOnFrame;
    private boolean initializedForFabric;
    private boolean initializedForNonFabric;

    @NotNull
    private final AtomicReference<p294q6.t> nodesManagerRef;
    private int numFabricAnimations;
    private int numNonFabricAnimations;

    @NotNull
    private final c operations;

    @NotNull
    private final c preOperations;

    @NotNull
    private final b reactChoreographer;
    private int uiManagerType;

    private enum a {
        OP_CODE_CREATE_ANIMATED_NODE(1),
        OP_CODE_UPDATE_ANIMATED_NODE_CONFIG(2),
        OP_CODE_GET_VALUE(3),
        OP_START_LISTENING_TO_ANIMATED_NODE_VALUE(4),
        OP_STOP_LISTENING_TO_ANIMATED_NODE_VALUE(5),
        OP_CODE_CONNECT_ANIMATED_NODES(6),
        OP_CODE_DISCONNECT_ANIMATED_NODES(7),
        OP_CODE_START_ANIMATING_NODE(8),
        OP_CODE_STOP_ANIMATION(9),
        OP_CODE_SET_ANIMATED_NODE_VALUE(10),
        OP_CODE_SET_ANIMATED_NODE_OFFSET(11),
        OP_CODE_FLATTEN_ANIMATED_NODE_OFFSET(12),
        OP_CODE_EXTRACT_ANIMATED_NODE_OFFSET(13),
        OP_CODE_CONNECT_ANIMATED_NODE_TO_VIEW(14),
        OP_CODE_DISCONNECT_ANIMATED_NODE_FROM_VIEW(15),
        OP_CODE_RESTORE_DEFAULT_VALUES(16),
        OP_CODE_DROP_ANIMATED_NODE(17),
        OP_CODE_ADD_ANIMATED_EVENT_TO_VIEW(18),
        OP_CODE_REMOVE_ANIMATED_EVENT_FROM_VIEW(19),
        OP_CODE_ADD_LISTENER(20),
        OP_CODE_REMOVE_LISTENERS(21);


        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static a[] f29415b;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f29438y = Gd.a.a(e());

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0373a f29414a = new C0373a(null);

        /* JADX INFO: renamed from: com.facebook.react.animated.NativeAnimatedModule$a$a, reason: collision with other inner class name */
        public static final class C0373a {
            private C0373a() {
            }

            public /* synthetic */ C0373a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final a a(int i10) {
                a[] aVarArrValues = a.f29415b;
                if (aVarArrValues == null) {
                    aVarArrValues = a.values();
                }
                if (a.f29415b == null) {
                    a.f29415b = aVarArrValues;
                }
                return aVarArrValues[i10 - 1];
            }
        }

        a(int i10) {
        }
    }

    private final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Queue f29439a = new ConcurrentLinkedQueue();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private d f29440b;

        public c() {
        }

        public final void a(d operation) {
            Intrinsics.checkNotNullParameter(operation, "operation");
            this.f29439a.add(operation);
        }

        /* JADX WARN: Code duplicated, block: B:15:0x002a  */
        /* JADX WARN: Code duplicated, block: B:19:0x0035 A[LOOP:0: B:6:0x000d->B:19:0x0035, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:20:0x0032 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:22:0x0029 A[SYNTHETIC] */
        public final List b(long j10) {
            d dVar;
            if (d()) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            while (true) {
                d dVar2 = this.f29440b;
                if (dVar2 == null) {
                    dVar = (d) this.f29439a.poll();
                    if (dVar == null) {
                        if (dVar.b() > j10) {
                            this.f29440b = dVar;
                            return arrayList;
                        }
                        arrayList.add(dVar);
                    }
                } else if (dVar2.b() <= j10) {
                    arrayList.add(dVar2);
                    this.f29440b = null;
                    dVar = (d) this.f29439a.poll();
                    if (dVar == null) {
                        if (dVar.b() > j10) {
                            this.f29440b = dVar;
                            return arrayList;
                        }
                        arrayList.add(dVar);
                    }
                }
                return arrayList;
            }
        }

        public final void c(long j10, p294q6.t tVar) {
            List<d> listB = b(j10);
            if (listB != null) {
                for (d dVar : listB) {
                    if (tVar == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    dVar.a(tVar);
                }
            }
        }

        public final boolean d() {
            return this.f29439a.isEmpty() && this.f29440b == null;
        }
    }

    private abstract class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f29442a = -1;

        public d() {
        }

        public abstract void a(p294q6.t tVar);

        public final long b() {
            return this.f29442a;
        }

        public final void c(long j10) {
            this.f29442a = j10;
        }
    }

    public /* synthetic */ class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f29444a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.OP_CODE_GET_VALUE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.OP_START_LISTENING_TO_ANIMATED_NODE_VALUE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.OP_STOP_LISTENING_TO_ANIMATED_NODE_VALUE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[a.OP_CODE_STOP_ANIMATION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[a.OP_CODE_FLATTEN_ANIMATED_NODE_OFFSET.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[a.OP_CODE_EXTRACT_ANIMATED_NODE_OFFSET.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[a.OP_CODE_RESTORE_DEFAULT_VALUES.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[a.OP_CODE_DROP_ANIMATED_NODE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[a.OP_CODE_ADD_LISTENER.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[a.OP_CODE_REMOVE_LISTENERS.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[a.OP_CODE_CREATE_ANIMATED_NODE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[a.OP_CODE_UPDATE_ANIMATED_NODE_CONFIG.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[a.OP_CODE_CONNECT_ANIMATED_NODES.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[a.OP_CODE_DISCONNECT_ANIMATED_NODES.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[a.OP_CODE_SET_ANIMATED_NODE_VALUE.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[a.OP_CODE_SET_ANIMATED_NODE_OFFSET.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[a.OP_CODE_DISCONNECT_ANIMATED_NODE_FROM_VIEW.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[a.OP_CODE_START_ANIMATING_NODE.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[a.OP_CODE_REMOVE_ANIMATED_EVENT_FROM_VIEW.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[a.OP_CODE_CONNECT_ANIMATED_NODE_TO_VIEW.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[a.OP_CODE_ADD_ANIMATED_EVENT_TO_VIEW.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            f29444a = iArr;
        }
    }

    public static final class f extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f29445c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f29446d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ ReadableMap f29447e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(NativeAnimatedModule nativeAnimatedModule, int i10, String str, ReadableMap readableMap) {
            super();
            this.f29445c = i10;
            this.f29446d = str;
            this.f29447e = readableMap;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.d
        public void a(p294q6.t animatedNodesManager) {
            Intrinsics.checkNotNullParameter(animatedNodesManager, "animatedNodesManager");
            animatedNodesManager.b(this.f29445c, this.f29446d, this.f29447e);
        }
    }

    public static final class g extends AbstractChoreographerFrameCallbackC2271p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ NativeAnimatedModule f29448a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(ReactApplicationContext reactApplicationContext, NativeAnimatedModule nativeAnimatedModule) {
            super(reactApplicationContext);
            this.f29448a = nativeAnimatedModule;
        }

        @Override // com.facebook.react.uimanager.AbstractChoreographerFrameCallbackC2271p
        protected void doFrameGuarded(long j10) {
            try {
                this.f29448a.enqueuedAnimationOnFrame = false;
                p294q6.t nodesManager = this.f29448a.getNodesManager();
                if (nodesManager == null) {
                    return;
                }
                if (nodesManager.o()) {
                    nodesManager.u(j10);
                }
                this.f29448a.enqueueFrameCallback();
            } catch (Exception e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    public static final class h extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f29449c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f29450d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(NativeAnimatedModule nativeAnimatedModule, int i10, int i11) {
            super();
            this.f29449c = i10;
            this.f29450d = i11;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.d
        public void a(p294q6.t animatedNodesManager) {
            Intrinsics.checkNotNullParameter(animatedNodesManager, "animatedNodesManager");
            animatedNodesManager.c(this.f29449c, this.f29450d);
        }
    }

    public static final class i extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f29451c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f29452d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(NativeAnimatedModule nativeAnimatedModule, int i10, int i11) {
            super();
            this.f29451c = i10;
            this.f29452d = i11;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.d
        public void a(p294q6.t animatedNodesManager) {
            Intrinsics.checkNotNullParameter(animatedNodesManager, "animatedNodesManager");
            animatedNodesManager.d(this.f29451c, this.f29452d);
        }
    }

    public static final class j extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f29453c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ ReadableMap f29454d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(NativeAnimatedModule nativeAnimatedModule, int i10, ReadableMap readableMap) {
            super();
            this.f29453c = i10;
            this.f29454d = readableMap;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.d
        public void a(p294q6.t animatedNodesManager) {
            Intrinsics.checkNotNullParameter(animatedNodesManager, "animatedNodesManager");
            animatedNodesManager.e(this.f29453c, this.f29454d);
        }
    }

    public static final class k extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f29455c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f29456d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(NativeAnimatedModule nativeAnimatedModule, int i10, int i11) {
            super();
            this.f29455c = i10;
            this.f29456d = i11;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.d
        public void a(p294q6.t animatedNodesManager) {
            Intrinsics.checkNotNullParameter(animatedNodesManager, "animatedNodesManager");
            animatedNodesManager.f(this.f29455c, this.f29456d);
        }
    }

    public static final class l extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f29457c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f29458d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(NativeAnimatedModule nativeAnimatedModule, int i10, int i11) {
            super();
            this.f29457c = i10;
            this.f29458d = i11;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.d
        public void a(p294q6.t animatedNodesManager) {
            Intrinsics.checkNotNullParameter(animatedNodesManager, "animatedNodesManager");
            animatedNodesManager.g(this.f29457c, this.f29458d);
        }
    }

    public static final class m extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f29459c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(NativeAnimatedModule nativeAnimatedModule, int i10) {
            super();
            this.f29459c = i10;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.d
        public void a(p294q6.t animatedNodesManager) {
            Intrinsics.checkNotNullParameter(animatedNodesManager, "animatedNodesManager");
            animatedNodesManager.h(this.f29459c);
        }
    }

    public static final class n extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f29460c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(NativeAnimatedModule nativeAnimatedModule, int i10) {
            super();
            this.f29460c = i10;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.d
        public void a(p294q6.t animatedNodesManager) {
            Intrinsics.checkNotNullParameter(animatedNodesManager, "animatedNodesManager");
            animatedNodesManager.i(this.f29460c);
        }
    }

    public static final class o extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f29461c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(NativeAnimatedModule nativeAnimatedModule, int i10) {
            super();
            this.f29461c = i10;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.d
        public void a(p294q6.t animatedNodesManager) {
            Intrinsics.checkNotNullParameter(animatedNodesManager, "animatedNodesManager");
            animatedNodesManager.j(this.f29461c);
        }
    }

    public static final class p extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f29462c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Callback f29463d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(NativeAnimatedModule nativeAnimatedModule, int i10, Callback callback) {
            super();
            this.f29462c = i10;
            this.f29463d = callback;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.d
        public void a(p294q6.t animatedNodesManager) {
            Intrinsics.checkNotNullParameter(animatedNodesManager, "animatedNodesManager");
            animatedNodesManager.m(this.f29462c, this.f29463d);
        }
    }

    public static final class q extends d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f29465d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ ReadableArray f29466e;

        public /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f29467a;

            static {
                int[] iArr = new int[a.values().length];
                try {
                    iArr[a.OP_CODE_CREATE_ANIMATED_NODE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[a.OP_CODE_UPDATE_ANIMATED_NODE_CONFIG.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[a.OP_CODE_GET_VALUE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[a.OP_START_LISTENING_TO_ANIMATED_NODE_VALUE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[a.OP_STOP_LISTENING_TO_ANIMATED_NODE_VALUE.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[a.OP_CODE_CONNECT_ANIMATED_NODES.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[a.OP_CODE_DISCONNECT_ANIMATED_NODES.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[a.OP_CODE_START_ANIMATING_NODE.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[a.OP_CODE_STOP_ANIMATION.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[a.OP_CODE_SET_ANIMATED_NODE_VALUE.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr[a.OP_CODE_SET_ANIMATED_NODE_OFFSET.ordinal()] = 11;
                } catch (NoSuchFieldError unused11) {
                }
                try {
                    iArr[a.OP_CODE_FLATTEN_ANIMATED_NODE_OFFSET.ordinal()] = 12;
                } catch (NoSuchFieldError unused12) {
                }
                try {
                    iArr[a.OP_CODE_EXTRACT_ANIMATED_NODE_OFFSET.ordinal()] = 13;
                } catch (NoSuchFieldError unused13) {
                }
                try {
                    iArr[a.OP_CODE_CONNECT_ANIMATED_NODE_TO_VIEW.ordinal()] = 14;
                } catch (NoSuchFieldError unused14) {
                }
                try {
                    iArr[a.OP_CODE_DISCONNECT_ANIMATED_NODE_FROM_VIEW.ordinal()] = 15;
                } catch (NoSuchFieldError unused15) {
                }
                try {
                    iArr[a.OP_CODE_RESTORE_DEFAULT_VALUES.ordinal()] = 16;
                } catch (NoSuchFieldError unused16) {
                }
                try {
                    iArr[a.OP_CODE_DROP_ANIMATED_NODE.ordinal()] = 17;
                } catch (NoSuchFieldError unused17) {
                }
                try {
                    iArr[a.OP_CODE_ADD_ANIMATED_EVENT_TO_VIEW.ordinal()] = 18;
                } catch (NoSuchFieldError unused18) {
                }
                try {
                    iArr[a.OP_CODE_REMOVE_ANIMATED_EVENT_FROM_VIEW.ordinal()] = 19;
                } catch (NoSuchFieldError unused19) {
                }
                try {
                    iArr[a.OP_CODE_ADD_LISTENER.ordinal()] = 20;
                } catch (NoSuchFieldError unused20) {
                }
                try {
                    iArr[a.OP_CODE_REMOVE_LISTENERS.ordinal()] = 21;
                } catch (NoSuchFieldError unused21) {
                }
                f29467a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        q(int i10, ReadableArray readableArray) {
            super();
            this.f29465d = i10;
            this.f29466e = readableArray;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void e(NativeAnimatedModule nativeAnimatedModule, int i10, double d10, double d11) {
            WritableMap writableMapCreateMap = Arguments.createMap();
            Intrinsics.checkNotNullExpressionValue(writableMapCreateMap, "createMap(...)");
            ReadableMapBuilder readableMapBuilder = new ReadableMapBuilder(writableMapCreateMap);
            readableMapBuilder.put("tag", i10);
            readableMapBuilder.put("value", d10);
            readableMapBuilder.put("offset", d11);
            ReactApplicationContext reactApplicationContextIfActiveOrWarn = nativeAnimatedModule.getReactApplicationContextIfActiveOrWarn();
            if (reactApplicationContextIfActiveOrWarn != null) {
                reactApplicationContextIfActiveOrWarn.emitDeviceEvent("onAnimatedValueUpdate", writableMapCreateMap);
            }
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.d
        public void a(p294q6.t animatedNodesManager) {
            Intrinsics.checkNotNullParameter(animatedNodesManager, "animatedNodesManager");
            NativeAnimatedModule.this.getReactApplicationContextIfActiveOrWarn();
            int i10 = 0;
            while (i10 < this.f29465d) {
                int i11 = i10 + 1;
                switch (a.f29467a[a.f29414a.a(this.f29466e.getInt(i10)).ordinal()]) {
                    case 1:
                        int i12 = i10 + 2;
                        int i13 = this.f29466e.getInt(i11);
                        i10 += 3;
                        ReadableMap map = this.f29466e.getMap(i12);
                        if (map == null) {
                            throw new IllegalStateException("Required value was null.");
                        }
                        animatedNodesManager.e(i13, map);
                        break;
                        break;
                    case 2:
                        int i14 = i10 + 2;
                        int i15 = this.f29466e.getInt(i11);
                        i10 += 3;
                        ReadableMap map2 = this.f29466e.getMap(i14);
                        if (map2 == null) {
                            throw new IllegalStateException("Required value was null.");
                        }
                        animatedNodesManager.C(i15, map2);
                        break;
                        break;
                    case 3:
                        i10 += 2;
                        animatedNodesManager.m(this.f29466e.getInt(i11), null);
                        break;
                    case 4:
                        i10 += 2;
                        int i16 = this.f29466e.getInt(i11);
                        animatedNodesManager.y(i16, new p294q6.r(NativeAnimatedModule.this, i16));
                        break;
                    case 5:
                        i10 += 2;
                        animatedNodesManager.B(this.f29466e.getInt(i11));
                        break;
                    case 6:
                        int i17 = i10 + 2;
                        i10 += 3;
                        animatedNodesManager.d(this.f29466e.getInt(i11), this.f29466e.getInt(i17));
                        break;
                    case 7:
                        int i18 = i10 + 2;
                        i10 += 3;
                        animatedNodesManager.g(this.f29466e.getInt(i11), this.f29466e.getInt(i18));
                        break;
                    case 8:
                        int i19 = this.f29466e.getInt(i11);
                        int i20 = i10 + 3;
                        int i21 = this.f29466e.getInt(i10 + 2);
                        i10 += 4;
                        ReadableMap map3 = this.f29466e.getMap(i20);
                        if (map3 == null) {
                            throw new IllegalStateException("Required value was null.");
                        }
                        animatedNodesManager.x(i19, i21, map3, null);
                        break;
                        break;
                    case 9:
                        i10 += 2;
                        animatedNodesManager.z(this.f29466e.getInt(i11));
                        break;
                    case 10:
                        int i22 = i10 + 2;
                        i10 += 3;
                        animatedNodesManager.w(this.f29466e.getInt(i11), this.f29466e.getDouble(i22));
                        break;
                    case 11:
                        int i23 = i10 + 2;
                        i10 += 3;
                        animatedNodesManager.v(this.f29466e.getInt(i11), this.f29466e.getDouble(i23));
                        break;
                    case 12:
                        i10 += 2;
                        animatedNodesManager.j(this.f29466e.getInt(i11));
                        break;
                    case 13:
                        i10 += 2;
                        animatedNodesManager.i(this.f29466e.getInt(i11));
                        break;
                    case 14:
                        int i24 = i10 + 2;
                        i10 += 3;
                        animatedNodesManager.c(this.f29466e.getInt(i11), this.f29466e.getInt(i24));
                        break;
                    case 15:
                        int i25 = i10 + 2;
                        int i26 = this.f29466e.getInt(i11);
                        i10 += 3;
                        int i27 = this.f29466e.getInt(i25);
                        NativeAnimatedModule.this.decrementInFlightAnimationsForViewTag(i27);
                        animatedNodesManager.f(i26, i27);
                        break;
                    case 16:
                        i10 += 2;
                        animatedNodesManager.t(this.f29466e.getInt(i11));
                        break;
                    case 17:
                        i10 += 2;
                        animatedNodesManager.h(this.f29466e.getInt(i11));
                        break;
                    case 18:
                        int i28 = this.f29466e.getInt(i11);
                        int i29 = i10 + 3;
                        String string = this.f29466e.getString(i10 + 2);
                        if (string == null) {
                            throw new IllegalStateException("Required value was null.");
                        }
                        i10 += 4;
                        ReadableMap map4 = this.f29466e.getMap(i29);
                        if (map4 == null) {
                            throw new IllegalStateException("Required value was null.");
                        }
                        animatedNodesManager.b(i28, string, map4);
                        break;
                        break;
                    case 19:
                        int i30 = this.f29466e.getInt(i11);
                        NativeAnimatedModule.this.decrementInFlightAnimationsForViewTag(i30);
                        int i31 = i10 + 3;
                        String string2 = this.f29466e.getString(i10 + 2);
                        if (string2 == null) {
                            throw new IllegalStateException("Required value was null.");
                        }
                        i10 += 4;
                        animatedNodesManager.s(i30, string2, this.f29466e.getInt(i31));
                        break;
                        break;
                    case 20:
                    case 21:
                        i10 += 2;
                        break;
                    default:
                        throw new Ad.n();
                }
            }
        }
    }

    public static final class r extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f29468c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f29469d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f29470e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        r(NativeAnimatedModule nativeAnimatedModule, int i10, String str, int i11) {
            super();
            this.f29468c = i10;
            this.f29469d = str;
            this.f29470e = i11;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.d
        public void a(p294q6.t animatedNodesManager) {
            Intrinsics.checkNotNullParameter(animatedNodesManager, "animatedNodesManager");
            animatedNodesManager.s(this.f29468c, this.f29469d, this.f29470e);
        }
    }

    public static final class s extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f29471c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        s(NativeAnimatedModule nativeAnimatedModule, int i10) {
            super();
            this.f29471c = i10;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.d
        public void a(p294q6.t animatedNodesManager) {
            Intrinsics.checkNotNullParameter(animatedNodesManager, "animatedNodesManager");
            animatedNodesManager.t(this.f29471c);
        }
    }

    public static final class t extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f29472c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ double f29473d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        t(NativeAnimatedModule nativeAnimatedModule, int i10, double d10) {
            super();
            this.f29472c = i10;
            this.f29473d = d10;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.d
        public void a(p294q6.t animatedNodesManager) {
            Intrinsics.checkNotNullParameter(animatedNodesManager, "animatedNodesManager");
            animatedNodesManager.v(this.f29472c, this.f29473d);
        }
    }

    public static final class u extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f29474c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ double f29475d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        u(NativeAnimatedModule nativeAnimatedModule, int i10, double d10) {
            super();
            this.f29474c = i10;
            this.f29475d = d10;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.d
        public void a(p294q6.t animatedNodesManager) {
            Intrinsics.checkNotNullParameter(animatedNodesManager, "animatedNodesManager");
            animatedNodesManager.w(this.f29474c, this.f29475d);
        }
    }

    public static final class v extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f29476c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f29477d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ ReadableMap f29478e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Callback f29479f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        v(NativeAnimatedModule nativeAnimatedModule, int i10, int i11, ReadableMap readableMap, Callback callback) {
            super();
            this.f29476c = i10;
            this.f29477d = i11;
            this.f29478e = readableMap;
            this.f29479f = callback;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.d
        public void a(p294q6.t animatedNodesManager) {
            Intrinsics.checkNotNullParameter(animatedNodesManager, "animatedNodesManager");
            animatedNodesManager.x(this.f29476c, this.f29477d, this.f29478e, this.f29479f);
        }
    }

    public static final class w extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f29480c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ p294q6.c f29481d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        w(NativeAnimatedModule nativeAnimatedModule, int i10, p294q6.c cVar) {
            super();
            this.f29480c = i10;
            this.f29481d = cVar;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.d
        public void a(p294q6.t animatedNodesManager) {
            Intrinsics.checkNotNullParameter(animatedNodesManager, "animatedNodesManager");
            animatedNodesManager.y(this.f29480c, this.f29481d);
        }
    }

    public static final class x extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f29482c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        x(NativeAnimatedModule nativeAnimatedModule, int i10) {
            super();
            this.f29482c = i10;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.d
        public void a(p294q6.t animatedNodesManager) {
            Intrinsics.checkNotNullParameter(animatedNodesManager, "animatedNodesManager");
            animatedNodesManager.z(this.f29482c);
        }
    }

    public static final class y extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f29483c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        y(NativeAnimatedModule nativeAnimatedModule, int i10) {
            super();
            this.f29483c = i10;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.d
        public void a(p294q6.t animatedNodesManager) {
            Intrinsics.checkNotNullParameter(animatedNodesManager, "animatedNodesManager");
            animatedNodesManager.B(this.f29483c);
        }
    }

    public static final class z extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f29484c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ ReadableMap f29485d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        z(NativeAnimatedModule nativeAnimatedModule, int i10, ReadableMap readableMap) {
            super();
            this.f29484c = i10;
            this.f29485d = readableMap;
        }

        @Override // com.facebook.react.animated.NativeAnimatedModule.d
        public void a(p294q6.t animatedNodesManager) {
            Intrinsics.checkNotNullParameter(animatedNodesManager, "animatedNodesManager");
            animatedNodesManager.C(this.f29484c, this.f29485d);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeAnimatedModule(@NotNull ReactApplicationContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.reactChoreographer = b.f29885f.a();
        this.operations = new c();
        this.preOperations = new c();
        this.nodesManagerRef = new AtomicReference<>();
        this.uiManagerType = 1;
        this.animatedFrameCallback = new g(reactContext, this);
    }

    private final void addOperation(d operation) {
        operation.c(this.currentBatchNumber);
        this.operations.a(operation);
    }

    private final void addPreOperation(d operation) {
        operation.c(this.currentBatchNumber);
        this.preOperations.a(operation);
    }

    private final void addUnbatchedOperation(d operation) {
        operation.c(-1L);
        this.operations.a(operation);
    }

    private final void clearFrameCallback() {
        this.reactChoreographer.n(b.a.NATIVE_ANIMATED_MODULE, this.animatedFrameCallback);
        this.enqueuedAnimationOnFrame = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void decrementInFlightAnimationsForViewTag(int viewTag) {
        if (Z6.a.a(viewTag) == 2) {
            this.numFabricAnimations--;
        } else {
            this.numNonFabricAnimations--;
        }
        int i10 = this.numNonFabricAnimations;
        if (i10 == 0 && this.numFabricAnimations > 0 && this.uiManagerType != 2) {
            this.uiManagerType = 2;
        } else {
            if (this.numFabricAnimations != 0 || i10 <= 0 || this.uiManagerType == 1) {
                return;
            }
            this.uiManagerType = 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void enqueueFrameCallback() {
        if (this.enqueuedAnimationOnFrame) {
            return;
        }
        this.reactChoreographer.k(b.a.NATIVE_ANIMATED_MODULE, this.animatedFrameCallback);
        this.enqueuedAnimationOnFrame = true;
    }

    private static /* synthetic */ void getUiManagerType$annotations() {
    }

    private final void initializeLifecycleEventListenersForViewTag(int viewTag) {
        ReactApplicationContext reactApplicationContextIfActiveOrWarn;
        UIManager uIManagerG;
        int iA = Z6.a.a(viewTag);
        this.uiManagerType = iA;
        if (iA == 2) {
            this.numFabricAnimations++;
        } else {
            this.numNonFabricAnimations++;
        }
        p294q6.t nodesManager = getNodesManager();
        if (nodesManager != null) {
            nodesManager.p(this.uiManagerType);
        } else {
            ReactSoftExceptionLogger.logSoftException("NativeAnimatedModule", new RuntimeException("initializeLifecycleEventListenersForViewTag could not get NativeAnimatedNodesManager"));
        }
        if ((this.uiManagerType == 2 ? this.initializedForFabric : this.initializedForNonFabric) || (reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn()) == null || (uIManagerG = C2270o0.g(reactApplicationContextIfActiveOrWarn, this.uiManagerType)) == null) {
            return;
        }
        uIManagerG.addUIManagerEventListener(this);
        if (this.uiManagerType == 2) {
            this.initializedForFabric = true;
        } else {
            this.initializedForNonFabric = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startListeningToAnimatedNodeValue$lambda$6(NativeAnimatedModule nativeAnimatedModule, int i10, double d10, double d11) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        Intrinsics.checkNotNullExpressionValue(writableMapCreateMap, "createMap(...)");
        ReadableMapBuilder readableMapBuilder = new ReadableMapBuilder(writableMapCreateMap);
        readableMapBuilder.put("tag", i10);
        readableMapBuilder.put("value", d10);
        readableMapBuilder.put("offset", d11);
        ReactApplicationContext reactApplicationContextIfActiveOrWarn = nativeAnimatedModule.getReactApplicationContextIfActiveOrWarn();
        if (reactApplicationContextIfActiveOrWarn != null) {
            reactApplicationContextIfActiveOrWarn.emitDeviceEvent("onAnimatedValueUpdate", writableMapCreateMap);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit userDrivenScrollEnded$lambda$2$lambda$1(Set set, ReadableArrayBuilder putArray) {
        Intrinsics.checkNotNullParameter(putArray, "$this$putArray");
        Iterator it = set.iterator();
        while (it.hasNext()) {
            putArray.add(((Number) it.next()).intValue());
        }
        return Unit.f48228a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void willDispatchViewUpdates$lambda$3(NativeAnimatedModule nativeAnimatedModule, long j10, D it) {
        Intrinsics.checkNotNullParameter(it, "it");
        nativeAnimatedModule.preOperations.c(j10, nativeAnimatedModule.getNodesManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void willDispatchViewUpdates$lambda$4(NativeAnimatedModule nativeAnimatedModule, long j10, D it) {
        Intrinsics.checkNotNullParameter(it, "it");
        nativeAnimatedModule.operations.c(j10, nativeAnimatedModule.getNodesManager());
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void addAnimatedEventToView(double viewTagDouble, @NotNull String eventName, @NotNull ReadableMap eventMapping) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(eventMapping, "eventMapping");
        int i10 = (int) viewTagDouble;
        initializeLifecycleEventListenersForViewTag(i10);
        addOperation(new f(this, i10, eventName, eventMapping));
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void addListener(@NotNull String eventName) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void connectAnimatedNodeToView(double animatedNodeTagDouble, double viewTagDouble) {
        int i10 = (int) viewTagDouble;
        initializeLifecycleEventListenersForViewTag(i10);
        addOperation(new h(this, (int) animatedNodeTagDouble, i10));
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void connectAnimatedNodes(double parentNodeTagDouble, double childNodeTagDouble) {
        addOperation(new i(this, (int) parentNodeTagDouble, (int) childNodeTagDouble));
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void createAnimatedNode(double tagDouble, @NotNull ReadableMap config) {
        Intrinsics.checkNotNullParameter(config, "config");
        addOperation(new j(this, (int) tagDouble, config));
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void didDispatchMountItems(@NotNull UIManager uiManager) {
        Intrinsics.checkNotNullParameter(uiManager, "uiManager");
        if (this.uiManagerType != 2) {
            return;
        }
        long j10 = this.currentBatchNumber - 1;
        if (!this.batchingControlledByJS) {
            this.currentFrameNumber++;
            if (this.currentFrameNumber - this.currentBatchNumber > 2) {
                this.currentBatchNumber = this.currentFrameNumber;
                j10 = this.currentBatchNumber;
            }
        }
        this.preOperations.c(j10, getNodesManager());
        this.operations.c(j10, getNodesManager());
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void didMountItems(@NotNull UIManager uiManager) {
        Intrinsics.checkNotNullParameter(uiManager, "uiManager");
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void didScheduleMountItems(@NotNull UIManager uiManager) {
        Intrinsics.checkNotNullParameter(uiManager, "uiManager");
        this.currentFrameNumber++;
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void disconnectAnimatedNodeFromView(double animatedNodeTagDouble, double viewTagDouble) {
        int i10 = (int) viewTagDouble;
        decrementInFlightAnimationsForViewTag(i10);
        addOperation(new k(this, (int) animatedNodeTagDouble, i10));
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void disconnectAnimatedNodes(double parentNodeTagDouble, double childNodeTagDouble) {
        addOperation(new l(this, (int) parentNodeTagDouble, (int) childNodeTagDouble));
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void dropAnimatedNode(double tagDouble) {
        addOperation(new m(this, (int) tagDouble));
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void extractAnimatedNodeOffset(double tagDouble) {
        addOperation(new n(this, (int) tagDouble));
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void finishOperationBatch() {
        this.batchingControlledByJS = false;
        this.currentBatchNumber++;
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void flattenAnimatedNodeOffset(double tagDouble) {
        addOperation(new o(this, (int) tagDouble));
    }

    @Nullable
    public final p294q6.t getNodesManager() {
        ReactApplicationContext reactApplicationContextIfActiveOrWarn;
        if (this.nodesManagerRef.get() == null && (reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn()) != null) {
            G.a(this.nodesManagerRef, null, new p294q6.t(reactApplicationContextIfActiveOrWarn));
        }
        return this.nodesManagerRef.get();
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void getValue(double animatedValueNodeTagDouble, @NotNull Callback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        addOperation(new p(this, (int) animatedValueNodeTagDouble, callback));
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() {
        super.initialize();
        getReactApplicationContext().addLifecycleEventListener(this);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        super.invalidate();
        getReactApplicationContext().removeLifecycleEventListener(this);
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        clearFrameCallback();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
        clearFrameCallback();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        enqueueFrameCallback();
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void queueAndExecuteBatchedOperations(@NotNull ReadableArray opsAndArgs) {
        Intrinsics.checkNotNullParameter(opsAndArgs, "opsAndArgs");
        int size = opsAndArgs.size();
        int i10 = 0;
        while (i10 < size) {
            int i11 = i10 + 1;
            switch (e.f29444a[a.f29414a.a(opsAndArgs.getInt(i10)).ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                    i10 += 2;
                    continue;
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                case 16:
                case 17:
                    i10 += 3;
                    continue;
                case 18:
                case 19:
                    break;
                case 20:
                    int i12 = i10 + 2;
                    i10 += 3;
                    initializeLifecycleEventListenersForViewTag(opsAndArgs.getInt(i12));
                    continue;
                case 21:
                    initializeLifecycleEventListenersForViewTag(opsAndArgs.getInt(i11));
                    break;
                default:
                    throw new Ad.n();
            }
            i10 += 4;
        }
        startOperationBatch();
        addUnbatchedOperation(new q(size, opsAndArgs));
        finishOperationBatch();
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void removeAnimatedEventFromView(double viewTagDouble, @NotNull String eventName, double animatedValueTagDouble) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        int i10 = (int) viewTagDouble;
        decrementInFlightAnimationsForViewTag(i10);
        addOperation(new r(this, i10, eventName, (int) animatedValueTagDouble));
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void removeListeners(double count) {
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void restoreDefaultValues(double animatedNodeTagDouble) {
        addPreOperation(new s(this, (int) animatedNodeTagDouble));
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void setAnimatedNodeOffset(double tagDouble, double value) {
        addOperation(new t(this, (int) tagDouble, value));
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void setAnimatedNodeValue(double tagDouble, double value) {
        addOperation(new u(this, (int) tagDouble, value));
    }

    public final void setNodesManager(@Nullable p294q6.t tVar) {
        this.nodesManagerRef.set(tVar);
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void startAnimatingNode(double animationIdDouble, double animatedNodeTagDouble, @NotNull ReadableMap animationConfig, @NotNull Callback endCallback) {
        Intrinsics.checkNotNullParameter(animationConfig, "animationConfig");
        Intrinsics.checkNotNullParameter(endCallback, "endCallback");
        addUnbatchedOperation(new v(this, (int) animationIdDouble, (int) animatedNodeTagDouble, animationConfig, endCallback));
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void startListeningToAnimatedNodeValue(double tagDouble) {
        int i10 = (int) tagDouble;
        addOperation(new w(this, i10, new p294q6.n(this, i10)));
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void startOperationBatch() {
        this.batchingControlledByJS = true;
        this.currentBatchNumber++;
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void stopAnimation(double animationIdDouble) {
        addOperation(new x(this, (int) animationIdDouble));
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void stopListeningToAnimatedNodeValue(double tagDouble) {
        addOperation(new y(this, (int) tagDouble));
    }

    @Override // com.facebook.fbreact.specs.NativeAnimatedModuleSpec
    public void updateAnimatedNodeConfig(double tagDouble, @NotNull ReadableMap config) {
        Intrinsics.checkNotNullParameter(config, "config");
        addOperation(new z(this, (int) tagDouble, config));
    }

    public final void userDrivenScrollEnded(int viewTag) {
        p294q6.t tVar = this.nodesManagerRef.get();
        if (tVar == null) {
            return;
        }
        Set setL = tVar.l(viewTag, "topScrollEnded");
        if (setL.isEmpty()) {
            return;
        }
        WritableMap writableMapCreateMap = Arguments.createMap();
        Intrinsics.checkNotNullExpressionValue(writableMapCreateMap, "createMap(...)");
        new ReadableMapBuilder(writableMapCreateMap).putArray("tags", new p294q6.o(setL));
        ReactApplicationContext reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
        if (reactApplicationContextIfActiveOrWarn != null) {
            reactApplicationContextIfActiveOrWarn.emitDeviceEvent("onUserDrivenAnimationEnded", writableMapCreateMap);
        }
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void willDispatchViewUpdates(@NotNull UIManager uiManager) {
        Intrinsics.checkNotNullParameter(uiManager, "uiManager");
        if ((this.operations.d() && this.preOperations.d()) || this.uiManagerType == 2 || p384v6.a.f56281f) {
            return;
        }
        long j10 = this.currentBatchNumber;
        this.currentBatchNumber = 1 + j10;
        p294q6.p pVar = new p294q6.p(this, j10);
        p294q6.q qVar = new p294q6.q(this, j10);
        UIManagerModule uIManagerModule = (UIManagerModule) uiManager;
        uIManagerModule.prependUIBlock(pVar);
        uIManagerModule.addUIBlock(qVar);
    }

    @Override // com.facebook.react.bridge.UIManagerListener
    public void willMountItems(@NotNull UIManager uiManager) {
        Intrinsics.checkNotNullParameter(uiManager, "uiManager");
    }
}
