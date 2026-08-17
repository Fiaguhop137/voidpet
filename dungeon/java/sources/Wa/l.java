package Wa;

import com.facebook.react.bridge.Promise;
import com.voidpet.dungeon.playgames.PlayGamesAchievementsModule;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class l implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Promise f14983a;

    public /* synthetic */ l(Promise promise) {
        this.f14983a = promise;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return PlayGamesAchievementsModule.reveal$lambda$11$lambda$8(this.f14983a, (Void) obj);
    }
}
