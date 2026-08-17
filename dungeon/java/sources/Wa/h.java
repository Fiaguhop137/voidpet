package Wa;

import com.facebook.react.bridge.Promise;
import com.google.android.gms.tasks.OnFailureListener;
import com.voidpet.dungeon.playgames.PlayGamesAchievementsModule;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class h implements OnFailureListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Promise f14979a;

    public /* synthetic */ h(Promise promise) {
        this.f14979a = promise;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        PlayGamesAchievementsModule.unlock$lambda$3$lambda$2(this.f14979a, exc);
    }
}
