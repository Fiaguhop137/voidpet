package Wa;

import com.facebook.react.bridge.Promise;
import com.voidpet.dungeon.playgames.PlayGamesAchievementsModule;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class f implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Promise f14977a;

    public /* synthetic */ f(Promise promise) {
        this.f14977a = promise;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return PlayGamesAchievementsModule.unlock$lambda$3$lambda$0(this.f14977a, (Void) obj);
    }
}
