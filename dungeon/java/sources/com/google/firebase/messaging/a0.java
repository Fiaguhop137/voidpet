package com.google.firebase.messaging;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SharedPreferences f37561a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f37562b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f37563c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Executor f37565e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final ArrayDeque f37564d = new ArrayDeque();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f37566f = false;

    private a0(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        this.f37561a = sharedPreferences;
        this.f37562b = str;
        this.f37563c = str2;
        this.f37565e = executor;
    }

    private boolean b(boolean z10) {
        if (z10 && !this.f37566f) {
            i();
        }
        return z10;
    }

    static a0 c(SharedPreferences sharedPreferences, String str, String str2, Executor executor) {
        a0 a0Var = new a0(sharedPreferences, str, str2, executor);
        a0Var.d();
        return a0Var;
    }

    private void d() {
        synchronized (this.f37564d) {
            try {
                this.f37564d.clear();
                String string = this.f37561a.getString(this.f37562b, "");
                if (!TextUtils.isEmpty(string) && string.contains(this.f37563c)) {
                    String[] strArrSplit = string.split(this.f37563c, -1);
                    if (strArrSplit.length == 0) {
                        Log.e("FirebaseMessaging", "Corrupted queue. Please check the queue contents and item separator provided");
                    }
                    for (String str : strArrSplit) {
                        if (!TextUtils.isEmpty(str)) {
                            this.f37564d.add(str);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        synchronized (this.f37564d) {
            this.f37561a.edit().putString(this.f37562b, g()).commit();
        }
    }

    private void i() {
        this.f37565e.execute(new Z(this));
    }

    public String e() {
        String str;
        synchronized (this.f37564d) {
            str = (String) this.f37564d.peek();
        }
        return str;
    }

    public boolean f(Object obj) {
        boolean zB;
        synchronized (this.f37564d) {
            zB = b(this.f37564d.remove(obj));
        }
        return zB;
    }

    public String g() {
        StringBuilder sb2 = new StringBuilder();
        Iterator it = this.f37564d.iterator();
        while (it.hasNext()) {
            sb2.append((String) it.next());
            sb2.append(this.f37563c);
        }
        return sb2.toString();
    }
}
