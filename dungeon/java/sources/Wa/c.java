package Wa;

import com.facebook.react.bridge.Promise;
import com.google.android.gms.tasks.OnFailureListener;
import com.voidpet.dungeon.playgames.PlayGamesAchievementsModule;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c implements OnFailureListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Promise f14974a;

    public /* synthetic */ c(Promise promise) {
        this.f14974a = promise;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        PlayGamesAchievementsModule.reveal$lambda$11$lambda$10(this.f14974a, exc);
    }
}
