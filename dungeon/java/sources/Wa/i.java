package Wa;

import com.facebook.react.bridge.Promise;
import com.voidpet.dungeon.playgames.PlayGamesAchievementsModule;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class i implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Promise f14980a;

    public /* synthetic */ i(Promise promise) {
        this.f14980a = promise;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return PlayGamesAchievementsModule.increment$lambda$7$lambda$4(this.f14980a, (Boolean) obj);
    }
}
