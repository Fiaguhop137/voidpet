package p117g8;

import J8.a;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p323s.f0;

/* JADX INFO: renamed from: g8.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C3431c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f42192h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static PendingIntent f42193i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Executor f42194j = G.f42186a;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Pattern f42195k = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f42197b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final E f42198c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ScheduledExecutorService f42199d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Messenger f42201f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private l f42202g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f0 f42196a = new f0();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Messenger f42200e = new Messenger(new i(this, Looper.getMainLooper()));

    public C3431c(Context context) {
        this.f42197b = context;
        this.f42198c = new E(context);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f42199d = scheduledThreadPoolExecutor;
    }

    static /* synthetic */ Task e(Bundle bundle) {
        return m(bundle) ? Tasks.forResult(null) : Tasks.forResult(bundle);
    }

    static /* bridge */ /* synthetic */ void g(C3431c c3431c, Message message) {
        if (message != null) {
            Object obj = message.obj;
            if (obj instanceof Intent) {
                Intent intent = (Intent) obj;
                intent.setExtrasClassLoader(new k());
                if (intent.hasExtra("google.messenger")) {
                    Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                    if (parcelableExtra instanceof l) {
                        c3431c.f42202g = (l) parcelableExtra;
                    }
                    if (parcelableExtra instanceof Messenger) {
                        c3431c.f42201f = (Messenger) parcelableExtra;
                    }
                }
                Intent intent2 = (Intent) message.obj;
                String action = intent2.getAction();
                if (!Objects.equals(action, "com.google.android.c2dm.intent.REGISTRATION")) {
                    if (Log.isLoggable("Rpc", 3)) {
                        Log.d("Rpc", "Unexpected response action: ".concat(String.valueOf(action)));
                        return;
                    }
                    return;
                }
                String stringExtra = intent2.getStringExtra("registration_id");
                if (stringExtra == null) {
                    stringExtra = intent2.getStringExtra("unregistered");
                }
                if (stringExtra != null) {
                    Matcher matcher = f42195k.matcher(stringExtra);
                    if (!matcher.matches()) {
                        if (Log.isLoggable("Rpc", 3)) {
                            Log.d("Rpc", "Unexpected response string: ".concat(stringExtra));
                            return;
                        }
                        return;
                    }
                    String strGroup = matcher.group(1);
                    String strGroup2 = matcher.group(2);
                    if (strGroup != null) {
                        Bundle extras = intent2.getExtras();
                        extras.putString("registration_id", strGroup2);
                        c3431c.l(strGroup, extras);
                        return;
                    }
                    return;
                }
                String stringExtra2 = intent2.getStringExtra("error");
                if (stringExtra2 == null) {
                    Log.w("Rpc", "Unexpected response, no error or registration id ".concat(String.valueOf(intent2.getExtras())));
                    return;
                }
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Received InstanceID error ".concat(stringExtra2));
                }
                if (!stringExtra2.startsWith("|")) {
                    synchronized (c3431c.f42196a) {
                        for (int i10 = 0; i10 < c3431c.f42196a.size(); i10++) {
                            try {
                                c3431c.l((String) c3431c.f42196a.f(i10), intent2.getExtras());
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    return;
                }
                String[] strArrSplit = stringExtra2.split("\\|");
                if (strArrSplit.length <= 2 || !Objects.equals(strArrSplit[1], "ID")) {
                    Log.w("Rpc", "Unexpected structured response ".concat(stringExtra2));
                    return;
                }
                String str = strArrSplit[2];
                String strSubstring = strArrSplit[3];
                if (strSubstring.startsWith(":")) {
                    strSubstring = strSubstring.substring(1);
                }
                c3431c.l(str, intent2.putExtra("error", strSubstring).getExtras());
                return;
            }
        }
        Log.w("Rpc", "Dropping invalid message");
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:29:0x00af  */
    private final Task i(Bundle bundle) {
        String strJ = j();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        synchronized (this.f42196a) {
            this.f42196a.put(strJ, taskCompletionSource);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        if (this.f42198c.b() == 2) {
            intent.setAction("com.google.iid.TOKEN_REQUEST");
        } else {
            intent.setAction("com.google.android.c2dm.intent.REGISTER");
        }
        intent.putExtras(bundle);
        k(this.f42197b, intent);
        intent.putExtra("kid", "|ID|" + strJ + "|");
        if (Log.isLoggable("Rpc", 3)) {
            Log.d("Rpc", "Sending ".concat(String.valueOf(intent.getExtras())));
        }
        intent.putExtra("google.messenger", this.f42200e);
        if (this.f42201f != null || this.f42202g != null) {
            Message messageObtain = Message.obtain();
            messageObtain.obj = intent;
            try {
                Messenger messenger = this.f42201f;
                if (messenger != null) {
                    messenger.send(messageObtain);
                } else {
                    this.f42202g.j(messageObtain);
                }
            } catch (RemoteException unused) {
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Messenger failed, fallback to startService");
                }
                if (this.f42198c.b() == 2) {
                    this.f42197b.sendBroadcast(intent);
                } else {
                    this.f42197b.startService(intent);
                }
            }
        } else if (this.f42198c.b() == 2) {
            this.f42197b.sendBroadcast(intent);
        } else {
            this.f42197b.startService(intent);
        }
        taskCompletionSource.getTask().addOnCompleteListener(f42194j, new C3436h(this, strJ, this.f42199d.schedule(new RunnableC3435g(taskCompletionSource), 30L, TimeUnit.SECONDS)));
        return taskCompletionSource.getTask();
    }

    private static synchronized String j() {
        int i10;
        i10 = f42192h;
        f42192h = i10 + 1;
        return Integer.toString(i10);
    }

    private static synchronized void k(Context context, Intent intent) {
        try {
            if (f42193i == null) {
                Intent intent2 = new Intent();
                intent2.setPackage("com.google.example.invalidpackage");
                f42193i = PendingIntent.getBroadcast(context, 0, intent2, a.f5751a);
            }
            intent.putExtra("app", f42193i);
        } catch (Throwable th) {
            throw th;
        }
    }

    private final void l(String str, Bundle bundle) {
        synchronized (this.f42196a) {
            try {
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f42196a.remove(str);
                if (taskCompletionSource != null) {
                    taskCompletionSource.setResult(bundle);
                    return;
                }
                Log.w("Rpc", "Missing callback for " + str);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static boolean m(Bundle bundle) {
        return bundle != null && bundle.containsKey("google.messenger");
    }

    public Task a() {
        return this.f42198c.a() >= 241100000 ? D.b(this.f42197b).d(5, Bundle.EMPTY).continueWith(f42194j, C3434f.f42204a) : Tasks.forException(new IOException("SERVICE_NOT_AVAILABLE"));
    }

    public Task b(C3429a c3429a) {
        if (this.f42198c.a() < 233700000) {
            return Tasks.forException(new IOException("SERVICE_NOT_AVAILABLE"));
        }
        Bundle bundle = new Bundle();
        bundle.putString("google.message_id", c3429a.b4());
        Integer numC4 = c3429a.c4();
        if (numC4 != null) {
            bundle.putInt("google.product_id", numC4.intValue());
        }
        return D.b(this.f42197b).c(3, bundle);
    }

    public Task c(Bundle bundle) {
        if (this.f42198c.a() < 12000000) {
            return this.f42198c.b() != 0 ? i(bundle).continueWithTask(f42194j, new H(this, bundle)) : Tasks.forException(new IOException("MISSING_INSTANCEID_SERVICE"));
        }
        return D.b(this.f42197b).d(1, bundle).continueWith(f42194j, C3433e.f42203a);
    }

    public Task d(boolean z10) {
        if (this.f42198c.a() < 241100000) {
            return Tasks.forException(new IOException("SERVICE_NOT_AVAILABLE"));
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean("proxy_retention", z10);
        return D.b(this.f42197b).c(4, bundle);
    }

    final /* synthetic */ Task f(Bundle bundle, Task task) {
        return (task.isSuccessful() && m((Bundle) task.getResult())) ? i(bundle).onSuccessTask(f42194j, F.f42185a) : task;
    }

    final /* synthetic */ void h(String str, ScheduledFuture scheduledFuture, Task task) {
        synchronized (this.f42196a) {
            this.f42196a.remove(str);
        }
        scheduledFuture.cancel(false);
    }
}
