package p009a8;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class f implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Account f19539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f19540b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Bundle f19541c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Context f19542d;

    public /* synthetic */ f(Account account, String str, Bundle bundle, Context context) {
        this.f19539a = account;
        this.f19540b = str;
        this.f19541c = bundle;
        this.f19542d = context;
    }

    @Override // p009a8.h
    public final Object a(IBinder iBinder) {
        return i.e(this.f19539a, this.f19540b, this.f19541c, this.f19542d, iBinder);
    }
}
