package Wa;

import android.app.Activity;
import android.content.Intent;
import com.facebook.react.bridge.Promise;
import com.voidpet.dungeon.playgames.PlayGamesAchievementsModule;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Activity f14971a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Promise f14972b;

    public /* synthetic */ a(Activity activity, Promise promise) {
        this.f14971a = activity;
        this.f14972b = promise;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return PlayGamesAchievementsModule.showAchievements$lambda$15$lambda$12(this.f14971a, this.f14972b, (Intent) obj);
    }
}
