package Wa;

import com.facebook.react.bridge.Promise;
import com.google.android.gms.tasks.OnFailureListener;
import com.voidpet.dungeon.playgames.PlayGamesAchievementsModule;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class k implements OnFailureListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Promise f14982a;

    public /* synthetic */ k(Promise promise) {
        this.f14982a = promise;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        PlayGamesAchievementsModule.increment$lambda$7$lambda$6(this.f14982a, exc);
    }
}
