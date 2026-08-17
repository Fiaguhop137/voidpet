package com.facebook.react.internal.featureflags;

import com.facebook.soloader.SoLoader;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p276p6.a;

/* JADX INFO: loaded from: classes2.dex */
@a
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b.\n\u0002\u0010\u0006\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\t\u0010\u0004\u001a\u00020\u0005H\u0087 J\t\u0010\u0006\u001a\u00020\u0005H\u0087 J\t\u0010\u0007\u001a\u00020\u0005H\u0087 J\t\u0010\b\u001a\u00020\u0005H\u0087 J\t\u0010\t\u001a\u00020\u0005H\u0087 J\t\u0010\n\u001a\u00020\u0005H\u0087 J\t\u0010\u000b\u001a\u00020\u0005H\u0087 J\t\u0010\f\u001a\u00020\u0005H\u0087 J\t\u0010\r\u001a\u00020\u0005H\u0087 J\t\u0010\u000e\u001a\u00020\u0005H\u0087 J\t\u0010\u000f\u001a\u00020\u0005H\u0087 J\t\u0010\u0010\u001a\u00020\u0005H\u0087 J\t\u0010\u0011\u001a\u00020\u0005H\u0087 J\t\u0010\u0012\u001a\u00020\u0005H\u0087 J\t\u0010\u0013\u001a\u00020\u0005H\u0087 J\t\u0010\u0014\u001a\u00020\u0005H\u0087 J\t\u0010\u0015\u001a\u00020\u0005H\u0087 J\t\u0010\u0016\u001a\u00020\u0005H\u0087 J\t\u0010\u0017\u001a\u00020\u0005H\u0087 J\t\u0010\u0018\u001a\u00020\u0005H\u0087 J\t\u0010\u0019\u001a\u00020\u0005H\u0087 J\t\u0010\u001a\u001a\u00020\u0005H\u0087 J\t\u0010\u001b\u001a\u00020\u0005H\u0087 J\t\u0010\u001c\u001a\u00020\u0005H\u0087 J\t\u0010\u001d\u001a\u00020\u0005H\u0087 J\t\u0010\u001e\u001a\u00020\u0005H\u0087 J\t\u0010\u001f\u001a\u00020\u0005H\u0087 J\t\u0010 \u001a\u00020\u0005H\u0087 J\t\u0010!\u001a\u00020\u0005H\u0087 J\t\u0010\"\u001a\u00020\u0005H\u0087 J\t\u0010#\u001a\u00020\u0005H\u0087 J\t\u0010$\u001a\u00020\u0005H\u0087 J\t\u0010%\u001a\u00020\u0005H\u0087 J\t\u0010&\u001a\u00020\u0005H\u0087 J\t\u0010'\u001a\u00020\u0005H\u0087 J\t\u0010(\u001a\u00020\u0005H\u0087 J\t\u0010)\u001a\u00020\u0005H\u0087 J\t\u0010*\u001a\u00020\u0005H\u0087 J\t\u0010+\u001a\u00020\u0005H\u0087 J\t\u0010,\u001a\u00020\u0005H\u0087 J\t\u0010-\u001a\u00020\u0005H\u0087 J\t\u0010.\u001a\u00020\u0005H\u0087 J\t\u0010/\u001a\u00020\u0005H\u0087 J\t\u00100\u001a\u00020\u0005H\u0087 J\t\u00101\u001a\u00020\u0005H\u0087 J\t\u00102\u001a\u00020\u0005H\u0087 J\t\u00103\u001a\u000204H\u0087 J\t\u00105\u001a\u00020\u0005H\u0087 J\t\u00106\u001a\u00020\u0005H\u0087 J\t\u00107\u001a\u00020\u0005H\u0087 J\t\u00108\u001a\u00020\u0005H\u0087 J\t\u00109\u001a\u00020\u0005H\u0087 J\t\u0010:\u001a\u00020\u0005H\u0087 J\t\u0010;\u001a\u00020\u0005H\u0087 J\t\u0010<\u001a\u00020\u0005H\u0087 J\t\u0010=\u001a\u00020\u0005H\u0087 J\t\u0010>\u001a\u00020\u0005H\u0087 J\t\u0010?\u001a\u00020\u0005H\u0087 J\t\u0010@\u001a\u00020\u0005H\u0087 J\t\u0010A\u001a\u00020\u0005H\u0087 J\t\u0010B\u001a\u000204H\u0087 J\u0011\u0010C\u001a\u00020D2\u0006\u0010E\u001a\u00020\u0001H\u0087 J\t\u0010F\u001a\u00020DH\u0087 J\u0013\u0010G\u001a\u0004\u0018\u00010H2\u0006\u0010E\u001a\u00020\u0001H\u0087 ¨\u0006I"}, d2 = {"Lcom/facebook/react/internal/featureflags/ReactNativeFeatureFlagsCxxInterop;", "", "<init>", "()V", "commonTestFlag", "", "animatedShouldSignalBatch", "cxxNativeAnimatedEnabled", "cxxNativeAnimatedRemoveJsSync", "disableMainQueueSyncDispatchIOS", "disableMountItemReorderingAndroid", "disableTextLayoutManagerCacheAndroid", "enableAccessibilityOrder", "enableAccumulatedUpdatesInRawPropsAndroid", "enableAndroidTextMeasurementOptimizations", "enableBridgelessArchitecture", "enableCppPropsIteratorSetter", "enableCustomFocusSearchOnClippedElementsAndroid", "enableDestroyShadowTreeRevisionAsync", "enableDoubleMeasurementFixAndroid", "enableEagerRootViewAttachment", "enableFabricLogs", "enableFabricRenderer", "enableFixForParentTagDuringReparenting", "enableFontScaleChangesUpdatingLayout", "enableIOSTextBaselineOffsetPerLine", "enableIOSViewClipToPaddingBox", "enableInteropViewManagerClassLookUpOptimizationIOS", "enableLayoutAnimationsOnAndroid", "enableLayoutAnimationsOnIOS", "enableMainQueueCoordinatorOnIOS", "enableMainQueueModulesOnIOS", "enableModuleArgumentNSNullConversionIOS", "enableNativeCSSParsing", "enableNetworkEventReporting", "enableNewBackgroundAndBorderDrawables", "enablePreparedTextLayout", "enablePropsUpdateReconciliationAndroid", "enableResourceTimingAPI", "enableSynchronousStateUpdates", "enableViewCulling", "enableViewRecycling", "enableViewRecyclingForText", "enableViewRecyclingForView", "enableVirtualViewDebugFeatures", "enableVirtualViewRenderState", "enableVirtualViewWindowFocusDetection", "fixMappingOfEventPrioritiesBetweenFabricAndReact", "fuseboxEnabledRelease", "fuseboxNetworkInspectionEnabled", "hideOffscreenVirtualViewsOnIOS", "preparedTextCacheSize", "", "preventShadowTreeCommitExhaustion", "traceTurboModulePromiseRejectionsOnAndroid", "updateRuntimeShadowNodeReferencesOnCommit", "useAlwaysAvailableJSErrorHandling", "useFabricInterop", "useNativeEqualsInNativeReadableArrayAndroid", "useNativeTransformHelperAndroid", "useNativeViewConfigsInBridgelessMode", "useOptimizedEventBatchingOnAndroid", "useRawPropsJsiValue", "useShadowNodeStateOnClone", "useTurboModuleInterop", "useTurboModules", "virtualViewPrerenderRatio", "override", "", "provider", "dangerouslyReset", "dangerouslyForceOverride", "", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ReactNativeFeatureFlagsCxxInterop {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ReactNativeFeatureFlagsCxxInterop f29802a = new ReactNativeFeatureFlagsCxxInterop();

    static {
        SoLoader.t("react_featureflagsjni");
    }

    private ReactNativeFeatureFlagsCxxInterop() {
    }

    @a
    public static final native boolean animatedShouldSignalBatch();

    @a
    public static final native boolean commonTestFlag();

    @a
    public static final native boolean cxxNativeAnimatedEnabled();

    @a
    public static final native boolean cxxNativeAnimatedRemoveJsSync();

    @a
    @Nullable
    public static final native String dangerouslyForceOverride(@NotNull Object provider);

    @a
    public static final native void dangerouslyReset();

    @a
    public static final native boolean disableMainQueueSyncDispatchIOS();

    @a
    public static final native boolean disableMountItemReorderingAndroid();

    @a
    public static final native boolean disableTextLayoutManagerCacheAndroid();

    @a
    public static final native boolean enableAccessibilityOrder();

    @a
    public static final native boolean enableAccumulatedUpdatesInRawPropsAndroid();

    @a
    public static final native boolean enableAndroidTextMeasurementOptimizations();

    @a
    public static final native boolean enableBridgelessArchitecture();

    @a
    public static final native boolean enableCppPropsIteratorSetter();

    @a
    public static final native boolean enableCustomFocusSearchOnClippedElementsAndroid();

    @a
    public static final native boolean enableDestroyShadowTreeRevisionAsync();

    @a
    public static final native boolean enableDoubleMeasurementFixAndroid();

    @a
    public static final native boolean enableEagerRootViewAttachment();

    @a
    public static final native boolean enableFabricLogs();

    @a
    public static final native boolean enableFabricRenderer();

    @a
    public static final native boolean enableFixForParentTagDuringReparenting();

    @a
    public static final native boolean enableFontScaleChangesUpdatingLayout();

    @a
    public static final native boolean enableIOSTextBaselineOffsetPerLine();

    @a
    public static final native boolean enableIOSViewClipToPaddingBox();

    @a
    public static final native boolean enableInteropViewManagerClassLookUpOptimizationIOS();

    @a
    public static final native boolean enableLayoutAnimationsOnAndroid();

    @a
    public static final native boolean enableLayoutAnimationsOnIOS();

    @a
    public static final native boolean enableMainQueueCoordinatorOnIOS();

    @a
    public static final native boolean enableMainQueueModulesOnIOS();

    @a
    public static final native boolean enableModuleArgumentNSNullConversionIOS();

    @a
    public static final native boolean enableNativeCSSParsing();

    @a
    public static final native boolean enableNetworkEventReporting();

    @a
    public static final native boolean enableNewBackgroundAndBorderDrawables();

    @a
    public static final native boolean enablePreparedTextLayout();

    @a
    public static final native boolean enablePropsUpdateReconciliationAndroid();

    @a
    public static final native boolean enableResourceTimingAPI();

    @a
    public static final native boolean enableSynchronousStateUpdates();

    @a
    public static final native boolean enableViewCulling();

    @a
    public static final native boolean enableViewRecycling();

    @a
    public static final native boolean enableViewRecyclingForText();

    @a
    public static final native boolean enableViewRecyclingForView();

    @a
    public static final native boolean enableVirtualViewDebugFeatures();

    @a
    public static final native boolean enableVirtualViewRenderState();

    @a
    public static final native boolean enableVirtualViewWindowFocusDetection();

    @a
    public static final native boolean fixMappingOfEventPrioritiesBetweenFabricAndReact();

    @a
    public static final native boolean fuseboxEnabledRelease();

    @a
    public static final native boolean fuseboxNetworkInspectionEnabled();

    @a
    public static final native boolean hideOffscreenVirtualViewsOnIOS();

    @a
    public static final native void override(@NotNull Object provider);

    @a
    public static final native double preparedTextCacheSize();

    @a
    public static final native boolean preventShadowTreeCommitExhaustion();

    @a
    public static final native boolean traceTurboModulePromiseRejectionsOnAndroid();

    @a
    public static final native boolean updateRuntimeShadowNodeReferencesOnCommit();

    @a
    public static final native boolean useAlwaysAvailableJSErrorHandling();

    @a
    public static final native boolean useFabricInterop();

    @a
    public static final native boolean useNativeEqualsInNativeReadableArrayAndroid();

    @a
    public static final native boolean useNativeTransformHelperAndroid();

    @a
    public static final native boolean useNativeViewConfigsInBridgelessMode();

    @a
    public static final native boolean useOptimizedEventBatchingOnAndroid();

    @a
    public static final native boolean useRawPropsJsiValue();

    @a
    public static final native boolean useShadowNodeStateOnClone();

    @a
    public static final native boolean useTurboModuleInterop();

    @a
    public static final native boolean useTurboModules();

    @a
    public static final native double virtualViewPrerenderRatio();
}
