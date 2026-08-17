package com.airbnb.android.react.lottie;

import R3.C1363j;
import android.animation.Animator;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.C2262k0;
import com.facebook.react.uimanager.SimpleViewManager;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\rJ)\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\n2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u00022\b\u0010\u001c\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ!\u0010 \u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u00022\b\u0010\u001f\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\b \u0010\u001eJ!\u0010\"\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u00022\b\u0010!\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\b\"\u0010\u001eJ!\u0010%\u001a\u00020\u00192\b\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010$\u001a\u00020#H\u0007¢\u0006\u0004\b%\u0010&J!\u0010(\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u00022\b\u0010'\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\b(\u0010\u001eJ!\u0010*\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u00022\b\u0010)\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\b*\u0010\u001eJ!\u0010,\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u00022\b\u0010+\u001a\u0004\u0018\u00010#H\u0007¢\u0006\u0004\b,\u0010-J\u001f\u00100\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010/\u001a\u00020.H\u0007¢\u0006\u0004\b0\u00101J\u001f\u00104\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u00103\u001a\u000202H\u0007¢\u0006\u0004\b4\u00105J\u001f\u00107\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u00106\u001a\u00020#H\u0007¢\u0006\u0004\b7\u0010&J\u001f\u00109\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u00108\u001a\u00020#H\u0007¢\u0006\u0004\b9\u0010&J!\u0010;\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u00022\b\u0010:\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\b;\u0010\u001eJ\u001f\u0010=\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010<\u001a\u00020#H\u0007¢\u0006\u0004\b=\u0010&J\u001f\u0010?\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010>\u001a\u00020#H\u0007¢\u0006\u0004\b?\u0010&J!\u0010A\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u00022\b\u0010@\u001a\u0004\u0018\u00010\u0017H\u0007¢\u0006\u0004\bA\u0010BJ!\u0010D\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u00022\b\u0010C\u001a\u0004\u0018\u00010\u0017H\u0007¢\u0006\u0004\bD\u0010BJ!\u0010F\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u00022\b\u0010E\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\bF\u0010\u001eJ\u0017\u0010G\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u0002H\u0014¢\u0006\u0004\bG\u0010HR \u0010J\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010K¨\u0006L"}, d2 = {"Lcom/airbnb/android/react/lottie/LottieAnimationViewManager;", "Lcom/facebook/react/uimanager/SimpleViewManager;", "LR3/j;", "<init>", "()V", "view", "Lcom/airbnb/android/react/lottie/h;", "getOrCreatePropertyManager", "(LR3/j;)Lcom/airbnb/android/react/lottie/h;", "", "", "", "getExportedViewConstants", "()Ljava/util/Map;", "getName", "()Ljava/lang/String;", "Lcom/facebook/react/uimanager/k0;", "context", "createViewInstance", "(Lcom/facebook/react/uimanager/k0;)LR3/j;", "", "getExportedCustomDirectEventTypeConstants", "commandName", "Lcom/facebook/react/bridge/ReadableArray;", "args", "", "receiveCommand", "(LR3/j;Ljava/lang/String;Lcom/facebook/react/bridge/ReadableArray;)V", "name", "setSourceName", "(LR3/j;Ljava/lang/String;)V", "json", "setSourceJson", "urlString", "setSourceURL", "", "cacheComposition", "setCacheComposition", "(LR3/j;Z)V", "resizeMode", "setResizeMode", "renderMode", "setRenderMode", "hardwareAccelerationAndroid", "setHardwareAccelerationAndroid", "(LR3/j;Ljava/lang/Boolean;)V", "", "progress", "setProgress", "(LR3/j;F)V", "", "speed", "setSpeed", "(LR3/j;D)V", "loop", "setLoop", "autoPlay", "setAutoPlay", "imageAssetsFolder", "setImageAssetsFolder", "enableMergePaths", "setEnableMergePaths", "enableSafeMode", "setEnableSafeMode", "colorFilters", "setColorFilters", "(LR3/j;Lcom/facebook/react/bridge/ReadableArray;)V", "textFilters", "setTextFilters", "uri", "setSourceDotLottie", "onAfterUpdateTransaction", "(LR3/j;)V", "Ljava/util/WeakHashMap;", "propManagersMap", "Ljava/util/WeakHashMap;", "lottie-react-native_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class LottieAnimationViewManager extends SimpleViewManager<C1363j> {

    @NotNull
    private final WeakHashMap<C1363j, h> propManagersMap = new WeakHashMap<>();

    public static final class a implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ C1363j f27471a;

        a(C1363j c1363j) {
            this.f27471a = c1363j;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            g.r(this.f27471a, true);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            g.r(this.f27471a, false);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createViewInstance$lambda$0(C1363j c1363j, Throwable th) {
        Intrinsics.c(th);
        g.p(c1363j, th);
    }

    private final h getOrCreatePropertyManager(C1363j view) {
        h hVar = this.propManagersMap.get(view);
        if (hVar != null) {
            return hVar;
        }
        h hVar2 = new h(view);
        this.propManagersMap.put(view, hVar2);
        return hVar2;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public C1363j createViewInstance(@NotNull C2262k0 context) {
        Intrinsics.checkNotNullParameter(context, "context");
        C1363j c1363jE = g.e(context);
        c1363jE.setFailureListener(new com.airbnb.android.react.lottie.a(c1363jE));
        c1363jE.j(new b(c1363jE));
        c1363jE.i(new a(c1363jE));
        return c1363jE;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    @Nullable
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return g.f();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @NotNull
    public Map<String, Object> getExportedViewConstants() {
        return g.g();
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return "LottieAnimationView";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(@NotNull C1363j view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onAfterUpdateTransaction(view);
        getOrCreatePropertyManager(view).a();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(@NotNull C1363j view, @NotNull String commandName, @Nullable ReadableArray args) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(commandName, "commandName");
        switch (commandName.hashCode()) {
            case -934426579:
                if (commandName.equals("resume")) {
                    g.n(view);
                    break;
                }
                break;
            case 3443508:
                if (commandName.equals("play")) {
                    g.j(view, args != null ? args.getInt(0) : -1, args != null ? args.getInt(1) : -1);
                    break;
                }
                break;
            case 106440182:
                if (commandName.equals("pause")) {
                    g.h(view);
                    break;
                }
                break;
            case 108404047:
                if (commandName.equals("reset")) {
                    g.l(view);
                    break;
                }
                break;
        }
    }

    @Y6.a(name = "autoPlay")
    public final void setAutoPlay(@NotNull C1363j view, boolean autoPlay) {
        Intrinsics.checkNotNullParameter(view, "view");
        g.s(autoPlay, getOrCreatePropertyManager(view));
    }

    @Y6.a(name = "cacheComposition")
    public final void setCacheComposition(@Nullable C1363j view, boolean cacheComposition) {
        Intrinsics.c(view);
        g.t(view, cacheComposition);
    }

    @Y6.a(name = "colorFilters")
    public final void setColorFilters(@NotNull C1363j view, @Nullable ReadableArray colorFilters) {
        Intrinsics.checkNotNullParameter(view, "view");
        g.u(colorFilters, getOrCreatePropertyManager(view));
    }

    @Y6.a(name = "enableMergePathsAndroidForKitKatAndAbove")
    public final void setEnableMergePaths(@NotNull C1363j view, boolean enableMergePaths) {
        Intrinsics.checkNotNullParameter(view, "view");
        g.v(enableMergePaths, getOrCreatePropertyManager(view));
    }

    @Y6.a(name = "enableSafeModeAndroid")
    public final void setEnableSafeMode(@NotNull C1363j view, boolean enableSafeMode) {
        Intrinsics.checkNotNullParameter(view, "view");
        g.w(enableSafeMode, getOrCreatePropertyManager(view));
    }

    @Y6.a(name = "hardwareAccelerationAndroid")
    public final void setHardwareAccelerationAndroid(@NotNull C1363j view, @Nullable Boolean hardwareAccelerationAndroid) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.c(hardwareAccelerationAndroid);
        g.x(hardwareAccelerationAndroid.booleanValue(), getOrCreatePropertyManager(view));
    }

    @Y6.a(name = "imageAssetsFolder")
    public final void setImageAssetsFolder(@NotNull C1363j view, @Nullable String imageAssetsFolder) {
        Intrinsics.checkNotNullParameter(view, "view");
        g.y(imageAssetsFolder, getOrCreatePropertyManager(view));
    }

    @Y6.a(name = "loop")
    public final void setLoop(@NotNull C1363j view, boolean loop) {
        Intrinsics.checkNotNullParameter(view, "view");
        g.z(loop, getOrCreatePropertyManager(view));
    }

    @Y6.a(name = "progress")
    public final void setProgress(@NotNull C1363j view, float progress) {
        Intrinsics.checkNotNullParameter(view, "view");
        g.A(progress, getOrCreatePropertyManager(view));
    }

    @Y6.a(name = "renderMode")
    public final void setRenderMode(@NotNull C1363j view, @Nullable String renderMode) {
        Intrinsics.checkNotNullParameter(view, "view");
        g.B(renderMode, getOrCreatePropertyManager(view));
    }

    @Y6.a(name = "resizeMode")
    public final void setResizeMode(@NotNull C1363j view, @Nullable String resizeMode) {
        Intrinsics.checkNotNullParameter(view, "view");
        g.C(resizeMode, getOrCreatePropertyManager(view));
    }

    @Y6.a(name = "sourceDotLottieURI")
    public final void setSourceDotLottie(@NotNull C1363j view, @Nullable String uri) {
        Intrinsics.checkNotNullParameter(view, "view");
        g.D(uri, getOrCreatePropertyManager(view));
    }

    @Y6.a(name = "sourceJson")
    public final void setSourceJson(@NotNull C1363j view, @Nullable String json) {
        Intrinsics.checkNotNullParameter(view, "view");
        g.E(json, getOrCreatePropertyManager(view));
    }

    @Y6.a(name = "sourceName")
    public final void setSourceName(@NotNull C1363j view, @Nullable String name) {
        Intrinsics.checkNotNullParameter(view, "view");
        g.F(name, getOrCreatePropertyManager(view));
    }

    @Y6.a(name = "sourceURL")
    public final void setSourceURL(@NotNull C1363j view, @Nullable String urlString) {
        Intrinsics.checkNotNullParameter(view, "view");
        g.G(urlString, getOrCreatePropertyManager(view));
    }

    @Y6.a(name = "speed")
    public final void setSpeed(@NotNull C1363j view, double speed) {
        Intrinsics.checkNotNullParameter(view, "view");
        g.H(speed, getOrCreatePropertyManager(view));
    }

    @Y6.a(name = "textFiltersAndroid")
    public final void setTextFilters(@NotNull C1363j view, @Nullable ReadableArray textFilters) {
        Intrinsics.checkNotNullParameter(view, "view");
        g.I(textFilters, getOrCreatePropertyManager(view));
    }
}
