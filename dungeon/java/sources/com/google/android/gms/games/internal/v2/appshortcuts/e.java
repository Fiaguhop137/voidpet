package com.google.android.gms.games.internal.v2.appshortcuts;

import L8.AbstractC1141b0;
import L8.C1169p0;
import L8.t0;
import L8.z0;
import android.content.Context;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import com.google.android.gms.common.api.internal.AbstractC2326t;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
final class e extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f32113a;

    public e(Context context) {
        super(null);
        this.f32113a = context.getApplicationContext();
    }

    static /* synthetic */ g d(t0 t0Var, t0 t0Var2, Task task) {
        return task.isSuccessful() ? (g) task.getResult() : e(t0Var, t0Var2);
    }

    private static g e(t0 t0Var, t0 t0Var2) {
        return new g(f(t0Var), t0.i(), f(t0Var2), t0.i());
    }

    private static t0 f(t0 t0Var) {
        int i10 = t0.f6506c;
        C1169p0 c1169p0 = new C1169p0();
        int size = t0Var.size();
        for (int i11 = 0; i11 < size; i11++) {
            String strZza = ((i) t0Var.get(i11)).zza();
            if (strZza != null) {
                c1169p0.d(strZza);
            }
        }
        return c1169p0.e();
    }

    private static t0 g(List list) {
        int i10 = t0.f6506c;
        C1169p0 c1169p0 = new C1169p0();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ShortcutInfo shortcutInfoA = A8.i.a(it.next());
            if (!shortcutInfoA.isImmutable() && shortcutInfoA.getId().startsWith("PLAY_GAMES_SERVICES_")) {
                c1169p0.d(new i(shortcutInfoA.getId(), shortcutInfoA.getExtras(), Boolean.valueOf(shortcutInfoA.isPinned()), Boolean.valueOf(shortcutInfoA.isEnabled())));
            }
        }
        return c1169p0.e();
    }

    @Override // com.google.android.gms.games.internal.v2.appshortcuts.f
    public final void a() {
        AbstractC1141b0.a();
        new Thread(new d(this), "initialize-shortcuts").start();
    }

    final /* synthetic */ void c() {
        Task taskForResult;
        Context context = this.f32113a;
        ShortcutManager shortcutManagerA = A8.f.a(context.getSystemService(A8.e.a()));
        if (shortcutManagerA == null) {
            return;
        }
        A8.p pVarA = A8.r.a(context, PlayGamesAppShortcutsActivity.class);
        t0 t0VarG = g(shortcutManagerA.getDynamicShortcuts());
        t0 t0VarG2 = g(shortcutManagerA.getPinnedShortcuts());
        if (pVarA == null || pVarA.zza() <= 0) {
            taskForResult = Tasks.forResult(e(t0VarG, t0VarG2));
        } else {
            q qVar = new q(context);
            taskForResult = qVar.i(AbstractC2326t.a().e(6744).d(p350t8.p.f54559g).c(false).b(new p(qVar, pVarA, t0VarG, t0VarG2)).a()).continueWith(z0.a(), new c(t0VarG, t0VarG2));
        }
        taskForResult.addOnSuccessListener(z0.a(), new b(shortcutManagerA));
    }
}
