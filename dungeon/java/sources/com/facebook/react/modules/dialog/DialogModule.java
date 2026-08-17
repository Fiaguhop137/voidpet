package com.facebook.react.modules.dialog;

import Ad.v;
import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.j;
import androidx.fragment.app.q;
import com.facebook.fbreact.specs.NativeDialogManagerAndroidSpec;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.SoftAssertions;
import com.facebook.react.bridge.UiThreadUtil;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.N;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@G6.a(name = "DialogManagerAndroid")
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 !2\u00020\u00012\u00020\u0002:\u0003\"#$B\u0011\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0010\u0010\u000eJ\u000f\u0010\u0011\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u000eJ'\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0019\u0010\u000eR\u0016\u0010\u001b\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001a\u0010 \u001a\b\u0018\u00010\u001dR\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006%"}, d2 = {"Lcom/facebook/react/modules/dialog/DialogModule;", "Lcom/facebook/fbreact/specs/NativeDialogManagerAndroidSpec;", "Lcom/facebook/react/bridge/LifecycleEventListener;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "", "", "", "getTypedExportedConstants", "()Ljava/util/Map;", "", "initialize", "()V", "onHostPause", "onHostDestroy", "onHostResume", "Lcom/facebook/react/bridge/ReadableMap;", "options", "Lcom/facebook/react/bridge/Callback;", "errorCallback", "actionCallback", "showAlert", "(Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Callback;Lcom/facebook/react/bridge/Callback;)V", "invalidate", "", "isInForeground", "Z", "Lcom/facebook/react/modules/dialog/DialogModule$c;", "getFragmentManagerHelper", "()Lcom/facebook/react/modules/dialog/DialogModule$c;", "fragmentManagerHelper", "Companion", "c", "a", "b", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DialogModule extends NativeDialogManagerAndroidSpec implements LifecycleEventListener {

    @NotNull
    public static final String ACTION_BUTTON_CLICKED = "buttonClicked";

    @NotNull
    public static final String ACTION_DISMISSED = "dismissed";

    @NotNull
    public static final String FRAGMENT_TAG = "com.facebook.catalyst.react.dialog.DialogModule";

    @NotNull
    private static final String KEY_BUTTON_NEGATIVE = "buttonNegative";

    @NotNull
    private static final String KEY_BUTTON_NEUTRAL = "buttonNeutral";

    @NotNull
    private static final String KEY_BUTTON_POSITIVE = "buttonPositive";

    @NotNull
    private static final String KEY_CANCELABLE = "cancelable";

    @NotNull
    private static final String KEY_ITEMS = "items";

    @NotNull
    private static final String KEY_MESSAGE = "message";

    @NotNull
    private static final String KEY_TITLE = "title";

    @NotNull
    public static final String NAME = "DialogManagerAndroid";
    private boolean isInForeground;

    @NotNull
    private static final Map<String, Object> CONSTANTS = N.l(v.a("buttonClicked", "buttonClicked"), v.a("dismissed", "dismissed"), v.a("buttonPositive", -1), v.a("buttonNegative", -2), v.a("buttonNeutral", -3));

    public final class a implements DialogInterface.OnClickListener, DialogInterface.OnDismissListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Callback f29925a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f29926b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ DialogModule f29927c;

        public a(DialogModule dialogModule, Callback callback) {
            Intrinsics.checkNotNullParameter(callback, "callback");
            this.f29927c = dialogModule;
            this.f29925a = callback;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialog, int i10) {
            Intrinsics.checkNotNullParameter(dialog, "dialog");
            if (this.f29926b || !this.f29927c.getReactApplicationContext().hasActiveReactInstance()) {
                return;
            }
            this.f29925a.invoke("buttonClicked", Integer.valueOf(i10));
            this.f29926b = true;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            if (this.f29926b || !this.f29927c.getReactApplicationContext().hasActiveReactInstance()) {
                return;
            }
            this.f29925a.invoke("dismissed");
            this.f29926b = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final q f29928a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private com.facebook.react.modules.dialog.a f29929b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ DialogModule f29930c;

        public c(DialogModule dialogModule, q fragmentManager) {
            Intrinsics.checkNotNullParameter(fragmentManager, "fragmentManager");
            this.f29930c = dialogModule;
            this.f29928a = fragmentManager;
        }

        public final void a() {
            com.facebook.react.modules.dialog.a aVar;
            if (this.f29930c.isInForeground && (aVar = (com.facebook.react.modules.dialog.a) this.f29928a.h0("com.facebook.catalyst.react.dialog.DialogModule")) != null && aVar.u0()) {
                aVar.Y1();
            }
        }

        public final void b(Bundle arguments, Callback callback) {
            Intrinsics.checkNotNullParameter(arguments, "arguments");
            UiThreadUtil.assertOnUiThread();
            a();
            com.facebook.react.modules.dialog.a aVar = new com.facebook.react.modules.dialog.a(callback != null ? new a(this.f29930c, callback) : null, arguments);
            if (!this.f29930c.isInForeground || this.f29928a.O0()) {
                this.f29929b = aVar;
                return;
            }
            if (arguments.containsKey("cancelable")) {
                aVar.i2(arguments.getBoolean("cancelable"));
            }
            aVar.l2(this.f29928a, "com.facebook.catalyst.react.dialog.DialogModule");
        }

        public final void c() {
            UiThreadUtil.assertOnUiThread();
            SoftAssertions.assertCondition(this.f29930c.isInForeground, "showPendingAlert() called in background");
            com.facebook.react.modules.dialog.a aVar = this.f29929b;
            if (aVar == null) {
                return;
            }
            a();
            aVar.l2(this.f29928a, "com.facebook.catalyst.react.dialog.DialogModule");
            this.f29929b = null;
        }
    }

    public DialogModule(@Nullable ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    private final c getFragmentManagerHelper() {
        Activity currentActivity = getReactApplicationContext().getCurrentActivity();
        if (!(currentActivity instanceof j)) {
            return null;
        }
        q qVarH0 = ((j) currentActivity).h0();
        Intrinsics.checkNotNullExpressionValue(qVarH0, "getSupportFragmentManager(...)");
        return new c(this, qVarH0);
    }

    @Override // com.facebook.fbreact.specs.NativeDialogManagerAndroidSpec
    @NotNull
    public Map<String, Object> getTypedExportedConstants() {
        return CONSTANTS;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() {
        getReactApplicationContext().addLifecycleEventListener(this);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void invalidate() {
        getReactApplicationContext().removeLifecycleEventListener(this);
        super.invalidate();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
        this.isInForeground = false;
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        this.isInForeground = true;
        c fragmentManagerHelper = getFragmentManagerHelper();
        if (fragmentManagerHelper != null) {
            fragmentManagerHelper.c();
        } else {
            W4.a.E(DialogModule.class, "onHostResume called but no FragmentManager found");
        }
    }

    @Override // com.facebook.fbreact.specs.NativeDialogManagerAndroidSpec
    public void showAlert(@NotNull ReadableMap options, @NotNull Callback errorCallback, @NotNull Callback actionCallback) {
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(errorCallback, "errorCallback");
        Intrinsics.checkNotNullParameter(actionCallback, "actionCallback");
        c fragmentManagerHelper = getFragmentManagerHelper();
        if (fragmentManagerHelper == null) {
            errorCallback.invoke("Tried to show an alert while not attached to an Activity");
            return;
        }
        Bundle bundle = new Bundle();
        if (options.hasKey("title")) {
            bundle.putString("title", options.getString("title"));
        }
        if (options.hasKey("message")) {
            bundle.putString("message", options.getString("message"));
        }
        if (options.hasKey("buttonPositive")) {
            bundle.putString("button_positive", options.getString("buttonPositive"));
        }
        if (options.hasKey("buttonNegative")) {
            bundle.putString("button_negative", options.getString("buttonNegative"));
        }
        if (options.hasKey("buttonNeutral")) {
            bundle.putString("button_neutral", options.getString("buttonNeutral"));
        }
        if (options.hasKey("items")) {
            ReadableArray array = options.getArray("items");
            if (array == null) {
                throw new IllegalStateException("Required value was null.");
            }
            CharSequence[] charSequenceArr = new CharSequence[array.size()];
            int size = array.size();
            for (int i10 = 0; i10 < size; i10++) {
                charSequenceArr[i10] = array.getString(i10);
            }
            bundle.putCharSequenceArray("items", charSequenceArr);
        }
        if (options.hasKey("cancelable")) {
            bundle.putBoolean("cancelable", options.getBoolean("cancelable"));
        }
        UiThreadUtil.runOnUiThread(new b(fragmentManagerHelper, bundle, actionCallback));
    }
}
