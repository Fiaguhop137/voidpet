package com.voidpet.dungeon.playgames;

import Wa.a;
import Wa.b;
import Wa.c;
import Wa.d;
import Wa.e;
import Wa.f;
import Wa.g;
import Wa.i;
import Wa.j;
import Wa.k;
import Wa.l;
import android.app.Activity;
import android.content.Intent;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import p350t8.h;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J%\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\t0\rH\u0082\bJ\u0018\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bH\u0007J \u0010\u0011\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0018\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0010\u0010\u0015\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/voidpet/dungeon/playgames/PlayGamesAchievementsModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "getName", "", "withActivity", "", "promise", "Lcom/facebook/react/bridge/Promise;", "action", "Lkotlin/Function1;", "Landroid/app/Activity;", "unlock", "achievementId", "increment", "numSteps", "", "reveal", "showAchievements", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PlayGamesAchievementsModule extends ReactContextBaseJavaModule {

    @NotNull
    private final ReactApplicationContext reactContext;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayGamesAchievementsModule(@NotNull ReactApplicationContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.reactContext = reactContext;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit increment$lambda$7$lambda$4(Promise promise, Boolean bool) {
        promise.resolve(bool);
        return Unit.f48228a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void increment$lambda$7$lambda$6(Promise promise, Exception err) {
        Intrinsics.checkNotNullParameter(err, "err");
        promise.reject("PGS_INCREMENT_FAILED", err);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void reveal$lambda$11$lambda$10(Promise promise, Exception err) {
        Intrinsics.checkNotNullParameter(err, "err");
        promise.reject("PGS_REVEAL_FAILED", err);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit reveal$lambda$11$lambda$8(Promise promise, Void r10) {
        promise.resolve(r10);
        return Unit.f48228a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showAchievements$lambda$15$lambda$12(Activity activity, Promise promise, Intent intent) {
        activity.startActivity(intent);
        promise.resolve(Boolean.TRUE);
        return Unit.f48228a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showAchievements$lambda$15$lambda$14(Promise promise, Exception err) {
        Intrinsics.checkNotNullParameter(err, "err");
        promise.reject("PGS_SHOW_UI_FAILED", err);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit unlock$lambda$3$lambda$0(Promise promise, Void r10) {
        promise.resolve(r10);
        return Unit.f48228a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void unlock$lambda$3$lambda$2(Promise promise, Exception err) {
        Intrinsics.checkNotNullParameter(err, "err");
        promise.reject("PGS_UNLOCK_FAILED", err);
    }

    private final void withActivity(Promise promise, Function1<? super Activity, Unit> action) {
        Activity currentActivity = this.reactContext.getCurrentActivity();
        if (currentActivity == null) {
            promise.reject("PGS_NO_ACTIVITY", "Current activity is unavailable.");
        } else {
            action.invoke(currentActivity);
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return "PlayGamesAchievements";
    }

    @ReactMethod
    public final void increment(@NotNull String achievementId, int numSteps, @NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(achievementId, "achievementId");
        Intrinsics.checkNotNullParameter(promise, "promise");
        if (StringsKt.j0(achievementId) || numSteps <= 0) {
            promise.resolve(Boolean.FALSE);
            return;
        }
        Activity currentActivity = this.reactContext.getCurrentActivity();
        if (currentActivity == null) {
            promise.reject("PGS_NO_ACTIVITY", "Current activity is unavailable.");
        } else {
            h.a(currentActivity).a(achievementId, numSteps).addOnSuccessListener(new j(new i(promise))).addOnFailureListener(new k(promise));
        }
    }

    @ReactMethod
    public final void reveal(@NotNull String achievementId, @NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(achievementId, "achievementId");
        Intrinsics.checkNotNullParameter(promise, "promise");
        if (StringsKt.j0(achievementId)) {
            promise.resolve(Boolean.FALSE);
            return;
        }
        Activity currentActivity = this.reactContext.getCurrentActivity();
        if (currentActivity == null) {
            promise.reject("PGS_NO_ACTIVITY", "Current activity is unavailable.");
        } else {
            h.a(currentActivity).d(achievementId).addOnSuccessListener(new b(new l(promise))).addOnFailureListener(new c(promise));
        }
    }

    @ReactMethod
    public final void showAchievements(@NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        Activity currentActivity = this.reactContext.getCurrentActivity();
        if (currentActivity == null) {
            promise.reject("PGS_NO_ACTIVITY", "Current activity is unavailable.");
        } else {
            h.a(currentActivity).b().addOnSuccessListener(new d(new a(currentActivity, promise))).addOnFailureListener(new e(promise));
        }
    }

    @ReactMethod
    public final void unlock(@NotNull String achievementId, @NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(achievementId, "achievementId");
        Intrinsics.checkNotNullParameter(promise, "promise");
        if (StringsKt.j0(achievementId)) {
            promise.resolve(Boolean.FALSE);
            return;
        }
        Activity currentActivity = this.reactContext.getCurrentActivity();
        if (currentActivity == null) {
            promise.reject("PGS_NO_ACTIVITY", "Current activity is unavailable.");
        } else {
            h.a(currentActivity).c(achievementId).addOnSuccessListener(new g(new f(promise))).addOnFailureListener(new Wa.h(promise));
        }
    }
}
