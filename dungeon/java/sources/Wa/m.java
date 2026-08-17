package Wa;

import com.facebook.react.P;
import com.facebook.react.bridge.ReactApplicationContext;
import com.voidpet.dungeon.playgames.PlayGamesAchievementsModule;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class m implements P {
    @Override // com.facebook.react.P
    public List createNativeModules(ReactApplicationContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        return CollectionsKt.e(new PlayGamesAchievementsModule(reactContext));
    }

    @Override // com.facebook.react.P
    public List createViewManagers(ReactApplicationContext reactContext) {
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        return CollectionsKt.l();
    }
}
