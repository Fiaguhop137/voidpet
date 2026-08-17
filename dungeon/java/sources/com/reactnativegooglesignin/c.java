package com.reactnativegooglesignin;

import android.util.Log;
import com.facebook.react.bridge.Promise;

/* JADX INFO: loaded from: classes2.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Promise f38648a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f38649b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f38650c;

    public c(String str) {
        this.f38650c = str;
    }

    private void e(Promise promise, String str) {
        promise.reject("ASYNC_OP_IN_PROGRESS", "Warning: previous promise did not settle and was overwritten. You've called \"" + str + "\" while \"" + a() + "\" was already in progress and has not completed yet.");
    }

    private void f() {
        this.f38649b = null;
        this.f38648a = null;
    }

    public String a() {
        return this.f38649b;
    }

    public void b(Exception exc) {
        Promise promise = this.f38648a;
        String str = this.f38649b;
        if (promise == null) {
            Log.e(this.f38650c, "cannot reject promise because it's null");
            return;
        }
        a aVar = new a(exc, str);
        f();
        promise.reject(aVar.a(), aVar.b(), exc);
    }

    public void c(String str) {
        d(this.f38649b, str);
    }

    public void d(String str, String str2) {
        Promise promise = this.f38648a;
        if (promise == null) {
            Log.e(this.f38650c, "cannot reject promise because it's null");
        } else {
            f();
            promise.reject(str, str2);
        }
    }

    public void g(Object obj) {
        Promise promise = this.f38648a;
        if (promise == null) {
            Log.e(this.f38650c, "cannot resolve promise because it's null");
        } else {
            f();
            promise.resolve(obj);
        }
    }

    public void h(Promise promise, String str) {
        Promise promise2 = this.f38648a;
        if (promise2 != null) {
            e(promise2, str);
        }
        this.f38648a = promise;
        this.f38649b = str;
    }
}
