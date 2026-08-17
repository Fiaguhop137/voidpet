package com.google.android.gms.games.internal.v2.appshortcuts;

import android.content.Intent;
import android.util.Log;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class u implements OnCompleteListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ PlayGamesAppShortcutsActivity f32134a;

    /* synthetic */ u(PlayGamesAppShortcutsActivity playGamesAppShortcutsActivity) {
        this.f32134a = playGamesAppShortcutsActivity;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final /* synthetic */ void onComplete(Task task) {
        PlayGamesAppShortcutsActivity playGamesAppShortcutsActivity = this.f32134a;
        if (task.isSuccessful()) {
            playGamesAppShortcutsActivity.startActivityForResult((Intent) task.getResult(), 1005000000);
        } else {
            Log.e("PGShortcutsActivity", "Failed to access intent.", task.getException());
            playGamesAppShortcutsActivity.finish();
        }
    }
}
