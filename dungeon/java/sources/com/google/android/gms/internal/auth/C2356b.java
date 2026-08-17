package com.google.android.gms.internal.auth;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.AbstractC2326t;
import com.google.android.gms.common.api.internal.AbstractC2327u;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: renamed from: com.google.android.gms.internal.auth.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2356b extends p135h8.e implements InterfaceC2361c1 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final h8.a.g f32297l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final p135h8.a.AbstractC0496a f32298m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final p135h8.a f32299n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final p224m8.a f32300o;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Context f32301k;

    static {
        h8.a.g gVar = new h8.a.g();
        f32297l = gVar;
        V1 v10 = new V1();
        f32298m = v10;
        f32299n = new p135h8.a("GoogleAuthService.API", v10, gVar);
        f32300o = p009a8.d.a("GoogleAuthServiceClient");
    }

    C2356b(Context context) {
        super(context, f32299n, h8.a.d.f42648B1, h8.e.a.f42660c);
        this.f32301k = context;
    }

    static /* bridge */ /* synthetic */ void w(Status status, Object obj, TaskCompletionSource taskCompletionSource) {
        if (AbstractC2327u.b(status, obj, taskCompletionSource)) {
            return;
        }
        f32300o.e("The task is already complete.", new Object[0]);
    }

    @Override // com.google.android.gms.internal.auth.InterfaceC2361c1
    public final Task b(C2371g c2371g) {
        return k(AbstractC2326t.a().d(p009a8.e.f19533l).b(new U1(this, c2371g)).e(1513).a());
    }

    @Override // com.google.android.gms.internal.auth.InterfaceC2361c1
    public final Task c(Account account, String str, Bundle bundle) {
        p170j8.r.m(account, "Account name cannot be null!");
        p170j8.r.g(str, "Scope cannot be null!");
        return k(AbstractC2326t.a().d(p009a8.e.f19533l).b(new T1(this, account, str, bundle)).e(1512).a());
    }
}
