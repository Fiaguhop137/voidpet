package G8;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.google.android.gms.appset.AppSetIdClient;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class l implements AppSetIdClient {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static AppSetIdClient f3955e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f3956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f3957b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ScheduledExecutorService f3958c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ExecutorService f3959d;

    l(Context context) {
        this.f3957b = false;
        ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
        this.f3958c = scheduledExecutorServiceNewSingleThreadScheduledExecutor;
        this.f3959d = Executors.newSingleThreadExecutor();
        this.f3956a = context;
        if (this.f3957b) {
            return;
        }
        scheduledExecutorServiceNewSingleThreadScheduledExecutor.scheduleAtFixedRate(new j(this, null), 0L, 86400L, TimeUnit.SECONDS);
        this.f3957b = true;
    }

    static synchronized AppSetIdClient c(Context context) {
        try {
            p170j8.r.m(context, "Context must not be null");
            if (f3955e == null) {
                f3955e = new l(context.getApplicationContext());
            }
        } catch (Throwable th) {
            throw th;
        }
        return f3955e;
    }

    protected static final void e(Context context) {
        if (!f(context).edit().remove("app_set_id").commit()) {
            String strValueOf = String.valueOf(context.getPackageName());
            Log.e("AppSet", strValueOf.length() != 0 ? "Failed to clear app set ID generated for App ".concat(strValueOf) : new String("Failed to clear app set ID generated for App "));
        }
        if (f(context).edit().remove("app_set_id_last_used_time").commit()) {
            return;
        }
        String strValueOf2 = String.valueOf(context.getPackageName());
        Log.e("AppSet", strValueOf2.length() != 0 ? "Failed to clear app set ID last used time for App ".concat(strValueOf2) : new String("Failed to clear app set ID last used time for App "));
    }

    private static final SharedPreferences f(Context context) {
        return context.getSharedPreferences("app_set_id_storage", 0);
    }

    private static final void g(Context context) throws k {
        if (f(context).edit().putLong("app_set_id_last_used_time", com.google.android.gms.common.util.h.d().a()).commit()) {
            return;
        }
        String strValueOf = String.valueOf(context.getPackageName());
        Log.e("AppSet", strValueOf.length() != 0 ? "Failed to store app set ID last used time for App ".concat(strValueOf) : new String("Failed to store app set ID last used time for App "));
        throw new k("Failed to store the app set ID last used time.");
    }

    protected final long a() {
        long j10 = f(this.f3956a).getLong("app_set_id_last_used_time", -1L);
        if (j10 != -1) {
            return j10 + 33696000000L;
        }
        return -1L;
    }

    final /* synthetic */ void d(TaskCompletionSource taskCompletionSource) {
        String string = f(this.f3956a).getString("app_set_id", null);
        long jA = a();
        if (string == null || com.google.android.gms.common.util.h.d().a() > jA) {
            string = UUID.randomUUID().toString();
            try {
                Context context = this.f3956a;
                if (!f(context).edit().putString("app_set_id", string).commit()) {
                    String strValueOf = String.valueOf(context.getPackageName());
                    Log.e("AppSet", strValueOf.length() != 0 ? "Failed to store app set ID generated for App ".concat(strValueOf) : new String("Failed to store app set ID generated for App "));
                    throw new k("Failed to store the app set ID.");
                }
                g(context);
                Context context2 = this.f3956a;
                if (!f(context2).edit().putLong("app_set_id_creation_time", com.google.android.gms.common.util.h.d().a()).commit()) {
                    String strValueOf2 = String.valueOf(context2.getPackageName());
                    Log.e("AppSet", strValueOf2.length() != 0 ? "Failed to store app set ID creation time for App ".concat(strValueOf2) : new String("Failed to store app set ID creation time for App "));
                    throw new k("Failed to store the app set ID creation time.");
                }
            } catch (k e10) {
                taskCompletionSource.setException(e10);
                return;
            }
        } else {
            try {
                g(this.f3956a);
            } catch (k e11) {
                taskCompletionSource.setException(e11);
                return;
            }
        }
        taskCompletionSource.setResult(new AppSetIdInfo(string, 1));
    }

    @Override // com.google.android.gms.appset.AppSetIdClient
    public final Task getAppSetIdInfo() {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.f3959d.execute(new h(this, taskCompletionSource));
        return taskCompletionSource.getTask();
    }
}
