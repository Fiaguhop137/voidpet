package com.google.android.gms.games.internal.v2.appshortcuts;

import android.content.pm.ShortcutManager;
import com.google.android.gms.tasks.OnSuccessListener;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class b implements OnSuccessListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ ShortcutManager f32109a;

    /* synthetic */ b(ShortcutManager shortcutManager) {
        this.f32109a = shortcutManager;
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final /* synthetic */ void onSuccess(Object obj) {
        g gVar = (g) obj;
        List listZza = gVar.zza();
        ShortcutManager shortcutManager = this.f32109a;
        if (listZza != null && !listZza.isEmpty()) {
            shortcutManager.removeDynamicShortcuts(listZza);
        }
        List listA4 = gVar.a4();
        if (listA4 != null && !listA4.isEmpty()) {
            shortcutManager.addDynamicShortcuts(listA4);
        }
        List listB4 = gVar.b4();
        if (listB4 != null && !listB4.isEmpty()) {
            shortcutManager.disableShortcuts(listB4);
        }
        List listC4 = gVar.c4();
        if (listC4 == null || listC4.isEmpty()) {
            return;
        }
        shortcutManager.enableShortcuts(listC4);
    }
}
