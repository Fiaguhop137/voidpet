package p405w9;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import p423x9.i;
import p423x9.t;
import p423x9.w;

/* JADX INFO: loaded from: classes2.dex */
public final class m {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final i f56722c = new i("ReviewService");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    t f56723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f56724b;

    public m(Context context) {
        this.f56724b = context.getPackageName();
        if (w.a(context)) {
            this.f56723a = new t(context, f56722c, "com.google.android.finsky.inappreviewservice.InAppReviewService", new Intent("com.google.android.finsky.BIND_IN_APP_REVIEW_SERVICE").setPackage("com.android.vending"), i.f56715a, null, null);
        }
    }

    public final Task a() {
        i iVar = f56722c;
        iVar.d("requestInAppReview (%s)", this.f56724b);
        if (this.f56723a == null) {
            iVar.b("Play Store app is either not installed or not the official version", new Object[0]);
            return Tasks.forException(new a(-1));
        }
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f56723a.p(new j(this, taskCompletionSource, taskCompletionSource), taskCompletionSource);
        return taskCompletionSource.getTask();
    }
}
