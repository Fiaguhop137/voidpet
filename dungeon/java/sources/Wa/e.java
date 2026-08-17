package Wa;

import com.facebook.react.bridge.Promise;
import com.google.android.gms.tasks.OnFailureListener;
import com.voidpet.dungeon.playgames.PlayGamesAchievementsModule;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class e implements OnFailureListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Promise f14976a;

    public /* synthetic */ e(Promise promise) {
        this.f14976a = promise;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        PlayGamesAchievementsModule.showAchievements$lambda$15$lambda$14(this.f14976a, exc);
    }
}
