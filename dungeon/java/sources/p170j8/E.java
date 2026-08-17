package p170j8;

import android.app.Activity;
import android.content.Intent;

/* JADX INFO: loaded from: classes2.dex */
final class E extends G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Intent f46872a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Activity f46873b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ int f46874c;

    E(Intent intent, Activity activity, int i10) {
        this.f46872a = intent;
        this.f46873b = activity;
        this.f46874c = i10;
    }

    @Override // p170j8.G
    public final void a() {
        Intent intent = this.f46872a;
        if (intent != null) {
            this.f46873b.startActivityForResult(intent, this.f46874c);
        }
    }
}
