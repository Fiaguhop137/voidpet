package p117g8;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

/* JADX INFO: renamed from: g8.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3434f implements Continuation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ C3434f f42204a = new C3434f();

    private /* synthetic */ C3434f() {
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        Intent intent = (Intent) ((Bundle) task.getResult()).getParcelable("notification_data");
        if (intent != null) {
            return new C3429a(intent);
        }
        return null;
    }
}
