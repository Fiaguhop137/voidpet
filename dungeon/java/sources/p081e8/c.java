package p081e8;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;
import p170j8.r;

/* JADX INFO: loaded from: classes2.dex */
public class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Lock f40664c = new ReentrantLock();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static c f40665d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Lock f40666a = new ReentrantLock();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SharedPreferences f40667b;

    c(Context context) {
        this.f40667b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    public static c b(Context context) {
        r.l(context);
        f40664c.lock();
        try {
            if (f40665d == null) {
                f40665d = new c(context.getApplicationContext());
            }
            return f40665d;
        } finally {
            f40664c.unlock();
        }
    }

    private static final String i(String str, String str2) {
        return str + ":" + str2;
    }

    public void a() {
        this.f40666a.lock();
        try {
            this.f40667b.edit().clear().apply();
        } finally {
            this.f40666a.unlock();
        }
    }

    public GoogleSignInAccount c() {
        String strG;
        String strG2 = g("defaultGoogleSignInAccount");
        if (!TextUtils.isEmpty(strG2) && (strG = g(i("googleSignInAccount", strG2))) != null) {
            try {
                return GoogleSignInAccount.l4(strG);
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    public GoogleSignInOptions d() {
        String strG;
        String strG2 = g("defaultGoogleSignInAccount");
        if (!TextUtils.isEmpty(strG2) && (strG = g(i("googleSignInOptions", strG2))) != null) {
            try {
                return GoogleSignInOptions.j4(strG);
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    public String e() {
        return g("refreshToken");
    }

    public void f(GoogleSignInAccount googleSignInAccount, GoogleSignInOptions googleSignInOptions) {
        r.l(googleSignInAccount);
        r.l(googleSignInOptions);
        h("defaultGoogleSignInAccount", googleSignInAccount.m4());
        r.l(googleSignInAccount);
        r.l(googleSignInOptions);
        String strM4 = googleSignInAccount.m4();
        h(i("googleSignInAccount", strM4), googleSignInAccount.n4());
        h(i("googleSignInOptions", strM4), googleSignInOptions.n4());
    }

    protected final String g(String str) {
        this.f40666a.lock();
        try {
            return this.f40667b.getString(str, null);
        } finally {
            this.f40666a.unlock();
        }
    }

    protected final void h(String str, String str2) {
        this.f40666a.lock();
        try {
            this.f40667b.edit().putString(str, str2).apply();
        } finally {
            this.f40666a.unlock();
        }
    }
}
