package com.applovin.impl;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.text.SpannedString;
import android.text.TextUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.Axon;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class p0 extends n1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public p f28284e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final StringBuilder f28285f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f28286g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f28287h;

    public p0(Context context) {
        super(context);
        this.f28285f = new StringBuilder("");
        this.f28286g = new ArrayList();
        this.f28287h = new ArrayList();
    }

    @Override // com.applovin.impl.n1
    public final int a() {
        return 2;
    }

    @Override // com.applovin.impl.n1
    public final List a(int i10) {
        return i10 == 0 ? this.f28286g : this.f28287h;
    }

    public final void a(p pVar) {
        PackageInfo packageInfo;
        this.f28284e = pVar;
        ArrayList arrayList = this.f28286g;
        ArrayList arrayList2 = new ArrayList(4);
        Context context = this.f28225a;
        try {
            packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (Throwable unused) {
            packageInfo = null;
        }
        String str = packageInfo != null ? packageInfo.versionName : null;
        k1 k1VarA = new k1(5).a("Package Name");
        String packageName = this.f28225a.getPackageName();
        k1VarA.f28091d = !TextUtils.isEmpty(packageName) ? new SpannedString(packageName) : null;
        arrayList2.add(new l1(k1VarA));
        k1 k1VarA2 = new k1(5).a("App Version");
        if (!StringUtils.isValidString(str)) {
            str = "None";
        }
        k1VarA2.f28091d = !TextUtils.isEmpty(str) ? new SpannedString(str) : null;
        arrayList2.add(new l1(k1VarA2));
        k1 k1VarA3 = new k1(5).a("OS");
        String strA = i.a();
        k1VarA3.f28091d = !TextUtils.isEmpty(strA) ? new SpannedString(strA) : null;
        arrayList2.add(new l1(k1VarA3));
        k1 k1VarA4 = new k1(5).a("Axon SDK Version");
        String str2 = Axon.VERSION;
        k1VarA4.f28091d = TextUtils.isEmpty(str2) ? null : new SpannedString(str2);
        arrayList2.add(new l1(k1VarA4));
        arrayList.addAll(arrayList2);
        ArrayList arrayList3 = this.f28287h;
        ArrayList arrayList4 = new ArrayList(1);
        k1 k1VarA5 = new k1(5).a("View Events").a(this.f28225a);
        k1VarA5.f28089b = true;
        arrayList4.add(new l1(k1VarA5));
        arrayList3.addAll(arrayList4);
        i3.a(false, new p184k4.h0(this));
    }

    @Override // com.applovin.impl.n1
    public final int b(int i10) {
        if (i10 == 0) {
            return this.f28286g.size();
        }
        if (this.f28284e.getEventService().f28393e) {
            return this.f28287h.size();
        }
        return 0;
    }

    @Override // com.applovin.impl.n1
    public final h2 c(int i10) {
        return i10 == 0 ? new h2("APP INFO") : new h2("EVENTS");
    }
}
